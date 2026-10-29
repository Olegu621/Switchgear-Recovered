            package com.google.android.recaptcha.internal;

            import android.net.TrafficStats;
            import android.webkit.URLUtil;
            import com.appsflyer.attribution.RequestError;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.net.HttpURLConnection;
            import java.net.MalformedURLException;
            import java.net.URL;
            import java.net.URLConnection;
            import java.util.List;
            import javax.net.ssl.HttpsURLConnection;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import p000.C2085pw;
            import p000.p51;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhc implements zzha {
                private final p51 zza;

                public zzhc() {
/* 4 */             int i = zzby.zza;
/* 12 */            this.zza = r51.m8065b(zzhb.zza);
                }

                private static final void zzb(byte[] bArr) {
/* 17 */            for (zzwn zzwnVar : zzwq.zzk(bArr).zzl()) {
/* 25 */                String str = "INIT_TOTAL";
/* 33 */                List listM7566e = C2085pw.m7566e("INIT_TOTAL", "EXECUTE_TOTAL");
                        switch (zzwnVar.zzaa()) {
                            case 2:
/* 210 */                       str = "UNKNOWN";
                                break;
                            case 3:
/* 207 */                       str = "INIT_NATIVE";
                                break;
                            case 4:
/* 204 */                       str = "INIT_NETWORK";
                                break;
                            case 5:
/* 201 */                       str = "INIT_JS";
                                break;
                            case 6:
                                break;
                            case 7:
/* 198 */                       str = "EXECUTE_NATIVE";
                                break;
                            case 8:
/* 195 */                       str = "EXECUTE_JS";
                                break;
                            case 9:
/* 27 */                        str = "EXECUTE_TOTAL";
                                break;
                            case 10:
/* 190 */                       str = "CHALLENGE_ACCOUNT_NATIVE";
                                break;
                            case 11:
/* 187 */                       str = "CHALLENGE_ACCOUNT_JS";
                                break;
                            case 12:
/* 184 */                       str = "CHALLENGE_ACCOUNT_TOTAL";
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 181 */                       str = "VERIFY_PIN_NATIVE";
                                break;
                            case 14:
/* 178 */                       str = "VERIFY_PIN_JS";
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 175 */                       str = "VERIFY_PIN_TOTAL";
                                break;
                            case 16:
/* 172 */                       str = "RUN_PROGRAM";
                                break;
                            case 17:
/* 169 */                       str = "FETCH_ALLOWLIST";
                                break;
                            case 18:
/* 166 */                       str = "JS_LOAD";
                                break;
                            case 19:
/* 163 */                       str = "WEB_VIEW_RELOAD_JS";
                                break;
                            case 20:
/* 160 */                       str = "INIT_NETWORK_MRI_ACTION";
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 157 */                       str = "INIT_DOWNLOAD_JS";
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 154 */                       str = "VALIDATE_INPUT";
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 151 */                       str = "DOWNLOAD_JS";
                                break;
                            case 24:
/* 148 */                       str = "SAVE_CACHE_JS";
                                break;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 145 */                       str = "LOAD_CACHE_JS";
                                break;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 142 */                       str = "LOAD_WEBVIEW";
                                break;
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 139 */                       str = "COLLECT_SIGNALS";
                                break;
                            case Build.API_LEVELS.API_28 /* 28 */:
/* 136 */                       str = "FETCH_TOKEN";
                                break;
                            case Build.API_LEVELS.API_29 /* 29 */:
/* 132 */                       str = "POST_EXECUTE";
                                break;
                            case Build.API_LEVELS.API_30 /* 30 */:
/* 128 */                       str = "SIGNAL_MANAGER_INITIALIZATION";
                                break;
                            case Build.API_LEVELS.API_31 /* 31 */:
/* 124 */                       str = "SIGNAL_MANAGER_COLLECT_SIGNALS";
                                break;
                            case 32:
/* 120 */                       str = "WEBVIEW_ENGINE_INITIALIATION";
                                break;
                            case Build.API_LEVELS.API_33 /* 33 */:
/* 116 */                       str = "WEBVIEW_ENGINE_SIGNAL_COLLECTION";
                                break;
                            case Build.API_LEVELS.API_34 /* 34 */:
/* 112 */                       str = "NATIVE_ENGINE_INITIALIZATION";
                                break;
                            case Build.API_LEVELS.API_35 /* 35 */:
/* 108 */                       str = "NATIVE_ENGINE_SIGNAL_COLLECTION";
                                break;
                            case Build.API_LEVELS.API_36 /* 36 */:
/* 104 */                       str = "NATIVE_SIGNAL_INITIALIZATION";
                                break;
                            case 37:
/* 100 */                       str = "NATIVE_SIGNAL_COLLECTION";
                                break;
                            case 38:
/* 96 */                        str = "PIA_WARMUP";
                                break;
                            case 39:
/* 92 */                        str = "GMSCORE_ENGINE_INITIALIZATION";
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 88 */                        str = "GMSCORE_ENGINE_SIGNAL_COLLECTION";
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
/* 84 */                        str = "INIT_ATTEMPT";
                                break;
                            case 42:
/* 80 */                        str = "WEBVIEW_INITIALIZATION";
                                break;
                            case 43:
/* 76 */                        str = "ORCAS_ENGINE_INITIALIZATION";
                                break;
                            case 44:
/* 72 */                        str = "ORCAS_ENGINE_SIGNAL_COLLECTION";
                                break;
                            case 45:
/* 68 */                        str = "INIT_CLIENT_REUSE";
                                break;
                            case 46:
/* 64 */                        str = "ORCAS_SIGNAL_COLLECTION";
                                break;
                            case 47:
/* 60 */                        str = "ORCAS_SIGNAL_INITIALIZATION";
                                break;
                            case 48:
/* 56 */                        str = "FETCH_TOKEN_ATTEMPT";
                                break;
                            case 49:
/* 52 */                        str = "ORCAS_FETCH_VERIFICATION_KEY";
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 48 */                        str = "ORCAS_VALIDATE_SIGNATURE";
                                break;
                            default:
/* 44 */                        str = "UNRECOGNIZED";
                                break;
                        }
/* 216 */               if (listM7566e.contains(str) && zzwnVar.zzY()) {
/* 224 */                   zzwnVar.zzN();
/* 227 */                   zzwnVar.zzO();
/* 230 */                   zzwnVar.zzaa();
/* 237 */                   zzwnVar.zzi().zzk();
/* 244 */                   zzwnVar.zzi().zzf();
/* 247 */                   zzwnVar.zzab();
                        } else {
/* 252 */                   zzwnVar.zzN();
/* 255 */                   zzwnVar.zzO();
/* 258 */                   zzwnVar.zzaa();
/* 261 */                   zzwnVar.zzab();
                        }
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzha
                public final boolean zza(byte[] bArr) {
                    HttpURLConnection httpURLConnection;
                    try {
/* 11 */                TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
/* 14 */                zzb(bArr);
/* 25 */                String strZzc = ((zzcy) this.zza.getValue()).zzc();
/* 33 */                if (URLUtil.isHttpUrl(strZzc)) {
/* 40 */                    URLConnection uRLConnectionOpenConnection = new URL(strZzc).openConnection();
/* 44 */                    uRLConnectionOpenConnection.getClass();
/* 47 */                    httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                        } else {
/* 56 */                    if (!URLUtil.isHttpsUrl(strZzc)) {
/* 115 */                       throw new MalformedURLException("Recaptcha server url only allows using Http or Https.");
                            }
/* 63 */                    URLConnection uRLConnectionOpenConnection2 = new URL(strZzc).openConnection();
/* 67 */                    uRLConnectionOpenConnection2.getClass();
/* 70 */                    httpURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection2;
                        }
/* 74 */                httpURLConnection.setRequestMethod("POST");
/* 78 */                httpURLConnection.setDoOutput(true);
/* 85 */                httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuffer");
/* 88 */                httpURLConnection.connect();
/* 95 */                httpURLConnection.getOutputStream().write(bArr);
                        return httpURLConnection.getResponseCode() == 200;
                    } catch (Exception e) {
/* 116 */               e.getMessage();
/* 1 */                 return false;
                    }
                }
            }
