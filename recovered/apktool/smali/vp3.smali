.class public final Lvp3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lbq3;


# instance fields
.field public final a:Ltm3;

.field public final b:Lnq3;

.field public final c:Z

.field public final d:Lqn3;


# direct methods
.method public constructor <init>(Lnq3;Lqn3;Ltm3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvp3;->b:Lnq3;

    .line 5
    .line 6
    instance-of p1, p3, Lbo3;

    .line 7
    .line 8
    iput-boolean p1, p0, Lvp3;->c:Z

    .line 9
    .line 10
    iput-object p2, p0, Lvp3;->d:Lqn3;

    .line 11
    .line 12
    iput-object p3, p0, Lvp3;->a:Ltm3;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Leo3;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lvp3;->b:Lnq3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Leo3;->zzc:Lmq3;

    .line 7
    .line 8
    invoke-virtual {v0}, Lmq3;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-boolean p0, p0, Lvp3;->c:Z

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    check-cast p1, Lbo3;

    .line 17
    .line 18
    iget-object p0, p1, Lbo3;->zza:Lun3;

    .line 19
    .line 20
    mul-int/lit8 v0, v0, 0x35

    .line 21
    .line 22
    iget-object p0, p0, Lun3;->a:Lhq3;

    .line 23
    .line 24
    invoke-virtual {p0}, Lhq3;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
    return p0

    .line 30
    :cond_0
    return v0
.end method

.method public final b(Ljava/lang/Object;[BIILym3;)V
    .locals 9

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Leo3;

    .line 3
    .line 4
    iget-object v1, v0, Leo3;->zzc:Lmq3;

    .line 5
    .line 6
    sget-object v2, Lmq3;->f:Lmq3;

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {}, Lmq3;->a()Lmq3;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iput-object v1, v0, Leo3;->zzc:Lmq3;

    .line 15
    .line 16
    :cond_0
    move-object v6, v1

    .line 17
    check-cast p1, Lbo3;

    .line 18
    .line 19
    iget-object v0, p1, Lbo3;->zza:Lun3;

    .line 20
    .line 21
    iget-boolean v1, v0, Lun3;->b:Z

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Lun3;->b()Lun3;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p1, Lbo3;->zza:Lun3;

    .line 30
    .line 31
    :cond_1
    :goto_0
    if-ge p3, p4, :cond_a

    .line 32
    .line 33
    invoke-static {p2, p3, p5}, Lw11;->Z([BILym3;)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    iget v2, p5, Lym3;->a:I

    .line 38
    .line 39
    iget-object p1, p5, Lym3;->d:Lon3;

    .line 40
    .line 41
    const/16 p3, 0xb

    .line 42
    .line 43
    iget-object v0, p0, Lvp3;->a:Ltm3;

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    if-eq v2, p3, :cond_3

    .line 47
    .line 48
    and-int/lit8 p3, v2, 0x7

    .line 49
    .line 50
    if-ne p3, v1, :cond_2

    .line 51
    .line 52
    ushr-int/lit8 p3, v2, 0x3

    .line 53
    .line 54
    invoke-virtual {p1, v0, p3}, Lon3;->b(Ltm3;I)V

    .line 55
    .line 56
    .line 57
    move-object v3, p2

    .line 58
    move v5, p4

    .line 59
    move-object v7, p5

    .line 60
    invoke-static/range {v2 .. v7}, Lw11;->n0(I[BIILmq3;Lym3;)I

    .line 61
    .line 62
    .line 63
    move-result p3

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    move-object v3, p2

    .line 66
    move v5, p4

    .line 67
    move-object v7, p5

    .line 68
    invoke-static {v2, v3, v4, v5, v7}, Lw11;->o0(I[BIILym3;)I

    .line 69
    .line 70
    .line 71
    move-result p3

    .line 72
    goto :goto_0

    .line 73
    :cond_3
    move-object v3, p2

    .line 74
    move v5, p4

    .line 75
    move-object v7, p5

    .line 76
    const/4 p2, 0x0

    .line 77
    const/4 p3, 0x0

    .line 78
    :goto_1
    if-ge v4, v5, :cond_7

    .line 79
    .line 80
    invoke-static {v3, v4, v7}, Lw11;->Z([BILym3;)I

    .line 81
    .line 82
    .line 83
    move-result p4

    .line 84
    iget p5, v7, Lym3;->a:I

    .line 85
    .line 86
    ushr-int/lit8 v2, p5, 0x3

    .line 87
    .line 88
    and-int/lit8 v4, p5, 0x7

    .line 89
    .line 90
    if-eq v2, v1, :cond_5

    .line 91
    .line 92
    const/4 v8, 0x3

    .line 93
    if-eq v2, v8, :cond_4

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    if-ne v4, v1, :cond_6

    .line 97
    .line 98
    invoke-static {v3, p4, v7}, Lw11;->k0([BILym3;)I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    iget-object p2, v7, Lym3;->c:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p2, Lcn3;

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_5
    if-nez v4, :cond_6

    .line 108
    .line 109
    invoke-static {v3, p4, v7}, Lw11;->Z([BILym3;)I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    iget p3, v7, Lym3;->a:I

    .line 114
    .line 115
    invoke-virtual {p1, v0, p3}, Lon3;->b(Ltm3;I)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_6
    :goto_2
    const/16 v2, 0xc

    .line 120
    .line 121
    if-eq p5, v2, :cond_8

    .line 122
    .line 123
    invoke-static {p5, v3, p4, v5, v7}, Lw11;->o0(I[BIILym3;)I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    goto :goto_1

    .line 128
    :cond_7
    move p4, v4

    .line 129
    :cond_8
    if-eqz p2, :cond_9

    .line 130
    .line 131
    shl-int/lit8 p1, p3, 0x3

    .line 132
    .line 133
    or-int/2addr p1, v1

    .line 134
    invoke-virtual {v6, p1, p2}, Lmq3;->d(ILjava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :cond_9
    move p3, p4

    .line 138
    move-object p2, v3

    .line 139
    move p4, v5

    .line 140
    move-object p5, v7

    .line 141
    goto :goto_0

    .line 142
    :cond_a
    move v5, p4

    .line 143
    if-ne p3, v5, :cond_b

    .line 144
    .line 145
    return-void

    .line 146
    :cond_b
    invoke-static {}, Luo3;->c()Luo3;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    throw p0
.end method

.method public final c(Leo3;Leo3;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lvp3;->b:Lnq3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Leo3;->zzc:Lmq3;

    .line 7
    .line 8
    iget-object v1, p2, Leo3;->zzc:Lmq3;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lmq3;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_0
    iget-boolean p0, p0, Lvp3;->c:Z

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    check-cast p1, Lbo3;

    .line 23
    .line 24
    iget-object p0, p1, Lbo3;->zza:Lun3;

    .line 25
    .line 26
    check-cast p2, Lbo3;

    .line 27
    .line 28
    iget-object p1, p2, Lbo3;->zza:Lun3;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lun3;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0

    .line 35
    :cond_1
    const/4 p0, 0x1

    .line 36
    return p0
.end method

.method public final d(Leo3;)I
    .locals 8

    .line 1
    iget-object v0, p0, Lvp3;->b:Lnq3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Leo3;->zzc:Lmq3;

    .line 7
    .line 8
    iget v1, v0, Lmq3;->d:I

    .line 9
    .line 10
    const/4 v2, -0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    if-ne v1, v2, :cond_1

    .line 13
    .line 14
    move v1, v3

    .line 15
    move v2, v1

    .line 16
    :goto_0
    iget v4, v0, Lmq3;->a:I

    .line 17
    .line 18
    if-ge v2, v4, :cond_0

    .line 19
    .line 20
    iget-object v4, v0, Lmq3;->b:[I

    .line 21
    .line 22
    aget v4, v4, v2

    .line 23
    .line 24
    ushr-int/lit8 v4, v4, 0x3

    .line 25
    .line 26
    iget-object v5, v0, Lmq3;->c:[Ljava/lang/Object;

    .line 27
    .line 28
    aget-object v5, v5, v2

    .line 29
    .line 30
    check-cast v5, Lcn3;

    .line 31
    .line 32
    sget-object v6, Lkn3;->e:Ljava/util/logging/Logger;

    .line 33
    .line 34
    invoke-virtual {v5}, Lcn3;->c()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-static {v5}, Lkn3;->p(I)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    add-int/2addr v6, v5

    .line 43
    const/16 v5, 0x10

    .line 44
    .line 45
    invoke-static {v5}, Lkn3;->p(I)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    invoke-static {v4}, Lkn3;->p(I)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    const/16 v7, 0x8

    .line 54
    .line 55
    invoke-static {v7}, Lkn3;->p(I)I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    add-int/2addr v7, v7

    .line 60
    add-int/2addr v5, v4

    .line 61
    add-int/2addr v5, v7

    .line 62
    const/16 v4, 0x18

    .line 63
    .line 64
    invoke-static {v4, v6, v5, v1}, Lpm2;->o(IIII)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    add-int/lit8 v2, v2, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    iput v1, v0, Lmq3;->d:I

    .line 72
    .line 73
    :cond_1
    iget-boolean p0, p0, Lvp3;->c:Z

    .line 74
    .line 75
    if-eqz p0, :cond_6

    .line 76
    .line 77
    check-cast p1, Lbo3;

    .line 78
    .line 79
    iget-object p0, p1, Lbo3;->zza:Lun3;

    .line 80
    .line 81
    iget-object p0, p0, Lun3;->a:Lhq3;

    .line 82
    .line 83
    iget-object p1, p0, Lhq3;->b:Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    const/4 v0, 0x0

    .line 90
    if-gtz p1, :cond_4

    .line 91
    .line 92
    invoke-virtual {p0}, Lhq3;->b()Ljava/lang/Iterable;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-nez p1, :cond_2

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    check-cast p0, Ljava/util/Map$Entry;

    .line 112
    .line 113
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-eqz p1, :cond_3

    .line 118
    .line 119
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 120
    .line 121
    .line 122
    return v3

    .line 123
    :cond_3
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    throw v0

    .line 127
    :cond_4
    invoke-virtual {p0, v3}, Lhq3;->a(I)Ljava/util/Map$Entry;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    if-eqz p1, :cond_5

    .line 136
    .line 137
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 138
    .line 139
    .line 140
    return v3

    .line 141
    :cond_5
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    throw v0

    .line 145
    :cond_6
    :goto_1
    return v1
.end method

.method public final e(Ljava/lang/Object;Lpi3;)V
    .locals 8

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lbo3;

    .line 3
    .line 4
    iget-object v0, v0, Lbo3;->zza:Lun3;

    .line 5
    .line 6
    invoke-virtual {v0}, Lun3;->c()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lff2;

    .line 11
    .line 12
    invoke-virtual {v0}, Lff2;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_2

    .line 17
    .line 18
    iget-object p0, p0, Lvp3;->b:Lnq3;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast p1, Leo3;

    .line 24
    .line 25
    iget-object p0, p1, Leo3;->zzc:Lmq3;

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    :goto_0
    iget v0, p0, Lmq3;->a:I

    .line 29
    .line 30
    if-ge p1, v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Lmq3;->b:[I

    .line 33
    .line 34
    aget v0, v0, p1

    .line 35
    .line 36
    const/4 v1, 0x3

    .line 37
    ushr-int/2addr v0, v1

    .line 38
    iget-object v2, p0, Lmq3;->c:[Ljava/lang/Object;

    .line 39
    .line 40
    aget-object v2, v2, p1

    .line 41
    .line 42
    instance-of v3, v2, Lcn3;

    .line 43
    .line 44
    iget-object v4, p2, Lpi3;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v4, Lkn3;

    .line 47
    .line 48
    const/16 v5, 0xc

    .line 49
    .line 50
    const/4 v6, 0x2

    .line 51
    const/16 v7, 0xb

    .line 52
    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    check-cast v2, Lcn3;

    .line 56
    .line 57
    invoke-virtual {v4, v7}, Lkn3;->j(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v6, v0}, Lkn3;->c(II)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v1, v2}, Lkn3;->g(ILcn3;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v5}, Lkn3;->j(I)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_0
    check-cast v2, Ltm3;

    .line 71
    .line 72
    invoke-virtual {v4, v7}, Lkn3;->j(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, v6, v0}, Lkn3;->c(II)V

    .line 76
    .line 77
    .line 78
    const/16 v0, 0x1a

    .line 79
    .line 80
    invoke-virtual {v4, v0}, Lkn3;->j(I)V

    .line 81
    .line 82
    .line 83
    check-cast v2, Leo3;

    .line 84
    .line 85
    invoke-virtual {v2}, Leo3;->d()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-virtual {v4, v0}, Lkn3;->j(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v4}, Leo3;->j(Lkn3;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4, v5}, Lkn3;->j(I)V

    .line 96
    .line 97
    .line 98
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    return-void

    .line 102
    :cond_2
    invoke-virtual {v0}, Lff2;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    check-cast p0, Ljava/util/Map$Entry;

    .line 107
    .line 108
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public final zza()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p0, p0, Lvp3;->a:Ltm3;

    .line 2
    .line 3
    instance-of v0, p0, Leo3;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Leo3;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-virtual {p0, v0, v1}, Leo3;->l(ILeo3;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Leo3;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    check-cast p0, Leo3;

    .line 19
    .line 20
    const/4 v0, 0x5

    .line 21
    invoke-virtual {p0, v0, v1}, Leo3;->l(ILeo3;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lzn3;

    .line 26
    .line 27
    invoke-virtual {p0}, Lzn3;->c()Ltm3;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public final zzd(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lvp3;->b:Lnq3;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lcq3;->n(Lnq3;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lvp3;->c:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Lvp3;->d:Lqn3;

    .line 11
    .line 12
    invoke-static {p0, p1, p2}, Lcq3;->m(Lqn3;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final zzj(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lvp3;->b:Lnq3;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-object p0, p1

    .line 7
    check-cast p0, Leo3;

    .line 8
    .line 9
    iget-object p0, p0, Leo3;->zzc:Lmq3;

    .line 10
    .line 11
    iget-boolean v0, p0, Lmq3;->e:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lmq3;->e:Z

    .line 17
    .line 18
    :cond_0
    check-cast p1, Lbo3;

    .line 19
    .line 20
    iget-object p0, p1, Lbo3;->zza:Lun3;

    .line 21
    .line 22
    invoke-virtual {p0}, Lun3;->a()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final zzk(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lbo3;

    .line 2
    .line 3
    iget-object p0, p1, Lbo3;->zza:Lun3;

    .line 4
    .line 5
    invoke-virtual {p0}, Lun3;->d()V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0
.end method
