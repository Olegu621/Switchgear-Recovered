            package com.google.android.gms.internal.measurement;

            import java.util.Iterator;
            import java.util.List;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface zzao {
                public static final zzao zzf = new zzat();
                public static final zzao zzg = new zzam();
                public static final zzao zzh = new zzag("continue");
                public static final zzao zzi = new zzag("break");
                public static final zzao zzj = new zzag("return");
                public static final zzao zzk = new zzaf(Boolean.TRUE);
                public static final zzao zzl = new zzaf(Boolean.FALSE);
                public static final zzao zzm = new zzas(HttpUrl.FRAGMENT_ENCODE_SET);

                String zzc();

                zzao zzcA(String str, zzg zzgVar, List list);

                Double zzd();

                Boolean zze();

                Iterator zzf();

                zzao zzt();
            }
