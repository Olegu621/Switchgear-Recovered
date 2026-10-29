            package p000;

            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class eh3 extends kb1 {

                /* JADX INFO: renamed from: e */
                public Object[] f7693e;

                /* JADX INFO: renamed from: f */
                public int f7694f;

                @Override // p000.kb1
                /* JADX INFO: renamed from: X */
                public final int mo3438X() {
/* 1 */             return this.f7694f;
                }

                @Override // p000.kb1
                /* JADX INFO: renamed from: Y */
                public final ph3 mo3439Y(int i) {
/* 3 */             if (i < this.f7694f) {
/* 10 */                return (ph3) this.f7693e[i + i];
                    }
/* 18 */            throw new IndexOutOfBoundsException();
                }

                @Override // p000.kb1
                /* JADX INFO: renamed from: Z */
                public final Object mo3440Z(int i) {
/* 3 */             if (i < this.f7694f) {
/* 10 */                return this.f7693e[i + i + 1];
                    }
/* 18 */            throw new IndexOutOfBoundsException();
                }

                @Override // p000.kb1
                /* JADX INFO: renamed from: a0 */
                public final Object mo3441a0(ph3 ph3Var) {
/* 1 */             int iM3443c0 = m3443c0(ph3Var);
/* 6 */             if (iM3443c0 == -1) {
/* 22 */                return null;
                    }
/* 17 */            return ph3Var.f15132b.cast(this.f7693e[iM3443c0 + iM3443c0 + 1]);
                }

                /* JADX INFO: renamed from: b0 */
                public final void m3442b0(ph3 ph3Var, Object obj) {
                    int iM3443c0;
/* 3 */             if (!ph3Var.f15133c && (iM3443c0 = m3443c0(ph3Var)) != -1) {
/* 18 */                this.f7693e[iM3443c0 + iM3443c0 + 1] = obj;
/* 20 */                return;
                    }
/* 23 */            int i = this.f7694f + 1;
/* 25 */            Object[] objArr = this.f7693e;
/* 27 */            int length = objArr.length;
/* 29 */            if (i + i > length) {
/* 36 */                this.f7693e = Arrays.copyOf(objArr, length + length);
                    }
/* 38 */            Object[] objArr2 = this.f7693e;
/* 40 */            int i2 = this.f7694f;
/* 42 */            int i3 = i2 + i2;
/* 44 */            objArr2[i3] = ph3Var;
/* 48 */            objArr2[i3 + 1] = obj;
/* 52 */            this.f7694f = i2 + 1;
                }

                /* JADX INFO: renamed from: c0 */
                public final int m3443c0(ph3 ph3Var) {
/* 4 */             for (int i = 0; i < this.f7694f; i++) {
/* 16 */                if (this.f7693e[i + i].equals(ph3Var)) {
/* 18 */                    return i;
                        }
                    }
/* 22 */            return -1;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Metadata{");
/* 11 */            for (int i = 0; i < this.f7694f; i++) {
/* 15 */                sb.append(" '");
/* 22 */                sb.append(mo3439Y(i));
/* 27 */                sb.append("': ");
/* 34 */                sb.append(mo3440Z(i));
                    }
/* 42 */            sb.append(" }");
/* 45 */            return sb.toString();
                }
            }
