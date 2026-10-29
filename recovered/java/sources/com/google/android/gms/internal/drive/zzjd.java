            package com.google.android.gms.internal.drive;

            import p000.C1951n4;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzjd extends zzjf {
                private final int limit;
                private int position = 0;
                private final /* synthetic */ zzjc zznu;

                public zzjd(zzjc zzjcVar) {
/* 1 */             this.zznu = zzjcVar;
/* 13 */            this.limit = zzjcVar.size();
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return this.position < this.limit;
                }

                @Override // com.google.android.gms.internal.drive.zzjj
                public final byte nextByte() {
/* 1 */             int i = this.position;
/* 5 */             if (i < this.limit) {
/* 9 */                 this.position = i + 1;
/* 13 */                return this.zznu.zzt(i);
                    }
/* 18 */            C1951n4.m6864o();
/* 21 */            return (byte) 0;
                }
            }
