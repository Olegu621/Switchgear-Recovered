            package com.google.android.recaptcha.internal;

            import java.net.HttpURLConnection;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class zzhm {
                private final zzii zza;

                public /* synthetic */ zzhm(zzii zziiVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 9 */             this.zza = new zzii();
                }

                public final zzhl zza(String str) throws zzcg {
                    try {
/* 3 */                 HttpURLConnection httpURLConnectionZza = this.zza.zza(str);
/* 9 */                 httpURLConnectionZza.setRequestMethod("POST");
/* 13 */                httpURLConnectionZza.setDoOutput(true);
/* 20 */                httpURLConnectionZza.setRequestProperty("Content-Type", "application/x-protobuffer");
/* 25 */                return new zzhl(httpURLConnectionZza);
                    } catch (zzcg e) {
/* 51 */                throw e;
                    } catch (Exception e2) {
/* 48 */                throw new zzcg(zzce.zzc, zzcd.zzai, e2.getMessage(), null, 8, null);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 11 */        public zzhm() {
/* 12 */            this(null, 1, 0 == true ? 1 : 0);
                }
            }
