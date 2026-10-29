.class public final Lcj2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/HashMap;

.field public final f:Ljava/util/ArrayList;

.field public final g:Ljava/util/ArrayList;

.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/lang/String;

.field public final j:Ldc0;

.field public final k:Lgp;

.field public final l:Lgr0;

.field public final m:I

.field public final n:Z

.field public final o:Z

.field public final p:Z

.field public final q:Z

.field public final r:Z

.field public s:Lwg;

.field public final t:Ljava/util/ArrayList;

.field public final u:Lc90;

.field public final v:Lp62;

.field public final w:Lmd1;

.field public final x:Lk8;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcq;Ldc0;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    .line 1
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Lcj2;->a:Ljava/util/ArrayList;

    .line 3
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Lcj2;->b:Ljava/util/ArrayList;

    .line 4
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Lcj2;->c:Ljava/util/ArrayList;

    .line 5
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Lcj2;->d:Ljava/util/ArrayList;

    .line 6
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v1, Lcj2;->e:Ljava/util/HashMap;

    .line 7
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Lcj2;->f:Ljava/util/ArrayList;

    .line 8
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Lcj2;->g:Ljava/util/ArrayList;

    .line 9
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Lcj2;->h:Ljava/util/ArrayList;

    const/4 v2, 0x0

    .line 10
    iput-boolean v2, v1, Lcj2;->n:Z

    .line 11
    iput-boolean v2, v1, Lcj2;->o:Z

    .line 12
    iput-boolean v2, v1, Lcj2;->p:Z

    .line 13
    iput-boolean v2, v1, Lcj2;->q:Z

    .line 14
    iput-boolean v2, v1, Lcj2;->r:Z

    .line 15
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v1, Lcj2;->t:Ljava/util/ArrayList;

    .line 16
    new-instance v3, Lp62;

    const/4 v4, 0x5

    .line 17
    invoke-direct {v3, v4}, Lp62;-><init>(I)V

    .line 18
    iput-object v3, v1, Lcj2;->v:Lp62;

    .line 19
    new-instance v3, Lmd1;

    const/4 v5, 0x1

    invoke-direct {v3, v5}, Lmd1;-><init>(I)V

    iput-object v3, v1, Lcj2;->w:Lmd1;

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    iput-object v0, v1, Lcj2;->i:Ljava/lang/String;

    .line 22
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v3, p4

    .line 23
    iput-object v3, v1, Lcj2;->j:Ldc0;

    .line 24
    new-instance v3, Lgr0;

    const/16 v6, 0x1a

    invoke-direct {v3, v6}, Lgr0;-><init>(I)V

    iput-object v3, v1, Lcj2;->l:Lgr0;

    .line 25
    invoke-static/range {p1 .. p1}, Lc90;->b(Landroid/content/Context;)Lc90;

    move-result-object v3

    iput-object v3, v1, Lcj2;->u:Lc90;

    move-object/from16 v3, p3

    .line 26
    :try_start_0
    invoke-virtual {v3, v0}, Lcq;->b(Ljava/lang/String;)Lgp;

    move-result-object v0

    iput-object v0, v1, Lcj2;->k:Lgp;

    .line 27
    sget-object v3, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v3}, Lgp;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    const/4 v6, 0x2

    if-eqz v3, :cond_0

    .line 28
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v6

    .line 29
    :goto_0
    iput v3, v1, Lcj2;->m:I
    :try_end_0
    .catch Llo; {:try_start_0 .. :try_end_0} :catch_2

    .line 30
    sget-object v3, Landroid/hardware/camera2/CameraCharacteristics;->REQUEST_AVAILABLE_CAPABILITIES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 31
    invoke-virtual {v0, v3}, Lgp;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    const/4 v3, 0x3

    if-eqz v0, :cond_4

    .line 32
    array-length v7, v0

    move v8, v2

    :goto_1
    if-ge v8, v7, :cond_4

    aget v9, v0, v8

    if-ne v9, v3, :cond_1

    .line 33
    iput-boolean v5, v1, Lcj2;->n:Z

    goto :goto_2

    :cond_1
    const/4 v10, 0x6

    if-ne v9, v10, :cond_2

    .line 34
    iput-boolean v5, v1, Lcj2;->o:Z

    goto :goto_2

    .line 35
    :cond_2
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x1f

    if-lt v10, v11, :cond_3

    const/16 v10, 0x10

    if-ne v9, v10, :cond_3

    .line 36
    iput-boolean v5, v1, Lcj2;->r:Z

    :cond_3
    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 37
    :cond_4
    new-instance v0, Lk8;

    iget-object v7, v1, Lcj2;->k:Lgp;

    invoke-direct {v0, v7}, Lk8;-><init>(Lgp;)V

    iput-object v0, v1, Lcj2;->x:Lk8;

    .line 38
    iget-object v0, v1, Lcj2;->a:Ljava/util/ArrayList;

    iget v7, v1, Lcj2;->m:I

    iget-boolean v8, v1, Lcj2;->n:Z

    iget-boolean v9, v1, Lcj2;->o:Z

    .line 39
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 40
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 41
    new-instance v12, Ldj2;

    invoke-direct {v12}, Ldj2;-><init>()V

    .line 42
    sget-object v13, Lej2;->i:Lej2;

    const-wide/16 v14, 0x0

    invoke-static {v5, v13, v14, v15, v12}, Lfm0;->u(ILej2;JLdj2;)V

    .line 43
    invoke-static {v11, v12}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v12

    .line 44
    invoke-static {v3, v13, v14, v15, v12}, Lfm0;->u(ILej2;JLdj2;)V

    .line 45
    invoke-static {v11, v12}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v12

    .line 46
    invoke-static {v6, v13, v14, v15, v12}, Lfm0;->u(ILej2;JLdj2;)V

    .line 47
    invoke-static {v11, v12}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v12

    .line 48
    new-instance v2, Lrg;

    sget-object v4, Lej2;->d:Lej2;

    invoke-direct {v2, v5, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 49
    invoke-virtual {v12, v2}, Ldj2;->a(Lrg;)V

    .line 50
    invoke-static {v3, v13, v14, v15, v12}, Lfm0;->u(ILej2;JLdj2;)V

    .line 51
    invoke-static {v11, v12}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v2

    .line 52
    new-instance v12, Lrg;

    invoke-direct {v12, v6, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 53
    invoke-virtual {v2, v12}, Ldj2;->a(Lrg;)V

    .line 54
    invoke-static {v3, v13, v14, v15, v2}, Lfm0;->u(ILej2;JLdj2;)V

    .line 55
    invoke-static {v11, v2}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v2

    .line 56
    new-instance v12, Lrg;

    invoke-direct {v12, v5, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 57
    invoke-virtual {v2, v12}, Ldj2;->a(Lrg;)V

    .line 58
    invoke-static {v5, v4, v14, v15, v2}, Lfm0;->u(ILej2;JLdj2;)V

    .line 59
    invoke-static {v11, v2}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v2

    .line 60
    new-instance v12, Lrg;

    invoke-direct {v12, v5, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 61
    invoke-virtual {v2, v12}, Ldj2;->a(Lrg;)V

    .line 62
    invoke-static {v6, v4, v14, v15, v2}, Lfm0;->u(ILej2;JLdj2;)V

    .line 63
    invoke-static {v11, v2}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v2

    .line 64
    new-instance v12, Lrg;

    invoke-direct {v12, v5, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 65
    invoke-virtual {v2, v12}, Ldj2;->a(Lrg;)V

    .line 66
    new-instance v12, Lrg;

    invoke-direct {v12, v6, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 67
    invoke-virtual {v2, v12}, Ldj2;->a(Lrg;)V

    .line 68
    invoke-static {v3, v13, v14, v15, v2}, Lfm0;->u(ILej2;JLdj2;)V

    .line 69
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 71
    sget-object v2, Lej2;->f:Lej2;

    if-eqz v7, :cond_6

    if-eq v7, v5, :cond_6

    if-ne v7, v3, :cond_5

    goto :goto_3

    :cond_5
    move v12, v3

    goto/16 :goto_4

    .line 72
    :cond_6
    :goto_3
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 73
    new-instance v12, Ldj2;

    invoke-direct {v12}, Ldj2;-><init>()V

    .line 74
    new-instance v3, Lrg;

    invoke-direct {v3, v5, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 75
    invoke-virtual {v12, v3}, Ldj2;->a(Lrg;)V

    .line 76
    invoke-static {v5, v2, v14, v15, v12}, Lfm0;->u(ILej2;JLdj2;)V

    .line 77
    invoke-static {v11, v12}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v3

    .line 78
    new-instance v12, Lrg;

    invoke-direct {v12, v5, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 79
    invoke-virtual {v3, v12}, Ldj2;->a(Lrg;)V

    .line 80
    invoke-static {v6, v2, v14, v15, v3}, Lfm0;->u(ILej2;JLdj2;)V

    .line 81
    invoke-static {v11, v3}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v3

    .line 82
    new-instance v12, Lrg;

    invoke-direct {v12, v6, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 83
    invoke-virtual {v3, v12}, Ldj2;->a(Lrg;)V

    .line 84
    invoke-static {v6, v2, v14, v15, v3}, Lfm0;->u(ILej2;JLdj2;)V

    .line 85
    invoke-static {v11, v3}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v3

    .line 86
    new-instance v12, Lrg;

    invoke-direct {v12, v5, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 87
    invoke-virtual {v3, v12}, Ldj2;->a(Lrg;)V

    .line 88
    new-instance v12, Lrg;

    invoke-direct {v12, v5, v2, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 89
    invoke-virtual {v3, v12}, Ldj2;->a(Lrg;)V

    const/4 v12, 0x3

    .line 90
    invoke-static {v12, v2, v14, v15, v3}, Lfm0;->u(ILej2;JLdj2;)V

    .line 91
    invoke-static {v11, v3}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v3

    .line 92
    new-instance v12, Lrg;

    invoke-direct {v12, v5, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 93
    invoke-virtual {v3, v12}, Ldj2;->a(Lrg;)V

    .line 94
    new-instance v12, Lrg;

    invoke-direct {v12, v6, v2, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 95
    invoke-virtual {v3, v12}, Ldj2;->a(Lrg;)V

    const/4 v12, 0x3

    .line 96
    invoke-static {v12, v2, v14, v15, v3}, Lfm0;->u(ILej2;JLdj2;)V

    .line 97
    invoke-static {v11, v3}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v3

    .line 98
    new-instance v5, Lrg;

    invoke-direct {v5, v6, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 99
    invoke-virtual {v3, v5}, Ldj2;->a(Lrg;)V

    .line 100
    new-instance v5, Lrg;

    invoke-direct {v5, v6, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 101
    invoke-virtual {v3, v5}, Ldj2;->a(Lrg;)V

    .line 102
    invoke-static {v12, v13, v14, v15, v3}, Lfm0;->u(ILej2;JLdj2;)V

    .line 103
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 105
    :goto_4
    sget-object v3, Lej2;->b:Lej2;

    const/4 v5, 0x1

    if-eq v7, v5, :cond_7

    if-ne v7, v12, :cond_8

    .line 106
    :cond_7
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 107
    new-instance v12, Ldj2;

    invoke-direct {v12}, Ldj2;-><init>()V

    .line 108
    new-instance v6, Lrg;

    invoke-direct {v6, v5, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 109
    invoke-virtual {v12, v6}, Ldj2;->a(Lrg;)V

    .line 110
    invoke-static {v5, v13, v14, v15, v12}, Lfm0;->u(ILej2;JLdj2;)V

    .line 111
    invoke-static {v11, v12}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 112
    new-instance v12, Lrg;

    invoke-direct {v12, v5, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 113
    invoke-virtual {v6, v12}, Ldj2;->a(Lrg;)V

    const/4 v12, 0x2

    .line 114
    invoke-static {v12, v13, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 115
    invoke-static {v11, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 116
    new-instance v5, Lrg;

    invoke-direct {v5, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 117
    invoke-virtual {v6, v5}, Ldj2;->a(Lrg;)V

    .line 118
    invoke-static {v12, v13, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 119
    invoke-static {v11, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 120
    new-instance v6, Lrg;

    const/4 v12, 0x1

    invoke-direct {v6, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 121
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 122
    new-instance v6, Lrg;

    invoke-direct {v6, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 123
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    const/4 v6, 0x3

    .line 124
    invoke-static {v6, v13, v14, v15, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 125
    invoke-static {v11, v5}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 126
    new-instance v6, Lrg;

    const/4 v12, 0x2

    invoke-direct {v6, v12, v3, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 127
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 128
    new-instance v6, Lrg;

    const/4 v12, 0x1

    invoke-direct {v6, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 129
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    const/4 v12, 0x2

    .line 130
    invoke-static {v12, v13, v14, v15, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 131
    invoke-static {v11, v5}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 132
    new-instance v6, Lrg;

    invoke-direct {v6, v12, v3, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 133
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 134
    new-instance v6, Lrg;

    invoke-direct {v6, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 135
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 136
    invoke-static {v12, v13, v14, v15, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 137
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_8
    if-eqz v8, :cond_9

    .line 139
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 140
    new-instance v6, Ldj2;

    invoke-direct {v6}, Ldj2;-><init>()V

    const/4 v8, 0x5

    .line 141
    invoke-static {v8, v13, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 142
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 143
    new-instance v11, Lrg;

    const/4 v12, 0x1

    invoke-direct {v11, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 144
    invoke-virtual {v6, v11}, Ldj2;->a(Lrg;)V

    .line 145
    invoke-static {v8, v13, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 146
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 147
    new-instance v11, Lrg;

    const/4 v12, 0x2

    invoke-direct {v11, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 148
    invoke-virtual {v6, v11}, Ldj2;->a(Lrg;)V

    .line 149
    invoke-static {v8, v13, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 150
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 151
    new-instance v11, Lrg;

    const/4 v12, 0x1

    invoke-direct {v11, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 152
    invoke-virtual {v6, v11}, Ldj2;->a(Lrg;)V

    .line 153
    new-instance v11, Lrg;

    invoke-direct {v11, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 154
    invoke-virtual {v6, v11}, Ldj2;->a(Lrg;)V

    .line 155
    invoke-static {v8, v13, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 156
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 157
    new-instance v11, Lrg;

    invoke-direct {v11, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 158
    invoke-virtual {v6, v11}, Ldj2;->a(Lrg;)V

    .line 159
    new-instance v11, Lrg;

    const/4 v12, 0x2

    invoke-direct {v11, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 160
    invoke-virtual {v6, v11}, Ldj2;->a(Lrg;)V

    .line 161
    invoke-static {v8, v13, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 162
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 163
    new-instance v11, Lrg;

    invoke-direct {v11, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 164
    invoke-virtual {v6, v11}, Ldj2;->a(Lrg;)V

    .line 165
    new-instance v11, Lrg;

    invoke-direct {v11, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 166
    invoke-virtual {v6, v11}, Ldj2;->a(Lrg;)V

    .line 167
    invoke-static {v8, v13, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 168
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 169
    new-instance v11, Lrg;

    const/4 v12, 0x1

    invoke-direct {v11, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 170
    invoke-virtual {v6, v11}, Ldj2;->a(Lrg;)V

    .line 171
    new-instance v11, Lrg;

    const/4 v12, 0x3

    invoke-direct {v11, v12, v13, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 172
    invoke-virtual {v6, v11}, Ldj2;->a(Lrg;)V

    .line 173
    invoke-static {v8, v13, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 174
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 175
    new-instance v11, Lrg;

    const/4 v8, 0x2

    invoke-direct {v11, v8, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 176
    invoke-virtual {v6, v11}, Ldj2;->a(Lrg;)V

    .line 177
    new-instance v8, Lrg;

    invoke-direct {v8, v12, v13, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 178
    invoke-virtual {v6, v8}, Ldj2;->a(Lrg;)V

    const/4 v8, 0x5

    .line 179
    invoke-static {v8, v13, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 180
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_9
    if-eqz v9, :cond_a

    if-nez v7, :cond_a

    .line 182
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 183
    new-instance v6, Ldj2;

    invoke-direct {v6}, Ldj2;-><init>()V

    .line 184
    new-instance v8, Lrg;

    const/4 v12, 0x1

    invoke-direct {v8, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 185
    invoke-virtual {v6, v8}, Ldj2;->a(Lrg;)V

    .line 186
    invoke-static {v12, v13, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 187
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 188
    new-instance v8, Lrg;

    invoke-direct {v8, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 189
    invoke-virtual {v6, v8}, Ldj2;->a(Lrg;)V

    const/4 v12, 0x2

    .line 190
    invoke-static {v12, v13, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 191
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 192
    new-instance v8, Lrg;

    invoke-direct {v8, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 193
    invoke-virtual {v6, v8}, Ldj2;->a(Lrg;)V

    .line 194
    invoke-static {v12, v13, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 195
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_a
    const/4 v12, 0x3

    if-ne v7, v12, :cond_b

    .line 197
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 198
    new-instance v6, Ldj2;

    invoke-direct {v6}, Ldj2;-><init>()V

    .line 199
    new-instance v7, Lrg;

    const/4 v12, 0x1

    invoke-direct {v7, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 200
    invoke-virtual {v6, v7}, Ldj2;->a(Lrg;)V

    .line 201
    new-instance v7, Lrg;

    invoke-direct {v7, v12, v3, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 202
    invoke-virtual {v6, v7}, Ldj2;->a(Lrg;)V

    .line 203
    new-instance v7, Lrg;

    const/4 v8, 0x2

    invoke-direct {v7, v8, v13, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 204
    invoke-virtual {v6, v7}, Ldj2;->a(Lrg;)V

    const/4 v8, 0x5

    .line 205
    invoke-static {v8, v13, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 206
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 207
    new-instance v7, Lrg;

    invoke-direct {v7, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 208
    invoke-virtual {v6, v7}, Ldj2;->a(Lrg;)V

    .line 209
    new-instance v7, Lrg;

    invoke-direct {v7, v12, v3, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 210
    invoke-virtual {v6, v7}, Ldj2;->a(Lrg;)V

    .line 211
    new-instance v3, Lrg;

    const/4 v12, 0x3

    invoke-direct {v3, v12, v13, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 212
    invoke-virtual {v6, v3}, Ldj2;->a(Lrg;)V

    .line 213
    invoke-static {v8, v13, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 214
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 216
    :cond_b
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 217
    iget-object v3, v1, Lcj2;->l:Lgr0;

    iget-object v5, v1, Lcj2;->i:Ljava/lang/String;

    .line 218
    iget-object v3, v3, Lgr0;->a:Ljava/lang/Object;

    check-cast v3, Landroidx/camera/camera2/internal/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;

    if-nez v3, :cond_c

    .line 219
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    goto :goto_8

    .line 220
    :cond_c
    sget-object v3, Landroidx/camera/camera2/internal/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;->a:Ldj2;

    .line 221
    sget-object v3, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const-string v6, "heroqltevzw"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_11

    const-string v6, "heroqltetmo"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_d

    goto :goto_7

    .line 222
    :cond_d
    const-string v3, "google"

    sget-object v5, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_e

    const/4 v3, 0x0

    goto :goto_5

    .line 223
    :cond_e
    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v3, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 224
    sget-object v5, Landroidx/camera/camera2/internal/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;->c:Ljava/util/HashSet;

    invoke-virtual {v5, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    :goto_5
    if-nez v3, :cond_10

    .line 225
    invoke-static {}, Landroidx/camera/camera2/internal/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;->b()Z

    move-result v3

    if-eqz v3, :cond_f

    goto :goto_6

    .line 226
    :cond_f
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_8

    .line 227
    :cond_10
    :goto_6
    sget-object v3, Landroidx/camera/camera2/internal/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;->b:Ldj2;

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto :goto_8

    .line 228
    :cond_11
    :goto_7
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 229
    const-string v6, "1"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_12

    .line 230
    sget-object v5, Landroidx/camera/camera2/internal/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;->a:Ldj2;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    :cond_12
    :goto_8
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 232
    iget-boolean v0, v1, Lcj2;->r:Z

    if-eqz v0, :cond_13

    .line 233
    iget-object v0, v1, Lcj2;->b:Ljava/util/ArrayList;

    .line 234
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 235
    new-instance v5, Ldj2;

    invoke-direct {v5}, Ldj2;-><init>()V

    .line 236
    new-instance v6, Lrg;

    sget-object v7, Lej2;->v:Lej2;

    const/4 v12, 0x2

    invoke-direct {v6, v12, v7, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 237
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 238
    new-instance v6, Lrg;

    const/4 v12, 0x1

    invoke-direct {v6, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 239
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 240
    invoke-static {v12, v2, v14, v15, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 241
    invoke-static {v3, v5}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 242
    new-instance v6, Lrg;

    const/4 v8, 0x3

    invoke-direct {v6, v8, v7, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 243
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 244
    new-instance v6, Lrg;

    invoke-direct {v6, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 245
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 246
    invoke-static {v12, v2, v14, v15, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 247
    invoke-static {v3, v5}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 248
    new-instance v6, Lrg;

    const/4 v8, 0x5

    invoke-direct {v6, v8, v7, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 249
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 250
    new-instance v6, Lrg;

    invoke-direct {v6, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 251
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 252
    invoke-static {v12, v2, v14, v15, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 253
    invoke-static {v3, v5}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 254
    new-instance v6, Lrg;

    const/4 v8, 0x2

    invoke-direct {v6, v8, v7, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 255
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 256
    new-instance v6, Lrg;

    invoke-direct {v6, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 257
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    const/4 v6, 0x3

    .line 258
    invoke-static {v6, v13, v14, v15, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 259
    invoke-static {v3, v5}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 260
    new-instance v8, Lrg;

    invoke-direct {v8, v6, v7, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 261
    invoke-virtual {v5, v8}, Ldj2;->a(Lrg;)V

    .line 262
    new-instance v8, Lrg;

    invoke-direct {v8, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 263
    invoke-virtual {v5, v8}, Ldj2;->a(Lrg;)V

    .line 264
    invoke-static {v6, v13, v14, v15, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 265
    invoke-static {v3, v5}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 266
    new-instance v8, Lrg;

    const/4 v9, 0x5

    invoke-direct {v8, v9, v7, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 267
    invoke-virtual {v5, v8}, Ldj2;->a(Lrg;)V

    .line 268
    new-instance v8, Lrg;

    invoke-direct {v8, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 269
    invoke-virtual {v5, v8}, Ldj2;->a(Lrg;)V

    .line 270
    invoke-static {v6, v13, v14, v15, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 271
    invoke-static {v3, v5}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 272
    new-instance v8, Lrg;

    const/4 v9, 0x2

    invoke-direct {v8, v9, v7, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 273
    invoke-virtual {v5, v8}, Ldj2;->a(Lrg;)V

    .line 274
    new-instance v8, Lrg;

    invoke-direct {v8, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 275
    invoke-virtual {v5, v8}, Ldj2;->a(Lrg;)V

    .line 276
    invoke-static {v9, v13, v14, v15, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 277
    invoke-static {v3, v5}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 278
    new-instance v8, Lrg;

    invoke-direct {v8, v6, v7, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 279
    invoke-virtual {v5, v8}, Ldj2;->a(Lrg;)V

    .line 280
    new-instance v6, Lrg;

    invoke-direct {v6, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 281
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 282
    invoke-static {v9, v13, v14, v15, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 283
    invoke-static {v3, v5}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 284
    new-instance v6, Lrg;

    const/4 v8, 0x5

    invoke-direct {v6, v8, v7, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 285
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 286
    new-instance v6, Lrg;

    invoke-direct {v6, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 287
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 288
    invoke-static {v9, v13, v14, v15, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 289
    invoke-static {v3, v5}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 290
    new-instance v6, Lrg;

    invoke-direct {v6, v9, v7, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 291
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 292
    new-instance v6, Lrg;

    invoke-direct {v6, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 293
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    const/4 v8, 0x5

    .line 294
    invoke-static {v8, v13, v14, v15, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 295
    invoke-static {v3, v5}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 296
    new-instance v6, Lrg;

    const/4 v9, 0x3

    invoke-direct {v6, v9, v7, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 297
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 298
    new-instance v6, Lrg;

    invoke-direct {v6, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 299
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 300
    invoke-static {v8, v13, v14, v15, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 301
    invoke-static {v3, v5}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 302
    new-instance v6, Lrg;

    invoke-direct {v6, v8, v7, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 303
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 304
    new-instance v6, Lrg;

    invoke-direct {v6, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 305
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 306
    invoke-static {v8, v13, v14, v15, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 307
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 308
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 309
    :cond_13
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v3, "android.hardware.camera.concurrent"

    invoke-virtual {v0, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, v1, Lcj2;->p:Z

    .line 310
    sget-object v3, Lej2;->e:Lej2;

    if-eqz v0, :cond_14

    .line 311
    iget-object v0, v1, Lcj2;->c:Ljava/util/ArrayList;

    .line 312
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 313
    new-instance v6, Ldj2;

    invoke-direct {v6}, Ldj2;-><init>()V

    const/4 v12, 0x2

    .line 314
    invoke-static {v12, v3, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 315
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    const/4 v7, 0x1

    .line 316
    invoke-static {v7, v3, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 317
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    const/4 v8, 0x3

    .line 318
    invoke-static {v8, v3, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 319
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 320
    new-instance v9, Lrg;

    sget-object v10, Lej2;->c:Lej2;

    invoke-direct {v9, v12, v10, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 321
    invoke-virtual {v6, v9}, Ldj2;->a(Lrg;)V

    .line 322
    invoke-static {v8, v3, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 323
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 324
    new-instance v9, Lrg;

    invoke-direct {v9, v7, v10, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 325
    invoke-virtual {v6, v9}, Ldj2;->a(Lrg;)V

    .line 326
    invoke-static {v8, v3, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 327
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 328
    new-instance v7, Lrg;

    invoke-direct {v7, v12, v10, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 329
    invoke-virtual {v6, v7}, Ldj2;->a(Lrg;)V

    .line 330
    invoke-static {v12, v3, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 331
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 332
    new-instance v7, Lrg;

    invoke-direct {v7, v12, v10, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 333
    invoke-virtual {v6, v7}, Ldj2;->a(Lrg;)V

    const/4 v7, 0x1

    .line 334
    invoke-static {v7, v3, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 335
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 336
    new-instance v8, Lrg;

    invoke-direct {v8, v7, v10, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 337
    invoke-virtual {v6, v8}, Ldj2;->a(Lrg;)V

    .line 338
    invoke-static {v12, v3, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 339
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 340
    new-instance v8, Lrg;

    invoke-direct {v8, v7, v10, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 341
    invoke-virtual {v6, v8}, Ldj2;->a(Lrg;)V

    .line 342
    invoke-static {v7, v3, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 343
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 344
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 345
    :cond_14
    iget-object v0, v1, Lcj2;->x:Lk8;

    .line 346
    iget-boolean v0, v0, Lk8;->a:Z

    if-eqz v0, :cond_15

    .line 347
    iget-object v0, v1, Lcj2;->f:Ljava/util/ArrayList;

    .line 348
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 349
    new-instance v6, Ldj2;

    invoke-direct {v6}, Ldj2;-><init>()V

    const/4 v12, 0x1

    .line 350
    invoke-static {v12, v13, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 351
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    const/4 v8, 0x2

    .line 352
    invoke-static {v8, v13, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 353
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 354
    new-instance v7, Lrg;

    invoke-direct {v7, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 355
    invoke-virtual {v6, v7}, Ldj2;->a(Lrg;)V

    const/4 v9, 0x3

    .line 356
    invoke-static {v9, v13, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 357
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 358
    new-instance v7, Lrg;

    invoke-direct {v7, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 359
    invoke-virtual {v6, v7}, Ldj2;->a(Lrg;)V

    .line 360
    invoke-static {v8, v13, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 361
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 362
    new-instance v7, Lrg;

    invoke-direct {v7, v8, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 363
    invoke-virtual {v6, v7}, Ldj2;->a(Lrg;)V

    .line 364
    invoke-static {v8, v13, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 365
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 366
    new-instance v7, Lrg;

    invoke-direct {v7, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 367
    invoke-virtual {v6, v7}, Ldj2;->a(Lrg;)V

    .line 368
    invoke-static {v12, v2, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 369
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 370
    new-instance v7, Lrg;

    invoke-direct {v7, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 371
    invoke-virtual {v6, v7}, Ldj2;->a(Lrg;)V

    .line 372
    new-instance v7, Lrg;

    invoke-direct {v7, v12, v2, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 373
    invoke-virtual {v6, v7}, Ldj2;->a(Lrg;)V

    const/4 v8, 0x2

    .line 374
    invoke-static {v8, v2, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 375
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 376
    new-instance v7, Lrg;

    invoke-direct {v7, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 377
    invoke-virtual {v6, v7}, Ldj2;->a(Lrg;)V

    .line 378
    new-instance v7, Lrg;

    invoke-direct {v7, v12, v2, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 379
    invoke-virtual {v6, v7}, Ldj2;->a(Lrg;)V

    const/4 v12, 0x3

    .line 380
    invoke-static {v12, v2, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 381
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 382
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 383
    :cond_15
    iget-object v0, v1, Lcj2;->k:Lgp;

    invoke-virtual {v0}, Lgp;->b()Lac1;

    move-result-object v0

    .line 384
    iget-object v0, v0, Lac1;->b:Ljava/lang/Object;

    check-cast v0, Lts0;

    .line 385
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x0

    .line 386
    :try_start_1
    iget-object v0, v0, Lts0;->a:Ljava/lang/Object;

    check-cast v0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    invoke-virtual {v0}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputFormats()[I

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_a

    :catch_0
    move-exception v0

    goto :goto_9

    :catch_1
    move-exception v0

    .line 387
    :goto_9
    const-string v6, "StreamConfigurationMapCompatBaseImpl"

    const-string v7, "Failed to get output formats from StreamConfigurationMap"

    invoke-static {v6, v7, v0}, Lhu0;->I0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v5

    :goto_a
    if-nez v0, :cond_16

    goto :goto_b

    .line 388
    :cond_16
    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, [I

    :goto_b
    if-nez v5, :cond_17

    goto :goto_d

    .line 389
    :cond_17
    array-length v0, v5

    const/4 v6, 0x0

    :goto_c
    if-ge v6, v0, :cond_19

    aget v7, v5, v6

    const/16 v8, 0x1005

    if-ne v7, v8, :cond_18

    .line 390
    iget-object v0, v1, Lcj2;->g:Ljava/util/ArrayList;

    .line 391
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 392
    new-instance v6, Ldj2;

    invoke-direct {v6}, Ldj2;-><init>()V

    const/4 v7, 0x4

    .line 393
    invoke-static {v7, v13, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 394
    invoke-static {v5, v6}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v6

    .line 395
    new-instance v8, Lrg;

    const/4 v12, 0x1

    invoke-direct {v8, v12, v4, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 396
    invoke-virtual {v6, v8}, Ldj2;->a(Lrg;)V

    .line 397
    invoke-static {v7, v13, v14, v15, v6}, Lfm0;->u(ILej2;JLdj2;)V

    .line 398
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 399
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_d

    :cond_18
    add-int/lit8 v6, v6, 0x1

    goto :goto_c

    .line 400
    :cond_19
    :goto_d
    iget-object v0, v1, Lcj2;->k:Lgp;

    sget-object v5, Lnh2;->a:Llf;

    .line 401
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x21

    if-ge v5, v6, :cond_1b

    :cond_1a
    :goto_e
    const/4 v0, 0x0

    goto :goto_f

    .line 402
    :cond_1b
    invoke-static {}, Lx72;->d()Landroid/hardware/camera2/CameraCharacteristics$Key;

    move-result-object v7

    invoke-virtual {v0, v7}, Lgp;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    if-eqz v0, :cond_1a

    .line 403
    array-length v0, v0

    if-nez v0, :cond_1c

    goto :goto_e

    :cond_1c
    const/4 v0, 0x1

    .line 404
    :goto_f
    iput-boolean v0, v1, Lcj2;->q:Z

    if-eqz v0, :cond_1d

    if-lt v5, v6, :cond_1d

    .line 405
    iget-object v0, v1, Lcj2;->h:Ljava/util/ArrayList;

    .line 406
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 407
    new-instance v8, Ldj2;

    invoke-direct {v8}, Ldj2;-><init>()V

    const-wide/16 v9, 0x4

    const/4 v12, 0x1

    .line 408
    invoke-static {v12, v3, v9, v10, v8}, Lfm0;->u(ILej2;JLdj2;)V

    .line 409
    invoke-static {v7, v8}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v8

    const/4 v11, 0x2

    .line 410
    invoke-static {v11, v3, v9, v10, v8}, Lfm0;->u(ILej2;JLdj2;)V

    .line 411
    invoke-static {v7, v8}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v8

    const-wide/16 v9, 0x3

    .line 412
    invoke-static {v12, v2, v9, v10, v8}, Lfm0;->u(ILej2;JLdj2;)V

    .line 413
    invoke-static {v7, v8}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v8

    .line 414
    invoke-static {v11, v2, v9, v10, v8}, Lfm0;->u(ILej2;JLdj2;)V

    .line 415
    invoke-static {v7, v8}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v8

    const-wide/16 v14, 0x2

    const/4 v6, 0x3

    .line 416
    invoke-static {v6, v13, v14, v15, v8}, Lfm0;->u(ILej2;JLdj2;)V

    .line 417
    invoke-static {v7, v8}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v8

    .line 418
    invoke-static {v11, v13, v14, v15, v8}, Lfm0;->u(ILej2;JLdj2;)V

    .line 419
    invoke-static {v7, v8}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v8

    .line 420
    new-instance v9, Lrg;

    move-object/from16 p4, v7

    const-wide/16 v6, 0x1

    invoke-direct {v9, v12, v4, v6, v7}, Lrg;-><init>(ILej2;J)V

    .line 421
    invoke-virtual {v8, v9}, Ldj2;->a(Lrg;)V

    const/4 v9, 0x3

    .line 422
    invoke-static {v9, v13, v14, v15, v8}, Lfm0;->u(ILej2;JLdj2;)V

    move-object/from16 v9, p4

    .line 423
    invoke-static {v9, v8}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v8

    .line 424
    new-instance v10, Lrg;

    invoke-direct {v10, v12, v4, v6, v7}, Lrg;-><init>(ILej2;J)V

    .line 425
    invoke-virtual {v8, v10}, Ldj2;->a(Lrg;)V

    .line 426
    invoke-static {v11, v13, v14, v15, v8}, Lfm0;->u(ILej2;JLdj2;)V

    .line 427
    invoke-static {v9, v8}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v8

    .line 428
    new-instance v10, Lrg;

    invoke-direct {v10, v12, v4, v6, v7}, Lrg;-><init>(ILej2;J)V

    .line 429
    invoke-virtual {v8, v10}, Ldj2;->a(Lrg;)V

    const-wide/16 v14, 0x3

    .line 430
    invoke-static {v12, v2, v14, v15, v8}, Lfm0;->u(ILej2;JLdj2;)V

    .line 431
    invoke-static {v9, v8}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v8

    .line 432
    new-instance v10, Lrg;

    invoke-direct {v10, v12, v4, v6, v7}, Lrg;-><init>(ILej2;J)V

    .line 433
    invoke-virtual {v8, v10}, Ldj2;->a(Lrg;)V

    .line 434
    invoke-static {v11, v2, v14, v15, v8}, Lfm0;->u(ILej2;JLdj2;)V

    .line 435
    invoke-static {v9, v8}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v8

    .line 436
    new-instance v10, Lrg;

    invoke-direct {v10, v12, v4, v6, v7}, Lrg;-><init>(ILej2;J)V

    .line 437
    invoke-virtual {v8, v10}, Ldj2;->a(Lrg;)V

    .line 438
    invoke-static {v11, v4, v6, v7, v8}, Lfm0;->u(ILej2;JLdj2;)V

    .line 439
    invoke-static {v9, v8}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v8

    .line 440
    new-instance v10, Lrg;

    invoke-direct {v10, v12, v4, v6, v7}, Lrg;-><init>(ILej2;J)V

    .line 441
    invoke-virtual {v8, v10}, Ldj2;->a(Lrg;)V

    .line 442
    new-instance v10, Lrg;

    invoke-direct {v10, v12, v2, v14, v15}, Lrg;-><init>(ILej2;J)V

    .line 443
    invoke-virtual {v8, v10}, Ldj2;->a(Lrg;)V

    const/4 v10, 0x3

    const-wide/16 v14, 0x2

    .line 444
    invoke-static {v10, v2, v14, v15, v8}, Lfm0;->u(ILej2;JLdj2;)V

    .line 445
    invoke-static {v9, v8}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v8

    .line 446
    new-instance v11, Lrg;

    invoke-direct {v11, v12, v4, v6, v7}, Lrg;-><init>(ILej2;J)V

    .line 447
    invoke-virtual {v8, v11}, Ldj2;->a(Lrg;)V

    .line 448
    new-instance v11, Lrg;

    move-object/from16 p4, v13

    const/4 v6, 0x2

    const-wide/16 v12, 0x3

    invoke-direct {v11, v6, v2, v12, v13}, Lrg;-><init>(ILej2;J)V

    .line 449
    invoke-virtual {v8, v11}, Ldj2;->a(Lrg;)V

    .line 450
    invoke-static {v10, v2, v14, v15, v8}, Lfm0;->u(ILej2;JLdj2;)V

    .line 451
    invoke-static {v9, v8}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v2

    .line 452
    new-instance v7, Lrg;

    const-wide/16 v10, 0x1

    const/4 v12, 0x1

    invoke-direct {v7, v12, v4, v10, v11}, Lrg;-><init>(ILej2;J)V

    .line 453
    invoke-virtual {v2, v7}, Ldj2;->a(Lrg;)V

    .line 454
    new-instance v7, Lrg;

    invoke-direct {v7, v6, v4, v10, v11}, Lrg;-><init>(ILej2;J)V

    .line 455
    invoke-virtual {v2, v7}, Ldj2;->a(Lrg;)V

    move-object/from16 v6, p4

    const/4 v12, 0x3

    .line 456
    invoke-static {v12, v6, v14, v15, v2}, Lfm0;->u(ILej2;JLdj2;)V

    .line 457
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 458
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_10

    :cond_1d
    move-object v6, v13

    .line 459
    :goto_10
    iget-object v0, v1, Lcj2;->k:Lgp;

    const/16 v2, 0x21

    if-ge v5, v2, :cond_1e

    goto/16 :goto_12

    .line 460
    :cond_1e
    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v2}, Lgp;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    if-eqz v0, :cond_21

    .line 461
    array-length v2, v0

    if-nez v2, :cond_1f

    goto/16 :goto_12

    .line 462
    :cond_1f
    array-length v2, v0

    const/4 v5, 0x0

    :goto_11
    if-ge v5, v2, :cond_21

    aget v7, v0, v5

    const/4 v12, 0x2

    if-ne v7, v12, :cond_20

    .line 463
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x21

    if-lt v0, v7, :cond_21

    .line 464
    iget-object v0, v1, Lcj2;->d:Ljava/util/ArrayList;

    .line 465
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 466
    new-instance v5, Ldj2;

    invoke-direct {v5}, Ldj2;-><init>()V

    const/4 v8, 0x1

    const-wide/16 v9, 0x0

    .line 467
    invoke-static {v8, v3, v9, v10, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 468
    invoke-static {v2, v5}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 469
    invoke-static {v12, v3, v9, v10, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 470
    invoke-static {v2, v5}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 471
    new-instance v7, Lrg;

    invoke-direct {v7, v8, v3, v9, v10}, Lrg;-><init>(ILej2;J)V

    .line 472
    invoke-virtual {v5, v7}, Ldj2;->a(Lrg;)V

    const/4 v11, 0x3

    .line 473
    invoke-static {v11, v6, v9, v10, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 474
    invoke-static {v2, v5}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 475
    new-instance v7, Lrg;

    invoke-direct {v7, v12, v3, v9, v10}, Lrg;-><init>(ILej2;J)V

    .line 476
    invoke-virtual {v5, v7}, Ldj2;->a(Lrg;)V

    .line 477
    invoke-static {v11, v6, v9, v10, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 478
    invoke-static {v2, v5}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 479
    new-instance v7, Lrg;

    invoke-direct {v7, v8, v3, v9, v10}, Lrg;-><init>(ILej2;J)V

    .line 480
    invoke-virtual {v5, v7}, Ldj2;->a(Lrg;)V

    .line 481
    invoke-static {v12, v6, v9, v10, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 482
    invoke-static {v2, v5}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 483
    new-instance v7, Lrg;

    invoke-direct {v7, v12, v3, v9, v10}, Lrg;-><init>(ILej2;J)V

    .line 484
    invoke-virtual {v5, v7}, Ldj2;->a(Lrg;)V

    .line 485
    invoke-static {v12, v6, v9, v10, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 486
    invoke-static {v2, v5}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 487
    new-instance v6, Lrg;

    invoke-direct {v6, v8, v4, v9, v10}, Lrg;-><init>(ILej2;J)V

    .line 488
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 489
    invoke-static {v8, v3, v9, v10, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 490
    invoke-static {v2, v5}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 491
    new-instance v6, Lrg;

    invoke-direct {v6, v12, v4, v9, v10}, Lrg;-><init>(ILej2;J)V

    .line 492
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 493
    invoke-static {v8, v3, v9, v10, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 494
    invoke-static {v2, v5}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 495
    new-instance v6, Lrg;

    invoke-direct {v6, v8, v4, v9, v10}, Lrg;-><init>(ILej2;J)V

    .line 496
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 497
    invoke-static {v12, v3, v9, v10, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 498
    invoke-static {v2, v5}, Lfm0;->e(Ljava/util/ArrayList;Ldj2;)Ldj2;

    move-result-object v5

    .line 499
    new-instance v6, Lrg;

    invoke-direct {v6, v12, v4, v9, v10}, Lrg;-><init>(ILej2;J)V

    .line 500
    invoke-virtual {v5, v6}, Ldj2;->a(Lrg;)V

    .line 501
    invoke-static {v12, v3, v9, v10, v5}, Lfm0;->u(ILej2;JLdj2;)V

    .line 502
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 503
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_12

    :cond_20
    const/16 v7, 0x21

    const/4 v8, 0x1

    const-wide/16 v9, 0x0

    const/4 v11, 0x3

    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_11

    .line 504
    :cond_21
    :goto_12
    invoke-virtual {v1}, Lcj2;->b()V

    return-void

    :catch_2
    move-exception v0

    .line 505
    new-instance v1, Lmq;

    .line 506
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 507
    throw v1
.end method

.method public static c(Landroid/hardware/camera2/params/StreamConfigurationMap;IZ)Landroid/util/Size;
    .locals 3

    .line 1
    const/16 v0, 0x22

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const-class v0, Landroid/graphics/SurfaceTexture;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(Ljava/lang/Class;)[Landroid/util/Size;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    if-eqz v0, :cond_3

    .line 17
    .line 18
    array-length v1, v0

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    new-instance v1, Lhx;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v1, v2}, Lhx;-><init>(Z)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Landroid/util/Size;

    .line 37
    .line 38
    sget-object v2, Lue2;->a:Landroid/util/Size;

    .line 39
    .line 40
    if-eqz p2, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getHighResolutionOutputSizes(I)[Landroid/util/Size;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    array-length p1, p0

    .line 49
    if-lez p1, :cond_2

    .line 50
    .line 51
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    move-object v2, p0

    .line 60
    check-cast v2, Landroid/util/Size;

    .line 61
    .line 62
    :cond_2
    filled-new-array {v0, v2}, [Landroid/util/Size;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {p0, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Landroid/util/Size;

    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 78
    return-object p0
.end method

.method public static e(Landroid/util/Range;Landroid/util/Range;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    const-string v1, "Ranges must not intersect"

    .line 29
    .line 30
    invoke-static {v1, v0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-le v0, v1, :cond_1

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Ljava/lang/Integer;

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Ljava/lang/Integer;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    sub-int/2addr p0, p1

    .line 76
    return p0

    .line 77
    :cond_1
    invoke-virtual {p1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Ljava/lang/Integer;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-virtual {p0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, Ljava/lang/Integer;

    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    sub-int/2addr p1, p0

    .line 98
    return p1
.end method

.method public static f(Landroid/util/Range;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    sub-int/2addr v0, p0

    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    return v0
.end method


# virtual methods
.method public final a(Lqg;Ljava/util/List;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcj2;->e:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ljava/util/List;

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-boolean v3, p1, Lqg;->d:Z

    .line 23
    .line 24
    iget v4, p1, Lqg;->a:I

    .line 25
    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    if-nez v4, :cond_6

    .line 29
    .line 30
    iget-object p0, p0, Lcj2;->g:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget v3, p1, Lqg;->b:I

    .line 37
    .line 38
    const/16 v5, 0x8

    .line 39
    .line 40
    if-ne v3, v5, :cond_5

    .line 41
    .line 42
    if-eq v4, v2, :cond_4

    .line 43
    .line 44
    const/4 v3, 0x2

    .line 45
    iget-object v5, p0, Lcj2;->a:Ljava/util/ArrayList;

    .line 46
    .line 47
    if-eq v4, v3, :cond_3

    .line 48
    .line 49
    iget-boolean v3, p1, Lqg;->c:Z

    .line 50
    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    iget-object v5, p0, Lcj2;->d:Ljava/util/ArrayList;

    .line 54
    .line 55
    :cond_2
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    iget-object p0, p0, Lcj2;->b:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    iget-object p0, p0, Lcj2;->c:Ljava/util/ArrayList;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_5
    const/16 v5, 0xa

    .line 72
    .line 73
    if-ne v3, v5, :cond_6

    .line 74
    .line 75
    if-nez v4, :cond_6

    .line 76
    .line 77
    iget-object p0, p0, Lcj2;->f:Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 80
    .line 81
    .line 82
    :cond_6
    :goto_0
    move-object p0, v1

    .line 83
    :goto_1
    invoke-virtual {v0, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    :goto_2
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    const/4 p1, 0x0

    .line 91
    move v0, p1

    .line 92
    :cond_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_9

    .line 97
    .line 98
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Ldj2;

    .line 103
    .line 104
    invoke-virtual {v0, p2}, Ldj2;->c(Ljava/util/List;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-eqz v0, :cond_8

    .line 109
    .line 110
    move v0, v2

    .line 111
    goto :goto_3

    .line 112
    :cond_8
    move v0, p1

    .line 113
    :goto_3
    if-eqz v0, :cond_7

    .line 114
    .line 115
    :cond_9
    return v0
.end method

.method public final b()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcj2;->u:Lc90;

    .line 2
    .line 3
    invoke-virtual {v0}, Lc90;->e()Landroid/util/Size;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    const/4 v0, 0x1

    .line 8
    :try_start_0
    iget-object v1, p0, Lcj2;->i:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    iget-object v2, p0, Lcj2;->j:Ldc0;

    .line 15
    .line 16
    invoke-virtual {v2, v1, v0}, Ldc0;->j(II)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v5, 0x0

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {v2, v1, v0}, Ldc0;->g(II)Landroid/media/CamcorderProfile;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v0, v5

    .line 29
    :goto_0
    if-eqz v0, :cond_1

    .line 30
    .line 31
    new-instance v1, Landroid/util/Size;

    .line 32
    .line 33
    iget v2, v0, Landroid/media/CamcorderProfile;->videoFrameWidth:I

    .line 34
    .line 35
    iget v0, v0, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    .line 36
    .line 37
    invoke-direct {v1, v2, v0}, Landroid/util/Size;-><init>(II)V

    .line 38
    .line 39
    .line 40
    :goto_1
    move-object v6, v1

    .line 41
    goto/16 :goto_5

    .line 42
    .line 43
    :cond_1
    sget-object v0, Lue2;->c:Landroid/util/Size;

    .line 44
    .line 45
    const/16 v3, 0xa

    .line 46
    .line 47
    invoke-virtual {v2, v1, v3}, Ldc0;->j(II)Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_2

    .line 52
    .line 53
    invoke-virtual {v2, v1, v3}, Ldc0;->g(II)Landroid/media/CamcorderProfile;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    const/16 v3, 0x8

    .line 59
    .line 60
    invoke-virtual {v2, v1, v3}, Ldc0;->j(II)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_3

    .line 65
    .line 66
    invoke-virtual {v2, v1, v3}, Ldc0;->g(II)Landroid/media/CamcorderProfile;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    const/16 v3, 0xc

    .line 72
    .line 73
    invoke-virtual {v2, v1, v3}, Ldc0;->j(II)Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-eqz v6, :cond_4

    .line 78
    .line 79
    invoke-virtual {v2, v1, v3}, Ldc0;->g(II)Landroid/media/CamcorderProfile;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    goto :goto_2

    .line 84
    :cond_4
    const/4 v3, 0x6

    .line 85
    invoke-virtual {v2, v1, v3}, Ldc0;->j(II)Z

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-eqz v6, :cond_5

    .line 90
    .line 91
    invoke-virtual {v2, v1, v3}, Ldc0;->g(II)Landroid/media/CamcorderProfile;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    goto :goto_2

    .line 96
    :cond_5
    const/4 v3, 0x5

    .line 97
    invoke-virtual {v2, v1, v3}, Ldc0;->j(II)Z

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-eqz v6, :cond_6

    .line 102
    .line 103
    invoke-virtual {v2, v1, v3}, Ldc0;->g(II)Landroid/media/CamcorderProfile;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    goto :goto_2

    .line 108
    :cond_6
    const/4 v3, 0x4

    .line 109
    invoke-virtual {v2, v1, v3}, Ldc0;->j(II)Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-eqz v6, :cond_7

    .line 114
    .line 115
    invoke-virtual {v2, v1, v3}, Ldc0;->g(II)Landroid/media/CamcorderProfile;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    :cond_7
    :goto_2
    if-eqz v5, :cond_8

    .line 120
    .line 121
    new-instance v1, Landroid/util/Size;

    .line 122
    .line 123
    iget v0, v5, Landroid/media/CamcorderProfile;->videoFrameWidth:I

    .line 124
    .line 125
    iget v2, v5, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    .line 126
    .line 127
    invoke-direct {v1, v0, v2}, Landroid/util/Size;-><init>(II)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_8
    move-object v6, v0

    .line 132
    goto :goto_5

    .line 133
    :catch_0
    iget-object v1, p0, Lcj2;->k:Lgp;

    .line 134
    .line 135
    invoke-virtual {v1}, Lgp;->b()Lac1;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    iget-object v1, v1, Lac1;->b:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v1, Lts0;

    .line 142
    .line 143
    iget-object v1, v1, Lts0;->a:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v1, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 146
    .line 147
    const-class v2, Landroid/media/MediaRecorder;

    .line 148
    .line 149
    invoke-virtual {v1, v2}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(Ljava/lang/Class;)[Landroid/util/Size;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    if-nez v1, :cond_9

    .line 154
    .line 155
    sget-object v0, Lue2;->c:Landroid/util/Size;

    .line 156
    .line 157
    :goto_3
    move-object v1, v0

    .line 158
    goto :goto_1

    .line 159
    :cond_9
    new-instance v2, Lhx;

    .line 160
    .line 161
    invoke-direct {v2, v0}, Lhx;-><init>(Z)V

    .line 162
    .line 163
    .line 164
    invoke-static {v1, v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 165
    .line 166
    .line 167
    array-length v0, v1

    .line 168
    const/4 v2, 0x0

    .line 169
    :goto_4
    if-ge v2, v0, :cond_b

    .line 170
    .line 171
    aget-object v3, v1, v2

    .line 172
    .line 173
    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    sget-object v6, Lue2;->e:Landroid/util/Size;

    .line 178
    .line 179
    invoke-virtual {v6}, Landroid/util/Size;->getWidth()I

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    if-gt v5, v7, :cond_a

    .line 184
    .line 185
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    invoke-virtual {v6}, Landroid/util/Size;->getHeight()I

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    if-gt v5, v6, :cond_a

    .line 194
    .line 195
    move-object v1, v3

    .line 196
    goto/16 :goto_1

    .line 197
    .line 198
    :cond_a
    add-int/lit8 v2, v2, 0x1

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_b
    sget-object v0, Lue2;->c:Landroid/util/Size;

    .line 202
    .line 203
    goto :goto_3

    .line 204
    :goto_5
    sget-object v2, Lue2;->b:Landroid/util/Size;

    .line 205
    .line 206
    new-instance v3, Ljava/util/HashMap;

    .line 207
    .line 208
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 209
    .line 210
    .line 211
    new-instance v5, Ljava/util/HashMap;

    .line 212
    .line 213
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 214
    .line 215
    .line 216
    new-instance v7, Ljava/util/HashMap;

    .line 217
    .line 218
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 219
    .line 220
    .line 221
    new-instance v8, Ljava/util/HashMap;

    .line 222
    .line 223
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 224
    .line 225
    .line 226
    new-instance v1, Lwg;

    .line 227
    .line 228
    invoke-direct/range {v1 .. v8}, Lwg;-><init>(Landroid/util/Size;Ljava/util/HashMap;Landroid/util/Size;Ljava/util/HashMap;Landroid/util/Size;Ljava/util/HashMap;Ljava/util/HashMap;)V

    .line 229
    .line 230
    .line 231
    iput-object v1, p0, Lcj2;->s:Lwg;

    .line 232
    .line 233
    return-void
.end method

.method public final d(Lqg;Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lnh2;->a:Llf;

    .line 2
    .line 3
    iget v0, p1, Lqg;->a:I

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget p1, p1, Lqg;->b:I

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    if-ne p1, v0, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, Lcj2;->h:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ldj2;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Ldj2;->c(Ljava/util/List;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public final g(ILjava/util/ArrayList;Ljava/util/HashMap;ZZ)Landroid/util/Pair;
    .locals 33

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p3

    .line 1
    sget-object v3, Lmb0;->c:Lmb0;

    const/4 v9, 0x0

    .line 2
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 3
    iget-object v5, v0, Lcj2;->u:Lc90;

    .line 4
    invoke-virtual {v5}, Lc90;->a()Landroid/util/Size;

    move-result-object v6

    .line 5
    iput-object v6, v5, Lc90;->b:Landroid/util/Size;

    .line 6
    iget-object v5, v0, Lcj2;->s:Lwg;

    if-nez v5, :cond_0

    .line 7
    invoke-virtual {v0}, Lcj2;->b()V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v5, v0, Lcj2;->u:Lc90;

    invoke-virtual {v5}, Lc90;->e()Landroid/util/Size;

    move-result-object v13

    .line 9
    iget-object v5, v0, Lcj2;->s:Lwg;

    .line 10
    iget-object v11, v5, Lwg;->a:Landroid/util/Size;

    .line 11
    iget-object v12, v5, Lwg;->b:Ljava/util/HashMap;

    .line 12
    iget-object v14, v5, Lwg;->d:Ljava/util/HashMap;

    .line 13
    iget-object v15, v5, Lwg;->e:Landroid/util/Size;

    .line 14
    iget-object v6, v5, Lwg;->f:Ljava/util/HashMap;

    .line 15
    iget-object v5, v5, Lwg;->g:Ljava/util/HashMap;

    .line 16
    new-instance v10, Lwg;

    move-object/from16 v17, v5

    move-object/from16 v16, v6

    invoke-direct/range {v10 .. v17}, Lwg;-><init>(Landroid/util/Size;Ljava/util/HashMap;Landroid/util/Size;Ljava/util/HashMap;Landroid/util/Size;Ljava/util/HashMap;Ljava/util/HashMap;)V

    .line 17
    iput-object v10, v0, Lcj2;->s:Lwg;

    .line 18
    :goto_0
    new-instance v5, Ljava/util/ArrayList;

    .line 19
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 20
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 21
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 22
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_1
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lzy2;

    .line 23
    sget-object v11, Lzy2;->K:Llf;

    invoke-interface {v10, v11, v4}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1

    .line 25
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 26
    :cond_2
    invoke-static {v7}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 27
    invoke-static {v7}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 28
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 29
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_4
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lzy2;

    .line 30
    sget-object v12, Lzy2;->K:Llf;

    invoke-interface {v11, v12, v4}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    if-ne v8, v12, :cond_4

    .line 31
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 32
    :cond_5
    iget-object v4, v0, Lcj2;->x:Lk8;

    .line 33
    iget-object v7, v4, Lk8;->c:Ljava/lang/Object;

    check-cast v7, Lqc3;

    .line 34
    new-instance v8, Ljava/util/LinkedHashSet;

    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    .line 35
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Laf;

    .line 36
    iget-object v11, v11, Laf;->d:Lmb0;

    .line 37
    invoke-interface {v8, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 38
    :cond_6
    iget-object v10, v7, Lqc3;->b:Ljava/lang/Object;

    check-cast v10, Lpb0;

    .line 39
    invoke-interface {v10}, Lpb0;->b()Ljava/util/Set;

    move-result-object v10

    .line 40
    new-instance v11, Ljava/util/HashSet;

    invoke-direct {v11, v10}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 41
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lmb0;

    .line 42
    invoke-static {v11, v13, v7}, Lk8;->m(Ljava/util/HashSet;Lmb0;Lqc3;)V

    goto :goto_4

    .line 43
    :cond_7
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 44
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 45
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 46
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_5
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_c

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/Integer;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 47
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lzy2;

    move-object/from16 v16, v6

    .line 48
    sget-object v6, Lhw0;->p:Llf;

    invoke-interface {v9, v6, v3}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lmb0;

    .line 49
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    invoke-virtual {v6, v3}, Lmb0;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_8

    .line 51
    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v19, v15

    goto :goto_7

    :cond_8
    move-object/from16 v19, v15

    .line 52
    iget v15, v6, Lmb0;->a:I

    iget v6, v6, Lmb0;->b:I

    move/from16 v20, v6

    const/4 v6, 0x2

    if-eq v15, v6, :cond_b

    if-eqz v15, :cond_9

    if-eqz v20, :cond_b

    :cond_9
    if-nez v15, :cond_a

    if-eqz v20, :cond_a

    goto :goto_6

    .line 53
    :cond_a
    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 54
    :cond_b
    :goto_6
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_7
    move-object/from16 v6, v16

    move-object/from16 v15, v19

    const/4 v9, 0x0

    goto :goto_5

    :cond_c
    move-object/from16 v16, v6

    .line 55
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 56
    new-instance v6, Ljava/util/LinkedHashSet;

    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 57
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 58
    invoke-virtual {v15, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 59
    invoke-virtual {v15, v13}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 60
    invoke-virtual {v15, v14}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 61
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_8
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    const/16 v20, 0x0

    if-eqz v13, :cond_1b

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lzy2;

    .line 62
    sget-object v14, Lhw0;->p:Llf;

    invoke-interface {v13, v14, v3}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lmb0;

    .line 63
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    sget-object v15, Lrm2;->D:Llf;

    invoke-interface {v13, v15}, Lx02;->e(Llf;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    .line 65
    sget-object v15, Lmb0;->d:Lmb0;

    invoke-virtual {v14}, Lmb0;->b()Z

    move-result v23

    if-eqz v23, :cond_f

    .line 66
    invoke-virtual {v11, v14}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_d

    move-object/from16 v23, v3

    move-object/from16 v25, v5

    move-object/from16 v24, v12

    move-object v5, v14

    goto/16 :goto_b

    :cond_d
    move-object/from16 v23, v3

    move-object/from16 v25, v5

    move-object/from16 v24, v12

    :cond_e
    move-object/from16 v5, v20

    goto/16 :goto_b

    :cond_f
    move-object/from16 v23, v3

    .line 67
    iget v3, v14, Lmb0;->a:I

    move-object/from16 v24, v12

    .line 68
    iget v12, v14, Lmb0;->b:I

    move-object/from16 v25, v5

    const/4 v5, 0x1

    if-ne v3, v5, :cond_10

    if-nez v12, :cond_10

    .line 69
    invoke-virtual {v11, v15}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    :goto_9
    move-object v5, v15

    goto/16 :goto_b

    .line 70
    :cond_10
    invoke-static {v14, v8, v11}, Lk8;->i(Lmb0;Ljava/util/LinkedHashSet;Ljava/util/HashSet;)Lmb0;

    move-result-object v5

    .line 71
    const-string v22, "DynamicRangeResolver"

    if-eqz v5, :cond_11

    .line 72
    invoke-virtual {v14}, Lmb0;->toString()Ljava/lang/String;

    invoke-virtual {v5}, Lmb0;->toString()Ljava/lang/String;

    .line 73
    invoke-static/range {v22 .. v22}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    goto/16 :goto_b

    .line 74
    :cond_11
    invoke-static {v14, v6, v11}, Lk8;->i(Lmb0;Ljava/util/LinkedHashSet;Ljava/util/HashSet;)Lmb0;

    move-result-object v5

    if-eqz v5, :cond_12

    .line 75
    invoke-virtual {v14}, Lmb0;->toString()Ljava/lang/String;

    invoke-virtual {v5}, Lmb0;->toString()Ljava/lang/String;

    .line 76
    invoke-static/range {v22 .. v22}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    goto/16 :goto_b

    .line 77
    :cond_12
    invoke-static {v14, v15, v11}, Lk8;->c(Lmb0;Lmb0;Ljava/util/HashSet;)Z

    move-result v5

    if-eqz v5, :cond_13

    .line 78
    invoke-virtual {v14}, Lmb0;->toString()Ljava/lang/String;

    invoke-virtual {v15}, Lmb0;->toString()Ljava/lang/String;

    .line 79
    invoke-static/range {v22 .. v22}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    goto :goto_9

    :cond_13
    const/4 v5, 0x2

    if-ne v3, v5, :cond_16

    const/16 v3, 0xa

    if-eq v12, v3, :cond_14

    if-nez v12, :cond_16

    .line 80
    :cond_14
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 81
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v12, 0x21

    if-lt v5, v12, :cond_15

    .line 82
    iget-object v5, v4, Lk8;->b:Ljava/lang/Object;

    check-cast v5, Lgp;

    invoke-static {v5}, Lob0;->a(Lgp;)Lmb0;

    move-result-object v5

    if-eqz v5, :cond_15

    .line 83
    invoke-interface {v3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 84
    :cond_15
    sget-object v5, Lmb0;->e:Lmb0;

    invoke-interface {v3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 85
    invoke-static {v14, v3, v11}, Lk8;->i(Lmb0;Ljava/util/LinkedHashSet;Ljava/util/HashSet;)Lmb0;

    move-result-object v3

    if-eqz v3, :cond_16

    .line 86
    invoke-virtual {v14}, Lmb0;->toString()Ljava/lang/String;

    invoke-virtual {v3}, Lmb0;->toString()Ljava/lang/String;

    .line 87
    invoke-static/range {v22 .. v22}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    move-object v5, v3

    goto :goto_b

    .line 88
    :cond_16
    invoke-virtual {v11}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lmb0;

    .line 89
    invoke-virtual {v5}, Lmb0;->b()Z

    move-result v12

    move-object/from16 v19, v3

    const-string v3, "Candidate dynamic range must be fully specified."

    invoke-static {v3, v12}, Lde3;->j(Ljava/lang/String;Z)V

    .line 90
    invoke-virtual {v5, v15}, Lmb0;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_18

    :cond_17
    move-object/from16 v3, v19

    goto :goto_a

    .line 91
    :cond_18
    invoke-static {v14, v5}, Lk8;->b(Lmb0;Lmb0;)Z

    move-result v3

    if-eqz v3, :cond_17

    .line 92
    invoke-virtual {v14}, Lmb0;->toString()Ljava/lang/String;

    invoke-virtual {v5}, Lmb0;->toString()Ljava/lang/String;

    .line 93
    invoke-static/range {v22 .. v22}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    :goto_b
    if-eqz v5, :cond_1a

    .line 94
    invoke-static {v11, v5, v7}, Lk8;->m(Ljava/util/HashSet;Lmb0;Lqc3;)V

    .line 95
    invoke-virtual {v9, v13, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    invoke-interface {v8, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_19

    .line 97
    invoke-interface {v6, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_19
    move-object/from16 v3, v23

    move-object/from16 v12, v24

    move-object/from16 v5, v25

    goto/16 :goto_8

    .line 98
    :cond_1a
    sget-object v0, Lrm2;->D:Llf;

    invoke-interface {v13, v0}, Lx02;->e(Llf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 99
    const-string v1, "\n  "

    invoke-static {v1, v10}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v2

    .line 100
    invoke-static {v1, v11}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    .line 101
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\nRequested dynamic range:\n  "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\nSupported dynamic ranges:\n  "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\nConstrained set of concurrent dynamic ranges:\n  "

    .line 102
    invoke-static {v3, v2, v0, v1}, Lfm0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 103
    invoke-static {v0}, Ln4;->j(Ljava/lang/String;)V

    return-object v20

    :cond_1b
    move-object/from16 v25, v5

    .line 104
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/16 v5, 0x1005

    if-eqz v4, :cond_1d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Laf;

    .line 105
    iget v4, v4, Laf;->b:I

    if-ne v4, v5, :cond_1c

    :goto_c
    const/4 v3, 0x1

    goto :goto_d

    .line 106
    :cond_1d
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lzy2;

    .line 107
    invoke-interface {v4}, Lhw0;->l()I

    move-result v4

    if-ne v4, v5, :cond_1e

    goto :goto_c

    :cond_1f
    const/4 v3, 0x0

    .line 108
    :goto_d
    iget-object v4, v0, Lcj2;->i:Ljava/lang/String;

    .line 109
    invoke-virtual {v9}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_20
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_21

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lmb0;

    .line 110
    iget v6, v6, Lmb0;->b:I

    const/16 v7, 0xa

    if-ne v6, v7, :cond_20

    const/16 v5, 0xa

    goto :goto_e

    :cond_21
    const/16 v5, 0x8

    .line 111
    :goto_e
    const-string v6, "CONCURRENT_CAMERA"

    const-string v7, "ULTRA_HIGH_RESOLUTION_CAMERA"

    const-string v8, "DEFAULT"

    const-string v10, " camera mode."

    const-string v11, "Camera device id is "

    if-eqz v1, :cond_25

    if-nez v3, :cond_22

    goto :goto_10

    .line 112
    :cond_22
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/4 v5, 0x1

    if-eq v1, v5, :cond_24

    const/4 v5, 0x2

    if-eq v1, v5, :cond_23

    move-object v6, v8

    goto :goto_f

    :cond_23
    move-object v6, v7

    :cond_24
    :goto_f
    const-string v1, ". Ultra HDR is not currently supported in "

    .line 113
    invoke-static {v11, v4, v1, v6, v10}, Lfm0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 114
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_25
    :goto_10
    if-eqz v1, :cond_29

    const/16 v12, 0xa

    if-eq v5, v12, :cond_26

    goto :goto_12

    .line 115
    :cond_26
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/4 v5, 0x1

    if-eq v1, v5, :cond_28

    const/4 v5, 0x2

    if-eq v1, v5, :cond_27

    move-object v6, v8

    goto :goto_11

    :cond_27
    move-object v6, v7

    :cond_28
    :goto_11
    const-string v1, ". 10 bit dynamic range is not currently supported in "

    .line 116
    invoke-static {v11, v4, v1, v6, v10}, Lfm0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 117
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 118
    :cond_29
    :goto_12
    new-instance v10, Lqg;

    move/from16 v4, p4

    invoke-direct {v10, v1, v5, v4, v3}, Lqg;-><init>(IIZZ)V

    .line 119
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 120
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_13
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Laf;

    .line 121
    iget-object v5, v5, Laf;->a:Lrg;

    .line 122
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    .line 123
    :cond_2a
    new-instance v4, Lhx;

    const/4 v5, 0x0

    .line 124
    invoke-direct {v4, v5}, Lhx;-><init>(Z)V

    .line 125
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_14
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2c

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lzy2;

    .line 126
    invoke-virtual {v2, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    if-eqz v7, :cond_2b

    .line 127
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_2b

    const/4 v8, 0x1

    goto :goto_15

    :cond_2b
    const/4 v8, 0x0

    :goto_15
    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "No available output size is found for "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v12, "."

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v8}, Lde3;->e(Ljava/lang/String;Z)V

    .line 128
    invoke-static {v7, v4}, Ljava/util/Collections;->min(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/util/Size;

    .line 129
    invoke-interface {v6}, Lhw0;->l()I

    move-result v6

    .line 130
    iget v8, v10, Lqg;->a:I

    .line 131
    invoke-virtual {v0, v6}, Lcj2;->i(I)Lwg;

    move-result-object v11

    .line 132
    invoke-static {v8, v6, v7, v11}, Lrg;->b(IILandroid/util/Size;Lwg;)Lrg;

    move-result-object v6

    .line 133
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    .line 134
    :cond_2c
    invoke-virtual {v0, v10, v3}, Lcj2;->a(Lqg;Ljava/util/List;)Z

    move-result v11

    .line 135
    const-string v13, ".  May be attempting to bind too many use cases. Existing surfaces: "

    const-string v15, " New configs: "

    move v12, v11

    const-string v11, "No supported surface combination is found for camera device - Id : "

    if-eqz v12, :cond_a7

    .line 136
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object/from16 v4, v20

    :catch_0
    :cond_2d
    :goto_16
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Laf;

    .line 137
    iget-object v5, v5, Laf;->g:Landroid/util/Range;

    if-nez v4, :cond_2e

    move-object v4, v5

    goto :goto_16

    :cond_2e
    if-eqz v5, :cond_2d

    .line 138
    :try_start_0
    invoke-virtual {v4, v5}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_16

    .line 139
    :cond_2f
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v14, v4

    :goto_17
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_32

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    .line 140
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    move-object/from16 v5, v25

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lzy2;

    .line 141
    sget-object v6, Lzy2;->L:Llf;

    move-object/from16 v7, v20

    invoke-interface {v4, v6, v7}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/Range;

    if-nez v14, :cond_30

    :goto_18
    move-object v14, v4

    goto :goto_19

    :cond_30
    if-eqz v4, :cond_31

    .line 142
    :try_start_1
    invoke-virtual {v14, v4}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_18

    :catch_1
    :cond_31
    :goto_19
    move-object/from16 v25, v5

    const/16 v20, 0x0

    goto :goto_17

    :cond_32
    move-object/from16 v5, v25

    .line 143
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 144
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    move-object/from16 p4, v11

    if-eqz v6, :cond_37

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lzy2;

    const-wide v23, 0x41cdcd6500000000L    # 1.0E9

    .line 145
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 146
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 147
    invoke-virtual {v2, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ljava/util/List;

    invoke-interface/range {v18 .. v18}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_1b
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_36

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v11, v21

    check-cast v11, Landroid/util/Size;

    .line 148
    invoke-interface {v6}, Lhw0;->l()I

    move-result v1

    .line 149
    iget v2, v10, Lqg;->a:I

    move-object/from16 v21, v4

    .line 150
    invoke-virtual {v0, v1}, Lcj2;->i(I)Lwg;

    move-result-object v4

    .line 151
    invoke-static {v2, v1, v11, v4}, Lrg;->b(IILandroid/util/Size;Lwg;)Lrg;

    move-result-object v2

    .line 152
    iget-object v2, v2, Lrg;->b:Lej2;

    if-eqz v14, :cond_33

    .line 153
    iget-object v4, v0, Lcj2;->k:Lgp;

    move/from16 v26, v12

    .line 154
    :try_start_2
    sget-object v12, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 155
    invoke-virtual {v4, v12}, Lgp;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/hardware/camera2/params/StreamConfigurationMap;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-object/from16 v27, v13

    .line 156
    :try_start_3
    invoke-virtual {v4, v1, v11}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputMinFrameDuration(ILandroid/util/Size;)J

    move-result-wide v12
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    long-to-double v12, v12

    div-double v12, v23, v12

    double-to-int v1, v12

    goto :goto_1c

    :catch_2
    move-object/from16 v27, v13

    :catch_3
    const/4 v1, 0x0

    goto :goto_1c

    :cond_33
    move/from16 v26, v12

    move-object/from16 v27, v13

    const v1, 0x7fffffff

    .line 157
    :goto_1c
    invoke-virtual {v8, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Set;

    if-nez v4, :cond_34

    .line 158
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 159
    invoke-virtual {v8, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    :cond_34
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_35

    .line 161
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_35
    move/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v4, v21

    move/from16 v12, v26

    move-object/from16 v13, v27

    goto :goto_1b

    :cond_36
    move-object/from16 v21, v4

    move/from16 v26, v12

    move-object/from16 v27, v13

    .line 163
    invoke-virtual {v3, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v11, p4

    goto/16 :goto_1a

    :cond_37
    move/from16 v26, v12

    move-object/from16 v27, v13

    const-wide v23, 0x41cdcd6500000000L    # 1.0E9

    .line 164
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 165
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_41

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    .line 166
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lzy2;

    .line 167
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    .line 168
    invoke-interface {v4}, Lhw0;->l()I

    move-result v4

    .line 169
    iget-object v7, v0, Lcj2;->v:Lp62;

    iget-object v8, v0, Lcj2;->k:Lgp;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    const-class v7, Landroidx/camera/camera2/internal/compat/quirk/Nexus4AndroidLTargetAspectRatioQuirk;

    .line 171
    sget-object v11, Lf80;->a:Ler0;

    invoke-virtual {v11, v7}, Ler0;->h(Ljava/lang/Class;)Lh02;

    move-result-object v7

    .line 172
    check-cast v7, Landroidx/camera/camera2/internal/compat/quirk/Nexus4AndroidLTargetAspectRatioQuirk;

    if-eqz v7, :cond_38

    goto :goto_1e

    .line 173
    :cond_38
    invoke-static {v8}, Lde3;->m(Lgp;)Ler0;

    move-result-object v7

    const-class v8, Landroidx/camera/camera2/internal/compat/quirk/AspectRatioLegacyApi21Quirk;

    .line 174
    invoke-virtual {v7, v8}, Ler0;->h(Ljava/lang/Class;)Lh02;

    move-result-object v7

    check-cast v7, Landroidx/camera/camera2/internal/compat/quirk/AspectRatioLegacyApi21Quirk;

    if-eqz v7, :cond_39

    :goto_1e
    const/16 v7, 0x100

    .line 175
    invoke-virtual {v0, v7}, Lcj2;->i(I)Lwg;

    move-result-object v8

    .line 176
    iget-object v8, v8, Lwg;->f:Ljava/util/HashMap;

    .line 177
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/util/Size;

    .line 178
    new-instance v8, Landroid/util/Rational;

    invoke-virtual {v7}, Landroid/util/Size;->getWidth()I

    move-result v11

    invoke-virtual {v7}, Landroid/util/Size;->getHeight()I

    move-result v7

    invoke-direct {v8, v11, v7}, Landroid/util/Rational;-><init>(II)V

    move-object v7, v8

    goto :goto_1f

    :cond_39
    const/4 v7, 0x0

    :goto_1f
    if-nez v7, :cond_3a

    goto :goto_21

    .line 179
    :cond_3a
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 180
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 181
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_20
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_3c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/util/Size;

    .line 182
    invoke-static {v7, v12}, Lsd;->a(Landroid/util/Rational;Landroid/util/Size;)Z

    move-result v13

    if-eqz v13, :cond_3b

    .line 183
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_20

    .line 184
    :cond_3b
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_20

    :cond_3c
    const/4 v12, 0x0

    .line 185
    invoke-virtual {v11, v12, v8}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    move-object v6, v11

    .line 186
    :goto_21
    iget-object v7, v0, Lcj2;->w:Lmd1;

    .line 187
    invoke-static {v4}, Lrg;->a(I)I

    move-result v4

    .line 188
    iget-object v7, v7, Lmd1;->a:Landroidx/camera/camera2/internal/compat/quirk/ExtraCroppingQuirk;

    if-nez v7, :cond_3d

    goto :goto_23

    .line 189
    :cond_3d
    invoke-static {v4}, Landroidx/camera/camera2/internal/compat/quirk/ExtraCroppingQuirk;->b(I)Landroid/util/Size;

    move-result-object v4

    if-nez v4, :cond_3e

    goto :goto_23

    .line 190
    :cond_3e
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 191
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_3f
    :goto_22
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_40

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/util/Size;

    .line 193
    invoke-virtual {v8, v4}, Landroid/util/Size;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_3f

    .line 194
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_22

    :cond_40
    move-object v6, v7

    .line 195
    :goto_23
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1d

    .line 196
    :cond_41
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x1

    :goto_24
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_42

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    .line 197
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    mul-int/2addr v3, v4

    goto :goto_24

    :cond_42
    if-eqz v3, :cond_a6

    .line 198
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    :goto_25
    if-ge v2, v3, :cond_43

    .line 199
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 200
    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_25

    :cond_43
    const/4 v12, 0x0

    .line 201
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    div-int v2, v3, v2

    move v6, v3

    const/4 v4, 0x0

    .line 202
    :goto_26
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v4, v7, :cond_46

    .line 203
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    const/4 v8, 0x0

    :goto_27
    if-ge v8, v3, :cond_44

    .line 204
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/List;

    .line 205
    rem-int v13, v8, v6

    div-int/2addr v13, v2

    .line 206
    invoke-interface {v7, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/util/Size;

    .line 207
    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_27

    .line 208
    :cond_44
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/16 v22, 0x1

    add-int/lit8 v7, v7, -0x1

    if-ge v4, v7, :cond_45

    add-int/lit8 v6, v4, 0x1

    .line 209
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    div-int v6, v2, v6

    move/from16 v32, v6

    move v6, v2

    move/from16 v2, v32

    :cond_45
    add-int/lit8 v4, v4, 0x1

    goto :goto_26

    .line 210
    :cond_46
    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 211
    new-instance v13, Ljava/util/HashMap;

    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 212
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 213
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 214
    sget-object v1, Lnh2;->a:Llf;

    .line 215
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_47
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_48

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Laf;

    .line 216
    iget-object v3, v2, Laf;->e:Ljava/util/List;

    const/4 v4, 0x0

    .line 217
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbz2;

    .line 218
    iget-object v2, v2, Laf;->f:Lty;

    .line 219
    invoke-static {v2, v3}, Lnh2;->c(Lty;Lbz2;)Z

    move-result v2

    if-eqz v2, :cond_47

    :goto_28
    const/4 v1, 0x1

    goto :goto_29

    .line 220
    :cond_48
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_49
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzy2;

    .line 221
    invoke-interface {v2}, Lzy2;->t()Lbz2;

    move-result-object v3

    invoke-static {v2, v3}, Lnh2;->c(Lty;Lbz2;)Z

    move-result v2

    if-eqz v2, :cond_49

    goto :goto_28

    :cond_4a
    const/4 v1, 0x0

    .line 222
    :goto_29
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const v6, 0x7fffffff

    :goto_2a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Laf;

    .line 223
    iget v4, v3, Laf;->b:I

    .line 224
    iget-object v3, v3, Laf;->c:Landroid/util/Size;

    move/from16 p3, v1

    .line 225
    iget-object v1, v0, Lcj2;->k:Lgp;

    move-object/from16 v18, v2

    .line 226
    :try_start_4
    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 227
    invoke-virtual {v1, v2}, Lgp;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 228
    invoke-virtual {v1, v4, v3}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputMinFrameDuration(ILandroid/util/Size;)J

    move-result-wide v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    long-to-double v1, v1

    div-double v1, v23, v1

    double-to-int v1, v1

    goto :goto_2b

    :catch_4
    const/4 v1, 0x0

    .line 229
    :goto_2b
    invoke-static {v6, v1}, Ljava/lang/Math;->min(II)I

    move-result v6

    move/from16 v1, p3

    move-object/from16 v2, v18

    goto :goto_2a

    :cond_4b
    move/from16 p3, v1

    .line 230
    iget-boolean v1, v0, Lcj2;->q:Z

    const-string v18, "SurfaceConfig does not map to any use case"

    if-eqz v1, :cond_5c

    if-nez p3, :cond_5c

    .line 231
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v21

    const/4 v1, 0x0

    :goto_2c
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_59

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/util/List;

    move/from16 v1, p1

    move-object/from16 v2, p2

    move-object v4, v5

    move-object/from16 v5, v16

    .line 232
    invoke-virtual/range {v0 .. v8}, Lcj2;->h(ILjava/util/ArrayList;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;ILjava/util/HashMap;Ljava/util/HashMap;)Landroid/util/Pair;

    move-result-object v3

    move-object/from16 v16, v4

    move-object v2, v7

    move-object v4, v8

    iget-object v1, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    .line 233
    invoke-virtual {v0, v10, v1}, Lcj2;->d(Lqg;Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    if-eqz v7, :cond_51

    .line 234
    sget-object v1, Lbz2;->e:Lbz2;

    const/4 v3, 0x0

    :goto_2d
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    if-ge v3, v8, :cond_51

    .line 235
    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lrg;

    move-object/from16 p3, v5

    move/from16 v23, v6

    .line 236
    iget-wide v5, v8, Lrg;->c:J

    .line 237
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4d

    .line 238
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Laf;

    .line 239
    iget-object v8, v8, Laf;->e:Ljava/util/List;

    move-object/from16 v24, v2

    .line 240
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v2

    move-object/from16 v28, v7

    const/4 v7, 0x1

    if-ne v2, v7, :cond_4c

    const/4 v2, 0x0

    .line 241
    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lbz2;

    move-object/from16 v2, v17

    goto :goto_2e

    :cond_4c
    move-object v2, v1

    .line 242
    :goto_2e
    invoke-static {v2, v5, v6, v8}, Lnh2;->b(Lbz2;JLjava/util/List;)Z

    move-result v2

    if-nez v2, :cond_4f

    goto :goto_30

    :cond_4d
    move-object/from16 v24, v2

    move-object/from16 v28, v7

    const/4 v7, 0x1

    .line 243
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_50

    .line 244
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzy2;

    .line 245
    invoke-interface {v2}, Lzy2;->t()Lbz2;

    move-result-object v8

    .line 246
    invoke-interface {v2}, Lzy2;->t()Lbz2;

    move-result-object v7

    if-ne v7, v1, :cond_4e

    .line 247
    check-cast v2, Lmh2;

    .line 248
    sget-object v7, Lmh2;->b:Llf;

    invoke-interface {v2, v7}, Lx02;->e(Llf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    goto :goto_2f

    .line 249
    :cond_4e
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 250
    :goto_2f
    invoke-static {v8, v5, v6, v2}, Lnh2;->b(Lbz2;JLjava/util/List;)Z

    move-result v2

    if-nez v2, :cond_4f

    :goto_30
    const/4 v7, 0x0

    const/16 v20, 0x0

    goto :goto_31

    :cond_4f
    add-int/lit8 v3, v3, 0x1

    move-object/from16 v5, p3

    move/from16 v6, v23

    move-object/from16 v2, v24

    move-object/from16 v7, v28

    goto/16 :goto_2d

    .line 251
    :cond_50
    invoke-static/range {v18 .. v18}, Ln4;->g(Ljava/lang/Object;)V

    const/16 v20, 0x0

    return-object v20

    :cond_51
    move-object/from16 v24, v2

    move-object/from16 p3, v5

    move/from16 v23, v6

    move-object/from16 v28, v7

    const/16 v20, 0x0

    move-object/from16 v7, v28

    :goto_31
    if-eqz v7, :cond_58

    .line 252
    iget-object v1, v0, Lcj2;->k:Lgp;

    .line 253
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x21

    if-ge v2, v3, :cond_52

    goto :goto_33

    .line 254
    :cond_52
    invoke-static {}, Lx72;->d()Landroid/hardware/camera2/CameraCharacteristics$Key;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgp;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [J

    if-eqz v1, :cond_57

    .line 255
    array-length v2, v1

    if-nez v2, :cond_53

    goto :goto_33

    .line 256
    :cond_53
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 257
    array-length v3, v1

    const/4 v5, 0x0

    :goto_32
    if-ge v5, v3, :cond_54

    aget-wide v28, v1, v5

    invoke-static/range {v28 .. v29}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    .line 258
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_32

    .line 259
    :cond_54
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_55
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_56

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lrg;

    .line 260
    iget-wide v5, v3, Lrg;->c:J

    .line 261
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_55

    goto :goto_33

    :cond_56
    move-object v1, v7

    goto :goto_35

    :cond_57
    :goto_33
    move-object/from16 v1, v20

    goto :goto_34

    :cond_58
    move-object v1, v7

    .line 262
    :goto_34
    invoke-virtual/range {v24 .. v24}, Ljava/util/HashMap;->clear()V

    .line 263
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    move-object v8, v4

    move-object/from16 v5, v16

    move/from16 v6, v23

    move-object/from16 v7, v24

    move-object/from16 v16, p3

    goto/16 :goto_2c

    :cond_59
    move/from16 v23, v6

    move-object/from16 v24, v7

    move-object v4, v8

    move-object/from16 p3, v16

    const/16 v20, 0x0

    move-object/from16 v16, v5

    :goto_35
    if-nez v1, :cond_5a

    if-eqz v26, :cond_5b

    :cond_5a
    move-object v2, v11

    move-object/from16 v11, p4

    goto :goto_36

    .line 264
    :cond_5b
    iget-object v12, v0, Lcj2;->i:Ljava/lang/String;

    move-object/from16 v14, p2

    move-object/from16 v11, p4

    move-object/from16 v13, v27

    invoke-static/range {v11 .. v16}, Ls80;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v20

    :cond_5c
    move/from16 v23, v6

    move-object/from16 v24, v7

    move-object v4, v8

    move-object v2, v11

    move-object/from16 p3, v16

    const/16 v20, 0x0

    move-object/from16 v11, p4

    move-object/from16 v16, v5

    move-object/from16 v1, v20

    .line 265
    :goto_36
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v21

    move-object/from16 v28, v20

    move-object/from16 v29, v28

    const v2, 0x7fffffff

    const v3, 0x7fffffff

    const/16 v26, 0x0

    const/16 v27, 0x0

    :goto_37
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_67

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v31, v4

    move-object/from16 p4, v15

    move-object/from16 v4, v16

    move/from16 v6, v23

    move-object/from16 v30, v24

    const/16 v17, 0x0

    const/16 v22, 0x1

    move v15, v2

    move-object/from16 v16, v11

    move-object/from16 v2, p2

    move v11, v3

    move-object v3, v5

    move-object/from16 v5, p3

    move-object/from16 p3, v12

    move-object v12, v1

    move/from16 v1, p1

    .line 266
    invoke-virtual/range {v0 .. v8}, Lcj2;->h(ILjava/util/ArrayList;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;ILjava/util/HashMap;Ljava/util/HashMap;)Landroid/util/Pair;

    move-result-object v7

    .line 267
    iget-object v1, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    .line 268
    iget-object v2, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-eqz v14, :cond_5d

    if-le v6, v2, :cond_5d

    .line 269
    invoke-virtual {v14}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ge v2, v7, :cond_5d

    move/from16 v7, v17

    goto :goto_38

    :cond_5d
    move/from16 v7, v22

    :goto_38
    if-nez v26, :cond_61

    .line 270
    invoke-virtual {v0, v10, v1}, Lcj2;->a(Lqg;Ljava/util/List;)Z

    move-result v8

    if-eqz v8, :cond_61

    const v8, 0x7fffffff

    if-ne v15, v8, :cond_5e

    goto :goto_39

    :cond_5e
    if-ge v15, v2, :cond_5f

    :goto_39
    move v15, v2

    move-object/from16 v28, v3

    :cond_5f
    if-eqz v7, :cond_61

    if-eqz v27, :cond_60

    move-object v1, v3

    move v3, v11

    :goto_3a
    move-object/from16 v6, v29

    goto/16 :goto_3e

    :cond_60
    move v15, v2

    move-object/from16 v28, v3

    move/from16 v26, v22

    :cond_61
    if-eqz v12, :cond_66

    if-nez v27, :cond_66

    .line 271
    invoke-virtual {v0, v10, v1}, Lcj2;->d(Lqg;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_66

    const v8, 0x7fffffff

    if-ne v11, v8, :cond_62

    goto :goto_3b

    :cond_62
    if-ge v11, v2, :cond_63

    :goto_3b
    move v11, v2

    move-object/from16 v29, v3

    :cond_63
    if-eqz v7, :cond_65

    if-eqz v26, :cond_64

    move-object v6, v3

    move-object/from16 v1, v28

    move v3, v2

    move v2, v15

    goto :goto_3e

    :cond_64
    move-object/from16 v29, v3

    move/from16 v27, v22

    move v3, v2

    goto :goto_3d

    :cond_65
    :goto_3c
    move v3, v11

    goto :goto_3d

    :cond_66
    const v8, 0x7fffffff

    goto :goto_3c

    :goto_3d
    move/from16 v23, v6

    move-object v1, v12

    move v2, v15

    move-object/from16 v11, v16

    move-object/from16 v24, v30

    move-object/from16 v12, p3

    move-object/from16 v15, p4

    move-object/from16 v16, v4

    move-object/from16 p3, v5

    move-object/from16 v4, v31

    goto/16 :goto_37

    :cond_67
    move-object/from16 v5, p3

    move-object/from16 v31, v4

    move-object/from16 p3, v12

    move-object/from16 p4, v15

    move-object/from16 v4, v16

    move-object/from16 v30, v24

    const/16 v17, 0x0

    const/16 v22, 0x1

    move-object v12, v1

    move v15, v2

    move-object/from16 v16, v11

    move v11, v3

    move-object/from16 v1, v28

    goto :goto_3a

    :goto_3e
    if-eqz v1, :cond_a5

    if-eqz v14, :cond_77

    .line 272
    sget-object v7, Lpg;->f:Landroid/util/Range;

    invoke-virtual {v14, v7}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_68

    goto :goto_40

    .line 273
    :cond_68
    iget-object v8, v0, Lcj2;->k:Lgp;

    sget-object v10, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 274
    invoke-virtual {v8, v10}, Lgp;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Landroid/util/Range;

    if-nez v8, :cond_69

    goto :goto_40

    .line 275
    :cond_69
    new-instance v10, Landroid/util/Range;

    .line 276
    invoke-virtual {v14}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static {v11, v2}, Ljava/lang/Math;->min(II)I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    .line 277
    invoke-virtual {v14}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    invoke-static {v14, v2}, Ljava/lang/Math;->min(II)I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-direct {v10, v11, v14}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    .line 278
    array-length v11, v8

    move-object v15, v7

    move/from16 v7, v17

    move v14, v7

    :goto_3f
    if-ge v7, v11, :cond_78

    move/from16 v16, v7

    aget-object v7, v8, v16

    .line 279
    invoke-virtual {v7}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v21

    check-cast v21, Ljava/lang/Integer;

    move-object/from16 p1, v8

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-lt v2, v8, :cond_76

    .line 280
    sget-object v8, Lpg;->f:Landroid/util/Range;

    invoke-virtual {v15, v8}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6a

    move-object v15, v7

    .line 281
    :cond_6a
    invoke-virtual {v7, v10}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6b

    :goto_40
    move-object v15, v7

    goto/16 :goto_47

    .line 282
    :cond_6b
    :try_start_5
    invoke-virtual {v7, v10}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    move-result-object v8

    .line 283
    invoke-static {v8}, Lcj2;->f(Landroid/util/Range;)I

    move-result v8
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_7

    if-nez v14, :cond_6c

    move v14, v8

    goto/16 :goto_43

    :cond_6c
    if-lt v8, v14, :cond_72

    .line 284
    :try_start_6
    invoke-virtual {v15, v10}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    move-result-object v8

    invoke-static {v8}, Lcj2;->f(Landroid/util/Range;)I

    move-result v8
    :try_end_6
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_6} :catch_5

    move/from16 p4, v14

    move-object/from16 v21, v15

    int-to-double v14, v8

    .line 285
    :try_start_7
    invoke-virtual {v7, v10}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    move-result-object v8

    invoke-static {v8}, Lcj2;->f(Landroid/util/Range;)I

    move-result v8

    move-wide/from16 v23, v14

    int-to-double v14, v8

    .line 286
    invoke-static {v7}, Lcj2;->f(Landroid/util/Range;)I

    move-result v8

    move-wide/from16 v25, v14

    int-to-double v14, v8

    div-double v14, v25, v14

    .line 287
    invoke-static/range {v21 .. v21}, Lcj2;->f(Landroid/util/Range;)I

    move-result v8

    move-wide/from16 v27, v14

    int-to-double v14, v8

    div-double v14, v23, v14

    cmpl-double v8, v25, v23

    const-wide/high16 v23, 0x3fe0000000000000L    # 0.5

    if-lez v8, :cond_6d

    cmpl-double v8, v27, v23

    if-gez v8, :cond_70

    cmpl-double v8, v27, v14

    if-ltz v8, :cond_71

    goto :goto_41

    :cond_6d
    if-nez v8, :cond_6f

    cmpl-double v8, v27, v14

    if-lez v8, :cond_6e

    goto :goto_41

    :cond_6e
    if-nez v8, :cond_71

    .line 288
    invoke-virtual {v7}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-virtual/range {v21 .. v21}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14
    :try_end_7
    .catch Ljava/lang/IllegalArgumentException; {:try_start_7 .. :try_end_7} :catch_6

    if-le v8, v14, :cond_71

    goto :goto_41

    :cond_6f
    cmpg-double v8, v14, v23

    if-gez v8, :cond_71

    cmpl-double v8, v27, v14

    if-lez v8, :cond_71

    :cond_70
    :goto_41
    move-object v15, v7

    goto :goto_42

    :cond_71
    move-object/from16 v15, v21

    .line 289
    :goto_42
    :try_start_8
    invoke-virtual {v10, v15}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    move-result-object v8

    invoke-static {v8}, Lcj2;->f(Landroid/util/Range;)I

    move-result v14
    :try_end_8
    .catch Ljava/lang/IllegalArgumentException; {:try_start_8 .. :try_end_8} :catch_8

    move-object v7, v15

    goto :goto_43

    :catch_5
    move/from16 p4, v14

    move-object/from16 v21, v15

    :catch_6
    move-object/from16 v15, v21

    goto :goto_44

    :cond_72
    move/from16 p4, v14

    move-object/from16 v21, v15

    move-object/from16 v7, v21

    :goto_43
    move-object v15, v7

    goto :goto_46

    :catch_7
    move/from16 p4, v14

    move-object/from16 v21, v15

    :catch_8
    :goto_44
    if-nez p4, :cond_75

    .line 290
    invoke-static {v7, v10}, Lcj2;->e(Landroid/util/Range;Landroid/util/Range;)I

    move-result v8

    .line 291
    invoke-static {v15, v10}, Lcj2;->e(Landroid/util/Range;Landroid/util/Range;)I

    move-result v14

    if-ge v8, v14, :cond_73

    goto :goto_45

    .line 292
    :cond_73
    invoke-static {v7, v10}, Lcj2;->e(Landroid/util/Range;Landroid/util/Range;)I

    move-result v8

    .line 293
    invoke-static {v15, v10}, Lcj2;->e(Landroid/util/Range;Landroid/util/Range;)I

    move-result v14

    if-ne v8, v14, :cond_75

    .line 294
    invoke-virtual {v7}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-virtual {v15}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-le v8, v14, :cond_74

    goto :goto_45

    .line 295
    :cond_74
    invoke-static {v7}, Lcj2;->f(Landroid/util/Range;)I

    move-result v8

    invoke-static {v15}, Lcj2;->f(Landroid/util/Range;)I

    move-result v14

    if-ge v8, v14, :cond_75

    :goto_45
    move/from16 v14, p4

    goto :goto_43

    :cond_75
    move/from16 v14, p4

    goto :goto_46

    :cond_76
    move/from16 p4, v14

    :goto_46
    add-int/lit8 v7, v16, 0x1

    move-object/from16 v8, p1

    goto/16 :goto_3f

    :cond_77
    move-object/from16 v15, v20

    .line 296
    :cond_78
    :goto_47
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_48
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const-string v10, "Null resolution"

    const-string v11, "Null expectedFrameRateRange"

    if-eqz v8, :cond_80

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lzy2;

    .line 297
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v14

    .line 298
    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    move-object/from16 v24, v14

    check-cast v24, Landroid/util/Size;

    .line 299
    sget-object v14, Lpg;->f:Landroid/util/Range;

    if-eqz v24, :cond_7f

    .line 300
    sget-object v10, Lpg;->f:Landroid/util/Range;

    if-eqz v10, :cond_7e

    .line 301
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object/from16 v25, v11

    check-cast v25, Lmb0;

    .line 302
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    invoke-static {}, Luk1;->j()Luk1;

    move-result-object v11

    .line 304
    sget-object v14, Lho;->v:Llf;

    invoke-interface {v8, v14}, Lx02;->h(Llf;)Z

    move-result v16

    if-eqz v16, :cond_79

    .line 305
    invoke-interface {v8, v14}, Lx02;->e(Llf;)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v21, v5

    move-object/from16 v5, v16

    check-cast v5, Ljava/lang/Long;

    .line 306
    invoke-virtual {v11, v14, v5}, Luk1;->p(Llf;Ljava/lang/Object;)V

    goto :goto_49

    :cond_79
    move-object/from16 v21, v5

    .line 307
    :goto_49
    sget-object v5, Lzy2;->M:Llf;

    invoke-interface {v8, v5}, Lx02;->h(Llf;)Z

    move-result v14

    if-eqz v14, :cond_7a

    .line 308
    invoke-interface {v8, v5}, Lx02;->e(Llf;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    .line 309
    invoke-virtual {v11, v5, v14}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 310
    :cond_7a
    sget-object v5, Law0;->b:Llf;

    invoke-interface {v8, v5}, Lx02;->h(Llf;)Z

    move-result v14

    if-eqz v14, :cond_7b

    .line 311
    invoke-interface {v8, v5}, Lx02;->e(Llf;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    .line 312
    invoke-virtual {v11, v5, v14}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 313
    :cond_7b
    sget-object v5, Lhw0;->o:Llf;

    invoke-interface {v8, v5}, Lx02;->h(Llf;)Z

    move-result v14

    if-eqz v14, :cond_7c

    .line 314
    invoke-interface {v8, v5}, Lx02;->e(Llf;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    .line 315
    invoke-virtual {v11, v5, v14}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 316
    :cond_7c
    new-instance v5, Lho;

    .line 317
    invoke-direct {v5, v11}, Ld52;-><init>(Ljava/lang/Object;)V

    if-eqz v15, :cond_7d

    move-object/from16 v26, v15

    goto :goto_4a

    :cond_7d
    move-object/from16 v26, v10

    .line 318
    :goto_4a
    new-instance v23, Lpg;

    move/from16 v28, p5

    move-object/from16 v27, v5

    .line 319
    invoke-direct/range {v23 .. v28}, Lpg;-><init>(Landroid/util/Size;Lmb0;Landroid/util/Range;Lty;Z)V

    move-object/from16 v5, v23

    .line 320
    invoke-virtual {v13, v8, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v5, v21

    goto/16 :goto_48

    .line 321
    :cond_7e
    invoke-static {v11}, Ln4;->s(Ljava/lang/String;)V

    return-object v20

    .line 322
    :cond_7f
    invoke-static {v10}, Ln4;->s(Ljava/lang/String;)V

    return-object v20

    :cond_80
    if-eqz v12, :cond_81

    if-ne v2, v3, :cond_81

    .line 323
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3

    if-ne v2, v3, :cond_81

    move/from16 v5, v17

    .line 324
    :goto_4b
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v5, v2, :cond_83

    .line 325
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Size;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/util/Size;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_82

    :cond_81
    move-object/from16 v4, p3

    goto/16 :goto_5c

    :cond_82
    add-int/lit8 v5, v5, 0x1

    goto :goto_4b

    .line 326
    :cond_83
    iget-object v0, v0, Lcj2;->k:Lgp;

    .line 327
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v2, "Null dynamicRange"

    const/16 v3, 0x21

    if-ge v1, v3, :cond_85

    :cond_84
    :goto_4c
    move-object/from16 v4, p3

    goto/16 :goto_58

    .line 328
    :cond_85
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v13}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 329
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_86

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Laf;

    .line 330
    iget-object v4, v4, Laf;->f:Lty;

    .line 331
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_4d

    .line 332
    :cond_86
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_87

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lzy2;

    .line 333
    invoke-virtual {v13, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpg;

    .line 334
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    iget-object v4, v4, Lpg;->d:Lty;

    .line 336
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_4e

    .line 337
    :cond_87
    invoke-static {}, Lx72;->d()Landroid/hardware/camera2/CameraCharacteristics$Key;

    move-result-object v3

    invoke-virtual {v0, v3}, Lgp;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    if-eqz v0, :cond_84

    .line 338
    array-length v3, v0

    if-nez v3, :cond_88

    goto :goto_4c

    .line 339
    :cond_88
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 340
    array-length v4, v0

    move/from16 v5, v17

    :goto_4f
    if-ge v5, v4, :cond_89

    aget-wide v6, v0, v5

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    .line 341
    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_4f

    .line 342
    :cond_89
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 343
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const-wide/16 v6, 0x0

    if-eqz v5, :cond_8c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Laf;

    .line 344
    iget-object v5, v4, Laf;->f:Lty;

    .line 345
    sget-object v8, Lho;->v:Llf;

    invoke-interface {v5, v8}, Lty;->h(Llf;)Z

    move-result v5

    if-nez v5, :cond_8a

    :goto_50
    move/from16 v5, v17

    move/from16 v4, v22

    goto :goto_51

    .line 346
    :cond_8a
    iget-object v4, v4, Laf;->f:Lty;

    .line 347
    invoke-interface {v4, v8}, Lty;->e(Llf;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v4, v4, v6

    if-nez v4, :cond_8b

    goto :goto_50

    :cond_8b
    move/from16 v4, v17

    move/from16 v5, v22

    goto :goto_51

    :cond_8c
    move/from16 v4, v17

    move v5, v4

    .line 348
    :goto_51
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move/from16 v32, v5

    move v5, v4

    move/from16 v4, v32

    :goto_52
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_92

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lzy2;

    .line 349
    sget-object v14, Lho;->v:Llf;

    invoke-interface {v9, v14}, Lx02;->h(Llf;)Z

    move-result v15

    const-string v16, "Either all use cases must have non-default stream use case assigned or none should have it"

    if-nez v15, :cond_8e

    if-nez v4, :cond_8d

    :goto_53
    move/from16 v5, v22

    goto :goto_52

    .line 350
    :cond_8d
    invoke-static/range {v16 .. v16}, Ln4;->j(Ljava/lang/String;)V

    return-object v20

    .line 351
    :cond_8e
    invoke-interface {v9, v14}, Lx02;->e(Llf;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Long;

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    cmp-long v14, v14, v6

    if-nez v14, :cond_90

    if-nez v4, :cond_8f

    goto :goto_53

    .line 352
    :cond_8f
    invoke-static/range {v16 .. v16}, Ln4;->j(Ljava/lang/String;)V

    return-object v20

    :cond_90
    if-nez v5, :cond_91

    .line 353
    invoke-virtual {v0, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move/from16 v4, v22

    goto :goto_52

    .line 354
    :cond_91
    invoke-static/range {v16 .. v16}, Ln4;->j(Ljava/lang/String;)V

    return-object v20

    :cond_92
    if-nez v5, :cond_84

    .line 355
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_93
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_94

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    .line 356
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_93

    goto/16 :goto_4c

    .line 357
    :cond_94
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_54
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Laf;

    .line 358
    iget-object v4, v3, Laf;->f:Lty;

    .line 359
    sget-object v5, Lho;->v:Llf;

    .line 360
    invoke-interface {v4, v5}, Lty;->e(Llf;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    .line 361
    invoke-static {v4, v5, v6}, Lnh2;->a(Lty;J)Lho;

    move-result-object v18

    if-eqz v18, :cond_99

    .line 362
    iget-object v15, v3, Laf;->c:Landroid/util/Size;

    .line 363
    sget-object v4, Lpg;->f:Landroid/util/Range;

    if-eqz v15, :cond_98

    .line 364
    sget-object v4, Lpg;->f:Landroid/util/Range;

    if-eqz v4, :cond_97

    .line 365
    iget-object v5, v3, Laf;->d:Lmb0;

    if-eqz v5, :cond_96

    .line 366
    iget-object v6, v3, Laf;->g:Landroid/util/Range;

    if-eqz v6, :cond_95

    move-object/from16 v17, v6

    goto :goto_55

    :cond_95
    move-object/from16 v17, v4

    .line 367
    :goto_55
    new-instance v14, Lpg;

    const/16 v19, 0x0

    move-object/from16 v16, v5

    .line 368
    invoke-direct/range {v14 .. v19}, Lpg;-><init>(Landroid/util/Size;Lmb0;Landroid/util/Range;Lty;Z)V

    move-object/from16 v4, p3

    .line 369
    invoke-virtual {v4, v3, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_56

    .line 370
    :cond_96
    invoke-static {v2}, Ln4;->s(Ljava/lang/String;)V

    return-object v20

    .line 371
    :cond_97
    invoke-static {v11}, Ln4;->s(Ljava/lang/String;)V

    return-object v20

    .line 372
    :cond_98
    invoke-static {v10}, Ln4;->s(Ljava/lang/String;)V

    return-object v20

    :cond_99
    move-object/from16 v4, p3

    :goto_56
    move-object/from16 p3, v4

    goto :goto_54

    :cond_9a
    move-object/from16 v4, p3

    .line 373
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9b
    :goto_57
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzy2;

    .line 374
    invoke-virtual {v13, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpg;

    .line 375
    iget-object v3, v2, Lpg;->d:Lty;

    .line 376
    sget-object v5, Lho;->v:Llf;

    .line 377
    invoke-interface {v3, v5}, Lty;->e(Llf;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    .line 378
    invoke-static {v3, v5, v6}, Lnh2;->a(Lty;J)Lho;

    move-result-object v3

    if-eqz v3, :cond_9b

    .line 379
    invoke-virtual {v2}, Lpg;->a()Lb5;

    move-result-object v2

    .line 380
    iput-object v3, v2, Lb5;->e:Ljava/lang/Object;

    .line 381
    invoke-virtual {v2}, Lb5;->k()Lpg;

    move-result-object v2

    .line 382
    invoke-virtual {v13, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_57

    :goto_58
    move/from16 v9, v17

    .line 383
    :goto_59
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_a4

    .line 384
    invoke-interface {v12, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrg;

    .line 385
    iget-wide v0, v0, Lrg;->c:J

    .line 386
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v7, v30

    invoke-virtual {v7, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a1

    .line 387
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v7, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Laf;

    .line 388
    iget-object v5, v3, Laf;->f:Lty;

    .line 389
    invoke-static {v5, v0, v1}, Lnh2;->a(Lty;J)Lho;

    move-result-object v0

    if-eqz v0, :cond_a0

    .line 390
    iget-object v1, v3, Laf;->c:Landroid/util/Size;

    .line 391
    sget-object v5, Lpg;->f:Landroid/util/Range;

    if-eqz v1, :cond_9f

    .line 392
    sget-object v5, Lpg;->f:Landroid/util/Range;

    if-eqz v5, :cond_9e

    .line 393
    iget-object v6, v3, Laf;->d:Lmb0;

    if-eqz v6, :cond_9d

    .line 394
    iget-object v8, v3, Laf;->g:Landroid/util/Range;

    if-eqz v8, :cond_9c

    move-object v5, v8

    .line 395
    :cond_9c
    new-instance v8, Lpg;

    const/4 v14, 0x0

    move-object/from16 p4, v0

    move-object/from16 p1, v1

    move-object/from16 p3, v5

    move-object/from16 p2, v6

    move-object/from16 p0, v8

    move/from16 p5, v14

    .line 396
    invoke-direct/range {p0 .. p5}, Lpg;-><init>(Landroid/util/Size;Lmb0;Landroid/util/Range;Lty;Z)V

    move-object/from16 v0, p0

    .line 397
    invoke-virtual {v4, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5a

    .line 398
    :cond_9d
    invoke-static {v2}, Ln4;->s(Ljava/lang/String;)V

    return-object v20

    .line 399
    :cond_9e
    invoke-static {v11}, Ln4;->s(Ljava/lang/String;)V

    return-object v20

    .line 400
    :cond_9f
    invoke-static {v10}, Ln4;->s(Ljava/lang/String;)V

    return-object v20

    :cond_a0
    :goto_5a
    move-object/from16 v8, v31

    goto :goto_5b

    .line 401
    :cond_a1
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v8, v31

    invoke-virtual {v8, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a3

    .line 402
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzy2;

    .line 403
    invoke-virtual {v13, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpg;

    .line 404
    iget-object v6, v5, Lpg;->d:Lty;

    .line 405
    invoke-static {v6, v0, v1}, Lnh2;->a(Lty;J)Lho;

    move-result-object v0

    if-eqz v0, :cond_a2

    .line 406
    invoke-virtual {v5}, Lpg;->a()Lb5;

    move-result-object v1

    .line 407
    iput-object v0, v1, Lb5;->e:Ljava/lang/Object;

    .line 408
    invoke-virtual {v1}, Lb5;->k()Lpg;

    move-result-object v0

    .line 409
    invoke-virtual {v13, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a2
    :goto_5b
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v30, v7

    move-object/from16 v31, v8

    goto/16 :goto_59

    .line 410
    :cond_a3
    invoke-static/range {v18 .. v18}, Ln4;->g(Ljava/lang/Object;)V

    return-object v20

    .line 411
    :cond_a4
    :goto_5c
    new-instance v0, Landroid/util/Pair;

    invoke-direct {v0, v13, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    .line 412
    :cond_a5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    iget-object v2, v0, Lcj2;->i:Ljava/lang/String;

    iget v0, v0, Lcj2;->m:I

    new-instance v3, Ljava/lang/StringBuilder;

    move-object/from16 v11, v16

    invoke-direct {v3, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " and Hardware level: "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ". May be the specified resolution is too large and not supported. Existing surfaces: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v14, p2

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object/from16 v15, p4

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a6
    const/16 v20, 0x0

    .line 413
    const-string v0, "Failed to find supported resolutions."

    invoke-static {v0}, Ln4;->j(Ljava/lang/String;)V

    return-object v20

    :cond_a7
    move-object/from16 v14, p2

    move-object/from16 v4, v25

    .line 414
    iget-object v12, v0, Lcj2;->i:Ljava/lang/String;

    move-object/from16 v16, v4

    invoke-static/range {v11 .. v16}, Ls80;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v20
.end method

.method public final h(ILjava/util/ArrayList;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;ILjava/util/HashMap;Ljava/util/HashMap;)Landroid/util/Pair;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Laf;

    .line 21
    .line 22
    iget-object v2, v1, Laf;->a:Lrg;

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    if-eqz p7, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    add-int/lit8 v2, v2, -0x1

    .line 34
    .line 35
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p7, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 p2, 0x0

    .line 44
    move p7, p2

    .line 45
    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-ge p7, v1, :cond_3

    .line 50
    .line 51
    invoke-interface {p3, p7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Landroid/util/Size;

    .line 56
    .line 57
    invoke-virtual {p5, p7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Lzy2;

    .line 72
    .line 73
    invoke-interface {v2}, Lhw0;->l()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    invoke-virtual {p0, v3}, Lcj2;->i(I)Lwg;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-static {p1, v3, v1, v4}, Lrg;->b(IILandroid/util/Size;Lwg;)Lrg;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    if-eqz p8, :cond_2

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    add-int/lit8 v3, v3, -0x1

    .line 95
    .line 96
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {p8, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    :cond_2
    invoke-interface {v2}, Lhw0;->l()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    iget-object v3, p0, Lcj2;->k:Lgp;

    .line 108
    .line 109
    :try_start_0
    sget-object v4, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 110
    .line 111
    invoke-virtual {v3, v4}, Lgp;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    check-cast v3, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 116
    .line 117
    invoke-virtual {v3, v2, v1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputMinFrameDuration(ILandroid/util/Size;)J

    .line 118
    .line 119
    .line 120
    move-result-wide v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    long-to-double v1, v1

    .line 122
    const-wide v3, 0x41cdcd6500000000L    # 1.0E9

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    div-double/2addr v3, v1

    .line 128
    double-to-int v1, v3

    .line 129
    goto :goto_2

    .line 130
    :catch_0
    move v1, p2

    .line 131
    :goto_2
    invoke-static {p6, v1}, Ljava/lang/Math;->min(II)I

    .line 132
    .line 133
    .line 134
    move-result p6

    .line 135
    add-int/lit8 p7, p7, 0x1

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_3
    new-instance p0, Landroid/util/Pair;

    .line 139
    .line 140
    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-direct {p0, v0, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    return-object p0
.end method

.method public final i(I)Lwg;
    .locals 6

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcj2;->t:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_4

    .line 12
    .line 13
    iget-object v0, p0, Lcj2;->s:Lwg;

    .line 14
    .line 15
    iget-object v0, v0, Lwg;->b:Ljava/util/HashMap;

    .line 16
    .line 17
    sget-object v2, Lue2;->d:Landroid/util/Size;

    .line 18
    .line 19
    invoke-virtual {p0, v0, v2, p1}, Lcj2;->j(Ljava/util/HashMap;Landroid/util/Size;I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcj2;->s:Lwg;

    .line 23
    .line 24
    iget-object v0, v0, Lwg;->d:Ljava/util/HashMap;

    .line 25
    .line 26
    sget-object v2, Lue2;->f:Landroid/util/Size;

    .line 27
    .line 28
    invoke-virtual {p0, v0, v2, p1}, Lcj2;->j(Ljava/util/HashMap;Landroid/util/Size;I)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcj2;->s:Lwg;

    .line 32
    .line 33
    iget-object v0, v0, Lwg;->f:Ljava/util/HashMap;

    .line 34
    .line 35
    iget-object v2, p0, Lcj2;->k:Lgp;

    .line 36
    .line 37
    invoke-virtual {v2}, Lgp;->b()Lac1;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    iget-object v3, v3, Lac1;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Lts0;

    .line 44
    .line 45
    iget-object v3, v3, Lts0;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v3, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    invoke-static {v3, p1, v4}, Lcj2;->c(Landroid/hardware/camera2/params/StreamConfigurationMap;IZ)Landroid/util/Size;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v0, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_0
    iget-object v0, p0, Lcj2;->s:Lwg;

    .line 64
    .line 65
    iget-object v0, v0, Lwg;->g:Ljava/util/HashMap;

    .line 66
    .line 67
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 68
    .line 69
    const/16 v5, 0x1f

    .line 70
    .line 71
    if-lt v3, v5, :cond_3

    .line 72
    .line 73
    iget-boolean v3, p0, Lcj2;->r:Z

    .line 74
    .line 75
    if-nez v3, :cond_1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    invoke-static {}, Lh00;->d()Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v2, v3}, Lgp;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 87
    .line 88
    if-nez v2, :cond_2

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-static {v2, p1, v4}, Lcj2;->c(Landroid/hardware/camera2/params/StreamConfigurationMap;IZ)Landroid/util/Size;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    :cond_3
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    :cond_4
    iget-object p0, p0, Lcj2;->s:Lwg;

    .line 110
    .line 111
    return-object p0
.end method

.method public final j(Ljava/util/HashMap;Landroid/util/Size;I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcj2;->p:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p0, p0, Lcj2;->k:Lgp;

    .line 7
    .line 8
    invoke-virtual {p0}, Lgp;->b()Lac1;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    iget-object p0, p0, Lac1;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lts0;

    .line 15
    .line 16
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {p0, p3, v0}, Lcj2;->c(Landroid/hardware/camera2/params/StreamConfigurationMap;IZ)Landroid/util/Size;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    filled-new-array {p2, p0}, [Landroid/util/Size;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    new-instance p2, Lhx;

    .line 41
    .line 42
    invoke-direct {p2, v0}, Lhx;-><init>(Z)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0, p2}, Ljava/util/Collections;->min(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    move-object p2, p0

    .line 50
    check-cast p2, Landroid/util/Size;

    .line 51
    .line 52
    :goto_0
    invoke-virtual {p1, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    return-void
.end method
