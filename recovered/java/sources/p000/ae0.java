            package p000;

            import android.content.SharedPreferences;
            import android.util.Pair;
            import java.io.UnsupportedEncodingException;
            import java.nio.ByteBuffer;
            import java.nio.charset.StandardCharsets;
            import java.security.GeneralSecurityException;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Set;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ae0 implements SharedPreferences.Editor {

                /* JADX INFO: renamed from: a */
                public final be0 f196a;

                /* JADX INFO: renamed from: b */
                public final SharedPreferences.Editor f197b;

                /* JADX INFO: renamed from: d */
                public final AtomicBoolean f199d = new AtomicBoolean(false);

                /* JADX INFO: renamed from: c */
                public final CopyOnWriteArrayList f198c = new CopyOnWriteArrayList();

                public ae0(be0 be0Var, SharedPreferences.Editor editor) {
/* 12 */            this.f196a = be0Var;
/* 14 */            this.f197b = editor;
                }

                /* JADX INFO: renamed from: a */
                public final void m207a() {
/* 8 */             if (this.f199d.getAndSet(false)) {
/* 10 */                be0 be0Var = this.f196a;
/* 30 */                for (String str : ((HashMap) be0Var.getAll()).keySet()) {
/* 44 */                    if (!this.f198c.contains(str) && !be0.m1342d(str)) {
/* 58 */                        this.f197b.remove(be0Var.m1343b(str));
                            }
                        }
                    }
                }

                @Override // android.content.SharedPreferences.Editor
                public final void apply() {
/* 1 */             m207a();
/* 6 */             this.f197b.apply();
/* 9 */             m208b();
/* 14 */            this.f198c.clear();
                }

                /* JADX INFO: renamed from: b */
                public final void m208b() {
/* 1 */             be0 be0Var = this.f196a;
/* 13 */            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : be0Var.f2385b) {
/* 23 */                Iterator it = this.f198c.iterator();
/* 31 */                while (it.hasNext()) {
/* 39 */                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(be0Var, (String) it.next());
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m209c(String str, byte[] bArr) {
/* 1 */             be0 be0Var = this.f196a;
/* 3 */             be0Var.getClass();
/* 10 */            if (be0.m1342d(str)) {
/* 97 */                throw new SecurityException(fm0.m3783i(str, " is a reserved key for the encryption keyset."));
                    }
/* 14 */            this.f198c.add(str);
/* 17 */            if (str == null) {
/* 19 */                str = "__NULL__";
                    }
                    try {
/* 21 */                String strM1343b = be0Var.m1343b(str);
                        try {
/* 50 */                    Pair pair = new Pair(strM1343b, new String(AbstractC2368xh.m9794b(be0Var.f2387d.mo1524a(bArr, strM1343b.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
/* 63 */                    this.f197b.putString((String) pair.first, (String) pair.second);
                        } catch (UnsupportedEncodingException e) {
/* 75 */                    throw new AssertionError(e);
                        }
                    } catch (GeneralSecurityException e2) {
/* 82 */                s80.m8428i("Could not encrypt data: ", e2.getMessage(), e2);
                    }
                }

                @Override // android.content.SharedPreferences.Editor
                public final SharedPreferences.Editor clear() {
/* 4 */             this.f199d.set(true);
/* 7 */             return this;
                }

                @Override // android.content.SharedPreferences.Editor
                public final boolean commit() {
/* 1 */             CopyOnWriteArrayList copyOnWriteArrayList = this.f198c;
/* 3 */             m207a();
                    try {
/* 8 */                 return this.f197b.commit();
                    } finally {
/* 20 */                m208b();
/* 23 */                copyOnWriteArrayList.clear();
                    }
                }

                @Override // android.content.SharedPreferences.Editor
                public final SharedPreferences.Editor putBoolean(String str, boolean z) {
/* 2 */             ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
/* 6 */             byteBufferAllocate.putInt(5);
/* 9 */             byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
/* 16 */            m209c(str, byteBufferAllocate.array());
/* 19 */            return this;
                }

                @Override // android.content.SharedPreferences.Editor
                public final SharedPreferences.Editor putFloat(String str, float f) {
/* 3 */             ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
/* 8 */             byteBufferAllocate.putInt(4);
/* 11 */            byteBufferAllocate.putFloat(f);
/* 18 */            m209c(str, byteBufferAllocate.array());
/* 21 */            return this;
                }

                @Override // android.content.SharedPreferences.Editor
                public final SharedPreferences.Editor putInt(String str, int i) {
/* 3 */             ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
/* 8 */             byteBufferAllocate.putInt(2);
/* 11 */            byteBufferAllocate.putInt(i);
/* 18 */            m209c(str, byteBufferAllocate.array());
/* 21 */            return this;
                }

                @Override // android.content.SharedPreferences.Editor
                public final SharedPreferences.Editor putLong(String str, long j) {
/* 3 */             ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
/* 8 */             byteBufferAllocate.putInt(3);
/* 11 */            byteBufferAllocate.putLong(j);
/* 18 */            m209c(str, byteBufferAllocate.array());
/* 21 */            return this;
                }

                @Override // android.content.SharedPreferences.Editor
                public final SharedPreferences.Editor putString(String str, String str2) {
/* 1 */             if (str2 == null) {
/* 3 */                 str2 = "__NULL__";
                    }
/* 7 */             byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
/* 11 */            int length = bytes.length;
/* 14 */            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
/* 19 */            byteBufferAllocate.putInt(0);
/* 22 */            byteBufferAllocate.putInt(length);
/* 25 */            byteBufferAllocate.put(bytes);
/* 32 */            m209c(str, byteBufferAllocate.array());
/* 35 */            return this;
                }

                @Override // android.content.SharedPreferences.Editor
                public final SharedPreferences.Editor putStringSet(String str, Set set) {
/* 1 */             if (set == null) {
/* 6 */                 set = new C1827kd(0);
/* 11 */                set.add("__NULL__");
                    }
/* 20 */            ArrayList<byte[]> arrayList = new ArrayList(set.size());
/* 27 */            int size = set.size() * 4;
/* 29 */            Iterator it = set.iterator();
/* 37 */            while (it.hasNext()) {
/* 47 */                byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
/* 51 */                arrayList.add(bytes);
/* 55 */                size += bytes.length;
                    }
/* 59 */            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
/* 64 */            byteBufferAllocate.putInt(1);
/* 75 */            for (byte[] bArr : arrayList) {
/* 84 */                byteBufferAllocate.putInt(bArr.length);
/* 87 */                byteBufferAllocate.put(bArr);
                    }
/* 95 */            m209c(str, byteBufferAllocate.array());
/* 98 */            return this;
                }

                @Override // android.content.SharedPreferences.Editor
                public final SharedPreferences.Editor remove(String str) {
/* 1 */             be0 be0Var = this.f196a;
/* 3 */             be0Var.getClass();
/* 10 */            if (be0.m1342d(str)) {
/* 38 */                throw new SecurityException(fm0.m3783i(str, " is a reserved key for the encryption keyset."));
                    }
/* 18 */            this.f197b.remove(be0Var.m1343b(str));
/* 23 */            this.f198c.add(str);
/* 26 */            return this;
                }
            }
