.class public final Lmq3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final f:Lmq3;


# instance fields
.field public a:I

.field public b:[I

.field public c:[Ljava/lang/Object;

.field public d:I

.field public e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lmq3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [I

    .line 5
    .line 6
    new-array v3, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v3, v1}, Lmq3;-><init>(I[I[Ljava/lang/Object;Z)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lmq3;->f:Lmq3;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(I[I[Ljava/lang/Object;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lmq3;->d:I

    .line 6
    .line 7
    iput p1, p0, Lmq3;->a:I

    .line 8
    .line 9
    iput-object p2, p0, Lmq3;->b:[I

    .line 10
    .line 11
    iput-object p3, p0, Lmq3;->c:[Ljava/lang/Object;

    .line 12
    .line 13
    iput-boolean p4, p0, Lmq3;->e:Z

    .line 14
    .line 15
    return-void
.end method

.method public static a()Lmq3;
    .locals 5

    .line 1
    new-instance v0, Lmq3;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    new-array v2, v1, [I

    .line 6
    .line 7
    new-array v1, v1, [Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    invoke-direct {v0, v4, v2, v1, v3}, Lmq3;-><init>(I[I[Ljava/lang/Object;Z)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public final b(Lpi3;)V
    .locals 6

    .line 1
    iget v0, p0, Lmq3;->a:I

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    iget v1, p0, Lmq3;->a:I

    .line 7
    .line 8
    if-ge v0, v1, :cond_5

    .line 9
    .line 10
    iget-object v1, p0, Lmq3;->b:[I

    .line 11
    .line 12
    aget v1, v1, v0

    .line 13
    .line 14
    iget-object v2, p0, Lmq3;->c:[Ljava/lang/Object;

    .line 15
    .line 16
    aget-object v2, v2, v0

    .line 17
    .line 18
    and-int/lit8 v3, v1, 0x7

    .line 19
    .line 20
    const/4 v4, 0x3

    .line 21
    ushr-int/2addr v1, v4

    .line 22
    if-eqz v3, :cond_4

    .line 23
    .line 24
    const/4 v5, 0x1

    .line 25
    if-eq v3, v5, :cond_3

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    if-eq v3, v5, :cond_2

    .line 29
    .line 30
    if-eq v3, v4, :cond_1

    .line 31
    .line 32
    const/4 v4, 0x5

    .line 33
    if-ne v3, v4, :cond_0

    .line 34
    .line 35
    check-cast v2, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    iget-object v3, p1, Lpi3;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Lkn3;

    .line 44
    .line 45
    invoke-virtual {v3, v1, v2}, Lkn3;->d(II)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    new-instance p0, Lto3;

    .line 50
    .line 51
    const-string p1, "Protocol message tag had invalid wire type."

    .line 52
    .line 53
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0}, Lds0;->p(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    iget-object v3, p1, Lpi3;->a:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v3, Lkn3;

    .line 63
    .line 64
    invoke-virtual {v3, v1, v4}, Lkn3;->b(II)V

    .line 65
    .line 66
    .line 67
    check-cast v2, Lmq3;

    .line 68
    .line 69
    invoke-virtual {v2, p1}, Lmq3;->b(Lpi3;)V

    .line 70
    .line 71
    .line 72
    iget-object v2, p1, Lpi3;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, Lkn3;

    .line 75
    .line 76
    const/4 v3, 0x4

    .line 77
    invoke-virtual {v2, v1, v3}, Lkn3;->b(II)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    check-cast v2, Lcn3;

    .line 82
    .line 83
    invoke-virtual {p1, v1, v2}, Lpi3;->e(ILcn3;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    check-cast v2, Ljava/lang/Long;

    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 90
    .line 91
    .line 92
    move-result-wide v2

    .line 93
    iget-object v4, p1, Lpi3;->a:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v4, Lkn3;

    .line 96
    .line 97
    invoke-virtual {v4, v1, v2, v3}, Lkn3;->f(IJ)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    check-cast v2, Ljava/lang/Long;

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 104
    .line 105
    .line 106
    move-result-wide v2

    .line 107
    iget-object v4, p1, Lpi3;->a:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v4, Lkn3;

    .line 110
    .line 111
    invoke-virtual {v4, v1, v2, v3}, Lkn3;->e(IJ)V

    .line 112
    .line 113
    .line 114
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_5
    return-void
.end method

.method public final c()I
    .locals 7

    .line 1
    iget v0, p0, Lmq3;->d:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_6

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    move v1, v0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    iget v3, p0, Lmq3;->a:I

    .line 10
    .line 11
    if-ge v1, v3, :cond_5

    .line 12
    .line 13
    iget-object v3, p0, Lmq3;->b:[I

    .line 14
    .line 15
    aget v3, v3, v1

    .line 16
    .line 17
    ushr-int/lit8 v4, v3, 0x3

    .line 18
    .line 19
    and-int/lit8 v3, v3, 0x7

    .line 20
    .line 21
    if-eqz v3, :cond_4

    .line 22
    .line 23
    const/4 v5, 0x1

    .line 24
    if-eq v3, v5, :cond_3

    .line 25
    .line 26
    const/4 v5, 0x2

    .line 27
    if-eq v3, v5, :cond_2

    .line 28
    .line 29
    const/4 v5, 0x3

    .line 30
    if-eq v3, v5, :cond_1

    .line 31
    .line 32
    const/4 v5, 0x5

    .line 33
    if-ne v3, v5, :cond_0

    .line 34
    .line 35
    iget-object v3, p0, Lmq3;->c:[Ljava/lang/Object;

    .line 36
    .line 37
    aget-object v3, v3, v1

    .line 38
    .line 39
    check-cast v3, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    shl-int/lit8 v3, v4, 0x3

    .line 45
    .line 46
    const/4 v4, 0x4

    .line 47
    invoke-static {v3, v4, v2}, Lpm2;->q(III)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    new-instance p0, Lto3;

    .line 53
    .line 54
    const-string v1, "Protocol message tag had invalid wire type."

    .line 55
    .line 56
    invoke-direct {p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0}, Lio/sentry/u2;->o(Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    return v0

    .line 63
    :cond_1
    shl-int/lit8 v3, v4, 0x3

    .line 64
    .line 65
    sget-object v4, Lkn3;->e:Ljava/util/logging/Logger;

    .line 66
    .line 67
    iget-object v4, p0, Lmq3;->c:[Ljava/lang/Object;

    .line 68
    .line 69
    aget-object v4, v4, v1

    .line 70
    .line 71
    check-cast v4, Lmq3;

    .line 72
    .line 73
    invoke-virtual {v4}, Lmq3;->c()I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    invoke-static {v3}, Lkn3;->p(I)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    add-int/2addr v3, v3

    .line 82
    add-int/2addr v3, v4

    .line 83
    add-int/2addr v3, v2

    .line 84
    move v2, v3

    .line 85
    goto :goto_1

    .line 86
    :cond_2
    iget-object v3, p0, Lmq3;->c:[Ljava/lang/Object;

    .line 87
    .line 88
    aget-object v3, v3, v1

    .line 89
    .line 90
    check-cast v3, Lcn3;

    .line 91
    .line 92
    shl-int/lit8 v4, v4, 0x3

    .line 93
    .line 94
    sget-object v5, Lkn3;->e:Ljava/util/logging/Logger;

    .line 95
    .line 96
    invoke-virtual {v3}, Lcn3;->c()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    invoke-static {v3}, Lkn3;->p(I)I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    add-int/2addr v5, v3

    .line 105
    invoke-static {v4, v5, v2}, Lpm2;->q(III)I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    goto :goto_1

    .line 110
    :cond_3
    iget-object v3, p0, Lmq3;->c:[Ljava/lang/Object;

    .line 111
    .line 112
    aget-object v3, v3, v1

    .line 113
    .line 114
    check-cast v3, Ljava/lang/Long;

    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    shl-int/lit8 v3, v4, 0x3

    .line 120
    .line 121
    const/16 v4, 0x8

    .line 122
    .line 123
    invoke-static {v3, v4, v2}, Lpm2;->q(III)I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    goto :goto_1

    .line 128
    :cond_4
    iget-object v3, p0, Lmq3;->c:[Ljava/lang/Object;

    .line 129
    .line 130
    aget-object v3, v3, v1

    .line 131
    .line 132
    check-cast v3, Ljava/lang/Long;

    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 135
    .line 136
    .line 137
    move-result-wide v5

    .line 138
    shl-int/lit8 v3, v4, 0x3

    .line 139
    .line 140
    invoke-static {v5, v6}, Lkn3;->q(J)I

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    invoke-static {v3, v4, v2}, Lpm2;->q(III)I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :cond_5
    iput v2, p0, Lmq3;->d:I

    .line 153
    .line 154
    return v2

    .line 155
    :cond_6
    return v0
.end method

.method public final d(ILjava/lang/Object;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lmq3;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lmq3;->a:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lmq3;->e(I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lmq3;->b:[I

    .line 13
    .line 14
    iget v1, p0, Lmq3;->a:I

    .line 15
    .line 16
    aput p1, v0, v1

    .line 17
    .line 18
    iget-object p1, p0, Lmq3;->c:[Ljava/lang/Object;

    .line 19
    .line 20
    aput-object p2, p1, v1

    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    iput v1, p0, Lmq3;->a:I

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-static {}, Lf42;->p()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final e(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lmq3;->b:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-le p1, v1, :cond_2

    .line 5
    .line 6
    iget v1, p0, Lmq3;->a:I

    .line 7
    .line 8
    div-int/lit8 v2, v1, 0x2

    .line 9
    .line 10
    add-int/2addr v2, v1

    .line 11
    if-lt v2, p1, :cond_0

    .line 12
    .line 13
    move p1, v2

    .line 14
    :cond_0
    const/16 v1, 0x8

    .line 15
    .line 16
    if-ge p1, v1, :cond_1

    .line 17
    .line 18
    move p1, v1

    .line 19
    :cond_1
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lmq3;->b:[I

    .line 24
    .line 25
    iget-object v0, p0, Lmq3;->c:[Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lmq3;->c:[Ljava/lang/Object;

    .line 32
    .line 33
    :cond_2
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    if-nez p1, :cond_1

    .line 6
    .line 7
    goto :goto_3

    .line 8
    :cond_1
    instance-of v1, p1, Lmq3;

    .line 9
    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    goto :goto_3

    .line 13
    :cond_2
    check-cast p1, Lmq3;

    .line 14
    .line 15
    iget v1, p0, Lmq3;->a:I

    .line 16
    .line 17
    iget v2, p1, Lmq3;->a:I

    .line 18
    .line 19
    if-ne v1, v2, :cond_6

    .line 20
    .line 21
    iget-object v2, p0, Lmq3;->b:[I

    .line 22
    .line 23
    iget-object v3, p1, Lmq3;->b:[I

    .line 24
    .line 25
    move v4, v0

    .line 26
    :goto_0
    if-ge v4, v1, :cond_4

    .line 27
    .line 28
    aget v5, v2, v4

    .line 29
    .line 30
    aget v6, v3, v4

    .line 31
    .line 32
    if-eq v5, v6, :cond_3

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_4
    iget-object v1, p0, Lmq3;->c:[Ljava/lang/Object;

    .line 39
    .line 40
    iget-object p1, p1, Lmq3;->c:[Ljava/lang/Object;

    .line 41
    .line 42
    iget p0, p0, Lmq3;->a:I

    .line 43
    .line 44
    move v2, v0

    .line 45
    :goto_1
    if-ge v2, p0, :cond_5

    .line 46
    .line 47
    aget-object v3, v1, v2

    .line 48
    .line 49
    aget-object v4, p1, v2

    .line 50
    .line 51
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_6

    .line 56
    .line 57
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_5
    :goto_2
    const/4 p0, 0x1

    .line 61
    return p0

    .line 62
    :cond_6
    :goto_3
    return v0
.end method

.method public final hashCode()I
    .locals 8

    .line 1
    iget v0, p0, Lmq3;->a:I

    .line 2
    .line 3
    add-int/lit16 v1, v0, 0x20f

    .line 4
    .line 5
    iget-object v2, p0, Lmq3;->b:[I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x11

    .line 9
    .line 10
    move v5, v3

    .line 11
    move v6, v4

    .line 12
    :goto_0
    if-ge v5, v0, :cond_0

    .line 13
    .line 14
    mul-int/lit8 v6, v6, 0x1f

    .line 15
    .line 16
    aget v7, v2, v5

    .line 17
    .line 18
    add-int/2addr v6, v7

    .line 19
    add-int/lit8 v5, v5, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    mul-int/lit8 v1, v1, 0x1f

    .line 23
    .line 24
    add-int/2addr v1, v6

    .line 25
    iget-object v0, p0, Lmq3;->c:[Ljava/lang/Object;

    .line 26
    .line 27
    iget p0, p0, Lmq3;->a:I

    .line 28
    .line 29
    :goto_1
    if-ge v3, p0, :cond_1

    .line 30
    .line 31
    mul-int/lit8 v4, v4, 0x1f

    .line 32
    .line 33
    aget-object v2, v0, v3

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    add-int/2addr v4, v2

    .line 40
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    mul-int/lit8 v1, v1, 0x1f

    .line 44
    .line 45
    add-int/2addr v1, v4

    .line 46
    return v1
.end method
