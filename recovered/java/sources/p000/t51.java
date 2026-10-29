            package p000;

            import java.nio.charset.Charset;
            import java.util.AbstractList;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.List;
            import java.util.RandomAccess;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public final class t51 extends AbstractC0827d0 implements u51, RandomAccess {

                /* JADX INFO: renamed from: b */
                public final ArrayList f16924b;

                static {
/* 9 */             new t51(10).f6945a = false;
                }

                public t51(int i) {
/* 6 */             this(new ArrayList(i));
                }

                @Override // p000.u51
                /* JADX INFO: renamed from: C0 */
                public final void mo8695C0(AbstractC2298vl abstractC2298vl) {
/* 1 */             m2903a();
/* 6 */             this.f16924b.add(abstractC2298vl);
/* 13 */            ((AbstractList) this).modCount++;
                }

                @Override // p000.u51
                /* JADX INFO: renamed from: X0 */
                public final u51 mo8696X0() {
                    return this.f6945a ? new zx2(this) : this;
                }

                @Override // java.util.AbstractList, java.util.List
                public final void add(int i, Object obj) {
/* 3 */             m2903a();
/* 8 */             this.f16924b.add(i, (String) obj);
/* 15 */            ((AbstractList) this).modCount++;
                }

                @Override // p000.AbstractC0827d0, java.util.AbstractList, java.util.List
                public final boolean addAll(int i, Collection collection) {
/* 1 */             m2903a();
/* 6 */             if (collection instanceof u51) {
/* 10 */                collection = ((u51) collection).mo8697c0();
                    }
/* 16 */            boolean zAddAll = this.f16924b.addAll(i, collection);
/* 24 */            ((AbstractList) this).modCount++;
/* 26 */            return zAddAll;
                }

                @Override // p000.u51
                /* JADX INFO: renamed from: c0 */
                public final List mo8697c0() {
/* 3 */             return Collections.unmodifiableList(this.f16924b);
                }

                @Override // p000.AbstractC0827d0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final void clear() {
/* 1 */             m2903a();
/* 6 */             this.f16924b.clear();
/* 13 */            ((AbstractList) this).modCount++;
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object get(int i) {
                    String str;
/* 1 */             ArrayList arrayList = this.f16924b;
/* 3 */             Object obj = arrayList.get(i);
/* 9 */             if (obj instanceof String) {
/* 11 */                return (String) obj;
                    }
/* 16 */            if (!(obj instanceof AbstractC2298vl)) {
/* 75 */                byte[] bArr = (byte[]) obj;
/* 81 */                String str2 = new String(bArr, ez0.f7923a);
/* 92 */                if (m13.f13547a.m4449t(bArr, 0, bArr.length)) {
/* 94 */                    arrayList.set(i, str2);
                        }
/* 97 */                return str2;
                    }
/* 18 */            AbstractC2298vl abstractC2298vl = (AbstractC2298vl) obj;
/* 20 */            Charset charset = ez0.f7923a;
/* 26 */            if (abstractC2298vl.size() == 0) {
/* 28 */                str = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
/* 32 */                C2222tl c2222tl = (C2222tl) abstractC2298vl;
/* 46 */                str = new String(c2222tl.f17140d, c2222tl.mo8196f(), c2222tl.size(), charset);
                    }
/* 50 */            C2222tl c2222tl2 = (C2222tl) abstractC2298vl;
/* 52 */            int iMo8196f = c2222tl2.mo8196f();
/* 69 */            if (m13.f13547a.m4449t(c2222tl2.f17140d, iMo8196f, c2222tl2.size() + iMo8196f)) {
/* 71 */                arrayList.set(i, str);
                    }
/* 74 */            return str;
                }

                @Override // p000.u51
                /* JADX INFO: renamed from: j1 */
                public final Object mo8698j1(int i) {
/* 3 */             return this.f16924b.get(i);
                }

                @Override // p000.AbstractC0827d0, java.util.AbstractList, java.util.List
                public final Object remove(int i) {
/* 1 */             m2903a();
/* 6 */             Object objRemove = this.f16924b.remove(i);
/* 14 */            ((AbstractList) this).modCount++;
/* 18 */            if (objRemove instanceof String) {
/* 20 */                return (String) objRemove;
                    }
/* 25 */            if (!(objRemove instanceof AbstractC2298vl)) {
/* 64 */                return new String((byte[]) objRemove, ez0.f7923a);
                    }
/* 27 */            AbstractC2298vl abstractC2298vl = (AbstractC2298vl) objRemove;
/* 29 */            Charset charset = ez0.f7923a;
/* 35 */            if (abstractC2298vl.size() == 0) {
/* 37 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 40 */            C2222tl c2222tl = (C2222tl) abstractC2298vl;
/* 54 */            return new String(c2222tl.f17140d, c2222tl.mo8196f(), c2222tl.size(), charset);
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object set(int i, Object obj) {
/* 3 */             m2903a();
/* 8 */             Object obj2 = this.f16924b.set(i, (String) obj);
/* 14 */            if (obj2 instanceof String) {
/* 16 */                return (String) obj2;
                    }
/* 21 */            if (!(obj2 instanceof AbstractC2298vl)) {
/* 60 */                return new String((byte[]) obj2, ez0.f7923a);
                    }
/* 23 */            AbstractC2298vl abstractC2298vl = (AbstractC2298vl) obj2;
/* 25 */            Charset charset = ez0.f7923a;
/* 31 */            if (abstractC2298vl.size() == 0) {
/* 33 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 36 */            C2222tl c2222tl = (C2222tl) abstractC2298vl;
/* 50 */            return new String(c2222tl.f17140d, c2222tl.mo8196f(), c2222tl.size(), charset);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 3 */             return this.f16924b.size();
                }

                @Override // p000.cz0
                /* JADX INFO: renamed from: x */
                public final cz0 mo2899x(int i) {
/* 1 */             ArrayList arrayList = this.f16924b;
/* 7 */             if (i < arrayList.size()) {
/* 23 */                f42.m3649e();
/* 26 */                return null;
                    }
/* 11 */            ArrayList arrayList2 = new ArrayList(i);
/* 14 */            arrayList2.addAll(arrayList);
/* 19 */            return new t51(arrayList2);
                }

/* 9 */         public t51(ArrayList arrayList) {
/* 11 */            this.f16924b = arrayList;
                }

                @Override // p000.AbstractC0827d0, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 26 */        public final boolean addAll(Collection collection) {
/* 28 */            return addAll(this.f16924b.size(), collection);
                }
            }
