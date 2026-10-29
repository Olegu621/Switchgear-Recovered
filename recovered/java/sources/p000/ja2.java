            package p000;

            import java.io.Externalizable;
            import java.io.IOException;
            import java.io.ObjectInput;
            import java.io.ObjectOutput;
            import java.util.Collection;
            import java.util.Iterator;
            import kotlin.collections.C1839a;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 10 */    public final class ja2 implements Externalizable {

                /* JADX INFO: renamed from: c */
                public static final ia2 f12161c = new ia2(null);

                /* JADX INFO: renamed from: a */
                public Collection f12162a;

                /* JADX INFO: renamed from: b */
                public final int f12163b;

                public ja2(int i, Collection collection) {
/* 1 */             collection.getClass();
/* 7 */             this.f12162a = collection;
/* 9 */             this.f12163b = i;
                }

                private final Object readResolve() {
/* 1 */             return this.f12162a;
                }

                @Override // java.io.Externalizable
                public final void readExternal(ObjectInput objectInput) throws IOException {
                    Collection collectionM6209a;
/* 1 */             objectInput.getClass();
/* 4 */             byte b = objectInput.readByte();
/* 8 */             int i = b & 1;
/* 12 */            if ((b & (-2)) != 0) {
/* 106 */               f42.m3651g(b, "Unsupported flags value: ");
/* 109 */               return;
                    }
/* 14 */            int i2 = objectInput.readInt();
/* 18 */            if (i2 < 0) {
/* 100 */               f42.m3651g(i2, "Illegal size value: ");
/* 103 */               return;
                    }
/* 20 */            int i3 = 0;
/* 21 */            if (i == 0) {
/* 76 */                z71 z71Var = new z71(i2);
/* 79 */                while (i3 < i2) {
/* 85 */                    z71Var.add(objectInput.readObject());
/* 88 */                    i3++;
                        }
/* 91 */                collectionM6209a = C1839a.m6209a(z71Var);
                    } else {
/* 24 */                if (i != 1) {
/* 70 */                    f42.m3651g(i, "Unsupported collection type tag: ");
/* 73 */                    return;
                        }
/* 28 */                pb2 pb2Var = new pb2(i2);
/* 31 */                while (i3 < i2) {
/* 37 */                    pb2Var.add(objectInput.readObject());
/* 40 */                    i3++;
                        }
/* 43 */                sb1 sb1Var = pb2Var.f15055a;
/* 45 */                sb1Var.m8462b();
/* 48 */                sb1Var.f16496X = true;
/* 52 */                if (sb1Var.f16505w <= 0) {
/* 57 */                    sb1.f16492Z.getClass();
                        }
                        collectionM6209a = pb2Var;
/* 62 */                if (sb1Var.f16505w <= 0) {
/* 65 */                    collectionM6209a = pb2.f15054c;
                        }
                    }
/* 95 */            this.f12162a = collectionM6209a;
                }

                @Override // java.io.Externalizable
                public final void writeExternal(ObjectOutput objectOutput) throws IOException {
/* 1 */             objectOutput.getClass();
/* 6 */             objectOutput.writeByte(this.f12163b);
/* 15 */            objectOutput.writeInt(this.f12162a.size());
/* 20 */            Iterator it = this.f12162a.iterator();
/* 28 */            while (it.hasNext()) {
/* 34 */                objectOutput.writeObject(it.next());
                    }
                }

/* 11 */        public ja2() {
/* 13 */            this(0, nd0.f14189a);
                }
            }
