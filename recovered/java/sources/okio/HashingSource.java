            package okio;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.IOException;
            import java.security.InvalidKeyException;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import javax.crypto.Mac;
            import javax.crypto.spec.SecretKeySpec;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB\u001f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0002\b\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0015H\u0016R\u0011\u0010\u0010\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m6176d2 = {"Lokio/HashingSource;", "Lokio/ForwardingSource;", "Lokio/Source;", FirebaseAnalytics.Param.SOURCE, "digest", "Ljava/security/MessageDigest;", "(Lokio/Source;Ljava/security/MessageDigest;)V", "algorithm", HttpUrl.FRAGMENT_ENCODE_SET, "(Lokio/Source;Ljava/lang/String;)V", "mac", "Ljavax/crypto/Mac;", "(Lokio/Source;Ljavax/crypto/Mac;)V", "key", "Lokio/ByteString;", "(Lokio/Source;Lokio/ByteString;Ljava/lang/String;)V", "hash", "()Lokio/ByteString;", "messageDigest", "-deprecated_hash", "read", HttpUrl.FRAGMENT_ENCODE_SET, "sink", "Lokio/Buffer;", "byteCount", "Companion", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 2 */     public final class HashingSource extends ForwardingSource implements Source {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final Mac mac;
                private final MessageDigest messageDigest;

                /* JADX WARN: Illegal instructions before constructor call */
                public HashingSource(Source source, ByteString byteString, String str) throws NoSuchAlgorithmException {
/* 1 */             source.getClass();
/* 4 */             byteString.getClass();
/* 7 */             str.getClass();
                    try {
/* 10 */                Mac mac = Mac.getInstance(str);
/* 23 */                mac.init(new SecretKeySpec(byteString.toByteArray(), str));
/* 26 */                this(source, mac);
                    } catch (InvalidKeyException e) {
/* 31 */                C1951n4.m6863n(e);
/* 35 */                throw null;
                    }
                }

                public static final HashingSource hmacSha1(Source source, ByteString byteString) {
/* 3 */             return INSTANCE.hmacSha1(source, byteString);
                }

                public static final HashingSource hmacSha256(Source source, ByteString byteString) {
/* 3 */             return INSTANCE.hmacSha256(source, byteString);
                }

                public static final HashingSource hmacSha512(Source source, ByteString byteString) {
/* 3 */             return INSTANCE.hmacSha512(source, byteString);
                }

                public static final HashingSource md5(Source source) {
/* 3 */             return INSTANCE.md5(source);
                }

                public static final HashingSource sha1(Source source) {
/* 3 */             return INSTANCE.sha1(source);
                }

                public static final HashingSource sha256(Source source) {
/* 3 */             return INSTANCE.sha256(source);
                }

                public static final HashingSource sha512(Source source) {
/* 3 */             return INSTANCE.sha512(source);
                }

                /* JADX INFO: renamed from: -deprecated_hash, reason: not valid java name */
                public final ByteString m10657deprecated_hash() {
/* 1 */             return hash();
                }

                public final ByteString hash() {
                    byte[] bArrDoFinal;
/* 1 */             MessageDigest messageDigest = this.messageDigest;
/* 3 */             if (messageDigest != null) {
/* 5 */                 bArrDoFinal = messageDigest.digest();
                    } else {
/* 10 */                Mac mac = this.mac;
/* 12 */                mac.getClass();
/* 15 */                bArrDoFinal = mac.doFinal();
                    }
/* 21 */            bArrDoFinal.getClass();
/* 24 */            return new ByteString(bArrDoFinal);
                }

                @Override // okio.ForwardingSource, okio.Source
                public long read(Buffer sink, long byteCount) throws IOException {
/* 1 */             sink.getClass();
/* 4 */             long j = super.read(sink, byteCount);
/* 12 */            if (j != -1) {
/* 18 */                long size = sink.size() - j;
/* 19 */                long size2 = sink.size();
/* 23 */                Segment segment = sink.head;
/* 25 */                segment.getClass();
/* 30 */                while (size2 > size) {
/* 32 */                    segment = segment.prev;
/* 34 */                    segment.getClass();
/* 43 */                    size2 -= (long) (segment.limit - segment.pos);
                        }
/* 51 */                while (size2 < sink.size()) {
/* 58 */                    int i = (int) ((((long) segment.pos) + size) - size2);
/* 59 */                    MessageDigest messageDigest = this.messageDigest;
/* 61 */                    if (messageDigest != null) {
/* 68 */                        messageDigest.update(segment.data, i, segment.limit - i);
                            } else {
/* 72 */                        Mac mac = this.mac;
/* 74 */                        mac.getClass();
/* 82 */                        mac.update(segment.data, i, segment.limit - i);
                            }
/* 91 */                    size2 += (long) (segment.limit - segment.pos);
/* 92 */                    segment = segment.next;
/* 94 */                    segment.getClass();
/* 97 */                    size = size2;
                        }
                    }
/* 99 */            return j;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, m6176d2 = {"Lokio/HashingSource$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "hmacSha1", "Lokio/HashingSource;", FirebaseAnalytics.Param.SOURCE, "Lokio/Source;", "key", "Lokio/ByteString;", "hmacSha256", "hmacSha512", "md5", "sha1", "sha256", "sha512", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final HashingSource hmacSha1(Source source, ByteString key) {
/* 1 */                 source.getClass();
/* 4 */                 key.getClass();
/* 11 */                return new HashingSource(source, key, "HmacSHA1");
                    }

                    public final HashingSource hmacSha256(Source source, ByteString key) {
/* 1 */                 source.getClass();
/* 4 */                 key.getClass();
/* 11 */                return new HashingSource(source, key, "HmacSHA256");
                    }

                    public final HashingSource hmacSha512(Source source, ByteString key) {
/* 1 */                 source.getClass();
/* 4 */                 key.getClass();
/* 11 */                return new HashingSource(source, key, "HmacSHA512");
                    }

                    public final HashingSource md5(Source source) {
/* 1 */                 source.getClass();
/* 8 */                 return new HashingSource(source, "MD5");
                    }

                    public final HashingSource sha1(Source source) {
/* 1 */                 source.getClass();
/* 8 */                 return new HashingSource(source, "SHA-1");
                    }

                    public final HashingSource sha256(Source source) {
/* 1 */                 source.getClass();
/* 8 */                 return new HashingSource(source, "SHA-256");
                    }

                    public final HashingSource sha512(Source source) {
/* 1 */                 source.getClass();
/* 8 */                 return new HashingSource(source, "SHA-512");
                    }

/* 4 */             private Companion() {
                    }
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 35 */        public HashingSource(Source source, String str) throws NoSuchAlgorithmException {
                    source.getClass();
                    str.getClass();
/* 36 */            MessageDigest messageDigest = MessageDigest.getInstance(str);
                    messageDigest.getClass();
                    this(source, messageDigest);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 36 */        public HashingSource(Source source, Mac mac) {
/* 37 */            super(source);
                    source.getClass();
                    mac.getClass();
/* 38 */            this.mac = mac;
/* 39 */            this.messageDigest = null;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 39 */        public HashingSource(Source source, MessageDigest messageDigest) {
/* 40 */            super(source);
                    source.getClass();
                    messageDigest.getClass();
/* 41 */            this.messageDigest = messageDigest;
/* 42 */            this.mac = null;
                }
            }
