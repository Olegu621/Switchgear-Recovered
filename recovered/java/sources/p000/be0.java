            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import java.io.UnsupportedEncodingException;
            import java.nio.ByteBuffer;
            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            import java.security.GeneralSecurityException;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.CopyOnWriteArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class be0 implements SharedPreferences {

                /* JADX INFO: renamed from: a */
                public final SharedPreferences f2384a;

                /* JADX INFO: renamed from: b */
                public final CopyOnWriteArrayList f2385b = new CopyOnWriteArrayList();

                /* JADX INFO: renamed from: c */
                public final String f2386c;

                /* JADX INFO: renamed from: d */
                public final InterfaceC0203c4 f2387d;

                /* JADX INFO: renamed from: e */
                public final a80 f2388e;

                public be0(String str, SharedPreferences sharedPreferences, InterfaceC0203c4 interfaceC0203c4, a80 a80Var) {
/* 4 */             this.f2386c = str;
/* 6 */             this.f2384a = sharedPreferences;
/* 8 */             this.f2387d = interfaceC0203c4;
/* 10 */            this.f2388e = a80Var;
                }

                /* JADX INFO: renamed from: a */
                public static be0 m1341a(Context context, String str, C0204c5 c0204c5) {
                    C0875ec c0875ecM3820q;
                    C0875ec c0875ecM3820q2;
/* 1 */             String str2 = c0204c5.f2720b;
/* 3 */             b80.m1297a();
/* 6 */             AbstractC0831d4.m2919a();
/* 9 */             Context applicationContext = context.getApplicationContext();
/* 15 */            C1773iy c1773iy = new C1773iy();
/* 24 */            c1773iy.f11960f = pg3.m7432k("AES256_SIV");
/* 29 */            if (applicationContext == null) {
/* 163 */               C1951n4.m6859j("need an Android context");
/* 28 */                return null;
                    }
/* 31 */            c1773iy.f11955a = applicationContext;
/* 33 */            c1773iy.f11956b = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
/* 35 */            c1773iy.f11957c = str;
/* 39 */            String strM3507k = AbstractC0886en.m3507k("android-keystore://", str2);
/* 49 */            if (!strM3507k.startsWith("android-keystore://")) {
/* 157 */               C1951n4.m6859j("key URI must start with android-keystore://");
/* 28 */                return null;
                    }
/* 51 */            c1773iy.f11958d = strM3507k;
/* 53 */            d52 d52VarM5611f = c1773iy.m5611f();
                    synchronized (d52VarM5611f) {
/* 62 */                c0875ecM3820q = ((fs0) d52VarM5611f.f7001a).m3820q();
                    }
/* 69 */            C1773iy c1773iy2 = new C1773iy();
/* 78 */            c1773iy2.f11960f = pg3.m7432k("AES256_GCM");
/* 82 */            c1773iy2.f11955a = applicationContext;
/* 84 */            c1773iy2.f11956b = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
/* 86 */            c1773iy2.f11957c = str;
/* 88 */            String strM3507k2 = AbstractC0886en.m3507k("android-keystore://", str2);
/* 98 */            if (!strM3507k2.startsWith("android-keystore://")) {
/* 148 */               C1951n4.m6859j("key URI must start with android-keystore://");
/* 28 */                return null;
                    }
/* 100 */           c1773iy2.f11958d = strM3507k2;
/* 102 */           d52 d52VarM5611f2 = c1773iy2.m5611f();
                    synchronized (d52VarM5611f2) {
/* 111 */               c0875ecM3820q2 = ((fs0) d52VarM5611f2.f7001a).m3820q();
                    }
/* 122 */           a80 a80Var = (a80) c0875ecM3820q.m3398y(a80.class);
/* 139 */           return new be0(str, applicationContext.getSharedPreferences(str, 0), (InterfaceC0203c4) c0875ecM3820q2.m3398y(InterfaceC0203c4.class), a80Var);
                }

                /* JADX INFO: renamed from: d */
                public static boolean m1342d(String str) {
                    return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
                }

                /* JADX INFO: renamed from: b */
                public final String m1343b(String str) {
/* 1 */             if (str == null) {
/* 3 */                 str = "__NULL__";
                    }
                    try {
                        try {
/* 31 */                    return new String(AbstractC2368xh.m9794b(this.f2388e.mo98a(str.getBytes(StandardCharsets.UTF_8), this.f2386c.getBytes())), "US-ASCII");
                        } catch (UnsupportedEncodingException e) {
/* 41 */                    throw new AssertionError(e);
                        }
                    } catch (GeneralSecurityException e2) {
/* 49 */                s80.m8428i("Could not encrypt key. ", e2.getMessage(), e2);
/* 52 */                return null;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final Object m1344c(String str) {
                    int i;
                    String str2;
/* 9 */             if (m1342d(str)) {
/* 308 */               throw new SecurityException(fm0.m3783i(str, " is a reserved key for the encryption keyset."));
                    }
/* 13 */            if (str == null) {
/* 11 */                str = "__NULL__";
                    }
                    try {
/* 17 */                String strM1343b = m1343b(str);
/* 23 */                String string = this.f2384a.getString(strM1343b, null);
/* 27 */                if (string != null) {
/* 31 */                    byte[] bArrM9793a = AbstractC2368xh.m9793a(string);
/* 35 */                    InterfaceC0203c4 interfaceC0203c4 = this.f2387d;
/* 37 */                    Charset charset = StandardCharsets.UTF_8;
/* 47 */                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(interfaceC0203c4.mo1525b(bArrM9793a, strM1343b.getBytes(charset)));
/* 52 */                    byteBufferWrap.position(0);
/* 55 */                    int i2 = byteBufferWrap.getInt();
/* 64 */                    if (i2 == 0) {
/* 88 */                        i = 1;
                            } else if (i2 == 1) {
/* 86 */                        i = 2;
                            } else if (i2 == 2) {
/* 84 */                        i = 3;
                            } else if (i2 == 3) {
/* 82 */                        i = 4;
                            } else if (i2 != 4) {
/* 78 */                        i = i2 != 5 ? 0 : 6;
                            } else {
/* 80 */                        i = 5;
                            }
/* 89 */                    if (i == 0) {
/* 286 */                       throw new SecurityException("Unknown type ID for encrypted pref value: " + i2);
                            }
/* 91 */                    int iM3520y = AbstractC0886en.m3520y(i);
/* 95 */                    if (iM3520y == 0) {
/* 242 */                       int i3 = byteBufferWrap.getInt();
/* 246 */                       ByteBuffer byteBufferSlice = byteBufferWrap.slice();
/* 250 */                       byteBufferWrap.limit(i3);
/* 257 */                       String string2 = charset.decode(byteBufferSlice).toString();
/* 265 */                       if (!string2.equals("__NULL__")) {
/* 268 */                           return string2;
                                }
                            } else {
/* 97 */                        if (iM3520y != 1) {
/* 99 */                            if (iM3520y == 2) {
/* 177 */                               return Integer.valueOf(byteBufferWrap.getInt());
                                    }
/* 101 */                           if (iM3520y == 3) {
/* 168 */                               return Long.valueOf(byteBufferWrap.getLong());
                                    }
/* 103 */                           if (iM3520y == 4) {
/* 159 */                               return Float.valueOf(byteBufferWrap.getFloat());
                                    }
/* 105 */                           if (iM3520y == 5) {
/* 114 */                               return Boolean.valueOf(byteBufferWrap.get() != 0);
                                    }
                                    switch (i) {
                                        case 1:
/* 145 */                                   str2 = "STRING";
                                            break;
                                        case 2:
/* 142 */                                   str2 = "STRING_SET";
                                            break;
                                        case 3:
/* 139 */                                   str2 = "INT";
                                            break;
                                        case 4:
/* 136 */                                   str2 = "LONG";
                                            break;
                                        case 5:
/* 133 */                                   str2 = "FLOAT";
                                            break;
                                        case 6:
/* 130 */                                   str2 = "BOOLEAN";
                                            break;
                                        default:
/* 127 */                                   str2 = "null";
                                            break;
                                    }
/* 154 */                           throw new SecurityException("Unhandled type for encrypted pref value: ".concat(str2));
                                }
/* 184 */                       C1827kd c1827kd = new C1827kd(0);
/* 191 */                       while (byteBufferWrap.hasRemaining()) {
/* 193 */                           int i4 = byteBufferWrap.getInt();
/* 197 */                           ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
/* 201 */                           byteBufferSlice2.limit(i4);
/* 209 */                           byteBufferWrap.position(byteBufferWrap.position() + i4);
/* 222 */                           c1827kd.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                                }
/* 228 */                       if (c1827kd.f12694c != 1 || !"__NULL__".equals(c1827kd.f12693b[0])) {
/* 241 */                           return c1827kd;
                                }
                            }
                        }
/* 16 */                return null;
                    } catch (GeneralSecurityException e) {
/* 293 */               s80.m8428i("Could not decrypt value. ", e.getMessage(), e);
/* 16 */                return null;
                    }
                }

                @Override // android.content.SharedPreferences
                public final boolean contains(String str) {
/* 5 */             if (m1342d(str)) {
/* 29 */                throw new SecurityException(fm0.m3783i(str, " is a reserved key for the encryption keyset."));
                    }
/* 13 */            return this.f2384a.contains(m1343b(str));
                }

                @Override // android.content.SharedPreferences
                public final SharedPreferences.Editor edit() {
/* 9 */             return new ae0(this, this.f2384a.edit());
                }

                @Override // android.content.SharedPreferences
                public final Map getAll() {
/* 3 */             HashMap map = new HashMap();
/* 24 */            for (Map.Entry<String, ?> entry : this.f2384a.getAll().entrySet()) {
/* 42 */                if (!m1342d(entry.getKey())) {
                            try {
/* 71 */                        String str = new String(this.f2388e.mo99b(AbstractC2368xh.m9793a(entry.getKey()), this.f2386c.getBytes()), StandardCharsets.UTF_8);
/* 80 */                        String str2 = str.equals("__NULL__") ? null : str;
/* 88 */                        map.put(str2, m1344c(str2));
                            } catch (GeneralSecurityException e) {
/* 99 */                        s80.m8428i("Could not decrypt key. ", e.getMessage(), e);
/* 50 */                        return null;
                            }
                        }
                    }
/* 103 */           return map;
                }

                @Override // android.content.SharedPreferences
                public final boolean getBoolean(String str, boolean z) {
/* 1 */             Object objM1344c = m1344c(str);
                    return objM1344c instanceof Boolean ? ((Boolean) objM1344c).booleanValue() : z;
                }

                @Override // android.content.SharedPreferences
                public final float getFloat(String str, float f) {
/* 1 */             Object objM1344c = m1344c(str);
                    return objM1344c instanceof Float ? ((Float) objM1344c).floatValue() : f;
                }

                @Override // android.content.SharedPreferences
                public final int getInt(String str, int i) {
/* 1 */             Object objM1344c = m1344c(str);
                    return objM1344c instanceof Integer ? ((Integer) objM1344c).intValue() : i;
                }

                @Override // android.content.SharedPreferences
                public final long getLong(String str, long j) {
/* 1 */             Object objM1344c = m1344c(str);
                    return objM1344c instanceof Long ? ((Long) objM1344c).longValue() : j;
                }

                @Override // android.content.SharedPreferences
                public final String getString(String str, String str2) {
/* 1 */             Object objM1344c = m1344c(str);
                    return objM1344c instanceof String ? (String) objM1344c : str2;
                }

                @Override // android.content.SharedPreferences
                public final Set getStringSet(String str, Set set) {
/* 1 */             Object objM1344c = m1344c(str);
/* 15 */            Set c1827kd = objM1344c instanceof Set ? (Set) objM1344c : new C1827kd(0);
                    return c1827kd.size() > 0 ? c1827kd : set;
                }

                @Override // android.content.SharedPreferences
                public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
/* 3 */             this.f2385b.add(onSharedPreferenceChangeListener);
                }

                @Override // android.content.SharedPreferences
                public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
/* 3 */             this.f2385b.remove(onSharedPreferenceChangeListener);
                }
            }
