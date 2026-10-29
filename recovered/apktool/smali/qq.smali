.class public final Lqq;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lko;


# instance fields
.field public final U:Ljp;

.field public final V:Ljava/lang/Object;

.field public W:Z

.field public X:Lty;

.field public Y:Lwy2;

.field public Z:Llh2;

.field public final a:Lzp;

.field public final a0:Lg42;

.field public final b:Lzp;

.field public final b0:Lg42;

.field public final c:Lcb;

.field public final c0:Lxt0;

.field public final d:Lcz2;

.field public final d0:Lxt0;

.field public final e:Lhf;

.field public final f:Ljava/util/ArrayList;

.field public final i:Ljava/util/ArrayList;

.field public final v:Lkn;

.field public w:Ljava/util/List;


# direct methods
.method public constructor <init>(Lzp;Lzp;Lg42;Lg42;Lkn;Lcb;Ljo;)V
    .locals 2

    .line 1
    sget-object v0, Lxt0;->U:Lxt0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, Lqq;->f:Ljava/util/ArrayList;

    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lqq;->i:Ljava/util/ArrayList;

    .line 19
    .line 20
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 21
    .line 22
    iput-object v1, p0, Lqq;->w:Ljava/util/List;

    .line 23
    .line 24
    new-instance v1, Ljava/lang/Object;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lqq;->V:Ljava/lang/Object;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    iput-boolean v1, p0, Lqq;->W:Z

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    iput-object v1, p0, Lqq;->X:Lty;

    .line 36
    .line 37
    iput-object p1, p0, Lqq;->a:Lzp;

    .line 38
    .line 39
    iput-object p2, p0, Lqq;->b:Lzp;

    .line 40
    .line 41
    iput-object v0, p0, Lqq;->c0:Lxt0;

    .line 42
    .line 43
    iput-object v0, p0, Lqq;->d0:Lxt0;

    .line 44
    .line 45
    iput-object p5, p0, Lqq;->v:Lkn;

    .line 46
    .line 47
    iput-object p6, p0, Lqq;->c:Lcb;

    .line 48
    .line 49
    iput-object p7, p0, Lqq;->d:Lcz2;

    .line 50
    .line 51
    iget-object p1, p3, Lg42;->c:Ljp;

    .line 52
    .line 53
    iput-object p1, p0, Lqq;->U:Ljp;

    .line 54
    .line 55
    invoke-interface {p1}, Lhp;->u()V

    .line 56
    .line 57
    .line 58
    iput-object p3, p0, Lqq;->a0:Lg42;

    .line 59
    .line 60
    iput-object p4, p0, Lqq;->b0:Lg42;

    .line 61
    .line 62
    invoke-static {p3, p4}, Lqq;->s(Lg42;Lg42;)Lhf;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, Lqq;->e:Lhf;

    .line 67
    .line 68
    return-void
.end method

