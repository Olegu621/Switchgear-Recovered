            package com.google.android.recaptcha.internal;

            import java.io.InputStreamReader;
            import java.net.HttpURLConnection;
            import java.net.URL;
            import java.net.URLConnection;
            import java.util.zip.GZIPInputStream;
            import kotlin.jvm.internal.Intrinsics;
            import p000.de3;
            import p000.p51;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhp implements zzhn {
                private final p51 zza;

                public zzhp() {
/* 4 */             int i = zzby.zza;
/* 12 */            this.zza = r51.m8065b(zzho.zza);
                }

                @Override // com.google.android.recaptcha.internal.zzhn
                public final zzxn zza(String str, zzzd zzzdVar) throws zzcg {
/* 1 */             zzhl zzhlVarZza = null;
                    try {
                        try {
/* 10 */                    zzhlVarZza = ((zzhm) this.zza.getValue()).zza(str);
/* 14 */                    zzhlVarZza.zzc();
/* 21 */                    zzhlVarZza.zze(zzzdVar.zzd());
/* 28 */                    zzts zztsVarZza = zzhlVarZza.zza(zzxn.zzj());
/* 32 */                    zztsVarZza.getClass();
/* 35 */                    zzxn zzxnVar = (zzxn) zztsVarZza;
/* 37 */                    zzhlVarZza.zzd();
/* 40 */                    return zzxnVar;
                        } catch (zzcg e) {
/* 68 */                    if (zzhlVarZza == null || !Intrinsics.m6216a(e.zza(), zzcd.zzax)) {
/* 123 */                       throw e;
                            }
                            try {
/* 123 */                       throw zzcf.zza(zzzj.zzg(zzhlVarZza.zzb().getErrorStream()).zzi());
                            } catch (Exception e2) {
/* 123 */                       throw new zzcg(zzce.zzc, zzcd.zzG, e2.getMessage(), null, 8, null);
                            }
                        } catch (Exception e3) {
/* 67 */                    throw new zzcg(zzce.zzc, zzcd.zzF, e3.getMessage(), null, 8, null);
                        }
                    } catch (Throwable th) {
/* 125 */               if (zzhlVarZza == null) {
/* 130 */                   throw th;
                        }
/* 127 */               zzhlVarZza.zzd();
/* 130 */               throw th;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzhn
                public final String zzb(String str) throws zzcg {
                    try {
                        try {
/* 8 */                     URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
/* 12 */                    uRLConnectionOpenConnection.getClass();
/* 15 */                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
/* 19 */                    httpURLConnection.setRequestMethod("GET");
/* 23 */                    httpURLConnection.setDoInput(true);
/* 30 */                    httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
/* 35 */                    httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
/* 38 */                    httpURLConnection.connect();
/* 47 */                    if (httpURLConnection.getResponseCode() != 200) {
/* 124 */                       throw new zzcg(zzce.zzc, new zzcd(httpURLConnection.getResponseCode()), null, null, 12, null);
                            }
                            try {
/* 83 */                        return de3.m3015C("gzip".equals(httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream())) : new InputStreamReader(httpURLConnection.getInputStream()));
                            } catch (Exception unused) {
/* 102 */                       throw new zzcg(zzce.zzc, zzcd.zzP, null, null, 12, null);
                            }
                        } catch (Exception unused2) {
/* 139 */                   throw new zzcg(zzce.zzc, zzcd.zzO, null, null, 12, null);
                        }
                    } catch (Exception unused3) {
/* 154 */               throw new zzcg(zzce.zzb, zzcd.zzN, null, null, 12, null);
                    }
                }
            }
