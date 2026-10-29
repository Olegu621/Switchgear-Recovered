            package com.google.android.recaptcha.internal;

            import android.app.Application;
            import java.util.Locale;
            import java.util.MissingResourceException;
            import okhttp3.HttpUrl;
            import p000.p51;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgh {
                private zzvu zza;
                private final p51 zzb;

                public zzgh() {
/* 4 */             int i = zzby.zza;
/* 12 */            this.zzb = r51.m8065b(zzgg.zza);
                }

                private final Application zzb() {
/* 7 */             return (Application) this.zzb.getValue();
                }

                private static final String zzc() {
                    try {
/* 5 */                 String iSO3Country = Locale.getDefault().getISO3Country();
/* 9 */                 iSO3Country.getClass();
/* 12 */                return iSO3Country;
                    } catch (MissingResourceException unused) {
/* 13 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                }

                private static final String zzd() {
                    try {
/* 5 */                 String iSO3Language = Locale.getDefault().getISO3Language();
/* 9 */                 iSO3Language.getClass();
/* 12 */                return iSO3Language;
                    } catch (MissingResourceException unused) {
/* 13 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                }

                /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:26:0x004c
                    	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
                    	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                    	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                    	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                    */
                public final com.google.android.recaptcha.internal.zzwz zza(java.lang.String r10) {
                    /*
                        Method dump skipped, instruction units count: 290
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgh.zza(java.lang.String):com.google.android.recaptcha.internal.zzwz");
                }
            }