.method public static n(Landroid/graphics/Rect;Landroid/util/Size;)Landroid/graphics/Matrix;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    const-string v1, "Cannot compute viewport crop rects zero sized sensor rect."

    .line 17
    .line 18
    invoke-static {v1, v0}, Lde3;->e(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Landroid/graphics/RectF;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 24
    .line 25
    .line 26
    new-instance p0, Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-direct {p0}, Landroid/graphics/Matrix;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v1, Landroid/graphics/RectF;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    int-to-float v2, v2

    .line 38
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    int-to-float p1, p1

    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-direct {v1, v3, v3, v2, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 45
    .line 46
    .line 47
    sget-object p1, Landroid/graphics/Matrix$ScaleToFit;->CENTER:Landroid/graphics/Matrix$ScaleToFit;

    .line 48
    .line 49
    invoke-virtual {p0, v1, v0, p1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 53
    .line 54
    .line 55
    return-object p0
.end method

.method public static p()Lzv0;
    .locals 8

    .line 1
    new-instance v0, Lnr;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lnr;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v2, Lrm2;->D:Llf;

    .line 8
    .line 9
    iget-object v0, v0, Lnr;->b:Luk1;

    .line 10
    .line 11
    const-string v3, "ImageCapture-Extra"

    .line 12
    .line 13
    invoke-virtual {v0, v2, v3}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget-object v2, Law0;->d:Llf;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    :try_start_0
    invoke-virtual {v0, v2}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    goto :goto_0

    .line 27
    :catch_0
    move-object v2, v3

    .line 28
    :goto_0
    check-cast v2, Ljava/lang/Integer;

    .line 29
    .line 30
    const/4 v4, 0x1

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    sget-object v5, Lhw0;->o:Llf;

    .line 34
    .line 35
    invoke-virtual {v0, v5, v2}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_0
    sget-object v2, Lzv0;->x:Lxv0;

    .line 40
    .line 41
    sget-object v2, Law0;->e:Llf;

    .line 42
    .line 43
    :try_start_1
    invoke-virtual {v0, v2}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 47
    goto :goto_1

    .line 48
    :catch_1
    move-object v2, v3

    .line 49
    :goto_1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-static {v2, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    sget-object v2, Lhw0;->o:Llf;

    .line 60
    .line 61
    const/16 v5, 0x1005

    .line 62
    .line 63
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-virtual {v0, v2, v5}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object v2, Lhw0;->p:Llf;

    .line 71
    .line 72
    sget-object v5, Lmb0;->c:Lmb0;

    .line 73
    .line 74
    invoke-virtual {v0, v2, v5}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_1
    sget-object v2, Lhw0;->o:Llf;

    .line 79
    .line 80
    const/16 v5, 0x100

    .line 81
    .line 82
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-virtual {v0, v2, v5}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :goto_2
    new-instance v2, Law0;

    .line 90
    .line 91
    invoke-static {v0}, Lnq1;->d(Lty;)Lnq1;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-direct {v2, v5}, Law0;-><init>(Lnq1;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v2}, Ljw0;->y(Ljw0;)V

    .line 99
    .line 100
    .line 101
    new-instance v5, Lzv0;

    .line 102
    .line 103
    invoke-direct {v5, v2}, Lzv0;-><init>(Law0;)V

    .line 104
    .line 105
    .line 106
    sget-object v2, Ljw0;->u:Llf;

    .line 107
    .line 108
    :try_start_2
    invoke-virtual {v0, v2}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    .line 112
    goto :goto_3

    .line 113
    :catch_2
    move-object v2, v3

    .line 114
    :goto_3
    check-cast v2, Landroid/util/Size;

    .line 115
    .line 116
    if-eqz v2, :cond_2

    .line 117
    .line 118
    new-instance v6, Landroid/util/Rational;

    .line 119
    .line 120
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    invoke-direct {v6, v7, v2}, Landroid/util/Rational;-><init>(II)V

    .line 129
    .line 130
    .line 131
    :cond_2
    sget-object v2, Lvz0;->C:Llf;

    .line 132
    .line 133
    invoke-static {}, Lpg3;->n()Lwz0;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    :try_start_3
    invoke-virtual {v0, v2}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v6
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    .line 141
    :catch_3
    check-cast v6, Ljava/util/concurrent/Executor;

    .line 142
    .line 143
    const-string v2, "The IO executor can\'t be null"

    .line 144
    .line 145
    invoke-static {v6, v2}, Lde3;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    sget-object v2, Law0;->c:Llf;

    .line 149
    .line 150
    iget-object v6, v0, Lnq1;->a:Ljava/util/TreeMap;

    .line 151
    .line 152
    invoke-virtual {v6, v2}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    if-eqz v6, :cond_6

    .line 157
    .line 158
    invoke-virtual {v0, v2}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    check-cast v2, Ljava/lang/Integer;

    .line 163
    .line 164
    if-eqz v2, :cond_5

    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    const/4 v7, 0x3

    .line 171
    if-eqz v6, :cond_3

    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    if-eq v6, v4, :cond_3

    .line 178
    .line 179
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    if-eq v4, v7, :cond_3

    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    if-ne v4, v1, :cond_5

    .line 190
    .line 191
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-ne v1, v7, :cond_6

    .line 196
    .line 197
    sget-object v1, Law0;->w:Llf;

    .line 198
    .line 199
    :try_start_4
    invoke-virtual {v0, v1}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_4

    .line 203
    goto :goto_4

    .line 204
    :catch_4
    move-object v0, v3

    .line 205
    :goto_4
    if-eqz v0, :cond_4

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_4
    const-string v0, "The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash"

    .line 209
    .line 210
    invoke-static {v0}, Ln4;->j(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    return-object v3

    .line 214
    :cond_5
    const-string v0, "The flash mode is not allowed to set: "

    .line 215
    .line 216
    invoke-static {v2, v0}, Ls80;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    return-object v3

    .line 220
    :cond_6
    :goto_5
    return-object v5
.end method

.method public static s(Lg42;Lg42;)Lhf;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lam0;->a:Lxp;

    .line 7
    .line 8
    invoke-interface {v1}, Lxp;->b()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const-string p1, ""

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object p1, p1, Lam0;->a:Lxp;

    .line 21
    .line 22
    invoke-interface {p1}, Lxp;->b()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object p0, p0, Lg42;->c:Ljp;

    .line 34
    .line 35
    iget-object p0, p0, Ljp;->a:Lwf;

    .line 36
    .line 37
    new-instance v0, Lhf;

    .line 38
    .line 39
    invoke-direct {v0, p1, p0}, Lhf;-><init>(Ljava/lang/String;Lwf;)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public static t(Ljava/util/ArrayList;Lcz2;Lcz2;)Ljava/util/HashMap;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lwy2;

    .line 21
    .line 22
    instance-of v2, v1, Llh2;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    move-object v2, v1

    .line 28
    check-cast v2, Llh2;

    .line 29
    .line 30
    new-instance v4, Lnr;

    .line 31
    .line 32
    const/4 v5, 0x3

    .line 33
    invoke-direct {v4, v5}, Lnr;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4}, Lnr;->a()Lvw1;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v4, v3, p1}, Lvw1;->e(ZLcz2;)Lzy2;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    if-nez v3, :cond_0

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    invoke-static {v3}, Luk1;->m(Lty;)Luk1;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    sget-object v4, Lrm2;->E:Llf;

    .line 53
    .line 54
    iget-object v5, v3, Lnq1;->a:Ljava/util/TreeMap;

    .line 55
    .line 56
    invoke-virtual {v5, v4}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v3}, Llh2;->j(Lty;)Lyy2;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Lwq;

    .line 64
    .line 65
    invoke-virtual {v2}, Lwq;->o()Lzy2;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-virtual {v1, v3, p1}, Lwy2;->e(ZLcz2;)Lzy2;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    :goto_1
    const/4 v3, 0x1

    .line 75
    invoke-virtual {v1, v3, p2}, Lwy2;->e(ZLcz2;)Lzy2;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    new-instance v4, Lpq;

    .line 80
    .line 81
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object v2, v4, Lpq;->a:Lzy2;

    .line 85
    .line 86
    iput-object v3, v4, Lpq;->b:Lzy2;

    .line 87
    .line 88
    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    return-object v0
.end method

.method public static x(Lpg;Lfb2;)Z
    .locals 3

    .line 1
    iget-object p0, p0, Lpg;->d:Lty;

    .line 2
    .line 3
    iget-object v0, p1, Lfb2;->g:Ljr;

    .line 4
    .line 5
    iget-object v0, v0, Ljr;->b:Lnq1;

    .line 6
    .line 7
    invoke-interface {p0}, Lty;->c()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, Ljava/util/Set;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object p1, p1, Lfb2;->g:Ljr;

    .line 16
    .line 17
    iget-object p1, p1, Ljr;->b:Lnq1;

    .line 18
    .line 19
    invoke-virtual {p1}, Lnq1;->c()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eq v1, p1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-interface {p0}, Lty;->c()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Llf;

    .line 49
    .line 50
    iget-object v2, v0, Lnq1;->a:Ljava/util/TreeMap;

    .line 51
    .line 52
    invoke-virtual {v2, v1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-interface {p0, v1}, Lty;->e(Llf;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {v2, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_1

    .line 71
    .line 72
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 73
    return p0

    .line 74
    :cond_3
    const/4 p0, 0x0

    .line 75
    return p0
.end method

.method public static z(Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lwy2;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {v1}, Lfm0;->f(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    throw p0

    .line 41
    :cond_1
    return-object v0
.end method


# virtual methods
.method public final A(Ljava/util/LinkedHashSet;Z)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    iget-object v8, v1, Lqq;->V:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v8

    .line 8
    :try_start_0
    invoke-virtual {v1}, Lqq;->w()V

    .line 9
    .line 10
    .line 11
    iget-object v2, v1, Lqq;->V:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    :try_start_1
    iget-object v0, v1, Lqq;->w:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v9, 0x0

    .line 21
    const/4 v10, 0x1

    .line 22
    if-nez v0, :cond_4

    .line 23
    .line 24
    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lwy2;

    .line 39
    .line 40
    instance-of v4, v3, Lzv0;

    .line 41
    .line 42
    if-nez v4, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget-object v3, v3, Lwy2;->f:Lzy2;

    .line 46
    .line 47
    sget-object v4, Law0;->e:Llf;

    .line 48
    .line 49
    invoke-interface {v3, v4}, Lx02;->h(Llf;)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_0

    .line 54
    .line 55
    invoke-interface {v3, v4}, Lx02;->e(Llf;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Ljava/lang/Integer;

    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-ne v3, v10, :cond_0

    .line 69
    .line 70
    move v0, v10

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    move v0, v9

    .line 73
    :goto_1
    if-nez v0, :cond_3

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 77
    .line 78
    const-string v1, "Ultra HDR image capture does not support for use with CameraEffect."

    .line 79
    .line 80
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    goto/16 :goto_f

    .line 86
    .line 87
    :cond_4
    :goto_2
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    if-nez p2, :cond_5

    .line 89
    .line 90
    :try_start_2
    invoke-virtual {v1}, Lqq;->w()V

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :catchall_1
    move-exception v0

    .line 95
    goto/16 :goto_10

    .line 96
    .line 97
    :cond_5
    :goto_3
    invoke-virtual/range {p0 .. p2}, Lqq;->q(Ljava/util/LinkedHashSet;Z)Llh2;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v1, v7, v0}, Lqq;->g(Ljava/util/LinkedHashSet;Llh2;)Lwy2;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    new-instance v12, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {v12, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 108
    .line 109
    .line 110
    if-eqz v11, :cond_6

    .line 111
    .line 112
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    :cond_6
    if-eqz v0, :cond_7

    .line 116
    .line 117
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    iget-object v2, v0, Llh2;->p:Ls53;

    .line 121
    .line 122
    iget-object v2, v2, Ls53;->a:Ljava/util/HashSet;

    .line 123
    .line 124
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 125
    .line 126
    .line 127
    :cond_7
    new-instance v4, Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-direct {v4, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 130
    .line 131
    .line 132
    iget-object v2, v1, Lqq;->i:Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 135
    .line 136
    .line 137
    new-instance v5, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-direct {v5, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 140
    .line 141
    .line 142
    iget-object v2, v1, Lqq;->i:Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->retainAll(Ljava/util/Collection;)Z

    .line 145
    .line 146
    .line 147
    new-instance v13, Ljava/util/ArrayList;

    .line 148
    .line 149
    iget-object v2, v1, Lqq;->i:Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-direct {v13, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 155
    .line 156
    .line 157
    iget-object v2, v1, Lqq;->U:Ljp;

    .line 158
    .line 159
    sget-object v3, Lhp;->h:Llf;

    .line 160
    .line 161
    sget-object v6, Lcz2;->a:Laz2;

    .line 162
    .line 163
    invoke-interface {v2, v3, v6}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    check-cast v2, Lcz2;

    .line 168
    .line 169
    iget-object v3, v1, Lqq;->d:Lcz2;

    .line 170
    .line 171
    invoke-static {v4, v2, v3}, Lqq;->t(Ljava/util/ArrayList;Lcz2;Lcz2;)Ljava/util/HashMap;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    sget-object v14, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 176
    .line 177
    const/4 v15, 0x2

    .line 178
    :try_start_3
    iget-object v2, v1, Lqq;->V:Ljava/lang/Object;

    .line 179
    .line 180
    monitor-enter v2
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 181
    :try_start_4
    iget-object v3, v1, Lqq;->v:Lkn;

    .line 182
    .line 183
    iget v3, v3, Lkn;->b:I

    .line 184
    .line 185
    if-ne v3, v15, :cond_8

    .line 186
    .line 187
    monitor-exit v2

    .line 188
    move v2, v10

    .line 189
    goto :goto_4

    .line 190
    :catchall_2
    move-exception v0

    .line 191
    goto/16 :goto_d

    .line 192
    .line 193
    :cond_8
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 194
    move v2, v9

    .line 195
    :goto_4
    :try_start_5
    iget-object v3, v1, Lqq;->a:Lzp;

    .line 196
    .line 197
    invoke-interface {v3}, Lzp;->m()Lxp;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    invoke-virtual/range {v1 .. v6}, Lqq;->o(ILxp;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/HashMap;)Ljava/util/HashMap;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    iget-object v3, v1, Lqq;->b:Lzp;

    .line 206
    .line 207
    if-eqz v3, :cond_a

    .line 208
    .line 209
    iget-object v3, v1, Lqq;->V:Ljava/lang/Object;

    .line 210
    .line 211
    monitor-enter v3
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 212
    :try_start_6
    iget-object v14, v1, Lqq;->v:Lkn;

    .line 213
    .line 214
    iget v14, v14, Lkn;->b:I

    .line 215
    .line 216
    if-ne v14, v15, :cond_9

    .line 217
    .line 218
    monitor-exit v3

    .line 219
    move v9, v10

    .line 220
    goto :goto_5

    .line 221
    :catchall_3
    move-exception v0

    .line 222
    goto :goto_6

    .line 223
    :cond_9
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 224
    :goto_5
    :try_start_7
    iget-object v3, v1, Lqq;->b:Lzp;

    .line 225
    .line 226
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    invoke-interface {v3}, Lzp;->m()Lxp;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    move/from16 v16, v9

    .line 234
    .line 235
    move-object v9, v2

    .line 236
    move/from16 v2, v16

    .line 237
    .line 238
    invoke-virtual/range {v1 .. v6}, Lqq;->o(ILxp;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/HashMap;)Ljava/util/HashMap;

    .line 239
    .line 240
    .line 241
    move-result-object v14
    :try_end_7
    .catch Ljava/lang/IllegalArgumentException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 242
    goto :goto_7

    .line 243
    :catch_0
    move-exception v0

    .line 244
    goto/16 :goto_e

    .line 245
    .line 246
    :goto_6
    :try_start_8
    monitor-exit v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 247
    :try_start_9
    throw v0
    :try_end_9
    .catch Ljava/lang/IllegalArgumentException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 248
    :cond_a
    move-object v9, v2

    .line 249
    :goto_7
    :try_start_a
    invoke-virtual {v1, v9, v12}, Lqq;->B(Ljava/util/HashMap;Ljava/util/ArrayList;)V

    .line 250
    .line 251
    .line 252
    iget-object v2, v1, Lqq;->w:Ljava/util/List;

    .line 253
    .line 254
    invoke-static {v12, v2}, Lqq;->z(Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/ArrayList;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    new-instance v3, Ljava/util/ArrayList;

    .line 259
    .line 260
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 264
    .line 265
    .line 266
    invoke-static {v3, v2}, Lqq;->z(Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/ArrayList;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    if-lez v3, :cond_b

    .line 275
    .line 276
    const-string v3, "CameraUseCaseAdapter"

    .line 277
    .line 278
    new-instance v10, Ljava/lang/StringBuilder;

    .line 279
    .line 280
    const-string v15, "Unused effects: "

    .line 281
    .line 282
    invoke-direct {v10, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    invoke-static {v3, v2}, Lhu0;->H0(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    :cond_b
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 300
    .line 301
    .line 302
    move-result v3

    .line 303
    if-eqz v3, :cond_c

    .line 304
    .line 305
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    check-cast v3, Lwy2;

    .line 310
    .line 311
    iget-object v10, v1, Lqq;->a:Lzp;

    .line 312
    .line 313
    invoke-virtual {v3, v10}, Lwy2;->z(Lzp;)V

    .line 314
    .line 315
    .line 316
    goto :goto_8

    .line 317
    :cond_c
    iget-object v2, v1, Lqq;->a:Lzp;

    .line 318
    .line 319
    invoke-interface {v2, v13}, Lzp;->i(Ljava/util/ArrayList;)V

    .line 320
    .line 321
    .line 322
    iget-object v2, v1, Lqq;->b:Lzp;

    .line 323
    .line 324
    if-eqz v2, :cond_e

    .line 325
    .line 326
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 331
    .line 332
    .line 333
    move-result v3

    .line 334
    if-eqz v3, :cond_d

    .line 335
    .line 336
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    check-cast v3, Lwy2;

    .line 341
    .line 342
    iget-object v10, v1, Lqq;->b:Lzp;

    .line 343
    .line 344
    invoke-static {v10}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v3, v10}, Lwy2;->z(Lzp;)V

    .line 348
    .line 349
    .line 350
    goto :goto_9

    .line 351
    :cond_d
    iget-object v2, v1, Lqq;->b:Lzp;

    .line 352
    .line 353
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    invoke-interface {v2, v13}, Lzp;->i(Ljava/util/ArrayList;)V

    .line 357
    .line 358
    .line 359
    :cond_e
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 360
    .line 361
    .line 362
    move-result v2

    .line 363
    if-eqz v2, :cond_10

    .line 364
    .line 365
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    :cond_f
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 370
    .line 371
    .line 372
    move-result v3

    .line 373
    if-eqz v3, :cond_10

    .line 374
    .line 375
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    check-cast v3, Lwy2;

    .line 380
    .line 381
    invoke-virtual {v9, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v5

    .line 385
    if-eqz v5, :cond_f

    .line 386
    .line 387
    invoke-virtual {v9, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v5

    .line 391
    check-cast v5, Lpg;

    .line 392
    .line 393
    iget-object v10, v5, Lpg;->d:Lty;

    .line 394
    .line 395
    if-eqz v10, :cond_f

    .line 396
    .line 397
    iget-object v13, v3, Lwy2;->m:Lfb2;

    .line 398
    .line 399
    invoke-static {v5, v13}, Lqq;->x(Lpg;Lfb2;)Z

    .line 400
    .line 401
    .line 402
    move-result v5

    .line 403
    if-eqz v5, :cond_f

    .line 404
    .line 405
    invoke-virtual {v3, v10}, Lwy2;->u(Lty;)Lpg;

    .line 406
    .line 407
    .line 408
    move-result-object v5

    .line 409
    iput-object v5, v3, Lwy2;->g:Lpg;

    .line 410
    .line 411
    iget-boolean v5, v1, Lqq;->W:Z

    .line 412
    .line 413
    if-eqz v5, :cond_f

    .line 414
    .line 415
    iget-object v5, v1, Lqq;->a:Lzp;

    .line 416
    .line 417
    invoke-interface {v5, v3}, Lvy2;->g(Lwy2;)V

    .line 418
    .line 419
    .line 420
    iget-object v5, v1, Lqq;->b:Lzp;

    .line 421
    .line 422
    if-eqz v5, :cond_f

    .line 423
    .line 424
    invoke-interface {v5, v3}, Lvy2;->g(Lwy2;)V

    .line 425
    .line 426
    .line 427
    goto :goto_a

    .line 428
    :cond_10
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    if-eqz v3, :cond_12

    .line 437
    .line 438
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    check-cast v3, Lwy2;

    .line 443
    .line 444
    invoke-virtual {v6, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v5

    .line 448
    check-cast v5, Lpq;

    .line 449
    .line 450
    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    iget-object v10, v1, Lqq;->b:Lzp;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 454
    .line 455
    iget-object v13, v1, Lqq;->a:Lzp;

    .line 456
    .line 457
    if-eqz v10, :cond_11

    .line 458
    .line 459
    :try_start_b
    iget-object v15, v5, Lpq;->a:Lzy2;

    .line 460
    .line 461
    iget-object v5, v5, Lpq;->b:Lzy2;

    .line 462
    .line 463
    invoke-virtual {v3, v13, v10, v15, v5}, Lwy2;->a(Lzp;Lzp;Lzy2;Lzy2;)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v9, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v5

    .line 470
    check-cast v5, Lpg;

    .line 471
    .line 472
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v10

    .line 479
    check-cast v10, Lpg;

    .line 480
    .line 481
    invoke-virtual {v3, v5, v10}, Lwy2;->v(Lpg;Lpg;)Lpg;

    .line 482
    .line 483
    .line 484
    move-result-object v5

    .line 485
    iput-object v5, v3, Lwy2;->g:Lpg;

    .line 486
    .line 487
    goto :goto_b

    .line 488
    :cond_11
    iget-object v10, v5, Lpq;->a:Lzy2;

    .line 489
    .line 490
    iget-object v5, v5, Lpq;->b:Lzy2;

    .line 491
    .line 492
    const/4 v15, 0x0

    .line 493
    invoke-virtual {v3, v13, v15, v10, v5}, Lwy2;->a(Lzp;Lzp;Lzy2;Lzy2;)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v9, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v5

    .line 500
    check-cast v5, Lpg;

    .line 501
    .line 502
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v3, v5, v15}, Lwy2;->v(Lpg;Lpg;)Lpg;

    .line 506
    .line 507
    .line 508
    move-result-object v5

    .line 509
    iput-object v5, v3, Lwy2;->g:Lpg;

    .line 510
    .line 511
    goto :goto_b

    .line 512
    :cond_12
    iget-boolean v2, v1, Lqq;->W:Z

    .line 513
    .line 514
    if-eqz v2, :cond_13

    .line 515
    .line 516
    iget-object v2, v1, Lqq;->a:Lzp;

    .line 517
    .line 518
    invoke-interface {v2, v4}, Lzp;->j(Ljava/util/ArrayList;)V

    .line 519
    .line 520
    .line 521
    iget-object v2, v1, Lqq;->b:Lzp;

    .line 522
    .line 523
    if-eqz v2, :cond_13

    .line 524
    .line 525
    invoke-interface {v2, v4}, Lzp;->j(Ljava/util/ArrayList;)V

    .line 526
    .line 527
    .line 528
    :cond_13
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 533
    .line 534
    .line 535
    move-result v3

    .line 536
    if-eqz v3, :cond_14

    .line 537
    .line 538
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    check-cast v3, Lwy2;

    .line 543
    .line 544
    invoke-virtual {v3}, Lwy2;->o()V

    .line 545
    .line 546
    .line 547
    goto :goto_c

    .line 548
    :cond_14
    iget-object v2, v1, Lqq;->f:Ljava/util/ArrayList;

    .line 549
    .line 550
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 551
    .line 552
    .line 553
    iget-object v2, v1, Lqq;->f:Ljava/util/ArrayList;

    .line 554
    .line 555
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 556
    .line 557
    .line 558
    iget-object v2, v1, Lqq;->i:Ljava/util/ArrayList;

    .line 559
    .line 560
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 561
    .line 562
    .line 563
    iget-object v2, v1, Lqq;->i:Ljava/util/ArrayList;

    .line 564
    .line 565
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 566
    .line 567
    .line 568
    iput-object v11, v1, Lqq;->Y:Lwy2;

    .line 569
    .line 570
    iput-object v0, v1, Lqq;->Z:Llh2;

    .line 571
    .line 572
    monitor-exit v8
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 573
    return-void

    .line 574
    :goto_d
    :try_start_c
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 575
    :try_start_d
    throw v0
    :try_end_d
    .catch Ljava/lang/IllegalArgumentException; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 576
    :goto_e
    if-nez p2, :cond_15

    .line 577
    .line 578
    :try_start_e
    invoke-virtual {v1}, Lqq;->w()V

    .line 579
    .line 580
    .line 581
    iget-object v2, v1, Lqq;->v:Lkn;

    .line 582
    .line 583
    iget v2, v2, Lkn;->b:I

    .line 584
    .line 585
    if-eq v2, v15, :cond_15

    .line 586
    .line 587
    invoke-virtual {v1, v7, v10}, Lqq;->A(Ljava/util/LinkedHashSet;Z)V

    .line 588
    .line 589
    .line 590
    monitor-exit v8

    .line 591
    return-void

    .line 592
    :cond_15
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 593
    :goto_f
    :try_start_f
    monitor-exit v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 594
    :try_start_10
    throw v0

    .line 595
    :goto_10
    monitor-exit v8
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    .line 596
    throw v0
.end method

.method public final B(Ljava/util/HashMap;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lqq;->V:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lwy2;

    .line 19
    .line 20
    iget-object v2, p0, Lqq;->a:Lzp;

    .line 21
    .line 22
    invoke-interface {v2}, Lzp;->e()Lnp;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-interface {v2}, Lnp;->b()Landroid/graphics/Rect;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lpg;

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object v3, v3, Lpg;->a:Landroid/util/Size;

    .line 40
    .line 41
    invoke-static {v2, v3}, Lqq;->n(Landroid/graphics/Rect;Landroid/util/Size;)Landroid/graphics/Matrix;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v1, v2}, Lwy2;->x(Landroid/graphics/Matrix;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    monitor-exit v0

    .line 52
    return-void

    .line 53
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    throw p0
.end method

.method public final a()Lxp;
    .locals 0

    .line 1
    iget-object p0, p0, Lqq;->a0:Lg42;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b(Ljava/util/Collection;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lqq;->V:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lqq;->a:Lzp;

    .line 5
    .line 6
    iget-object v2, p0, Lqq;->U:Ljp;

    .line 7
    .line 8
    invoke-interface {v1, v2}, Lzp;->c(Ljp;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lqq;->b:Lzp;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v2, p0, Lqq;->U:Ljp;

    .line 16
    .line 17
    invoke-interface {v1, v2}, Lzp;->c(Ljp;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_2

    .line 23
    :cond_0
    :goto_0
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    iget-object v2, p0, Lqq;->f:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v1, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    :try_start_1
    iget-object p1, p0, Lqq;->b:Lzp;

    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/4 p1, 0x0

    .line 40
    :goto_1
    invoke-virtual {p0, v1, p1}, Lqq;->A(Ljava/util/LinkedHashSet;Z)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    .line 42
    .line 43
    :try_start_2
    monitor-exit v0

    .line 44
    return-void

    .line 45
    :catch_0
    move-exception p0

    .line 46
    new-instance p1, Loq;

    .line 47
    .line 48
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 53
    throw p0
.end method

.method public final d()V
    .locals 4

    .line 1
    iget-object v0, p0, Lqq;->V:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lqq;->W:Z

    .line 5
    .line 6
    if-nez v1, :cond_4

    .line 7
    .line 8
    iget-object v1, p0, Lqq;->i:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lqq;->a:Lzp;

    .line 17
    .line 18
    iget-object v2, p0, Lqq;->U:Ljp;

    .line 19
    .line 20
    invoke-interface {v1, v2}, Lzp;->c(Ljp;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lqq;->b:Lzp;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget-object v2, p0, Lqq;->U:Ljp;

    .line 28
    .line 29
    invoke-interface {v1, v2}, Lzp;->c(Ljp;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_5

    .line 35
    :cond_0
    :goto_0
    iget-object v1, p0, Lqq;->a:Lzp;

    .line 36
    .line 37
    iget-object v2, p0, Lqq;->i:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-interface {v1, v2}, Lzp;->j(Ljava/util/ArrayList;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lqq;->b:Lzp;

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    iget-object v2, p0, Lqq;->i:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-interface {v1, v2}, Lzp;->j(Ljava/util/ArrayList;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    iget-object v1, p0, Lqq;->V:Ljava/lang/Object;

    .line 52
    .line 53
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    :try_start_1
    iget-object v2, p0, Lqq;->X:Lty;

    .line 55
    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    iget-object v2, p0, Lqq;->a:Lzp;

    .line 59
    .line 60
    invoke-interface {v2}, Lzp;->e()Lnp;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iget-object v3, p0, Lqq;->X:Lty;

    .line 65
    .line 66
    invoke-interface {v2, v3}, Lnp;->a(Lty;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :catchall_1
    move-exception p0

    .line 71
    goto :goto_3

    .line 72
    :cond_2
    :goto_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    :try_start_2
    iget-object v1, p0, Lqq;->i:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_3

    .line 84
    .line 85
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, Lwy2;

    .line 90
    .line 91
    invoke-virtual {v2}, Lwy2;->o()V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    const/4 v1, 0x1

    .line 96
    iput-boolean v1, p0, Lqq;->W:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :goto_3
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 100
    :try_start_4
    throw p0

    .line 101
    :cond_4
    :goto_4
    monitor-exit v0

    .line 102
    return-void

    .line 103
    :goto_5
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 104
    throw p0
.end method

.method public final g(Ljava/util/LinkedHashSet;Llh2;)Lwy2;
    .locals 7

    .line 1
    iget-object v0, p0, Lqq;->V:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 7
    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    iget-object p1, p2, Llh2;->p:Ls53;

    .line 15
    .line 16
    iget-object p1, p1, Ls53;->a:Ljava/util/HashSet;

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto/16 :goto_7

    .line 24
    .line 25
    :cond_0
    :goto_0
    iget-object p1, p0, Lqq;->V:Ljava/lang/Object;

    .line 26
    .line 27
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    :try_start_1
    iget-object p2, p0, Lqq;->U:Ljp;

    .line 29
    .line 30
    sget-object v2, Lhp;->j:Llf;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-interface {p2, v2, v4}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    check-cast p2, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    const/4 v2, 0x1

    .line 48
    if-ne p2, v2, :cond_1

    .line 49
    .line 50
    move p2, v2

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move p2, v3

    .line 53
    :goto_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 54
    if-eqz p2, :cond_d

    .line 55
    .line 56
    :try_start_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    move p2, v3

    .line 61
    move v4, p2

    .line 62
    :cond_2
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_5

    .line 67
    .line 68
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    check-cast v5, Lwy2;

    .line 73
    .line 74
    instance-of v6, v5, Lvw1;

    .line 75
    .line 76
    if-nez v6, :cond_4

    .line 77
    .line 78
    instance-of v6, v5, Llh2;

    .line 79
    .line 80
    if-eqz v6, :cond_3

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    instance-of v5, v5, Lzv0;

    .line 84
    .line 85
    if-eqz v5, :cond_2

    .line 86
    .line 87
    move p2, v2

    .line 88
    goto :goto_2

    .line 89
    :cond_4
    :goto_3
    move v4, v2

    .line 90
    goto :goto_2

    .line 91
    :cond_5
    if-eqz p2, :cond_7

    .line 92
    .line 93
    if-nez v4, :cond_7

    .line 94
    .line 95
    iget-object p0, p0, Lqq;->Y:Lwy2;

    .line 96
    .line 97
    instance-of p1, p0, Lvw1;

    .line 98
    .line 99
    if-eqz p1, :cond_6

    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_6
    new-instance p0, Lnr;

    .line 103
    .line 104
    const/4 p1, 0x3

    .line 105
    invoke-direct {p0, p1}, Lnr;-><init>(I)V

    .line 106
    .line 107
    .line 108
    const-string p1, "Preview-Extra"

    .line 109
    .line 110
    iget-object p2, p0, Lnr;->b:Luk1;

    .line 111
    .line 112
    sget-object v1, Lrm2;->D:Llf;

    .line 113
    .line 114
    invoke-virtual {p2, v1, p1}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Lnr;->a()Lvw1;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    new-instance p1, Ln4;

    .line 122
    .line 123
    const/16 p2, 0x14

    .line 124
    .line 125
    invoke-direct {p1, p2}, Ln4;-><init>(I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, p1}, Lvw1;->D(Luw1;)V

    .line 129
    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    move p2, v3

    .line 137
    :cond_8
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_b

    .line 142
    .line 143
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    check-cast v1, Lwy2;

    .line 148
    .line 149
    instance-of v4, v1, Lvw1;

    .line 150
    .line 151
    if-nez v4, :cond_a

    .line 152
    .line 153
    instance-of v4, v1, Llh2;

    .line 154
    .line 155
    if-eqz v4, :cond_9

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_9
    instance-of v1, v1, Lzv0;

    .line 159
    .line 160
    if-eqz v1, :cond_8

    .line 161
    .line 162
    move p2, v2

    .line 163
    goto :goto_4

    .line 164
    :cond_a
    :goto_5
    move v3, v2

    .line 165
    goto :goto_4

    .line 166
    :cond_b
    if-eqz v3, :cond_d

    .line 167
    .line 168
    if-nez p2, :cond_d

    .line 169
    .line 170
    iget-object p0, p0, Lqq;->Y:Lwy2;

    .line 171
    .line 172
    instance-of p1, p0, Lzv0;

    .line 173
    .line 174
    if-eqz p1, :cond_c

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_c
    invoke-static {}, Lqq;->p()Lzv0;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    goto :goto_6

    .line 182
    :cond_d
    const/4 p0, 0x0

    .line 183
    :goto_6
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 184
    return-object p0

    .line 185
    :catchall_1
    move-exception p0

    .line 186
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 187
    :try_start_4
    throw p0

    .line 188
    :goto_7
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 189
    throw p0
.end method

.method public final o(ILxp;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/HashMap;)Ljava/util/HashMap;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {v1}, Lxp;->b()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v6

    .line 14
    new-instance v7, Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v8, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual/range {p4 .. p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    iget-object v5, v0, Lqq;->c:Lcb;

    .line 33
    .line 34
    const/4 v9, 0x0

    .line 35
    if-eqz v4, :cond_3

    .line 36
    .line 37
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Lwy2;

    .line 42
    .line 43
    iget-object v10, v4, Lwy2;->f:Lzy2;

    .line 44
    .line 45
    invoke-interface {v10}, Lhw0;->l()I

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    iget-object v11, v4, Lwy2;->g:Lpg;

    .line 50
    .line 51
    if-eqz v11, :cond_0

    .line 52
    .line 53
    iget-object v11, v11, Lpg;->a:Landroid/util/Size;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    move-object v11, v9

    .line 57
    :goto_1
    iget-object v5, v5, Lcb;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v5, Ljava/util/HashMap;

    .line 60
    .line 61
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    check-cast v5, Lcj2;

    .line 66
    .line 67
    if-eqz v5, :cond_1

    .line 68
    .line 69
    invoke-virtual {v5, v10}, Lcj2;->i(I)Lwg;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    move/from16 v12, p1

    .line 74
    .line 75
    invoke-static {v12, v10, v11, v5}, Lrg;->b(IILandroid/util/Size;Lwg;)Lrg;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    move-object v14, v5

    .line 80
    goto :goto_2

    .line 81
    :cond_1
    move/from16 v12, p1

    .line 82
    .line 83
    move-object v14, v9

    .line 84
    :goto_2
    iget-object v5, v4, Lwy2;->f:Lzy2;

    .line 85
    .line 86
    invoke-interface {v5}, Lhw0;->l()I

    .line 87
    .line 88
    .line 89
    move-result v15

    .line 90
    iget-object v5, v4, Lwy2;->g:Lpg;

    .line 91
    .line 92
    if-eqz v5, :cond_2

    .line 93
    .line 94
    iget-object v10, v5, Lpg;->a:Landroid/util/Size;

    .line 95
    .line 96
    move-object/from16 v16, v10

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_2
    move-object/from16 v16, v9

    .line 100
    .line 101
    :goto_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget-object v5, v5, Lpg;->b:Lmb0;

    .line 105
    .line 106
    invoke-static {v4}, Llh2;->F(Lwy2;)Ljava/util/ArrayList;

    .line 107
    .line 108
    .line 109
    move-result-object v18

    .line 110
    iget-object v10, v4, Lwy2;->g:Lpg;

    .line 111
    .line 112
    iget-object v10, v10, Lpg;->d:Lty;

    .line 113
    .line 114
    iget-object v11, v4, Lwy2;->f:Lzy2;

    .line 115
    .line 116
    sget-object v13, Lzy2;->L:Llf;

    .line 117
    .line 118
    invoke-interface {v11, v13, v9}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    move-object/from16 v20, v9

    .line 123
    .line 124
    check-cast v20, Landroid/util/Range;

    .line 125
    .line 126
    new-instance v13, Laf;

    .line 127
    .line 128
    move-object/from16 v17, v5

    .line 129
    .line 130
    move-object/from16 v19, v10

    .line 131
    .line 132
    invoke-direct/range {v13 .. v20}, Laf;-><init>(Lrg;ILandroid/util/Size;Lmb0;Ljava/util/List;Lty;Landroid/util/Range;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    invoke-virtual {v8, v13, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    iget-object v5, v4, Lwy2;->g:Lpg;

    .line 142
    .line 143
    invoke-virtual {v7, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_3
    move/from16 v12, p1

    .line 148
    .line 149
    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-nez v3, :cond_e

    .line 154
    .line 155
    new-instance v10, Ljava/util/HashMap;

    .line 156
    .line 157
    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 158
    .line 159
    .line 160
    new-instance v3, Ljava/util/HashMap;

    .line 161
    .line 162
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 163
    .line 164
    .line 165
    :try_start_0
    iget-object v0, v0, Lqq;->a:Lzp;

    .line 166
    .line 167
    invoke-interface {v0}, Lzp;->e()Lnp;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-interface {v0}, Lnp;->b()Landroid/graphics/Rect;

    .line 172
    .line 173
    .line 174
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 175
    goto :goto_4

    .line 176
    :catch_0
    move-object v0, v9

    .line 177
    :goto_4
    new-instance v4, Lac1;

    .line 178
    .line 179
    if-eqz v0, :cond_4

    .line 180
    .line 181
    invoke-static {v0}, Lcr2;->d(Landroid/graphics/Rect;)Landroid/util/Size;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    goto :goto_5

    .line 186
    :cond_4
    move-object v0, v9

    .line 187
    :goto_5
    invoke-direct {v4, v1, v0}, Lac1;-><init>(Lxp;Landroid/util/Size;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    const/4 v13, 0x0

    .line 195
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v14

    .line 199
    if-eqz v14, :cond_7

    .line 200
    .line 201
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v14

    .line 205
    check-cast v14, Lwy2;

    .line 206
    .line 207
    move-object/from16 p4, v9

    .line 208
    .line 209
    move-object/from16 v9, p5

    .line 210
    .line 211
    invoke-virtual {v9, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v16

    .line 215
    move-object/from16 v11, v16

    .line 216
    .line 217
    check-cast v11, Lpq;

    .line 218
    .line 219
    const/16 v16, 0x1

    .line 220
    .line 221
    iget-object v15, v11, Lpq;->a:Lzy2;

    .line 222
    .line 223
    iget-object v11, v11, Lpq;->b:Lzy2;

    .line 224
    .line 225
    invoke-virtual {v14, v1, v15, v11}, Lwy2;->l(Lxp;Lzy2;Lzy2;)Lzy2;

    .line 226
    .line 227
    .line 228
    move-result-object v11

    .line 229
    invoke-virtual {v10, v11, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v4, v11}, Lac1;->v(Lzy2;)Ljava/util/ArrayList;

    .line 233
    .line 234
    .line 235
    move-result-object v15

    .line 236
    invoke-virtual {v3, v11, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    iget-object v11, v14, Lwy2;->f:Lzy2;

    .line 240
    .line 241
    instance-of v14, v11, Lww1;

    .line 242
    .line 243
    if-eqz v14, :cond_6

    .line 244
    .line 245
    check-cast v11, Lww1;

    .line 246
    .line 247
    invoke-interface {v11}, Lzy2;->v()I

    .line 248
    .line 249
    .line 250
    move-result v11

    .line 251
    const/4 v13, 0x2

    .line 252
    if-ne v11, v13, :cond_5

    .line 253
    .line 254
    move/from16 v13, v16

    .line 255
    .line 256
    goto :goto_7

    .line 257
    :cond_5
    const/4 v13, 0x0

    .line 258
    :cond_6
    :goto_7
    move-object/from16 v9, p4

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_7
    move-object/from16 p4, v9

    .line 262
    .line 263
    const/16 v16, 0x1

    .line 264
    .line 265
    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    :cond_8
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    if-eqz v1, :cond_a

    .line 274
    .line 275
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    check-cast v1, Lwy2;

    .line 280
    .line 281
    if-eqz v1, :cond_8

    .line 282
    .line 283
    iget-object v4, v1, Lwy2;->f:Lzy2;

    .line 284
    .line 285
    sget-object v9, Lzy2;->O:Llf;

    .line 286
    .line 287
    invoke-interface {v4, v9}, Lx02;->h(Llf;)Z

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    if-eqz v4, :cond_9

    .line 292
    .line 293
    iget-object v1, v1, Lwy2;->f:Lzy2;

    .line 294
    .line 295
    invoke-interface {v1}, Lzy2;->t()Lbz2;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    sget-object v4, Lbz2;->d:Lbz2;

    .line 300
    .line 301
    if-ne v1, v4, :cond_8

    .line 302
    .line 303
    move/from16 v11, v16

    .line 304
    .line 305
    goto :goto_9

    .line 306
    :cond_9
    new-instance v4, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    const-string v1, " UseCase does not have capture type."

    .line 315
    .line 316
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    const-string v4, "CameraUseCaseAdapter"

    .line 324
    .line 325
    invoke-static {v4, v1}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 326
    .line 327
    .line 328
    goto :goto_8

    .line 329
    :cond_a
    const/4 v11, 0x0

    .line 330
    :goto_9
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    xor-int/lit8 v0, v0, 0x1

    .line 338
    .line 339
    const-string v1, "No new use cases to be bound."

    .line 340
    .line 341
    invoke-static {v1, v0}, Lde3;->e(Ljava/lang/String;Z)V

    .line 342
    .line 343
    .line 344
    iget-object v0, v5, Lcb;->b:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v0, Ljava/util/HashMap;

    .line 347
    .line 348
    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    check-cast v0, Lcj2;

    .line 353
    .line 354
    if-eqz v0, :cond_d

    .line 355
    .line 356
    move v5, v11

    .line 357
    move v1, v12

    .line 358
    move v4, v13

    .line 359
    invoke-virtual/range {v0 .. v5}, Lcj2;->g(ILjava/util/ArrayList;Ljava/util/HashMap;ZZ)Landroid/util/Pair;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-virtual {v10}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    if-eqz v2, :cond_b

    .line 376
    .line 377
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    check-cast v2, Ljava/util/Map$Entry;

    .line 382
    .line 383
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    check-cast v3, Lwy2;

    .line 388
    .line 389
    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v4, Ljava/util/Map;

    .line 392
    .line 393
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    check-cast v2, Lpg;

    .line 402
    .line 403
    invoke-virtual {v7, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    goto :goto_a

    .line 407
    :cond_b
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v0, Ljava/util/Map;

    .line 410
    .line 411
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    :cond_c
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    if-eqz v1, :cond_e

    .line 424
    .line 425
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    check-cast v1, Ljava/util/Map$Entry;

    .line 430
    .line 431
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v2

    .line 435
    invoke-virtual {v8, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v2

    .line 439
    if-eqz v2, :cond_c

    .line 440
    .line 441
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    invoke-virtual {v8, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    check-cast v2, Lwy2;

    .line 450
    .line 451
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    check-cast v1, Lpg;

    .line 456
    .line 457
    invoke-virtual {v7, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    goto :goto_b

    .line 461
    :cond_d
    const-string v0, "No such camera id in supported combination list: "

    .line 462
    .line 463
    invoke-static {v0, v6}, Len;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    invoke-static {v0}, Ln4;->j(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    return-object p4

    .line 471
    :cond_e
    return-object v7
.end method

.method public final q(Ljava/util/LinkedHashSet;Z)Llh2;
    .locals 12

    .line 1
    iget-object v1, p0, Lqq;->V:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lqq;->u(Ljava/util/LinkedHashSet;Z)Ljava/util/HashSet;

    .line 5
    .line 6
    .line 7
    move-result-object v7

    .line 8
    invoke-virtual {v7}, Ljava/util/HashSet;->size()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 p2, 0x0

    .line 13
    const/4 v0, 0x2

    .line 14
    if-ge p1, v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lqq;->w()V

    .line 17
    .line 18
    .line 19
    monitor-exit v1

    .line 20
    return-object p2

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    move-object p0, v0

    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_0
    iget-object p1, p0, Lqq;->Z:Llh2;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p1, Llh2;->p:Ls53;

    .line 30
    .line 31
    iget-object p1, p1, Ls53;->a:Ljava/util/HashSet;

    .line 32
    .line 33
    invoke-interface {p1, v7}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iget-object p0, p0, Lqq;->Z:Llh2;

    .line 40
    .line 41
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    monitor-exit v1

    .line 45
    return-object p0

    .line 46
    :cond_1
    const/4 p1, 0x4

    .line 47
    const/4 v2, 0x1

    .line 48
    filled-new-array {v2, v0, p1}, [I

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    new-instance v0, Ljava/util/HashSet;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v7}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_7

    .line 66
    .line 67
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    check-cast v4, Lwy2;

    .line 72
    .line 73
    const/4 v5, 0x0

    .line 74
    move v6, v5

    .line 75
    :goto_0
    const/4 v8, 0x3

    .line 76
    if-ge v6, v8, :cond_2

    .line 77
    .line 78
    aget v8, p1, v6

    .line 79
    .line 80
    invoke-virtual {v4}, Lwy2;->i()Ljava/util/Set;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    :cond_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    if-eqz v10, :cond_4

    .line 93
    .line 94
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    check-cast v10, Ljava/lang/Integer;

    .line 99
    .line 100
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result v10

    .line 104
    and-int v11, v8, v10

    .line 105
    .line 106
    if-ne v11, v10, :cond_3

    .line 107
    .line 108
    move v9, v2

    .line 109
    goto :goto_1

    .line 110
    :cond_4
    move v9, v5

    .line 111
    :goto_1
    if-eqz v9, :cond_6

    .line 112
    .line 113
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    invoke-virtual {v0, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v9

    .line 121
    if-eqz v9, :cond_5

    .line 122
    .line 123
    monitor-exit v1

    .line 124
    return-object p2

    .line 125
    :cond_5
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    invoke-virtual {v0, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    :cond_6
    add-int/lit8 v6, v6, 0x1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_7
    new-instance v2, Llh2;

    .line 136
    .line 137
    iget-object v3, p0, Lqq;->a:Lzp;

    .line 138
    .line 139
    iget-object v4, p0, Lqq;->b:Lzp;

    .line 140
    .line 141
    iget-object v5, p0, Lqq;->c0:Lxt0;

    .line 142
    .line 143
    iget-object v6, p0, Lqq;->d0:Lxt0;

    .line 144
    .line 145
    iget-object v8, p0, Lqq;->d:Lcz2;

    .line 146
    .line 147
    invoke-direct/range {v2 .. v8}, Llh2;-><init>(Lzp;Lzp;Lxt0;Lxt0;Ljava/util/HashSet;Lcz2;)V

    .line 148
    .line 149
    .line 150
    monitor-exit v1

    .line 151
    return-object v2

    .line 152
    :goto_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    throw p0
.end method

.method public final r()V
    .locals 4

    .line 1
    iget-object v0, p0, Lqq;->V:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lqq;->W:Z

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, Lqq;->a:Lzp;

    .line 9
    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v3, p0, Lqq;->i:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1, v2}, Lzp;->i(Ljava/util/ArrayList;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lqq;->b:Lzp;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    new-instance v2, Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object v3, p0, Lqq;->i:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v1, v2}, Lzp;->i(Ljava/util/ArrayList;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    :goto_0
    iget-object v1, p0, Lqq;->V:Ljava/lang/Object;

    .line 38
    .line 39
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    :try_start_1
    iget-object v2, p0, Lqq;->a:Lzp;

    .line 41
    .line 42
    invoke-interface {v2}, Lzp;->e()Lnp;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-interface {v2}, Lnp;->f()Lty;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    iput-object v3, p0, Lqq;->X:Lty;

    .line 51
    .line 52
    invoke-interface {v2}, Lnp;->g()V

    .line 53
    .line 54
    .line 55
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    const/4 v1, 0x0

    .line 57
    :try_start_2
    iput-boolean v1, p0, Lqq;->W:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :catchall_1
    move-exception p0

    .line 61
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 62
    :try_start_4
    throw p0

    .line 63
    :cond_1
    :goto_1
    monitor-exit v0

    .line 64
    return-void

    .line 65
    :goto_2
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 66
    throw p0
.end method

.method public final u(Ljava/util/LinkedHashSet;Z)Ljava/util/HashSet;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lqq;->V:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    iget-object p0, p0, Lqq;->w:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_4

    .line 20
    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_3

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    check-cast p2, Lwy2;

    .line 42
    .line 43
    instance-of v1, p2, Llh2;

    .line 44
    .line 45
    xor-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    const-string v2, "Only support one level of sharing for now."

    .line 48
    .line 49
    invoke-static {v2, v1}, Lde3;->e(Ljava/lang/String;Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Lwy2;->i()Ljava/util/Set;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    and-int v3, p0, v2

    .line 77
    .line 78
    if-ne v3, v2, :cond_2

    .line 79
    .line 80
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    return-object v0

    .line 85
    :catchall_0
    move-exception p0

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    :try_start_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-nez p0, :cond_5

    .line 92
    .line 93
    const/4 p0, 0x0

    .line 94
    throw p0

    .line 95
    :cond_5
    new-instance p0, Ljava/lang/ClassCastException;

    .line 96
    .line 97
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 98
    .line 99
    .line 100
    throw p0

    .line 101
    :goto_2
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    throw p0
.end method

.method public final v()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lqq;->V:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    iget-object p0, p0, Lqq;->f:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 9
    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-object v1

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw p0
.end method

.method public final w()V
    .locals 1

    .line 1
    iget-object v0, p0, Lqq;->V:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Lqq;->U:Ljp;

    .line 5
    .line 6
    invoke-interface {p0}, Lhp;->u()V

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p0
.end method

.method public final y(Ljava/util/ArrayList;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lqq;->V:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    iget-object v2, p0, Lqq;->f:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v1, p1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lqq;->b:Lzp;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    :goto_0
    invoke-virtual {p0, v1, p1}, Lqq;->A(Ljava/util/LinkedHashSet;Z)V

    .line 22
    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw p0
.end method
