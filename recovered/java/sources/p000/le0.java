            package p000;

            import java.io.InvalidObjectException;
            import java.io.ObjectInputStream;
            import java.io.Serializable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class le0 extends AbstractC2237u implements ke0, Serializable {

                /* JADX INFO: renamed from: a */
                public final Enum[] f13205a;

                public le0(Enum[] enumArr) {
/* 1 */             enumArr.getClass();
/* 7 */             this.f13205a = enumArr;
                }

                private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
/* 8 */             throw new InvalidObjectException("Deserialization is supported via proxy only");
                }

                private final Object writeReplace() {
/* 5 */             return new ne0(this.f13205a);
                }

                @Override // p000.AbstractC0936g, java.util.Collection
                public final boolean contains(Object obj) {
/* 3 */             if (!(obj instanceof Enum)) {
/* 30 */                return false;
                    }
/* 6 */             Enum r3 = (Enum) obj;
/* 8 */             int iOrdinal = r3.ordinal();
/* 12 */            Enum[] enumArr = this.f13205a;
/* 14 */            enumArr.getClass();
                    return ((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r3;
                }

                @Override // java.util.List
                public final Object get(int i) {
/* 1 */             C2089q c2089q = AbstractC2237u.Companion;
/* 3 */             Enum[] enumArr = this.f13205a;
/* 5 */             int length = enumArr.length;
/* 6 */             c2089q.getClass();
/* 9 */             C2089q.m7638a(i, length);
/* 12 */            return enumArr[i];
                }

                @Override // p000.AbstractC0936g
                public final int getSize() {
/* 3 */             return this.f13205a.length;
                }

                @Override // p000.AbstractC2237u, java.util.List
                public final int indexOf(Object obj) {
/* 4 */             if (!(obj instanceof Enum)) {
/* 3 */                 return -1;
                    }
/* 7 */             Enum r4 = (Enum) obj;
/* 9 */             int iOrdinal = r4.ordinal();
/* 13 */            Enum[] enumArr = this.f13205a;
/* 15 */            enumArr.getClass();
/* 27 */            if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r4) {
/* 29 */                return iOrdinal;
                    }
/* 3 */             return -1;
                }

                @Override // p000.AbstractC2237u, java.util.List
                public final int lastIndexOf(Object obj) {
/* 4 */             if (!(obj instanceof Enum)) {
/* 3 */                 return -1;
                    }
/* 7 */             Enum r4 = (Enum) obj;
/* 9 */             int iOrdinal = r4.ordinal();
/* 13 */            Enum[] enumArr = this.f13205a;
/* 15 */            enumArr.getClass();
/* 27 */            if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r4) {
/* 29 */                return iOrdinal;
                    }
/* 3 */             return -1;
                }
            }
