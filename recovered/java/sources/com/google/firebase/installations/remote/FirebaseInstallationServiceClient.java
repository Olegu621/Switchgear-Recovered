            package com.google.firebase.installations.remote;

            import android.content.Context;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.Signature;
            import android.net.TrafficStats;
            import android.text.TextUtils;
            import android.util.JsonReader;
            import com.google.android.gms.tasks.Tasks;
            import com.google.firebase.installations.FirebaseInstallationsException;
            import io.sentry.C1697u2;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.BufferedReader;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.io.OutputStream;
            import java.net.HttpURLConnection;
            import java.net.MalformedURLException;
            import java.net.URL;
            import java.net.URLConnection;
            import java.nio.charset.Charset;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.util.concurrent.ExecutionException;
            import java.util.regex.Pattern;
            import java.util.zip.GZIPOutputStream;
            import okhttp3.HttpUrl;
            import org.json.JSONException;
            import org.json.JSONObject;
            import p000.AbstractC0886en;
            import p000.b60;
            import p000.ds0;
            import p000.fm0;
            import p000.g93;
            import p000.i13;
            import p000.iz1;
            import p000.kb1;
            import p000.yt0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FirebaseInstallationServiceClient {
                private static final String ACCEPT_HEADER_KEY = "Accept";
                private static final String API_KEY_HEADER = "x-goog-api-key";
                private static final String CACHE_CONTROL_DIRECTIVE = "no-cache";
                private static final String CACHE_CONTROL_HEADER_KEY = "Cache-Control";
                private static final String CONTENT_ENCODING_HEADER_KEY = "Content-Encoding";
                private static final String CONTENT_TYPE_HEADER_KEY = "Content-Type";
                private static final String CREATE_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations";
                private static final String DELETE_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations/%s";
                private static final String FIREBASE_INSTALLATIONS_API_DOMAIN = "firebaseinstallations.googleapis.com";
                private static final String FIREBASE_INSTALLATIONS_API_VERSION = "v1";
                private static final String FIREBASE_INSTALLATIONS_ID_HEARTBEAT_TAG = "fire-installations-id";
                private static final String FIREBASE_INSTALLATION_AUTH_VERSION = "FIS_v2";
                private static final String FIS_TAG = "Firebase-Installations";
                private static final String GENERATE_AUTH_TOKEN_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations/%s/authTokens:generate";
                private static final String GZIP_CONTENT_ENCODING = "gzip";
                private static final String HEART_BEAT_HEADER = "x-firebase-client";
                private static final String JSON_CONTENT_TYPE = "application/json";
                private static final int MAX_RETRIES = 1;
                private static final int NETWORK_TIMEOUT_MILLIS = 10000;
                static final String PARSING_EXPIRATION_TIME_ERROR_MESSAGE = "Invalid Expiration Timestamp.";
                private static final String SDK_VERSION_PREFIX = "a:";
                private static final int TRAFFIC_STATS_CREATE_INSTALLATION_TAG = 32769;
                private static final int TRAFFIC_STATS_DELETE_INSTALLATION_TAG = 32770;
                private static final int TRAFFIC_STATS_FIREBASE_INSTALLATIONS_TAG = 32768;
                private static final int TRAFFIC_STATS_GENERATE_AUTH_TOKEN_TAG = 32771;
                private static final String X_ANDROID_CERT_HEADER_KEY = "X-Android-Cert";
                private static final String X_ANDROID_IID_MIGRATION_KEY = "x-goog-fis-android-iid-migration-auth";
                private static final String X_ANDROID_PACKAGE_HEADER_KEY = "X-Android-Package";
                private final Context context;
                private final iz1 heartBeatProvider;
                private final RequestLimiter requestLimiter = new RequestLimiter();
                private boolean shouldServerErrorRetry;
                private static final Pattern EXPIRATION_TIMESTAMP_PATTERN = Pattern.compile("[0-9]+s");
                private static final Charset UTF_8 = Charset.forName("UTF-8");

                public FirebaseInstallationServiceClient(Context context, iz1 iz1Var) {
/* 4 */             this.context = context;
/* 6 */             this.heartBeatProvider = iz1Var;
                }

                private static String availableFirebaseOptions(String str, String str2, String str3) {
/* 18 */            return fm0.m3785k("Firebase options used while communicating with Firebase server APIs: ", str2, ", ", str3, TextUtils.isEmpty(str) ? HttpUrl.FRAGMENT_ENCODE_SET : AbstractC0886en.m3507k(", ", str));
                }

                private static JSONObject buildCreateFirebaseInstallationRequestBody(String str, String str2) {
                    try {
/* 3 */                 JSONObject jSONObject = new JSONObject();
/* 8 */                 jSONObject.put("fid", str);
/* 13 */                jSONObject.put("appId", str2);
/* 20 */                jSONObject.put("authVersion", FIREBASE_INSTALLATION_AUTH_VERSION);
/* 27 */                jSONObject.put("sdkVersion", "a:18.0.0");
/* 30 */                return jSONObject;
                    } catch (JSONException e) {
/* 32 */                C1697u2.m5439o(e);
/* 35 */                return null;
                    }
                }

                private static JSONObject buildGenerateAuthTokenRequestBody() {
                    try {
/* 3 */                 JSONObject jSONObject = new JSONObject();
/* 10 */                jSONObject.put("sdkVersion", "a:18.0.0");
/* 15 */                JSONObject jSONObject2 = new JSONObject();
/* 20 */                jSONObject2.put("installation", jSONObject);
/* 23 */                return jSONObject2;
                    } catch (JSONException e) {
/* 25 */                C1697u2.m5439o(e);
/* 28 */                return null;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:18:0x003e  */
                private String getFingerprintHashForPackage() {
                    byte[] bArrDigest;
                    MessageDigest messageDigest;
                    try {
/* 6 */                 Context context = this.context;
/* 18 */                PackageInfo packageInfoM9214c = g93.m3898a(context).m9214c(64, context.getPackageName());
/* 22 */                Signature[] signatureArr = packageInfoM9214c.signatures;
/* 25 */                if (signatureArr == null || signatureArr.length != 1) {
/* 63 */                    bArrDigest = null;
                        } else {
/* 33 */                    int i = 0;
                            while (true) {
/* 35 */                        if (i >= 2) {
/* 46 */                            messageDigest = null;
                                    break;
                                }
                                try {
/* 37 */                            messageDigest = MessageDigest.getInstance("SHA1");
/* 41 */                            if (messageDigest != null) {
                                        break;
                                    }
/* 43 */                            i++;
                                } catch (NoSuchAlgorithmException unused) {
                                }
                            }
/* 47 */                    if (messageDigest == null) {
/* 63 */                        bArrDigest = null;
                            } else {
/* 58 */                        bArrDigest = messageDigest.digest(packageInfoM9214c.signatures[0].toByteArray());
                            }
                        }
/* 64 */                if (bArrDigest == null) {
/* 84 */                    AbstractC1245n0.m4876d("ContentValues", "Could not get fingerprint hash for package: " + this.context.getPackageName());
/* 5 */                     return null;
                        }
/* 90 */                int length = bArrDigest.length;
/* 95 */                StringBuilder sb = new StringBuilder(length + length);
/* 98 */                for (int i2 = 0; i2 < length; i2++) {
/* 100 */                   char[] cArr = i13.f9400c;
/* 110 */                   sb.append(cArr[(bArrDigest[i2] & 240) >>> 4]);
/* 119 */                   sb.append(cArr[bArrDigest[i2] & 15]);
                        }
/* 125 */               return sb.toString();
                    } catch (PackageManager.NameNotFoundException e) {
/* 150 */               AbstractC1245n0.m4877e("ContentValues", "No such package: " + this.context.getPackageName(), e);
/* 5 */                 return null;
                    }
                }

                private URL getFullyQualifiedRequestUri(String str) throws FirebaseInstallationsException {
                    try {
/* 17 */                return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
                    } catch (MalformedURLException e) {
/* 33 */                throw new FirebaseInstallationsException(e.getMessage(), FirebaseInstallationsException.Status.UNAVAILABLE);
                    }
                }

                private static byte[] getJsonBytes(JSONObject jSONObject) throws IOException {
/* 7 */             return jSONObject.toString().getBytes("UTF-8");
                }

                private static boolean isSuccessfulResponseCode(int i) {
                    return i >= 200 && i < 300;
                }

                private static void logBadConfigError() {
/* 5 */             AbstractC1245n0.m4876d(FIS_TAG, "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                }

                private static void logFisCommunicationError(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
/* 1 */             String errorResponse = readErrorResponse(httpURLConnection);
/* 9 */             if (TextUtils.isEmpty(errorResponse)) {
/* 23 */                return;
                    }
/* 13 */            AbstractC1245n0.m4889q(FIS_TAG, errorResponse);
/* 20 */            AbstractC1245n0.m4889q(FIS_TAG, availableFirebaseOptions(str, str2, str3));
                }

                private HttpURLConnection openHttpURLConnection(URL url, String str) throws FirebaseInstallationsException {
                    try {
/* 9 */                 HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
/* 13 */                httpURLConnection.setConnectTimeout(NETWORK_TIMEOUT_MILLIS);
/* 17 */                httpURLConnection.setUseCaches(false);
/* 20 */                httpURLConnection.setReadTimeout(NETWORK_TIMEOUT_MILLIS);
/* 27 */                httpURLConnection.addRequestProperty(CONTENT_TYPE_HEADER_KEY, JSON_CONTENT_TYPE);
/* 32 */                httpURLConnection.addRequestProperty(ACCEPT_HEADER_KEY, JSON_CONTENT_TYPE);
/* 39 */                httpURLConnection.addRequestProperty(CONTENT_ENCODING_HEADER_KEY, GZIP_CONTENT_ENCODING);
/* 46 */                httpURLConnection.addRequestProperty(CACHE_CONTROL_HEADER_KEY, CACHE_CONTROL_DIRECTIVE);
/* 57 */                httpURLConnection.addRequestProperty(X_ANDROID_PACKAGE_HEADER_KEY, this.context.getPackageName());
/* 66 */                yt0 yt0Var = (yt0) this.heartBeatProvider.get();
/* 68 */                if (yt0Var != null) {
                            try {
/* 84 */                        httpURLConnection.addRequestProperty(HEART_BEAT_HEADER, (String) Tasks.await(((b60) yt0Var).m1291a()));
                            } catch (InterruptedException e) {
/* 96 */                        Thread.currentThread().interrupt();
/* 99 */                        AbstractC1245n0.m4891s("ContentValues", "Failed to get heartbeats header", e);
                            } catch (ExecutionException e2) {
/* 103 */                       AbstractC1245n0.m4891s("ContentValues", "Failed to get heartbeats header", e2);
                            }
                        }
/* 112 */               httpURLConnection.addRequestProperty(X_ANDROID_CERT_HEADER_KEY, getFingerprintHashForPackage());
/* 117 */               httpURLConnection.addRequestProperty(API_KEY_HEADER, str);
/* 120 */               return httpURLConnection;
                    } catch (IOException unused) {
/* 130 */               throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
                    }
                }

                public static long parseTokenExpirationTimestamp(String str) {
/* 13 */            kb1.m6053f(PARSING_EXPIRATION_TIME_ERROR_MESSAGE, EXPIRATION_TIMESTAMP_PATTERN.matcher(str).matches());
/* 16 */            if (str == null || str.length() == 0) {
/* 41 */                return 0L;
                    }
/* 36 */            return Long.parseLong(str.substring(0, str.length() - 1));
                }

                private InstallationResponse readCreateResponse(HttpURLConnection httpURLConnection) throws IOException, AssertionError {
/* 1 */             InputStream inputStream = httpURLConnection.getInputStream();
/* 14 */            JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, UTF_8));
/* 17 */            TokenResult.Builder builder = TokenResult.builder();
/* 21 */            InstallationResponse.Builder builder2 = InstallationResponse.builder();
/* 25 */            jsonReader.beginObject();
/* 32 */            while (jsonReader.hasNext()) {
/* 34 */                String strNextName = jsonReader.nextName();
/* 44 */                if (strNextName.equals("name")) {
/* 50 */                    builder2.setUri(jsonReader.nextString());
                        } else if (strNextName.equals("fid")) {
/* 66 */                    builder2.setFid(jsonReader.nextString());
                        } else if (strNextName.equals("refreshToken")) {
/* 82 */                    builder2.setRefreshToken(jsonReader.nextString());
                        } else if (strNextName.equals("authToken")) {
/* 94 */                    jsonReader.beginObject();
/* 101 */                   while (jsonReader.hasNext()) {
/* 103 */                       String strNextName2 = jsonReader.nextName();
/* 113 */                       if (strNextName2.equals("token")) {
/* 119 */                           builder.setToken(jsonReader.nextString());
                                } else if (strNextName2.equals("expiresIn")) {
/* 139 */                           builder.setTokenExpirationTimestamp(parseTokenExpirationTimestamp(jsonReader.nextString()));
                                } else {
/* 143 */                           jsonReader.skipValue();
                                }
                            }
/* 151 */                   builder2.setAuthToken(builder.build());
/* 154 */                   jsonReader.endObject();
                        } else {
/* 159 */                   jsonReader.skipValue();
                        }
                    }
/* 164 */           jsonReader.endObject();
/* 167 */           jsonReader.close();
/* 170 */           inputStream.close();
/* 179 */           return builder2.setResponseCode(InstallationResponse.ResponseCode.OK).build();
                }

                private static String readErrorResponse(HttpURLConnection httpURLConnection) {
/* 1 */             InputStream errorStream = httpURLConnection.getErrorStream();
/* 6 */             if (errorStream == null) {
/* 5 */                 return null;
                    }
/* 18 */            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, UTF_8));
                    try {
                        try {
/* 23 */                    StringBuilder sb = new StringBuilder();
                            while (true) {
/* 37 */                        String line = bufferedReader.readLine();
/* 27 */                        if (line == null) {
                                    break;
                                }
/* 29 */                        sb.append(line);
/* 34 */                        sb.append('\n');
/* 5 */                         return null;
                            }
/* 62 */                    String str = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                            try {
/* 66 */                        bufferedReader.close();
                            } catch (IOException unused) {
                            }
/* 69 */                    return str;
                        } catch (IOException unused2) {
                        }
                    } catch (IOException unused3) {
/* 74 */                bufferedReader.close();
/* 5 */                 return null;
                    } catch (Throwable th) {
                        try {
/* 70 */                    bufferedReader.close();
                        } catch (IOException unused4) {
                        }
/* 73 */                throw th;
                    }
                }

                private TokenResult readGenerateAuthTokenResponse(HttpURLConnection httpURLConnection) throws IOException, AssertionError {
/* 1 */             InputStream inputStream = httpURLConnection.getInputStream();
/* 14 */            JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, UTF_8));
/* 17 */            TokenResult.Builder builder = TokenResult.builder();
/* 21 */            jsonReader.beginObject();
/* 28 */            while (jsonReader.hasNext()) {
/* 30 */                String strNextName = jsonReader.nextName();
/* 40 */                if (strNextName.equals("token")) {
/* 46 */                    builder.setToken(jsonReader.nextString());
                        } else if (strNextName.equals("expiresIn")) {
/* 66 */                    builder.setTokenExpirationTimestamp(parseTokenExpirationTimestamp(jsonReader.nextString()));
                        } else {
/* 70 */                    jsonReader.skipValue();
                        }
                    }
