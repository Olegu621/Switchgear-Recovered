            package p000;

            import java.io.IOException;
            import java.io.InvalidObjectException;
            import java.io.ObjectInputStream;
            
            /* JADX INFO: renamed from: rl */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2148rl extends C2222tl {

                /* JADX INFO: renamed from: e */
                public final int f16142e;

                /* JADX INFO: renamed from: f */
                public final int f16143f;

                public C2148rl(byte[] bArr, int i, int i2) {
/* 1 */             super(bArr);
/* 7 */             AbstractC2298vl.m9302b(i, i + i2, bArr.length);
/* 10 */            this.f16142e = i;
/* 12 */            this.f16143f = i2;
                }

                private void readObject(ObjectInputStream objectInputStream) throws IOException {
/* 8 */             throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
                }

                @Override // p000.C2222tl, p000.AbstractC2298vl
                /* JADX INFO: renamed from: a */
                public final byte mo8194a(int i) {
/* 3 */             int i2 = this.f16143f;
/* 8 */             if (((i2 - (i + 1)) | i) >= 0) {
/* 43 */                return this.f17140d[this.f16142e + i];
                    }
/* 10 */            if (i < 0) {
/* 23 */                throw new ArrayIndexOutOfBoundsException(fm0.m3781g(i, "Index < 0: "));
                    }
/* 37 */            throw new ArrayIndexOutOfBoundsException(AbstractC0886en.m3506j("Index > length: ", i, i2, ", "));
                }

                @Override // p000.C2222tl, p000.AbstractC2298vl
                /* JADX INFO: renamed from: d */
                public final void mo8195d(byte[] bArr, int i) {
/* 6 */             System.arraycopy(this.f17140d, this.f16142e, bArr, 0, i);
                }

                @Override // p000.C2222tl
                /* JADX INFO: renamed from: f */
                public final int mo8196f() {
/* 1 */             return this.f16142e;
                }

                @Override // p000.C2222tl
                /* JADX INFO: renamed from: g */
                public final byte mo8197g(int i) {
/* 6 */             return this.f17140d[this.f16142e + i];
                }

                @Override // p000.C2222tl, p000.AbstractC2298vl
                public final int size() {
/* 1 */             return this.f16143f;
                }

                public Object writeReplace() {
/* 7 */             return new C2222tl(m9304e());
                }
            }
