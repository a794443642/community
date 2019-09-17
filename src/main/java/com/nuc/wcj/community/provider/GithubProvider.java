package com.nuc.wcj.community.provider;

import com.alibaba.fastjson.JSON;
import com.nuc.wcj.community.dto.AccessTokenDTO;
import com.nuc.wcj.community.dto.GithubUser;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

import static com.alibaba.fastjson.JSON.toJSONString;

@Component
public class GithubProvider {
    public  String getAccessToken(AccessTokenDTO accessTokenDTO) {
        MediaType mediaType = MediaType.get("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();
            RequestBody body = RequestBody.create(toJSONString(accessTokenDTO),mediaType);
            Request request = new Request.Builder()
                    .url("https://github.com/login/oauth/access_token")
                    .post(body)
                    .build();
            try (Response response = client.newCall(request).execute()) {
                String str=response.body().string();
                String access_token= str.split("&")[0].split("=")[1];
                System.out.println(access_token);
                return access_token;
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
    }
    public GithubUser getUserInfo(String accessToken){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.github.com/user?"+accessToken)
                .build();

        try (Response response = client.newCall(request).execute()) {
            String string = response.body().string();
            GithubUser githubUser = JSON.parseObject(string, GithubUser.class);
            return githubUser;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}
