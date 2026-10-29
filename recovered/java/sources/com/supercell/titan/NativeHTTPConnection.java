            package com.supercell.titan;

            import android.os.Handler;
            import android.os.Message;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.config.AbstractC1417a;
            import java.io.BufferedInputStream;
            import java.io.BufferedOutputStream;
            import java.io.ByteArrayOutputStream;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.net.HttpURLConnection;
            import java.net.URL;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.util.Map;
            import okhttp3.HttpUrl;
            import okio.Segment;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 22 */    public class NativeHTTPConnection implements Runnable {

                /* JADX INFO: renamed from: U */
                public final String f5837U;

                /* JADX INFO: renamed from: V */
                public int f5838V;

                /* JADX INFO: renamed from: a */
                public String f5839a;

                /* JADX INFO: renamed from: b */
                public String f5840b;

                /* JADX INFO: renamed from: c */
                public final String f5841c;

                /* JADX INFO: renamed from: d */
                public Method f5842d;

                /* JADX INFO: renamed from: e */
                public final Handler f5843e;

                /* JADX INFO: renamed from: f */
                public byte[] f5844f;

                /* JADX INFO: renamed from: i */
                public Status f5845i;
                public int tag;

                /* JADX INFO: renamed from: v */
                public byte[] f5846v;

                /* JADX INFO: renamed from: w */
                public Map f5847w;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class Method {
                    public static final Method GET;
                    public static final Method POST;

                    /* JADX INFO: renamed from: a */
                    public static final /* synthetic */ Method[] f5848a;

                    static {
/* 6 */                 Method method = new Method("GET", 0);
/* 9 */                 GET = method;
/* 16 */                Method method2 = new Method("POST", 1);
/* 19 */                POST = method2;
/* 25 */                f5848a = new Method[]{method, method2};
                    }

                    public static Method valueOf(String str) {
/* 7 */                 return (Method) Enum.valueOf(Method.class, str);
                    }

                    public static Method[] values() {
/* 7 */                 return (Method[]) f5848a.clone();
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum Status {
                    UNDEFINED(-1),
                    IDLE(0),
                    ACTIVE(1),
                    OK(2),
                    FAILED(3);


                    /* JADX INFO: renamed from: a */
                    public final int f5851a;

                    Status(int i) {
/* 4 */                 this.f5851a = i;
                    }

                    public int getCode() {
/* 1 */                 return this.f5851a;
                    }
                }

                public NativeHTTPConnection(Handler handler, String str, String str2) {
/* 6 */             this.f5839a = HttpUrl.FRAGMENT_ENCODE_SET;
/* 8 */             this.f5840b = HttpUrl.FRAGMENT_ENCODE_SET;
/* 12 */            this.f5845i = Status.IDLE;
/* 15 */            this.f5847w = null;
/* 17 */            this.f5843e = handler;
/* 19 */            this.f5841c = str;
/* 21 */            this.f5837U = str2;
                }

                /* JADX INFO: renamed from: a */
                public static boolean m2736a(File file, File file2) {
                    try {
/* 7 */                 FileInputStream fileInputStreamM5164b = AbstractC1417a.m5164b(file, new FileInputStream(file));
/* 16 */                FileOutputStream fileOutputStreamM5167e = AbstractC1417a.m5167e(new FileOutputStream(file2), file2);
/* 22 */                byte[] bArr = new byte[Segment.SHARE_MINIMUM];
                        while (true) {
/* 24 */                    int i = fileInputStreamM5164b.read(bArr);
/* 28 */                    if (i <= 0) {
/* 36 */                        fileInputStreamM5164b.close();
/* 39 */                        fileOutputStreamM5167e.close();
/* 42 */                        return true;
                            }
/* 30 */                    fileOutputStreamM5167e.write(bArr, 0, i);
                        }
                    } catch (Exception e) {
/* 48 */                AbstractC1245n0.m4877e("NativeHTTPConnection", "NativeHTTPConnection.copyFile", e);
/* 51 */                file2.delete();
/* 1 */                 return false;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static HttpURLConnection m2737b(String str) {
/* 10 */            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
/* 14 */            httpURLConnection.setConnectTimeout(15000);
/* 21 */            httpURLConnection.setRequestProperty("charset", "utf-8");
/* 28 */            httpURLConnection.setRequestProperty("Connection", "close");
/* 31 */            return httpURLConnection;
                }

                public static HttpURLConnection createConnectionForPost(String str) throws IOException {
/* 1 */             HttpURLConnection httpURLConnectionM2737b = m2737b(str);
/* 6 */             httpURLConnectionM2737b.setDoOutput(true);
/* 9 */             httpURLConnectionM2737b.setDoInput(true);
/* 14 */            httpURLConnectionM2737b.setRequestMethod("POST");
/* 21 */            httpURLConnectionM2737b.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
/* 24 */            return httpURLConnectionM2737b;
                }

                /* JADX INFO: renamed from: e */
                public static byte[] m2738e(BufferedInputStream bufferedInputStream) throws IOException {
/* 4 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 9 */             byte[] bArr = new byte[Segment.SHARE_MINIMUM];
                    while (true) {
/* 11 */                int i = bufferedInputStream.read(bArr, 0, Segment.SHARE_MINIMUM);
/* 16 */                if (i == -1) {
/* 22 */                    return byteArrayOutputStream.toByteArray();
                        }
/* 18 */                byteArrayOutputStream.write(bArr, 0, i);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:20:0x0077 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:17:0x0062, B:18:0x006f, B:20:0x0077, B:22:0x007c), top: B:66:0x0062, outer: #1 }] */
                /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
                /* JADX WARN: Code duplicated, block: B:46:0x00f0 A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:3:0x000a, B:5:0x002b, B:8:0x0036, B:11:0x003d, B:16:0x004c, B:26:0x0083, B:30:0x0093, B:32:0x0099, B:35:0x00a4, B:37:0x00af, B:38:0x00ca, B:41:0x00d5, B:46:0x00f0, B:48:0x00fb, B:51:0x010b, B:55:0x0119, B:57:0x011f, B:43:0x00e2, B:62:0x012e, B:63:0x0131, B:14:0x0048, B:17:0x0062, B:18:0x006f, B:20:0x0077, B:22:0x007c), top: B:68:0x000a, inners: #0, #2, #3 }] */
                /* JADX WARN: Code duplicated, block: B:48:0x00fb A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:3:0x000a, B:5:0x002b, B:8:0x0036, B:11:0x003d, B:16:0x004c, B:26:0x0083, B:30:0x0093, B:32:0x0099, B:35:0x00a4, B:37:0x00af, B:38:0x00ca, B:41:0x00d5, B:46:0x00f0, B:48:0x00fb, B:51:0x010b, B:55:0x0119, B:57:0x011f, B:43:0x00e2, B:62:0x012e, B:63:0x0131, B:14:0x0048, B:17:0x0062, B:18:0x006f, B:20:0x0077, B:22:0x007c), top: B:68:0x000a, inners: #0, #2, #3 }] */
                /* JADX WARN: Code duplicated, block: B:51:0x010b A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:3:0x000a, B:5:0x002b, B:8:0x0036, B:11:0x003d, B:16:0x004c, B:26:0x0083, B:30:0x0093, B:32:0x0099, B:35:0x00a4, B:37:0x00af, B:38:0x00ca, B:41:0x00d5, B:46:0x00f0, B:48:0x00fb, B:51:0x010b, B:55:0x0119, B:57:0x011f, B:43:0x00e2, B:62:0x012e, B:63:0x0131, B:14:0x0048, B:17:0x0062, B:18:0x006f, B:20:0x0077, B:22:0x007c), top: B:68:0x000a, inners: #0, #2, #3 }] */
                /* JADX WARN: Code duplicated, block: B:52:0x0114  */
                /* JADX WARN: Code duplicated, block: B:72:0x0083 A[EDGE_INSN: B:72:0x0083->B:26:0x0083 BREAK  A[LOOP:0: B:18:0x006f->B:74:0x006f], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:73:0x007c A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:75:0x006f A[SYNTHETIC] */
                /* JADX INFO: renamed from: c */
                public final boolean m2739c() {
                    MessageDigest messageDigest;
                    File fileCreateTempFile;
                    byte[] bArr;
                    boolean z;
                    int i;
                    boolean z2;
                    File file;
/* 1 */             String str = this.f5841c;
/* 3 */             String str2 = this.f5837U;
/* 7 */             HttpURLConnection httpURLConnectionM2737b = m2737b(this.f5839a);
                    try {
/* 13 */                httpURLConnectionM2737b.setRequestMethod("GET");
/* 16 */                boolean z3 = true;
/* 17 */                httpURLConnectionM2737b.setDoInput(true);
/* 26 */                BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnectionM2737b.getInputStream());
/* 33 */                this.f5838V = httpURLConnectionM2737b.getResponseCode();
/* 39 */                if (str2.isEmpty()) {
/* 45 */                    this.f5846v = m2738e(bufferedInputStream);
                        } else {
/* 56 */                    FileOutputStream fileOutputStreamM5167e = null;
/* 57 */                    if (str.isEmpty()) {
/* 70 */                        messageDigest = null;
/* 83 */                        fileCreateTempFile = File.createTempFile("download", ".tmp", GameApp.getInstance().getCacheDir());
/* 92 */                        fileOutputStreamM5167e = AbstractC1417a.m5167e(new FileOutputStream(fileCreateTempFile), fileCreateTempFile);
/* 98 */                        bArr = new byte[Segment.SHARE_MINIMUM];
                                while (true) {
/* 100 */                           z = false;
/* 101 */                           i = bufferedInputStream.read(bArr, 0, Segment.SHARE_MINIMUM);
/* 106 */                           if (i != -1) {
                                        break;
                                        break;
                                    }
/* 108 */                           fileOutputStreamM5167e.write(bArr, 0, i);
/* 111 */                           if (messageDigest != null) {
/* 113 */                               messageDigest.update(bArr, 0, i);
                                    }
/* 271 */                           httpURLConnectionM2737b.disconnect();
/* 274 */                           throw th;
                                }
/* 120 */                       fileOutputStreamM5167e.close();
/* 129 */                       if (str.isEmpty()) {
/* 211 */                           z2 = true;
                                } else {
/* 211 */                           z2 = true;
                                }
/* 212 */                       if (z2) {
/* 216 */                           file = new File(str2);
/* 223 */                           if (fileCreateTempFile.renameTo(file)) {
/* 244 */                               z3 = false;
                                    } else {
/* 227 */                               AbstractC1245n0.m4876d("NativeHTTPConnection", "NativeHTTPConnection.doGet Couldn't rename temp file");
/* 234 */                               if (m2736a(fileCreateTempFile, file)) {
/* 240 */                                   AbstractC1245n0.m4876d("NativeHTTPConnection", "NativeHTTPConnection.doGet Couldn't 'rename' the file by copying it either");
                                        }
/* 246 */                               z2 = z;
                                    }
/* 236 */                           z = z2;
/* 246 */                           z2 = z;
                                }
/* 247 */                       if (z3) {
/* 257 */                           AbstractC1245n0.m4889q("NativeHTTPConnection", "NativeHTTPConnection.doGet Was unable to delete temp file");
                                }
/* 260 */                       z3 = z2;
                            } else {
                                try {
                                    try {
/* 61 */                                messageDigest = MessageDigest.getInstance("SHA-1");
                                        while (true) {
/* 100 */                                   z = false;
/* 101 */                                   i = bufferedInputStream.read(bArr, 0, Segment.SHARE_MINIMUM);
/* 106 */                                   if (i != -1) {
                                                break;
                                            }
/* 108 */                                   fileOutputStreamM5167e.write(bArr, 0, i);
/* 111 */                                   if (messageDigest != null) {
/* 113 */                                       messageDigest.update(bArr, 0, i);
                                            }
/* 271 */                                   httpURLConnectionM2737b.disconnect();
/* 274 */                                   throw th;
                                        }
                                    } catch (NoSuchAlgorithmException e) {
/* 67 */                                GameApp.debuggerException(e);
/* 70 */                                messageDigest = null;
                                    }
/* 92 */                            fileOutputStreamM5167e = AbstractC1417a.m5167e(new FileOutputStream(fileCreateTempFile), fileCreateTempFile);
/* 98 */                            bArr = new byte[Segment.SHARE_MINIMUM];
/* 120 */                           fileOutputStreamM5167e.close();
/* 129 */                           if (str.isEmpty() || messageDigest == null) {
/* 211 */                               z2 = true;
                                    } else {
                                        try {
/* 133 */                                   byte[] bArrDigest = messageDigest.digest();
/* 137 */                                   if (bArrDigest == null) {
/* 141 */                                       AbstractC1245n0.m4876d("NativeHTTPConnection", "NativeHTTPConnection.doGet error creating SHA1");
                                            } else {
/* 151 */                                       StringBuilder sb = new StringBuilder(40);
/* 156 */                                       for (byte b : bArrDigest) {
/* 176 */                                           sb.append(String.format("%02x", Integer.valueOf(b & 255)));
                                                }
/* 190 */                                       if (!sb.toString().equalsIgnoreCase(str)) {
/* 195 */                                           AbstractC1245n0.m4876d("NativeHTTPConnection", "NativeHTTPConnection.doGet sha1 hashes of file don't match:");
/* 198 */                                           AbstractC1245n0.m4876d("NativeHTTPConnection", str2);
/* 201 */                                           z2 = false;
                                                }
                                            }
                                        } catch (Exception e2) {
/* 205 */                                   AbstractC1245n0.m4877e("NativeHTTPConnection", "NativeHTTPConnection.doGet Problem getting file hash", e2);
/* 208 */                                   GameApp.debuggerException(e2);
                                        }
/* 211 */                               z2 = true;
                                    }
/* 212 */                           if (z2) {
/* 216 */                               file = new File(str2);
/* 223 */                               if (fileCreateTempFile.renameTo(file)) {
/* 227 */                                   AbstractC1245n0.m4876d("NativeHTTPConnection", "NativeHTTPConnection.doGet Couldn't rename temp file");
/* 234 */                                   if (m2736a(fileCreateTempFile, file)) {
/* 240 */                                       AbstractC1245n0.m4876d("NativeHTTPConnection", "NativeHTTPConnection.doGet Couldn't 'rename' the file by copying it either");
                                            }
/* 246 */                                   z2 = z;
                                        } else {
/* 244 */                                   z3 = false;
                                        }
/* 236 */                               z = z2;
/* 246 */                               z2 = z;
                                    }
/* 247 */                           if (z3 && !fileCreateTempFile.delete()) {
/* 257 */                               AbstractC1245n0.m4889q("NativeHTTPConnection", "NativeHTTPConnection.doGet Was unable to delete temp file");
                                    }
/* 260 */                           z3 = z2;
                                } catch (Throwable th) {
/* 265 */                           if (fileOutputStreamM5167e != null) {
/* 267 */                               fileOutputStreamM5167e.close();
                                    }
/* 270 */                           throw th;
                                }
/* 83 */                        fileCreateTempFile = File.createTempFile("download", ".tmp", GameApp.getInstance().getCacheDir());
                            }
                        }
/* 261 */               httpURLConnectionM2737b.disconnect();
/* 264 */               return z3;
                    } catch (Throwable th2) {
/* 271 */               httpURLConnectionM2737b.disconnect();
/* 274 */               throw th2;
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m2740d() throws IOException {
/* 3 */             HttpURLConnection httpURLConnectionCreateConnectionForPost = createConnectionForPost(this.f5839a);
                    try {
/* 11 */                httpURLConnectionCreateConnectionForPost.setRequestProperty("X-timestamp", this.f5840b);
/* 17 */                httpURLConnectionCreateConnectionForPost.setFixedLengthStreamingMode(this.f5844f.length);
/* 20 */                Map map = this.f5847w;
/* 22 */                if (map != null && !map.isEmpty()) {
/* 44 */                    for (String str : this.f5847w.keySet()) {
/* 60 */                        httpURLConnectionCreateConnectionForPost.setRequestProperty(str, (String) this.f5847w.get(str));
                            }
                        }
/* 72 */                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnectionCreateConnectionForPost.getOutputStream());
/* 77 */                bufferedOutputStream.write(this.f5844f);
/* 80 */                bufferedOutputStream.close();
/* 89 */                BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnectionCreateConnectionForPost.getInputStream());
/* 96 */                this.f5846v = m2738e(bufferedInputStream);
/* 98 */                bufferedInputStream.close();
/* 105 */               this.f5838V = httpURLConnectionCreateConnectionForPost.getResponseCode();
                    } finally {
/* 111 */               httpURLConnectionCreateConnectionForPost.disconnect();
                    }
                }

                public String getExpectedSha1() {
/* 1 */             return this.f5841c;
                }

                public Method getMethod() {
/* 1 */             return this.f5842d;
                }

                public byte[] getReceivedData() {
/* 1 */             return this.f5846v;
                }

                public int getResponseCode() {
/* 1 */             return this.f5838V;
                }

                public Status getStatus() {
/* 1 */             return this.f5845i;
                }

                public void prepareGet(String str, String str2) {
/* 3 */             this.f5842d = Method.GET;
/* 5 */             this.f5839a = str;
/* 8 */             this.f5844f = null;
/* 10 */            this.f5840b = str2;
                }

                public void preparePost(String str, byte[] bArr, String str2, Map<String, String> map) {
/* 3 */             this.f5842d = Method.POST;
/* 5 */             this.f5839a = str;
/* 7 */             this.f5844f = bArr;
/* 9 */             this.f5840b = str2;
/* 11 */            if (map == null || map.size() <= 0) {
/* 20 */                map = null;
                    }
/* 21 */            this.f5847w = map;
                }

                @Override // java.lang.Runnable
                public void run() {
                    boolean zM2739c;
/* 3 */             this.f5845i = Status.ACTIVE;
/* 5 */             Method method = this.f5842d;
/* 11 */            if (method == Method.GET) {
                        try {
/* 13 */                    zM2739c = m2739c();
                        } catch (IOException e) {
/* 19 */                    GameApp.debuggerException(e);
/* 22 */                    zM2739c = false;
                        }
/* 23 */                if (zM2739c) {
/* 27 */                    this.f5845i = Status.OK;
                        } else {
/* 32 */                    this.f5845i = Status.FAILED;
/* 36 */                    AbstractC1245n0.m4889q("NativeHTTPConnection", "NativeHTTPConnection.run get/download FAIL");
                        }
                    } else if (method == Method.POST) {
                        try {
/* 44 */                    m2740d();
/* 49 */                    this.f5845i = Status.OK;
                        } catch (IOException e2) {
/* 55 */                    AbstractC1245n0.m4891s("NativeHTTPConnection", "NativeHTTPConnection.run POST IOException", e2);
/* 60 */                    this.f5845i = Status.FAILED;
/* 64 */                    AbstractC1245n0.m4889q("NativeHTTPConnection", "NativeHTTPConnection.run POST FAIL");
                        }
                    } else {
/* 70 */                this.f5845i = Status.FAILED;
                    }
/* 74 */            Message message = new Message();
/* 77 */            message.obj = this;
/* 81 */            this.f5843e.sendMessage(message);
                }

/* 23 */        public NativeHTTPConnection() {
/* 24 */            this(new Handler(), HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
                }
            }
