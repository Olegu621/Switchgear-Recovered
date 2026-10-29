.class public final Lrr;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/util/ArrayList;

.field public final c:Lqr;

.field public d:Lgk2;

.field public e:Lgk2;

.field public f:Lfb2;

.field public final g:Ljava/util/HashMap;

.field public h:Ljava/util/List;

.field public i:I

.field public j:Lxm;

.field public k:Lum;

.field public l:Ljava/util/HashMap;

.field public final m:Lnb2;

.field public final n:Lnb2;

.field public final o:Lzr3;

.field public final p:Lqc3;

.field public final q:Lme;


# direct methods
.method public constructor <init>(Lqc3;Ler0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lrr;->a:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lrr;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lrr;->g:Ljava/util/HashMap;

    .line 24
    .line 25
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 26
    .line 27
    iput-object v0, p0, Lrr;->h:Ljava/util/List;

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    iput v0, p0, Lrr;->i:I

    .line 31
    .line 32
    new-instance v1, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lrr;->l:Ljava/util/HashMap;

    .line 38
    .line 39
    new-instance v1, Lnb2;

    .line 40
    .line 41
    invoke-direct {v1, v0}, Lnb2;-><init>(I)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lrr;->m:Lnb2;

    .line 45
    .line 46
    new-instance v1, Lnb2;

    .line 47
    .line 48
    const/4 v2, 0x3

    .line 49
    invoke-direct {v1, v2}, Lnb2;-><init>(I)V

    .line 50
    .line 51
    .line 52
    iput-object v1, p0, Lrr;->n:Lnb2;

    .line 53
    .line 54
    const/4 v1, 0x2

    .line 55
    iput v1, p0, Lrr;->i:I

    .line 56
    .line 57
    iput-object p1, p0, Lrr;->p:Lqc3;

    .line 58
    .line 59
    new-instance p1, Lqr;

    .line 60
    .line 61
    invoke-direct {p1, p0}, Lqr;-><init>(Lrr;)V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, Lrr;->c:Lqr;

    .line 65
    .line 66
    new-instance p1, Lzr3;

    .line 67
    .line 68
    const-class v1, Landroidx/camera/camera2/internal/compat/quirk/CaptureNoResponseQuirk;

    .line 69
    .line 70
    invoke-virtual {p2, v1}, Ler0;->d(Ljava/lang/Class;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-direct {p1, v1}, Lzr3;-><init>(Z)V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Lrr;->o:Lzr3;

    .line 78
    .line 79
    new-instance p1, Lme;

    .line 80
    .line 81
    invoke-direct {p1, p2, v0}, Lme;-><init>(Ler0;I)V

    .line 82
    .line 83
    .line 84
    iput-object p1, p0, Lrr;->q:Lme;

    .line 85
    .line 86
    return-void
.end method

.method public static varargs b(Ljava/util/List;[Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Lao;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    array-length v2, p1

    .line 8
    add-int/2addr v1, v2

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lmo;

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v2}, Lj13;->z(Lmo;Ljava/util/ArrayList;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/4 v3, 0x1

    .line 45
    if-ne v1, v3, :cond_1

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    new-instance v1, Lao;

    .line 56
    .line 57
    invoke-direct {v1, v2}, Lao;-><init>(Ljava/util/List;)V

    .line 58
    .line 59
    .line 60
    :goto_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-static {v0, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    new-instance p0, Lao;

    .line 68
    .line 69
    invoke-direct {p0, v0}, Lao;-><init>(Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    const-string v0, "close() should not be possible in state: "

    .line 2
    .line 3
    const-string v1, "The Opener shouldn\'t null in state:"

    .line 4
    .line 5
    const-string v2, "The Opener shouldn\'t null in state:"

    .line 6
    .line 7
    iget-object v3, p0, Lrr;->a:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v3

    .line 10
    :try_start_0
    iget v4, p0, Lrr;->i:I

    .line 11
    .line 12
    invoke-static {v4}, Len;->y(I)I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-eqz v4, :cond_3

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    if-eq v4, v0, :cond_2

    .line 20
    .line 21
    const/4 v0, 0x2

    .line 22
    if-eq v4, v0, :cond_1

    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    if-eq v4, v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    if-eq v4, v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v0, p0, Lrr;->d:Lgk2;

    .line 32
    .line 33
    iget v1, p0, Lrr;->i:I

    .line 34
    .line 35
    invoke-static {v1}, Len;->C(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v0, v1}, Lde3;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lrr;->d:Lgk2;

    .line 47
    .line 48
    invoke-virtual {v0}, Lgk2;->q()Z

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x6

    .line 52
    iput v0, p0, Lrr;->i:I

    .line 53
    .line 54
    iget-object v0, p0, Lrr;->o:Lzr3;

    .line 55
    .line 56
    invoke-virtual {v0}, Lzr3;->w()V

    .line 57
    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    iput-object v0, p0, Lrr;->f:Lfb2;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception p0

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    iget-object v0, p0, Lrr;->d:Lgk2;

    .line 66
    .line 67
    iget v2, p0, Lrr;->i:I

    .line 68
    .line 69
    invoke-static {v2}, Len;->C(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {v0, v1}, Lde3;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lrr;->d:Lgk2;

    .line 81
    .line 82
    invoke-virtual {v0}, Lgk2;->q()Z

    .line 83
    .line 84
    .line 85
    :cond_2
    const/16 v0, 0x8

    .line 86
    .line 87
    iput v0, p0, Lrr;->i:I

    .line 88
    .line 89
    :goto_0
    monitor-exit v3

    .line 90
    return-void

    .line 91
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 92
    .line 93
    iget p0, p0, Lrr;->i:I

    .line 94
    .line 95
    invoke-static {p0}, Len;->C(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v1

    .line 107
    :goto_1
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    throw p0
.end method

.method public final c()V
    .locals 2

    .line 1
    iget v0, p0, Lrr;->i:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const-string p0, "CaptureSession"

    .line 8
    .line 9
    invoke-static {p0}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iput v1, p0, Lrr;->i:I

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lrr;->e:Lgk2;

    .line 17
    .line 18
    iget-object v1, p0, Lrr;->k:Lum;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Lum;->a(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lrr;->k:Lum;

    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final d(Lmg;Ljava/util/HashMap;Ljava/lang/String;)Loq1;
    .locals 5

    .line 1
    iget-object v0, p1, Lmg;->a:Ld70;

    .line 2
    .line 3
    iget-object v1, p1, Lmg;->b:Ljava/util/List;

    .line 4
    .line 5
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/view/Surface;

    .line 10
    .line 11
    const-string v2, "Surface in OutputConfig not found in configuredSurfaceMap."

    .line 12
    .line 13
    invoke-static {v0, v2}, Lde3;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v3, Loq1;

    .line 17
    .line 18
    iget v4, p1, Lmg;->d:I

    .line 19
    .line 20
    invoke-direct {v3, v4, v0}, Loq1;-><init>(ILandroid/view/Surface;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, v3, Loq1;->a:Lqq1;

    .line 24
    .line 25
    if-eqz p3, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0, p3}, Lqq1;->h(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 p3, 0x0

    .line 32
    invoke-virtual {v0, p3}, Lqq1;->h(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget p3, p1, Lmg;->c:I

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    if-nez p3, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0, v4}, Lqq1;->g(I)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    if-ne p3, v4, :cond_2

    .line 45
    .line 46
    const/4 p3, 0x2

    .line 47
    invoke-virtual {v0, p3}, Lqq1;->g(I)V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result p3

    .line 54
    if-nez p3, :cond_3

    .line 55
    .line 56
    invoke-virtual {v0}, Lqq1;->b()V

    .line 57
    .line 58
    .line 59
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Ld70;

    .line 74
    .line 75
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Landroid/view/Surface;

    .line 80
    .line 81
    invoke-static {v1, v2}, Lde3;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Lqq1;->a(Landroid/view/Surface;)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 89
    .line 90
    const/16 p3, 0x21

    .line 91
    .line 92
    if-lt p2, p3, :cond_6

    .line 93
    .line 94
    iget-object p0, p0, Lrr;->p:Lqc3;

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    if-lt p2, p3, :cond_4

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    const/4 v4, 0x0

    .line 103
    :goto_3
    const-string p2, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher."

    .line 104
    .line 105
    invoke-static {p2, v4}, Lde3;->j(Ljava/lang/String;Z)V

    .line 106
    .line 107
    .line 108
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p0, Lpb0;

    .line 111
    .line 112
    invoke-interface {p0}, Lpb0;->a()Landroid/hardware/camera2/params/DynamicRangeProfiles;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    if-eqz p0, :cond_6

    .line 117
    .line 118
    iget-object p1, p1, Lmg;->e:Lmb0;

    .line 119
    .line 120
    invoke-static {p1, p0}, Lnb0;->a(Lmb0;Landroid/hardware/camera2/params/DynamicRangeProfiles;)Ljava/lang/Long;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    if-nez p0, :cond_5

    .line 125
    .line 126
    new-instance p0, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string p2, "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  "

    .line 129
    .line 130
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    const-string p1, "CaptureSession"

    .line 141
    .line 142
    invoke-static {p1, p0}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 147
    .line 148
    .line 149
    move-result-wide p0

    .line 150
    goto :goto_5

    .line 151
    :cond_6
    :goto_4
    const-wide/16 p0, 0x1

    .line 152
    .line 153
    :goto_5
    invoke-virtual {v0, p0, p1}, Lqq1;->f(J)V

    .line 154
    .line 155
    .line 156
    return-object v3
.end method

.method public final e()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lrr;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget p0, p0, Lrr;->i:I

    .line 5
    .line 6
    const/4 v1, 0x5

    .line 7
    if-eq p0, v1, :cond_1

    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    if-ne p0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    goto :goto_1

    .line 15
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 16
    :goto_1
    monitor-exit v0

    .line 17
    return p0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    throw p0
.end method

.method public final f(Ljava/util/ArrayList;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lrr;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lrr;->i:I

    .line 5
    .line 6
    const/4 v2, 0x5

    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    const-string p0, "CaptureSession"

    .line 10
    .line 11
    invoke-static {p0}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto/16 :goto_4

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    return-void

    .line 27
    :cond_1
    :try_start_1
    new-instance v1, Lhn;

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    invoke-direct {v1, v3}, Lhn;-><init>(I)V

    .line 31
    .line 32
    .line 33
    new-instance v4, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v5, "CaptureSession"

    .line 39
    .line 40
    invoke-static {v5}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const/4 v5, 0x0

    .line 48
    move v6, v5

    .line 49
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-eqz v7, :cond_a

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    check-cast v7, Ljr;

    .line 60
    .line 61
    iget-object v8, v7, Ljr;->a:Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-static {v8}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    if-eqz v8, :cond_2

    .line 72
    .line 73
    const-string v7, "CaptureSession"

    .line 74
    .line 75
    invoke-static {v7}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :catch_0
    move-exception p0

    .line 80
    goto/16 :goto_2

    .line 81
    .line 82
    :cond_2
    iget-object v8, v7, Ljr;->a:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-static {v8}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    :cond_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    if-eqz v9, :cond_4

    .line 97
    .line 98
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v9

    .line 102
    check-cast v9, Ld70;

    .line 103
    .line 104
    iget-object v10, p0, Lrr;->g:Ljava/util/HashMap;

    .line 105
    .line 106
    invoke-virtual {v10, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    if-nez v10, :cond_3

    .line 111
    .line 112
    const-string v7, "CaptureSession"

    .line 113
    .line 114
    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    invoke-static {v7}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_4
    iget v8, v7, Ljr;->c:I

    .line 122
    .line 123
    const/4 v9, 0x2

    .line 124
    if-ne v8, v9, :cond_5

    .line 125
    .line 126
    move v6, v3

    .line 127
    :cond_5
    new-instance v8, Lir;

    .line 128
    .line 129
    invoke-direct {v8, v7}, Lir;-><init>(Ljr;)V

    .line 130
    .line 131
    .line 132
    iget v9, v7, Ljr;->c:I

    .line 133
    .line 134
    if-ne v9, v2, :cond_6

    .line 135
    .line 136
    iget-object v9, v7, Ljr;->g:Lso;

    .line 137
    .line 138
    if-eqz v9, :cond_6

    .line 139
    .line 140
    iput-object v9, v8, Lir;->i:Ljava/lang/Object;

    .line 141
    .line 142
    :cond_6
    iget-object v9, p0, Lrr;->f:Lfb2;

    .line 143
    .line 144
    if-eqz v9, :cond_7

    .line 145
    .line 146
    iget-object v9, v9, Lfb2;->g:Ljr;

    .line 147
    .line 148
    iget-object v9, v9, Ljr;->b:Lnq1;

    .line 149
    .line 150
    invoke-virtual {v8, v9}, Lir;->e(Lty;)V

    .line 151
    .line 152
    .line 153
    :cond_7
    iget-object v9, v7, Ljr;->b:Lnq1;

    .line 154
    .line 155
    invoke-virtual {v8, v9}, Lir;->e(Lty;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v8}, Lir;->i()Ljr;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    iget-object v9, p0, Lrr;->e:Lgk2;

    .line 163
    .line 164
    iget-object v10, v9, Lgk2;->g:Lgr0;

    .line 165
    .line 166
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    iget-object v9, v9, Lgk2;->g:Lgr0;

    .line 170
    .line 171
    iget-object v9, v9, Lgr0;->a:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v9, Lcb;

    .line 174
    .line 175
    iget-object v9, v9, Lcb;->b:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v9, Landroid/hardware/camera2/CameraCaptureSession;

    .line 178
    .line 179
    invoke-virtual {v9}, Landroid/hardware/camera2/CameraCaptureSession;->getDevice()Landroid/hardware/camera2/CameraDevice;

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    iget-object v10, p0, Lrr;->g:Ljava/util/HashMap;

    .line 184
    .line 185
    iget-object v11, p0, Lrr;->q:Lme;

    .line 186
    .line 187
    invoke-static {v8, v9, v10, v5, v11}, Ljb1;->i(Ljr;Landroid/hardware/camera2/CameraDevice;Ljava/util/HashMap;ZLme;)Landroid/hardware/camera2/CaptureRequest;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    if-nez v8, :cond_8

    .line 192
    .line 193
    const-string p0, "CaptureSession"

    .line 194
    .line 195
    invoke-static {p0}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 196
    .line 197
    .line 198
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 199
    return-void

    .line 200
    :cond_8
    :try_start_3
    new-instance v9, Ljava/util/ArrayList;

    .line 201
    .line 202
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 203
    .line 204
    .line 205
    iget-object v7, v7, Ljr;->d:Ljava/util/List;

    .line 206
    .line 207
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v10

    .line 215
    if-eqz v10, :cond_9

    .line 216
    .line 217
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v10

    .line 221
    check-cast v10, Lmo;

    .line 222
    .line 223
    invoke-static {v10, v9}, Lj13;->z(Lmo;Ljava/util/ArrayList;)V

    .line 224
    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_9
    invoke-virtual {v1, v8, v9}, Lhn;->a(Landroid/hardware/camera2/CaptureRequest;Ljava/util/List;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto/16 :goto_0

    .line 234
    .line 235
    :cond_a
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 236
    .line 237
    .line 238
    move-result p1

    .line 239
    if-nez p1, :cond_d

    .line 240
    .line 241
    iget-object p1, p0, Lrr;->m:Lnb2;

    .line 242
    .line 243
    invoke-virtual {p1, v4, v6}, Lnb2;->c(Ljava/util/ArrayList;Z)Z

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    if-eqz p1, :cond_b

    .line 248
    .line 249
    iget-object p1, p0, Lrr;->e:Lgk2;

    .line 250
    .line 251
    iget-object v2, p1, Lgk2;->g:Lgr0;

    .line 252
    .line 253
    const-string v5, "Need to call openCaptureSession before using this API."

    .line 254
    .line 255
    invoke-static {v2, v5}, Lde3;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    iget-object p1, p1, Lgk2;->g:Lgr0;

    .line 259
    .line 260
    iget-object p1, p1, Lgr0;->a:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast p1, Lcb;

    .line 263
    .line 264
    iget-object p1, p1, Lcb;->b:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast p1, Landroid/hardware/camera2/CameraCaptureSession;

    .line 267
    .line 268
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraCaptureSession;->stopRepeating()V

    .line 269
    .line 270
    .line 271
    new-instance p1, Lor;

    .line 272
    .line 273
    invoke-direct {p1, p0}, Lor;-><init>(Lrr;)V

    .line 274
    .line 275
    .line 276
    iput-object p1, v1, Lhn;->c:Ljava/lang/Object;

    .line 277
    .line 278
    :cond_b
    iget-object p1, p0, Lrr;->n:Lnb2;

    .line 279
    .line 280
    invoke-virtual {p1, v4, v6}, Lnb2;->b(Ljava/util/ArrayList;Z)Z

    .line 281
    .line 282
    .line 283
    move-result p1

    .line 284
    if-eqz p1, :cond_c

    .line 285
    .line 286
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 287
    .line 288
    .line 289
    move-result p1

    .line 290
    sub-int/2addr p1, v3

    .line 291
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    check-cast p1, Landroid/hardware/camera2/CaptureRequest;

    .line 296
    .line 297
    new-instance v2, Lao;

    .line 298
    .line 299
    invoke-direct {v2, p0}, Lao;-><init>(Lrr;)V

    .line 300
    .line 301
    .line 302
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    invoke-virtual {v1, p1, v2}, Lhn;->a(Landroid/hardware/camera2/CaptureRequest;Ljava/util/List;)V

    .line 307
    .line 308
    .line 309
    :cond_c
    iget-object p0, p0, Lrr;->e:Lgk2;

    .line 310
    .line 311
    invoke-virtual {p0, v4, v1}, Lgk2;->i(Ljava/util/ArrayList;Lhn;)I
    :try_end_3
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 312
    .line 313
    .line 314
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 315
    return-void

    .line 316
    :cond_d
    :try_start_5
    const-string p0, "CaptureSession"

    .line 317
    .line 318
    invoke-static {p0}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;
    :try_end_5
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 319
    .line 320
    .line 321
    goto :goto_3

    .line 322
    :goto_2
    :try_start_6
    const-string p1, "CaptureSession"

    .line 323
    .line 324
    new-instance v1, Ljava/lang/StringBuilder;

    .line 325
    .line 326
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 327
    .line 328
    .line 329
    const-string v2, "Unable to access camera: "

    .line 330
    .line 331
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object p0

    .line 338
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    invoke-static {p1, p0}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    invoke-static {}, Ljava/lang/Thread;->dumpStack()V

    .line 349
    .line 350
    .line 351
    :goto_3
    monitor-exit v0

    .line 352
    return-void

    .line 353
    :goto_4
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 354
    throw p0
.end method

.method public final g(Ljava/util/List;)V
    .locals 3

    .line 1
    const-string v0, "issueCaptureRequests() should not be possible in state: "

    .line 2
    .line 3
    iget-object v1, p0, Lrr;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget v2, p0, Lrr;->i:I

    .line 7
    .line 8
    invoke-static {v2}, Len;->y(I)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    packed-switch v2, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string p1, "Cannot issue capture request on a closed/released session."

    .line 19
    .line 20
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :pswitch_1
    iget-object v0, p0, Lrr;->b:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lrr;->o:Lzr3;

    .line 32
    .line 33
    invoke-virtual {p1}, Lzr3;->f()Ls81;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v0, Ls2;

    .line 38
    .line 39
    const/16 v2, 0x8

    .line 40
    .line 41
    invoke-direct {v0, p0, v2}, Ls2;-><init>(Ljava/lang/Object;I)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lpg3;->g()Lo80;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-interface {p1, v0, p0}, Ls81;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :pswitch_2
    iget-object p0, p0, Lrr;->b:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 55
    .line 56
    .line 57
    :goto_0
    monitor-exit v1

    .line 58
    return-void

    .line 59
    :pswitch_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    iget p0, p0, Lrr;->i:I

    .line 62
    .line 63
    invoke-static {p0}, Len;->C(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1

    .line 75
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    throw p0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Lfb2;)V
    .locals 6

    .line 1
    const-string v0, "Unable to access camera: "

    .line 2
    .line 3
    const-string v1, "Unable to access camera: "

    .line 4
    .line 5
    iget-object v2, p0, Lrr;->a:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v2

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    :try_start_0
    const-string p0, "CaptureSession"

    .line 11
    .line 12
    invoke-static {p0}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    monitor-exit v2

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    :cond_0
    iget v3, p0, Lrr;->i:I

    .line 21
    .line 22
    const/4 v4, 0x5

    .line 23
    if-eq v3, v4, :cond_1

    .line 24
    .line 25
    const-string p0, "CaptureSession"

    .line 26
    .line 27
    invoke-static {p0}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    monitor-exit v2

    .line 31
    return-void

    .line 32
    :cond_1
    iget-object p1, p1, Lfb2;->g:Ljr;

    .line 33
    .line 34
    iget-object v3, p1, Ljr;->a:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    const-string p1, "CaptureSession"

    .line 47
    .line 48
    invoke-static {p1}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    :try_start_1
    iget-object p0, p0, Lrr;->e:Lgk2;

    .line 52
    .line 53
    iget-object p1, p0, Lgk2;->g:Lgr0;

    .line 54
    .line 55
    const-string v0, "Need to call openCaptureSession before using this API."

    .line 56
    .line 57
    invoke-static {p1, v0}, Lde3;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-object p0, p0, Lgk2;->g:Lgr0;

    .line 61
    .line 62
    iget-object p0, p0, Lgr0;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, Lcb;

    .line 65
    .line 66
    iget-object p0, p0, Lcb;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, Landroid/hardware/camera2/CameraCaptureSession;

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/hardware/camera2/CameraCaptureSession;->stopRepeating()V
    :try_end_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catch_0
    move-exception p0

    .line 75
    :try_start_2
    const-string p1, "CaptureSession"

    .line 76
    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {p1, p0}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-static {}, Ljava/lang/Thread;->dumpStack()V

    .line 97
    .line 98
    .line 99
    :goto_0
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 100
    goto :goto_2

    .line 101
    :cond_2
    :try_start_3
    const-string v1, "CaptureSession"

    .line 102
    .line 103
    invoke-static {v1}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    iget-object v1, p0, Lrr;->e:Lgk2;

    .line 107
    .line 108
    iget-object v3, v1, Lgk2;->g:Lgr0;

    .line 109
    .line 110
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object v1, v1, Lgk2;->g:Lgr0;

    .line 114
    .line 115
    iget-object v1, v1, Lgr0;->a:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v1, Lcb;

    .line 118
    .line 119
    iget-object v1, v1, Lcb;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v1, Landroid/hardware/camera2/CameraCaptureSession;

    .line 122
    .line 123
    invoke-virtual {v1}, Landroid/hardware/camera2/CameraCaptureSession;->getDevice()Landroid/hardware/camera2/CameraDevice;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    iget-object v3, p0, Lrr;->g:Ljava/util/HashMap;

    .line 128
    .line 129
    iget-object v4, p0, Lrr;->q:Lme;

    .line 130
    .line 131
    const/4 v5, 0x1

    .line 132
    invoke-static {p1, v1, v3, v5, v4}, Ljb1;->i(Ljr;Landroid/hardware/camera2/CameraDevice;Ljava/util/HashMap;ZLme;)Landroid/hardware/camera2/CaptureRequest;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    if-nez v1, :cond_3

    .line 137
    .line 138
    const-string p0, "CaptureSession"

    .line 139
    .line 140
    invoke-static {p0}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;
    :try_end_3
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 141
    .line 142
    .line 143
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 144
    return-void

    .line 145
    :catch_1
    move-exception p0

    .line 146
    goto :goto_1

    .line 147
    :cond_3
    :try_start_5
    iget-object v3, p0, Lrr;->o:Lzr3;

    .line 148
    .line 149
    iget-object p1, p1, Ljr;->d:Ljava/util/List;

    .line 150
    .line 151
    const/4 v4, 0x0

    .line 152
    new-array v4, v4, [Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 153
    .line 154
    invoke-static {p1, v4}, Lrr;->b(Ljava/util/List;[Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Lao;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {v3, p1}, Lzr3;->b(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    iget-object p0, p0, Lrr;->e:Lgk2;

    .line 163
    .line 164
    invoke-virtual {p0, v1, p1}, Lgk2;->o(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    :try_end_5
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 165
    .line 166
    .line 167
    :try_start_6
    monitor-exit v2

    .line 168
    return-void

    .line 169
    :goto_1
    const-string p1, "CaptureSession"

    .line 170
    .line 171
    new-instance v1, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-static {p1, p0}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-static {}, Ljava/lang/Thread;->dumpStack()V

    .line 191
    .line 192
    .line 193
    monitor-exit v2

    .line 194
    :goto_2
    return-void

    .line 195
    :goto_3
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 196
    throw p0
.end method

.method public final i(Lfb2;Landroid/hardware/camera2/CameraDevice;Lgk2;)Ls81;
    .locals 5

    .line 1
    const-string v0, "open() should not allow the state: "

    .line 2
    .line 3
    const-string v1, "Open not allowed in state: "

    .line 4
    .line 5
    iget-object v2, p0, Lrr;->a:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v2

    .line 8
    :try_start_0
    iget v3, p0, Lrr;->i:I

    .line 9
    .line 10
    invoke-static {v3}, Len;->y(I)I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    const/4 v4, 0x1

    .line 15
    if-eq v3, v4, :cond_0

    .line 16
    .line 17
    const-string p1, "CaptureSession"

    .line 18
    .line 19
    iget p2, p0, Lrr;->i:I

    .line 20
    .line 21
    invoke-static {p2}, Len;->C(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-static {p1, p2}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    iget p0, p0, Lrr;->i:I

    .line 35
    .line 36
    invoke-static {p0}, Len;->C(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    new-instance p0, Ltw0;

    .line 48
    .line 49
    invoke-direct {p0, p1, v4}, Ltw0;-><init>(Ljava/lang/Object;I)V

    .line 50
    .line 51
    .line 52
    monitor-exit v2

    .line 53
    return-object p0

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/4 v0, 0x3

    .line 57
    iput v0, p0, Lrr;->i:I

    .line 58
    .line 59
    new-instance v0, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {p1}, Lfb2;->b()Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, Lrr;->h:Ljava/util/List;

    .line 69
    .line 70
    iput-object p3, p0, Lrr;->d:Lgk2;

    .line 71
    .line 72
    iget-object v1, p3, Lgk2;->p:Ljava/lang/Object;

    .line 73
    .line 74
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    :try_start_1
    iput-object v0, p3, Lgk2;->q:Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-virtual {p3, v0}, Lgk2;->p(Ljava/util/ArrayList;)Ls81;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 82
    :try_start_2
    invoke-static {p3}, Lyo0;->b(Ls81;)Lyo0;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    new-instance v0, Lpr;

    .line 87
    .line 88
    const/4 v1, 0x0

    .line 89
    invoke-direct {v0, v1, p0, p1, p2}, Lpr;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lrr;->d:Lgk2;

    .line 93
    .line 94
    iget-object p1, p1, Lgk2;->d:Ly92;

    .line 95
    .line 96
    invoke-static {p3, v0, p1}, Lw11;->I(Ls81;Lud;Ljava/util/concurrent/Executor;)Lls;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    new-instance p2, Lgr0;

    .line 101
    .line 102
    invoke-direct {p2, p0}, Lgr0;-><init>(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    iget-object p0, p0, Lrr;->d:Lgk2;

    .line 106
    .line 107
    iget-object p0, p0, Lgk2;->d:Ly92;

    .line 108
    .line 109
    new-instance p3, Ldp0;

    .line 110
    .line 111
    invoke-direct {p3, v1, p1, p2}, Ldp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, p3, p0}, Lyo0;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 115
    .line 116
    .line 117
    invoke-static {p1}, Lw11;->w(Ls81;)Ls81;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 122
    return-object p0

    .line 123
    :catchall_1
    move-exception p0

    .line 124
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 125
    :try_start_4
    throw p0

    .line 126
    :goto_0
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 127
    throw p0
.end method

.method public final j()Ls81;
    .locals 5

    .line 1
    const-string v0, "release() should not be possible in state: "

    .line 2
    .line 3
    const-string v1, "The Opener shouldn\'t null in state:"

    .line 4
    .line 5
    const-string v2, "The Opener shouldn\'t null in state:"

    .line 6
    .line 7
    iget-object v3, p0, Lrr;->a:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v3

    .line 10
    :try_start_0
    iget v4, p0, Lrr;->i:I

    .line 11
    .line 12
    invoke-static {v4}, Len;->y(I)I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    packed-switch v4, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :pswitch_0
    iget-object v0, p0, Lrr;->e:Lgk2;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Lgk2;->j()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    goto :goto_2

    .line 30
    :cond_0
    :goto_0
    :pswitch_1
    const/4 v0, 0x7

    .line 31
    iput v0, p0, Lrr;->i:I

    .line 32
    .line 33
    iget-object v0, p0, Lrr;->o:Lzr3;

    .line 34
    .line 35
    invoke-virtual {v0}, Lzr3;->w()V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lrr;->d:Lgk2;

    .line 39
    .line 40
    iget v1, p0, Lrr;->i:I

    .line 41
    .line 42
    invoke-static {v1}, Len;->C(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v0, v1}, Lde3;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lrr;->d:Lgk2;

    .line 54
    .line 55
    invoke-virtual {v0}, Lgk2;->q()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0}, Lrr;->c()V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    :pswitch_2
    iget-object v0, p0, Lrr;->j:Lxm;

    .line 66
    .line 67
    if-nez v0, :cond_2

    .line 68
    .line 69
    new-instance v0, Lor;

    .line 70
    .line 71
    invoke-direct {v0, p0}, Lor;-><init>(Lrr;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, Lpy0;->Y(Lvm;)Lxm;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iput-object v0, p0, Lrr;->j:Lxm;

    .line 79
    .line 80
    :cond_2
    iget-object p0, p0, Lrr;->j:Lxm;

    .line 81
    .line 82
    monitor-exit v3

    .line 83
    return-object p0

    .line 84
    :pswitch_3
    iget-object v0, p0, Lrr;->d:Lgk2;

    .line 85
    .line 86
    iget v2, p0, Lrr;->i:I

    .line 87
    .line 88
    invoke-static {v2}, Len;->C(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {v0, v1}, Lde3;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iget-object v0, p0, Lrr;->d:Lgk2;

    .line 100
    .line 101
    invoke-virtual {v0}, Lgk2;->q()Z

    .line 102
    .line 103
    .line 104
    :pswitch_4
    const/16 v0, 0x8

    .line 105
    .line 106
    iput v0, p0, Lrr;->i:I

    .line 107
    .line 108
    :goto_1
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    sget-object p0, Ltw0;->c:Ltw0;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_5
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 113
    .line 114
    iget p0, p0, Lrr;->i:I

    .line 115
    .line 116
    invoke-static {p0}, Len;->C(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v1

    .line 128
    :goto_2
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 129
    throw p0

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public final k(Lfb2;)V
    .locals 3

    .line 1
    const-string v0, "setSessionConfig() should not be possible in state: "

    .line 2
    .line 3
    iget-object v1, p0, Lrr;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget v2, p0, Lrr;->i:I

    .line 7
    .line 8
    invoke-static {v2}, Len;->y(I)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    packed-switch v2, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string p1, "Session configuration cannot be set on a closed/released session."

    .line 19
    .line 20
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :pswitch_1
    iput-object p1, p0, Lrr;->f:Lfb2;

    .line 27
    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    monitor-exit v1

    .line 31
    return-void

    .line 32
    :cond_0
    iget-object v0, p0, Lrr;->g:Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p1}, Lfb2;->b()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {v0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-nez p1, :cond_1

    .line 47
    .line 48
    const-string p0, "CaptureSession"

    .line 49
    .line 50
    const-string p1, "Does not have the proper configured lists"

    .line 51
    .line 52
    invoke-static {p0, p1}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    monitor-exit v1

    .line 56
    return-void

    .line 57
    :cond_1
    const-string p1, "CaptureSession"

    .line 58
    .line 59
    invoke-static {p1}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lrr;->f:Lfb2;

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lrr;->h(Lfb2;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :pswitch_2
    iput-object p1, p0, Lrr;->f:Lfb2;

    .line 69
    .line 70
    :goto_0
    monitor-exit v1

    .line 71
    return-void

    .line 72
    :pswitch_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    iget p0, p0, Lrr;->i:I

    .line 75
    .line 76
    invoke-static {p0}, Len;->C(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    throw p0

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
