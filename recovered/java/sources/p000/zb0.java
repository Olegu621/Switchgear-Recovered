            package p000;

            import android.content.Context;
            import android.text.TextUtils;
            import android.view.MenuItem;
            import androidx.preference.ListPreference;
            import androidx.preference.Preference;
            import androidx.preference.R$string;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.config.AbstractC1417a;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.InputStream;
            import java.net.URL;
            import java.net.UnknownHostException;
            import java.security.KeyPairGenerator;
            import java.security.MessageDigest;
            import java.security.Provider;
            import java.util.List;
            import java.util.Map;
            import java.util.zip.GZIPInputStream;
            import javax.crypto.KeyAgreement;
            import javax.net.ssl.HttpsURLConnection;
            import okhttp3.HttpUrl;
            import okio.Segment;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     public class zb0 implements ie0, so0, ew1, hg1, ay1 {

                /* JADX INFO: renamed from: b */
                public static zb0 f20058b;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f20059a;

                public /* synthetic */ zb0(int i) {
/* 1 */             this.f20059a = i;
                }

                /* JADX INFO: renamed from: g */
                public static String m10322g(List list) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 51 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 19 */            StringBuilder sb = new StringBuilder((String) list.get(0));
/* 27 */            for (int i = 1; i < list.size(); i++) {
/* 31 */                sb.append(";");
/* 40 */                sb.append((String) list.get(i));
                    }
/* 46 */            return sb.toString();
                }

                /* JADX INFO: renamed from: h */
                public static void m10323h(Context context, String str) {
/* 3 */             File databasePath = context.getDatabasePath("snowplowEvents.sqlite");
/* 9 */             File databasePath2 = context.getDatabasePath("snowplowEvents.sqlite-wal");
/* 15 */            File databasePath3 = context.getDatabasePath("snowplowEvents.sqlite-shm");
/* 19 */            File parentFile = databasePath.getParentFile();
/* 25 */            File file = new File(parentFile, str);
/* 36 */            File file2 = new File(parentFile, str.concat("-wal"));
/* 47 */            File file3 = new File(parentFile, str.concat("-shm"));
/* 54 */            if (databasePath.renameTo(file) && databasePath2.renameTo(file2)) {
/* 62 */                databasePath3.renameTo(file3);
                    }
                }

                @Override // p000.ie0
                /* JADX INFO: renamed from: a */
                public Object mo3402a(String str, Provider provider) {
                    switch (this.f20059a) {
                        case 3:
                            return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
                        case 4:
                            return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
                        default:
                            return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
                    }
                }

                @Override // p000.so0
                public Object apply(Object obj) {
/* 1 */             return obj;
                }

                /* JADX INFO: renamed from: b */
                public float mo7942b(float f, float f2) {
/* 1 */             return 1.0f;
                }

                @Override // p000.hg1
                /* JADX INFO: renamed from: c */
                public boolean mo3404c(jg1 jg1Var, MenuItem menuItem) {
/* 1 */             return false;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v0 */
                /* JADX WARN: Type inference failed for: r10v1 */
                /* JADX WARN: Type inference failed for: r10v11 */
                /* JADX WARN: Type inference failed for: r10v19 */
                /* JADX WARN: Type inference failed for: r10v2 */
                /* JADX WARN: Type inference failed for: r10v3, types: [java.io.Closeable] */
                /* JADX WARN: Type inference failed for: r10v4, types: [java.io.Closeable] */
                /* JADX INFO: renamed from: d */
                public ss0 m10324d(String str, Map map, File file) {
                    boolean z;
                    String str2;
                    String str3;
                    ?? r10;
                    FileOutputStream fileOutputStreamM5167e;
                    String str4;
                    boolean z2;
                    String str5;
                    boolean z3;
/* 13 */            String str6 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 17 */            JSONObject jSONObject = new JSONObject();
/* 20 */            int responseCode = 404;
                    try {
                        try {
                            try {
/* 31 */                        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
/* 35 */                        map.put("Accept-Encoding", "gzip");
/* 50 */                        for (Map.Entry entry : map.entrySet()) {
                                    try {
/* 70 */                                httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                    } catch (UnknownHostException e) {
/* 84 */                                e = e;
/* 85 */                                str3 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 86 */                                fileOutputStreamM5167e = null;
/* 87 */                                z = false;
/* 438 */                               xe2.m9777o("dwnldrNet", "Error downloading resource: " + str + " \n " + e.getMessage(), null);
/* 441 */                               b40.m1221e(fileOutputStreamM5167e);
/* 444 */                               str4 = str3;
/* 405 */                               str5 = str6;
/* 406 */                               z2 = z;
/* 448 */                               return new ss0(responseCode, jSONObject, str4, str5, z2);
                                    } catch (Exception e2) {
/* 78 */                                e = e2;
/* 79 */                                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 80 */                                r10 = 0;
/* 81 */                                z = false;
                                        try {
/* 398 */                                   xe2.m9777o("dwnldrNet", "Error downloading resource: " + str, e);
/* 401 */                                   b40.m1221e(r10);
/* 404 */                                   str4 = str2;
/* 405 */                                   str5 = str6;
/* 406 */                                   z2 = z;
/* 448 */                                   return new ss0(responseCode, jSONObject, str4, str5, z2);
                                        } catch (Throwable th) {
/* 408 */                                   th = th;
/* 452 */                                   b40.m1221e(r10);
/* 455 */                                   throw th;
                                        }
                                    }
                                }
/* 90 */                        responseCode = httpsURLConnection.getResponseCode();
/* 94 */                        String contentEncoding = httpsURLConnection.getContentEncoding();
/* 98 */                        String contentType = httpsURLConnection.getContentType();
                                try {
/* 102 */                           Map<String, List<String>> headerFields = httpsURLConnection.getHeaderFields();
/* 118 */                           for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                                        try {
/* 130 */                                   if (entry2.getKey() != null || entry2.getValue() != null) {
/* 151 */                                       if (entry2.getKey() == null) {
/* 163 */                                           jSONObject.put(HttpUrl.FRAGMENT_ENCODE_SET, m10322g(entry2.getValue()));
                                                } else {
/* 183 */                                           jSONObject.put(entry2.getKey(), m10322g(entry2.getValue()));
/* 198 */                                           if (entry2.getKey().equalsIgnoreCase("Access-Control-Allow-Origin")) {
/* 208 */                                               jSONObject.put(entry2.getKey(), "*");
                                                    }
                                                }
                                            }
                                        } catch (UnknownHostException e3) {
/* 143 */                                   e = e3;
/* 144 */                                   str3 = str6;
/* 145 */                                   str6 = contentType;
/* 86 */                                    fileOutputStreamM5167e = null;
/* 87 */                                    z = false;
/* 438 */                                   xe2.m9777o("dwnldrNet", "Error downloading resource: " + str + " \n " + e.getMessage(), null);
/* 441 */                                   b40.m1221e(fileOutputStreamM5167e);
/* 444 */                                   str4 = str3;
/* 405 */                                   str5 = str6;
/* 406 */                                   z2 = z;
/* 448 */                                   return new ss0(responseCode, jSONObject, str4, str5, z2);
                                        } catch (Exception e4) {
/* 139 */                                   e = e4;
/* 140 */                                   str2 = str6;
/* 141 */                                   str6 = contentType;
/* 80 */                                    r10 = 0;
/* 81 */                                    z = false;
/* 398 */                                   xe2.m9777o("dwnldrNet", "Error downloading resource: " + str, e);
/* 401 */                                   b40.m1221e(r10);
/* 404 */                                   str4 = str2;
/* 405 */                                   str5 = str6;
/* 406 */                                   z2 = z;
/* 448 */                                   return new ss0(responseCode, jSONObject, str4, str5, z2);
                                        }
                                    }
/* 214 */                           List<String> list = headerFields.get("etag");
/* 220 */                           if (list != null && !list.isEmpty()) {
/* 229 */                               str6 = list.get(0);
                                    }
/* 240 */                           if (responseCode < 200 || responseCode > 300) {
/* 326 */                               z = false;
/* 327 */                               fileOutputStreamM5167e = null;
                                    } else {
/* 244 */                               InputStream inputStream = httpsURLConnection.getInputStream();
/* 252 */                               if (b40.m1234r(contentEncoding) && contentEncoding.contains("gzip")) {
/* 262 */                                   inputStream = new GZIPInputStream(inputStream);
                                        }
/* 271 */                               fileOutputStreamM5167e = AbstractC1417a.m5167e(new FileOutputStream(file), file);
                                        try {
/* 277 */                                   byte[] bArr = new byte[Segment.SIZE];
                                            while (true) {
/* 279 */                                       int i = inputStream.read(bArr);
/* 284 */                                       if (i == -1) {
                                                    break;
                                                }
/* 286 */                                       z = false;
                                                try {
/* 287 */                                           fileOutputStreamM5167e.write(bArr, 0, i);
                                                } catch (UnknownHostException e5) {
/* 301 */                                           e = e5;
/* 302 */                                           str3 = str6;
/* 303 */                                           str6 = contentType;
/* 438 */                                           xe2.m9777o("dwnldrNet", "Error downloading resource: " + str + " \n " + e.getMessage(), null);
/* 441 */                                           b40.m1221e(fileOutputStreamM5167e);
/* 444 */                                           str4 = str3;
/* 405 */                                           str5 = str6;
/* 406 */                                           z2 = z;
/* 448 */                                           return new ss0(responseCode, jSONObject, str4, str5, z2);
                                                } catch (Exception e6) {
/* 295 */                                           e = e6;
/* 296 */                                           r10 = fileOutputStreamM5167e;
/* 297 */                                           str2 = str6;
/* 298 */                                           str6 = contentType;
/* 398 */                                           xe2.m9777o("dwnldrNet", "Error downloading resource: " + str, e);
/* 401 */                                           b40.m1221e(r10);
/* 404 */                                           str4 = str2;
/* 405 */                                           str5 = str6;
/* 406 */                                           z2 = z;
/* 448 */                                           return new ss0(responseCode, jSONObject, str4, str5, z2);
                                                }
                                            }
/* 306 */                                   z = false;
                                        } catch (UnknownHostException e7) {
/* 311 */                                   e = e7;
/* 312 */                                   z = false;
/* 302 */                                   str3 = str6;
/* 303 */                                   str6 = contentType;
/* 438 */                                   xe2.m9777o("dwnldrNet", "Error downloading resource: " + str + " \n " + e.getMessage(), null);
/* 441 */                                   b40.m1221e(fileOutputStreamM5167e);
/* 444 */                                   str4 = str3;
/* 405 */                                   str5 = str6;
/* 406 */                                   z2 = z;
                                        } catch (Exception e8) {
/* 308 */                                   e = e8;
/* 309 */                                   z = false;
/* 296 */                                   r10 = fileOutputStreamM5167e;
/* 297 */                                   str2 = str6;
/* 298 */                                   str6 = contentType;
/* 398 */                                   xe2.m9777o("dwnldrNet", "Error downloading resource: " + str, e);
/* 401 */                                   b40.m1221e(r10);
/* 404 */                                   str4 = str2;
/* 405 */                                   str5 = str6;
/* 406 */                                   z2 = z;
                                        }
                                    }
/* 328 */                           if ((responseCode < 200 || responseCode > 300) && responseCode != 304) {
/* 367 */                               z3 = z;
                                    } else {
/* 362 */                               xe2.m9775m("dwnldrNet", "Successfully downloaded the resource with Url: " + str + " headers: " + map, null);
/* 365 */                               z3 = true;
                                    }
/* 368 */                           b40.m1221e(fileOutputStreamM5167e);
/* 371 */                           str4 = str6;
/* 372 */                           z2 = z3;
/* 373 */                           str5 = contentType;
                                } catch (UnknownHostException e9) {
/* 320 */                           e = e9;
/* 321 */                           z = false;
/* 322 */                           str3 = str6;
/* 323 */                           str6 = contentType;
/* 324 */                           fileOutputStreamM5167e = null;
/* 438 */                           xe2.m9777o("dwnldrNet", "Error downloading resource: " + str + " \n " + e.getMessage(), null);
/* 441 */                           b40.m1221e(fileOutputStreamM5167e);
/* 444 */                           str4 = str3;
/* 405 */                           str5 = str6;
/* 406 */                           z2 = z;
/* 448 */                           return new ss0(responseCode, jSONObject, str4, str5, z2);
                                } catch (Exception e10) {
/* 314 */                           e = e10;
/* 315 */                           z = false;
/* 316 */                           str2 = str6;
/* 317 */                           str6 = contentType;
/* 318 */                           r10 = 0;
/* 398 */                           xe2.m9777o("dwnldrNet", "Error downloading resource: " + str, e);
/* 401 */                           b40.m1221e(r10);
/* 404 */                           str4 = str2;
/* 405 */                           str5 = str6;
/* 406 */                           z2 = z;
/* 448 */                           return new ss0(responseCode, jSONObject, str4, str5, z2);
                                }
                            } catch (Throwable th2) {
/* 291 */                       th = th2;
/* 292 */                       r10 = file;
/* 452 */                       b40.m1221e(r10);
/* 455 */                       throw th;
                            }
                        } catch (Throwable th3) {
/* 74 */                    th = th3;
/* 75 */                    r10 = 0;
/* 452 */                   b40.m1221e(r10);
/* 455 */                   throw th;
                        }
                    } catch (UnknownHostException e11) {
/* 379 */               e = e11;
/* 380 */               z = false;
/* 381 */               str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                    } catch (Exception e12) {
/* 375 */               e = e12;
/* 376 */               z = false;
/* 377 */               str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 448 */           return new ss0(responseCode, jSONObject, str4, str5, z2);
                }

                @Override // p000.ew1
                /* JADX INFO: renamed from: e */
                public CharSequence mo3406e(Preference preference) {
/* 1 */             ListPreference listPreference = (ListPreference) preference;
/* 8 */             if (TextUtils.isEmpty(null)) {
/* 14 */                return listPreference.f1560a.getString(R$string.not_set);
                    }
/* 3 */             return null;
                }

                @Override // p000.ay1
                /* JADX INFO: renamed from: f */
                public void mo1180f(int i, Object obj) {
                    String str;
                    switch (i) {
                        case 1:
/* 34 */                    str = "RESULT_INSTALL_SUCCESS";
                            break;
                        case 2:
/* 31 */                    str = "RESULT_ALREADY_INSTALLED";
                            break;
                        case 3:
/* 28 */                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                            break;
                        case 4:
/* 25 */                    str = "RESULT_NOT_WRITABLE";
                            break;
                        case 5:
/* 22 */                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                            break;
                        case 6:
/* 19 */                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                            break;
                        case 7:
/* 16 */                    str = "RESULT_IO_EXCEPTION";
                            break;
                        case 8:
/* 13 */                    str = "RESULT_PARSE_EXCEPTION";
                            break;
                        case 9:
                        default:
/* 4 */                     str = HttpUrl.FRAGMENT_ENCODE_SET;
                            break;
                        case 10:
/* 10 */                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                            break;
                        case 11:
/* 7 */                     str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                            break;
                    }
/* 37 */            if (i == 6 || i == 7 || i == 8) {
/* 51 */                AbstractC1245n0.m4877e("ProfileInstaller", str, (Throwable) obj);
                    }
                }

                @Override // p000.hg1
                /* JADX INFO: renamed from: l */
                public void mo3407l(jg1 jg1Var) {
                }
            }