/* 74 */            jsonReader.endObject();
/* 77 */            jsonReader.close();
/* 80 */            inputStream.close();
/* 89 */            return builder.setResponseCode(TokenResult.ResponseCode.OK).build();
                }

                private void writeFIDCreateRequestBodyToOutputStream(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
/* 9 */             writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildCreateFirebaseInstallationRequestBody(str, str2)));
                }

                private void writeGenerateAuthTokenRequestBodyToOutputStream(HttpURLConnection httpURLConnection) throws IOException {
/* 9 */             writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildGenerateAuthTokenRequestBody()));
                }

                private static void writeRequestBodyToOutputStream(URLConnection uRLConnection, byte[] bArr) throws IOException {
/* 1 */             OutputStream outputStream = uRLConnection.getOutputStream();
/* 5 */             if (outputStream == null) {
/* 32 */                ds0.m3195l("Cannot send request to FIS servers. No OutputStream available.");
/* 35 */                return;
                    }
/* 9 */             GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                    try {
/* 12 */                gZIPOutputStream.write(bArr);
                    } finally {
                        try {
/* 23 */                    gZIPOutputStream.close();
/* 26 */                    outputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                }

                public InstallationResponse createFirebaseInstallation(String str, String str2, String str3, String str4, String str5) throws FirebaseInstallationsException {
                    InstallationResponse createResponse;
/* 9 */             if (!this.requestLimiter.isRequestAllowed()) {
/* 159 */               throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
                    }
/* 19 */            URL fullyQualifiedRequestUri = getFullyQualifiedRequestUri(fm0.m3784j("projects/", str3, "/installations"));
/* 25 */            for (int i = 0; i <= 1; i++) {
/* 30 */                TrafficStats.setThreadStatsTag(TRAFFIC_STATS_CREATE_INSTALLATION_TAG);
/* 33 */                HttpURLConnection httpURLConnectionOpenHttpURLConnection = openHttpURLConnection(fullyQualifiedRequestUri, str);
                        try {
                            try {
/* 39 */                        httpURLConnectionOpenHttpURLConnection.setRequestMethod("POST");
/* 42 */                        httpURLConnectionOpenHttpURLConnection.setDoOutput(true);
/* 45 */                        if (str5 != null) {
/* 49 */                            httpURLConnectionOpenHttpURLConnection.addRequestProperty(X_ANDROID_IID_MIGRATION_KEY, str5);
                                }
/* 55 */                        writeFIDCreateRequestBodyToOutputStream(httpURLConnectionOpenHttpURLConnection, str2, str4);
/* 58 */                        int responseCode = httpURLConnectionOpenHttpURLConnection.getResponseCode();
/* 64 */                        this.requestLimiter.setNextRequestTime(responseCode);
/* 71 */                        if (isSuccessfulResponseCode(responseCode)) {
/* 73 */                            createResponse = readCreateResponse(httpURLConnectionOpenHttpURLConnection);
                                } else {
/* 84 */                            logFisCommunicationError(httpURLConnectionOpenHttpURLConnection, str4, str, str3);
/* 89 */                            if (responseCode == 429) {
/* 133 */                               throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                                    }
/* 93 */                            if (responseCode < 500 || responseCode >= 600) {
/* 106 */                               logBadConfigError();
/* 119 */                               createResponse = InstallationResponse.builder().setResponseCode(InstallationResponse.ResponseCode.BAD_CONFIG).build();
                                    }
/* 99 */                            httpURLConnectionOpenHttpURLConnection.disconnect();
/* 102 */                           TrafficStats.clearThreadStatsTag();
                                }
/* 77 */                        httpURLConnectionOpenHttpURLConnection.disconnect();
/* 80 */                        TrafficStats.clearThreadStatsTag();
/* 83 */                        return createResponse;
                            } catch (Throwable th) {
/* 134 */                       httpURLConnectionOpenHttpURLConnection.disconnect();
/* 137 */                       TrafficStats.clearThreadStatsTag();
/* 140 */                       throw th;
                            }
                        } catch (IOException | AssertionError unused) {
                        }
                    }
/* 151 */           throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
                }

                public void deleteFirebaseInstallation(String str, String str2, String str3, String str4) throws FirebaseInstallationsException {
/* 9 */             URL fullyQualifiedRequestUri = getFullyQualifiedRequestUri(AbstractC0886en.m3509m("projects/", str3, "/installations/", str2));
/* 13 */            int i = 0;
/* 15 */            while (i <= 1) {
/* 20 */                TrafficStats.setThreadStatsTag(TRAFFIC_STATS_DELETE_INSTALLATION_TAG);
/* 23 */                HttpURLConnection httpURLConnectionOpenHttpURLConnection = openHttpURLConnection(fullyQualifiedRequestUri, str);
                        try {
/* 29 */                    httpURLConnectionOpenHttpURLConnection.setRequestMethod("DELETE");
/* 51 */                    httpURLConnectionOpenHttpURLConnection.addRequestProperty("Authorization", "FIS_v2 " + str4);
/* 54 */                    int responseCode = httpURLConnectionOpenHttpURLConnection.getResponseCode();
/* 60 */                    if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
/* 72 */                        logFisCommunicationError(httpURLConnectionOpenHttpURLConnection, null, str, str3);
/* 77 */                        if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
/* 88 */                            logBadConfigError();
/* 100 */                           throw new FirebaseInstallationsException("Bad config while trying to delete FID", FirebaseInstallationsException.Status.BAD_CONFIG);
                                }
/* 103 */                       i++;
/* 105 */                       httpURLConnectionOpenHttpURLConnection.disconnect();
/* 108 */                       TrafficStats.clearThreadStatsTag();
                            }
/* 112 */                   httpURLConnectionOpenHttpURLConnection.disconnect();
/* 115 */                   TrafficStats.clearThreadStatsTag();
/* 118 */                   return;
                        } catch (IOException unused) {
                        } catch (Throwable th) {
/* 119 */                   httpURLConnectionOpenHttpURLConnection.disconnect();
/* 122 */                   TrafficStats.clearThreadStatsTag();
/* 125 */                   throw th;
                        }
                    }
/* 135 */           throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
                }

                public TokenResult generateAuthToken(String str, String str2, String str3, String str4) throws FirebaseInstallationsException {
                    TokenResult generateAuthTokenResponse;
/* 9 */             if (!this.requestLimiter.isRequestAllowed()) {
/* 201 */               throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
                    }
/* 21 */            URL fullyQualifiedRequestUri = getFullyQualifiedRequestUri(fm0.m3785k("projects/", str3, "/installations/", str2, "/authTokens:generate"));
/* 27 */            for (int i = 0; i <= 1; i++) {
/* 32 */                TrafficStats.setThreadStatsTag(TRAFFIC_STATS_GENERATE_AUTH_TOKEN_TAG);
/* 35 */                HttpURLConnection httpURLConnectionOpenHttpURLConnection = openHttpURLConnection(fullyQualifiedRequestUri, str);
                        try {
                            try {
/* 41 */                        httpURLConnectionOpenHttpURLConnection.setRequestMethod("POST");
/* 63 */                        httpURLConnectionOpenHttpURLConnection.addRequestProperty("Authorization", "FIS_v2 " + str4);
/* 66 */                        httpURLConnectionOpenHttpURLConnection.setDoOutput(true);
/* 69 */                        writeGenerateAuthTokenRequestBodyToOutputStream(httpURLConnectionOpenHttpURLConnection);
/* 72 */                        int responseCode = httpURLConnectionOpenHttpURLConnection.getResponseCode();
/* 78 */                        this.requestLimiter.setNextRequestTime(responseCode);
/* 85 */                        if (isSuccessfulResponseCode(responseCode)) {
/* 87 */                            generateAuthTokenResponse = readGenerateAuthTokenResponse(httpURLConnectionOpenHttpURLConnection);
                                } else {
/* 101 */                           logFisCommunicationError(httpURLConnectionOpenHttpURLConnection, null, str, str3);
/* 106 */                           if (responseCode == 401 || responseCode == 404) {
/* 170 */                               generateAuthTokenResponse = TokenResult.builder().setResponseCode(TokenResult.ResponseCode.AUTH_ERROR).build();
                                    } else {
/* 115 */                               if (responseCode == 429) {
/* 159 */                                   throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                                        }
/* 119 */                               if (responseCode < 500 || responseCode >= 600) {
/* 132 */                                   logBadConfigError();
/* 145 */                                   generateAuthTokenResponse = TokenResult.builder().setResponseCode(TokenResult.ResponseCode.BAD_CONFIG).build();
                                        }
/* 125 */                               httpURLConnectionOpenHttpURLConnection.disconnect();
/* 128 */                               TrafficStats.clearThreadStatsTag();
                                    }
                                }
/* 91 */                        httpURLConnectionOpenHttpURLConnection.disconnect();
/* 94 */                        TrafficStats.clearThreadStatsTag();
/* 97 */                        return generateAuthTokenResponse;
                            } catch (Throwable th) {
/* 175 */                       httpURLConnectionOpenHttpURLConnection.disconnect();
/* 178 */                       TrafficStats.clearThreadStatsTag();
/* 181 */                       throw th;
                            }
                        } catch (IOException | AssertionError unused) {
                        }
                    }
/* 193 */           throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
                }
            }
