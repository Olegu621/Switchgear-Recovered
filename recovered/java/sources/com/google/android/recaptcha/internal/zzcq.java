            package com.google.android.recaptcha.internal;

            import android.content.Context;
            import java.io.File;
            import java.io.IOException;
            import java.nio.charset.StandardCharsets;
            import java.security.GeneralSecurityException;
            import java.util.ArrayList;
            import java.util.Iterator;
            import kotlin.collections.C1839a;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import okhttp3.HttpUrl;
            import p000.AbstractC1902lt;
            import p000.C2082pt;
            import p000.C2122qw;
            import p000.C2156rt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzcq implements zzbt {
                private final Context zza;
                private final String zzb = "rce_";

                public zzcq(Context context) {
/* 4 */             this.zza = context;
/* 12 */            new zzdl(context);
                }

                @Override // com.google.android.recaptcha.internal.zzbt
                public final String zza(String str) {
/* 19 */            File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
/* 26 */            if (file.exists()) {
/* 36 */                return new String(zzdl.zza(file), StandardCharsets.UTF_8);
                    }
/* 40 */            return null;
                }

                @Override // com.google.android.recaptcha.internal.zzbt
                public final void zzb() {
                    try {
/* 7 */                 File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
/* 11 */                if (fileArrListFiles != null) {
/* 15 */                    ArrayList arrayList = new ArrayList();
/* 21 */                    for (File file : fileArrListFiles) {
/* 35 */                        if (C1852e.m6263m(file.getName(), this.zzb, false)) {
/* 37 */                            arrayList.add(file);
                                }
                            }
/* 43 */                    Iterator it = arrayList.iterator();
/* 51 */                    while (it.hasNext()) {
/* 59 */                        ((File) it.next()).delete();
                            }
                        }
                    } catch (Exception unused) {
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzbt
                public final void zzc(String str, String str2) throws GeneralSecurityException, IOException {
/* 7 */             C2156rt c2156rt = new C2156rt('A', 'z');
/* 18 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(c2156rt, 10));
/* 21 */            Iterator it = c2156rt.iterator();
/* 30 */            while (((C2082pt) it).f15278c) {
/* 43 */                arrayList.add(Character.valueOf(((AbstractC1902lt) it).mo6536a()));
                    }
/* 67 */            String strM6203x = CollectionsKt.m6203x(((ArrayList) C1839a.m6211c(arrayList)).subList(0, 8), HttpUrl.FRAGMENT_ENCODE_SET, null, null, null, 62);
/* 71 */            Context context = this.zza;
/* 73 */            String str3 = this.zzb;
/* 85 */            File file = new File(context.getCacheDir(), str3.concat(strM6203x));
/* 98 */            zzdl.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
/* 118 */           file.renameTo(new File(context.getCacheDir(), str3.concat(String.valueOf(str))));
                }

                @Override // com.google.android.recaptcha.internal.zzbt
                public final boolean zzd(String str) {
                    try {
/* 8 */                 File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
/* 12 */                File file = null;
/* 13 */                if (fileArrListFiles != null) {
/* 17 */                    for (File file2 : fileArrListFiles) {
/* 46 */                        if (Intrinsics.m6216a(file2.getName(), this.zzb + str)) {
/* 48 */                            file = file2;
                                    break;
                                }
                            }
                        }
                        return file != null;
                    } catch (Exception unused) {
                    }
                }
            }
