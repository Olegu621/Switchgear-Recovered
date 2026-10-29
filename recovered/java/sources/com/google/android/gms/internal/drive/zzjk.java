            package com.google.android.gms.internal.drive;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    final class zzjk {
                private final byte[] buffer;
                private final zzjr zznx;

                private zzjk(int i) {
/* 4 */             byte[] bArr = new byte[i];
/* 6 */             this.buffer = bArr;
/* 12 */            this.zznx = zzjr.zzb(bArr);
                }

                public final zzjc zzbx() {
/* 3 */             this.zznx.zzcb();
/* 10 */            return new zzjm(this.buffer);
                }

                public final zzjr zzby() {
/* 1 */             return this.zznx;
                }

/* 14 */        public /* synthetic */ zzjk(int i, zzjd zzjdVar) {
/* 15 */            this(i);
                }
            }
