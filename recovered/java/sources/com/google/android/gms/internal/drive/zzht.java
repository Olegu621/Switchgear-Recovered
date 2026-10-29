            package com.google.android.gms.internal.drive;

            import com.google.android.gms.common.data.DataHolder;
            import java.util.Collection;
            import p000.ke3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzht extends ke3 {
                public zzht(String str, Collection collection, Collection collection2, int i) {
/* 4 */             super(str, collection, collection2, 7000000);
                }

                @Override // p000.ke3, p000.sc3
                /* JADX INFO: renamed from: zze */
                public final Boolean zzc(DataHolder dataHolder, int i, int i2) {
/* 13 */            return Boolean.valueOf(dataHolder.m2013E1(i, i2, "trashed") == 2);
                }
            }
