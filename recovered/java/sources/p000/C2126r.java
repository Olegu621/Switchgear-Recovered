            package p000;

            import java.util.Iterator;
            import java.util.NoSuchElementException;
            import kotlin.Pair;
            import kotlinx.serialization.internal.EnumDescriptor;
            
            /* JADX INFO: renamed from: r */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 12 */    public class C2126r implements Iterator, r21 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15812a;

                /* JADX INFO: renamed from: b */
                public int f15813b;

                /* JADX INFO: renamed from: c */
                public final Object f15814c;

                public C2126r(EnumDescriptor enumDescriptor) {
/* 2 */             this.f15812a = 2;
/* 7 */             this.f15814c = enumDescriptor;
/* 11 */            this.f15813b = enumDescriptor.f12952c;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 1 */             int i = this.f15812a;
/* 3 */             Object obj = this.f15814c;
                    switch (i) {
                        case 0:
                            return this.f15813b < ((AbstractC2237u) obj).size();
                        case 1:
                            return this.f15813b < ((Object[]) obj).length;
                        case 2:
                            return this.f15813b > 0;
                        case 3:
                            return this.f15813b < ((byte[]) obj).length;
                        case 4:
                            return this.f15813b < ((int[]) obj).length;
                        case 5:
                            return this.f15813b < ((long[]) obj).length;
                        case 6:
                            return this.f15813b < ((short[]) obj).length;
                        default:
                            return this.f15813b <= ((u13) obj).f17331b;
                    }
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 1 */             int i = this.f15812a;
/* 3 */             Object obj = this.f15814c;
                    switch (i) {
                        case 0:
/* 198 */                   if (!hasNext()) {
/* 213 */                       C1951n4.m6864o();
/* 216 */                       return null;
                            }
/* 202 */                   int i2 = this.f15813b;
/* 206 */                   this.f15813b = i2 + 1;
/* 208 */                   return ((AbstractC2237u) obj).get(i2);
                        case 1:
                            try {
/* 168 */                       int i3 = this.f15813b;
/* 172 */                       this.f15813b = i3 + 1;
/* 174 */                       return ((Object[]) obj)[i3];
                            } catch (ArrayIndexOutOfBoundsException e) {
/* 182 */                       this.f15813b--;
/* 193 */                       throw new NoSuchElementException(e.getMessage());
                            }
                        case 2:
/* 150 */                   EnumDescriptor enumDescriptor = (EnumDescriptor) obj;
/* 152 */                   int i4 = enumDescriptor.f12952c;
/* 154 */                   int i5 = this.f15813b;
/* 158 */                   this.f15813b = i5 - 1;
/* 163 */                   return enumDescriptor.f12954e[i4 - i5];
                        case 3:
/* 121 */                   int i6 = this.f15813b;
/* 123 */                   byte[] bArr = (byte[]) obj;
/* 126 */                   if (i6 >= bArr.length) {
/* 149 */                       throw new NoSuchElementException(String.valueOf(i6));
                            }
/* 130 */                   this.f15813b = i6 + 1;
/* 136 */                   return new ts2(bArr[i6]);
                        case 4:
/* 92 */                    int i7 = this.f15813b;
/* 94 */                    int[] iArr = (int[]) obj;
/* 97 */                    if (i7 >= iArr.length) {
/* 120 */                       throw new NoSuchElementException(String.valueOf(i7));
                            }
/* 101 */                   this.f15813b = i7 + 1;
/* 107 */                   return new mw2(iArr[i7]);
                        case 5:
/* 63 */                    int i8 = this.f15813b;
/* 65 */                    long[] jArr = (long[]) obj;
/* 68 */                    if (i8 >= jArr.length) {
/* 91 */                        throw new NoSuchElementException(String.valueOf(i8));
                            }
/* 72 */                    this.f15813b = i8 + 1;
/* 78 */                    return new sw2(jArr[i8]);
                        case 6:
/* 34 */                    int i9 = this.f15813b;
/* 36 */                    short[] sArr = (short[]) obj;
/* 39 */                    if (i9 >= sArr.length) {
/* 62 */                        throw new NoSuchElementException(String.valueOf(i9));
                            }
/* 43 */                    this.f15813b = i9 + 1;
/* 49 */                    return new ax2(sArr[i9]);
                        default:
/* 8 */                     int i10 = this.f15813b;
/* 12 */                    this.f15813b = i10 + 1;
/* 30 */                    return new Pair(Integer.valueOf(i10), Boolean.valueOf(((u13) obj).m8934a(i10)));
                    }
                }

                @Override // java.util.Iterator
                public final void remove() {
                    switch (this.f15812a) {
                        case 0:
/* 69 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        case 1:
/* 61 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        case 2:
/* 53 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        case 3:
/* 45 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        case 4:
/* 37 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        case 5:
/* 29 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        case 6:
/* 21 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }

/* 13 */        public C2126r(Object[] objArr) {
                    this.f15812a = 1;
                    objArr.getClass();
                    this.f15814c = objArr;
                }

/* 14 */        public C2126r(u13 u13Var) {
                    this.f15812a = 7;
/* 16 */            this.f15814c = u13Var;
/* 17 */            this.f15813b = 1;
                }

/* 17 */        public /* synthetic */ C2126r(Object obj, int i) {
/* 18 */            this.f15812a = i;
                    this.f15814c = obj;
                }
            }
