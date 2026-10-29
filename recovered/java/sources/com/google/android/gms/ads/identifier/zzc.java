            package com.google.android.gms.ads.identifier;

            import com.google.android.gms.internal.ads_identifier.zzi;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import java.net.HttpURLConnection;
            import java.net.URL;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzc {
                public static final void zza(String str) {
                    try {
                        try {
/* 7 */                     zzi.zzb(263);
/* 19 */                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                            try {
/* 21 */                        int responseCode = httpURLConnection.getResponseCode();
/* 27 */                        if (responseCode < 200 || responseCode >= 300) {
/* 45 */                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
/* 50 */                            sb.append("Received non-success response code ");
/* 53 */                            sb.append(responseCode);
/* 58 */                            sb.append(" from pinging URL: ");
/* 61 */                            sb.append(str);
/* 68 */                            AbstractC1245n0.m4889q("HttpUrlPinger", sb.toString());
                                }
/* 71 */                        httpURLConnection.disconnect();
/* 74 */                        zzi.zza();
                            } catch (Throwable th) {
/* 85 */                        httpURLConnection.disconnect();
/* 88 */                        throw th;
                            }
                        } catch (Throwable th2) {
/* 196 */                   zzi.zza();
/* 199 */                   throw th2;
                        }
                    } catch (IOException e) {
/* 80 */                e = e;
/* 89 */                String message = e.getMessage();
/* 114 */               StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
/* 119 */               sb2.append("Error while pinging URL: ");
/* 122 */               sb2.append(str);
/* 125 */               sb2.append(". ");
/* 128 */               sb2.append(message);
/* 135 */               AbstractC1245n0.m4891s("HttpUrlPinger", sb2.toString(), e);
/* 138 */               zzi.zza();
                    } catch (IndexOutOfBoundsException e2) {
/* 142 */               String message2 = e2.getMessage();
/* 167 */               StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
/* 172 */               sb3.append("Error while parsing ping URL: ");
/* 175 */               sb3.append(str);
/* 178 */               sb3.append(". ");
/* 181 */               sb3.append(message2);
/* 188 */               AbstractC1245n0.m4891s("HttpUrlPinger", sb3.toString(), e2);
/* 191 */               zzi.zza();
                    } catch (RuntimeException e3) {
/* 78 */                e = e3;
/* 89 */                String message3 = e.getMessage();
/* 114 */               StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
/* 119 */               sb4.append("Error while pinging URL: ");
/* 122 */               sb4.append(str);
/* 125 */               sb4.append(". ");
/* 128 */               sb4.append(message3);
/* 135 */               AbstractC1245n0.m4891s("HttpUrlPinger", sb4.toString(), e);
/* 138 */               zzi.zza();
                    }
                }
            }
