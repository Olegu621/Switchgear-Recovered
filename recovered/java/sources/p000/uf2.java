            package p000;

            import android.text.Editable;
            import android.text.SpannableStringBuilder;
            import java.lang.reflect.Array;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     public final class uf2 extends SpannableStringBuilder {

                /* JADX INFO: renamed from: a */
                public final Class f17508a;

                /* JADX INFO: renamed from: b */
                public final ArrayList f17509b;

                public uf2(Class cls, CharSequence charSequence) {
/* 1 */             super(charSequence);
/* 9 */             this.f17509b = new ArrayList();
/* 13 */            de3.m3027i(cls, "watcherClass cannot be null");
/* 16 */            this.f17508a = cls;
                }

                /* JADX INFO: renamed from: a */
                public final void m9006a() {
/* 1 */             int i = 0;
                    while (true) {
/* 2 */                 ArrayList arrayList = this.f17509b;
/* 8 */                 if (i >= arrayList.size()) {
/* 24 */                    return;
                        }
/* 18 */                ((tf2) arrayList.get(i)).f17082b.incrementAndGet();
/* 21 */                i++;
                    }
                }

                @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
                public final Editable append(CharSequence charSequence) {
/* 1 */             super.append(charSequence);
/* 4 */             return this;
                }

                /* JADX INFO: renamed from: b */
                public final void m9007b() {
/* 1 */             m9010e();
/* 5 */             int i = 0;
                    while (true) {
/* 6 */                 ArrayList arrayList = this.f17509b;
/* 12 */                if (i >= arrayList.size()) {
/* 34 */                    return;
                        }
/* 28 */                ((tf2) arrayList.get(i)).onTextChanged(this, 0, length(), length());
/* 31 */                i++;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final tf2 m9008c(Object obj) {
/* 1 */             int i = 0;
                    while (true) {
/* 2 */                 ArrayList arrayList = this.f17509b;
/* 8 */                 if (i >= arrayList.size()) {
/* 24 */                    return null;
                        }
/* 14 */                tf2 tf2Var = (tf2) arrayList.get(i);
/* 18 */                if (tf2Var.f17081a == obj) {
/* 20 */                    return tf2Var;
                        }
/* 21 */                i++;
                    }
                }

                /* JADX INFO: renamed from: d */
                public final boolean m9009d(Object obj) {
/* 1 */             if (obj != null) {
                        return this.f17508a == obj.getClass();
                    }
/* 13 */            return false;
                }

                @Override // android.text.SpannableStringBuilder, android.text.Editable
                public final Editable delete(int i, int i2) {
/* 1 */             super.delete(i, i2);
/* 4 */             return this;
                }

                /* JADX INFO: renamed from: e */
                public final void m9010e() {
/* 1 */             int i = 0;
                    while (true) {
/* 2 */                 ArrayList arrayList = this.f17509b;
/* 8 */                 if (i >= arrayList.size()) {
/* 24 */                    return;
                        }
/* 18 */                ((tf2) arrayList.get(i)).f17082b.decrementAndGet();
/* 21 */                i++;
                    }
                }

                @Override // android.text.SpannableStringBuilder, android.text.Spanned
                public final int getSpanEnd(Object obj) {
                    tf2 tf2VarM9008c;
/* 5 */             if (m9009d(obj) && (tf2VarM9008c = m9008c(obj)) != null) {
/* 13 */                obj = tf2VarM9008c;
                    }
/* 14 */            return super.getSpanEnd(obj);
                }

                @Override // android.text.SpannableStringBuilder, android.text.Spanned
                public final int getSpanFlags(Object obj) {
                    tf2 tf2VarM9008c;
/* 5 */             if (m9009d(obj) && (tf2VarM9008c = m9008c(obj)) != null) {
/* 13 */                obj = tf2VarM9008c;
                    }
/* 14 */            return super.getSpanFlags(obj);
                }

                @Override // android.text.SpannableStringBuilder, android.text.Spanned
                public final int getSpanStart(Object obj) {
                    tf2 tf2VarM9008c;
/* 5 */             if (m9009d(obj) && (tf2VarM9008c = m9008c(obj)) != null) {
/* 13 */                obj = tf2VarM9008c;
                    }
/* 14 */            return super.getSpanStart(obj);
                }

                @Override // android.text.SpannableStringBuilder, android.text.Spanned
                public final Object[] getSpans(int i, int i2, Class cls) {
/* 3 */             if (this.f17508a != cls) {
/* 34 */                return super.getSpans(i, i2, cls);
                    }
/* 11 */            tf2[] tf2VarArr = (tf2[]) super.getSpans(i, i2, tf2.class);
/* 18 */            Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, tf2VarArr.length);
/* 22 */            for (int i3 = 0; i3 < tf2VarArr.length; i3++) {
/* 28 */                objArr[i3] = tf2VarArr[i3].f17081a;
                    }
/* 33 */            return objArr;
                }

                @Override // android.text.SpannableStringBuilder, android.text.Editable
                public final Editable insert(int i, CharSequence charSequence) {
/* 1 */             super.insert(i, charSequence);
/* 4 */             return this;
                }

                @Override // android.text.SpannableStringBuilder, android.text.Spanned
                public final int nextSpanTransition(int i, int i2, Class cls) {
/* 1 */             if (cls == null || this.f17508a == cls) {
/* 7 */                 cls = tf2.class;
                    }
/* 9 */             return super.nextSpanTransition(i, i2, cls);
                }

                @Override // android.text.SpannableStringBuilder, android.text.Spannable
                public final void removeSpan(Object obj) {
                    tf2 tf2VarM9008c;
/* 5 */             if (m9009d(obj)) {
/* 7 */                 tf2VarM9008c = m9008c(obj);
/* 11 */                if (tf2VarM9008c != null) {
/* 13 */                    obj = tf2VarM9008c;
                        }
                    } else {
/* 15 */                tf2VarM9008c = null;
                    }
/* 16 */            super.removeSpan(obj);
/* 19 */            if (tf2VarM9008c != null) {
/* 23 */                this.f17509b.remove(tf2VarM9008c);
                    }
                }

                @Override // android.text.SpannableStringBuilder, android.text.Editable
                public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
/* 1 */             m9006a();
/* 4 */             super.replace(i, i2, charSequence);
/* 7 */             m9010e();
/* 10 */            return this;
                }

                @Override // android.text.SpannableStringBuilder, android.text.Spannable
                public final void setSpan(Object obj, int i, int i2, int i3) {
/* 5 */             if (m9009d(obj)) {
/* 9 */                 tf2 tf2Var = new tf2(obj);
/* 14 */                this.f17509b.add(tf2Var);
/* 17 */                obj = tf2Var;
                    }
/* 18 */            super.setSpan(obj, i, i2, i3);
                }

                @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
                public final CharSequence subSequence(int i, int i2) {
/* 5 */             return new uf2(this.f17508a, this, i, i2);
                }

                @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
/* 4 */         public final SpannableStringBuilder append(CharSequence charSequence) {
/* 5 */             super.append(charSequence);
                    return this;
                }

                @Override // android.text.SpannableStringBuilder, android.text.Editable
/* 4 */         public final SpannableStringBuilder delete(int i, int i2) {
/* 5 */             super.delete(i, i2);
                    return this;
                }

                @Override // android.text.SpannableStringBuilder, android.text.Editable
/* 4 */         public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
/* 5 */             super.insert(i, charSequence);
                    return this;
                }

                @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
