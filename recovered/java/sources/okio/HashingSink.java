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
            @Metadata(m6175d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB\u001f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0002\b\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0010\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m6176d2 = {"Lokio/HashingSink;", "Lokio/ForwardingSink;", "Lokio/Sink;", "sink", "digest", "Ljava/security/MessageDigest;", "(Lokio/Sink;Ljava/security/MessageDigest;)V", "algorithm", HttpUrl.FRAGMENT_ENCODE_SET, "(Lokio/Sink;Ljava/lang/String;)V", "mac", "Ljavax/crypto/Mac;", "(Lokio/Sink;Ljavax/crypto/Mac;)V", "key", "Lokio/ByteString;", "(Lokio/Sink;Lokio/ByteString;Ljava/lang/String;)V", "hash", "()Lokio/ByteString;", "messageDigest", "-deprecated_hash", "write", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.SOURCE, "Lokio/Buffer;", "byteCount", HttpUrl.FRAGMENT_ENCODE_SET, "Companion", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 2 */     public final class HashingSink extends ForwardingSink implements Sink {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final Mac mac;
                private final MessageDigest messageDigest;

                /* JADX WARN: Illegal instructions before constructor call */
                public HashingSink(Sink sink, ByteString byteString, String str) throws NoSuchAlgorithmException {
/* 1 */             sink.getClass();
/* 4 */             byteString.getClass();
/* 7 */             str.getClass();
                    try {
/* 10 */                Mac mac = Mac.getInstance(str);
/* 23 */                mac.init(new SecretKeySpec(byteString.toByteArray(), str));
/* 26 */                this(sink, mac);
                    } catch (InvalidKeyException e) {
/* 31 */                C1951n4.m6863n(e);
/* 35 */                throw null;
                    }
                }

                public static final HashingSink hmacSha1(Sink sink, ByteString byteString) {
/* 3 */             return INSTANCE.hmacSha1(sink, byteString);
                }

                public static final HashingSink hmacSha256(Sink sink, ByteString byteString) {
/* 3 */             return INSTANCE.hmacSha256(sink, byteString);
                }

                public static final HashingSink hmacSha512(Sink sink, ByteString byteString) {
/* 3 */             return INSTANCE.hmacSha512(sink, byteString);
                }

                public static final HashingSink md5(Sink sink) {
/* 3 */             return INSTANCE.md5(sink);
                }

                public static final HashingSink sha1(Sink sink) {
/* 3 */             return INSTANCE.sha1(sink);
                }

                public static final HashingSink sha256(Sink sink) {
/* 3 */             return INSTANCE.sha256(sink);
                }

                public static final HashingSink sha512(Sink sink) {
/* 3 */             return INSTANCE.sha512(sink);
                }

                /* JADX INFO: renamed from: -deprecated_hash, reason: not valid java name */
                public final ByteString m10656deprecated_hash() {
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

                @Override // okio.ForwardingSink, okio.Sink
                public void write(Buffer source, long byteCount) throws IOException {
/* 1 */             source.getClass();
/* 11 */            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
/* 14 */            Segment segment = source.head;
/* 16 */            segment.getClass();
/* 19 */            long j = 0;
/* 23 */            while (j < byteCount) {
/* 37 */                int iMin = (int) Math.min(byteCount - j, segment.limit - segment.pos);
/* 38 */                MessageDigest messageDigest = this.messageDigest;
/* 40 */                if (messageDigest != null) {
/* 46 */                    messageDigest.update(segment.data, segment.pos, iMin);
                        } else {
/* 50 */                    Mac mac = this.mac;
/* 52 */                    mac.getClass();
/* 59 */                    mac.update(segment.data, segment.pos, iMin);
                        }
/* 63 */                j += (long) iMin;
/* 64 */                segment = segment.next;
/* 66 */                segment.getClass();
                    }
/* 70 */            super.write(source, byteCount);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, m6176d2 = {"Lokio/HashingSink$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "hmacSha1", "Lokio/HashingSink;", "sink", "Lokio/Sink;", "key", "Lokio/ByteString;", "hmacSha256", "hmacSha512", "md5", "sha1", "sha256", "sha512", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final HashingSink hmacSha1(Sink sink, ByteString key) {
/* 1 */                 sink.getClass();
/* 4 */                 key.getClass();
/* 11 */                return new HashingSink(sink, key, "HmacSHA1");
                    }

                    public final HashingSink hmacSha256(Sink sink, ByteString key) {
/* 1 */                 sink.getClass();
/* 4 */                 key.getClass();
/* 11 */                return new HashingSink(sink, key, "HmacSHA256");
                    }

                    public final HashingSink hmacSha512(Sink sink, ByteString key) {
/* 1 */                 sink.getClass();
/* 4 */                 key.getClass();
/* 11 */                return new HashingSink(sink, key, "HmacSHA512");
                    }

                    public final HashingSink md5(Sink sink) {
/* 1 */                 sink.getClass();
/* 8 */                 return new HashingSink(sink, "MD5");
                    }

                    public final HashingSink sha1(Sink sink) {
/* 1 */                 sink.getClass();
/* 8 */                 return new HashingSink(sink, "SHA-1");
                    }

                    public final HashingSink sha256(Sink sink) {
/* 1 */                 sink.getClass();
/* 8 */                 return new HashingSink(sink, "SHA-256");
                    }

                    public final HashingSink sha512(Sink sink) {
/* 1 */                 sink.getClass();
/* 8 */                 return new HashingSink(sink, "SHA-512");
                    }

/* 4 */             private Companion() {
                    }
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 35 */        public HashingSink(Sink sink, String str) throws NoSuchAlgorithmException {
                    sink.getClass();
                    str.getClass();
/* 36 */            MessageDigest messageDigest = MessageDigest.getInstance(str);
                    messageDigest.getClass();
                    this(sink, messageDigest);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 36 */        public HashingSink(Sink sink, Mac mac) {
/* 37 */            super(sink);
                    sink.getClass();
                    mac.getClass();
/* 38 */            this.mac = mac;
/* 39 */            this.messageDigest = null;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 39 */        public HashingSink(Sink sink, MessageDigest messageDigest) {
/* 40 */            super(sink);
                    sink.getClass();
                    messageDigest.getClass();
/* 41 */            this.messageDigest = messageDigest;
/* 42 */            this.mac = null;
                }
            }
