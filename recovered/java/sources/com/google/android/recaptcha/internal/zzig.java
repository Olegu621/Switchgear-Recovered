            package com.google.android.recaptcha.internal;

            import android.net.Uri;
            import android.text.TextUtils;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.text.C1852e;
            import p000.C2085pw;
            import p000.C2122qw;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 23 */    public final class zzig {
                private final List zza;

                public zzig(boolean z) {
/* 22 */            this.zza = zzf(C2085pw.m7566e("www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"));
                }

                public static final boolean zzc(Uri uri) {
/* 1 */             return zze(uri);
                }

                private final boolean zzd(String str) {
/* 1 */             List list = this.zza;
/* 4 */             if (list == null || !list.isEmpty()) {
/* 13 */                Iterator it = list.iterator();
/* 21 */                while (it.hasNext()) {
/* 33 */                    if (C1852e.m6263m(str, (String) it.next(), false)) {
/* 35 */                        return true;
                            }
                        }
                    }
/* 3 */             return false;
                }

                private static final boolean zze(Uri uri) {
                    return (TextUtils.isEmpty(uri.toString()) || !"https".equals(uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) ? false : true;
                }

                private static final List zzf(List list) {
/* 9 */             ArrayList arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 12 */            Iterator it = list.iterator();
/* 20 */            while (it.hasNext()) {
/* 47 */                arrayList.add("https://" + ((String) it.next()) + "/");
                    }
/* 51 */            return arrayList;
                }

                public final boolean zza(Uri uri) {
                    return zze(uri) && zzd(uri.toString());
                }

                public final boolean zzb(String str) {
/* 1 */             Uri uri = Uri.parse(str);
/* 5 */             uri.getClass();
                    return zze(uri) && zzd(uri.toString());
                }

/* 24 */        public zzig() {
/* 25 */            this(true);
                }
            }
