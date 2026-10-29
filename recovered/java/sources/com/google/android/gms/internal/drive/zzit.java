            package com.google.android.gms.internal.drive;

            import com.google.android.gms.internal.drive.zzit;
            import com.google.android.gms.internal.drive.zziu;
            import java.io.IOException;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzit<MessageType extends zzit<MessageType, BuilderType>, BuilderType extends zziu<MessageType, BuilderType>> implements zzlq {
                private static boolean zznf;
                protected int zzne = 0;

                public final byte[] toByteArray() {
                    try {
/* 5 */                 byte[] bArr = new byte[zzcx()];
/* 7 */                 zzjr zzjrVarZzb = zzjr.zzb(bArr);
/* 11 */                zzb(zzjrVarZzb);
/* 14 */                zzjrVarZzb.zzcb();
/* 17 */                return bArr;
                    } catch (IOException e) {
/* 25 */                String name = getClass().getName();
/* 44 */                StringBuilder sb = new StringBuilder("byte array".length() + name.length() + 62);
/* 49 */                sb.append("Serializing ");
/* 52 */                sb.append(name);
/* 57 */                sb.append(" to a byte array threw an IOException (should never happen).");
/* 67 */                throw new RuntimeException(sb.toString(), e);
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzlq
                public final zzjc zzbl() {
                    try {
/* 5 */                 zzjk zzjkVarZzu = zzjc.zzu(zzcx());
/* 13 */                zzb(zzjkVarZzu.zzby());
/* 16 */                return zzjkVarZzu.zzbx();
                    } catch (IOException e) {
/* 28 */                String name = getClass().getName();
/* 47 */                StringBuilder sb = new StringBuilder("ByteString".length() + name.length() + 62);
/* 52 */                sb.append("Serializing ");
/* 55 */                sb.append(name);
/* 60 */                sb.append(" to a ByteString threw an IOException (should never happen).");
/* 70 */                throw new RuntimeException(sb.toString(), e);
                    }
                }

                public int zzbm() {
/* 6 */             throw new UnsupportedOperationException();
                }

                public void zzo(int i) {
/* 6 */             throw new UnsupportedOperationException();
                }
            }
