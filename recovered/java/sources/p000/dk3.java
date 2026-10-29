            package p000;

            import android.os.RemoteException;
            import com.google.android.gms.common.internal.zzw;
            import com.google.android.gms.common.internal.zzx;
            import com.google.android.gms.dynamic.IObjectWrapper;
            import com.google.android.gms.dynamic.ObjectWrapper;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.UnsupportedEncodingException;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class dk3 extends zzw {

                /* JADX INFO: renamed from: b */
                public final int f7292b;

                public dk3(byte[] bArr) {
/* 3 */             super("com.google.android.gms.common.internal.ICertData");
/* 14 */            kb1.m6054g(bArr.length == 25);
/* 21 */            this.f7292b = Arrays.hashCode(bArr);
                }

                /* JADX INFO: renamed from: b */
                public static byte[] m3149b(String str) {
                    try {
/* 3 */                 return str.getBytes("ISO-8859-1");
                    } catch (UnsupportedEncodingException e) {
/* 9 */                 C1951n4.m6856g(e);
/* 12 */                return null;
                    }
                }

                /* JADX INFO: renamed from: a */
                public abstract byte[] mo308a();

                public final boolean equals(Object obj) {
                    IObjectWrapper iObjectWrapperZzd;
/* 4 */             if (obj instanceof zzx) {
                        try {
/* 7 */                     zzx zzxVar = (zzx) obj;
/* 15 */                    if (zzxVar.zze() == this.f7292b && (iObjectWrapperZzd = zzxVar.zzd()) != null) {
/* 34 */                        return Arrays.equals(mo308a(), (byte[]) ObjectWrapper.m2045b(iObjectWrapperZzd));
                            }
                        } catch (RemoteException e) {
/* 46 */                    AbstractC1245n0.m4877e("GoogleCertificates", "Failed to get Google certificates from remote", e);
/* 3 */                     return false;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 1 */             return this.f7292b;
                }

                @Override // com.google.android.gms.common.internal.zzx
                public final IObjectWrapper zzd() {
/* 7 */             return new ObjectWrapper(mo308a());
                }

                @Override // com.google.android.gms.common.internal.zzx
                public final int zze() {
/* 1 */             return this.f7292b;
                }
            }
