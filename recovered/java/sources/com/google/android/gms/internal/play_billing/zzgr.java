            package com.google.android.gms.internal.play_billing;

            import java.io.IOException;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     public abstract class zzgr extends zzgc {
                private static final Logger zzb = Logger.getLogger(zzgr.class.getName());
                private static final boolean zzc = zzjq.zzx();
                zzgs zza;

                public /* synthetic */ zzgr(zzgq zzgqVar) {
                }

                public static int zzA(long j) {
/* 9 */             return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
                }

                @Deprecated
                public static int zzw(int i, zzim zzimVar, zzix zzixVar) {
/* 3 */             int iZzz = zzz(i << 3);
/* 14 */            return ((zzfv) zzimVar).zze(zzixVar) + iZzz + iZzz;
                }

                public static int zzx(zzim zzimVar, zzix zzixVar) {
/* 3 */             int iZze = ((zzfv) zzimVar).zze(zzixVar);
/* 11 */            return zzz(iZze) + iZze;
                }

                public static int zzy(String str) {
                    int length;
                    try {
/* 1 */                 length = zzjt.zzc(str);
                    } catch (zzjs unused) {
/* 12 */                length = str.getBytes(zzhp.zza).length;
                    }
/* 17 */            return zzz(length) + length;
                }

                public static int zzz(int i) {
/* 9 */             return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
                }

                public final void zzB() {
/* 5 */             if (zza() == 0) {
/* 7 */                 return;
                    }
/* 10 */            f42.m3656l("Did not write as much data as expected.");
                }

                public final void zzC(String str, zzjs zzjsVar) throws IOException {
/* 12 */            zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzjsVar);
/* 17 */            byte[] bytes = str.getBytes(zzhp.zza);
                    try {
/* 21 */                int length = bytes.length;
/* 22 */                zzt(length);
/* 26 */                zzl(bytes, 0, length);
                    } catch (IndexOutOfBoundsException e) {
/* 37 */                throw new zzgp(e);
                    }
                }

                public abstract int zza();

                public abstract void zzb(byte b) throws IOException;

                public abstract void zzd(int i, boolean z) throws IOException;

                public abstract void zze(int i, zzgk zzgkVar) throws IOException;

                public abstract void zzf(int i, int i2) throws IOException;

                public abstract void zzg(int i) throws IOException;

                public abstract void zzh(int i, long j) throws IOException;

                public abstract void zzi(long j) throws IOException;

                public abstract void zzj(int i, int i2) throws IOException;

                public abstract void zzk(int i) throws IOException;

                public abstract void zzl(byte[] bArr, int i, int i2) throws IOException;

                public abstract void zzm(int i, zzim zzimVar, zzix zzixVar) throws IOException;

                public abstract void zzn(int i, zzim zzimVar) throws IOException;

                public abstract void zzo(int i, zzgk zzgkVar) throws IOException;

                public abstract void zzp(int i, String str) throws IOException;

                public abstract void zzr(int i, int i2) throws IOException;

                public abstract void zzs(int i, int i2) throws IOException;

                public abstract void zzt(int i) throws IOException;

                public abstract void zzu(int i, long j) throws IOException;

                public abstract void zzv(long j) throws IOException;

/* 4 */         private zzgr() {
/* 5 */             throw null;
                }
            }