/* 5 */         public final Appendable append(CharSequence charSequence) {
/* 6 */             super.append(charSequence);
                    return this;
                }

                @Override // android.text.SpannableStringBuilder, android.text.Editable
/* 5 */         public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
/* 6 */             super.insert(i, charSequence, i2, i3);
                    return this;
                }

                @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
/* 6 */         public final Editable append(char c) {
/* 7 */             super.append(c);
                    return this;
                }

                @Override // android.text.SpannableStringBuilder, android.text.Editable
/* 6 */         public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
/* 7 */             super.insert(i, charSequence, i2, i3);
                    return this;
                }

                @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
/* 7 */         public final SpannableStringBuilder append(char c) {
/* 8 */             super.append(c);
                    return this;
                }

                @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
/* 8 */         public final Appendable append(char c) {
/* 9 */             super.append(c);
                    return this;
                }

                @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
/* 9 */         public final Editable append(CharSequence charSequence, int i, int i2) {
/* 10 */            super.append(charSequence, i, i2);
                    return this;
                }

                @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
/* 10 */        public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
/* 11 */            super.append(charSequence, i, i2);
                    return this;
                }

                @Override // android.text.SpannableStringBuilder, android.text.Editable
/* 10 */        public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
/* 11 */            replace(i, i2, charSequence, i3, i4);
                    return this;
                }

                @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
/* 11 */        public final Appendable append(CharSequence charSequence, int i, int i2) {
/* 12 */            super.append(charSequence, i, i2);
                    return this;
                }

                @Override // android.text.SpannableStringBuilder, android.text.Editable
/* 11 */        public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
/* 12 */            replace(i, i2, charSequence);
                    return this;
                }

                @Override // android.text.SpannableStringBuilder
/* 12 */        public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
/* 13 */            super.append(charSequence, obj, i);
                    return this;
                }

                @Override // android.text.SpannableStringBuilder, android.text.Editable
/* 12 */        public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
/* 13 */            m9006a();
/* 14 */            super.replace(i, i2, charSequence, i3, i4);
/* 15 */            m9010e();
                    return this;
                }

/* 18 */        public uf2(Class cls, uf2 uf2Var, int i, int i2) {
/* 19 */            super(uf2Var, i, i2);
/* 20 */            this.f17509b = new ArrayList();
/* 21 */            de3.m3027i(cls, "watcherClass cannot be null");
/* 22 */            this.f17508a = cls;
                }
            }
