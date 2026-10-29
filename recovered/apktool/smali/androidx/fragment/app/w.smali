.class public abstract Landroidx/fragment/app/w;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final A:Lec0;

.field public B:Lh3;

.field public C:Lh3;

.field public D:Lh3;

.field public E:Ljava/util/ArrayDeque;

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Ljava/util/ArrayList;

.field public L:Ljava/util/ArrayList;

.field public M:Ljava/util/ArrayList;

.field public N:Landroidx/fragment/app/x;

.field public final O:Lye;

.field public final a:Ljava/util/ArrayList;

.field public b:Z

.field public final c:Landroidx/fragment/app/z;

.field public d:Ljava/util/ArrayList;

.field public e:Ljava/util/ArrayList;

.field public final f:Landroidx/fragment/app/s;

.field public g:Lsp1;

.field public h:Landroidx/fragment/app/a;

.field public final i:Landroidx/fragment/app/u;

.field public final j:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final k:Ljava/util/Map;

.field public final l:Ljava/util/Map;

.field public final m:Ljava/util/ArrayList;

.field public final n:Lwc0;

.field public final o:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final p:Lpm0;

.field public final q:Lpm0;

.field public final r:Lpm0;

.field public final s:Lpm0;

.field public final t:Lqm0;

.field public u:I

.field public v:Lom0;

.field public w:Lmm0;

.field public x:Landroidx/fragment/app/Fragment;

.field public y:Landroidx/fragment/app/Fragment;

