            package com.google.android.recaptcha.internal;

            import java.io.IOException;
            import p000.C1951n4;
            import p000.pk3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public abstract class zzqq {
                public static final /* synthetic */ int zze = 0;
                private static volatile int zzf = 100;
                int zza;
                int zzb;
                final int zzc = zzf;
                zzqr zzd;

                private zzqq() {
                }

                public static int zzF(int i) {
/* 6 */             return (i >>> 1) ^ (-(i & 1));
                }

                public static long zzG(long j) {
/* 7 */             return (j >>> 1) ^ (-(1 & j));
                }

                public static zzqq zzH(byte[] bArr, int i, int i2, boolean z) {
/* 8 */             zzqn zzqnVar = new zzqn(bArr, 0, 0, false, null);
                    try {
/* 12 */                zzqnVar.zze(0);
/* 15 */                return zzqnVar;
                    } catch (zzsx e) {
/* 18 */                C1951n4.m6863n(e);
/* 21 */                return null;
                    }
                }

                public abstract void zzA(int i);

                public abstract boolean zzC() throws IOException;

                public abstract boolean zzD() throws IOException;

                public abstract boolean zzE(int i) throws IOException;

                public final void zzI() throws zzsx {
/* 8 */             if (this.zza + this.zzb < this.zzc) {
/* 10 */                return;
                    }
/* 13 */            pk3.m7475k("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }

                public final void zzJ() throws zzsx {
/* 3 */             if (this.zzb == 0) {
/* 6 */                 zzz(0);
                    }
                }

                public final void zzK() throws IOException {
                    boolean zZzE;
/* 27 */            do {
/* 1 */                 int iZzm = zzm();
/* 5 */                 if (iZzm == 0) {
/* 29 */                    return;
                        }
/* 8 */                 zzI();
/* 15 */                this.zzb++;
/* 17 */                zZzE = zzE(iZzm);
/* 25 */                this.zzb--;
/* 27 */            } while (zZzE);
                }

                public abstract double zzb() throws IOException;

                public abstract float zzc() throws IOException;

                public abstract int zzd();

                public abstract int zze(int i) throws zzsx;

                public abstract int zzf() throws IOException;

                public abstract int zzg() throws IOException;

                public abstract int zzh() throws IOException;

                public abstract int zzk() throws IOException;

                public abstract int zzl() throws IOException;

                public abstract int zzm() throws IOException;

                public abstract int zzn() throws IOException;

                public abstract long zzo() throws IOException;

                public abstract long zzp() throws IOException;

                public abstract long zzt() throws IOException;

                public abstract long zzu() throws IOException;

                public abstract long zzv() throws IOException;

                public abstract zzqm zzw() throws IOException;

                public abstract String zzx() throws IOException;

                public abstract String zzy() throws IOException;

                public abstract void zzz(int i) throws zzsx;

/* 8 */         public /* synthetic */ zzqq(zzqp zzqpVar) {
                }
            }
