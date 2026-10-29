            package p000;

            import java.io.Externalizable;
            import java.io.IOException;
            import java.io.InvalidObjectException;
            import java.io.ObjectInput;
            import java.io.ObjectOutput;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class la2 implements Externalizable {

                /* JADX INFO: renamed from: b */
                public static final ka2 f13162b = new ka2(null);

                /* JADX INFO: renamed from: a */
                public Map f13163a;

                public la2() {
/* 1 */             od0 od0Var = od0.f14715a;
/* 3 */             od0Var.getClass();
/* 9 */             this.f13163a = od0Var;
                }

                private final Object readResolve() {
/* 1 */             return this.f13163a;
                }

                @Override // java.io.Externalizable
                public final void readExternal(ObjectInput objectInput) throws IOException {
/* 1 */             objectInput.getClass();
/* 4 */             byte b = objectInput.readByte();
/* 8 */             if (b != 0) {
/* 74 */                throw new InvalidObjectException(fm0.m3781g(b, "Unsupported flags value: "));
                    }
/* 10 */            int i = objectInput.readInt();
/* 14 */            if (i < 0) {
/* 59 */                f42.m3651g(i, "Illegal size value: ");
/* 62 */                return;
                    }
/* 18 */            sb1 sb1Var = new sb1(i);
/* 22 */            for (int i2 = 0; i2 < i; i2++) {
/* 32 */                sb1Var.put(objectInput.readObject(), objectInput.readObject());
                    }
/* 38 */            sb1Var.m8462b();
/* 42 */            sb1Var.f16496X = true;
/* 46 */            if (sb1Var.f16505w <= 0) {
/* 49 */                sb1Var = sb1.f16492Z;
/* 51 */                sb1Var.getClass();
                    }
/* 54 */            this.f13163a = sb1Var;
                }

                @Override // java.io.Externalizable
                public final void writeExternal(ObjectOutput objectOutput) throws IOException {
/* 1 */             objectOutput.getClass();
/* 5 */             objectOutput.writeByte(0);
/* 14 */            objectOutput.writeInt(this.f13163a.size());
/* 31 */            for (Map.Entry entry : this.f13163a.entrySet()) {
/* 43 */                objectOutput.writeObject(entry.getKey());
/* 50 */                objectOutput.writeObject(entry.getValue());
                    }
                }
            }