.field public final z:Lrm0;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/fragment/app/w;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Landroidx/fragment/app/z;

    .line 12
    .line 13
    invoke-direct {v0}, Landroidx/fragment/app/z;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroidx/fragment/app/w;->d:Ljava/util/ArrayList;

    .line 24
    .line 25
    new-instance v0, Landroidx/fragment/app/s;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Landroidx/fragment/app/s;-><init>(Landroidx/fragment/app/w;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Landroidx/fragment/app/w;->f:Landroidx/fragment/app/s;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-object v0, p0, Landroidx/fragment/app/w;->h:Landroidx/fragment/app/a;

    .line 34
    .line 35
    new-instance v0, Landroidx/fragment/app/u;

    .line 36
    .line 37
    invoke-direct {v0, p0}, Landroidx/fragment/app/u;-><init>(Landroidx/fragment/app/w;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Landroidx/fragment/app/w;->i:Landroidx/fragment/app/u;

    .line 41
    .line 42
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Landroidx/fragment/app/w;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 48
    .line 49
    new-instance v0, Ljava/util/HashMap;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Landroidx/fragment/app/w;->k:Ljava/util/Map;

    .line 59
    .line 60
    new-instance v0, Ljava/util/HashMap;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, Landroidx/fragment/app/w;->l:Ljava/util/Map;

    .line 70
    .line 71
    new-instance v0, Ljava/util/HashMap;

    .line 72
    .line 73
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 77
    .line 78
    .line 79
    new-instance v0, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, Landroidx/fragment/app/w;->m:Ljava/util/ArrayList;

    .line 85
    .line 86
    new-instance v0, Lwc0;

    .line 87
    .line 88
    invoke-direct {v0, p0}, Lwc0;-><init>(Landroidx/fragment/app/w;)V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, Landroidx/fragment/app/w;->n:Lwc0;

    .line 92
    .line 93
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 94
    .line 95
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-object v0, p0, Landroidx/fragment/app/w;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 99
    .line 100
    new-instance v0, Lpm0;

    .line 101
    .line 102
    const/4 v1, 0x0

    .line 103
    invoke-direct {v0, p0, v1}, Lpm0;-><init>(Landroidx/fragment/app/w;I)V

    .line 104
    .line 105
    .line 106
    iput-object v0, p0, Landroidx/fragment/app/w;->p:Lpm0;

    .line 107
    .line 108
    new-instance v0, Lpm0;

    .line 109
    .line 110
    const/4 v1, 0x1

    .line 111
    invoke-direct {v0, p0, v1}, Lpm0;-><init>(Landroidx/fragment/app/w;I)V

    .line 112
    .line 113
    .line 114
    iput-object v0, p0, Landroidx/fragment/app/w;->q:Lpm0;

    .line 115
    .line 116
    new-instance v0, Lpm0;

    .line 117
    .line 118
    const/4 v1, 0x2

    .line 119
    invoke-direct {v0, p0, v1}, Lpm0;-><init>(Landroidx/fragment/app/w;I)V

    .line 120
    .line 121
    .line 122
    iput-object v0, p0, Landroidx/fragment/app/w;->r:Lpm0;

    .line 123
    .line 124
    new-instance v0, Lpm0;

    .line 125
    .line 126
    const/4 v1, 0x3

    .line 127
    invoke-direct {v0, p0, v1}, Lpm0;-><init>(Landroidx/fragment/app/w;I)V

    .line 128
    .line 129
    .line 130
    iput-object v0, p0, Landroidx/fragment/app/w;->s:Lpm0;

    .line 131
    .line 132
    new-instance v0, Lqm0;

    .line 133
    .line 134
    invoke-direct {v0, p0}, Lqm0;-><init>(Landroidx/fragment/app/w;)V

    .line 135
    .line 136
    .line 137
    iput-object v0, p0, Landroidx/fragment/app/w;->t:Lqm0;

    .line 138
    .line 139
    const/4 v0, -0x1

    .line 140
    iput v0, p0, Landroidx/fragment/app/w;->u:I

    .line 141
    .line 142
    new-instance v0, Lrm0;

    .line 143
    .line 144
    invoke-direct {v0, p0}, Lrm0;-><init>(Landroidx/fragment/app/w;)V

    .line 145
    .line 146
    .line 147
    iput-object v0, p0, Landroidx/fragment/app/w;->z:Lrm0;

    .line 148
    .line 149
    new-instance v0, Lec0;

    .line 150
    .line 151
    const/16 v1, 0x9

    .line 152
    .line 153
    invoke-direct {v0, v1}, Lec0;-><init>(I)V

    .line 154
    .line 155
    .line 156
    iput-object v0, p0, Landroidx/fragment/app/w;->A:Lec0;

    .line 157
    .line 158
    new-instance v0, Ljava/util/ArrayDeque;

    .line 159
    .line 160
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 161
    .line 162
    .line 163
    iput-object v0, p0, Landroidx/fragment/app/w;->E:Ljava/util/ArrayDeque;

    .line 164
    .line 165
    new-instance v0, Lye;

    .line 166
    .line 167
    invoke-direct {v0, p0, v1}, Lye;-><init>(Ljava/lang/Object;I)V

    .line 168
    .line 169
    .line 170
    iput-object v0, p0, Landroidx/fragment/app/w;->O:Lye;

    .line 171
    .line 172
    return-void
.end method

.method public static F(Landroidx/fragment/app/a;)Ljava/util/HashSet;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    iget-object v2, p0, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-ge v1, v2, :cond_1

    .line 14
    .line 15
    iget-object v2, p0, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ldn0;

    .line 22
    .line 23
    iget-object v2, v2, Ldn0;->b:Landroidx/fragment/app/Fragment;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iget-boolean v3, p0, Landroidx/fragment/app/a;->g:Z

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return-object v0
.end method

.method public static K(I)Z
    .locals 1

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static L(Landroidx/fragment/app/Fragment;)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHasMenu:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mMenuVisible:Z

    .line 6
    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    :cond_0
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/w;

    .line 10
    .line 11
    iget-object p0, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/z;->e()Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const/4 v0, 0x0

    .line 22
    move v1, v0

    .line 23
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_4

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    invoke-static {v2}, Landroidx/fragment/app/w;->L(Landroidx/fragment/app/Fragment;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    :cond_2
    if-eqz v1, :cond_1

    .line 42
    .line 43
    :cond_3
    const/4 p0, 0x1

    .line 44
    return p0

    .line 45
    :cond_4
    return v0
.end method

.method public static N(Landroidx/fragment/app/Fragment;)Z
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/w;

    .line 5
    .line 6
    iget-object v1, v0, Landroidx/fragment/app/w;->y:Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    iget-object p0, v0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 15
    .line 16
    invoke-static {p0}, Landroidx/fragment/app/w;->N(Landroidx/fragment/app/Fragment;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    return p0
.end method


# virtual methods
.method public final A(Landroidx/fragment/app/a;Z)V
    .locals 5

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/fragment/app/w;->I:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    :cond_0
    return-void

    .line 12
    :cond_1
    invoke-virtual {p0, p2}, Landroidx/fragment/app/w;->y(Z)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Landroidx/fragment/app/w;->K:Ljava/util/ArrayList;

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/fragment/app/w;->L:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/a;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Landroidx/fragment/app/w;->b:Z

    .line 24
    .line 25
    :try_start_0
    iget-object p2, p0, Landroidx/fragment/app/w;->K:Ljava/util/ArrayList;

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/fragment/app/w;->L:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p0, p2, v0}, Landroidx/fragment/app/w;->U(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/w;->d()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/w;->d0()V

    .line 36
    .line 37
    .line 38
    iget-boolean p2, p0, Landroidx/fragment/app/w;->J:Z

    .line 39
    .line 40
    iget-object v0, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 41
    .line 42
    if-eqz p2, :cond_4

    .line 43
    .line 44
    const/4 p2, 0x0

    .line 45
    iput-boolean p2, p0, Landroidx/fragment/app/w;->J:Z

    .line 46
    .line 47
    invoke-virtual {v0}, Landroidx/fragment/app/z;->d()Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_4

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Landroidx/fragment/app/y;

    .line 66
    .line 67
    iget-object v3, v2, Landroidx/fragment/app/y;->c:Landroidx/fragment/app/Fragment;

    .line 68
    .line 69
    iget-boolean v4, v3, Landroidx/fragment/app/Fragment;->mDeferStart:Z

    .line 70
    .line 71
    if-eqz v4, :cond_2

    .line 72
    .line 73
    iget-boolean v4, p0, Landroidx/fragment/app/w;->b:Z

    .line 74
    .line 75
    if-eqz v4, :cond_3

    .line 76
    .line 77
    iput-boolean p1, p0, Landroidx/fragment/app/w;->J:Z

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    iput-boolean p2, v3, Landroidx/fragment/app/Fragment;->mDeferStart:Z

    .line 81
    .line 82
    invoke-virtual {v2}, Landroidx/fragment/app/y;->i()V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    iget-object p0, v0, Landroidx/fragment/app/z;->b:Ljava/util/HashMap;

    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    const/4 p1, 0x0

    .line 93
    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-interface {p0, p1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :catchall_0
    move-exception p1

    .line 102
    invoke-virtual {p0}, Landroidx/fragment/app/w;->d()V

    .line 103
    .line 104
    .line 105
    throw p1
.end method

.method public final B(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    check-cast v5, Landroidx/fragment/app/a;

    .line 16
    .line 17
    iget-boolean v5, v5, Landroidx/fragment/app/a;->p:Z

    .line 18
    .line 19
    iget-object v6, v0, Landroidx/fragment/app/w;->M:Ljava/util/ArrayList;

    .line 20
    .line 21
    if-nez v6, :cond_0

    .line 22
    .line 23
    new-instance v6, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v6, v0, Landroidx/fragment/app/w;->M:Ljava/util/ArrayList;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 32
    .line 33
    .line 34
    :goto_0
    iget-object v6, v0, Landroidx/fragment/app/w;->M:Ljava/util/ArrayList;

    .line 35
    .line 36
    iget-object v7, v0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 37
    .line 38
    invoke-virtual {v7}, Landroidx/fragment/app/z;->f()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 43
    .line 44
    .line 45
    iget-object v6, v0, Landroidx/fragment/app/w;->y:Landroidx/fragment/app/Fragment;

    .line 46
    .line 47
    move v9, v3

    .line 48
    const/4 v10, 0x0

    .line 49
    :goto_1
    const/4 v13, 0x1

    .line 50
    if-ge v9, v4, :cond_13

    .line 51
    .line 52
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v14

    .line 56
    check-cast v14, Landroidx/fragment/app/a;

    .line 57
    .line 58
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v15

    .line 62
    check-cast v15, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v15

    .line 68
    iget-object v12, v0, Landroidx/fragment/app/w;->M:Ljava/util/ArrayList;

    .line 69
    .line 70
    if-nez v15, :cond_d

    .line 71
    .line 72
    iget-object v15, v14, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 73
    .line 74
    const/4 v8, 0x0

    .line 75
    :goto_2
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    if-ge v8, v11, :cond_c

    .line 80
    .line 81
    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v11

    .line 85
    check-cast v11, Ldn0;

    .line 86
    .line 87
    move/from16 v18, v5

    .line 88
    .line 89
    iget v5, v11, Ldn0;->a:I

    .line 90
    .line 91
    if-eq v5, v13, :cond_b

    .line 92
    .line 93
    const/4 v13, 0x2

    .line 94
    if-eq v5, v13, :cond_5

    .line 95
    .line 96
    const/4 v13, 0x3

    .line 97
    if-eq v5, v13, :cond_4

    .line 98
    .line 99
    const/4 v13, 0x6

    .line 100
    if-eq v5, v13, :cond_4

    .line 101
    .line 102
    const/4 v13, 0x7

    .line 103
    if-eq v5, v13, :cond_3

    .line 104
    .line 105
    const/16 v13, 0x8

    .line 106
    .line 107
    if-eq v5, v13, :cond_1

    .line 108
    .line 109
    move/from16 v21, v9

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_1
    new-instance v5, Ldn0;

    .line 113
    .line 114
    move/from16 v21, v9

    .line 115
    .line 116
    const/16 v9, 0x9

    .line 117
    .line 118
    const/4 v13, 0x0

    .line 119
    invoke-direct {v5, v9, v6, v13}, Ldn0;-><init>(ILandroidx/fragment/app/Fragment;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v15, v8, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    const/4 v5, 0x1

    .line 126
    iput-boolean v5, v11, Ldn0;->c:Z

    .line 127
    .line 128
    add-int/lit8 v8, v8, 0x1

    .line 129
    .line 130
    iget-object v5, v11, Ldn0;->b:Landroidx/fragment/app/Fragment;

    .line 131
    .line 132
    move-object v6, v5

    .line 133
    :cond_2
    :goto_3
    move/from16 v24, v10

    .line 134
    .line 135
    :goto_4
    const/4 v9, 0x1

    .line 136
    goto/16 :goto_a

    .line 137
    .line 138
    :cond_3
    move/from16 v21, v9

    .line 139
    .line 140
    const/4 v9, 0x1

    .line 141
    :goto_5
    move/from16 v24, v10

    .line 142
    .line 143
    goto/16 :goto_9

    .line 144
    .line 145
    :cond_4
    move/from16 v21, v9

    .line 146
    .line 147
    iget-object v5, v11, Ldn0;->b:Landroidx/fragment/app/Fragment;

    .line 148
    .line 149
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    iget-object v5, v11, Ldn0;->b:Landroidx/fragment/app/Fragment;

    .line 153
    .line 154
    if-ne v5, v6, :cond_2

    .line 155
    .line 156
    new-instance v6, Ldn0;

    .line 157
    .line 158
    const/16 v9, 0x9

    .line 159
    .line 160
    invoke-direct {v6, v5, v9}, Ldn0;-><init>(Landroidx/fragment/app/Fragment;I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v15, v8, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    add-int/lit8 v8, v8, 0x1

    .line 167
    .line 168
    move/from16 v24, v10

    .line 169
    .line 170
    const/4 v6, 0x0

    .line 171
    goto :goto_4

    .line 172
    :cond_5
    move/from16 v21, v9

    .line 173
    .line 174
    iget-object v5, v11, Ldn0;->b:Landroidx/fragment/app/Fragment;

    .line 175
    .line 176
    iget v9, v5, Landroidx/fragment/app/Fragment;->mContainerId:I

    .line 177
    .line 178
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 179
    .line 180
    .line 181
    move-result v13

    .line 182
    const/16 v19, 0x1

    .line 183
    .line 184
    add-int/lit8 v13, v13, -0x1

    .line 185
    .line 186
    const/16 v22, 0x0

    .line 187
    .line 188
    :goto_6
    if-ltz v13, :cond_9

    .line 189
    .line 190
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v23

    .line 194
    move/from16 v24, v10

    .line 195
    .line 196
    move-object/from16 v10, v23

    .line 197
    .line 198
    check-cast v10, Landroidx/fragment/app/Fragment;

    .line 199
    .line 200
    move/from16 v23, v13

    .line 201
    .line 202
    iget v13, v10, Landroidx/fragment/app/Fragment;->mContainerId:I

    .line 203
    .line 204
    if-ne v13, v9, :cond_8

    .line 205
    .line 206
    if-ne v10, v5, :cond_6

    .line 207
    .line 208
    move/from16 v20, v9

    .line 209
    .line 210
    const/4 v9, 0x1

    .line 211
    const/16 v22, 0x1

    .line 212
    .line 213
    goto :goto_8

    .line 214
    :cond_6
    if-ne v10, v6, :cond_7

    .line 215
    .line 216
    new-instance v6, Ldn0;

    .line 217
    .line 218
    move/from16 v20, v9

    .line 219
    .line 220
    const/16 v9, 0x9

    .line 221
    .line 222
    const/4 v13, 0x0

    .line 223
    invoke-direct {v6, v9, v10, v13}, Ldn0;-><init>(ILandroidx/fragment/app/Fragment;I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v15, v8, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    add-int/lit8 v8, v8, 0x1

    .line 230
    .line 231
    const/4 v6, 0x0

    .line 232
    goto :goto_7

    .line 233
    :cond_7
    move/from16 v20, v9

    .line 234
    .line 235
    const/16 v9, 0x9

    .line 236
    .line 237
    const/4 v13, 0x0

    .line 238
    :goto_7
    new-instance v9, Ldn0;

    .line 239
    .line 240
    move-object/from16 v25, v6

    .line 241
    .line 242
    const/4 v6, 0x3

    .line 243
    invoke-direct {v9, v6, v10, v13}, Ldn0;-><init>(ILandroidx/fragment/app/Fragment;I)V

    .line 244
    .line 245
    .line 246
    iget v6, v11, Ldn0;->d:I

    .line 247
    .line 248
    iput v6, v9, Ldn0;->d:I

    .line 249
    .line 250
    iget v6, v11, Ldn0;->f:I

    .line 251
    .line 252
    iput v6, v9, Ldn0;->f:I

    .line 253
    .line 254
    iget v6, v11, Ldn0;->e:I

    .line 255
    .line 256
    iput v6, v9, Ldn0;->e:I

    .line 257
    .line 258
    iget v6, v11, Ldn0;->g:I

    .line 259
    .line 260
    iput v6, v9, Ldn0;->g:I

    .line 261
    .line 262
    invoke-virtual {v15, v8, v9}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    const/4 v9, 0x1

    .line 269
    add-int/2addr v8, v9

    .line 270
    move-object/from16 v6, v25

    .line 271
    .line 272
    goto :goto_8

    .line 273
    :cond_8
    move/from16 v20, v9

    .line 274
    .line 275
    const/4 v9, 0x1

    .line 276
    :goto_8
    add-int/lit8 v13, v23, -0x1

    .line 277
    .line 278
    move/from16 v9, v20

    .line 279
    .line 280
    move/from16 v10, v24

    .line 281
    .line 282
    goto :goto_6

    .line 283
    :cond_9
    move/from16 v24, v10

    .line 284
    .line 285
    const/4 v9, 0x1

    .line 286
    if-eqz v22, :cond_a

    .line 287
    .line 288
    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    add-int/lit8 v8, v8, -0x1

    .line 292
    .line 293
    goto :goto_a

    .line 294
    :cond_a
    iput v9, v11, Ldn0;->a:I

    .line 295
    .line 296
    iput-boolean v9, v11, Ldn0;->c:Z

    .line 297
    .line 298
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    goto :goto_a

    .line 302
    :cond_b
    move/from16 v21, v9

    .line 303
    .line 304
    move v9, v13

    .line 305
    goto/16 :goto_5

    .line 306
    .line 307
    :goto_9
    iget-object v5, v11, Ldn0;->b:Landroidx/fragment/app/Fragment;

    .line 308
    .line 309
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    :goto_a
    add-int/2addr v8, v9

    .line 313
    move v13, v9

    .line 314
    move/from16 v5, v18

    .line 315
    .line 316
    move/from16 v9, v21

    .line 317
    .line 318
    move/from16 v10, v24

    .line 319
    .line 320
    goto/16 :goto_2

    .line 321
    .line 322
    :cond_c
    move/from16 v18, v5

    .line 323
    .line 324
    move/from16 v21, v9

    .line 325
    .line 326
    move/from16 v24, v10

    .line 327
    .line 328
    goto :goto_d

    .line 329
    :cond_d
    move/from16 v18, v5

    .line 330
    .line 331
    move/from16 v21, v9

    .line 332
    .line 333
    move/from16 v24, v10

    .line 334
    .line 335
    move v9, v13

    .line 336
    iget-object v5, v14, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 337
    .line 338
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 339
    .line 340
    .line 341
    move-result v8

    .line 342
    sub-int/2addr v8, v9

    .line 343
    :goto_b
    if-ltz v8, :cond_10

    .line 344
    .line 345
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v10

    .line 349
    check-cast v10, Ldn0;

    .line 350
    .line 351
    iget v11, v10, Ldn0;->a:I

    .line 352
    .line 353
    const/4 v13, 0x3

    .line 354
    if-eq v11, v9, :cond_f

    .line 355
    .line 356
    if-eq v11, v13, :cond_e

    .line 357
    .line 358
    packed-switch v11, :pswitch_data_0

    .line 359
    .line 360
    .line 361
    goto :goto_c

    .line 362
    :pswitch_0
    iget-object v9, v10, Ldn0;->h:Lu61;

    .line 363
    .line 364
    iput-object v9, v10, Ldn0;->i:Lu61;

    .line 365
    .line 366
    goto :goto_c

    .line 367
    :pswitch_1
    iget-object v6, v10, Ldn0;->b:Landroidx/fragment/app/Fragment;

    .line 368
    .line 369
    goto :goto_c

    .line 370
    :pswitch_2
    const/4 v6, 0x0

    .line 371
    goto :goto_c

    .line 372
    :cond_e
    :pswitch_3
    iget-object v9, v10, Ldn0;->b:Landroidx/fragment/app/Fragment;

    .line 373
    .line 374
    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    goto :goto_c

    .line 378
    :cond_f
    :pswitch_4
    iget-object v9, v10, Ldn0;->b:Landroidx/fragment/app/Fragment;

    .line 379
    .line 380
    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    :goto_c
    add-int/lit8 v8, v8, -0x1

    .line 384
    .line 385
    const/4 v9, 0x1

    .line 386
    goto :goto_b

    .line 387
    :cond_10
    :goto_d
    if-nez v24, :cond_12

    .line 388
    .line 389
    iget-boolean v5, v14, Landroidx/fragment/app/a;->g:Z

    .line 390
    .line 391
    if-eqz v5, :cond_11

    .line 392
    .line 393
    goto :goto_e

    .line 394
    :cond_11
    const/4 v10, 0x0

    .line 395
    goto :goto_f

    .line 396
    :cond_12
    :goto_e
    const/4 v10, 0x1

    .line 397
    :goto_f
    add-int/lit8 v9, v21, 0x1

    .line 398
    .line 399
    move/from16 v5, v18

    .line 400
    .line 401
    goto/16 :goto_1

    .line 402
    .line 403
    :cond_13
    move/from16 v18, v5

    .line 404
    .line 405
    move/from16 v24, v10

    .line 406
    .line 407
    iget-object v5, v0, Landroidx/fragment/app/w;->M:Ljava/util/ArrayList;

    .line 408
    .line 409
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 410
    .line 411
    .line 412
    if-nez v18, :cond_16

    .line 413
    .line 414
    iget v5, v0, Landroidx/fragment/app/w;->u:I

    .line 415
    .line 416
    const/4 v9, 0x1

    .line 417
    if-lt v5, v9, :cond_16

    .line 418
    .line 419
    move v5, v3

    .line 420
    :goto_10
    if-ge v5, v4, :cond_16

    .line 421
    .line 422
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v6

    .line 426
    check-cast v6, Landroidx/fragment/app/a;

    .line 427
    .line 428
    iget-object v6, v6, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 429
    .line 430
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 431
    .line 432
    .line 433
    move-result-object v6

    .line 434
    :cond_14
    :goto_11
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 435
    .line 436
    .line 437
    move-result v8

    .line 438
    if-eqz v8, :cond_15

    .line 439
    .line 440
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v8

    .line 444
    check-cast v8, Ldn0;

    .line 445
    .line 446
    iget-object v8, v8, Ldn0;->b:Landroidx/fragment/app/Fragment;

    .line 447
    .line 448
    if-eqz v8, :cond_14

    .line 449
    .line 450
    iget-object v9, v8, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/w;

    .line 451
    .line 452
    if-eqz v9, :cond_14

    .line 453
    .line 454
    invoke-virtual {v0, v8}, Landroidx/fragment/app/w;->g(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/y;

    .line 455
    .line 456
    .line 457
    move-result-object v8

    .line 458
    invoke-virtual {v7, v8}, Landroidx/fragment/app/z;->g(Landroidx/fragment/app/y;)V

    .line 459
    .line 460
    .line 461
    goto :goto_11

    .line 462
    :cond_15
    add-int/lit8 v5, v5, 0x1

    .line 463
    .line 464
    goto :goto_10

    .line 465
    :cond_16
    move v5, v3

    .line 466
    :goto_12
    const/4 v6, -0x1

    .line 467
    if-ge v5, v4, :cond_25

    .line 468
    .line 469
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v7

    .line 473
    check-cast v7, Landroidx/fragment/app/a;

    .line 474
    .line 475
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v8

    .line 479
    check-cast v8, Ljava/lang/Boolean;

    .line 480
    .line 481
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 482
    .line 483
    .line 484
    move-result v8

    .line 485
    const-string v9, "Unknown cmd: "

    .line 486
    .line 487
    if-eqz v8, :cond_1f

    .line 488
    .line 489
    invoke-virtual {v7, v6}, Landroidx/fragment/app/a;->c(I)V

    .line 490
    .line 491
    .line 492
    iget-object v6, v7, Landroidx/fragment/app/a;->q:Landroidx/fragment/app/w;

    .line 493
    .line 494
    iget-object v8, v7, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 495
    .line 496
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 497
    .line 498
    .line 499
    move-result v10

    .line 500
    const/4 v11, 0x1

    .line 501
    sub-int/2addr v10, v11

    .line 502
    :goto_13
    if-ltz v10, :cond_1e

    .line 503
    .line 504
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v12

    .line 508
    check-cast v12, Ldn0;

    .line 509
    .line 510
    iget-object v13, v12, Ldn0;->b:Landroidx/fragment/app/Fragment;

    .line 511
    .line 512
    if-eqz v13, :cond_1a

    .line 513
    .line 514
    const/4 v14, 0x0

    .line 515
    iput-boolean v14, v13, Landroidx/fragment/app/Fragment;->mBeingSaved:Z

    .line 516
    .line 517
    invoke-virtual {v13, v11}, Landroidx/fragment/app/Fragment;->setPopDirection(Z)V

    .line 518
    .line 519
    .line 520
    iget v11, v7, Landroidx/fragment/app/a;->f:I

    .line 521
    .line 522
    const/16 v14, 0x2002

    .line 523
    .line 524
    const/16 v15, 0x1001

    .line 525
    .line 526
    if-eq v11, v15, :cond_19

    .line 527
    .line 528
    if-eq v11, v14, :cond_18

    .line 529
    .line 530
    const/16 v14, 0x1004

    .line 531
    .line 532
    const/16 v15, 0x2005

    .line 533
    .line 534
    if-eq v11, v15, :cond_19

    .line 535
    .line 536
    const/16 v15, 0x1003

    .line 537
    .line 538
    if-eq v11, v15, :cond_18

    .line 539
    .line 540
    if-eq v11, v14, :cond_17

    .line 541
    .line 542
    const/4 v14, 0x0

    .line 543
    goto :goto_14

    .line 544
    :cond_17
    const/16 v14, 0x2005

    .line 545
    .line 546
    goto :goto_14

    .line 547
    :cond_18
    move v14, v15

    .line 548
    :cond_19
    :goto_14
    invoke-virtual {v13, v14}, Landroidx/fragment/app/Fragment;->setNextTransition(I)V

    .line 549
    .line 550
    .line 551
    iget-object v11, v7, Landroidx/fragment/app/a;->o:Ljava/util/ArrayList;

    .line 552
    .line 553
    iget-object v14, v7, Landroidx/fragment/app/a;->n:Ljava/util/ArrayList;

    .line 554
    .line 555
    invoke-virtual {v13, v11, v14}, Landroidx/fragment/app/Fragment;->setSharedElementNames(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 556
    .line 557
    .line 558
    :cond_1a
    iget v11, v12, Ldn0;->a:I

    .line 559
    .line 560
    packed-switch v11, :pswitch_data_1

    .line 561
    .line 562
    .line 563
    :pswitch_5
    iget v0, v12, Ldn0;->a:I

    .line 564
    .line 565
    invoke-static {v0, v9}, Ls80;->j(ILjava/lang/String;)V

    .line 566
    .line 567
    .line 568
    return-void

    .line 569
    :pswitch_6
    iget-object v11, v12, Ldn0;->h:Lu61;

    .line 570
    .line 571
    invoke-virtual {v6, v13, v11}, Landroidx/fragment/app/w;->Z(Landroidx/fragment/app/Fragment;Lu61;)V

    .line 572
    .line 573
    .line 574
    :cond_1b
    :goto_15
    const/4 v11, 0x1

    .line 575
    goto/16 :goto_16

    .line 576
    .line 577
    :pswitch_7
    invoke-virtual {v6, v13}, Landroidx/fragment/app/w;->a0(Landroidx/fragment/app/Fragment;)V

    .line 578
    .line 579
    .line 580
    goto :goto_15

    .line 581
    :pswitch_8
    const/4 v11, 0x0

    .line 582
    invoke-virtual {v6, v11}, Landroidx/fragment/app/w;->a0(Landroidx/fragment/app/Fragment;)V

    .line 583
    .line 584
    .line 585
    goto :goto_15

    .line 586
    :pswitch_9
    iget v11, v12, Ldn0;->d:I

    .line 587
    .line 588
    iget v14, v12, Ldn0;->e:I

    .line 589
    .line 590
    iget v15, v12, Ldn0;->f:I

    .line 591
    .line 592
    iget v12, v12, Ldn0;->g:I

    .line 593
    .line 594
    invoke-virtual {v13, v11, v14, v15, v12}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 595
    .line 596
    .line 597
    const/4 v11, 0x1

    .line 598
    invoke-virtual {v6, v13, v11}, Landroidx/fragment/app/w;->Y(Landroidx/fragment/app/Fragment;Z)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v6, v13}, Landroidx/fragment/app/w;->h(Landroidx/fragment/app/Fragment;)V

    .line 602
    .line 603
    .line 604
    goto :goto_15

    .line 605
    :pswitch_a
    iget v11, v12, Ldn0;->d:I

    .line 606
    .line 607
    iget v14, v12, Ldn0;->e:I

    .line 608
    .line 609
    iget v15, v12, Ldn0;->f:I

    .line 610
    .line 611
    iget v12, v12, Ldn0;->g:I

    .line 612
    .line 613
    invoke-virtual {v13, v11, v14, v15, v12}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v6, v13}, Landroidx/fragment/app/w;->c(Landroidx/fragment/app/Fragment;)V

    .line 617
    .line 618
    .line 619
    goto :goto_15

    .line 620
    :pswitch_b
    iget v11, v12, Ldn0;->d:I

    .line 621
    .line 622
    iget v14, v12, Ldn0;->e:I

    .line 623
    .line 624
    iget v15, v12, Ldn0;->f:I

    .line 625
    .line 626
    iget v12, v12, Ldn0;->g:I

    .line 627
    .line 628
    invoke-virtual {v13, v11, v14, v15, v12}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 629
    .line 630
    .line 631
    const/4 v11, 0x1

    .line 632
    invoke-virtual {v6, v13, v11}, Landroidx/fragment/app/w;->Y(Landroidx/fragment/app/Fragment;Z)V

    .line 633
    .line 634
    .line 635
    const/16 v17, 0x2

    .line 636
    .line 637
    invoke-static/range {v17 .. v17}, Landroidx/fragment/app/w;->K(I)Z

    .line 638
    .line 639
    .line 640
    move-result v12

    .line 641
    if-eqz v12, :cond_1c

    .line 642
    .line 643
    invoke-static {v13}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    :cond_1c
    iget-boolean v12, v13, Landroidx/fragment/app/Fragment;->mHidden:Z

    .line 647
    .line 648
    if-nez v12, :cond_1b

    .line 649
    .line 650
    iput-boolean v11, v13, Landroidx/fragment/app/Fragment;->mHidden:Z

    .line 651
    .line 652
    iget-boolean v12, v13, Landroidx/fragment/app/Fragment;->mHiddenChanged:Z

    .line 653
    .line 654
    xor-int/2addr v12, v11

    .line 655
    iput-boolean v12, v13, Landroidx/fragment/app/Fragment;->mHiddenChanged:Z

    .line 656
    .line 657
    invoke-virtual {v6, v13}, Landroidx/fragment/app/w;->b0(Landroidx/fragment/app/Fragment;)V

    .line 658
    .line 659
    .line 660
    goto :goto_15

    .line 661
    :pswitch_c
    iget v11, v12, Ldn0;->d:I

    .line 662
    .line 663
    iget v14, v12, Ldn0;->e:I

    .line 664
    .line 665
    iget v15, v12, Ldn0;->f:I

    .line 666
    .line 667
    iget v12, v12, Ldn0;->g:I

    .line 668
    .line 669
    invoke-virtual {v13, v11, v14, v15, v12}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 670
    .line 671
    .line 672
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 673
    .line 674
    .line 675
    const/16 v17, 0x2

    .line 676
    .line 677
    invoke-static/range {v17 .. v17}, Landroidx/fragment/app/w;->K(I)Z

    .line 678
    .line 679
    .line 680
    move-result v11

    .line 681
    if-eqz v11, :cond_1d

    .line 682
    .line 683
    invoke-static {v13}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    :cond_1d
    iget-boolean v11, v13, Landroidx/fragment/app/Fragment;->mHidden:Z

    .line 687
    .line 688
    if-eqz v11, :cond_1b

    .line 689
    .line 690
    const/4 v14, 0x0

    .line 691
    iput-boolean v14, v13, Landroidx/fragment/app/Fragment;->mHidden:Z

    .line 692
    .line 693
    iget-boolean v11, v13, Landroidx/fragment/app/Fragment;->mHiddenChanged:Z

    .line 694
    .line 695
    const/16 v19, 0x1

    .line 696
    .line 697
    xor-int/lit8 v11, v11, 0x1

    .line 698
    .line 699
    iput-boolean v11, v13, Landroidx/fragment/app/Fragment;->mHiddenChanged:Z

    .line 700
    .line 701
    goto :goto_15

    .line 702
    :pswitch_d
    iget v11, v12, Ldn0;->d:I

    .line 703
    .line 704
    iget v14, v12, Ldn0;->e:I

    .line 705
    .line 706
    iget v15, v12, Ldn0;->f:I

    .line 707
    .line 708
    iget v12, v12, Ldn0;->g:I

    .line 709
    .line 710
    invoke-virtual {v13, v11, v14, v15, v12}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v6, v13}, Landroidx/fragment/app/w;->a(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/y;

    .line 714
    .line 715
    .line 716
    goto/16 :goto_15

    .line 717
    .line 718
    :pswitch_e
    iget v11, v12, Ldn0;->d:I

    .line 719
    .line 720
    iget v14, v12, Ldn0;->e:I

    .line 721
    .line 722
    iget v15, v12, Ldn0;->f:I

    .line 723
    .line 724
    iget v12, v12, Ldn0;->g:I

    .line 725
    .line 726
    invoke-virtual {v13, v11, v14, v15, v12}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 727
    .line 728
    .line 729
    const/4 v11, 0x1

    .line 730
    invoke-virtual {v6, v13, v11}, Landroidx/fragment/app/w;->Y(Landroidx/fragment/app/Fragment;Z)V

    .line 731
    .line 732
    .line 733
    invoke-virtual {v6, v13}, Landroidx/fragment/app/w;->T(Landroidx/fragment/app/Fragment;)V

    .line 734
    .line 735
    .line 736
    :goto_16
    add-int/lit8 v10, v10, -0x1

    .line 737
    .line 738
    goto/16 :goto_13

    .line 739
    .line 740
    :cond_1e
    move/from16 v16, v5

    .line 741
    .line 742
    const/16 v17, 0x2

    .line 743
    .line 744
    goto/16 :goto_1b

    .line 745
    .line 746
    :cond_1f
    const/4 v11, 0x1

    .line 747
    invoke-virtual {v7, v11}, Landroidx/fragment/app/a;->c(I)V

    .line 748
    .line 749
    .line 750
    iget-object v6, v7, Landroidx/fragment/app/a;->q:Landroidx/fragment/app/w;

    .line 751
    .line 752
    iget-object v8, v7, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 753
    .line 754
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 755
    .line 756
    .line 757
    move-result v10

    .line 758
    const/4 v13, 0x0

    .line 759
    :goto_17
    if-ge v13, v10, :cond_1e

    .line 760
    .line 761
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v11

    .line 765
    check-cast v11, Ldn0;

    .line 766
    .line 767
    iget-object v12, v11, Ldn0;->b:Landroidx/fragment/app/Fragment;

    .line 768
    .line 769
    if-eqz v12, :cond_20

    .line 770
    .line 771
    const/4 v14, 0x0

    .line 772
    iput-boolean v14, v12, Landroidx/fragment/app/Fragment;->mBeingSaved:Z

    .line 773
    .line 774
    invoke-virtual {v12, v14}, Landroidx/fragment/app/Fragment;->setPopDirection(Z)V

    .line 775
    .line 776
    .line 777
    iget v14, v7, Landroidx/fragment/app/a;->f:I

    .line 778
    .line 779
    invoke-virtual {v12, v14}, Landroidx/fragment/app/Fragment;->setNextTransition(I)V

    .line 780
    .line 781
    .line 782
    iget-object v14, v7, Landroidx/fragment/app/a;->n:Ljava/util/ArrayList;

    .line 783
    .line 784
    iget-object v15, v7, Landroidx/fragment/app/a;->o:Ljava/util/ArrayList;

    .line 785
    .line 786
    invoke-virtual {v12, v14, v15}, Landroidx/fragment/app/Fragment;->setSharedElementNames(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 787
    .line 788
    .line 789
    :cond_20
    iget v14, v11, Ldn0;->a:I

    .line 790
    .line 791
    packed-switch v14, :pswitch_data_2

    .line 792
    .line 793
    .line 794
    :pswitch_f
    iget v0, v11, Ldn0;->a:I

    .line 795
    .line 796
    invoke-static {v0, v9}, Ls80;->j(ILjava/lang/String;)V

    .line 797
    .line 798
    .line 799
    return-void

    .line 800
    :pswitch_10
    iget-object v11, v11, Ldn0;->i:Lu61;

    .line 801
    .line 802
    invoke-virtual {v6, v12, v11}, Landroidx/fragment/app/w;->Z(Landroidx/fragment/app/Fragment;Lu61;)V

    .line 803
    .line 804
    .line 805
    :goto_18
    move/from16 v16, v5

    .line 806
    .line 807
    :cond_21
    :goto_19
    const/16 v17, 0x2

    .line 808
    .line 809
    goto/16 :goto_1a

    .line 810
    .line 811
    :pswitch_11
    const/4 v14, 0x0

    .line 812
    invoke-virtual {v6, v14}, Landroidx/fragment/app/w;->a0(Landroidx/fragment/app/Fragment;)V

    .line 813
    .line 814
    .line 815
    goto :goto_18

    .line 816
    :pswitch_12
    const/4 v14, 0x0

    .line 817
    invoke-virtual {v6, v12}, Landroidx/fragment/app/w;->a0(Landroidx/fragment/app/Fragment;)V

    .line 818
    .line 819
    .line 820
    goto :goto_18

    .line 821
    :pswitch_13
    const/4 v14, 0x0

    .line 822
    iget v15, v11, Ldn0;->d:I

    .line 823
    .line 824
    iget v14, v11, Ldn0;->e:I

    .line 825
    .line 826
    move/from16 v16, v5

    .line 827
    .line 828
    iget v5, v11, Ldn0;->f:I

    .line 829
    .line 830
    iget v11, v11, Ldn0;->g:I

    .line 831
    .line 832
    invoke-virtual {v12, v15, v14, v5, v11}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 833
    .line 834
    .line 835
    const/4 v14, 0x0

    .line 836
    invoke-virtual {v6, v12, v14}, Landroidx/fragment/app/w;->Y(Landroidx/fragment/app/Fragment;Z)V

    .line 837
    .line 838
    .line 839
    invoke-virtual {v6, v12}, Landroidx/fragment/app/w;->c(Landroidx/fragment/app/Fragment;)V

    .line 840
    .line 841
    .line 842
    goto :goto_19

    .line 843
    :pswitch_14
    move/from16 v16, v5

    .line 844
    .line 845
    iget v5, v11, Ldn0;->d:I

    .line 846
    .line 847
    iget v14, v11, Ldn0;->e:I

    .line 848
    .line 849
    iget v15, v11, Ldn0;->f:I

    .line 850
    .line 851
    iget v11, v11, Ldn0;->g:I

    .line 852
    .line 853
    invoke-virtual {v12, v5, v14, v15, v11}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v6, v12}, Landroidx/fragment/app/w;->h(Landroidx/fragment/app/Fragment;)V

    .line 857
    .line 858
    .line 859
    goto :goto_19

    .line 860
    :pswitch_15
    move/from16 v16, v5

    .line 861
    .line 862
    iget v5, v11, Ldn0;->d:I

    .line 863
    .line 864
    iget v14, v11, Ldn0;->e:I

    .line 865
    .line 866
    iget v15, v11, Ldn0;->f:I

    .line 867
    .line 868
    iget v11, v11, Ldn0;->g:I

    .line 869
    .line 870
    invoke-virtual {v12, v5, v14, v15, v11}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 871
    .line 872
    .line 873
    const/4 v14, 0x0

    .line 874
    invoke-virtual {v6, v12, v14}, Landroidx/fragment/app/w;->Y(Landroidx/fragment/app/Fragment;Z)V

    .line 875
    .line 876
    .line 877
    const/16 v17, 0x2

    .line 878
    .line 879
    invoke-static/range {v17 .. v17}, Landroidx/fragment/app/w;->K(I)Z

    .line 880
    .line 881
    .line 882
    move-result v5

    .line 883
    if-eqz v5, :cond_22

    .line 884
    .line 885
    invoke-static {v12}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 886
    .line 887
    .line 888
    :cond_22
    iget-boolean v5, v12, Landroidx/fragment/app/Fragment;->mHidden:Z

    .line 889
    .line 890
    if-eqz v5, :cond_21

    .line 891
    .line 892
    iput-boolean v14, v12, Landroidx/fragment/app/Fragment;->mHidden:Z

    .line 893
    .line 894
    iget-boolean v5, v12, Landroidx/fragment/app/Fragment;->mHiddenChanged:Z

    .line 895
    .line 896
    const/16 v19, 0x1

    .line 897
    .line 898
    xor-int/lit8 v5, v5, 0x1

    .line 899
    .line 900
    iput-boolean v5, v12, Landroidx/fragment/app/Fragment;->mHiddenChanged:Z

    .line 901
    .line 902
    goto :goto_19

    .line 903
    :pswitch_16
    move/from16 v16, v5

    .line 904
    .line 905
    iget v5, v11, Ldn0;->d:I

    .line 906
    .line 907
    iget v14, v11, Ldn0;->e:I

    .line 908
    .line 909
    iget v15, v11, Ldn0;->f:I

    .line 910
    .line 911
    iget v11, v11, Ldn0;->g:I

    .line 912
    .line 913
    invoke-virtual {v12, v5, v14, v15, v11}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 914
    .line 915
    .line 916
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 917
    .line 918
    .line 919
    const/16 v17, 0x2

    .line 920
    .line 921
    invoke-static/range {v17 .. v17}, Landroidx/fragment/app/w;->K(I)Z

    .line 922
    .line 923
    .line 924
    move-result v5

    .line 925
    if-eqz v5, :cond_23

    .line 926
    .line 927
    invoke-static {v12}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 928
    .line 929
    .line 930
    :cond_23
    iget-boolean v5, v12, Landroidx/fragment/app/Fragment;->mHidden:Z

    .line 931
    .line 932
    if-nez v5, :cond_24

    .line 933
    .line 934
    const/4 v11, 0x1

    .line 935
    iput-boolean v11, v12, Landroidx/fragment/app/Fragment;->mHidden:Z

    .line 936
    .line 937
    iget-boolean v5, v12, Landroidx/fragment/app/Fragment;->mHiddenChanged:Z

    .line 938
    .line 939
    xor-int/2addr v5, v11

    .line 940
    iput-boolean v5, v12, Landroidx/fragment/app/Fragment;->mHiddenChanged:Z

    .line 941
    .line 942
    invoke-virtual {v6, v12}, Landroidx/fragment/app/w;->b0(Landroidx/fragment/app/Fragment;)V

    .line 943
    .line 944
    .line 945
    goto :goto_1a

    .line 946
    :pswitch_17
    move/from16 v16, v5

    .line 947
    .line 948
    const/16 v17, 0x2

    .line 949
    .line 950
    iget v5, v11, Ldn0;->d:I

    .line 951
    .line 952
    iget v14, v11, Ldn0;->e:I

    .line 953
    .line 954
    iget v15, v11, Ldn0;->f:I

    .line 955
    .line 956
    iget v11, v11, Ldn0;->g:I

    .line 957
    .line 958
    invoke-virtual {v12, v5, v14, v15, v11}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 959
    .line 960
    .line 961
    invoke-virtual {v6, v12}, Landroidx/fragment/app/w;->T(Landroidx/fragment/app/Fragment;)V

    .line 962
    .line 963
    .line 964
    goto :goto_1a

    .line 965
    :pswitch_18
    move/from16 v16, v5

    .line 966
    .line 967
    const/16 v17, 0x2

    .line 968
    .line 969
    iget v5, v11, Ldn0;->d:I

    .line 970
    .line 971
    iget v14, v11, Ldn0;->e:I

    .line 972
    .line 973
    iget v15, v11, Ldn0;->f:I

    .line 974
    .line 975
    iget v11, v11, Ldn0;->g:I

    .line 976
    .line 977
    invoke-virtual {v12, v5, v14, v15, v11}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 978
    .line 979
    .line 980
    const/4 v14, 0x0

    .line 981
    invoke-virtual {v6, v12, v14}, Landroidx/fragment/app/w;->Y(Landroidx/fragment/app/Fragment;Z)V

    .line 982
    .line 983
    .line 984
    invoke-virtual {v6, v12}, Landroidx/fragment/app/w;->a(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/y;

    .line 985
    .line 986
    .line 987
    :cond_24
    :goto_1a
    add-int/lit8 v13, v13, 0x1

    .line 988
    .line 989
    move/from16 v5, v16

    .line 990
    .line 991
    goto/16 :goto_17

    .line 992
    .line 993
    :goto_1b
    add-int/lit8 v5, v16, 0x1

    .line 994
    .line 995
    goto/16 :goto_12

    .line 996
    .line 997
    :cond_25
    add-int/lit8 v5, v4, -0x1

    .line 998
    .line 999
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v5

    .line 1003
    check-cast v5, Ljava/lang/Boolean;

    .line 1004
    .line 1005
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1006
    .line 1007
    .line 1008
    move-result v5

    .line 1009
    iget-object v7, v0, Landroidx/fragment/app/w;->m:Ljava/util/ArrayList;

    .line 1010
    .line 1011
    if-eqz v24, :cond_2a

    .line 1012
    .line 1013
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1014
    .line 1015
    .line 1016
    move-result v8

    .line 1017
    if-nez v8, :cond_2a

    .line 1018
    .line 1019
    new-instance v8, Ljava/util/LinkedHashSet;

    .line 1020
    .line 1021
    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v9

    .line 1028
    :goto_1c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1029
    .line 1030
    .line 1031
    move-result v10

    .line 1032
    if-eqz v10, :cond_26

    .line 1033
    .line 1034
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v10

    .line 1038
    check-cast v10, Landroidx/fragment/app/a;

    .line 1039
    .line 1040
    invoke-static {v10}, Landroidx/fragment/app/w;->F(Landroidx/fragment/app/a;)Ljava/util/HashSet;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v10

    .line 1044
    invoke-interface {v8, v10}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 1045
    .line 1046
    .line 1047
    goto :goto_1c

    .line 1048
    :cond_26
    iget-object v9, v0, Landroidx/fragment/app/w;->h:Landroidx/fragment/app/a;

    .line 1049
    .line 1050
    if-nez v9, :cond_2a

    .line 1051
    .line 1052
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v9

    .line 1056
    :cond_27
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1057
    .line 1058
    .line 1059
    move-result v10

    .line 1060
    if-eqz v10, :cond_28

    .line 1061
    .line 1062
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v10

    .line 1066
    check-cast v10, Lbt0;

    .line 1067
    .line 1068
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v11

    .line 1072
    :goto_1d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1073
    .line 1074
    .line 1075
    move-result v12

    .line 1076
    if-eqz v12, :cond_27

    .line 1077
    .line 1078
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v12

    .line 1082
    check-cast v12, Landroidx/fragment/app/Fragment;

    .line 1083
    .line 1084
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1085
    .line 1086
    .line 1087
    goto :goto_1d

    .line 1088
    :cond_28
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v9

    .line 1092
    :cond_29
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1093
    .line 1094
    .line 1095
    move-result v10

    .line 1096
    if-eqz v10, :cond_2a

    .line 1097
    .line 1098
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v10

    .line 1102
    check-cast v10, Lbt0;

    .line 1103
    .line 1104
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v11

    .line 1108
    :goto_1e
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1109
    .line 1110
    .line 1111
    move-result v12

    .line 1112
    if-eqz v12, :cond_29

    .line 1113
    .line 1114
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v12

    .line 1118
    check-cast v12, Landroidx/fragment/app/Fragment;

    .line 1119
    .line 1120
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1121
    .line 1122
    .line 1123
    goto :goto_1e

    .line 1124
    :cond_2a
    move v8, v3

    .line 1125
    :goto_1f
    if-ge v8, v4, :cond_2f

    .line 1126
    .line 1127
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v9

    .line 1131
    check-cast v9, Landroidx/fragment/app/a;

    .line 1132
    .line 1133
    if-eqz v5, :cond_2c

    .line 1134
    .line 1135
    iget-object v10, v9, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 1136
    .line 1137
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 1138
    .line 1139
    .line 1140
    move-result v10

    .line 1141
    const/16 v19, 0x1

    .line 1142
    .line 1143
    add-int/lit8 v10, v10, -0x1

    .line 1144
    .line 1145
    :goto_20
    if-ltz v10, :cond_2e

    .line 1146
    .line 1147
    iget-object v11, v9, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 1148
    .line 1149
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v11

    .line 1153
    check-cast v11, Ldn0;

    .line 1154
    .line 1155
    iget-object v11, v11, Ldn0;->b:Landroidx/fragment/app/Fragment;

    .line 1156
    .line 1157
    if-eqz v11, :cond_2b

    .line 1158
    .line 1159
    invoke-virtual {v0, v11}, Landroidx/fragment/app/w;->g(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/y;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v11

    .line 1163
    invoke-virtual {v11}, Landroidx/fragment/app/y;->i()V

    .line 1164
    .line 1165
    .line 1166
    :cond_2b
    add-int/lit8 v10, v10, -0x1

    .line 1167
    .line 1168
    goto :goto_20

    .line 1169
    :cond_2c
    iget-object v9, v9, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 1170
    .line 1171
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v9

    .line 1175
    :cond_2d
    :goto_21
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1176
    .line 1177
    .line 1178
    move-result v10

    .line 1179
    if-eqz v10, :cond_2e

    .line 1180
    .line 1181
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v10

    .line 1185
    check-cast v10, Ldn0;

    .line 1186
    .line 1187
    iget-object v10, v10, Ldn0;->b:Landroidx/fragment/app/Fragment;

    .line 1188
    .line 1189
    if-eqz v10, :cond_2d

    .line 1190
    .line 1191
    invoke-virtual {v0, v10}, Landroidx/fragment/app/w;->g(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/y;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v10

    .line 1195
    invoke-virtual {v10}, Landroidx/fragment/app/y;->i()V

    .line 1196
    .line 1197
    .line 1198
    goto :goto_21

    .line 1199
    :cond_2e
    add-int/lit8 v8, v8, 0x1

    .line 1200
    .line 1201
    goto :goto_1f

    .line 1202
    :cond_2f
    iget v8, v0, Landroidx/fragment/app/w;->u:I

    .line 1203
    .line 1204
    const/4 v11, 0x1

    .line 1205
    invoke-virtual {v0, v8, v11}, Landroidx/fragment/app/w;->O(IZ)V

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v0, v1, v3, v4}, Landroidx/fragment/app/w;->f(Ljava/util/ArrayList;II)Ljava/util/HashSet;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v0

    .line 1212
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v0

    .line 1216
    :goto_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1217
    .line 1218
    .line 1219
    move-result v8

    .line 1220
    if-eqz v8, :cond_30

    .line 1221
    .line 1222
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v8

    .line 1226
    check-cast v8, Landroidx/fragment/app/h;

    .line 1227
    .line 1228
    iput-boolean v5, v8, Landroidx/fragment/app/h;->d:Z

    .line 1229
    .line 1230
    invoke-virtual {v8}, Landroidx/fragment/app/h;->k()V

    .line 1231
    .line 1232
    .line 1233
    invoke-virtual {v8}, Landroidx/fragment/app/h;->e()V

    .line 1234
    .line 1235
    .line 1236
    goto :goto_22

    .line 1237
    :cond_30
    :goto_23
    if-ge v3, v4, :cond_32

    .line 1238
    .line 1239
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v0

    .line 1243
    check-cast v0, Landroidx/fragment/app/a;

    .line 1244
    .line 1245
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v5

    .line 1249
    check-cast v5, Ljava/lang/Boolean;

    .line 1250
    .line 1251
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1252
    .line 1253
    .line 1254
    move-result v5

    .line 1255
    if-eqz v5, :cond_31

    .line 1256
    .line 1257
    iget v5, v0, Landroidx/fragment/app/a;->s:I

    .line 1258
    .line 1259
    if-ltz v5, :cond_31

    .line 1260
    .line 1261
    iput v6, v0, Landroidx/fragment/app/a;->s:I

    .line 1262
    .line 1263
    :cond_31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1264
    .line 1265
    .line 1266
    add-int/lit8 v3, v3, 0x1

    .line 1267
    .line 1268
    goto :goto_23

    .line 1269
    :cond_32
    if-eqz v24, :cond_36

    .line 1270
    .line 1271
    const/4 v13, 0x0

    .line 1272
    :goto_24
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 1273
    .line 1274
    .line 1275
    move-result v0

    .line 1276
    if-ge v13, v0, :cond_36

    .line 1277
    .line 1278
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v0

    .line 1282
    check-cast v0, Lbt0;

    .line 1283
    .line 1284
    iget-object v0, v0, Lbt0;->a:Lcom/helpshift/activities/HSMainActivity;

    .line 1285
    .line 1286
    sget v1, Lcom/helpshift/activities/HSMainActivity;->i:I

    .line 1287
    .line 1288
    invoke-virtual {v0}, Lcom/helpshift/activities/HSMainActivity;->f()Landroidx/fragment/app/Fragment;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v1

    .line 1292
    if-nez v1, :cond_33

    .line 1293
    .line 1294
    const/4 v11, 0x1

    .line 1295
    const/4 v14, 0x0

    .line 1296
    invoke-static {v0, v14, v11}, Lcom/helpshift/activities/HSMainActivity;->d(Lcom/helpshift/activities/HSMainActivity;ZZ)V

    .line 1297
    .line 1298
    .line 1299
    goto :goto_25

    .line 1300
    :cond_33
    const/4 v11, 0x1

    .line 1301
    const/4 v14, 0x0

    .line 1302
    instance-of v2, v1, Lls0;

    .line 1303
    .line 1304
    if-eqz v2, :cond_34

    .line 1305
    .line 1306
    invoke-static {v0, v14, v14}, Lcom/helpshift/activities/HSMainActivity;->d(Lcom/helpshift/activities/HSMainActivity;ZZ)V

    .line 1307
    .line 1308
    .line 1309
    goto :goto_25

    .line 1310
    :cond_34
    instance-of v1, v1, Lxs0;

    .line 1311
    .line 1312
    if-eqz v1, :cond_35

    .line 1313
    .line 1314
    invoke-static {v0, v11, v14}, Lcom/helpshift/activities/HSMainActivity;->d(Lcom/helpshift/activities/HSMainActivity;ZZ)V

    .line 1315
    .line 1316
    .line 1317
    :cond_35
    :goto_25
    add-int/lit8 v13, v13, 0x1

    .line 1318
    .line 1319
    goto :goto_24

    .line 1320
    :cond_36
    return-void

    .line 1321
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_5
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_18
        :pswitch_f
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method

.method public final C(I)Landroidx/fragment/app/Fragment;
    .locals 4

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    :goto_0
    if-ltz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iget v3, v2, Landroidx/fragment/app/Fragment;->mFragmentId:I

    .line 22
    .line 23
    if-ne v3, p1, :cond_0

    .line 24
    .line 25
    return-object v2

    .line 26
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object p0, p0, Landroidx/fragment/app/z;->b:Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Landroidx/fragment/app/y;

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    iget-object v0, v0, Landroidx/fragment/app/y;->c:Landroidx/fragment/app/Fragment;

    .line 54
    .line 55
    iget v1, v0, Landroidx/fragment/app/Fragment;->mFragmentId:I

    .line 56
    .line 57
    if-ne v1, p1, :cond_2

    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_3
    const/4 p0, 0x0

    .line 61
    return-object p0
.end method

.method public final D(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    .locals 4

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    :goto_0
    if-ltz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iget-object v3, v2, Landroidx/fragment/app/Fragment;->mTag:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    return-object v2

    .line 30
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object p0, p0, Landroidx/fragment/app/z;->b:Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Landroidx/fragment/app/y;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    iget-object v0, v0, Landroidx/fragment/app/y;->c:Landroidx/fragment/app/Fragment;

    .line 58
    .line 59
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->mTag:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_3
    const/4 p0, 0x0

    .line 69
    return-object p0
.end method

.method public final E()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/w;->e()Ljava/util/HashSet;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroidx/fragment/app/h;

    .line 20
    .line 21
    iget-boolean v1, v0, Landroidx/fragment/app/h;->e:Z

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iput-boolean v1, v0, Landroidx/fragment/app/h;->e:Z

    .line 27
    .line 28
    invoke-virtual {v0}, Landroidx/fragment/app/h;->e()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return-void
.end method

.method public final G()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/w;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object p0, p0, Landroidx/fragment/app/w;->h:Landroidx/fragment/app/a;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    :goto_0
    add-int/2addr v0, p0

    .line 15
    return v0
.end method

.method public final H(Landroidx/fragment/app/Fragment;)Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mContainer:Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget v0, p1, Landroidx/fragment/app/Fragment;->mContainerId:I

    .line 7
    .line 8
    if-gtz v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/w;->w:Lmm0;

    .line 12
    .line 13
    invoke-virtual {v0}, Lmm0;->c()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object p0, p0, Landroidx/fragment/app/w;->w:Lmm0;

    .line 20
    .line 21
    iget p1, p1, Landroidx/fragment/app/Fragment;->mContainerId:I

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lmm0;->b(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    instance-of p1, p0, Landroid/view/ViewGroup;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    check-cast p0, Landroid/view/ViewGroup;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public final I()Lrm0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, v0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/w;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/w;->I()Lrm0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Landroidx/fragment/app/w;->z:Lrm0;

    .line 13
    .line 14
    return-object p0
.end method

.method public final J()Lec0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, v0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/w;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/w;->J()Lec0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Landroidx/fragment/app/w;->A:Lec0;

    .line 13
    .line 14
    return-object p0
.end method

.method public final M()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/w;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Landroidx/fragment/app/w;->M()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    return v1

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public final O(IZ)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const-string p0, "No activity"

    .line 10
    .line 11
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    :goto_0
    if-nez p2, :cond_2

    .line 16
    .line 17
    iget p2, p0, Landroidx/fragment/app/w;->u:I

    .line 18
    .line 19
    if-ne p1, p2, :cond_2

    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_2
    iput p1, p0, Landroidx/fragment/app/w;->u:I

    .line 24
    .line 25
    iget-object p1, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 26
    .line 27
    iget-object p2, p1, Landroidx/fragment/app/z;->b:Ljava/util/HashMap;

    .line 28
    .line 29
    iget-object v0, p1, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 46
    .line 47
    iget-object v1, v1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Landroidx/fragment/app/y;

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    invoke-virtual {v1}, Landroidx/fragment/app/y;->i()V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    invoke-virtual {p2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_7

    .line 74
    .line 75
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Landroidx/fragment/app/y;

    .line 80
    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    invoke-virtual {v0}, Landroidx/fragment/app/y;->i()V

    .line 84
    .line 85
    .line 86
    iget-object v1, v0, Landroidx/fragment/app/y;->c:Landroidx/fragment/app/Fragment;

    .line 87
    .line 88
    iget-boolean v2, v1, Landroidx/fragment/app/Fragment;->mRemoving:Z

    .line 89
    .line 90
    if-eqz v2, :cond_5

    .line 91
    .line 92
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->isInBackStack()Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_5

    .line 97
    .line 98
    iget-boolean v2, v1, Landroidx/fragment/app/Fragment;->mBeingSaved:Z

    .line 99
    .line 100
    if-eqz v2, :cond_6

    .line 101
    .line 102
    iget-object v2, p1, Landroidx/fragment/app/z;->c:Ljava/util/HashMap;

    .line 103
    .line 104
    iget-object v3, v1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-nez v2, :cond_6

    .line 111
    .line 112
    iget-object v1, v1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v0}, Landroidx/fragment/app/y;->l()Landroid/os/Bundle;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {p1, v1, v2}, Landroidx/fragment/app/z;->i(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 119
    .line 120
    .line 121
    :cond_6
    invoke-virtual {p1, v0}, Landroidx/fragment/app/z;->h(Landroidx/fragment/app/y;)V

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_7
    invoke-virtual {p1}, Landroidx/fragment/app/z;->d()Ljava/util/ArrayList;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    :cond_8
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    const/4 v0, 0x0

    .line 138
    if-eqz p2, :cond_a

    .line 139
    .line 140
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    check-cast p2, Landroidx/fragment/app/y;

    .line 145
    .line 146
    iget-object v1, p2, Landroidx/fragment/app/y;->c:Landroidx/fragment/app/Fragment;

    .line 147
    .line 148
    iget-boolean v2, v1, Landroidx/fragment/app/Fragment;->mDeferStart:Z

    .line 149
    .line 150
    if-eqz v2, :cond_8

    .line 151
    .line 152
    iget-boolean v2, p0, Landroidx/fragment/app/w;->b:Z

    .line 153
    .line 154
    if-eqz v2, :cond_9

    .line 155
    .line 156
    const/4 p2, 0x1

    .line 157
    iput-boolean p2, p0, Landroidx/fragment/app/w;->J:Z

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_9
    iput-boolean v0, v1, Landroidx/fragment/app/Fragment;->mDeferStart:Z

    .line 161
    .line 162
    invoke-virtual {p2}, Landroidx/fragment/app/y;->i()V

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_a
    iget-boolean p1, p0, Landroidx/fragment/app/w;->F:Z

    .line 167
    .line 168
    if-eqz p1, :cond_b

    .line 169
    .line 170
    iget-object p1, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 171
    .line 172
    if-eqz p1, :cond_b

    .line 173
    .line 174
    iget p2, p0, Landroidx/fragment/app/w;->u:I

    .line 175
    .line 176
    const/4 v1, 0x7

    .line 177
    if-ne p2, v1, :cond_b

    .line 178
    .line 179
    check-cast p1, Landroidx/fragment/app/q;

    .line 180
    .line 181
    iget-object p1, p1, Landroidx/fragment/app/q;->e:Landroidx/fragment/app/FragmentActivity;

    .line 182
    .line 183
    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->invalidateMenu()V

    .line 184
    .line 185
    .line 186
    iput-boolean v0, p0, Landroidx/fragment/app/w;->F:Z

    .line 187
    .line 188
    :cond_b
    :goto_4
    return-void
.end method

.method public final P()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Landroidx/fragment/app/w;->G:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Landroidx/fragment/app/w;->H:Z

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/fragment/app/w;->N:Landroidx/fragment/app/x;

    .line 12
    .line 13
    iput-boolean v0, v1, Landroidx/fragment/app/x;->i:Z

    .line 14
    .line 15
    iget-object p0, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/z;->f()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->noteStateNotSaved()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    :goto_1
    return-void
.end method

.method public final Q()Z
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/w;->R(II)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final R(II)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroidx/fragment/app/w;->z(Z)Z

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v1}, Landroidx/fragment/app/w;->y(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v2, p0, Landroidx/fragment/app/w;->y:Landroidx/fragment/app/Fragment;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    if-gez p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/w;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Landroidx/fragment/app/w;->Q()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    return v1

    .line 26
    :cond_0
    iget-object v2, p0, Landroidx/fragment/app/w;->K:Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object v3, p0, Landroidx/fragment/app/w;->L:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {p0, v2, v3, p1, p2}, Landroidx/fragment/app/w;->S(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iput-boolean v1, p0, Landroidx/fragment/app/w;->b:Z

    .line 37
    .line 38
    :try_start_0
    iget-object p2, p0, Landroidx/fragment/app/w;->K:Ljava/util/ArrayList;

    .line 39
    .line 40
    iget-object v2, p0, Landroidx/fragment/app/w;->L:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {p0, p2, v2}, Landroidx/fragment/app/w;->U(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/w;->d()V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    invoke-virtual {p0}, Landroidx/fragment/app/w;->d()V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/w;->d0()V

    .line 55
    .line 56
    .line 57
    iget-boolean p2, p0, Landroidx/fragment/app/w;->J:Z

    .line 58
    .line 59
    iget-object v2, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 60
    .line 61
    if-eqz p2, :cond_4

    .line 62
    .line 63
    iput-boolean v0, p0, Landroidx/fragment/app/w;->J:Z

    .line 64
    .line 65
    invoke-virtual {v2}, Landroidx/fragment/app/z;->d()Ljava/util/ArrayList;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_4

    .line 78
    .line 79
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, Landroidx/fragment/app/y;

    .line 84
    .line 85
    iget-object v4, v3, Landroidx/fragment/app/y;->c:Landroidx/fragment/app/Fragment;

    .line 86
    .line 87
    iget-boolean v5, v4, Landroidx/fragment/app/Fragment;->mDeferStart:Z

    .line 88
    .line 89
    if-eqz v5, :cond_2

    .line 90
    .line 91
    iget-boolean v5, p0, Landroidx/fragment/app/w;->b:Z

    .line 92
    .line 93
    if-eqz v5, :cond_3

    .line 94
    .line 95
    iput-boolean v1, p0, Landroidx/fragment/app/w;->J:Z

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    iput-boolean v0, v4, Landroidx/fragment/app/Fragment;->mDeferStart:Z

    .line 99
    .line 100
    invoke-virtual {v3}, Landroidx/fragment/app/y;->i()V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    iget-object p0, v2, Landroidx/fragment/app/z;->b:Ljava/util/HashMap;

    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    const/4 p2, 0x0

    .line 111
    invoke-static {p2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-interface {p0, p2}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 116
    .line 117
    .line 118
    return p1
.end method

.method public final S(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p4, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move p4, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p4, v1

    .line 9
    :goto_0
    iget-object v2, p0, Landroidx/fragment/app/w;->d:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, -0x1

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    goto :goto_4

    .line 19
    :cond_1
    if-gez p3, :cond_3

    .line 20
    .line 21
    if-eqz p4, :cond_2

    .line 22
    .line 23
    move v3, v1

    .line 24
    goto :goto_4

    .line 25
    :cond_2
    iget-object p3, p0, Landroidx/fragment/app/w;->d:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    add-int/lit8 v3, p3, -0x1

    .line 32
    .line 33
    goto :goto_4

    .line 34
    :cond_3
    iget-object v2, p0, Landroidx/fragment/app/w;->d:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    sub-int/2addr v2, v0

    .line 41
    :goto_1
    if-ltz v2, :cond_5

    .line 42
    .line 43
    iget-object v4, p0, Landroidx/fragment/app/w;->d:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Landroidx/fragment/app/a;

    .line 50
    .line 51
    if-ltz p3, :cond_4

    .line 52
    .line 53
    iget v4, v4, Landroidx/fragment/app/a;->s:I

    .line 54
    .line 55
    if-ne p3, v4, :cond_4

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_4
    add-int/lit8 v2, v2, -0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_5
    :goto_2
    if-gez v2, :cond_6

    .line 62
    .line 63
    move v3, v2

    .line 64
    goto :goto_4

    .line 65
    :cond_6
    if-eqz p4, :cond_7

    .line 66
    .line 67
    move v3, v2

    .line 68
    :goto_3
    if-lez v3, :cond_9

    .line 69
    .line 70
    iget-object p4, p0, Landroidx/fragment/app/w;->d:Ljava/util/ArrayList;

    .line 71
    .line 72
    add-int/lit8 v2, v3, -0x1

    .line 73
    .line 74
    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p4

    .line 78
    check-cast p4, Landroidx/fragment/app/a;

    .line 79
    .line 80
    if-ltz p3, :cond_9

    .line 81
    .line 82
    iget p4, p4, Landroidx/fragment/app/a;->s:I

    .line 83
    .line 84
    if-ne p3, p4, :cond_9

    .line 85
    .line 86
    add-int/lit8 v3, v3, -0x1

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_7
    iget-object p3, p0, Landroidx/fragment/app/w;->d:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result p3

    .line 95
    sub-int/2addr p3, v0

    .line 96
    if-ne v2, p3, :cond_8

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_8
    add-int/lit8 v3, v2, 0x1

    .line 100
    .line 101
    :cond_9
    :goto_4
    if-gez v3, :cond_a

    .line 102
    .line 103
    return v1

    .line 104
    :cond_a
    iget-object p3, p0, Landroidx/fragment/app/w;->d:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    sub-int/2addr p3, v0

    .line 111
    :goto_5
    if-lt p3, v3, :cond_b

    .line 112
    .line 113
    iget-object p4, p0, Landroidx/fragment/app/w;->d:Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p4

    .line 119
    check-cast p4, Landroidx/fragment/app/a;

    .line 120
    .line 121
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 125
    .line 126
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    add-int/lit8 p3, p3, -0x1

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_b
    return v0
.end method

.method public final T(Landroidx/fragment/app/Fragment;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/w;->K(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->isInBackStack()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-boolean v1, p1, Landroidx/fragment/app/Fragment;->mDetached:Z

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return-void

    .line 23
    :cond_2
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 24
    .line 25
    iget-object v1, v0, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 26
    .line 27
    monitor-enter v1

    .line 28
    :try_start_0
    iget-object v0, v0, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    const/4 v0, 0x0

    .line 35
    iput-boolean v0, p1, Landroidx/fragment/app/Fragment;->mAdded:Z

    .line 36
    .line 37
    invoke-static {p1}, Landroidx/fragment/app/w;->L(Landroidx/fragment/app/Fragment;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v1, 0x1

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    iput-boolean v1, p0, Landroidx/fragment/app/w;->F:Z

    .line 45
    .line 46
    :cond_3
    iput-boolean v1, p1, Landroidx/fragment/app/Fragment;->mRemoving:Z

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Landroidx/fragment/app/w;->b0(Landroidx/fragment/app/Fragment;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    throw p0
.end method

.method public final U(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ne v0, v1, :cond_6

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    move v2, v1

    .line 24
    :goto_0
    if-ge v1, v0, :cond_4

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Landroidx/fragment/app/a;

    .line 31
    .line 32
    iget-boolean v3, v3, Landroidx/fragment/app/a;->p:Z

    .line 33
    .line 34
    if-nez v3, :cond_3

    .line 35
    .line 36
    if-eq v2, v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, p1, p2, v2, v1}, Landroidx/fragment/app/w;->B(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 39
    .line 40
    .line 41
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 42
    .line 43
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    :goto_1
    if-ge v2, v0, :cond_2

    .line 56
    .line 57
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Landroidx/fragment/app/a;

    .line 74
    .line 75
    iget-boolean v3, v3, Landroidx/fragment/app/a;->p:Z

    .line 76
    .line 77
    if-nez v3, :cond_2

    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {p0, p1, p2, v1, v2}, Landroidx/fragment/app/w;->B(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 83
    .line 84
    .line 85
    add-int/lit8 v1, v2, -0x1

    .line 86
    .line 87
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    if-eq v2, v0, :cond_5

    .line 91
    .line 92
    invoke-virtual {p0, p1, p2, v2, v0}, Landroidx/fragment/app/w;->B(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 93
    .line 94
    .line 95
    :cond_5
    :goto_2
    return-void

    .line 96
    :cond_6
    const-string p0, "Internal error with the back stack records"

    .line 97
    .line 98
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public final V(Landroid/os/Bundle;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ljava/lang/String;

    .line 24
    .line 25
    const-string v4, "result_"

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    iget-object v5, v0, Landroidx/fragment/app/w;->v:Lom0;

    .line 40
    .line 41
    iget-object v5, v5, Lom0;->b:Landroidx/fragment/app/FragmentActivity;

    .line 42
    .line 43
    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 48
    .line 49
    .line 50
    const/4 v5, 0x7

    .line 51
    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iget-object v5, v0, Landroidx/fragment/app/w;->l:Ljava/util/Map;

    .line 56
    .line 57
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    new-instance v2, Ljava/util/HashMap;

    .line 62
    .line 63
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_3

    .line 79
    .line 80
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Ljava/lang/String;

    .line 85
    .line 86
    const-string v5, "fragment_"

    .line 87
    .line 88
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_2

    .line 93
    .line 94
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    if-eqz v5, :cond_2

    .line 99
    .line 100
    iget-object v6, v0, Landroidx/fragment/app/w;->v:Lom0;

    .line 101
    .line 102
    iget-object v6, v6, Lom0;->b:Landroidx/fragment/app/FragmentActivity;

    .line 103
    .line 104
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v5, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 109
    .line 110
    .line 111
    const/16 v6, 0x9

    .line 112
    .line 113
    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    iget-object v3, v0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 122
    .line 123
    iget-object v4, v3, Landroidx/fragment/app/z;->c:Ljava/util/HashMap;

    .line 124
    .line 125
    iget-object v5, v3, Landroidx/fragment/app/z;->b:Ljava/util/HashMap;

    .line 126
    .line 127
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 131
    .line 132
    .line 133
    const-string v2, "state"

    .line 134
    .line 135
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    check-cast v1, Landroidx/fragment/app/FragmentManagerState;

    .line 140
    .line 141
    if-nez v1, :cond_4

    .line 142
    .line 143
    return-void

    .line 144
    :cond_4
    invoke-virtual {v5}, Ljava/util/HashMap;->clear()V

    .line 145
    .line 146
    .line 147
    iget-object v4, v1, Landroidx/fragment/app/FragmentManagerState;->a:Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    :cond_5
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    iget-object v7, v0, Landroidx/fragment/app/w;->n:Lwc0;

    .line 158
    .line 159
    const/4 v8, 0x2

    .line 160
    if-eqz v6, :cond_9

    .line 161
    .line 162
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    check-cast v6, Ljava/lang/String;

    .line 167
    .line 168
    const/4 v9, 0x0

    .line 169
    invoke-virtual {v3, v6, v9}, Landroidx/fragment/app/z;->i(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 170
    .line 171
    .line 172
    move-result-object v15

    .line 173
    if-eqz v15, :cond_5

    .line 174
    .line 175
    invoke-virtual {v15, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    check-cast v6, Landroidx/fragment/app/FragmentState;

    .line 180
    .line 181
    iget-object v9, v0, Landroidx/fragment/app/w;->N:Landroidx/fragment/app/x;

    .line 182
    .line 183
    iget-object v6, v6, Landroidx/fragment/app/FragmentState;->b:Ljava/lang/String;

    .line 184
    .line 185
    iget-object v9, v9, Landroidx/fragment/app/x;->d:Ljava/util/HashMap;

    .line 186
    .line 187
    invoke-virtual {v9, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    check-cast v6, Landroidx/fragment/app/Fragment;

    .line 192
    .line 193
    if-eqz v6, :cond_7

    .line 194
    .line 195
    invoke-static {v8}, Landroidx/fragment/app/w;->K(I)Z

    .line 196
    .line 197
    .line 198
    move-result v9

    .line 199
    if-eqz v9, :cond_6

    .line 200
    .line 201
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    :cond_6
    new-instance v9, Landroidx/fragment/app/y;

    .line 205
    .line 206
    invoke-direct {v9, v7, v3, v6, v15}, Landroidx/fragment/app/y;-><init>(Lwc0;Landroidx/fragment/app/z;Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V

    .line 207
    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_7
    new-instance v10, Landroidx/fragment/app/y;

    .line 211
    .line 212
    iget-object v6, v0, Landroidx/fragment/app/w;->v:Lom0;

    .line 213
    .line 214
    iget-object v6, v6, Lom0;->b:Landroidx/fragment/app/FragmentActivity;

    .line 215
    .line 216
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 217
    .line 218
    .line 219
    move-result-object v13

    .line 220
    invoke-virtual {v0}, Landroidx/fragment/app/w;->I()Lrm0;

    .line 221
    .line 222
    .line 223
    move-result-object v14

    .line 224
    iget-object v11, v0, Landroidx/fragment/app/w;->n:Lwc0;

    .line 225
    .line 226
    iget-object v12, v0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 227
    .line 228
    invoke-direct/range {v10 .. v15}, Landroidx/fragment/app/y;-><init>(Lwc0;Landroidx/fragment/app/z;Ljava/lang/ClassLoader;Lrm0;Landroid/os/Bundle;)V

    .line 229
    .line 230
    .line 231
    move-object v9, v10

    .line 232
    :goto_3
    iget-object v6, v9, Landroidx/fragment/app/y;->c:Landroidx/fragment/app/Fragment;

    .line 233
    .line 234
    iput-object v15, v6, Landroidx/fragment/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;

    .line 235
    .line 236
    iput-object v0, v6, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/w;

    .line 237
    .line 238
    invoke-static {v8}, Landroidx/fragment/app/w;->K(I)Z

    .line 239
    .line 240
    .line 241
    move-result v7

    .line 242
    if-eqz v7, :cond_8

    .line 243
    .line 244
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    :cond_8
    iget-object v6, v0, Landroidx/fragment/app/w;->v:Lom0;

    .line 248
    .line 249
    iget-object v6, v6, Lom0;->b:Landroidx/fragment/app/FragmentActivity;

    .line 250
    .line 251
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 252
    .line 253
    .line 254
    move-result-object v6

    .line 255
    invoke-virtual {v9, v6}, Landroidx/fragment/app/y;->j(Ljava/lang/ClassLoader;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v3, v9}, Landroidx/fragment/app/z;->g(Landroidx/fragment/app/y;)V

    .line 259
    .line 260
    .line 261
    iget v6, v0, Landroidx/fragment/app/w;->u:I

    .line 262
    .line 263
    iput v6, v9, Landroidx/fragment/app/y;->e:I

    .line 264
    .line 265
    goto :goto_2

    .line 266
    :cond_9
    iget-object v2, v0, Landroidx/fragment/app/w;->N:Landroidx/fragment/app/x;

    .line 267
    .line 268
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    new-instance v4, Ljava/util/ArrayList;

    .line 272
    .line 273
    iget-object v2, v2, Landroidx/fragment/app/x;->d:Ljava/util/HashMap;

    .line 274
    .line 275
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    const/4 v6, 0x1

    .line 291
    if-eqz v4, :cond_c

    .line 292
    .line 293
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    check-cast v4, Landroidx/fragment/app/Fragment;

    .line 298
    .line 299
    iget-object v9, v4, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 300
    .line 301
    invoke-virtual {v5, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v9

    .line 305
    if-eqz v9, :cond_a

    .line 306
    .line 307
    goto :goto_4

    .line 308
    :cond_a
    invoke-static {v8}, Landroidx/fragment/app/w;->K(I)Z

    .line 309
    .line 310
    .line 311
    move-result v9

    .line 312
    if-eqz v9, :cond_b

    .line 313
    .line 314
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    iget-object v9, v1, Landroidx/fragment/app/FragmentManagerState;->a:Ljava/util/ArrayList;

    .line 318
    .line 319
    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    :cond_b
    iget-object v9, v0, Landroidx/fragment/app/w;->N:Landroidx/fragment/app/x;

    .line 323
    .line 324
    invoke-virtual {v9, v4}, Landroidx/fragment/app/x;->e(Landroidx/fragment/app/Fragment;)V

    .line 325
    .line 326
    .line 327
    iput-object v0, v4, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/w;

    .line 328
    .line 329
    new-instance v9, Landroidx/fragment/app/y;

    .line 330
    .line 331
    invoke-direct {v9, v7, v3, v4}, Landroidx/fragment/app/y;-><init>(Lwc0;Landroidx/fragment/app/z;Landroidx/fragment/app/Fragment;)V

    .line 332
    .line 333
    .line 334
    iput v6, v9, Landroidx/fragment/app/y;->e:I

    .line 335
    .line 336
    invoke-virtual {v9}, Landroidx/fragment/app/y;->i()V

    .line 337
    .line 338
    .line 339
    iput-boolean v6, v4, Landroidx/fragment/app/Fragment;->mRemoving:Z

    .line 340
    .line 341
    invoke-virtual {v9}, Landroidx/fragment/app/y;->i()V

    .line 342
    .line 343
    .line 344
    goto :goto_4

    .line 345
    :cond_c
    iget-object v2, v1, Landroidx/fragment/app/FragmentManagerState;->b:Ljava/util/ArrayList;

    .line 346
    .line 347
    iget-object v4, v3, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 348
    .line 349
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 350
    .line 351
    .line 352
    if-eqz v2, :cond_f

    .line 353
    .line 354
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 359
    .line 360
    .line 361
    move-result v4

    .line 362
    if-eqz v4, :cond_f

    .line 363
    .line 364
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    check-cast v4, Ljava/lang/String;

    .line 369
    .line 370
    invoke-virtual {v3, v4}, Landroidx/fragment/app/z;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 371
    .line 372
    .line 373
    move-result-object v5

    .line 374
    if-eqz v5, :cond_e

    .line 375
    .line 376
    invoke-static {v8}, Landroidx/fragment/app/w;->K(I)Z

    .line 377
    .line 378
    .line 379
    move-result v4

    .line 380
    if-eqz v4, :cond_d

    .line 381
    .line 382
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    :cond_d
    invoke-virtual {v3, v5}, Landroidx/fragment/app/z;->a(Landroidx/fragment/app/Fragment;)V

    .line 386
    .line 387
    .line 388
    goto :goto_5

    .line 389
    :cond_e
    const-string v0, "No instantiated fragment for ("

    .line 390
    .line 391
    const-string v1, ")"

    .line 392
    .line 393
    invoke-static {v0, v4, v1}, Lfm0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-static {v0}, Lf42;->l(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    return-void

    .line 401
    :cond_f
    iget-object v2, v1, Landroidx/fragment/app/FragmentManagerState;->c:[Landroidx/fragment/app/BackStackRecordState;

    .line 402
    .line 403
    if-eqz v2, :cond_17

    .line 404
    .line 405
    new-instance v2, Ljava/util/ArrayList;

    .line 406
    .line 407
    iget-object v5, v1, Landroidx/fragment/app/FragmentManagerState;->c:[Landroidx/fragment/app/BackStackRecordState;

    .line 408
    .line 409
    array-length v5, v5

    .line 410
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 411
    .line 412
    .line 413
    iput-object v2, v0, Landroidx/fragment/app/w;->d:Ljava/util/ArrayList;

    .line 414
    .line 415
    const/4 v2, 0x0

    .line 416
    :goto_6
    iget-object v5, v1, Landroidx/fragment/app/FragmentManagerState;->c:[Landroidx/fragment/app/BackStackRecordState;

    .line 417
    .line 418
    array-length v7, v5

    .line 419
    if-ge v2, v7, :cond_16

    .line 420
    .line 421
    aget-object v5, v5, v2

    .line 422
    .line 423
    iget-object v7, v5, Landroidx/fragment/app/BackStackRecordState;->b:Ljava/util/ArrayList;

    .line 424
    .line 425
    new-instance v9, Landroidx/fragment/app/a;

    .line 426
    .line 427
    invoke-direct {v9, v0}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/w;)V

    .line 428
    .line 429
    .line 430
    iget-object v10, v5, Landroidx/fragment/app/BackStackRecordState;->a:[I

    .line 431
    .line 432
    const/4 v11, 0x0

    .line 433
    const/4 v12, 0x0

    .line 434
    :goto_7
    array-length v13, v10

    .line 435
    if-ge v11, v13, :cond_12

    .line 436
    .line 437
    new-instance v13, Ldn0;

    .line 438
    .line 439
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 440
    .line 441
    .line 442
    add-int/lit8 v14, v11, 0x1

    .line 443
    .line 444
    aget v15, v10, v11

    .line 445
    .line 446
    iput v15, v13, Ldn0;->a:I

    .line 447
    .line 448
    invoke-static {v8}, Landroidx/fragment/app/w;->K(I)Z

    .line 449
    .line 450
    .line 451
    move-result v15

    .line 452
    if-eqz v15, :cond_10

    .line 453
    .line 454
    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    aget v15, v10, v14

    .line 458
    .line 459
    :cond_10
    invoke-static {}, Lu61;->values()[Lu61;

    .line 460
    .line 461
    .line 462
    move-result-object v15

    .line 463
    move/from16 p1, v8

    .line 464
    .line 465
    iget-object v8, v5, Landroidx/fragment/app/BackStackRecordState;->c:[I

    .line 466
    .line 467
    aget v8, v8, v12

    .line 468
    .line 469
    aget-object v8, v15, v8

    .line 470
    .line 471
    iput-object v8, v13, Ldn0;->h:Lu61;

    .line 472
    .line 473
    invoke-static {}, Lu61;->values()[Lu61;

    .line 474
    .line 475
    .line 476
    move-result-object v8

    .line 477
    iget-object v15, v5, Landroidx/fragment/app/BackStackRecordState;->d:[I

    .line 478
    .line 479
    aget v15, v15, v12

    .line 480
    .line 481
    aget-object v8, v8, v15

    .line 482
    .line 483
    iput-object v8, v13, Ldn0;->i:Lu61;

    .line 484
    .line 485
    add-int/lit8 v8, v11, 0x2

    .line 486
    .line 487
    aget v14, v10, v14

    .line 488
    .line 489
    if-eqz v14, :cond_11

    .line 490
    .line 491
    move v14, v6

    .line 492
    goto :goto_8

    .line 493
    :cond_11
    const/4 v14, 0x0

    .line 494
    :goto_8
    iput-boolean v14, v13, Ldn0;->c:Z

    .line 495
    .line 496
    add-int/lit8 v14, v11, 0x3

    .line 497
    .line 498
    aget v8, v10, v8

    .line 499
    .line 500
    iput v8, v13, Ldn0;->d:I

    .line 501
    .line 502
    add-int/lit8 v15, v11, 0x4

    .line 503
    .line 504
    aget v14, v10, v14

    .line 505
    .line 506
    iput v14, v13, Ldn0;->e:I

    .line 507
    .line 508
    add-int/lit8 v16, v11, 0x5

    .line 509
    .line 510
    aget v15, v10, v15

    .line 511
    .line 512
    iput v15, v13, Ldn0;->f:I

    .line 513
    .line 514
    add-int/lit8 v11, v11, 0x6

    .line 515
    .line 516
    aget v4, v10, v16

    .line 517
    .line 518
    iput v4, v13, Ldn0;->g:I

    .line 519
    .line 520
    iput v8, v9, Landroidx/fragment/app/a;->b:I

    .line 521
    .line 522
    iput v14, v9, Landroidx/fragment/app/a;->c:I

    .line 523
    .line 524
    iput v15, v9, Landroidx/fragment/app/a;->d:I

    .line 525
    .line 526
    iput v4, v9, Landroidx/fragment/app/a;->e:I

    .line 527
    .line 528
    invoke-virtual {v9, v13}, Landroidx/fragment/app/a;->b(Ldn0;)V

    .line 529
    .line 530
    .line 531
    add-int/lit8 v12, v12, 0x1

    .line 532
    .line 533
    move/from16 v8, p1

    .line 534
    .line 535
    goto :goto_7

    .line 536
    :cond_12
    move/from16 p1, v8

    .line 537
    .line 538
    iget v4, v5, Landroidx/fragment/app/BackStackRecordState;->e:I

    .line 539
    .line 540
    iput v4, v9, Landroidx/fragment/app/a;->f:I

    .line 541
    .line 542
    iget-object v4, v5, Landroidx/fragment/app/BackStackRecordState;->f:Ljava/lang/String;

    .line 543
    .line 544
    iput-object v4, v9, Landroidx/fragment/app/a;->i:Ljava/lang/String;

    .line 545
    .line 546
    iput-boolean v6, v9, Landroidx/fragment/app/a;->g:Z

    .line 547
    .line 548
    iget v4, v5, Landroidx/fragment/app/BackStackRecordState;->v:I

    .line 549
    .line 550
    iput v4, v9, Landroidx/fragment/app/a;->j:I

    .line 551
    .line 552
    iget-object v4, v5, Landroidx/fragment/app/BackStackRecordState;->w:Ljava/lang/CharSequence;

    .line 553
    .line 554
    iput-object v4, v9, Landroidx/fragment/app/a;->k:Ljava/lang/CharSequence;

    .line 555
    .line 556
    iget v4, v5, Landroidx/fragment/app/BackStackRecordState;->U:I

    .line 557
    .line 558
    iput v4, v9, Landroidx/fragment/app/a;->l:I

    .line 559
    .line 560
    iget-object v4, v5, Landroidx/fragment/app/BackStackRecordState;->V:Ljava/lang/CharSequence;

    .line 561
    .line 562
    iput-object v4, v9, Landroidx/fragment/app/a;->m:Ljava/lang/CharSequence;

    .line 563
    .line 564
    iget-object v4, v5, Landroidx/fragment/app/BackStackRecordState;->W:Ljava/util/ArrayList;

    .line 565
    .line 566
    iput-object v4, v9, Landroidx/fragment/app/a;->n:Ljava/util/ArrayList;

    .line 567
    .line 568
    iget-object v4, v5, Landroidx/fragment/app/BackStackRecordState;->X:Ljava/util/ArrayList;

    .line 569
    .line 570
    iput-object v4, v9, Landroidx/fragment/app/a;->o:Ljava/util/ArrayList;

    .line 571
    .line 572
    iget-boolean v4, v5, Landroidx/fragment/app/BackStackRecordState;->Y:Z

    .line 573
    .line 574
    iput-boolean v4, v9, Landroidx/fragment/app/a;->p:Z

    .line 575
    .line 576
    iget v4, v5, Landroidx/fragment/app/BackStackRecordState;->i:I

    .line 577
    .line 578
    iput v4, v9, Landroidx/fragment/app/a;->s:I

    .line 579
    .line 580
    const/4 v4, 0x0

    .line 581
    :goto_9
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 582
    .line 583
    .line 584
    move-result v5

    .line 585
    if-ge v4, v5, :cond_14

    .line 586
    .line 587
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v5

    .line 591
    check-cast v5, Ljava/lang/String;

    .line 592
    .line 593
    if-eqz v5, :cond_13

    .line 594
    .line 595
    iget-object v8, v9, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 596
    .line 597
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v8

    .line 601
    check-cast v8, Ldn0;

    .line 602
    .line 603
    invoke-virtual {v3, v5}, Landroidx/fragment/app/z;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 604
    .line 605
    .line 606
    move-result-object v5

    .line 607
    iput-object v5, v8, Ldn0;->b:Landroidx/fragment/app/Fragment;

    .line 608
    .line 609
    :cond_13
    add-int/lit8 v4, v4, 0x1

    .line 610
    .line 611
    goto :goto_9

    .line 612
    :cond_14
    invoke-virtual {v9, v6}, Landroidx/fragment/app/a;->c(I)V

    .line 613
    .line 614
    .line 615
    invoke-static/range {p1 .. p1}, Landroidx/fragment/app/w;->K(I)Z

    .line 616
    .line 617
    .line 618
    move-result v4

    .line 619
    if-eqz v4, :cond_15

    .line 620
    .line 621
    invoke-virtual {v9}, Landroidx/fragment/app/a;->toString()Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    new-instance v4, Lga1;

    .line 625
    .line 626
    invoke-direct {v4}, Lga1;-><init>()V

    .line 627
    .line 628
    .line 629
    new-instance v5, Ljava/io/PrintWriter;

    .line 630
    .line 631
    invoke-direct {v5, v4}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 632
    .line 633
    .line 634
    const-string v4, "  "

    .line 635
    .line 636
    const/4 v7, 0x0

    .line 637
    invoke-virtual {v9, v4, v5, v7}, Landroidx/fragment/app/a;->f(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 638
    .line 639
    .line 640
    invoke-virtual {v5}, Ljava/io/PrintWriter;->close()V

    .line 641
    .line 642
    .line 643
    goto :goto_a

    .line 644
    :cond_15
    const/4 v7, 0x0

    .line 645
    :goto_a
    iget-object v4, v0, Landroidx/fragment/app/w;->d:Ljava/util/ArrayList;

    .line 646
    .line 647
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 648
    .line 649
    .line 650
    add-int/lit8 v2, v2, 0x1

    .line 651
    .line 652
    move/from16 v8, p1

    .line 653
    .line 654
    goto/16 :goto_6

    .line 655
    .line 656
    :cond_16
    const/4 v7, 0x0

    .line 657
    goto :goto_b

    .line 658
    :cond_17
    const/4 v7, 0x0

    .line 659
    new-instance v2, Ljava/util/ArrayList;

    .line 660
    .line 661
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 662
    .line 663
    .line 664
    iput-object v2, v0, Landroidx/fragment/app/w;->d:Ljava/util/ArrayList;

    .line 665
    .line 666
    :goto_b
    iget-object v2, v0, Landroidx/fragment/app/w;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 667
    .line 668
    iget v4, v1, Landroidx/fragment/app/FragmentManagerState;->d:I

    .line 669
    .line 670
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 671
    .line 672
    .line 673
    iget-object v2, v1, Landroidx/fragment/app/FragmentManagerState;->e:Ljava/lang/String;

    .line 674
    .line 675
    if-eqz v2, :cond_18

    .line 676
    .line 677
    invoke-virtual {v3, v2}, Landroidx/fragment/app/z;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 678
    .line 679
    .line 680
    move-result-object v2

    .line 681
    iput-object v2, v0, Landroidx/fragment/app/w;->y:Landroidx/fragment/app/Fragment;

    .line 682
    .line 683
    invoke-virtual {v0, v2}, Landroidx/fragment/app/w;->r(Landroidx/fragment/app/Fragment;)V

    .line 684
    .line 685
    .line 686
    :cond_18
    iget-object v2, v1, Landroidx/fragment/app/FragmentManagerState;->f:Ljava/util/ArrayList;

    .line 687
    .line 688
    if-eqz v2, :cond_19

    .line 689
    .line 690
    move v4, v7

    .line 691
    :goto_c
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 692
    .line 693
    .line 694
    move-result v3

    .line 695
    if-ge v4, v3, :cond_19

    .line 696
    .line 697
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v3

    .line 701
    check-cast v3, Ljava/lang/String;

    .line 702
    .line 703
    iget-object v5, v1, Landroidx/fragment/app/FragmentManagerState;->i:Ljava/util/ArrayList;

    .line 704
    .line 705
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    move-result-object v5

    .line 709
    check-cast v5, Landroidx/fragment/app/BackStackState;

    .line 710
    .line 711
    iget-object v6, v0, Landroidx/fragment/app/w;->k:Ljava/util/Map;

    .line 712
    .line 713
    invoke-interface {v6, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    add-int/lit8 v4, v4, 0x1

    .line 717
    .line 718
    goto :goto_c

    .line 719
    :cond_19
    new-instance v2, Ljava/util/ArrayDeque;

    .line 720
    .line 721
    iget-object v1, v1, Landroidx/fragment/app/FragmentManagerState;->v:Ljava/util/ArrayList;

    .line 722
    .line 723
    invoke-direct {v2, v1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 724
    .line 725
    .line 726
    iput-object v2, v0, Landroidx/fragment/app/w;->E:Ljava/util/ArrayDeque;

    .line 727
    .line 728
    return-void
.end method

.method public final W()Landroid/os/Bundle;
    .locals 11

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/w;->E()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/w;->w()V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {p0, v1}, Landroidx/fragment/app/w;->z(Z)Z

    .line 14
    .line 15
    .line 16
    iput-boolean v1, p0, Landroidx/fragment/app/w;->G:Z

    .line 17
    .line 18
    iget-object v2, p0, Landroidx/fragment/app/w;->N:Landroidx/fragment/app/x;

    .line 19
    .line 20
    iput-boolean v1, v2, Landroidx/fragment/app/x;->i:Z

    .line 21
    .line 22
    iget-object v1, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v2, Ljava/util/ArrayList;

    .line 28
    .line 29
    iget-object v3, v1, Landroidx/fragment/app/z;->b:Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    const/4 v5, 0x2

    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    check-cast v4, Landroidx/fragment/app/y;

    .line 58
    .line 59
    if-eqz v4, :cond_0

    .line 60
    .line 61
    iget-object v6, v4, Landroidx/fragment/app/y;->c:Landroidx/fragment/app/Fragment;

    .line 62
    .line 63
    iget-object v7, v6, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v4}, Landroidx/fragment/app/y;->l()Landroid/os/Bundle;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v1, v7, v4}, Landroidx/fragment/app/z;->i(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 70
    .line 71
    .line 72
    iget-object v4, v6, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    invoke-static {v5}, Landroidx/fragment/app/w;->K(I)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_0

    .line 82
    .line 83
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    iget-object v4, v6, Landroidx/fragment/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;

    .line 87
    .line 88
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    iget-object v1, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 93
    .line 94
    iget-object v1, v1, Landroidx/fragment/app/z;->c:Ljava/util/HashMap;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-eqz v3, :cond_2

    .line 101
    .line 102
    goto/16 :goto_6

    .line 103
    .line 104
    :cond_2
    iget-object v3, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 105
    .line 106
    iget-object v4, v3, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 107
    .line 108
    monitor-enter v4

    .line 109
    :try_start_0
    iget-object v6, v3, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    const/4 v7, 0x0

    .line 116
    if-eqz v6, :cond_3

    .line 117
    .line 118
    monitor-exit v4

    .line 119
    move-object v6, v7

    .line 120
    goto :goto_2

    .line 121
    :catchall_0
    move-exception p0

    .line 122
    goto/16 :goto_7

    .line 123
    .line 124
    :cond_3
    new-instance v6, Ljava/util/ArrayList;

    .line 125
    .line 126
    iget-object v8, v3, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 133
    .line 134
    .line 135
    iget-object v3, v3, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 136
    .line 137
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    :cond_4
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    if-eqz v8, :cond_5

    .line 146
    .line 147
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    check-cast v8, Landroidx/fragment/app/Fragment;

    .line 152
    .line 153
    iget-object v9, v8, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    invoke-static {v5}, Landroidx/fragment/app/w;->K(I)Z

    .line 159
    .line 160
    .line 161
    move-result v9

    .line 162
    if-eqz v9, :cond_4

    .line 163
    .line 164
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_5
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    :goto_2
    iget-object v3, p0, Landroidx/fragment/app/w;->d:Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-lez v3, :cond_7

    .line 176
    .line 177
    new-array v4, v3, [Landroidx/fragment/app/BackStackRecordState;

    .line 178
    .line 179
    const/4 v8, 0x0

    .line 180
    :goto_3
    if-ge v8, v3, :cond_8

    .line 181
    .line 182
    new-instance v9, Landroidx/fragment/app/BackStackRecordState;

    .line 183
    .line 184
    iget-object v10, p0, Landroidx/fragment/app/w;->d:Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v10

    .line 190
    check-cast v10, Landroidx/fragment/app/a;

    .line 191
    .line 192
    invoke-direct {v9, v10}, Landroidx/fragment/app/BackStackRecordState;-><init>(Landroidx/fragment/app/a;)V

    .line 193
    .line 194
    .line 195
    aput-object v9, v4, v8

    .line 196
    .line 197
    invoke-static {v5}, Landroidx/fragment/app/w;->K(I)Z

    .line 198
    .line 199
    .line 200
    move-result v9

    .line 201
    if-eqz v9, :cond_6

    .line 202
    .line 203
    iget-object v9, p0, Landroidx/fragment/app/w;->d:Ljava/util/ArrayList;

    .line 204
    .line 205
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v9

    .line 209
    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    :cond_6
    add-int/lit8 v8, v8, 0x1

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_7
    move-object v4, v7

    .line 216
    :cond_8
    new-instance v3, Landroidx/fragment/app/FragmentManagerState;

    .line 217
    .line 218
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 219
    .line 220
    .line 221
    iput-object v7, v3, Landroidx/fragment/app/FragmentManagerState;->e:Ljava/lang/String;

    .line 222
    .line 223
    new-instance v5, Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 226
    .line 227
    .line 228
    iput-object v5, v3, Landroidx/fragment/app/FragmentManagerState;->f:Ljava/util/ArrayList;

    .line 229
    .line 230
    new-instance v7, Ljava/util/ArrayList;

    .line 231
    .line 232
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 233
    .line 234
    .line 235
    iput-object v7, v3, Landroidx/fragment/app/FragmentManagerState;->i:Ljava/util/ArrayList;

    .line 236
    .line 237
    iput-object v2, v3, Landroidx/fragment/app/FragmentManagerState;->a:Ljava/util/ArrayList;

    .line 238
    .line 239
    iput-object v6, v3, Landroidx/fragment/app/FragmentManagerState;->b:Ljava/util/ArrayList;

    .line 240
    .line 241
    iput-object v4, v3, Landroidx/fragment/app/FragmentManagerState;->c:[Landroidx/fragment/app/BackStackRecordState;

    .line 242
    .line 243
    iget-object v2, p0, Landroidx/fragment/app/w;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 244
    .line 245
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    iput v2, v3, Landroidx/fragment/app/FragmentManagerState;->d:I

    .line 250
    .line 251
    iget-object v2, p0, Landroidx/fragment/app/w;->y:Landroidx/fragment/app/Fragment;

    .line 252
    .line 253
    if-eqz v2, :cond_9

    .line 254
    .line 255
    iget-object v2, v2, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 256
    .line 257
    iput-object v2, v3, Landroidx/fragment/app/FragmentManagerState;->e:Ljava/lang/String;

    .line 258
    .line 259
    :cond_9
    iget-object v2, p0, Landroidx/fragment/app/w;->k:Ljava/util/Map;

    .line 260
    .line 261
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 266
    .line 267
    .line 268
    iget-object v2, p0, Landroidx/fragment/app/w;->k:Ljava/util/Map;

    .line 269
    .line 270
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 275
    .line 276
    .line 277
    new-instance v2, Ljava/util/ArrayList;

    .line 278
    .line 279
    iget-object v4, p0, Landroidx/fragment/app/w;->E:Ljava/util/ArrayDeque;

    .line 280
    .line 281
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 282
    .line 283
    .line 284
    iput-object v2, v3, Landroidx/fragment/app/FragmentManagerState;->v:Ljava/util/ArrayList;

    .line 285
    .line 286
    const-string v2, "state"

    .line 287
    .line 288
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 289
    .line 290
    .line 291
    iget-object v2, p0, Landroidx/fragment/app/w;->l:Ljava/util/Map;

    .line 292
    .line 293
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    if-eqz v3, :cond_a

    .line 306
    .line 307
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    check-cast v3, Ljava/lang/String;

    .line 312
    .line 313
    const-string v4, "result_"

    .line 314
    .line 315
    invoke-static {v4, v3}, Len;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    iget-object v5, p0, Landroidx/fragment/app/w;->l:Ljava/util/Map;

    .line 320
    .line 321
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    check-cast v3, Landroid/os/Bundle;

    .line 326
    .line 327
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 328
    .line 329
    .line 330
    goto :goto_4

    .line 331
    :cond_a
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 336
    .line 337
    .line 338
    move-result-object p0

    .line 339
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    if-eqz v2, :cond_b

    .line 344
    .line 345
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    check-cast v2, Ljava/lang/String;

    .line 350
    .line 351
    const-string v3, "fragment_"

    .line 352
    .line 353
    invoke-static {v3, v2}, Len;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    check-cast v2, Landroid/os/Bundle;

    .line 362
    .line 363
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 364
    .line 365
    .line 366
    goto :goto_5

    .line 367
    :cond_b
    :goto_6
    return-object v0

    .line 368
    :goto_7
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 369
    throw p0
.end method

.method public final X()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/w;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/w;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 14
    .line 15
    iget-object v1, v1, Lom0;->c:Landroid/os/Handler;

    .line 16
    .line 17
    iget-object v2, p0, Landroidx/fragment/app/w;->O:Lye;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 23
    .line 24
    iget-object v1, v1, Lom0;->c:Landroid/os/Handler;

    .line 25
    .line 26
    iget-object v2, p0, Landroidx/fragment/app/w;->O:Lye;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/w;->d0()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    monitor-exit v0

    .line 38
    return-void

    .line 39
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw p0
.end method

.method public final Y(Landroidx/fragment/app/Fragment;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/w;->H(Landroidx/fragment/app/Fragment;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    instance-of p1, p0, Landroidx/fragment/app/FragmentContainerView;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    check-cast p0, Landroidx/fragment/app/FragmentContainerView;

    .line 12
    .line 13
    xor-int/lit8 p1, p2, 0x1

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentContainerView;->setDrawDisappearingViewsLast(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final Z(Landroidx/fragment/app/Fragment;Lu61;)V
    .locals 2

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Landroidx/fragment/app/z;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mHost:Lom0;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/w;

    .line 20
    .line 21
    if-ne v0, p0, :cond_1

    .line 22
    .line 23
    :cond_0
    iput-object p2, p1, Landroidx/fragment/app/Fragment;->mMaxState:Lu61;

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const-string p2, "Fragment "

    .line 27
    .line 28
    const-string v0, " is not an active fragment of FragmentManager "

    .line 29
    .line 30
    invoke-static {p2, p1, v0, p0}, Lds0;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final a(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/y;
    .locals 3

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mPreviousWho:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1, v0}, Lbn0;->d(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x2

    .line 9
    invoke-static {v0}, Landroidx/fragment/app/w;->K(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    :cond_1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/w;->g(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/y;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object p0, p1, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/w;

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Landroidx/fragment/app/z;->g(Landroidx/fragment/app/y;)V

    .line 27
    .line 28
    .line 29
    iget-boolean v2, p1, Landroidx/fragment/app/Fragment;->mDetached:Z

    .line 30
    .line 31
    if-nez v2, :cond_3

    .line 32
    .line 33
    invoke-virtual {v1, p1}, Landroidx/fragment/app/z;->a(Landroidx/fragment/app/Fragment;)V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    iput-boolean v1, p1, Landroidx/fragment/app/Fragment;->mRemoving:Z

    .line 38
    .line 39
    iget-object v2, p1, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 40
    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    iput-boolean v1, p1, Landroidx/fragment/app/Fragment;->mHiddenChanged:Z

    .line 44
    .line 45
    :cond_2
    invoke-static {p1}, Landroidx/fragment/app/w;->L(Landroidx/fragment/app/Fragment;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    iput-boolean p1, p0, Landroidx/fragment/app/w;->F:Z

    .line 53
    .line 54
    :cond_3
    return-object v0
.end method

.method public final a0(Landroidx/fragment/app/Fragment;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroidx/fragment/app/z;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mHost:Lom0;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/w;

    .line 22
    .line 23
    if-ne v0, p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v0, "Fragment "

    .line 27
    .line 28
    const-string v1, " is not an active fragment of FragmentManager "

    .line 29
    .line 30
    invoke-static {v0, p1, v1, p0}, Lds0;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/w;->y:Landroidx/fragment/app/Fragment;

    .line 35
    .line 36
    iput-object p1, p0, Landroidx/fragment/app/w;->y:Landroidx/fragment/app/Fragment;

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Landroidx/fragment/app/w;->r(Landroidx/fragment/app/Fragment;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Landroidx/fragment/app/w;->y:Landroidx/fragment/app/Fragment;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Landroidx/fragment/app/w;->r(Landroidx/fragment/app/Fragment;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final b(Lom0;Lmm0;Landroidx/fragment/app/Fragment;)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 2
    .line 3
    if-nez v0, :cond_13

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 6
    .line 7
    iput-object p2, p0, Landroidx/fragment/app/w;->w:Lmm0;

    .line 8
    .line 9
    iput-object p3, p0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 10
    .line 11
    iget-object p2, p0, Landroidx/fragment/app/w;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    new-instance v0, Lsm0;

    .line 16
    .line 17
    invoke-direct {v0, p3}, Lsm0;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    instance-of v0, p1, Lxm0;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    move-object v0, p1

    .line 29
    check-cast v0, Lxm0;

    .line 30
    .line 31
    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    iget-object p2, p0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 35
    .line 36
    if-eqz p2, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/fragment/app/w;->d0()V

    .line 39
    .line 40
    .line 41
    :cond_2
    instance-of p2, p1, Ltp1;

    .line 42
    .line 43
    if-eqz p2, :cond_4

    .line 44
    .line 45
    move-object p2, p1

    .line 46
    check-cast p2, Ltp1;

    .line 47
    .line 48
    invoke-interface {p2}, Ltp1;->getOnBackPressedDispatcher()Lsp1;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Landroidx/fragment/app/w;->g:Lsp1;

    .line 53
    .line 54
    if-eqz p3, :cond_3

    .line 55
    .line 56
    move-object p2, p3

    .line 57
    :cond_3
    iget-object v1, p0, Landroidx/fragment/app/w;->i:Landroidx/fragment/app/u;

    .line 58
    .line 59
    invoke-virtual {v0, p2, v1}, Lsp1;->a(Lg71;Lkp1;)V

    .line 60
    .line 61
    .line 62
    :cond_4
    const/4 p2, 0x0

    .line 63
    if-eqz p3, :cond_6

    .line 64
    .line 65
    iget-object p1, p3, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/w;

    .line 66
    .line 67
    iget-object p1, p1, Landroidx/fragment/app/w;->N:Landroidx/fragment/app/x;

    .line 68
    .line 69
    iget-object v0, p1, Landroidx/fragment/app/x;->e:Ljava/util/HashMap;

    .line 70
    .line 71
    iget-object v1, p3, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Landroidx/fragment/app/x;

    .line 78
    .line 79
    if-nez v1, :cond_5

    .line 80
    .line 81
    new-instance v1, Landroidx/fragment/app/x;

    .line 82
    .line 83
    iget-boolean p1, p1, Landroidx/fragment/app/x;->g:Z

    .line 84
    .line 85
    invoke-direct {v1, p1}, Landroidx/fragment/app/x;-><init>(Z)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p3, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    :cond_5
    iput-object v1, p0, Landroidx/fragment/app/w;->N:Landroidx/fragment/app/x;

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_6
    instance-of v0, p1, Lu33;

    .line 97
    .line 98
    if-eqz v0, :cond_8

    .line 99
    .line 100
    check-cast p1, Lu33;

    .line 101
    .line 102
    invoke-interface {p1}, Lu33;->getViewModelStore()Lt33;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    new-instance v0, Lac1;

    .line 107
    .line 108
    sget-object v1, Landroidx/fragment/app/x;->j:Lwm0;

    .line 109
    .line 110
    invoke-direct {v0, p1, v1}, Lac1;-><init>(Lt33;Ls33;)V

    .line 111
    .line 112
    .line 113
    const-class p1, Landroidx/fragment/app/x;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    if-eqz v1, :cond_7

    .line 120
    .line 121
    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 122
    .line 123
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v0, p1, v1}, Lac1;->l(Ljava/lang/Class;Ljava/lang/String;)Lq33;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    check-cast p1, Landroidx/fragment/app/x;

    .line 132
    .line 133
    iput-object p1, p0, Landroidx/fragment/app/w;->N:Landroidx/fragment/app/x;

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_7
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 137
    .line 138
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_8
    new-instance p1, Landroidx/fragment/app/x;

    .line 143
    .line 144
    invoke-direct {p1, p2}, Landroidx/fragment/app/x;-><init>(Z)V

    .line 145
    .line 146
    .line 147
    iput-object p1, p0, Landroidx/fragment/app/w;->N:Landroidx/fragment/app/x;

    .line 148
    .line 149
    :goto_1
    iget-object p1, p0, Landroidx/fragment/app/w;->N:Landroidx/fragment/app/x;

    .line 150
    .line 151
    iget-boolean v0, p0, Landroidx/fragment/app/w;->G:Z

    .line 152
    .line 153
    const/4 v1, 0x1

    .line 154
    if-nez v0, :cond_a

    .line 155
    .line 156
    iget-boolean v0, p0, Landroidx/fragment/app/w;->H:Z

    .line 157
    .line 158
    if-eqz v0, :cond_9

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_9
    move v0, p2

    .line 162
    goto :goto_3

    .line 163
    :cond_a
    :goto_2
    move v0, v1

    .line 164
    :goto_3
    iput-boolean v0, p1, Landroidx/fragment/app/x;->i:Z

    .line 165
    .line 166
    iget-object v0, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 167
    .line 168
    iput-object p1, v0, Landroidx/fragment/app/z;->d:Landroidx/fragment/app/x;

    .line 169
    .line 170
    iget-object p1, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 171
    .line 172
    instance-of v0, p1, Lz62;

    .line 173
    .line 174
    if-eqz v0, :cond_b

    .line 175
    .line 176
    if-nez p3, :cond_b

    .line 177
    .line 178
    check-cast p1, Lz62;

    .line 179
    .line 180
    invoke-interface {p1}, Lz62;->getSavedStateRegistry()Lx62;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    new-instance v0, Ltx;

    .line 185
    .line 186
    invoke-direct {v0, p0, v1}, Ltx;-><init>(Ljava/lang/Object;I)V

    .line 187
    .line 188
    .line 189
    const-string v2, "android:support:fragments"

    .line 190
    .line 191
    invoke-virtual {p1, v2, v0}, Lx62;->c(Ljava/lang/String;Lw62;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, v2}, Lx62;->a(Ljava/lang/String;)Landroid/os/Bundle;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    if-eqz p1, :cond_b

    .line 199
    .line 200
    invoke-virtual {p0, p1}, Landroidx/fragment/app/w;->V(Landroid/os/Bundle;)V

    .line 201
    .line 202
    .line 203
    :cond_b
    iget-object p1, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 204
    .line 205
    instance-of v0, p1, Ll3;

    .line 206
    .line 207
    if-eqz v0, :cond_d

    .line 208
    .line 209
    check-cast p1, Ll3;

    .line 210
    .line 211
    invoke-interface {p1}, Ll3;->getActivityResultRegistry()Lk3;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    if-eqz p3, :cond_c

    .line 216
    .line 217
    new-instance v0, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 220
    .line 221
    .line 222
    iget-object v2, p3, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 223
    .line 224
    const-string v3, ":"

    .line 225
    .line 226
    invoke-static {v0, v2, v3}, Lfm0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    goto :goto_4

    .line 231
    :cond_c
    const-string v0, ""

    .line 232
    .line 233
    :goto_4
    const-string v2, "FragmentManager:"

    .line 234
    .line 235
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    const-string v2, "StartActivityForResult"

    .line 240
    .line 241
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    new-instance v3, Le3;

    .line 246
    .line 247
    invoke-direct {v3, v1}, Le3;-><init>(I)V

    .line 248
    .line 249
    .line 250
    new-instance v4, Landroidx/fragment/app/t;

    .line 251
    .line 252
    invoke-direct {v4, p0, v1}, Landroidx/fragment/app/t;-><init>(Ljava/lang/Object;I)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p1, v2, v3, v4}, Lk3;->c(Ljava/lang/String;Ld3;Lc3;)Lh3;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    iput-object v1, p0, Landroidx/fragment/app/w;->B:Lh3;

    .line 260
    .line 261
    const-string v1, "StartIntentSenderForResult"

    .line 262
    .line 263
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    new-instance v2, Le3;

    .line 268
    .line 269
    const/4 v3, 0x3

    .line 270
    invoke-direct {v2, v3}, Le3;-><init>(I)V

    .line 271
    .line 272
    .line 273
    new-instance v3, Landroidx/fragment/app/t;

    .line 274
    .line 275
    const/4 v4, 0x2

    .line 276
    invoke-direct {v3, p0, v4}, Landroidx/fragment/app/t;-><init>(Ljava/lang/Object;I)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {p1, v1, v2, v3}, Lk3;->c(Ljava/lang/String;Ld3;Lc3;)Lh3;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    iput-object v1, p0, Landroidx/fragment/app/w;->C:Lh3;

    .line 284
    .line 285
    const-string v1, "RequestPermissions"

    .line 286
    .line 287
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    new-instance v1, Le3;

    .line 292
    .line 293
    invoke-direct {v1, p2}, Le3;-><init>(I)V

    .line 294
    .line 295
    .line 296
    new-instance v2, Landroidx/fragment/app/t;

    .line 297
    .line 298
    invoke-direct {v2, p0, p2}, Landroidx/fragment/app/t;-><init>(Ljava/lang/Object;I)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p1, v0, v1, v2}, Lk3;->c(Ljava/lang/String;Ld3;Lc3;)Lh3;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    iput-object p1, p0, Landroidx/fragment/app/w;->D:Lh3;

    .line 306
    .line 307
    :cond_d
    iget-object p1, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 308
    .line 309
    instance-of p2, p1, Lvp1;

    .line 310
    .line 311
    if-eqz p2, :cond_e

    .line 312
    .line 313
    check-cast p1, Lvp1;

    .line 314
    .line 315
    iget-object p2, p0, Landroidx/fragment/app/w;->p:Lpm0;

    .line 316
    .line 317
    invoke-interface {p1, p2}, Lvp1;->addOnConfigurationChangedListener(Lc00;)V

    .line 318
    .line 319
    .line 320
    :cond_e
    iget-object p1, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 321
    .line 322
    instance-of p2, p1, Leq1;

    .line 323
    .line 324
    if-eqz p2, :cond_f

    .line 325
    .line 326
    check-cast p1, Leq1;

    .line 327
    .line 328
    iget-object p2, p0, Landroidx/fragment/app/w;->q:Lpm0;

    .line 329
    .line 330
    invoke-interface {p1, p2}, Leq1;->addOnTrimMemoryListener(Lc00;)V

    .line 331
    .line 332
    .line 333
    :cond_f
    iget-object p1, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 334
    .line 335
    instance-of p2, p1, Laq1;

    .line 336
    .line 337
    if-eqz p2, :cond_10

    .line 338
    .line 339
    check-cast p1, Laq1;

    .line 340
    .line 341
    iget-object p2, p0, Landroidx/fragment/app/w;->r:Lpm0;

    .line 342
    .line 343
    invoke-interface {p1, p2}, Laq1;->addOnMultiWindowModeChangedListener(Lc00;)V

    .line 344
    .line 345
    .line 346
    :cond_10
    iget-object p1, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 347
    .line 348
    instance-of p2, p1, Lbq1;

    .line 349
    .line 350
    if-eqz p2, :cond_11

    .line 351
    .line 352
    check-cast p1, Lbq1;

    .line 353
    .line 354
    iget-object p2, p0, Landroidx/fragment/app/w;->s:Lpm0;

    .line 355
    .line 356
    invoke-interface {p1, p2}, Lbq1;->addOnPictureInPictureModeChangedListener(Lc00;)V

    .line 357
    .line 358
    .line 359
    :cond_11
    iget-object p1, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 360
    .line 361
    instance-of p2, p1, Llg1;

    .line 362
    .line 363
    if-eqz p2, :cond_12

    .line 364
    .line 365
    if-nez p3, :cond_12

    .line 366
    .line 367
    check-cast p1, Llg1;

    .line 368
    .line 369
    iget-object p0, p0, Landroidx/fragment/app/w;->t:Lqm0;

    .line 370
    .line 371
    invoke-interface {p1, p0}, Llg1;->addMenuProvider(Lfh1;)V

    .line 372
    .line 373
    .line 374
    :cond_12
    return-void

    .line 375
    :cond_13
    const-string p0, "Already attached"

    .line 376
    .line 377
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    return-void
.end method

.method public final b0(Landroidx/fragment/app/Fragment;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/w;->H(Landroidx/fragment/app/Fragment;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getEnterAnim()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getExitAnim()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getPopEnterAnim()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    add-int/2addr v0, v1

    .line 21
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getPopExitAnim()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    add-int/2addr v1, v0

    .line 26
    if-lez v1, :cond_1

    .line 27
    .line 28
    sget v0, Landroidx/fragment/R$id;->visible_removing_fragment_view_tag:I

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    sget v0, Landroidx/fragment/R$id;->visible_removing_fragment_view_tag:I

    .line 37
    .line 38
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    sget v0, Landroidx/fragment/R$id;->visible_removing_fragment_view_tag:I

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Landroidx/fragment/app/Fragment;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getPopDirection()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->setPopDirection(Z)V

    .line 54
    .line 55
    .line 56
    :cond_1
    return-void
.end method

.method public final c(Landroidx/fragment/app/Fragment;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/w;->K(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-boolean v1, p1, Landroidx/fragment/app/Fragment;->mDetached:Z

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    iput-boolean v1, p1, Landroidx/fragment/app/Fragment;->mDetached:Z

    .line 17
    .line 18
    iget-boolean v1, p1, Landroidx/fragment/app/Fragment;->mAdded:Z

    .line 19
    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    iget-object v1, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Landroidx/fragment/app/z;->a(Landroidx/fragment/app/Fragment;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Landroidx/fragment/app/w;->K(I)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-static {p1}, Landroidx/fragment/app/w;->L(Landroidx/fragment/app/Fragment;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    iput-boolean p1, p0, Landroidx/fragment/app/w;->F:Z

    .line 44
    .line 45
    :cond_2
    return-void
.end method

.method public final c0(Ljava/lang/IllegalStateException;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "FragmentManager"

    .line 6
    .line 7
    invoke-static {v1, v0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    const-string v0, "Activity state:"

    .line 11
    .line 12
    invoke-static {v1, v0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    new-instance v0, Lga1;

    .line 16
    .line 17
    invoke-direct {v0}, Lga1;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v2, Ljava/io/PrintWriter;

    .line 21
    .line 22
    invoke-direct {v2, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 26
    .line 27
    const-string v3, "Failed dumping state"

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    const-string v6, "  "

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    :try_start_0
    new-array p0, v4, [Ljava/lang/String;

    .line 36
    .line 37
    check-cast v0, Landroidx/fragment/app/q;

    .line 38
    .line 39
    iget-object v0, v0, Landroidx/fragment/app/q;->e:Landroidx/fragment/app/FragmentActivity;

    .line 40
    .line 41
    invoke-virtual {v0, v6, v5, v2, p0}, Landroidx/fragment/app/FragmentActivity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catch_0
    move-exception p0

    .line 46
    invoke-static {v1, v3, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    :try_start_1
    new-array v0, v4, [Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p0, v6, v5, v2, v0}, Landroidx/fragment/app/w;->v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catch_1
    move-exception p0

    .line 57
    invoke-static {v1, v3, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 58
    .line 59
    .line 60
    :goto_0
    throw p1
.end method

.method public final d()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/w;->b:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/w;->L:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Landroidx/fragment/app/w;->K:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final d0()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/w;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/w;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x3

    .line 11
    const/4 v3, 0x1

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/fragment/app/w;->i:Landroidx/fragment/app/u;

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Lkp1;->setEnabled(Z)V

    .line 17
    .line 18
    .line 19
    invoke-static {v2}, Landroidx/fragment/app/w;->K(I)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/w;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_2

    .line 31
    :cond_0
    :goto_0
    monitor-exit v0

    .line 32
    return-void

    .line 33
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/w;->G()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-lez v0, :cond_2

    .line 39
    .line 40
    iget-object v0, p0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 41
    .line 42
    invoke-static {v0}, Landroidx/fragment/app/w;->N(Landroidx/fragment/app/Fragment;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    const/4 v3, 0x0

    .line 50
    :goto_1
    invoke-static {v2}, Landroidx/fragment/app/w;->K(I)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0}, Landroidx/fragment/app/w;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    :cond_3
    iget-object p0, p0, Landroidx/fragment/app/w;->i:Landroidx/fragment/app/u;

    .line 60
    .line 61
    invoke-virtual {p0, v3}, Lkp1;->setEnabled(Z)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    throw p0
.end method

.method public final e()Ljava/util/HashSet;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroidx/fragment/app/z;->d()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Landroidx/fragment/app/y;

    .line 27
    .line 28
    iget-object v2, v2, Landroidx/fragment/app/y;->c:Landroidx/fragment/app/Fragment;

    .line 29
    .line 30
    iget-object v2, v2, Landroidx/fragment/app/Fragment;->mContainer:Landroid/view/ViewGroup;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/w;->J()Lec0;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    sget v3, Landroidx/fragment/R$id;->special_effects_controller_view_tag:I

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    instance-of v4, v3, Landroidx/fragment/app/h;

    .line 48
    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    check-cast v3, Landroidx/fragment/app/h;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    new-instance v3, Landroidx/fragment/app/h;

    .line 55
    .line 56
    invoke-direct {v3, v2}, Landroidx/fragment/app/h;-><init>(Landroid/view/ViewGroup;)V

    .line 57
    .line 58
    .line 59
    sget v4, Landroidx/fragment/R$id;->special_effects_controller_view_tag:I

    .line 60
    .line 61
    invoke-virtual {v2, v4, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    return-object v0
.end method

.method public final f(Ljava/util/ArrayList;II)Ljava/util/HashSet;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-ge p2, p3, :cond_2

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Landroidx/fragment/app/a;

    .line 13
    .line 14
    iget-object v1, v1, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ldn0;

    .line 31
    .line 32
    iget-object v2, v2, Ldn0;->b:Landroidx/fragment/app/Fragment;

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    iget-object v2, v2, Landroidx/fragment/app/Fragment;->mContainer:Landroid/view/ViewGroup;

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-static {v2, p0}, Landroidx/fragment/app/h;->j(Landroid/view/ViewGroup;Landroidx/fragment/app/w;)Landroidx/fragment/app/h;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    add-int/lit8 p2, p2, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    return-object v0
.end method

.method public final g(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/y;
    .locals 3

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 4
    .line 5
    iget-object v2, v1, Landroidx/fragment/app/z;->b:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroidx/fragment/app/y;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v0, Landroidx/fragment/app/y;

    .line 17
    .line 18
    iget-object v2, p0, Landroidx/fragment/app/w;->n:Lwc0;

    .line 19
    .line 20
    invoke-direct {v0, v2, v1, p1}, Landroidx/fragment/app/y;-><init>(Lwc0;Landroidx/fragment/app/z;Landroidx/fragment/app/Fragment;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 24
    .line 25
    iget-object p1, p1, Lom0;->b:Landroidx/fragment/app/FragmentActivity;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v0, p1}, Landroidx/fragment/app/y;->j(Ljava/lang/ClassLoader;)V

    .line 32
    .line 33
    .line 34
    iget p0, p0, Landroidx/fragment/app/w;->u:I

    .line 35
    .line 36
    iput p0, v0, Landroidx/fragment/app/y;->e:I

    .line 37
    .line 38
    return-object v0
.end method

.method public final h(Landroidx/fragment/app/Fragment;)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/w;->K(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-boolean v1, p1, Landroidx/fragment/app/Fragment;->mDetached:Z

    .line 12
    .line 13
    if-nez v1, :cond_3

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    iput-boolean v1, p1, Landroidx/fragment/app/Fragment;->mDetached:Z

    .line 17
    .line 18
    iget-boolean v2, p1, Landroidx/fragment/app/Fragment;->mAdded:Z

    .line 19
    .line 20
    if-eqz v2, :cond_3

    .line 21
    .line 22
    invoke-static {v0}, Landroidx/fragment/app/w;->K(I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 32
    .line 33
    iget-object v2, v0, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 34
    .line 35
    monitor-enter v2

    .line 36
    :try_start_0
    iget-object v0, v0, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    const/4 v0, 0x0

    .line 43
    iput-boolean v0, p1, Landroidx/fragment/app/Fragment;->mAdded:Z

    .line 44
    .line 45
    invoke-static {p1}, Landroidx/fragment/app/w;->L(Landroidx/fragment/app/Fragment;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    iput-boolean v1, p0, Landroidx/fragment/app/w;->F:Z

    .line 52
    .line 53
    :cond_2
    invoke-virtual {p0, p1}, Landroidx/fragment/app/w;->b0(Landroidx/fragment/app/Fragment;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    throw p0

    .line 60
    :cond_3
    return-void
.end method

.method public final i(ZLandroid/content/res/Configuration;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 4
    .line 5
    instance-of v0, v0, Lvp1;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string p2, "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."

    .line 13
    .line 14
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroidx/fragment/app/w;->c0(Ljava/lang/IllegalStateException;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    throw p0

    .line 22
    :cond_1
    :goto_0
    iget-object p0, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/z;->f()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0, p2}, Landroidx/fragment/app/Fragment;->performConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 47
    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/w;

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    invoke-virtual {v0, v1, p2}, Landroidx/fragment/app/w;->i(ZLandroid/content/res/Configuration;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    return-void
.end method

.method public final j(Landroid/view/MenuItem;)Z
    .locals 3

    .line 1
    iget v0, p0, Landroidx/fragment/app/w;->u:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object p0, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/z;->f()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->performContextItemSelected(Landroid/view/MenuItem;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    return v2

    .line 39
    :cond_2
    return v1
.end method

.method public final k(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 7

    .line 1
    iget v0, p0, Landroidx/fragment/app/w;->u:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/fragment/app/z;->f()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v1

    .line 20
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_3

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Landroidx/fragment/app/Fragment;

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->isMenuVisible()Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    invoke-virtual {v5, p1, p2}, Landroidx/fragment/app/Fragment;->performCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-eqz v6, :cond_1

    .line 45
    .line 46
    if-nez v3, :cond_2

    .line 47
    .line 48
    new-instance v3, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move v4, v2

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    iget-object p1, p0, Landroidx/fragment/app/w;->e:Ljava/util/ArrayList;

    .line 59
    .line 60
    if-eqz p1, :cond_6

    .line 61
    .line 62
    :goto_1
    iget-object p1, p0, Landroidx/fragment/app/w;->e:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-ge v1, p1, :cond_6

    .line 69
    .line 70
    iget-object p1, p0, Landroidx/fragment/app/w;->e:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, Landroidx/fragment/app/Fragment;

    .line 77
    .line 78
    if-eqz v3, :cond_4

    .line 79
    .line 80
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-nez p2, :cond_5

    .line 85
    .line 86
    :cond_4
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->onDestroyOptionsMenu()V

    .line 87
    .line 88
    .line 89
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_6
    iput-object v3, p0, Landroidx/fragment/app/w;->e:Ljava/util/ArrayList;

    .line 93
    .line 94
    return v4
.end method

.method public final l()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/w;->I:Z

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/fragment/app/w;->z(Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/w;->w()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 11
    .line 12
    instance-of v2, v1, Lu33;

    .line 13
    .line 14
    iget-object v3, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    iget-object v0, v3, Landroidx/fragment/app/z;->d:Landroidx/fragment/app/x;

    .line 19
    .line 20
    iget-boolean v0, v0, Landroidx/fragment/app/x;->h:Z

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v1, v1, Lom0;->b:Landroidx/fragment/app/FragmentActivity;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    xor-int/2addr v0, v1

    .line 32
    :cond_1
    :goto_0
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-object v0, p0, Landroidx/fragment/app/w;->k:Ljava/util/Map;

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Landroidx/fragment/app/BackStackState;

    .line 55
    .line 56
    iget-object v1, v1, Landroidx/fragment/app/BackStackState;->a:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_2

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Ljava/lang/String;

    .line 73
    .line 74
    iget-object v4, v3, Landroidx/fragment/app/z;->d:Landroidx/fragment/app/x;

    .line 75
    .line 76
    const/4 v5, 0x0

    .line 77
    invoke-virtual {v4, v2, v5}, Landroidx/fragment/app/x;->d(Ljava/lang/String;Z)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    const/4 v0, -0x1

    .line 82
    invoke-virtual {p0, v0}, Landroidx/fragment/app/w;->u(I)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 86
    .line 87
    instance-of v1, v0, Leq1;

    .line 88
    .line 89
    if-eqz v1, :cond_4

    .line 90
    .line 91
    check-cast v0, Leq1;

    .line 92
    .line 93
    iget-object v1, p0, Landroidx/fragment/app/w;->q:Lpm0;

    .line 94
    .line 95
    invoke-interface {v0, v1}, Leq1;->removeOnTrimMemoryListener(Lc00;)V

    .line 96
    .line 97
    .line 98
    :cond_4
    iget-object v0, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 99
    .line 100
    instance-of v1, v0, Lvp1;

    .line 101
    .line 102
    if-eqz v1, :cond_5

    .line 103
    .line 104
    check-cast v0, Lvp1;

    .line 105
    .line 106
    iget-object v1, p0, Landroidx/fragment/app/w;->p:Lpm0;

    .line 107
    .line 108
    invoke-interface {v0, v1}, Lvp1;->removeOnConfigurationChangedListener(Lc00;)V

    .line 109
    .line 110
    .line 111
    :cond_5
    iget-object v0, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 112
    .line 113
    instance-of v1, v0, Laq1;

    .line 114
    .line 115
    if-eqz v1, :cond_6

    .line 116
    .line 117
    check-cast v0, Laq1;

    .line 118
    .line 119
    iget-object v1, p0, Landroidx/fragment/app/w;->r:Lpm0;

    .line 120
    .line 121
    invoke-interface {v0, v1}, Laq1;->removeOnMultiWindowModeChangedListener(Lc00;)V

    .line 122
    .line 123
    .line 124
    :cond_6
    iget-object v0, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 125
    .line 126
    instance-of v1, v0, Lbq1;

    .line 127
    .line 128
    if-eqz v1, :cond_7

    .line 129
    .line 130
    check-cast v0, Lbq1;

    .line 131
    .line 132
    iget-object v1, p0, Landroidx/fragment/app/w;->s:Lpm0;

    .line 133
    .line 134
    invoke-interface {v0, v1}, Lbq1;->removeOnPictureInPictureModeChangedListener(Lc00;)V

    .line 135
    .line 136
    .line 137
    :cond_7
    iget-object v0, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 138
    .line 139
    instance-of v1, v0, Llg1;

    .line 140
    .line 141
    if-eqz v1, :cond_8

    .line 142
    .line 143
    iget-object v1, p0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 144
    .line 145
    if-nez v1, :cond_8

    .line 146
    .line 147
    check-cast v0, Llg1;

    .line 148
    .line 149
    iget-object v1, p0, Landroidx/fragment/app/w;->t:Lqm0;

    .line 150
    .line 151
    invoke-interface {v0, v1}, Llg1;->removeMenuProvider(Lfh1;)V

    .line 152
    .line 153
    .line 154
    :cond_8
    const/4 v0, 0x0

    .line 155
    iput-object v0, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 156
    .line 157
    iput-object v0, p0, Landroidx/fragment/app/w;->w:Lmm0;

    .line 158
    .line 159
    iput-object v0, p0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 160
    .line 161
    iget-object v1, p0, Landroidx/fragment/app/w;->g:Lsp1;

    .line 162
    .line 163
    if-eqz v1, :cond_9

    .line 164
    .line 165
    iget-object v1, p0, Landroidx/fragment/app/w;->i:Landroidx/fragment/app/u;

    .line 166
    .line 167
    invoke-virtual {v1}, Lkp1;->remove()V

    .line 168
    .line 169
    .line 170
    iput-object v0, p0, Landroidx/fragment/app/w;->g:Lsp1;

    .line 171
    .line 172
    :cond_9
    iget-object v0, p0, Landroidx/fragment/app/w;->B:Lh3;

    .line 173
    .line 174
    if-eqz v0, :cond_a

    .line 175
    .line 176
    invoke-virtual {v0}, Lh3;->b()V

    .line 177
    .line 178
    .line 179
    iget-object v0, p0, Landroidx/fragment/app/w;->C:Lh3;

    .line 180
    .line 181
    invoke-virtual {v0}, Lh3;->b()V

    .line 182
    .line 183
    .line 184
    iget-object p0, p0, Landroidx/fragment/app/w;->D:Lh3;

    .line 185
    .line 186
    invoke-virtual {p0}, Lh3;->b()V

    .line 187
    .line 188
    .line 189
    :cond_a
    return-void
.end method

.method public final m(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 4
    .line 5
    instance-of v0, v0, Leq1;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string v0, "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroidx/fragment/app/w;->c0(Ljava/lang/IllegalStateException;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    throw p0

    .line 22
    :cond_1
    :goto_0
    iget-object p0, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/z;->f()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->performLowMemory()V

    .line 47
    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/w;

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    invoke-virtual {v0, v1}, Landroidx/fragment/app/w;->m(Z)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    return-void
.end method

.method public final n(ZZ)V
    .locals 2

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 4
    .line 5
    instance-of v0, v0, Laq1;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string p2, "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."

    .line 13
    .line 14
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroidx/fragment/app/w;->c0(Ljava/lang/IllegalStateException;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    throw p0

    .line 22
    :cond_1
    :goto_0
    iget-object p0, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/z;->f()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->performMultiWindowModeChanged(Z)V

    .line 47
    .line 48
    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/w;

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/w;->n(ZZ)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    return-void
.end method

.method public final o()V
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/z;->e()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->isHidden()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->onHiddenChanged(Z)V

    .line 30
    .line 31
    .line 32
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/w;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroidx/fragment/app/w;->o()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return-void
.end method

.method public final p(Landroid/view/MenuItem;)Z
    .locals 3

    .line 1
    iget v0, p0, Landroidx/fragment/app/w;->u:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object p0, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/z;->f()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->performOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    return v2

    .line 39
    :cond_2
    return v1
.end method

.method public final q(Landroid/view/Menu;)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/fragment/app/w;->u:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object p0, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/z;->f()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->performOptionsMenuClosed(Landroid/view/Menu;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    :goto_1
    return-void
.end method

.method public final r(Landroidx/fragment/app/Fragment;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroidx/fragment/app/z;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p1, p0}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->performPrimaryNavigationFragmentChanged()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final s(ZZ)V
    .locals 2

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 4
    .line 5
    instance-of v0, v0, Lbq1;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string p2, "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."

    .line 13
    .line 14
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroidx/fragment/app/w;->c0(Ljava/lang/IllegalStateException;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    throw p0

    .line 22
    :cond_1
    :goto_0
    iget-object p0, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/z;->f()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->performPictureInPictureModeChanged(Z)V

    .line 47
    .line 48
    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/w;

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/w;->s(ZZ)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    return-void
.end method

.method public final t(Landroid/view/Menu;)Z
    .locals 4

    .line 1
    iget v0, p0, Landroidx/fragment/app/w;->u:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object p0, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/z;->f()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->isMenuVisible()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->performPrepareOptionsMenu(Landroid/view/Menu;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    move v1, v2

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "FragmentManager{"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, " in "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 30
    .line 31
    const-string v2, "}"

    .line 32
    .line 33
    const-string v3, "{"

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 52
    .line 53
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 87
    .line 88
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    const-string p0, "null"

    .line 104
    .line 105
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    :goto_0
    const-string p0, "}}"

    .line 109
    .line 110
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0
.end method

.method public final u(I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Landroidx/fragment/app/w;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 6
    .line 7
    iget-object v2, v2, Landroidx/fragment/app/z;->b:Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Landroidx/fragment/app/y;

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    iput p1, v3, Landroidx/fragment/app/y;->e:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {p0, p1, v1}, Landroidx/fragment/app/w;->O(IZ)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/fragment/app/w;->e()Ljava/util/HashSet;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Landroidx/fragment/app/h;

    .line 56
    .line 57
    invoke-virtual {v2}, Landroidx/fragment/app/h;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    iput-boolean v1, p0, Landroidx/fragment/app/w;->b:Z

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Landroidx/fragment/app/w;->z(Z)Z

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :goto_2
    iput-boolean v1, p0, Landroidx/fragment/app/w;->b:Z

    .line 70
    .line 71
    throw p1
.end method

.method public final v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "    "

    .line 2
    .line 3
    invoke-static {p1, v0}, Lfm0;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 8
    .line 9
    iget-object v2, v1, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    const-string v3, "    "

    .line 12
    .line 13
    invoke-static {p1, v3}, Lfm0;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget-object v1, v1, Landroidx/fragment/app/z;->b:Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v4, "Active Fragments:"

    .line 29
    .line 30
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Landroidx/fragment/app/y;

    .line 52
    .line 53
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    if-eqz v4, :cond_0

    .line 57
    .line 58
    iget-object v4, v4, Landroidx/fragment/app/y;->c:Landroidx/fragment/app/Fragment;

    .line 59
    .line 60
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v3, p2, p3, p4}, Landroidx/fragment/app/Fragment;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    const-string v4, "null"

    .line 68
    .line 69
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    const/4 p4, 0x0

    .line 78
    if-lez p2, :cond_2

    .line 79
    .line 80
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const-string v1, "Added Fragments:"

    .line 84
    .line 85
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    move v1, p4

    .line 89
    :goto_1
    if-ge v1, p2, :cond_2

    .line 90
    .line 91
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Landroidx/fragment/app/Fragment;

    .line 96
    .line 97
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    const-string v4, "  #"

    .line 101
    .line 102
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 106
    .line 107
    .line 108
    const-string v4, ": "

    .line 109
    .line 110
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    add-int/lit8 v1, v1, 0x1

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_2
    iget-object p2, p0, Landroidx/fragment/app/w;->e:Ljava/util/ArrayList;

    .line 124
    .line 125
    if-eqz p2, :cond_3

    .line 126
    .line 127
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    if-lez p2, :cond_3

    .line 132
    .line 133
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    const-string v1, "Fragments Created Menus:"

    .line 137
    .line 138
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    move v1, p4

    .line 142
    :goto_2
    if-ge v1, p2, :cond_3

    .line 143
    .line 144
    iget-object v2, p0, Landroidx/fragment/app/w;->e:Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 151
    .line 152
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    const-string v3, "  #"

    .line 156
    .line 157
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 161
    .line 162
    .line 163
    const-string v3, ": "

    .line 164
    .line 165
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    add-int/lit8 v1, v1, 0x1

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_3
    iget-object p2, p0, Landroidx/fragment/app/w;->d:Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    if-lez p2, :cond_4

    .line 185
    .line 186
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    const-string v1, "Back Stack:"

    .line 190
    .line 191
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    move v1, p4

    .line 195
    :goto_3
    if-ge v1, p2, :cond_4

    .line 196
    .line 197
    iget-object v2, p0, Landroidx/fragment/app/w;->d:Ljava/util/ArrayList;

    .line 198
    .line 199
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    check-cast v2, Landroidx/fragment/app/a;

    .line 204
    .line 205
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    const-string v3, "  #"

    .line 209
    .line 210
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 214
    .line 215
    .line 216
    const-string v3, ": "

    .line 217
    .line 218
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2}, Landroidx/fragment/app/a;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    const/4 v3, 0x1

    .line 229
    invoke-virtual {v2, v0, p3, v3}, Landroidx/fragment/app/a;->f(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 230
    .line 231
    .line 232
    add-int/lit8 v1, v1, 0x1

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_4
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    new-instance p2, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    const-string v0, "Back Stack Index: "

    .line 241
    .line 242
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    iget-object v0, p0, Landroidx/fragment/app/w;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 246
    .line 247
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object p2

    .line 258
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    iget-object p2, p0, Landroidx/fragment/app/w;->a:Ljava/util/ArrayList;

    .line 262
    .line 263
    monitor-enter p2

    .line 264
    :try_start_0
    iget-object v0, p0, Landroidx/fragment/app/w;->a:Ljava/util/ArrayList;

    .line 265
    .line 266
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-lez v0, :cond_5

    .line 271
    .line 272
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    const-string v1, "Pending Actions:"

    .line 276
    .line 277
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    :goto_4
    if-ge p4, v0, :cond_5

    .line 281
    .line 282
    iget-object v1, p0, Landroidx/fragment/app/w;->a:Ljava/util/ArrayList;

    .line 283
    .line 284
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    check-cast v1, Ltm0;

    .line 289
    .line 290
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    const-string v2, "  #"

    .line 294
    .line 295
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    .line 299
    .line 300
    .line 301
    const-string v2, ": "

    .line 302
    .line 303
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    add-int/lit8 p4, p4, 0x1

    .line 310
    .line 311
    goto :goto_4

    .line 312
    :catchall_0
    move-exception p0

    .line 313
    goto :goto_5

    .line 314
    :cond_5
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 315
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    const-string p2, "FragmentManager misc state:"

    .line 319
    .line 320
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    const-string p2, "  mHost="

    .line 327
    .line 328
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    iget-object p2, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 332
    .line 333
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    const-string p2, "  mContainer="

    .line 340
    .line 341
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    iget-object p2, p0, Landroidx/fragment/app/w;->w:Lmm0;

    .line 345
    .line 346
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    iget-object p2, p0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 350
    .line 351
    if-eqz p2, :cond_6

    .line 352
    .line 353
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    const-string p2, "  mParent="

    .line 357
    .line 358
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    iget-object p2, p0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 362
    .line 363
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    :cond_6
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    const-string p2, "  mCurState="

    .line 370
    .line 371
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    iget p2, p0, Landroidx/fragment/app/w;->u:I

    .line 375
    .line 376
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    .line 377
    .line 378
    .line 379
    const-string p2, " mStateSaved="

    .line 380
    .line 381
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    iget-boolean p2, p0, Landroidx/fragment/app/w;->G:Z

    .line 385
    .line 386
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 387
    .line 388
    .line 389
    const-string p2, " mStopped="

    .line 390
    .line 391
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    iget-boolean p2, p0, Landroidx/fragment/app/w;->H:Z

    .line 395
    .line 396
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 397
    .line 398
    .line 399
    const-string p2, " mDestroyed="

    .line 400
    .line 401
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    iget-boolean p2, p0, Landroidx/fragment/app/w;->I:Z

    .line 405
    .line 406
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    .line 407
    .line 408
    .line 409
    iget-boolean p2, p0, Landroidx/fragment/app/w;->F:Z

    .line 410
    .line 411
    if-eqz p2, :cond_7

    .line 412
    .line 413
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    const-string p1, "  mNeedMenuInvalidate="

    .line 417
    .line 418
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    iget-boolean p0, p0, Landroidx/fragment/app/w;->F:Z

    .line 422
    .line 423
    invoke-virtual {p3, p0}, Ljava/io/PrintWriter;->println(Z)V

    .line 424
    .line 425
    .line 426
    :cond_7
    return-void

    .line 427
    :goto_5
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 428
    throw p0
.end method

.method public final w()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/w;->e()Ljava/util/HashSet;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroidx/fragment/app/h;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/fragment/app/h;->i()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public final x(Ltm0;Z)V
    .locals 2

    .line 1
    if-nez p2, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean p0, p0, Landroidx/fragment/app/w;->I:Z

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const-string p0, "FragmentManager has been destroyed"

    .line 12
    .line 13
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "FragmentManager has not been attached to a host."

    .line 18
    .line 19
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-boolean v0, p0, Landroidx/fragment/app/w;->G:Z

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iget-boolean v0, p0, Landroidx/fragment/app/w;->H:Z

    .line 28
    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    const-string p0, "Can not perform this action after onSaveInstanceState"

    .line 33
    .line 34
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_3
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/w;->a:Ljava/util/ArrayList;

    .line 39
    .line 40
    monitor-enter v0

    .line 41
    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 42
    .line 43
    if-nez v1, :cond_5

    .line 44
    .line 45
    if-eqz p2, :cond_4

    .line 46
    .line 47
    monitor-exit v0

    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    goto :goto_1

    .line 51
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p1, "Activity has been destroyed"

    .line 54
    .line 55
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p0

    .line 59
    :cond_5
    iget-object p2, p0, Landroidx/fragment/app/w;->a:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Landroidx/fragment/app/w;->X()V

    .line 65
    .line 66
    .line 67
    monitor-exit v0

    .line 68
    return-void

    .line 69
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    throw p0
.end method

.method public final y(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/w;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean p0, p0, Landroidx/fragment/app/w;->I:Z

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const-string p0, "FragmentManager has been destroyed"

    .line 14
    .line 15
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "FragmentManager has not been attached to a host."

    .line 20
    .line 21
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 30
    .line 31
    iget-object v1, v1, Lom0;->c:Landroid/os/Handler;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-ne v0, v1, :cond_5

    .line 38
    .line 39
    if-nez p1, :cond_3

    .line 40
    .line 41
    iget-boolean p1, p0, Landroidx/fragment/app/w;->G:Z

    .line 42
    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    iget-boolean p1, p0, Landroidx/fragment/app/w;->H:Z

    .line 46
    .line 47
    if-nez p1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const-string p0, "Can not perform this action after onSaveInstanceState"

    .line 51
    .line 52
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    :goto_0
    iget-object p1, p0, Landroidx/fragment/app/w;->K:Ljava/util/ArrayList;

    .line 57
    .line 58
    if-nez p1, :cond_4

    .line 59
    .line 60
    new-instance p1, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Landroidx/fragment/app/w;->K:Ljava/util/ArrayList;

    .line 66
    .line 67
    new-instance p1, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Landroidx/fragment/app/w;->L:Ljava/util/ArrayList;

    .line 73
    .line 74
    :cond_4
    return-void

    .line 75
    :cond_5
    const-string p0, "Must be called from main thread of fragment host"

    .line 76
    .line 77
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_6
    const-string p0, "FragmentManager is already executing transactions"

    .line 82
    .line 83
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final z(Z)Z
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/w;->y(Z)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    move v0, p1

    .line 6
    :goto_0
    iget-object v1, p0, Landroidx/fragment/app/w;->K:Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object v2, p0, Landroidx/fragment/app/w;->L:Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v3, p0, Landroidx/fragment/app/w;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    monitor-enter v3

    .line 13
    :try_start_0
    iget-object v4, p0, Landroidx/fragment/app/w;->a:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    move v6, p1

    .line 23
    goto :goto_2

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto/16 :goto_5

    .line 26
    .line 27
    :cond_0
    :try_start_1
    iget-object v4, p0, Landroidx/fragment/app/w;->a:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    move v5, p1

    .line 34
    move v6, v5

    .line 35
    :goto_1
    iget-object v7, p0, Landroidx/fragment/app/w;->a:Ljava/util/ArrayList;

    .line 36
    .line 37
    if-ge v5, v4, :cond_1

    .line 38
    .line 39
    :try_start_2
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    check-cast v7, Ltm0;

    .line 44
    .line 45
    invoke-interface {v7, v1, v2}, Ltm0;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 46
    .line 47
    .line 48
    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 49
    or-int/2addr v6, v7

    .line 50
    add-int/lit8 v5, v5, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catchall_1
    move-exception p1

    .line 54
    goto :goto_4

    .line 55
    :cond_1
    :try_start_3
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 59
    .line 60
    iget-object v1, v1, Lom0;->c:Landroid/os/Handler;

    .line 61
    .line 62
    iget-object v2, p0, Landroidx/fragment/app/w;->O:Lye;

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 65
    .line 66
    .line 67
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 68
    :goto_2
    const/4 v1, 0x1

    .line 69
    if-eqz v6, :cond_2

    .line 70
    .line 71
    iput-boolean v1, p0, Landroidx/fragment/app/w;->b:Z

    .line 72
    .line 73
    :try_start_4
    iget-object v0, p0, Landroidx/fragment/app/w;->K:Ljava/util/ArrayList;

    .line 74
    .line 75
    iget-object v2, p0, Landroidx/fragment/app/w;->L:Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-virtual {p0, v0, v2}, Landroidx/fragment/app/w;->U(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Landroidx/fragment/app/w;->d()V

    .line 81
    .line 82
    .line 83
    move v0, v1

    .line 84
    goto :goto_0

    .line 85
    :catchall_2
    move-exception p1

    .line 86
    invoke-virtual {p0}, Landroidx/fragment/app/w;->d()V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/w;->d0()V

    .line 91
    .line 92
    .line 93
    iget-boolean v2, p0, Landroidx/fragment/app/w;->J:Z

    .line 94
    .line 95
    if-eqz v2, :cond_5

    .line 96
    .line 97
    iput-boolean p1, p0, Landroidx/fragment/app/w;->J:Z

    .line 98
    .line 99
    iget-object v2, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 100
    .line 101
    invoke-virtual {v2}, Landroidx/fragment/app/z;->d()Ljava/util/ArrayList;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    :cond_3
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_5

    .line 114
    .line 115
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    check-cast v3, Landroidx/fragment/app/y;

    .line 120
    .line 121
    iget-object v4, v3, Landroidx/fragment/app/y;->c:Landroidx/fragment/app/Fragment;

    .line 122
    .line 123
    iget-boolean v5, v4, Landroidx/fragment/app/Fragment;->mDeferStart:Z

    .line 124
    .line 125
    if-eqz v5, :cond_3

    .line 126
    .line 127
    iget-boolean v5, p0, Landroidx/fragment/app/w;->b:Z

    .line 128
    .line 129
    if-eqz v5, :cond_4

    .line 130
    .line 131
    iput-boolean v1, p0, Landroidx/fragment/app/w;->J:Z

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_4
    iput-boolean p1, v4, Landroidx/fragment/app/Fragment;->mDeferStart:Z

    .line 135
    .line 136
    invoke-virtual {v3}, Landroidx/fragment/app/y;->i()V

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_5
    iget-object p0, p0, Landroidx/fragment/app/w;->c:Landroidx/fragment/app/z;

    .line 141
    .line 142
    iget-object p0, p0, Landroidx/fragment/app/z;->b:Ljava/util/HashMap;

    .line 143
    .line 144
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    const/4 p1, 0x0

    .line 149
    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-interface {p0, p1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 154
    .line 155
    .line 156
    return v0

    .line 157
    :goto_4
    :try_start_5
    iget-object v0, p0, Landroidx/fragment/app/w;->a:Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 160
    .line 161
    .line 162
    iget-object v0, p0, Landroidx/fragment/app/w;->v:Lom0;

    .line 163
    .line 164
    iget-object v0, v0, Lom0;->c:Landroid/os/Handler;

    .line 165
    .line 166
    iget-object p0, p0, Landroidx/fragment/app/w;->O:Lye;

    .line 167
    .line 168
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 169
    .line 170
    .line 171
    throw p1

    .line 172
    :goto_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 173
    throw p0
.end method
