.class public final Luj;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:[B

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>([BI)V
    .locals 0

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Luj;->a:[B

    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    array-length p2, p1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Luj;->a:[B

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput p1, p0, Luj;->b:I

    .line 18
    .line 19
    iput p2, p0, Luj;->c:I

    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public static b(III)V
    .locals 10

    .line 1
    if-ne p1, p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 5
    .line 6
    const-string v1, "Field "

    .line 7
    .line 8
    const-string v2, ": expected "

    .line 9
    .line 10
    invoke-static {p0, v1, v2}, Lfm0;->s(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v1, "varint"

    .line 15
    .line 16
    const-string v2, "fixed64"

    .line 17
    .line 18
    const-string v3, "length-delimited"

    .line 19
    .line 20
    const-string v4, "fixed32"

    .line 21
    .line 22
    const-string v5, "unknown"

    .line 23
    .line 24
    const/4 v6, 0x5

    .line 25
    const/4 v7, 0x2

    .line 26
    const/4 v8, 0x1

    .line 27
    if-eqz p1, :cond_4

    .line 28
    .line 29
    if-eq p1, v8, :cond_3

    .line 30
    .line 31
    if-eq p1, v7, :cond_2

    .line 32
    .line 33
    if-eq p1, v6, :cond_1

    .line 34
    .line 35
    move-object v9, v5

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move-object v9, v4

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    move-object v9, v3

    .line 40
    goto :goto_0

    .line 41
    :cond_3
    move-object v9, v2

    .line 42
    goto :goto_0

    .line 43
    :cond_4
    move-object v9, v1

    .line 44
    :goto_0
    invoke-virtual {p0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v9, " (wire type "

    .line 48
    .line 49
    invoke-virtual {p0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p1, ") but got "

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    if-eqz p2, :cond_8

    .line 61
    .line 62
    if-eq p2, v8, :cond_7

    .line 63
    .line 64
    if-eq p2, v7, :cond_6

    .line 65
    .line 66
    if-eq p2, v6, :cond_5

    .line 67
    .line 68
    move-object v1, v5

    .line 69
    goto :goto_1

    .line 70
    :cond_5
    move-object v1, v4

    .line 71
    goto :goto_1

    .line 72
    :cond_6
    move-object v1, v3

    .line 73
    goto :goto_1

    .line 74
    :cond_7
    move-object v1, v2

    .line 75
    :cond_8
    :goto_1
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string p1, ")"

    .line 85
    .line 86
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v0
.end method


# virtual methods
.method public a()I
    .locals 2

    .line 1
    iget-object v0, p0, Luj;->a:[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    iget v1, p0, Luj;->b:I

    .line 5
    .line 6
    sub-int/2addr v0, v1

    .line 7
    mul-int/lit8 v0, v0, 0x8

    .line 8
    .line 9
    iget p0, p0, Luj;->c:I

    .line 10
    .line 11
    sub-int/2addr v0, p0

    .line 12
    return v0
.end method

.method public c(I)I
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-lez p1, :cond_5

    .line 3
    .line 4
    const/16 v1, 0x20

    .line 5
    .line 6
    if-gt p1, v1, :cond_5

    .line 7
    .line 8
    invoke-virtual {p0}, Luj;->a()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-gt p1, v1, :cond_5

    .line 13
    .line 14
    iget v1, p0, Luj;->c:I

    .line 15
    .line 16
    iget-object v2, p0, Luj;->a:[B

    .line 17
    .line 18
    const/16 v3, 0xff

    .line 19
    .line 20
    const/16 v4, 0x8

    .line 21
    .line 22
    if-lez v1, :cond_2

    .line 23
    .line 24
    rsub-int/lit8 v5, v1, 0x8

    .line 25
    .line 26
    if-ge p1, v5, :cond_0

    .line 27
    .line 28
    move v6, p1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v6, v5

    .line 31
    :goto_0
    sub-int/2addr v5, v6

    .line 32
    rsub-int/lit8 v7, v6, 0x8

    .line 33
    .line 34
    shr-int v7, v3, v7

    .line 35
    .line 36
    shl-int/2addr v7, v5

    .line 37
    iget v8, p0, Luj;->b:I

    .line 38
    .line 39
    aget-byte v9, v2, v8

    .line 40
    .line 41
    and-int/2addr v7, v9

    .line 42
    shr-int v5, v7, v5

    .line 43
    .line 44
    sub-int/2addr p1, v6

    .line 45
    add-int/2addr v1, v6

    .line 46
    iput v1, p0, Luj;->c:I

    .line 47
    .line 48
    if-ne v1, v4, :cond_1

    .line 49
    .line 50
    iput v0, p0, Luj;->c:I

    .line 51
    .line 52
    add-int/lit8 v8, v8, 0x1

    .line 53
    .line 54
    iput v8, p0, Luj;->b:I

    .line 55
    .line 56
    :cond_1
    move v0, v5

    .line 57
    :cond_2
    if-lez p1, :cond_4

    .line 58
    .line 59
    :goto_1
    if-lt p1, v4, :cond_3

    .line 60
    .line 61
    shl-int/lit8 v0, v0, 0x8

    .line 62
    .line 63
    iget v1, p0, Luj;->b:I

    .line 64
    .line 65
    aget-byte v5, v2, v1

    .line 66
    .line 67
    and-int/2addr v5, v3

    .line 68
    or-int/2addr v0, v5

    .line 69
    add-int/lit8 v1, v1, 0x1

    .line 70
    .line 71
    iput v1, p0, Luj;->b:I

    .line 72
    .line 73
    add-int/lit8 p1, p1, -0x8

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    if-lez p1, :cond_4

    .line 77
    .line 78
    rsub-int/lit8 v1, p1, 0x8

    .line 79
    .line 80
    shr-int/2addr v3, v1

    .line 81
    shl-int/2addr v3, v1

    .line 82
    shl-int/2addr v0, p1

    .line 83
    iget v4, p0, Luj;->b:I

    .line 84
    .line 85
    aget-byte v2, v2, v4

    .line 86
    .line 87
    and-int/2addr v2, v3

    .line 88
    shr-int v1, v2, v1

    .line 89
    .line 90
    or-int/2addr v0, v1

    .line 91
    iget v1, p0, Luj;->c:I

    .line 92
    .line 93
    add-int/2addr v1, p1

    .line 94
    iput v1, p0, Luj;->c:I

    .line 95
    .line 96
    :cond_4
    return v0

    .line 97
    :cond_5
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    return v0
.end method

.method public d()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Luj;->i()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long p0, v0, v2

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public e()[B
    .locals 5

    .line 1
    invoke-virtual {p0}, Luj;->i()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    long-to-int v0, v0

    .line 6
    if-ltz v0, :cond_1

    .line 7
    .line 8
    iget v1, p0, Luj;->c:I

    .line 9
    .line 10
    iget v2, p0, Luj;->b:I

    .line 11
    .line 12
    sub-int/2addr v1, v2

    .line 13
    if-lt v1, v0, :cond_0

    .line 14
    .line 15
    new-array v1, v0, [B

    .line 16
    .line 17
    iget-object v3, p0, Luj;->a:[B

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-static {v3, v2, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 21
    .line 22
    .line 23
    iget v2, p0, Luj;->b:I

    .line 24
    .line 25
    add-int/2addr v2, v0

    .line 26
    iput v2, p0, Luj;->b:I

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_0
    new-instance p0, Ljava/io/EOFException;

    .line 30
    .line 31
    const-string v0, "Not enough bytes for length-delimited field"

    .line 32
    .line 33
    invoke-direct {p0, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p0

    .line 37
    :cond_1
    const-string p0, "Negative length: "

    .line 38
    .line 39
    invoke-static {v0, p0}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Lds0;->l(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    return-object p0
.end method

.method public f()Luj;
    .locals 2

    .line 1
    invoke-virtual {p0}, Luj;->e()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Luj;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p0, v1}, Luj;-><init>([BI)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Luj;->e()[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public h()I
    .locals 2

    .line 1
    iget v0, p0, Luj;->b:I

    .line 2
    .line 3
    iget v1, p0, Luj;->c:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Luj;->i()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    long-to-int p0, v0

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public i()J
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    const/16 v3, 0x40

    .line 5
    .line 6
    if-ge v2, v3, :cond_2

    .line 7
    .line 8
    iget v3, p0, Luj;->b:I

    .line 9
    .line 10
    iget v4, p0, Luj;->c:I

    .line 11
    .line 12
    if-ge v3, v4, :cond_1

    .line 13
    .line 14
    add-int/lit8 v4, v3, 0x1

    .line 15
    .line 16
    iput v4, p0, Luj;->b:I

    .line 17
    .line 18
    iget-object v4, p0, Luj;->a:[B

    .line 19
    .line 20
    aget-byte v3, v4, v3

    .line 21
    .line 22
    and-int/lit8 v4, v3, 0x7f

    .line 23
    .line 24
    int-to-long v4, v4

    .line 25
    shl-long/2addr v4, v2

    .line 26
    or-long/2addr v0, v4

    .line 27
    and-int/lit16 v3, v3, 0x80

    .line 28
    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    return-wide v0

    .line 32
    :cond_0
    add-int/lit8 v2, v2, 0x7

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    new-instance p0, Ljava/io/EOFException;

    .line 36
    .line 37
    const-string v0, "Truncated varint"

    .line 38
    .line 39
    invoke-direct {p0, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p0

    .line 43
    :cond_2
    const-string p0, "Malformed varint"

    .line 44
    .line 45
    invoke-static {p0}, Lds0;->l(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-wide/16 v0, 0x0

    .line 49
    .line 50
    return-wide v0
.end method

.method public j(I)V
    .locals 3

    .line 1
    iget v0, p0, Luj;->c:I

    .line 2
    .line 3
    if-eqz p1, :cond_6

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq p1, v1, :cond_4

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq p1, v1, :cond_2

    .line 10
    .line 11
    const/4 v1, 0x5

    .line 12
    if-ne p1, v1, :cond_1

    .line 13
    .line 14
    iget p1, p0, Luj;->b:I

    .line 15
    .line 16
    sub-int/2addr v0, p1

    .line 17
    const/4 v1, 0x4

    .line 18
    if-lt v0, v1, :cond_0

    .line 19
    .line 20
    add-int/2addr p1, v1

    .line 21
    iput p1, p0, Luj;->b:I

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    new-instance p0, Ljava/io/EOFException;

    .line 25
    .line 26
    const-string p1, "Not enough bytes to skip fixed32"

    .line 27
    .line 28
    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0

    .line 32
    :cond_1
    const-string p0, "Unknown wire type: "

    .line 33
    .line 34
    invoke-static {p1, p0}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Lds0;->l(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    invoke-virtual {p0}, Luj;->i()J

    .line 43
    .line 44
    .line 45
    move-result-wide v1

    .line 46
    long-to-int p1, v1

    .line 47
    iget v1, p0, Luj;->b:I

    .line 48
    .line 49
    sub-int/2addr v0, v1

    .line 50
    if-lt v0, p1, :cond_3

    .line 51
    .line 52
    add-int/2addr v1, p1

    .line 53
    iput v1, p0, Luj;->b:I

    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    new-instance p0, Ljava/io/EOFException;

    .line 57
    .line 58
    const-string p1, "Not enough bytes to skip length-delimited"

    .line 59
    .line 60
    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p0

    .line 64
    :cond_4
    iget p1, p0, Luj;->b:I

    .line 65
    .line 66
    sub-int/2addr v0, p1

    .line 67
    const/16 v1, 0x8

    .line 68
    .line 69
    if-lt v0, v1, :cond_5

    .line 70
    .line 71
    add-int/2addr p1, v1

    .line 72
    iput p1, p0, Luj;->b:I

    .line 73
    .line 74
    return-void

    .line 75
    :cond_5
    new-instance p0, Ljava/io/EOFException;

    .line 76
    .line 77
    const-string p1, "Not enough bytes to skip fixed64"

    .line 78
    .line 79
    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p0

    .line 83
    :cond_6
    invoke-virtual {p0}, Luj;->i()J

    .line 84
    .line 85
    .line 86
    return-void
.end method
