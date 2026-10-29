            package p000;

            import android.text.InputFilter;
            import android.text.method.PasswordTransformationMethod;
            import android.text.method.TransformationMethod;
            import android.util.SparseArray;
            import android.widget.TextView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fd0 extends py0 {

                /* JADX INFO: renamed from: k */
                public final TextView f8141k;

                /* JADX INFO: renamed from: l */
                public final bd0 f8142l;

                /* JADX INFO: renamed from: m */
                public boolean f8143m;

                public fd0(TextView textView) {
/* 3 */             super(9);
/* 6 */             this.f8141k = textView;
/* 9 */             this.f8143m = true;
/* 16 */            this.f8142l = new bd0(textView);
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: X */
                public final InputFilter[] mo3724X(InputFilter[] inputFilterArr) {
/* 5 */             if (!this.f8143m) {
/* 9 */                 SparseArray sparseArray = new SparseArray(1);
/* 14 */                for (int i = 0; i < inputFilterArr.length; i++) {
/* 16 */                    InputFilter inputFilter = inputFilterArr[i];
/* 20 */                    if (inputFilter instanceof bd0) {
/* 22 */                        sparseArray.put(i, inputFilter);
                            }
                        }
/* 32 */                if (sparseArray.size() == 0) {
/* 34 */                    return inputFilterArr;
                        }
/* 35 */                int length = inputFilterArr.length;
/* 42 */                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
/* 44 */                int i2 = 0;
/* 45 */                for (int i3 = 0; i3 < length; i3++) {
/* 51 */                    if (sparseArray.indexOfKey(i3) < 0) {
/* 55 */                        inputFilterArr2[i2] = inputFilterArr[i3];
/* 57 */                        i2++;
                            }
                        }
/* 62 */                return inputFilterArr2;
                    }
/* 63 */            int length2 = inputFilterArr.length;
/* 64 */            int i4 = 0;
                    while (true) {
/* 65 */                bd0 bd0Var = this.f8142l;
/* 67 */                if (i4 >= length2) {
/* 79 */                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
/* 81 */                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
/* 84 */                    inputFilterArr3[length2] = bd0Var;
/* 86 */                    return inputFilterArr3;
                        }
/* 71 */                if (inputFilterArr[i4] == bd0Var) {
/* 73 */                    return inputFilterArr;
                        }
/* 74 */                i4++;
                    }
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: o0 */
                public final boolean mo3725o0() {
/* 1 */             return this.f8143m;
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: s0 */
                public final void mo3726s0(boolean z) {
/* 1 */             if (z) {
/* 3 */                 TextView textView = this.f8141k;
/* 13 */                textView.setTransformationMethod(mo3728v0(textView.getTransformationMethod()));
                    }
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: t0 */
                public final void mo3727t0(boolean z) {
/* 1 */             this.f8143m = z;
/* 3 */             TextView textView = this.f8141k;
/* 13 */            textView.setTransformationMethod(mo3728v0(textView.getTransformationMethod()));
/* 24 */            textView.setFilters(mo3724X(textView.getFilters()));
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: v0 */
                public final TransformationMethod mo3728v0(TransformationMethod transformationMethod) {
/* 3 */             if (this.f8143m) {
                        return ((transformationMethod instanceof jd0) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new jd0(transformationMethod);
                    }
                    return transformationMethod instanceof jd0 ? ((jd0) transformationMethod).f12227a : transformationMethod;
                }
            }
