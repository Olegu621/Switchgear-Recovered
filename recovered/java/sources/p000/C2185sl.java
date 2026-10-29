            package p000;

            import java.io.IOException;
            import java.io.InvalidObjectException;
            import java.io.ObjectInputStream;
            
            /* JADX INFO: renamed from: sl */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2185sl extends C2259ul {

                /* JADX INFO: renamed from: e */
                public final int f16670e;

                /* JADX INFO: renamed from: f */
                public final int f16671f;

                public C2185sl(byte[] bArr, int i, int i2) {
/* 1 */             super(bArr);
/* 7 */             C2259ul.m9038b(i, i + i2, bArr.length);
/* 10 */            this.f16670e = i;
/* 12 */            this.f16671f = i2;
                }

                private void readObject(ObjectInputStream objectInputStream) throws IOException {
/* 8 */             throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
                }

                @Override // p000.C2259ul
                /* JADX INFO: renamed from: a */
                public final byte mo8549a(int i) {
/* 3 */             int i2 = this.f16671f;
/* 8 */             if (((i2 - (i + 1)) | i) >= 0) {
/* 43 */                return this.f17584b[this.f16670e + i];
                    }
/* 10 */            if (i < 0) {
/* 23 */                throw new ArrayIndexOutOfBoundsException(fm0.m3781g(i, "Index < 0: "));
                    }
/* 37 */            throw new ArrayIndexOutOfBoundsException(AbstractC0886en.m3506j("Index > length: ", i, i2, ", "));
                }

                @Override // p000.C2259ul
                /* JADX INFO: renamed from: d */
                public final void mo8550d(byte[] bArr, int i) {
/* 6 */             System.arraycopy(this.f17584b, this.f16670e, bArr, 0, i);
                }

                @Override // p000.C2259ul
                /* JADX INFO: renamed from: e */
                public final int mo8551e() {
/* 1 */             return this.f16670e;
                }

                @Override // p000.C2259ul
                /* JADX INFO: renamed from: f */
                public final byte mo8552f(int i) {
/* 6 */             return this.f17584b[this.f16670e + i];
                }

                @Override // p000.C2259ul
                public final int size() {
/* 1 */             return this.f16671f;
                }

                public Object writeReplace() {
                    byte[] bArr;
/* 1 */             int size = size();
/* 5 */             if (size == 0) {
/* 7 */                 bArr = fz0.f8402b;
                    } else {
/* 10 */                byte[] bArr2 = new byte[size];
/* 12 */                mo8550d(bArr2, size);
/* 15 */                bArr = bArr2;
                    }
/* 18 */            return new C2259ul(bArr);
                }
            }
