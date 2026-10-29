.class public final Lxd0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lc4;


# instance fields
.field public final a:Lh5;

.field public final b:Lwa1;

.field public final c:I


# direct methods
.method public constructor <init>(Lh5;Lwa1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxd0;->a:Lh5;

    .line 5
    .line 6
    iput-object p2, p0, Lxd0;->b:Lwa1;

    .line 7
    .line 8
    iput p3, p0, Lxd0;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 9

    .line 1
    iget-object v0, p0, Lxd0;->a:Lh5;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    array-length v1, p1

    .line 7
    iget v2, v0, Lh5;->b:I

    .line 8
    .line 9
    const v3, 0x7fffffff

    .line 10
    .line 11
    .line 12
    sub-int/2addr v3, v2

    .line 13
    if-gt v1, v3, :cond_1

    .line 14
    .line 15
    array-length v1, p1

    .line 16
    add-int/2addr v1, v2

    .line 17
    new-array v4, v1, [B

    .line 18
    .line 19
    invoke-static {v2}, Lo02;->a(I)[B

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    const/4 v8, 0x0

    .line 24
    invoke-static {v6, v8, v4, v8, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 25
    .line 26
    .line 27
    array-length v3, p1

    .line 28
    iget v5, v0, Lh5;->b:I

    .line 29
    .line 30
    const/4 v7, 0x1

    .line 31
    const/4 v2, 0x0

    .line 32
    move-object v1, p1

    .line 33
    invoke-virtual/range {v0 .. v7}, Lh5;->a([BII[BI[BZ)V

    .line 34
    .line 35
    .line 36
    if-nez p2, :cond_0

    .line 37
    .line 38
    new-array p2, v8, [B

    .line 39
    .line 40
    :cond_0
    const/16 p1, 0x8

    .line 41
    .line 42
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    array-length v1, p2

    .line 47
    int-to-long v1, v1

    .line 48
    const-wide/16 v5, 0x8

    .line 49
    .line 50
    mul-long/2addr v1, v5

    .line 51
    invoke-virtual {v0, v1, v2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    filled-new-array {p2, v4, p1}, [[B

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {p1}, Lk50;->b([[B)[B

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object p0, p0, Lxd0;->b:Lwa1;

    .line 72
    .line 73
    invoke-interface {p0, p1}, Lwa1;->b([B)[B

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    filled-new-array {v4, p0}, [[B

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-static {p0}, Lk50;->b([[B)[B

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 87
    .line 88
    const-string p1, "plaintext length can not exceed "

    .line 89
    .line 90
    invoke-static {v3, p1}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p0
.end method

.method public final b([B[B)[B
    .locals 13

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "ciphertext too short"

    .line 4
    .line 5
    iget v3, p0, Lxd0;->c:I

    .line 6
    .line 7
    if-lt v0, v3, :cond_2

    .line 8
    .line 9
    array-length v0, p1

    .line 10
    sub-int/2addr v0, v3

    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-static {p1, v4, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    array-length v0, p1

    .line 17
    sub-int/2addr v0, v3

    .line 18
    array-length v3, p1

    .line 19
    invoke-static {p1, v0, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    new-array p2, v4, [B

    .line 26
    .line 27
    :cond_0
    const/16 v0, 0x8

    .line 28
    .line 29
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    array-length v5, p2

    .line 34
    int-to-long v7, v5

    .line 35
    const-wide/16 v9, 0x8

    .line 36
    .line 37
    mul-long/2addr v7, v9

    .line 38
    invoke-virtual {v3, v7, v8}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {v3, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    filled-new-array {p2, v6, v0}, [[B

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-static {p2}, Lk50;->b([[B)[B

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    iget-object v0, p0, Lxd0;->b:Lwa1;

    .line 59
    .line 60
    invoke-interface {v0, p1, p2}, Lwa1;->a([B[B)V

    .line 61
    .line 62
    .line 63
    iget-object v5, p0, Lxd0;->a:Lh5;

    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    array-length p0, v6

    .line 69
    iget p1, v5, Lh5;->b:I

    .line 70
    .line 71
    if-lt p0, p1, :cond_1

    .line 72
    .line 73
    new-array v11, p1, [B

    .line 74
    .line 75
    invoke-static {v6, v4, v11, v4, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 76
    .line 77
    .line 78
    array-length p0, v6

    .line 79
    iget v7, v5, Lh5;->b:I

    .line 80
    .line 81
    sub-int/2addr p0, v7

    .line 82
    new-array v9, p0, [B

    .line 83
    .line 84
    array-length p0, v6

    .line 85
    sub-int v8, p0, v7

    .line 86
    .line 87
    const/4 v10, 0x0

    .line 88
    const/4 v12, 0x0

    .line 89
    invoke-virtual/range {v5 .. v12}, Lh5;->a([BII[BI[BZ)V

    .line 90
    .line 91
    .line 92
    return-object v9

    .line 93
    :cond_1
    invoke-static {v2}, Lds0;->t(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-object v1

    .line 97
    :cond_2
    invoke-static {v2}, Lds0;->t(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-object v1
.end method
