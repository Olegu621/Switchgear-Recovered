.class public final Lrg;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:I

.field public final b:Lej2;

.field public final c:J


# direct methods
.method public constructor <init>(ILej2;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lrg;->a:I

    .line 7
    .line 8
    iput-object p2, p0, Lrg;->b:Lej2;

    .line 9
    .line 10
    iput-wide p3, p0, Lrg;->c:J

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "Null configType"

    .line 14
    .line 15
    invoke-static {p0}, Ln4;->s(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0
.end method

.method public static a(I)I
    .locals 1

    .line 1
    const/16 v0, 0x23

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x2

    .line 6
    return p0

    .line 7
    :cond_0
    const/16 v0, 0x100

    .line 8
    .line 9
    if-ne p0, v0, :cond_1

    .line 10
    .line 11
    const/4 p0, 0x3

    .line 12
    return p0

    .line 13
    :cond_1
    const/16 v0, 0x1005

    .line 14
    .line 15
    if-ne p0, v0, :cond_2

    .line 16
    .line 17
    const/4 p0, 0x4

    .line 18
    return p0

    .line 19
    :cond_2
    const/16 v0, 0x20

    .line 20
    .line 21
    if-ne p0, v0, :cond_3

    .line 22
    .line 23
    const/4 p0, 0x5

    .line 24
    return p0

    .line 25
    :cond_3
    const/4 p0, 0x1

    .line 26
    return p0
.end method

.method public static b(IILandroid/util/Size;Lwg;)Lrg;
    .locals 2

    .line 1
    invoke-static {p1}, Lrg;->a(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p2}, Lue2;->a(Landroid/util/Size;)I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne p0, v1, :cond_1

    .line 11
    .line 12
    iget-object p0, p3, Lwg;->b:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Landroid/util/Size;

    .line 23
    .line 24
    invoke-static {p0}, Lue2;->a(Landroid/util/Size;)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-gt p2, p0, :cond_0

    .line 29
    .line 30
    sget-object p0, Lej2;->c:Lej2;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object p0, p3, Lwg;->d:Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Landroid/util/Size;

    .line 44
    .line 45
    invoke-static {p0}, Lue2;->a(Landroid/util/Size;)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-gt p2, p0, :cond_6

    .line 50
    .line 51
    sget-object p0, Lej2;->e:Lej2;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    iget-object p0, p3, Lwg;->a:Landroid/util/Size;

    .line 55
    .line 56
    invoke-static {p0}, Lue2;->a(Landroid/util/Size;)I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-gt p2, p0, :cond_2

    .line 61
    .line 62
    sget-object p0, Lej2;->b:Lej2;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    iget-object p0, p3, Lwg;->c:Landroid/util/Size;

    .line 66
    .line 67
    invoke-static {p0}, Lue2;->a(Landroid/util/Size;)I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-gt p2, p0, :cond_3

    .line 72
    .line 73
    sget-object p0, Lej2;->d:Lej2;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    iget-object p0, p3, Lwg;->e:Landroid/util/Size;

    .line 77
    .line 78
    invoke-static {p0}, Lue2;->a(Landroid/util/Size;)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-gt p2, p0, :cond_4

    .line 83
    .line 84
    sget-object p0, Lej2;->f:Lej2;

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    iget-object p0, p3, Lwg;->f:Ljava/util/HashMap;

    .line 88
    .line 89
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {p0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, Landroid/util/Size;

    .line 98
    .line 99
    invoke-static {p0}, Lue2;->a(Landroid/util/Size;)I

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-gt p2, p0, :cond_5

    .line 104
    .line 105
    sget-object p0, Lej2;->i:Lej2;

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_5
    iget-object p0, p3, Lwg;->g:Ljava/util/HashMap;

    .line 109
    .line 110
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    check-cast p0, Landroid/util/Size;

    .line 119
    .line 120
    if-eqz p0, :cond_6

    .line 121
    .line 122
    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    mul-int/2addr p0, p1

    .line 131
    if-gt p2, p0, :cond_6

    .line 132
    .line 133
    sget-object p0, Lej2;->v:Lej2;

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_6
    sget-object p0, Lej2;->w:Lej2;

    .line 137
    .line 138
    :goto_0
    new-instance p1, Lrg;

    .line 139
    .line 140
    const-wide/16 p2, 0x0

    .line 141
    .line 142
    invoke-direct {p1, v0, p0, p2, p3}, Lrg;-><init>(ILej2;J)V

    .line 143
    .line 144
    .line 145
    return-object p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lrg;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, Lrg;

    .line 9
    .line 10
    iget v0, p0, Lrg;->a:I

    .line 11
    .line 12
    iget v1, p1, Lrg;->a:I

    .line 13
    .line 14
    invoke-static {v0, v1}, Len;->c(II)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lrg;->b:Lej2;

    .line 21
    .line 22
    iget-object v1, p1, Lrg;->b:Lej2;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-wide v0, p0, Lrg;->c:J

    .line 31
    .line 32
    iget-wide p0, p1, Lrg;->c:J

    .line 33
    .line 34
    cmp-long p0, v0, p0

    .line 35
    .line 36
    if-nez p0, :cond_1

    .line 37
    .line 38
    :goto_0
    const/4 p0, 0x1

    .line 39
    return p0

    .line 40
    :cond_1
    const/4 p0, 0x0

    .line 41
    return p0
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget v0, p0, Lrg;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Len;->y(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const v1, 0xf4243

    .line 8
    .line 9
    .line 10
    xor-int/2addr v0, v1

    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lrg;->b:Lej2;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    xor-int/2addr v0, v2

    .line 19
    mul-int/2addr v0, v1

    .line 20
    const/16 v1, 0x20

    .line 21
    .line 22
    iget-wide v2, p0, Lrg;->c:J

    .line 23
    .line 24
    ushr-long v4, v2, v1

    .line 25
    .line 26
    xor-long v1, v4, v2

    .line 27
    .line 28
    long-to-int p0, v1

    .line 29
    xor-int/2addr p0, v0

    .line 30
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "SurfaceConfig{configType="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iget v2, p0, Lrg;->a:I

    .line 10
    .line 11
    if-eq v2, v1, :cond_4

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    if-eq v2, v1, :cond_3

    .line 15
    .line 16
    const/4 v1, 0x3

    .line 17
    if-eq v2, v1, :cond_2

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    if-eq v2, v1, :cond_1

    .line 21
    .line 22
    const/4 v1, 0x5

    .line 23
    if-eq v2, v1, :cond_0

    .line 24
    .line 25
    const-string v1, "null"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string v1, "RAW"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const-string v1, "JPEG_R"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const-string v1, "JPEG"

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_3
    const-string v1, "YUV"

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    const-string v1, "PRIV"

    .line 41
    .line 42
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v1, ", configSize="

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lrg;->b:Lej2;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", streamUseCase="

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-wide v1, p0, Lrg;->c:J

    .line 61
    .line 62
    const-string p0, "}"

    .line 63
    .line 64
    invoke-static {v0, v1, v2, p0}, Lfm0;->m(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method
