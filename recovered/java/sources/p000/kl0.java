            package p000;

            import android.util.Size;
            import io.sentry.InterfaceC1525k1;
            import io.sentry.android.core.anr.C1167a;
            import java.io.File;
            import java.util.Comparator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class kl0 implements Comparator {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12867a;

                public /* synthetic */ kl0(int i) {
/* 1 */             this.f12867a = i;
                }

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    switch (this.f12867a) {
                        case 0:
/* 149 */                   byte[] bArr = (byte[]) obj;
/* 151 */                   byte[] bArr2 = (byte[]) obj2;
/* 155 */                   if (bArr.length != bArr2.length) {
/* 159 */                       return bArr.length - bArr2.length;
                            }
/* 164 */                   for (int i = 0; i < bArr.length; i++) {
/* 166 */                       byte b = bArr[i];
/* 168 */                       byte b2 = bArr2[i];
/* 170 */                       if (b != b2) {
/* 172 */                           return b - b2;
                                }
                            }
/* 3 */                     return 0;
                        case 1:
/* 117 */                   Size size = (Size) obj;
/* 119 */                   Size size2 = (Size) obj2;
/* 144 */                   return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
                        case 2:
/* 112 */                   return ((C1888lf) obj).f13218a.compareTo(((C1888lf) obj2).f13218a);
                        case 3:
/* 57 */                    InterfaceC1525k1 interfaceC1525k1 = (InterfaceC1525k1) obj;
/* 59 */                    InterfaceC1525k1 interfaceC1525k2 = (InterfaceC1525k1) obj2;
/* 61 */                    if (interfaceC1525k1 == interfaceC1525k2) {
/* 3 */                         return 0;
                            }
/* 72 */                    int iCompareTo = interfaceC1525k1.mo4741w().compareTo(interfaceC1525k2.mo4741w());
                            return iCompareTo != 0 ? iCompareTo : interfaceC1525k1.mo4737s().f10756b.m5198a().compareTo(interfaceC1525k2.mo4737s().f10756b.m5198a());
                        case 4:
/* 24 */                    C1167a c1167a = (C1167a) obj;
/* 26 */                    C1167a c1167a2 = (C1167a) obj2;
/* 52 */                    return Float.compare((c1167a.f9946b + 1.0f) * c1167a.f9950f * c1167a.f9945a, (c1167a2.f9946b + 1.0f) * c1167a2.f9950f * c1167a2.f9945a);
                        default:
/* 19 */                    return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
                    }
                }
            }
