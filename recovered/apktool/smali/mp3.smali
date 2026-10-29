.class public final Lmp3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljk3;


# static fields
.field public static volatile v0:Lmp3;


# instance fields
.field public final U:Lyo3;

.field public V:Loi3;

.field public final W:Lij3;

.field public final X:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public Y:Z

.field public Z:J

.field public final a:Lvi3;

.field public a0:Ljava/util/ArrayList;

.field public final b:Lci3;

.field public final b0:Ljava/util/LinkedList;

.field public c:Lae3;

.field public c0:I

.field public d:Lgi3;

.field public d0:I

.field public e:Lpo3;

.field public e0:Z

.field public f:Lfd3;

.field public f0:Z

.field public g0:Z

.field public h0:Ljava/nio/channels/FileLock;

.field public final i:Lci3;

.field public i0:Ljava/nio/channels/FileChannel;

.field public j0:Ljava/util/ArrayList;

.field public k0:Ljava/util/ArrayList;

.field public l0:J

.field public final m0:Ljava/util/HashMap;

.field public final n0:Ljava/util/HashMap;

.field public final o0:Ljava/util/HashMap;

.field public final p0:Ljava/util/HashMap;

.field public q0:Lbm3;

.field public r0:Ljava/lang/String;

.field public s0:Ldo3;

.field public t0:J

.field public final u0:Lac3;

.field public v:Lci3;

.field public w:Ltn3;


# direct methods
.method public constructor <init>(Lv30;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lmp3;->X:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    new-instance v0, Ljava/util/LinkedList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lmp3;->b0:Ljava/util/LinkedList;

    .line 18
    .line 19
    new-instance v0, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lmp3;->p0:Ljava/util/HashMap;

    .line 25
    .line 26
    new-instance v0, Lac3;

    .line 27
    .line 28
    const/16 v2, 0x9

    .line 29
    .line 30
    invoke-direct {v0, p0, v2}, Lac3;-><init>(Ljava/lang/Object;I)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lmp3;->u0:Lac3;

    .line 34
    .line 35
    iget-object v0, p1, Lv30;->a:Landroid/content/Context;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-static {v0, v2, v2}, Lij3;->r(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdd;Ljava/lang/Long;)Lij3;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lmp3;->W:Lij3;

    .line 43
    .line 44
    const-wide/16 v2, -0x1

    .line 45
    .line 46
    iput-wide v2, p0, Lmp3;->l0:J

    .line 47
    .line 48
    new-instance v0, Lyo3;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lqo3;-><init>(Lmp3;)V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lmp3;->U:Lyo3;

    .line 54
    .line 55
    new-instance v0, Lci3;

    .line 56
    .line 57
    const/4 v2, 0x2

    .line 58
    invoke-direct {v0, p0, v2}, Lci3;-><init>(Lmp3;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lwo3;->B()V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Lmp3;->i:Lci3;

    .line 65
    .line 66
    new-instance v0, Lci3;

    .line 67
    .line 68
    invoke-direct {v0, p0, v1}, Lci3;-><init>(Lmp3;I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Lwo3;->B()V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, Lmp3;->b:Lci3;

    .line 75
    .line 76
    new-instance v0, Lvi3;

    .line 77
    .line 78
    invoke-direct {v0, p0}, Lvi3;-><init>(Lmp3;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Lwo3;->B()V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, Lmp3;->a:Lvi3;

    .line 85
    .line 86
    new-instance v0, Ljava/util/HashMap;

    .line 87
    .line 88
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, Lmp3;->m0:Ljava/util/HashMap;

    .line 92
    .line 93
    new-instance v0, Ljava/util/HashMap;

    .line 94
    .line 95
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-object v0, p0, Lmp3;->n0:Ljava/util/HashMap;

    .line 99
    .line 100
    new-instance v0, Ljava/util/HashMap;

    .line 101
    .line 102
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 103
    .line 104
    .line 105
    iput-object v0, p0, Lmp3;->o0:Ljava/util/HashMap;

    .line 106
    .line 107
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    new-instance v1, Lbb3;

    .line 112
    .line 113
    invoke-direct {v1, p0, p1}, Lbb3;-><init>(Lmp3;Lv30;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public static B(Landroid/content/Context;)Lmp3;
    .locals 3

    .line 1
    invoke-static {p0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lmp3;->v0:Lmp3;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    const-class v0, Lmp3;

    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    sget-object v1, Lmp3;->v0:Lmp3;

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    new-instance v1, Lv30;

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    invoke-direct {v1, p0, v2}, Lv30;-><init>(Landroid/content/Context;I)V

    .line 26
    .line 27
    .line 28
    new-instance p0, Lmp3;

    .line 29
    .line 30
    invoke-direct {p0, v1}, Lmp3;-><init>(Lv30;)V

    .line 31
    .line 32
    .line 33
    sput-object p0, Lmp3;->v0:Lmp3;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    :goto_0
    monitor-exit v0

    .line 39
    goto :goto_2

    .line 40
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    throw p0

    .line 42
    :cond_1
    :goto_2
    sget-object p0, Lmp3;->v0:Lmp3;

    .line 43
    .line 44
    return-object p0
.end method

.method public static final C(Lcom/google/android/gms/internal/measurement/zzhr;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhr;->zza()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-ge v1, v2, :cond_1

    .line 11
    .line 12
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzhw;->zzb()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/zzhr;->zzj(I)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void
.end method

.method public static K(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/util/Map$Entry;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-nez p0, :cond_2

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Ljava/util/List;

    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Ljava/lang/String;

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 63
    return-object p0
.end method

.method public static final Q(Lcom/google/android/gms/measurement/internal/zzr;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzr;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-nez p0, :cond_0

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

.method public static final R(Lcom/google/android/gms/internal/measurement/zzic;)V
    .locals 6

    .line 1
    const-wide v0, 0x7fffffffffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/measurement/zzic;->zzv(J)Lcom/google/android/gms/internal/measurement/zzic;

    .line 7
    .line 8
    .line 9
    const-wide/high16 v0, -0x8000000000000000L

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/measurement/zzic;->zzx(J)Lcom/google/android/gms/internal/measurement/zzic;

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzic;->zzc()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-ge v0, v1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/zzic;->zzd(I)Lcom/google/android/gms/internal/measurement/zzhs;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzhs;->zzf()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzic;->zzu()J

    .line 30
    .line 31
    .line 32
    move-result-wide v4

    .line 33
    cmp-long v2, v2, v4

    .line 34
    .line 35
    if-gez v2, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzhs;->zzf()J

    .line 38
    .line 39
    .line 40
    move-result-wide v2

    .line 41
    invoke-virtual {p0, v2, v3}, Lcom/google/android/gms/internal/measurement/zzic;->zzv(J)Lcom/google/android/gms/internal/measurement/zzic;

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzhs;->zzf()J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzic;->zzw()J

    .line 49
    .line 50
    .line 51
    move-result-wide v4

    .line 52
    cmp-long v2, v2, v4

    .line 53
    .line 54
    if-lez v2, :cond_1

    .line 55
    .line 56
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzhs;->zzf()J

    .line 57
    .line 58
    .line 59
    move-result-wide v1

    .line 60
    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzic;->zzx(J)Lcom/google/android/gms/internal/measurement/zzic;

    .line 61
    .line 62
    .line 63
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    return-void
.end method

.method public static final S(Lwo3;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-boolean v0, p0, Lwo3;->c:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "Component not initialized: "

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const-string p0, "Upload Component not created"

    .line 27
    .line 28
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static final T(Lcom/google/android/gms/measurement/internal/zzr;)Ljava/lang/Boolean;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzr;->a0:Ljava/lang/Boolean;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzr;->n0:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_3

    .line 10
    .line 11
    invoke-static {p0}, Lfs0;->y(Ljava/lang/String;)Lfs0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Llk3;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    if-eq p0, v1, :cond_2

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    if-eq p0, v1, :cond_1

    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    if-eq p0, v1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_1
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_2
    const/4 p0, 0x0

    .line 42
    return-object p0

    .line 43
    :cond_3
    :goto_0
    return-object v0
.end method

.method public static final c0(Lcom/google/android/gms/internal/measurement/zzhr;ILjava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhr;->zza()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const-string v3, "_err"

    .line 11
    .line 12
    if-ge v1, v2, :cond_1

    .line 13
    .line 14
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzhw;->zzb()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzhw;->zzn()Lcom/google/android/gms/internal/measurement/zzhv;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/zzhv;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 39
    .line 40
    .line 41
    int-to-long v1, p1

    .line 42
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzhv;->zzf(J)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 50
    .line 51
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzhw;->zzn()Lcom/google/android/gms/internal/measurement/zzhv;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v1, "_ev"

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzhv;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/measurement/zzhv;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    check-cast p2, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzhr;->zzf(Lcom/google/android/gms/internal/measurement/zzhw;)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/zzhr;->zzf(Lcom/google/android/gms/internal/measurement/zzhw;)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 73
    .line 74
    .line 75
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lbj3;->y()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lmp3;->k0()V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, Lmp3;->Y:Z

    .line 12
    .line 13
    if-nez v0, :cond_b

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lmp3;->Y:Z

    .line 17
    .line 18
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Lbj3;->y()V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lmp3;->h0:Ljava/nio/channels/FileLock;

    .line 26
    .line 27
    iget-object v2, p0, Lmp3;->W:Lij3;

    .line 28
    .line 29
    const-string v3, "Storage concurrent access okay"

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/nio/channels/FileLock;->isValid()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object v1, v1, Luh3;->Y:Lsh3;

    .line 45
    .line 46
    invoke-virtual {v1, v3}, Lsh3;->a(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    :goto_0
    iget-object v1, p0, Lmp3;->c:Lae3;

    .line 51
    .line 52
    iget-object v1, v1, Lsq3;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lij3;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-object v1, v2, Lij3;->a:Landroid/content/Context;

    .line 60
    .line 61
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    new-instance v4, Ljava/io/File;

    .line 66
    .line 67
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzbv;->zza()Lcom/google/android/gms/internal/measurement/zzbw;

    .line 68
    .line 69
    .line 70
    sget v5, Lcom/google/android/gms/internal/measurement/zzca;->zzb:I

    .line 71
    .line 72
    new-instance v5, Ljava/io/File;

    .line 73
    .line 74
    const-string v6, "google_app_measurement.db"

    .line 75
    .line 76
    invoke-direct {v5, v1, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-direct {v4, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :try_start_0
    new-instance v1, Ljava/io/RandomAccessFile;

    .line 87
    .line 88
    const-string v5, "rw"

    .line 89
    .line 90
    invoke-direct {v1, v4, v5}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iput-object v1, p0, Lmp3;->i0:Ljava/nio/channels/FileChannel;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/nio/channels/FileChannel;->tryLock()Ljava/nio/channels/FileLock;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iput-object v1, p0, Lmp3;->h0:Ljava/nio/channels/FileLock;

    .line 104
    .line 105
    if-eqz v1, :cond_a

    .line 106
    .line 107
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iget-object v1, v1, Luh3;->Y:Lsh3;

    .line 112
    .line 113
    invoke-virtual {v1, v3}, Lsh3;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/nio/channels/OverlappingFileLockException; {:try_start_0 .. :try_end_0} :catch_2

    .line 114
    .line 115
    .line 116
    :goto_1
    iget-object v1, p0, Lmp3;->i0:Ljava/nio/channels/FileChannel;

    .line 117
    .line 118
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {v3}, Lbj3;->y()V

    .line 123
    .line 124
    .line 125
    const-string v3, "Bad channel to read from"

    .line 126
    .line 127
    const-wide/16 v4, 0x0

    .line 128
    .line 129
    const/4 v6, 0x4

    .line 130
    const/4 v7, 0x0

    .line 131
    if-eqz v1, :cond_4

    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->isOpen()Z

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    if-nez v8, :cond_2

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_2
    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    :try_start_1
    invoke-virtual {v1, v4, v5}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, v8}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-eq v1, v6, :cond_3

    .line 152
    .line 153
    const/4 v8, -0x1

    .line 154
    if-eq v1, v8, :cond_5

    .line 155
    .line 156
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    iget-object v8, v8, Luh3;->w:Lsh3;

    .line 161
    .line 162
    const-string v9, "Unexpected data length. Bytes read"

    .line 163
    .line 164
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v8, v1, v9}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    goto :goto_4

    .line 172
    :catch_0
    move-exception v1

    .line 173
    goto :goto_2

    .line 174
    :cond_3
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->getInt()I

    .line 178
    .line 179
    .line 180
    move-result v7
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 181
    goto :goto_4

    .line 182
    :goto_2
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    iget-object v8, v8, Luh3;->f:Lsh3;

    .line 187
    .line 188
    const-string v9, "Failed to read from channel"

    .line 189
    .line 190
    invoke-virtual {v8, v1, v9}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_4
    :goto_3
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    iget-object v1, v1, Luh3;->f:Lsh3;

    .line 199
    .line 200
    invoke-virtual {v1, v3}, Lsh3;->a(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    :cond_5
    :goto_4
    invoke-virtual {v2}, Lij3;->q()Lih3;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-virtual {v1}, Lwg3;->A()V

    .line 208
    .line 209
    .line 210
    iget v1, v1, Lih3;->e:I

    .line 211
    .line 212
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-virtual {v2}, Lbj3;->y()V

    .line 217
    .line 218
    .line 219
    if-le v7, v1, :cond_6

    .line 220
    .line 221
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    iget-object p0, p0, Luh3;->f:Lsh3;

    .line 226
    .line 227
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    const-string v2, "Panic: can\'t downgrade version. Previous, current version"

    .line 236
    .line 237
    invoke-virtual {p0, v0, v2, v1}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    return-void

    .line 241
    :cond_6
    if-ge v7, v1, :cond_b

    .line 242
    .line 243
    iget-object v2, p0, Lmp3;->i0:Ljava/nio/channels/FileChannel;

    .line 244
    .line 245
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 246
    .line 247
    .line 248
    move-result-object v8

    .line 249
    invoke-virtual {v8}, Lbj3;->y()V

    .line 250
    .line 251
    .line 252
    if-eqz v2, :cond_9

    .line 253
    .line 254
    invoke-virtual {v2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->isOpen()Z

    .line 255
    .line 256
    .line 257
    move-result v8

    .line 258
    if-nez v8, :cond_7

    .line 259
    .line 260
    goto :goto_7

    .line 261
    :cond_7
    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 269
    .line 270
    .line 271
    :try_start_2
    invoke-virtual {v2, v4, v5}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2, v3}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2, v0}, Ljava/nio/channels/FileChannel;->force(Z)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    .line 281
    .line 282
    .line 283
    move-result-wide v3

    .line 284
    const-wide/16 v5, 0x4

    .line 285
    .line 286
    cmp-long v0, v3, v5

    .line 287
    .line 288
    if-eqz v0, :cond_8

    .line 289
    .line 290
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 295
    .line 296
    const-string v3, "Error writing to channel. Bytes written"

    .line 297
    .line 298
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    .line 299
    .line 300
    .line 301
    move-result-wide v4

    .line 302
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    invoke-virtual {v0, v2, v3}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 307
    .line 308
    .line 309
    goto :goto_5

    .line 310
    :catch_1
    move-exception v0

    .line 311
    goto :goto_6

    .line 312
    :cond_8
    :goto_5
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    iget-object p0, p0, Luh3;->Y:Lsh3;

    .line 317
    .line 318
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    const-string v2, "Storage version upgraded. Previous, current version"

    .line 327
    .line 328
    invoke-virtual {p0, v0, v2, v1}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    return-void

    .line 332
    :goto_6
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    iget-object v2, v2, Luh3;->f:Lsh3;

    .line 337
    .line 338
    const-string v3, "Failed to write to channel"

    .line 339
    .line 340
    invoke-virtual {v2, v0, v3}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    goto :goto_8

    .line 344
    :cond_9
    :goto_7
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 349
    .line 350
    invoke-virtual {v0, v3}, Lsh3;->a(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    :goto_8
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 354
    .line 355
    .line 356
    move-result-object p0

    .line 357
    iget-object p0, p0, Luh3;->f:Lsh3;

    .line 358
    .line 359
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    const-string v2, "Storage version upgrade failed. Previous, current version"

    .line 368
    .line 369
    invoke-virtual {p0, v0, v2, v1}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    return-void

    .line 373
    :catch_2
    move-exception v0

    .line 374
    goto :goto_9

    .line 375
    :catch_3
    move-exception v0

    .line 376
    goto :goto_a

    .line 377
    :catch_4
    move-exception v0

    .line 378
    goto :goto_b

    .line 379
    :cond_a
    :try_start_3
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 384
    .line 385
    const-string v1, "Storage concurrent data access panic"

    .line 386
    .line 387
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/nio/channels/OverlappingFileLockException; {:try_start_3 .. :try_end_3} :catch_2

    .line 388
    .line 389
    .line 390
    goto :goto_c

    .line 391
    :goto_9
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 392
    .line 393
    .line 394
    move-result-object p0

    .line 395
    iget-object p0, p0, Luh3;->w:Lsh3;

    .line 396
    .line 397
    const-string v1, "Storage lock already acquired"

    .line 398
    .line 399
    invoke-virtual {p0, v0, v1}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    goto :goto_c

    .line 403
    :goto_a
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 404
    .line 405
    .line 406
    move-result-object p0

    .line 407
    iget-object p0, p0, Luh3;->f:Lsh3;

    .line 408
    .line 409
    const-string v1, "Failed to access storage lock file"

    .line 410
    .line 411
    invoke-virtual {p0, v0, v1}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    goto :goto_c

    .line 415
    :goto_b
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 416
    .line 417
    .line 418
    move-result-object p0

    .line 419
    iget-object p0, p0, Luh3;->f:Lsh3;

    .line 420
    .line 421
    const-string v1, "Failed to acquire storage lock"

    .line 422
    .line 423
    invoke-virtual {p0, v0, v1}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    :cond_b
    :goto_c
    return-void
.end method

.method public final D(Ljava/lang/String;Lac3;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lmp3;->a:Lvi3;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lvi3;->U(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgf;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    sget-object v3, Lnk3;->e:Lnk3;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    sget-object p0, Lrd3;->U:Lrd3;

    .line 13
    .line 14
    invoke-virtual {p2, v3, p0}, Lac3;->g(Lnk3;Lrd3;)V

    .line 15
    .line 16
    .line 17
    return v2

    .line 18
    :cond_0
    iget-object p0, p0, Lmp3;->c:Lae3;

    .line 19
    .line 20
    invoke-static {p0}, Lmp3;->S(Lwo3;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lae3;->D0(Ljava/lang/String;)Ldi3;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Ldi3;->s()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Lfs0;->y(Ljava/lang/String;)Lfs0;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Llk3;

    .line 40
    .line 41
    sget-object v1, Llk3;->c:Llk3;

    .line 42
    .line 43
    if-ne p0, v1, :cond_1

    .line 44
    .line 45
    invoke-virtual {v0, p1, v3}, Lvi3;->D(Ljava/lang/String;Lnk3;)Llk3;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    sget-object v1, Llk3;->b:Llk3;

    .line 50
    .line 51
    if-eq p0, v1, :cond_1

    .line 52
    .line 53
    sget-object p1, Lrd3;->w:Lrd3;

    .line 54
    .line 55
    invoke-virtual {p2, v3, p1}, Lac3;->g(Lnk3;Lrd3;)V

    .line 56
    .line 57
    .line 58
    sget-object p1, Llk3;->e:Llk3;

    .line 59
    .line 60
    if-ne p0, p1, :cond_2

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    sget-object p0, Lrd3;->c:Lrd3;

    .line 64
    .line 65
    invoke-virtual {p2, v3, p0}, Lac3;->g(Lnk3;Lrd3;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p1, v3}, Lvi3;->T(Ljava/lang/String;Lnk3;)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-eqz p0, :cond_2

    .line 73
    .line 74
    :goto_0
    const/4 p0, 0x0

    .line 75
    return p0

    .line 76
    :cond_2
    return v2
.end method

.method public final E(Lcom/google/android/gms/internal/measurement/zzhs;)Ljava/util/HashMap;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lmp3;->i0()Lci3;

    .line 7
    .line 8
    .line 9
    new-instance p0, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzhs;->zza()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzhw;->zzb()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-string v3, "gad_"

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    invoke-static {v1}, Lci3;->O(Lcom/google/android/gms/internal/measurement/zzhw;)Ljava/io/Serializable;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzhw;->zzb()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {p0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, Ljava/util/Map$Entry;

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Ljava/lang/String;

    .line 85
    .line 86
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    return-object v0
.end method

.method public final F()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lbj3;->y()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lmp3;->b0:Ljava/util/LinkedList;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    iget-object v0, p0, Lmp3;->s0:Ldo3;

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lmp3;->W:Lij3;

    .line 22
    .line 23
    new-instance v2, Ldo3;

    .line 24
    .line 25
    invoke-direct {v2, p0, v0, v1}, Ldo3;-><init>(Ljava/lang/Object;Ljk3;I)V

    .line 26
    .line 27
    .line 28
    iput-object v2, p0, Lmp3;->s0:Ldo3;

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lmp3;->s0:Ldo3;

    .line 31
    .line 32
    iget-wide v2, v0, Lbe3;->c:J

    .line 33
    .line 34
    const-wide/16 v4, 0x0

    .line 35
    .line 36
    cmp-long v0, v2, v4

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    invoke-virtual {p0}, Lmp3;->f()Lxv;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lxt0;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    iget-wide v6, p0, Lmp3;->t0:J

    .line 55
    .line 56
    sub-long/2addr v2, v6

    .line 57
    sget-object v0, Lvg3;->B0:Lug3;

    .line 58
    .line 59
    const/4 v6, 0x0

    .line 60
    invoke-virtual {v0, v6}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    int-to-long v6, v0

    .line 71
    sub-long/2addr v6, v2

    .line 72
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 73
    .line 74
    .line 75
    move-result-wide v2

    .line 76
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 81
    .line 82
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    const-string v5, "Scheduling notify next app runnable, delay in ms"

    .line 87
    .line 88
    invoke-virtual {v0, v4, v5}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget-object v0, p0, Lmp3;->s0:Ldo3;

    .line 92
    .line 93
    if-nez v0, :cond_2

    .line 94
    .line 95
    iget-object v0, p0, Lmp3;->W:Lij3;

    .line 96
    .line 97
    new-instance v4, Ldo3;

    .line 98
    .line 99
    invoke-direct {v4, p0, v0, v1}, Ldo3;-><init>(Ljava/lang/Object;Ljk3;I)V

    .line 100
    .line 101
    .line 102
    iput-object v4, p0, Lmp3;->s0:Ldo3;

    .line 103
    .line 104
    :cond_2
    iget-object p0, p0, Lmp3;->s0:Ldo3;

    .line 105
    .line 106
    invoke-virtual {p0, v2, v3}, Lbe3;->b(J)V

    .line 107
    .line 108
    .line 109
    :cond_3
    return-void
.end method

.method public final G(Ljava/lang/String;J)Z
    .locals 47

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "1"

    .line 4
    .line 5
    const-string v2, "_ai"

    .line 6
    .line 7
    const-string v3, "purchase"

    .line 8
    .line 9
    const-string v4, "items"

    .line 10
    .line 11
    const-wide/16 v5, 0x1

    .line 12
    .line 13
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object v7

    .line 17
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 18
    .line 19
    .line 20
    move-result-object v8

    .line 21
    invoke-virtual {v8}, Lae3;->n0()V

    .line 22
    .line 23
    .line 24
    :try_start_0
    new-instance v15, Lji3;

    .line 25
    .line 26
    invoke-direct {v15, v1}, Lji3;-><init>(Lmp3;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 30
    .line 31
    .line 32
    move-result-object v9

    .line 33
    iget-wide v13, v1, Lmp3;->l0:J

    .line 34
    .line 35
    move-object/from16 v10, p1

    .line 36
    .line 37
    move-wide/from16 v11, p2

    .line 38
    .line 39
    invoke-virtual/range {v9 .. v15}, Lae3;->l0(Ljava/lang/String;JJLji3;)V

    .line 40
    .line 41
    .line 42
    iget-object v8, v15, Lji3;->d:Ljava/io/Serializable;

    .line 43
    .line 44
    check-cast v8, Ljava/util/ArrayList;

    .line 45
    .line 46
    if-eqz v8, :cond_0

    .line 47
    .line 48
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    if-eqz v8, :cond_1

    .line 53
    .line 54
    :cond_0
    const/4 v4, 0x0

    .line 55
    goto/16 :goto_41

    .line 56
    .line 57
    :cond_1
    iget-object v8, v15, Lji3;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v8, Lcom/google/android/gms/internal/measurement/zzid;

    .line 60
    .line 61
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzme;->zzcl()Lcom/google/android/gms/internal/measurement/zzma;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    check-cast v8, Lcom/google/android/gms/internal/measurement/zzic;

    .line 66
    .line 67
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzi()Lcom/google/android/gms/internal/measurement/zzic;

    .line 68
    .line 69
    .line 70
    const/4 v9, -0x1

    .line 71
    const/4 v11, -0x1

    .line 72
    const/4 v12, 0x0

    .line 73
    const/4 v13, 0x0

    .line 74
    const/4 v14, 0x0

    .line 75
    const/16 v16, 0x0

    .line 76
    .line 77
    const/16 v17, 0x0

    .line 78
    .line 79
    const/16 v18, 0x0

    .line 80
    .line 81
    :goto_0
    iget-object v10, v15, Lji3;->d:Ljava/io/Serializable;

    .line 82
    .line 83
    check-cast v10, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 86
    .line 87
    .line 88
    move-result v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    const-string v5, "_et"

    .line 90
    .line 91
    const-string v6, "_fr"

    .line 92
    .line 93
    move/from16 v21, v13

    .line 94
    .line 95
    const-string v13, "_e"

    .line 96
    .line 97
    move/from16 v22, v14

    .line 98
    .line 99
    iget-object v14, v1, Lmp3;->W:Lij3;

    .line 100
    .line 101
    move-object/from16 v23, v14

    .line 102
    .line 103
    const-string v14, "_c"

    .line 104
    .line 105
    move-object/from16 v24, v7

    .line 106
    .line 107
    if-ge v12, v10, :cond_30

    .line 108
    .line 109
    :try_start_1
    iget-object v10, v15, Lji3;->d:Ljava/io/Serializable;

    .line 110
    .line 111
    check-cast v10, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    check-cast v10, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 118
    .line 119
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzme;->zzcl()Lcom/google/android/gms/internal/measurement/zzma;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    check-cast v10, Lcom/google/android/gms/internal/measurement/zzhr;

    .line 124
    .line 125
    const/16 v25, 0x1

    .line 126
    .line 127
    invoke-virtual {v1}, Lmp3;->e0()Lvi3;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    move/from16 v26, v12

    .line 132
    .line 133
    iget-object v12, v15, Lji3;->b:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v12, Lcom/google/android/gms/internal/measurement/zzid;

    .line 136
    .line 137
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    move-object/from16 v27, v4

    .line 142
    .line 143
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-virtual {v7, v12, v4}, Lvi3;->O(Ljava/lang/String;Ljava/lang/String;)Z

    .line 148
    .line 149
    .line 150
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 151
    const-string v7, "_err"

    .line 152
    .line 153
    if-eqz v4, :cond_4

    .line 154
    .line 155
    :try_start_2
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-virtual {v4}, Luh3;->E()Lsh3;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    const-string v5, "Dropping blocked raw event. appId"

    .line 164
    .line 165
    iget-object v6, v15, Lji3;->b:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v6, Lcom/google/android/gms/internal/measurement/zzid;

    .line 168
    .line 169
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    invoke-static {v6}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-virtual/range {v23 .. v23}, Lij3;->m()Lmh3;

    .line 178
    .line 179
    .line 180
    move-result-object v12

    .line 181
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v13

    .line 185
    invoke-virtual {v12, v13}, Lmh3;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v12

    .line 189
    invoke-virtual {v4, v6, v5, v12}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1}, Lmp3;->e0()Lvi3;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    iget-object v5, v15, Lji3;->b:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v5, Lcom/google/android/gms/internal/measurement/zzid;

    .line 199
    .line 200
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    const-string v6, "measurement.upload.blacklist_internal"

    .line 205
    .line 206
    invoke-virtual {v4, v5, v6}, Lvi3;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    if-nez v4, :cond_3

    .line 215
    .line 216
    invoke-virtual {v1}, Lmp3;->e0()Lvi3;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    iget-object v5, v15, Lji3;->b:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v5, Lcom/google/android/gms/internal/measurement/zzid;

    .line 223
    .line 224
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    const-string v6, "measurement.upload.blacklist_public"

    .line 229
    .line 230
    invoke-virtual {v4, v5, v6}, Lvi3;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    if-eqz v4, :cond_2

    .line 239
    .line 240
    goto :goto_1

    .line 241
    :cond_2
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    if-nez v4, :cond_3

    .line 250
    .line 251
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 252
    .line 253
    .line 254
    iget-object v4, v1, Lmp3;->u0:Lac3;

    .line 255
    .line 256
    iget-object v5, v15, Lji3;->b:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v5, Lcom/google/android/gms/internal/measurement/zzid;

    .line 259
    .line 260
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v29

    .line 264
    const-string v31, "_ev"

    .line 265
    .line 266
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v32

    .line 270
    const/16 v33, 0x0

    .line 271
    .line 272
    const/16 v30, 0xb

    .line 273
    .line 274
    move-object/from16 v28, v4

    .line 275
    .line 276
    invoke-static/range {v28 .. v33}, Lup3;->P(Lac3;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 277
    .line 278
    .line 279
    goto :goto_1

    .line 280
    :catchall_0
    move-exception v0

    .line 281
    goto/16 :goto_43

    .line 282
    .line 283
    :cond_3
    :goto_1
    move-object/from16 v30, v2

    .line 284
    .line 285
    move-object/from16 v31, v3

    .line 286
    .line 287
    move/from16 v13, v21

    .line 288
    .line 289
    move/from16 v4, v26

    .line 290
    .line 291
    move-object/from16 v7, v27

    .line 292
    .line 293
    :goto_2
    move/from16 v14, v22

    .line 294
    .line 295
    goto/16 :goto_1c

    .line 296
    .line 297
    :cond_4
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 305
    move/from16 v28, v12

    .line 306
    .line 307
    const-string v12, "ecommerce_purchase"

    .line 308
    .line 309
    move/from16 v29, v11

    .line 310
    .line 311
    const-string v11, "_iap"

    .line 312
    .line 313
    if-nez v28, :cond_6

    .line 314
    .line 315
    :try_start_3
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v28

    .line 319
    if-nez v28, :cond_6

    .line 320
    .line 321
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v4

    .line 325
    if-eqz v4, :cond_5

    .line 326
    .line 327
    goto :goto_3

    .line 328
    :cond_5
    move-object/from16 v28, v5

    .line 329
    .line 330
    goto :goto_5

    .line 331
    :cond_6
    :goto_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzhw;->zzn()Lcom/google/android/gms/internal/measurement/zzhv;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    move-object/from16 v28, v5

    .line 336
    .line 337
    const-string v5, "_ct"

    .line 338
    .line 339
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/zzhv;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 340
    .line 341
    .line 342
    if-nez v22, :cond_7

    .line 343
    .line 344
    iget-object v5, v15, Lji3;->b:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v5, Lcom/google/android/gms/internal/measurement/zzid;

    .line 347
    .line 348
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    invoke-virtual {v1, v5, v3}, Lmp3;->P(Ljava/lang/String;Ljava/lang/String;)Z

    .line 353
    .line 354
    .line 355
    move-result v22

    .line 356
    if-eqz v22, :cond_7

    .line 357
    .line 358
    invoke-virtual {v1, v5, v11}, Lmp3;->P(Ljava/lang/String;Ljava/lang/String;)Z

    .line 359
    .line 360
    .line 361
    move-result v11

    .line 362
    if-eqz v11, :cond_7

    .line 363
    .line 364
    invoke-virtual {v1, v5, v12}, Lmp3;->P(Ljava/lang/String;Ljava/lang/String;)Z

    .line 365
    .line 366
    .line 367
    move-result v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 368
    if-eqz v5, :cond_7

    .line 369
    .line 370
    const-string v5, "new"

    .line 371
    .line 372
    goto :goto_4

    .line 373
    :cond_7
    const-string v5, "returning"

    .line 374
    .line 375
    :goto_4
    :try_start_4
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/zzhv;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 383
    .line 384
    invoke-virtual {v10, v4}, Lcom/google/android/gms/internal/measurement/zzhr;->zzf(Lcom/google/android/gms/internal/measurement/zzhw;)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 385
    .line 386
    .line 387
    move/from16 v22, v25

    .line 388
    .line 389
    :goto_5
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v4

    .line 393
    sget-object v5, Li13;->h:[Ljava/lang/String;

    .line 394
    .line 395
    sget-object v11, Li13;->f:[Ljava/lang/String;

    .line 396
    .line 397
    invoke-static {v2, v5, v11}, Lqj3;->V(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v5

    .line 401
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v4

    .line 405
    if-eqz v4, :cond_9

    .line 406
    .line 407
    invoke-virtual {v10, v2}, Lcom/google/android/gms/internal/measurement/zzhr;->zzl(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 411
    .line 412
    .line 413
    move-result-object v4

    .line 414
    invoke-virtual {v4}, Luh3;->G()Lsh3;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    const-string v5, "Renaming ad_impression to _ai"

    .line 419
    .line 420
    invoke-virtual {v4, v5}, Lsh3;->a(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 424
    .line 425
    .line 426
    move-result-object v4

    .line 427
    invoke-virtual {v4}, Luh3;->J()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    const/4 v5, 0x5

    .line 432
    invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 433
    .line 434
    .line 435
    move-result v4

    .line 436
    if-eqz v4, :cond_9

    .line 437
    .line 438
    const/4 v4, 0x0

    .line 439
    :goto_6
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzb()I

    .line 440
    .line 441
    .line 442
    move-result v5

    .line 443
    if-ge v4, v5, :cond_9

    .line 444
    .line 445
    const-string v5, "ad_platform"

    .line 446
    .line 447
    invoke-virtual {v10, v4}, Lcom/google/android/gms/internal/measurement/zzhr;->zzc(I)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 448
    .line 449
    .line 450
    move-result-object v11

    .line 451
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzhw;->zzb()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v11

    .line 455
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v5

    .line 459
    if-eqz v5, :cond_8

    .line 460
    .line 461
    invoke-virtual {v10, v4}, Lcom/google/android/gms/internal/measurement/zzhr;->zzc(I)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 462
    .line 463
    .line 464
    move-result-object v5

    .line 465
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhw;->zzd()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v5

    .line 469
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 470
    .line 471
    .line 472
    move-result v5

    .line 473
    if-nez v5, :cond_8

    .line 474
    .line 475
    const-string v5, "admob"

    .line 476
    .line 477
    invoke-virtual {v10, v4}, Lcom/google/android/gms/internal/measurement/zzhr;->zzc(I)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 478
    .line 479
    .line 480
    move-result-object v11

    .line 481
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzhw;->zzd()Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v11

    .line 485
    invoke-virtual {v5, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 486
    .line 487
    .line 488
    move-result v5

    .line 489
    if-eqz v5, :cond_8

    .line 490
    .line 491
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 492
    .line 493
    .line 494
    move-result-object v5

    .line 495
    iget-object v5, v5, Luh3;->V:Lsh3;

    .line 496
    .line 497
    const-string v11, "AdMob ad impression logged from app. Potentially duplicative."

    .line 498
    .line 499
    invoke-virtual {v5, v11}, Lsh3;->a(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 503
    .line 504
    goto :goto_6

    .line 505
    :cond_9
    invoke-virtual {v1}, Lmp3;->e0()Lvi3;

    .line 506
    .line 507
    .line 508
    move-result-object v4

    .line 509
    iget-object v5, v15, Lji3;->b:Ljava/lang/Object;

    .line 510
    .line 511
    check-cast v5, Lcom/google/android/gms/internal/measurement/zzid;

    .line 512
    .line 513
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v5

    .line 517
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v11

    .line 521
    invoke-virtual {v4, v5, v11}, Lvi3;->P(Ljava/lang/String;Ljava/lang/String;)Z

    .line 522
    .line 523
    .line 524
    move-result v4

    .line 525
    if-nez v4, :cond_b

    .line 526
    .line 527
    invoke-virtual {v1}, Lmp3;->i0()Lci3;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v5

    .line 534
    invoke-static {v5}, Lkb1;->k(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 538
    .line 539
    .line 540
    move-result v11
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 541
    const v12, 0x17333

    .line 542
    .line 543
    .line 544
    if-eq v11, v12, :cond_a

    .line 545
    .line 546
    goto :goto_7

    .line 547
    :cond_a
    const-string v11, "_ui"

    .line 548
    .line 549
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    move-result v5

    .line 553
    if-eqz v5, :cond_c

    .line 554
    .line 555
    :cond_b
    move-object/from16 v30, v2

    .line 556
    .line 557
    const/4 v5, 0x0

    .line 558
    const/4 v11, 0x0

    .line 559
    const/4 v12, 0x0

    .line 560
    goto :goto_8

    .line 561
    :cond_c
    :goto_7
    move-object/from16 v30, v2

    .line 562
    .line 563
    move-object/from16 v31, v3

    .line 564
    .line 565
    const/16 v32, 0x0

    .line 566
    .line 567
    goto/16 :goto_d

    .line 568
    .line 569
    :goto_8
    :try_start_5
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzb()I

    .line 570
    .line 571
    .line 572
    move-result v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 573
    move-object/from16 v31, v3

    .line 574
    .line 575
    const-string v3, "_r"

    .line 576
    .line 577
    if-ge v5, v2, :cond_f

    .line 578
    .line 579
    :try_start_6
    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/measurement/zzhr;->zzc(I)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzhw;->zzb()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    move-result v2

    .line 591
    if-eqz v2, :cond_d

    .line 592
    .line 593
    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/measurement/zzhr;->zzc(I)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 594
    .line 595
    .line 596
    move-result-object v2

    .line 597
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzme;->zzcl()Lcom/google/android/gms/internal/measurement/zzma;

    .line 598
    .line 599
    .line 600
    move-result-object v2

    .line 601
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzhv;

    .line 602
    .line 603
    move/from16 v32, v4

    .line 604
    .line 605
    const-wide/16 v3, 0x1

    .line 606
    .line 607
    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzhv;->zzf(J)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 608
    .line 609
    .line 610
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 615
    .line 616
    invoke-virtual {v10, v5, v2}, Lcom/google/android/gms/internal/measurement/zzhr;->zzd(ILcom/google/android/gms/internal/measurement/zzhw;)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 617
    .line 618
    .line 619
    move/from16 v11, v25

    .line 620
    .line 621
    goto :goto_9

    .line 622
    :cond_d
    move/from16 v32, v4

    .line 623
    .line 624
    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/measurement/zzhr;->zzc(I)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzhw;->zzb()Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object v2

    .line 632
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 633
    .line 634
    .line 635
    move-result v2

    .line 636
    if-eqz v2, :cond_e

    .line 637
    .line 638
    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/measurement/zzhr;->zzc(I)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 639
    .line 640
    .line 641
    move-result-object v2

    .line 642
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzme;->zzcl()Lcom/google/android/gms/internal/measurement/zzma;

    .line 643
    .line 644
    .line 645
    move-result-object v2

    .line 646
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzhv;

    .line 647
    .line 648
    const-wide/16 v3, 0x1

    .line 649
    .line 650
    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzhv;->zzf(J)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 651
    .line 652
    .line 653
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 654
    .line 655
    .line 656
    move-result-object v2

    .line 657
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 658
    .line 659
    invoke-virtual {v10, v5, v2}, Lcom/google/android/gms/internal/measurement/zzhr;->zzd(ILcom/google/android/gms/internal/measurement/zzhw;)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 660
    .line 661
    .line 662
    move/from16 v12, v25

    .line 663
    .line 664
    :cond_e
    :goto_9
    add-int/lit8 v5, v5, 0x1

    .line 665
    .line 666
    move-object/from16 v3, v31

    .line 667
    .line 668
    move/from16 v4, v32

    .line 669
    .line 670
    goto :goto_8

    .line 671
    :cond_f
    move/from16 v32, v4

    .line 672
    .line 673
    if-nez v11, :cond_10

    .line 674
    .line 675
    if-eqz v32, :cond_10

    .line 676
    .line 677
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 678
    .line 679
    .line 680
    move-result-object v2

    .line 681
    invoke-virtual {v2}, Luh3;->G()Lsh3;

    .line 682
    .line 683
    .line 684
    move-result-object v2

    .line 685
    const-string v4, "Marking event as conversion"

    .line 686
    .line 687
    invoke-virtual/range {v23 .. v23}, Lij3;->m()Lmh3;

    .line 688
    .line 689
    .line 690
    move-result-object v5

    .line 691
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v11

    .line 695
    invoke-virtual {v5, v11}, Lmh3;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v5

    .line 699
    invoke-virtual {v2, v5, v4}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzhw;->zzn()Lcom/google/android/gms/internal/measurement/zzhv;

    .line 703
    .line 704
    .line 705
    move-result-object v2

    .line 706
    invoke-virtual {v2, v14}, Lcom/google/android/gms/internal/measurement/zzhv;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 707
    .line 708
    .line 709
    const-wide/16 v4, 0x1

    .line 710
    .line 711
    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/internal/measurement/zzhv;->zzf(J)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 712
    .line 713
    .line 714
    invoke-virtual {v10, v2}, Lcom/google/android/gms/internal/measurement/zzhr;->zzg(Lcom/google/android/gms/internal/measurement/zzhv;)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 715
    .line 716
    .line 717
    :cond_10
    if-nez v12, :cond_11

    .line 718
    .line 719
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 720
    .line 721
    .line 722
    move-result-object v2

    .line 723
    invoke-virtual {v2}, Luh3;->G()Lsh3;

    .line 724
    .line 725
    .line 726
    move-result-object v2

    .line 727
    const-string v4, "Marking event as real-time"

    .line 728
    .line 729
    invoke-virtual/range {v23 .. v23}, Lij3;->m()Lmh3;

    .line 730
    .line 731
    .line 732
    move-result-object v5

    .line 733
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v11

    .line 737
    invoke-virtual {v5, v11}, Lmh3;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v5

    .line 741
    invoke-virtual {v2, v5, v4}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzhw;->zzn()Lcom/google/android/gms/internal/measurement/zzhv;

    .line 745
    .line 746
    .line 747
    move-result-object v2

    .line 748
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/measurement/zzhv;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 749
    .line 750
    .line 751
    const-wide/16 v4, 0x1

    .line 752
    .line 753
    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/internal/measurement/zzhv;->zzf(J)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 754
    .line 755
    .line 756
    invoke-virtual {v10, v2}, Lcom/google/android/gms/internal/measurement/zzhr;->zzg(Lcom/google/android/gms/internal/measurement/zzhv;)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 757
    .line 758
    .line 759
    :cond_11
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 760
    .line 761
    .line 762
    move-result-object v33

    .line 763
    invoke-virtual {v1}, Lmp3;->g()J

    .line 764
    .line 765
    .line 766
    move-result-wide v39

    .line 767
    iget-object v2, v15, Lji3;->b:Ljava/lang/Object;

    .line 768
    .line 769
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzid;

    .line 770
    .line 771
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v38

    .line 775
    const/16 v36, 0x0

    .line 776
    .line 777
    const/16 v37, 0x0

    .line 778
    .line 779
    const/16 v34, 0x0

    .line 780
    .line 781
    const/16 v35, 0x1

    .line 782
    .line 783
    invoke-virtual/range {v33 .. v40}, Lae3;->F0(ZZZZLjava/lang/String;J)Lud3;

    .line 784
    .line 785
    .line 786
    move-result-object v2

    .line 787
    iget-wide v4, v2, Lud3;->e:J

    .line 788
    .line 789
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 790
    .line 791
    .line 792
    move-result-object v2

    .line 793
    iget-object v11, v15, Lji3;->b:Ljava/lang/Object;

    .line 794
    .line 795
    check-cast v11, Lcom/google/android/gms/internal/measurement/zzid;

    .line 796
    .line 797
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v11

    .line 801
    sget-object v12, Lvg3;->p:Lug3;

    .line 802
    .line 803
    invoke-virtual {v2, v11, v12}, Lpd3;->H(Ljava/lang/String;Lug3;)I

    .line 804
    .line 805
    .line 806
    move-result v2

    .line 807
    int-to-long v11, v2

    .line 808
    cmp-long v2, v4, v11

    .line 809
    .line 810
    if-lez v2, :cond_12

    .line 811
    .line 812
    invoke-static {v10, v3}, Lmp3;->C(Lcom/google/android/gms/internal/measurement/zzhr;Ljava/lang/String;)V

    .line 813
    .line 814
    .line 815
    goto :goto_a

    .line 816
    :cond_12
    move/from16 v16, v25

    .line 817
    .line 818
    :goto_a
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v2

    .line 822
    invoke-static {v2}, Lup3;->x0(Ljava/lang/String;)Z

    .line 823
    .line 824
    .line 825
    move-result v2

    .line 826
    if-eqz v2, :cond_19

    .line 827
    .line 828
    if-eqz v32, :cond_19

    .line 829
    .line 830
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 831
    .line 832
    .line 833
    move-result-object v33

    .line 834
    invoke-virtual {v1}, Lmp3;->g()J

    .line 835
    .line 836
    .line 837
    move-result-wide v39

    .line 838
    iget-object v2, v15, Lji3;->b:Ljava/lang/Object;

    .line 839
    .line 840
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzid;

    .line 841
    .line 842
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v38

    .line 846
    const/16 v36, 0x0

    .line 847
    .line 848
    const/16 v37, 0x0

    .line 849
    .line 850
    const/16 v34, 0x1

    .line 851
    .line 852
    const/16 v35, 0x0

    .line 853
    .line 854
    invoke-virtual/range {v33 .. v40}, Lae3;->F0(ZZZZLjava/lang/String;J)Lud3;

    .line 855
    .line 856
    .line 857
    move-result-object v2

    .line 858
    iget-wide v2, v2, Lud3;->c:J

    .line 859
    .line 860
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 861
    .line 862
    .line 863
    move-result-object v4

    .line 864
    iget-object v5, v15, Lji3;->b:Ljava/lang/Object;

    .line 865
    .line 866
    check-cast v5, Lcom/google/android/gms/internal/measurement/zzid;

    .line 867
    .line 868
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 869
    .line 870
    .line 871
    move-result-object v5

    .line 872
    sget-object v11, Lvg3;->o:Lug3;

    .line 873
    .line 874
    invoke-virtual {v4, v5, v11}, Lpd3;->H(Ljava/lang/String;Lug3;)I

    .line 875
    .line 876
    .line 877
    move-result v4

    .line 878
    int-to-long v4, v4

    .line 879
    cmp-long v2, v2, v4

    .line 880
    .line 881
    if-lez v2, :cond_19

    .line 882
    .line 883
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 884
    .line 885
    .line 886
    move-result-object v2

    .line 887
    invoke-virtual {v2}, Luh3;->E()Lsh3;

    .line 888
    .line 889
    .line 890
    move-result-object v2

    .line 891
    const-string v3, "Too many conversions. Not logging as conversion. appId"

    .line 892
    .line 893
    iget-object v4, v15, Lji3;->b:Ljava/lang/Object;

    .line 894
    .line 895
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzid;

    .line 896
    .line 897
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 898
    .line 899
    .line 900
    move-result-object v4

    .line 901
    invoke-static {v4}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 902
    .line 903
    .line 904
    move-result-object v4

    .line 905
    invoke-virtual {v2, v4, v3}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 906
    .line 907
    .line 908
    const/4 v2, 0x0

    .line 909
    const/4 v3, 0x0

    .line 910
    const/4 v4, 0x0

    .line 911
    const/4 v5, -0x1

    .line 912
    :goto_b
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzb()I

    .line 913
    .line 914
    .line 915
    move-result v11

    .line 916
    if-ge v3, v11, :cond_15

    .line 917
    .line 918
    invoke-virtual {v10, v3}, Lcom/google/android/gms/internal/measurement/zzhr;->zzc(I)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 919
    .line 920
    .line 921
    move-result-object v11

    .line 922
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzhw;->zzb()Ljava/lang/String;

    .line 923
    .line 924
    .line 925
    move-result-object v12

    .line 926
    invoke-virtual {v14, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 927
    .line 928
    .line 929
    move-result v12

    .line 930
    if-eqz v12, :cond_13

    .line 931
    .line 932
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzme;->zzcl()Lcom/google/android/gms/internal/measurement/zzma;

    .line 933
    .line 934
    .line 935
    move-result-object v2

    .line 936
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzhv;

    .line 937
    .line 938
    move v5, v3

    .line 939
    goto :goto_c

    .line 940
    :cond_13
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzhw;->zzb()Ljava/lang/String;

    .line 941
    .line 942
    .line 943
    move-result-object v11

    .line 944
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 945
    .line 946
    .line 947
    move-result v11

    .line 948
    if-eqz v11, :cond_14

    .line 949
    .line 950
    move/from16 v4, v25

    .line 951
    .line 952
    :cond_14
    :goto_c
    add-int/lit8 v3, v3, 0x1

    .line 953
    .line 954
    goto :goto_b

    .line 955
    :cond_15
    if-eqz v4, :cond_17

    .line 956
    .line 957
    if-eqz v2, :cond_16

    .line 958
    .line 959
    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/measurement/zzhr;->zzj(I)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 960
    .line 961
    .line 962
    goto :goto_d

    .line 963
    :cond_16
    const/4 v2, 0x0

    .line 964
    :cond_17
    if-eqz v2, :cond_18

    .line 965
    .line 966
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzma;->zzba()Lcom/google/android/gms/internal/measurement/zzma;

    .line 967
    .line 968
    .line 969
    move-result-object v2

    .line 970
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzhv;

    .line 971
    .line 972
    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/zzhv;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 973
    .line 974
    .line 975
    const-wide/16 v3, 0xa

    .line 976
    .line 977
    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzhv;->zzf(J)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 978
    .line 979
    .line 980
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 981
    .line 982
    .line 983
    move-result-object v2

    .line 984
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 985
    .line 986
    invoke-virtual {v10, v5, v2}, Lcom/google/android/gms/internal/measurement/zzhr;->zzd(ILcom/google/android/gms/internal/measurement/zzhw;)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 987
    .line 988
    .line 989
    goto :goto_d

    .line 990
    :cond_18
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 991
    .line 992
    .line 993
    move-result-object v2

    .line 994
    invoke-virtual {v2}, Luh3;->D()Lsh3;

    .line 995
    .line 996
    .line 997
    move-result-object v2

    .line 998
    const-string v3, "Did not find conversion parameter. appId"

    .line 999
    .line 1000
    iget-object v4, v15, Lji3;->b:Ljava/lang/Object;

    .line 1001
    .line 1002
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzid;

    .line 1003
    .line 1004
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v4

    .line 1008
    invoke-static {v4}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v4

    .line 1012
    invoke-virtual {v2, v4, v3}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1013
    .line 1014
    .line 1015
    :cond_19
    :goto_d
    if-eqz v32, :cond_1e

    .line 1016
    .line 1017
    new-instance v2, Ljava/util/ArrayList;

    .line 1018
    .line 1019
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zza()Ljava/util/List;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v3

    .line 1023
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1024
    .line 1025
    .line 1026
    const/4 v3, 0x0

    .line 1027
    const/4 v4, -0x1

    .line 1028
    const/4 v5, -0x1

    .line 1029
    :goto_e
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1030
    .line 1031
    .line 1032
    move-result v7
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 1033
    const-string v11, "currency"

    .line 1034
    .line 1035
    const-string v12, "value"

    .line 1036
    .line 1037
    if-ge v3, v7, :cond_1c

    .line 1038
    .line 1039
    :try_start_7
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v7

    .line 1043
    check-cast v7, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 1044
    .line 1045
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzhw;->zzb()Ljava/lang/String;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v7

    .line 1049
    invoke-virtual {v12, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1050
    .line 1051
    .line 1052
    move-result v7

    .line 1053
    if-eqz v7, :cond_1a

    .line 1054
    .line 1055
    move v4, v3

    .line 1056
    goto :goto_f

    .line 1057
    :cond_1a
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v7

    .line 1061
    check-cast v7, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 1062
    .line 1063
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzhw;->zzb()Ljava/lang/String;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v7

    .line 1067
    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1068
    .line 1069
    .line 1070
    move-result v7

    .line 1071
    if-eqz v7, :cond_1b

    .line 1072
    .line 1073
    move v5, v3

    .line 1074
    :cond_1b
    :goto_f
    add-int/lit8 v3, v3, 0x1

    .line 1075
    .line 1076
    goto :goto_e

    .line 1077
    :cond_1c
    const/4 v3, -0x1

    .line 1078
    if-ne v4, v3, :cond_1d

    .line 1079
    .line 1080
    goto/16 :goto_12

    .line 1081
    .line 1082
    :cond_1d
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v3

    .line 1086
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 1087
    .line 1088
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzhw;->zze()Z

    .line 1089
    .line 1090
    .line 1091
    move-result v3

    .line 1092
    if-nez v3, :cond_1f

    .line 1093
    .line 1094
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v3

    .line 1098
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 1099
    .line 1100
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzhw;->zzi()Z

    .line 1101
    .line 1102
    .line 1103
    move-result v3

    .line 1104
    if-nez v3, :cond_1f

    .line 1105
    .line 1106
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v2

    .line 1110
    iget-object v2, v2, Luh3;->V:Lsh3;

    .line 1111
    .line 1112
    const-string v3, "Value must be specified with a numeric type."

    .line 1113
    .line 1114
    invoke-virtual {v2, v3}, Lsh3;->a(Ljava/lang/String;)V

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual {v10, v4}, Lcom/google/android/gms/internal/measurement/zzhr;->zzj(I)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 1118
    .line 1119
    .line 1120
    invoke-static {v10, v14}, Lmp3;->C(Lcom/google/android/gms/internal/measurement/zzhr;Ljava/lang/String;)V

    .line 1121
    .line 1122
    .line 1123
    const/16 v2, 0x12

    .line 1124
    .line 1125
    invoke-static {v10, v2, v12}, Lmp3;->c0(Lcom/google/android/gms/internal/measurement/zzhr;ILjava/lang/String;)V

    .line 1126
    .line 1127
    .line 1128
    :cond_1e
    const/4 v3, -0x1

    .line 1129
    goto :goto_12

    .line 1130
    :cond_1f
    const/4 v3, -0x1

    .line 1131
    if-ne v5, v3, :cond_20

    .line 1132
    .line 1133
    goto :goto_11

    .line 1134
    :cond_20
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v2

    .line 1138
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 1139
    .line 1140
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzhw;->zzd()Ljava/lang/String;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v2

    .line 1144
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1145
    .line 1146
    .line 1147
    move-result v5

    .line 1148
    const/4 v7, 0x3

    .line 1149
    if-ne v5, v7, :cond_21

    .line 1150
    .line 1151
    const/4 v5, 0x0

    .line 1152
    :goto_10
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1153
    .line 1154
    .line 1155
    move-result v7

    .line 1156
    if-ge v5, v7, :cond_22

    .line 1157
    .line 1158
    invoke-virtual {v2, v5}, Ljava/lang/String;->codePointAt(I)I

    .line 1159
    .line 1160
    .line 1161
    move-result v7

    .line 1162
    invoke-static {v7}, Ljava/lang/Character;->isLetter(I)Z

    .line 1163
    .line 1164
    .line 1165
    move-result v12

    .line 1166
    if-eqz v12, :cond_21

    .line 1167
    .line 1168
    invoke-static {v7}, Ljava/lang/Character;->charCount(I)I

    .line 1169
    .line 1170
    .line 1171
    move-result v7

    .line 1172
    add-int/2addr v5, v7

    .line 1173
    goto :goto_10

    .line 1174
    :cond_21
    :goto_11
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v2

    .line 1178
    iget-object v2, v2, Luh3;->V:Lsh3;

    .line 1179
    .line 1180
    const-string v5, "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."

    .line 1181
    .line 1182
    invoke-virtual {v2, v5}, Lsh3;->a(Ljava/lang/String;)V

    .line 1183
    .line 1184
    .line 1185
    invoke-virtual {v10, v4}, Lcom/google/android/gms/internal/measurement/zzhr;->zzj(I)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 1186
    .line 1187
    .line 1188
    invoke-static {v10, v14}, Lmp3;->C(Lcom/google/android/gms/internal/measurement/zzhr;Ljava/lang/String;)V

    .line 1189
    .line 1190
    .line 1191
    const/16 v2, 0x13

    .line 1192
    .line 1193
    invoke-static {v10, v2, v11}, Lmp3;->c0(Lcom/google/android/gms/internal/measurement/zzhr;ILjava/lang/String;)V

    .line 1194
    .line 1195
    .line 1196
    :cond_22
    :goto_12
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v2

    .line 1200
    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1201
    .line 1202
    .line 1203
    move-result v2

    .line 1204
    const-wide/16 v4, 0x3e8

    .line 1205
    .line 1206
    if-eqz v2, :cond_25

    .line 1207
    .line 1208
    invoke-virtual {v1}, Lmp3;->i0()Lci3;

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v2

    .line 1215
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 1216
    .line 1217
    invoke-static {v2, v6}, Lci3;->H(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v2

    .line 1221
    if-nez v2, :cond_24

    .line 1222
    .line 1223
    if-eqz v18, :cond_23

    .line 1224
    .line 1225
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/zzhr;->zzn()J

    .line 1226
    .line 1227
    .line 1228
    move-result-wide v6

    .line 1229
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzn()J

    .line 1230
    .line 1231
    .line 1232
    move-result-wide v11

    .line 1233
    sub-long/2addr v6, v11

    .line 1234
    invoke-static {v6, v7}, Ljava/lang/Math;->abs(J)J

    .line 1235
    .line 1236
    .line 1237
    move-result-wide v6

    .line 1238
    cmp-long v2, v6, v4

    .line 1239
    .line 1240
    if-gtz v2, :cond_23

    .line 1241
    .line 1242
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/zzma;->zzba()Lcom/google/android/gms/internal/measurement/zzma;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v2

    .line 1246
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzhr;

    .line 1247
    .line 1248
    invoke-virtual {v1, v10, v2}, Lmp3;->I(Lcom/google/android/gms/internal/measurement/zzhr;Lcom/google/android/gms/internal/measurement/zzhr;)Z

    .line 1249
    .line 1250
    .line 1251
    move-result v4

    .line 1252
    if-eqz v4, :cond_23

    .line 1253
    .line 1254
    invoke-virtual {v8, v9, v2}, Lcom/google/android/gms/internal/measurement/zzic;->zzf(ILcom/google/android/gms/internal/measurement/zzhr;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1255
    .line 1256
    .line 1257
    move/from16 v11, v29

    .line 1258
    .line 1259
    :goto_13
    const/16 v17, 0x0

    .line 1260
    .line 1261
    const/16 v18, 0x0

    .line 1262
    .line 1263
    goto :goto_15

    .line 1264
    :cond_23
    move-object/from16 v17, v10

    .line 1265
    .line 1266
    move/from16 v11, v21

    .line 1267
    .line 1268
    goto :goto_15

    .line 1269
    :cond_24
    move/from16 v4, v29

    .line 1270
    .line 1271
    goto :goto_14

    .line 1272
    :cond_25
    const-string v2, "_vs"

    .line 1273
    .line 1274
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v6

    .line 1278
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1279
    .line 1280
    .line 1281
    move-result v2

    .line 1282
    if-eqz v2, :cond_24

    .line 1283
    .line 1284
    invoke-virtual {v1}, Lmp3;->i0()Lci3;

    .line 1285
    .line 1286
    .line 1287
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v2

    .line 1291
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 1292
    .line 1293
    move-object/from16 v7, v28

    .line 1294
    .line 1295
    invoke-static {v2, v7}, Lci3;->H(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v2

    .line 1299
    if-nez v2, :cond_24

    .line 1300
    .line 1301
    if-eqz v17, :cond_26

    .line 1302
    .line 1303
    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/zzhr;->zzn()J

    .line 1304
    .line 1305
    .line 1306
    move-result-wide v6

    .line 1307
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzn()J

    .line 1308
    .line 1309
    .line 1310
    move-result-wide v11

    .line 1311
    sub-long/2addr v6, v11

    .line 1312
    invoke-static {v6, v7}, Ljava/lang/Math;->abs(J)J

    .line 1313
    .line 1314
    .line 1315
    move-result-wide v6

    .line 1316
    cmp-long v2, v6, v4

    .line 1317
    .line 1318
    if-gtz v2, :cond_26

    .line 1319
    .line 1320
    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/zzma;->zzba()Lcom/google/android/gms/internal/measurement/zzma;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v2

    .line 1324
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzhr;

    .line 1325
    .line 1326
    invoke-virtual {v1, v2, v10}, Lmp3;->I(Lcom/google/android/gms/internal/measurement/zzhr;Lcom/google/android/gms/internal/measurement/zzhr;)Z

    .line 1327
    .line 1328
    .line 1329
    move-result v4

    .line 1330
    if-eqz v4, :cond_26

    .line 1331
    .line 1332
    move/from16 v4, v29

    .line 1333
    .line 1334
    invoke-virtual {v8, v4, v2}, Lcom/google/android/gms/internal/measurement/zzic;->zzf(ILcom/google/android/gms/internal/measurement/zzhr;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1335
    .line 1336
    .line 1337
    move v11, v4

    .line 1338
    goto :goto_13

    .line 1339
    :cond_26
    move/from16 v4, v29

    .line 1340
    .line 1341
    move v11, v4

    .line 1342
    move-object/from16 v18, v10

    .line 1343
    .line 1344
    move/from16 v9, v21

    .line 1345
    .line 1346
    goto :goto_15

    .line 1347
    :goto_14
    move v11, v4

    .line 1348
    :goto_15
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzb()I

    .line 1349
    .line 1350
    .line 1351
    move-result v2

    .line 1352
    if-eqz v2, :cond_2e

    .line 1353
    .line 1354
    invoke-virtual {v1}, Lmp3;->i0()Lci3;

    .line 1355
    .line 1356
    .line 1357
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zza()Ljava/util/List;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v2

    .line 1361
    invoke-static {v2}, Lci3;->G(Ljava/util/List;)Landroid/os/Bundle;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v2

    .line 1365
    const/4 v4, 0x0

    .line 1366
    :goto_16
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzb()I

    .line 1367
    .line 1368
    .line 1369
    move-result v5

    .line 1370
    if-ge v4, v5, :cond_2b

    .line 1371
    .line 1372
    invoke-virtual {v10, v4}, Lcom/google/android/gms/internal/measurement/zzhr;->zzc(I)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v5

    .line 1376
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhw;->zzb()Ljava/lang/String;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v6

    .line 1380
    move-object/from16 v7, v27

    .line 1381
    .line 1382
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1383
    .line 1384
    .line 1385
    move-result v6

    .line 1386
    if-eqz v6, :cond_29

    .line 1387
    .line 1388
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhw;->zzk()Ljava/util/List;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v6

    .line 1392
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 1393
    .line 1394
    .line 1395
    move-result v6

    .line 1396
    if-nez v6, :cond_29

    .line 1397
    .line 1398
    iget-object v6, v15, Lji3;->b:Ljava/lang/Object;

    .line 1399
    .line 1400
    check-cast v6, Lcom/google/android/gms/internal/measurement/zzid;

    .line 1401
    .line 1402
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v6

    .line 1406
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhw;->zzk()Ljava/util/List;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v5

    .line 1410
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1411
    .line 1412
    .line 1413
    move-result v12

    .line 1414
    new-array v12, v12, [Landroid/os/Bundle;

    .line 1415
    .line 1416
    const/4 v13, 0x0

    .line 1417
    :goto_17
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1418
    .line 1419
    .line 1420
    move-result v14

    .line 1421
    if-ge v13, v14, :cond_28

    .line 1422
    .line 1423
    invoke-interface {v5, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v14

    .line 1427
    check-cast v14, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 1428
    .line 1429
    invoke-virtual {v1}, Lmp3;->i0()Lci3;

    .line 1430
    .line 1431
    .line 1432
    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzhw;->zzk()Ljava/util/List;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v23

    .line 1436
    invoke-static/range {v23 .. v23}, Lci3;->G(Ljava/util/List;)Landroid/os/Bundle;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v3

    .line 1440
    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzhw;->zzk()Ljava/util/List;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v14

    .line 1444
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v14

    .line 1448
    :goto_18
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 1449
    .line 1450
    .line 1451
    move-result v23

    .line 1452
    if-eqz v23, :cond_27

    .line 1453
    .line 1454
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v23

    .line 1458
    check-cast v23, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 1459
    .line 1460
    move/from16 v25, v4

    .line 1461
    .line 1462
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v4

    .line 1466
    invoke-virtual/range {v23 .. v23}, Lcom/google/android/gms/internal/measurement/zzme;->zzcl()Lcom/google/android/gms/internal/measurement/zzma;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v23

    .line 1470
    move-object/from16 v27, v5

    .line 1471
    .line 1472
    move-object/from16 v5, v23

    .line 1473
    .line 1474
    check-cast v5, Lcom/google/android/gms/internal/measurement/zzhv;

    .line 1475
    .line 1476
    invoke-virtual {v1, v4, v5, v3, v6}, Lmp3;->w(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzhv;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 1477
    .line 1478
    .line 1479
    move/from16 v4, v25

    .line 1480
    .line 1481
    move-object/from16 v5, v27

    .line 1482
    .line 1483
    goto :goto_18

    .line 1484
    :cond_27
    move/from16 v25, v4

    .line 1485
    .line 1486
    move-object/from16 v27, v5

    .line 1487
    .line 1488
    aput-object v3, v12, v13

    .line 1489
    .line 1490
    add-int/lit8 v13, v13, 0x1

    .line 1491
    .line 1492
    move/from16 v4, v25

    .line 1493
    .line 1494
    move-object/from16 v5, v27

    .line 1495
    .line 1496
    const/4 v3, -0x1

    .line 1497
    goto :goto_17

    .line 1498
    :cond_28
    move/from16 v25, v4

    .line 1499
    .line 1500
    invoke-virtual {v2, v7, v12}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 1501
    .line 1502
    .line 1503
    goto :goto_19

    .line 1504
    :cond_29
    move/from16 v25, v4

    .line 1505
    .line 1506
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhw;->zzb()Ljava/lang/String;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v3

    .line 1510
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1511
    .line 1512
    .line 1513
    move-result v3

    .line 1514
    if-nez v3, :cond_2a

    .line 1515
    .line 1516
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v3

    .line 1520
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzme;->zzcl()Lcom/google/android/gms/internal/measurement/zzma;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v4

    .line 1524
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzhv;

    .line 1525
    .line 1526
    iget-object v5, v15, Lji3;->b:Ljava/lang/Object;

    .line 1527
    .line 1528
    check-cast v5, Lcom/google/android/gms/internal/measurement/zzid;

    .line 1529
    .line 1530
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v5

    .line 1534
    invoke-virtual {v1, v3, v4, v2, v5}, Lmp3;->w(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzhv;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 1535
    .line 1536
    .line 1537
    :cond_2a
    :goto_19
    add-int/lit8 v4, v25, 0x1

    .line 1538
    .line 1539
    move-object/from16 v27, v7

    .line 1540
    .line 1541
    const/4 v3, -0x1

    .line 1542
    goto/16 :goto_16

    .line 1543
    .line 1544
    :cond_2b
    move-object/from16 v7, v27

    .line 1545
    .line 1546
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzhr;->zzi()Lcom/google/android/gms/internal/measurement/zzhr;

    .line 1547
    .line 1548
    .line 1549
    invoke-virtual {v1}, Lmp3;->i0()Lci3;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v3

    .line 1553
    new-instance v4, Ljava/util/ArrayList;

    .line 1554
    .line 1555
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1556
    .line 1557
    .line 1558
    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v5

    .line 1562
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v5

    .line 1566
    :cond_2c
    :goto_1a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1567
    .line 1568
    .line 1569
    move-result v6

    .line 1570
    if-eqz v6, :cond_2d

    .line 1571
    .line 1572
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v6

    .line 1576
    check-cast v6, Ljava/lang/String;

    .line 1577
    .line 1578
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzhw;->zzn()Lcom/google/android/gms/internal/measurement/zzhv;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v12

    .line 1582
    invoke-virtual {v12, v6}, Lcom/google/android/gms/internal/measurement/zzhv;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 1583
    .line 1584
    .line 1585
    invoke-virtual {v2, v6}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v6

    .line 1589
    if-eqz v6, :cond_2c

    .line 1590
    .line 1591
    invoke-virtual {v3, v12, v6}, Lci3;->Z(Lcom/google/android/gms/internal/measurement/zzhv;Ljava/lang/Object;)V

    .line 1592
    .line 1593
    .line 1594
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v6

    .line 1598
    check-cast v6, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 1599
    .line 1600
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1601
    .line 1602
    .line 1603
    goto :goto_1a

    .line 1604
    :cond_2d
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v2

    .line 1608
    :goto_1b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1609
    .line 1610
    .line 1611
    move-result v3

    .line 1612
    if-eqz v3, :cond_2f

    .line 1613
    .line 1614
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v3

    .line 1618
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 1619
    .line 1620
    invoke-virtual {v10, v3}, Lcom/google/android/gms/internal/measurement/zzhr;->zzf(Lcom/google/android/gms/internal/measurement/zzhw;)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 1621
    .line 1622
    .line 1623
    goto :goto_1b

    .line 1624
    :cond_2e
    move-object/from16 v7, v27

    .line 1625
    .line 1626
    :cond_2f
    iget-object v2, v15, Lji3;->d:Ljava/io/Serializable;

    .line 1627
    .line 1628
    check-cast v2, Ljava/util/ArrayList;

    .line 1629
    .line 1630
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v3

    .line 1634
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 1635
    .line 1636
    move/from16 v4, v26

    .line 1637
    .line 1638
    invoke-virtual {v2, v4, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1639
    .line 1640
    .line 1641
    invoke-virtual {v8, v10}, Lcom/google/android/gms/internal/measurement/zzic;->zzg(Lcom/google/android/gms/internal/measurement/zzhr;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1642
    .line 1643
    .line 1644
    add-int/lit8 v13, v21, 0x1

    .line 1645
    .line 1646
    goto/16 :goto_2

    .line 1647
    .line 1648
    :goto_1c
    add-int/lit8 v12, v4, 0x1

    .line 1649
    .line 1650
    move-object v4, v7

    .line 1651
    move-object/from16 v7, v24

    .line 1652
    .line 1653
    move-object/from16 v2, v30

    .line 1654
    .line 1655
    move-object/from16 v3, v31

    .line 1656
    .line 1657
    const-wide/16 v5, 0x1

    .line 1658
    .line 1659
    goto/16 :goto_0

    .line 1660
    .line 1661
    :cond_30
    move-object v7, v5

    .line 1662
    const/16 v25, 0x1

    .line 1663
    .line 1664
    const-wide/16 v2, 0x0

    .line 1665
    .line 1666
    move-wide v9, v2

    .line 1667
    move/from16 v4, v21

    .line 1668
    .line 1669
    const/4 v0, 0x0

    .line 1670
    :goto_1d
    if-ge v0, v4, :cond_34

    .line 1671
    .line 1672
    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/measurement/zzic;->zzd(I)Lcom/google/android/gms/internal/measurement/zzhs;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v5

    .line 1676
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhs;->zzd()Ljava/lang/String;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v11

    .line 1680
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1681
    .line 1682
    .line 1683
    move-result v11

    .line 1684
    if-eqz v11, :cond_31

    .line 1685
    .line 1686
    invoke-virtual {v1}, Lmp3;->i0()Lci3;

    .line 1687
    .line 1688
    .line 1689
    invoke-static {v5, v6}, Lci3;->H(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 1690
    .line 1691
    .line 1692
    move-result-object v11

    .line 1693
    if-eqz v11, :cond_31

    .line 1694
    .line 1695
    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/measurement/zzic;->zzj(I)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1696
    .line 1697
    .line 1698
    add-int/lit8 v4, v4, -0x1

    .line 1699
    .line 1700
    add-int/lit8 v0, v0, -0x1

    .line 1701
    .line 1702
    goto :goto_1f

    .line 1703
    :cond_31
    invoke-virtual {v1}, Lmp3;->i0()Lci3;

    .line 1704
    .line 1705
    .line 1706
    invoke-static {v5, v7}, Lci3;->H(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v5

    .line 1710
    if-eqz v5, :cond_33

    .line 1711
    .line 1712
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhw;->zze()Z

    .line 1713
    .line 1714
    .line 1715
    move-result v11

    .line 1716
    if-eqz v11, :cond_32

    .line 1717
    .line 1718
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhw;->zzf()J

    .line 1719
    .line 1720
    .line 1721
    move-result-wide v11

    .line 1722
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1723
    .line 1724
    .line 1725
    move-result-object v5

    .line 1726
    goto :goto_1e

    .line 1727
    :cond_32
    const/4 v5, 0x0

    .line 1728
    :goto_1e
    if-eqz v5, :cond_33

    .line 1729
    .line 1730
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 1731
    .line 1732
    .line 1733
    move-result-wide v11

    .line 1734
    cmp-long v11, v11, v2

    .line 1735
    .line 1736
    if-lez v11, :cond_33

    .line 1737
    .line 1738
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 1739
    .line 1740
    .line 1741
    move-result-wide v11

    .line 1742
    add-long/2addr v9, v11

    .line 1743
    :cond_33
    :goto_1f
    add-int/lit8 v0, v0, 0x1

    .line 1744
    .line 1745
    goto :goto_1d

    .line 1746
    :cond_34
    const/4 v4, 0x0

    .line 1747
    invoke-virtual {v1, v8, v9, v10, v4}, Lmp3;->H(Lcom/google/android/gms/internal/measurement/zzic;JZ)V

    .line 1748
    .line 1749
    .line 1750
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzb()Ljava/util/List;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v0

    .line 1754
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v0

    .line 1758
    :cond_35
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1759
    .line 1760
    .line 1761
    move-result v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 1762
    const-string v5, "_se"

    .line 1763
    .line 1764
    if-eqz v4, :cond_36

    .line 1765
    .line 1766
    :try_start_8
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1767
    .line 1768
    .line 1769
    move-result-object v4

    .line 1770
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 1771
    .line 1772
    const-string v6, "_s"

    .line 1773
    .line 1774
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzhs;->zzd()Ljava/lang/String;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v4

    .line 1778
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1779
    .line 1780
    .line 1781
    move-result v4

    .line 1782
    if-eqz v4, :cond_35

    .line 1783
    .line 1784
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v0

    .line 1788
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzK()Ljava/lang/String;

    .line 1789
    .line 1790
    .line 1791
    move-result-object v4

    .line 1792
    invoke-virtual {v0, v4, v5}, Lae3;->t0(Ljava/lang/String;Ljava/lang/String;)V

    .line 1793
    .line 1794
    .line 1795
    :cond_36
    const-string v0, "_sid"

    .line 1796
    .line 1797
    invoke-static {v8, v0}, Lci3;->n0(Lcom/google/android/gms/internal/measurement/zzic;Ljava/lang/String;)I

    .line 1798
    .line 1799
    .line 1800
    move-result v0

    .line 1801
    if-ltz v0, :cond_37

    .line 1802
    .line 1803
    move/from16 v4, v25

    .line 1804
    .line 1805
    invoke-virtual {v1, v8, v9, v10, v4}, Lmp3;->H(Lcom/google/android/gms/internal/measurement/zzic;JZ)V

    .line 1806
    .line 1807
    .line 1808
    goto :goto_20

    .line 1809
    :cond_37
    invoke-static {v8, v5}, Lci3;->n0(Lcom/google/android/gms/internal/measurement/zzic;Ljava/lang/String;)I

    .line 1810
    .line 1811
    .line 1812
    move-result v0

    .line 1813
    if-ltz v0, :cond_38

    .line 1814
    .line 1815
    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/measurement/zzic;->zzr(I)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1816
    .line 1817
    .line 1818
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 1819
    .line 1820
    .line 1821
    move-result-object v0

    .line 1822
    invoke-virtual {v0}, Luh3;->D()Lsh3;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v0

    .line 1826
    const-string v4, "Session engagement user property is in the bundle without session ID. appId"

    .line 1827
    .line 1828
    iget-object v5, v15, Lji3;->b:Ljava/lang/Object;

    .line 1829
    .line 1830
    check-cast v5, Lcom/google/android/gms/internal/measurement/zzid;

    .line 1831
    .line 1832
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v5

    .line 1836
    invoke-static {v5}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v5

    .line 1840
    invoke-virtual {v0, v5, v4}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1841
    .line 1842
    .line 1843
    :cond_38
    :goto_20
    iget-object v0, v15, Lji3;->b:Ljava/lang/Object;

    .line 1844
    .line 1845
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzid;

    .line 1846
    .line 1847
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 1848
    .line 1849
    .line 1850
    move-result-object v0

    .line 1851
    invoke-virtual {v1}, Lmp3;->b()Lbj3;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v4

    .line 1855
    invoke-virtual {v4}, Lbj3;->y()V

    .line 1856
    .line 1857
    .line 1858
    invoke-virtual {v1}, Lmp3;->k0()V

    .line 1859
    .line 1860
    .line 1861
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v4

    .line 1865
    invoke-virtual {v4, v0}, Lae3;->D0(Ljava/lang/String;)Ldi3;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v4

    .line 1869
    if-nez v4, :cond_39

    .line 1870
    .line 1871
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v4

    .line 1875
    invoke-virtual {v4}, Luh3;->D()Lsh3;

    .line 1876
    .line 1877
    .line 1878
    move-result-object v4

    .line 1879
    invoke-static {v0}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 1880
    .line 1881
    .line 1882
    move-result-object v0

    .line 1883
    const-string v5, "Cannot fix consent fields without appInfo. appId"

    .line 1884
    .line 1885
    invoke-virtual {v4, v0, v5}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1886
    .line 1887
    .line 1888
    goto :goto_21

    .line 1889
    :cond_39
    invoke-virtual {v1, v4, v8}, Lmp3;->m(Ldi3;Lcom/google/android/gms/internal/measurement/zzic;)V

    .line 1890
    .line 1891
    .line 1892
    :goto_21
    iget-object v0, v15, Lji3;->b:Ljava/lang/Object;

    .line 1893
    .line 1894
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzid;

    .line 1895
    .line 1896
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v0

    .line 1900
    invoke-virtual {v1}, Lmp3;->b()Lbj3;

    .line 1901
    .line 1902
    .line 1903
    move-result-object v4

    .line 1904
    invoke-virtual {v4}, Lbj3;->y()V

    .line 1905
    .line 1906
    .line 1907
    invoke-virtual {v1}, Lmp3;->k0()V

    .line 1908
    .line 1909
    .line 1910
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 1911
    .line 1912
    .line 1913
    move-result-object v4

    .line 1914
    invoke-virtual {v4, v0}, Lae3;->D0(Ljava/lang/String;)Ldi3;

    .line 1915
    .line 1916
    .line 1917
    move-result-object v4

    .line 1918
    if-nez v4, :cond_3a

    .line 1919
    .line 1920
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 1921
    .line 1922
    .line 1923
    move-result-object v4

    .line 1924
    invoke-virtual {v4}, Luh3;->E()Lsh3;

    .line 1925
    .line 1926
    .line 1927
    move-result-object v4

    .line 1928
    const-string v5, "Cannot populate ad_campaign_info without appInfo. appId"

    .line 1929
    .line 1930
    invoke-static {v0}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 1931
    .line 1932
    .line 1933
    move-result-object v0

    .line 1934
    invoke-virtual {v4, v0, v5}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1935
    .line 1936
    .line 1937
    goto :goto_22

    .line 1938
    :cond_3a
    invoke-virtual {v1, v4, v8}, Lmp3;->n(Ldi3;Lcom/google/android/gms/internal/measurement/zzic;)V

    .line 1939
    .line 1940
    .line 1941
    :goto_22
    invoke-static {v8}, Lmp3;->R(Lcom/google/android/gms/internal/measurement/zzic;)V

    .line 1942
    .line 1943
    .line 1944
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzak()Lcom/google/android/gms/internal/measurement/zzic;

    .line 1945
    .line 1946
    .line 1947
    sget-object v0, Lok3;->c:Lok3;

    .line 1948
    .line 1949
    iget-object v0, v15, Lji3;->b:Ljava/lang/Object;

    .line 1950
    .line 1951
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzid;

    .line 1952
    .line 1953
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 1954
    .line 1955
    .line 1956
    move-result-object v0

    .line 1957
    invoke-virtual {v1, v0}, Lmp3;->d(Ljava/lang/String;)Lok3;

    .line 1958
    .line 1959
    .line 1960
    move-result-object v0

    .line 1961
    iget-object v4, v15, Lji3;->b:Ljava/lang/Object;

    .line 1962
    .line 1963
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzid;

    .line 1964
    .line 1965
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzid;->zzaf()Ljava/lang/String;

    .line 1966
    .line 1967
    .line 1968
    move-result-object v4

    .line 1969
    const/16 v5, 0x64

    .line 1970
    .line 1971
    invoke-static {v5, v4}, Lok3;->c(ILjava/lang/String;)Lok3;

    .line 1972
    .line 1973
    .line 1974
    move-result-object v4

    .line 1975
    invoke-virtual {v0, v4}, Lok3;->j(Lok3;)Lok3;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v0

    .line 1979
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 1980
    .line 1981
    .line 1982
    move-result-object v4

    .line 1983
    iget-object v5, v15, Lji3;->b:Ljava/lang/Object;

    .line 1984
    .line 1985
    check-cast v5, Lcom/google/android/gms/internal/measurement/zzid;

    .line 1986
    .line 1987
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 1988
    .line 1989
    .line 1990
    move-result-object v5

    .line 1991
    invoke-virtual {v4, v5}, Lae3;->i0(Ljava/lang/String;)Lok3;

    .line 1992
    .line 1993
    .line 1994
    move-result-object v4

    .line 1995
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 1996
    .line 1997
    .line 1998
    move-result-object v5

    .line 1999
    iget-object v6, v15, Lji3;->b:Ljava/lang/Object;

    .line 2000
    .line 2001
    check-cast v6, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2002
    .line 2003
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2004
    .line 2005
    .line 2006
    move-result-object v6

    .line 2007
    invoke-virtual {v5, v6, v0}, Lae3;->h0(Ljava/lang/String;Lok3;)V

    .line 2008
    .line 2009
    .line 2010
    sget-object v5, Lnk3;->c:Lnk3;

    .line 2011
    .line 2012
    invoke-virtual {v0, v5}, Lok3;->i(Lnk3;)Z

    .line 2013
    .line 2014
    .line 2015
    move-result v6

    .line 2016
    if-nez v6, :cond_3b

    .line 2017
    .line 2018
    invoke-virtual {v4, v5}, Lok3;->i(Lnk3;)Z

    .line 2019
    .line 2020
    .line 2021
    move-result v6

    .line 2022
    if-eqz v6, :cond_3b

    .line 2023
    .line 2024
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 2025
    .line 2026
    .line 2027
    move-result-object v4

    .line 2028
    iget-object v6, v15, Lji3;->b:Ljava/lang/Object;

    .line 2029
    .line 2030
    check-cast v6, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2031
    .line 2032
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2033
    .line 2034
    .line 2035
    move-result-object v6

    .line 2036
    invoke-virtual {v4, v6}, Lae3;->r0(Ljava/lang/String;)V

    .line 2037
    .line 2038
    .line 2039
    goto :goto_23

    .line 2040
    :cond_3b
    invoke-virtual {v0, v5}, Lok3;->i(Lnk3;)Z

    .line 2041
    .line 2042
    .line 2043
    move-result v6

    .line 2044
    if-eqz v6, :cond_3c

    .line 2045
    .line 2046
    invoke-virtual {v4, v5}, Lok3;->i(Lnk3;)Z

    .line 2047
    .line 2048
    .line 2049
    move-result v4

    .line 2050
    if-nez v4, :cond_3c

    .line 2051
    .line 2052
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 2053
    .line 2054
    .line 2055
    move-result-object v4

    .line 2056
    iget-object v6, v15, Lji3;->b:Ljava/lang/Object;

    .line 2057
    .line 2058
    check-cast v6, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2059
    .line 2060
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2061
    .line 2062
    .line 2063
    move-result-object v6

    .line 2064
    invoke-virtual {v4, v6}, Lae3;->s0(Ljava/lang/String;)V

    .line 2065
    .line 2066
    .line 2067
    :cond_3c
    :goto_23
    sget-object v4, Lnk3;->b:Lnk3;

    .line 2068
    .line 2069
    invoke-virtual {v0, v4}, Lok3;->i(Lnk3;)Z

    .line 2070
    .line 2071
    .line 2072
    move-result v6

    .line 2073
    if-nez v6, :cond_3d

    .line 2074
    .line 2075
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzR()Lcom/google/android/gms/internal/measurement/zzic;

    .line 2076
    .line 2077
    .line 2078
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzU()Lcom/google/android/gms/internal/measurement/zzic;

    .line 2079
    .line 2080
    .line 2081
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzan()Lcom/google/android/gms/internal/measurement/zzic;

    .line 2082
    .line 2083
    .line 2084
    :cond_3d
    invoke-virtual {v0, v5}, Lok3;->i(Lnk3;)Z

    .line 2085
    .line 2086
    .line 2087
    move-result v6

    .line 2088
    if-nez v6, :cond_3e

    .line 2089
    .line 2090
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzX()Lcom/google/android/gms/internal/measurement/zzic;

    .line 2091
    .line 2092
    .line 2093
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzav()Lcom/google/android/gms/internal/measurement/zzic;

    .line 2094
    .line 2095
    .line 2096
    :cond_3e
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzql;->zza()Z

    .line 2097
    .line 2098
    .line 2099
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 2100
    .line 2101
    .line 2102
    move-result-object v6

    .line 2103
    iget-object v7, v15, Lji3;->b:Ljava/lang/Object;

    .line 2104
    .line 2105
    check-cast v7, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2106
    .line 2107
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2108
    .line 2109
    .line 2110
    move-result-object v7

    .line 2111
    sget-object v9, Lvg3;->P0:Lug3;

    .line 2112
    .line 2113
    invoke-virtual {v6, v7, v9}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 2114
    .line 2115
    .line 2116
    move-result v6

    .line 2117
    if-eqz v6, :cond_47

    .line 2118
    .line 2119
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 2120
    .line 2121
    .line 2122
    iget-object v6, v15, Lji3;->b:Ljava/lang/Object;

    .line 2123
    .line 2124
    check-cast v6, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2125
    .line 2126
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2127
    .line 2128
    .line 2129
    move-result-object v6

    .line 2130
    invoke-static {v6}, Lup3;->V(Ljava/lang/String;)Z

    .line 2131
    .line 2132
    .line 2133
    move-result v6

    .line 2134
    if-eqz v6, :cond_47

    .line 2135
    .line 2136
    iget-object v6, v15, Lji3;->b:Ljava/lang/Object;

    .line 2137
    .line 2138
    check-cast v6, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2139
    .line 2140
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2141
    .line 2142
    .line 2143
    move-result-object v6

    .line 2144
    invoke-virtual {v1, v6}, Lmp3;->d(Ljava/lang/String;)Lok3;

    .line 2145
    .line 2146
    .line 2147
    move-result-object v6

    .line 2148
    invoke-virtual {v6, v4}, Lok3;->i(Lnk3;)Z

    .line 2149
    .line 2150
    .line 2151
    move-result v4

    .line 2152
    if-eqz v4, :cond_47

    .line 2153
    .line 2154
    iget-object v4, v15, Lji3;->b:Ljava/lang/Object;

    .line 2155
    .line 2156
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2157
    .line 2158
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzid;->zzak()Z

    .line 2159
    .line 2160
    .line 2161
    move-result v4

    .line 2162
    if-eqz v4, :cond_47

    .line 2163
    .line 2164
    const/4 v4, 0x0

    .line 2165
    :goto_24
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzc()I

    .line 2166
    .line 2167
    .line 2168
    move-result v6

    .line 2169
    if-ge v4, v6, :cond_47

    .line 2170
    .line 2171
    invoke-virtual {v8, v4}, Lcom/google/android/gms/internal/measurement/zzic;->zzd(I)Lcom/google/android/gms/internal/measurement/zzhs;

    .line 2172
    .line 2173
    .line 2174
    move-result-object v6

    .line 2175
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzme;->zzcl()Lcom/google/android/gms/internal/measurement/zzma;

    .line 2176
    .line 2177
    .line 2178
    move-result-object v6

    .line 2179
    check-cast v6, Lcom/google/android/gms/internal/measurement/zzhr;

    .line 2180
    .line 2181
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzhr;->zza()Ljava/util/List;

    .line 2182
    .line 2183
    .line 2184
    move-result-object v7

    .line 2185
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2186
    .line 2187
    .line 2188
    move-result-object v7

    .line 2189
    :goto_25
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 2190
    .line 2191
    .line 2192
    move-result v9

    .line 2193
    if-eqz v9, :cond_46

    .line 2194
    .line 2195
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2196
    .line 2197
    .line 2198
    move-result-object v9

    .line 2199
    check-cast v9, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 2200
    .line 2201
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzhw;->zzb()Ljava/lang/String;

    .line 2202
    .line 2203
    .line 2204
    move-result-object v9

    .line 2205
    invoke-virtual {v14, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2206
    .line 2207
    .line 2208
    move-result v9

    .line 2209
    if-eqz v9, :cond_45

    .line 2210
    .line 2211
    iget-object v7, v15, Lji3;->b:Ljava/lang/Object;

    .line 2212
    .line 2213
    check-cast v7, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2214
    .line 2215
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzid;->zzar()I

    .line 2216
    .line 2217
    .line 2218
    move-result v7

    .line 2219
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 2220
    .line 2221
    .line 2222
    move-result-object v9

    .line 2223
    iget-object v10, v15, Lji3;->b:Ljava/lang/Object;

    .line 2224
    .line 2225
    check-cast v10, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2226
    .line 2227
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2228
    .line 2229
    .line 2230
    move-result-object v10

    .line 2231
    sget-object v11, Lvg3;->l0:Lug3;

    .line 2232
    .line 2233
    invoke-virtual {v9, v10, v11}, Lpd3;->H(Ljava/lang/String;Lug3;)I

    .line 2234
    .line 2235
    .line 2236
    move-result v9

    .line 2237
    if-lt v7, v9, :cond_43

    .line 2238
    .line 2239
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 2240
    .line 2241
    .line 2242
    move-result-object v7

    .line 2243
    iget-object v9, v15, Lji3;->b:Ljava/lang/Object;

    .line 2244
    .line 2245
    check-cast v9, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2246
    .line 2247
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2248
    .line 2249
    .line 2250
    move-result-object v9

    .line 2251
    sget-object v10, Lvg3;->y0:Lug3;

    .line 2252
    .line 2253
    invoke-virtual {v7, v9, v10}, Lpd3;->H(Ljava/lang/String;Lug3;)I

    .line 2254
    .line 2255
    .line 2256
    move-result v7
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 2257
    iget-object v9, v1, Lmp3;->b0:Ljava/util/LinkedList;

    .line 2258
    .line 2259
    const-string v10, "Generated trigger URI. appId, uri"

    .line 2260
    .line 2261
    const-string v11, "_tr"

    .line 2262
    .line 2263
    const-string v12, "_tu"

    .line 2264
    .line 2265
    if-lez v7, :cond_41

    .line 2266
    .line 2267
    :try_start_9
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 2268
    .line 2269
    .line 2270
    move-result-object v26

    .line 2271
    invoke-virtual {v1}, Lmp3;->g()J

    .line 2272
    .line 2273
    .line 2274
    move-result-wide v32

    .line 2275
    iget-object v13, v15, Lji3;->b:Ljava/lang/Object;

    .line 2276
    .line 2277
    check-cast v13, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2278
    .line 2279
    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2280
    .line 2281
    .line 2282
    move-result-object v31

    .line 2283
    const/16 v29, 0x0

    .line 2284
    .line 2285
    const/16 v30, 0x1

    .line 2286
    .line 2287
    const/16 v27, 0x0

    .line 2288
    .line 2289
    const/16 v28, 0x0

    .line 2290
    .line 2291
    invoke-virtual/range {v26 .. v33}, Lae3;->F0(ZZZZLjava/lang/String;J)Lud3;

    .line 2292
    .line 2293
    .line 2294
    move-result-object v13

    .line 2295
    move-wide/from16 v17, v2

    .line 2296
    .line 2297
    iget-wide v2, v13, Lud3;->g:J

    .line 2298
    .line 2299
    move-wide/from16 v21, v2

    .line 2300
    .line 2301
    int-to-long v1, v7

    .line 2302
    cmp-long v1, v21, v1

    .line 2303
    .line 2304
    if-lez v1, :cond_3f

    .line 2305
    .line 2306
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzhw;->zzn()Lcom/google/android/gms/internal/measurement/zzhv;

    .line 2307
    .line 2308
    .line 2309
    move-result-object v1

    .line 2310
    const-string v2, "_tnr"

    .line 2311
    .line 2312
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/zzhv;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 2313
    .line 2314
    .line 2315
    const-wide/16 v2, 0x1

    .line 2316
    .line 2317
    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzhv;->zzf(J)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 2318
    .line 2319
    .line 2320
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 2321
    .line 2322
    .line 2323
    move-result-object v1

    .line 2324
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 2325
    .line 2326
    invoke-virtual {v6, v1}, Lcom/google/android/gms/internal/measurement/zzhr;->zzf(Lcom/google/android/gms/internal/measurement/zzhw;)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 2327
    .line 2328
    .line 2329
    goto/16 :goto_28

    .line 2330
    .line 2331
    :cond_3f
    invoke-virtual/range {p0 .. p0}, Lmp3;->d0()Lpd3;

    .line 2332
    .line 2333
    .line 2334
    move-result-object v1

    .line 2335
    iget-object v2, v15, Lji3;->b:Ljava/lang/Object;

    .line 2336
    .line 2337
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2338
    .line 2339
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2340
    .line 2341
    .line 2342
    move-result-object v2

    .line 2343
    sget-object v3, Lvg3;->R0:Lug3;

    .line 2344
    .line 2345
    invoke-virtual {v1, v2, v3}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 2346
    .line 2347
    .line 2348
    move-result v1

    .line 2349
    if-eqz v1, :cond_40

    .line 2350
    .line 2351
    invoke-virtual/range {p0 .. p0}, Lmp3;->j0()Lup3;

    .line 2352
    .line 2353
    .line 2354
    move-result-object v1

    .line 2355
    invoke-virtual {v1}, Lup3;->r0()Ljava/lang/String;

    .line 2356
    .line 2357
    .line 2358
    move-result-object v1

    .line 2359
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzhw;->zzn()Lcom/google/android/gms/internal/measurement/zzhv;

    .line 2360
    .line 2361
    .line 2362
    move-result-object v2

    .line 2363
    invoke-virtual {v2, v12}, Lcom/google/android/gms/internal/measurement/zzhv;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 2364
    .line 2365
    .line 2366
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/measurement/zzhv;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 2367
    .line 2368
    .line 2369
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 2370
    .line 2371
    .line 2372
    move-result-object v2

    .line 2373
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 2374
    .line 2375
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/measurement/zzhr;->zzf(Lcom/google/android/gms/internal/measurement/zzhw;)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 2376
    .line 2377
    .line 2378
    goto :goto_26

    .line 2379
    :cond_40
    const/4 v1, 0x0

    .line 2380
    :goto_26
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzhw;->zzn()Lcom/google/android/gms/internal/measurement/zzhv;

    .line 2381
    .line 2382
    .line 2383
    move-result-object v2

    .line 2384
    invoke-virtual {v2, v11}, Lcom/google/android/gms/internal/measurement/zzhv;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 2385
    .line 2386
    .line 2387
    const-wide/16 v11, 0x1

    .line 2388
    .line 2389
    invoke-virtual {v2, v11, v12}, Lcom/google/android/gms/internal/measurement/zzhv;->zzf(J)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 2390
    .line 2391
    .line 2392
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 2393
    .line 2394
    .line 2395
    move-result-object v2

    .line 2396
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 2397
    .line 2398
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/measurement/zzhr;->zzf(Lcom/google/android/gms/internal/measurement/zzhw;)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 2399
    .line 2400
    .line 2401
    invoke-virtual/range {p0 .. p0}, Lmp3;->i0()Lci3;

    .line 2402
    .line 2403
    .line 2404
    move-result-object v2

    .line 2405
    iget-object v3, v15, Lji3;->b:Ljava/lang/Object;

    .line 2406
    .line 2407
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2408
    .line 2409
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2410
    .line 2411
    .line 2412
    move-result-object v3

    .line 2413
    invoke-virtual {v2, v3, v8, v6, v1}, Lci3;->a0(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzic;Lcom/google/android/gms/internal/measurement/zzhr;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzog;

    .line 2414
    .line 2415
    .line 2416
    move-result-object v1

    .line 2417
    if-eqz v1, :cond_44

    .line 2418
    .line 2419
    invoke-virtual/range {p0 .. p0}, Lmp3;->a()Luh3;

    .line 2420
    .line 2421
    .line 2422
    move-result-object v2

    .line 2423
    invoke-virtual {v2}, Luh3;->G()Lsh3;

    .line 2424
    .line 2425
    .line 2426
    move-result-object v2

    .line 2427
    iget-object v3, v15, Lji3;->b:Ljava/lang/Object;

    .line 2428
    .line 2429
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2430
    .line 2431
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2432
    .line 2433
    .line 2434
    move-result-object v3

    .line 2435
    iget-object v7, v1, Lcom/google/android/gms/measurement/internal/zzog;->a:Ljava/lang/String;

    .line 2436
    .line 2437
    invoke-virtual {v2, v3, v10, v7}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2438
    .line 2439
    .line 2440
    invoke-virtual/range {p0 .. p0}, Lmp3;->f0()Lae3;

    .line 2441
    .line 2442
    .line 2443
    move-result-object v2

    .line 2444
    iget-object v3, v15, Lji3;->b:Ljava/lang/Object;

    .line 2445
    .line 2446
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2447
    .line 2448
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2449
    .line 2450
    .line 2451
    move-result-object v3

    .line 2452
    invoke-virtual {v2, v3, v1}, Lae3;->f0(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzog;)V

    .line 2453
    .line 2454
    .line 2455
    iget-object v1, v15, Lji3;->b:Ljava/lang/Object;

    .line 2456
    .line 2457
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2458
    .line 2459
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2460
    .line 2461
    .line 2462
    move-result-object v1

    .line 2463
    invoke-virtual {v9, v1}, Ljava/util/LinkedList;->contains(Ljava/lang/Object;)Z

    .line 2464
    .line 2465
    .line 2466
    move-result v1

    .line 2467
    if-nez v1, :cond_44

    .line 2468
    .line 2469
    iget-object v1, v15, Lji3;->b:Ljava/lang/Object;

    .line 2470
    .line 2471
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2472
    .line 2473
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2474
    .line 2475
    .line 2476
    move-result-object v1

    .line 2477
    invoke-virtual {v9, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 2478
    .line 2479
    .line 2480
    goto/16 :goto_28

    .line 2481
    .line 2482
    :cond_41
    move-wide/from16 v17, v2

    .line 2483
    .line 2484
    invoke-virtual/range {p0 .. p0}, Lmp3;->d0()Lpd3;

    .line 2485
    .line 2486
    .line 2487
    move-result-object v1

    .line 2488
    iget-object v2, v15, Lji3;->b:Ljava/lang/Object;

    .line 2489
    .line 2490
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2491
    .line 2492
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2493
    .line 2494
    .line 2495
    move-result-object v2

    .line 2496
    sget-object v3, Lvg3;->R0:Lug3;

    .line 2497
    .line 2498
    invoke-virtual {v1, v2, v3}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 2499
    .line 2500
    .line 2501
    move-result v1

    .line 2502
    if-eqz v1, :cond_42

    .line 2503
    .line 2504
    invoke-virtual/range {p0 .. p0}, Lmp3;->j0()Lup3;

    .line 2505
    .line 2506
    .line 2507
    move-result-object v1

    .line 2508
    invoke-virtual {v1}, Lup3;->r0()Ljava/lang/String;

    .line 2509
    .line 2510
    .line 2511
    move-result-object v1

    .line 2512
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzhw;->zzn()Lcom/google/android/gms/internal/measurement/zzhv;

    .line 2513
    .line 2514
    .line 2515
    move-result-object v2

    .line 2516
    invoke-virtual {v2, v12}, Lcom/google/android/gms/internal/measurement/zzhv;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 2517
    .line 2518
    .line 2519
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/measurement/zzhv;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 2520
    .line 2521
    .line 2522
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 2523
    .line 2524
    .line 2525
    move-result-object v2

    .line 2526
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 2527
    .line 2528
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/measurement/zzhr;->zzf(Lcom/google/android/gms/internal/measurement/zzhw;)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 2529
    .line 2530
    .line 2531
    goto :goto_27

    .line 2532
    :cond_42
    const/4 v1, 0x0

    .line 2533
    :goto_27
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzhw;->zzn()Lcom/google/android/gms/internal/measurement/zzhv;

    .line 2534
    .line 2535
    .line 2536
    move-result-object v2

    .line 2537
    invoke-virtual {v2, v11}, Lcom/google/android/gms/internal/measurement/zzhv;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 2538
    .line 2539
    .line 2540
    const-wide/16 v11, 0x1

    .line 2541
    .line 2542
    invoke-virtual {v2, v11, v12}, Lcom/google/android/gms/internal/measurement/zzhv;->zzf(J)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 2543
    .line 2544
    .line 2545
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 2546
    .line 2547
    .line 2548
    move-result-object v2

    .line 2549
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 2550
    .line 2551
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/measurement/zzhr;->zzf(Lcom/google/android/gms/internal/measurement/zzhw;)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 2552
    .line 2553
    .line 2554
    invoke-virtual/range {p0 .. p0}, Lmp3;->i0()Lci3;

    .line 2555
    .line 2556
    .line 2557
    move-result-object v2

    .line 2558
    iget-object v3, v15, Lji3;->b:Ljava/lang/Object;

    .line 2559
    .line 2560
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2561
    .line 2562
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2563
    .line 2564
    .line 2565
    move-result-object v3

    .line 2566
    invoke-virtual {v2, v3, v8, v6, v1}, Lci3;->a0(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzic;Lcom/google/android/gms/internal/measurement/zzhr;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzog;

    .line 2567
    .line 2568
    .line 2569
    move-result-object v1

    .line 2570
    if-eqz v1, :cond_44

    .line 2571
    .line 2572
    invoke-virtual/range {p0 .. p0}, Lmp3;->a()Luh3;

    .line 2573
    .line 2574
    .line 2575
    move-result-object v2

    .line 2576
    invoke-virtual {v2}, Luh3;->G()Lsh3;

    .line 2577
    .line 2578
    .line 2579
    move-result-object v2

    .line 2580
    iget-object v3, v15, Lji3;->b:Ljava/lang/Object;

    .line 2581
    .line 2582
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2583
    .line 2584
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2585
    .line 2586
    .line 2587
    move-result-object v3

    .line 2588
    iget-object v7, v1, Lcom/google/android/gms/measurement/internal/zzog;->a:Ljava/lang/String;

    .line 2589
    .line 2590
    invoke-virtual {v2, v3, v10, v7}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2591
    .line 2592
    .line 2593
    invoke-virtual/range {p0 .. p0}, Lmp3;->f0()Lae3;

    .line 2594
    .line 2595
    .line 2596
    move-result-object v2

    .line 2597
    iget-object v3, v15, Lji3;->b:Ljava/lang/Object;

    .line 2598
    .line 2599
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2600
    .line 2601
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2602
    .line 2603
    .line 2604
    move-result-object v3

    .line 2605
    invoke-virtual {v2, v3, v1}, Lae3;->f0(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzog;)V

    .line 2606
    .line 2607
    .line 2608
    iget-object v1, v15, Lji3;->b:Ljava/lang/Object;

    .line 2609
    .line 2610
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2611
    .line 2612
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2613
    .line 2614
    .line 2615
    move-result-object v1

    .line 2616
    invoke-virtual {v9, v1}, Ljava/util/LinkedList;->contains(Ljava/lang/Object;)Z

    .line 2617
    .line 2618
    .line 2619
    move-result v1

    .line 2620
    if-nez v1, :cond_44

    .line 2621
    .line 2622
    iget-object v1, v15, Lji3;->b:Ljava/lang/Object;

    .line 2623
    .line 2624
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2625
    .line 2626
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2627
    .line 2628
    .line 2629
    move-result-object v1

    .line 2630
    invoke-virtual {v9, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 2631
    .line 2632
    .line 2633
    goto :goto_28

    .line 2634
    :cond_43
    move-wide/from16 v17, v2

    .line 2635
    .line 2636
    :cond_44
    :goto_28
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 2637
    .line 2638
    .line 2639
    move-result-object v1

    .line 2640
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 2641
    .line 2642
    invoke-virtual {v8, v4, v1}, Lcom/google/android/gms/internal/measurement/zzic;->zze(ILcom/google/android/gms/internal/measurement/zzhs;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 2643
    .line 2644
    .line 2645
    goto :goto_29

    .line 2646
    :cond_45
    move-object/from16 v1, p0

    .line 2647
    .line 2648
    goto/16 :goto_25

    .line 2649
    .line 2650
    :cond_46
    move-wide/from16 v17, v2

    .line 2651
    .line 2652
    :goto_29
    add-int/lit8 v4, v4, 0x1

    .line 2653
    .line 2654
    move-object/from16 v1, p0

    .line 2655
    .line 2656
    move-wide/from16 v2, v17

    .line 2657
    .line 2658
    goto/16 :goto_24

    .line 2659
    .line 2660
    :cond_47
    move-wide/from16 v17, v2

    .line 2661
    .line 2662
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzag()Lcom/google/android/gms/internal/measurement/zzic;

    .line 2663
    .line 2664
    .line 2665
    invoke-virtual/range {p0 .. p0}, Lmp3;->h0()Lfd3;

    .line 2666
    .line 2667
    .line 2668
    move-result-object v1

    .line 2669
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzK()Ljava/lang/String;

    .line 2670
    .line 2671
    .line 2672
    move-result-object v2

    .line 2673
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzb()Ljava/util/List;

    .line 2674
    .line 2675
    .line 2676
    move-result-object v3

    .line 2677
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzk()Ljava/util/List;

    .line 2678
    .line 2679
    .line 2680
    move-result-object v4

    .line 2681
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzu()J

    .line 2682
    .line 2683
    .line 2684
    move-result-wide v6

    .line 2685
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2686
    .line 2687
    .line 2688
    move-result-object v6

    .line 2689
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzw()J

    .line 2690
    .line 2691
    .line 2692
    move-result-wide v9

    .line 2693
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2694
    .line 2695
    .line 2696
    move-result-object v7

    .line 2697
    invoke-virtual {v0, v5}, Lok3;->i(Lnk3;)Z

    .line 2698
    .line 2699
    .line 2700
    move-result v0

    .line 2701
    const/16 v25, 0x1

    .line 2702
    .line 2703
    xor-int/lit8 v0, v0, 0x1

    .line 2704
    .line 2705
    move-object v5, v6

    .line 2706
    move-object v6, v7

    .line 2707
    move v7, v0

    .line 2708
    invoke-virtual/range {v1 .. v7}, Lfd3;->D(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Z)Ljava/util/ArrayList;

    .line 2709
    .line 2710
    .line 2711
    move-result-object v0

    .line 2712
    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/measurement/zzic;->zzaf(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 2713
    .line 2714
    .line 2715
    invoke-virtual/range {p0 .. p0}, Lmp3;->d0()Lpd3;

    .line 2716
    .line 2717
    .line 2718
    move-result-object v0

    .line 2719
    iget-object v1, v15, Lji3;->b:Ljava/lang/Object;

    .line 2720
    .line 2721
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2722
    .line 2723
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2724
    .line 2725
    .line 2726
    move-result-object v1

    .line 2727
    invoke-virtual {v0, v1}, Lpd3;->B(Ljava/lang/String;)Z

    .line 2728
    .line 2729
    .line 2730
    move-result v0

    .line 2731
    if-eqz v0, :cond_61

    .line 2732
    .line 2733
    new-instance v1, Ljava/util/HashMap;

    .line 2734
    .line 2735
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 2736
    .line 2737
    .line 2738
    new-instance v2, Ljava/util/ArrayList;

    .line 2739
    .line 2740
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2741
    .line 2742
    .line 2743
    invoke-virtual/range {p0 .. p0}, Lmp3;->j0()Lup3;

    .line 2744
    .line 2745
    .line 2746
    move-result-object v0

    .line 2747
    invoke-virtual {v0}, Lup3;->w0()Ljava/security/SecureRandom;

    .line 2748
    .line 2749
    .line 2750
    move-result-object v3

    .line 2751
    const/4 v4, 0x0

    .line 2752
    :goto_2a
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzc()I

    .line 2753
    .line 2754
    .line 2755
    move-result v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 2756
    const-string v5, "events"

    .line 2757
    .line 2758
    if-ge v4, v0, :cond_5f

    .line 2759
    .line 2760
    :try_start_a
    invoke-virtual {v8, v4}, Lcom/google/android/gms/internal/measurement/zzic;->zzd(I)Lcom/google/android/gms/internal/measurement/zzhs;

    .line 2761
    .line 2762
    .line 2763
    move-result-object v0

    .line 2764
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzme;->zzcl()Lcom/google/android/gms/internal/measurement/zzma;

    .line 2765
    .line 2766
    .line 2767
    move-result-object v0

    .line 2768
    move-object v6, v0

    .line 2769
    check-cast v6, Lcom/google/android/gms/internal/measurement/zzhr;

    .line 2770
    .line 2771
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 2772
    .line 2773
    .line 2774
    move-result-object v0

    .line 2775
    const-string v7, "_ep"

    .line 2776
    .line 2777
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2778
    .line 2779
    .line 2780
    move-result v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 2781
    const-string v7, "_efs"

    .line 2782
    .line 2783
    const-string v9, "_sr"

    .line 2784
    .line 2785
    if-eqz v0, :cond_4d

    .line 2786
    .line 2787
    :try_start_b
    invoke-virtual/range {p0 .. p0}, Lmp3;->i0()Lci3;

    .line 2788
    .line 2789
    .line 2790
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 2791
    .line 2792
    .line 2793
    move-result-object v0

    .line 2794
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 2795
    .line 2796
    const-string v10, "_en"

    .line 2797
    .line 2798
    invoke-static {v0, v10}, Lci3;->I(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Ljava/io/Serializable;

    .line 2799
    .line 2800
    .line 2801
    move-result-object v0

    .line 2802
    check-cast v0, Ljava/lang/String;

    .line 2803
    .line 2804
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2805
    .line 2806
    .line 2807
    move-result-object v10

    .line 2808
    check-cast v10, Lpe3;

    .line 2809
    .line 2810
    if-nez v10, :cond_48

    .line 2811
    .line 2812
    invoke-virtual/range {p0 .. p0}, Lmp3;->f0()Lae3;

    .line 2813
    .line 2814
    .line 2815
    move-result-object v10

    .line 2816
    iget-object v11, v15, Lji3;->b:Ljava/lang/Object;

    .line 2817
    .line 2818
    check-cast v11, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2819
    .line 2820
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2821
    .line 2822
    .line 2823
    move-result-object v11

    .line 2824
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 2825
    .line 2826
    .line 2827
    invoke-virtual {v10, v5, v11, v0}, Lae3;->Z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lpe3;

    .line 2828
    .line 2829
    .line 2830
    move-result-object v10

    .line 2831
    if-eqz v10, :cond_48

    .line 2832
    .line 2833
    invoke-virtual {v1, v0, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2834
    .line 2835
    .line 2836
    :cond_48
    if-eqz v10, :cond_4c

    .line 2837
    .line 2838
    iget-object v0, v10, Lpe3;->i:Ljava/lang/Long;

    .line 2839
    .line 2840
    if-nez v0, :cond_4c

    .line 2841
    .line 2842
    iget-object v0, v10, Lpe3;->j:Ljava/lang/Long;

    .line 2843
    .line 2844
    if-eqz v0, :cond_49

    .line 2845
    .line 2846
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 2847
    .line 2848
    .line 2849
    move-result-wide v11

    .line 2850
    const-wide/16 v19, 0x1

    .line 2851
    .line 2852
    cmp-long v5, v11, v19

    .line 2853
    .line 2854
    if-lez v5, :cond_4a

    .line 2855
    .line 2856
    invoke-virtual/range {p0 .. p0}, Lmp3;->i0()Lci3;

    .line 2857
    .line 2858
    .line 2859
    invoke-static {v6, v9, v0}, Lci3;->F(Lcom/google/android/gms/internal/measurement/zzhr;Ljava/lang/String;Ljava/lang/Long;)V

    .line 2860
    .line 2861
    .line 2862
    goto :goto_2b

    .line 2863
    :cond_49
    const-wide/16 v19, 0x1

    .line 2864
    .line 2865
    :cond_4a
    :goto_2b
    iget-object v0, v10, Lpe3;->k:Ljava/lang/Boolean;

    .line 2866
    .line 2867
    if-eqz v0, :cond_4b

    .line 2868
    .line 2869
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2870
    .line 2871
    .line 2872
    move-result v0

    .line 2873
    if-eqz v0, :cond_4b

    .line 2874
    .line 2875
    invoke-virtual/range {p0 .. p0}, Lmp3;->i0()Lci3;

    .line 2876
    .line 2877
    .line 2878
    move-object/from16 v10, v24

    .line 2879
    .line 2880
    invoke-static {v6, v7, v10}, Lci3;->F(Lcom/google/android/gms/internal/measurement/zzhr;Ljava/lang/String;Ljava/lang/Long;)V

    .line 2881
    .line 2882
    .line 2883
    goto :goto_2c

    .line 2884
    :cond_4b
    move-object/from16 v10, v24

    .line 2885
    .line 2886
    :goto_2c
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 2887
    .line 2888
    .line 2889
    move-result-object v0

    .line 2890
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 2891
    .line 2892
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2893
    .line 2894
    .line 2895
    goto :goto_2d

    .line 2896
    :cond_4c
    move-object/from16 v10, v24

    .line 2897
    .line 2898
    const-wide/16 v19, 0x1

    .line 2899
    .line 2900
    :goto_2d
    invoke-virtual {v8, v4, v6}, Lcom/google/android/gms/internal/measurement/zzic;->zzf(ILcom/google/android/gms/internal/measurement/zzhr;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 2901
    .line 2902
    .line 2903
    :goto_2e
    move-object v14, v10

    .line 2904
    const/4 v7, 0x0

    .line 2905
    goto/16 :goto_38

    .line 2906
    .line 2907
    :cond_4d
    move-object/from16 v10, v24

    .line 2908
    .line 2909
    const-wide/16 v19, 0x1

    .line 2910
    .line 2911
    invoke-virtual/range {p0 .. p0}, Lmp3;->e0()Lvi3;

    .line 2912
    .line 2913
    .line 2914
    move-result-object v11

    .line 2915
    iget-object v0, v15, Lji3;->b:Ljava/lang/Object;

    .line 2916
    .line 2917
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2918
    .line 2919
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2920
    .line 2921
    .line 2922
    move-result-object v12

    .line 2923
    const-string v0, "measurement.account.time_zone_offset_minutes"

    .line 2924
    .line 2925
    invoke-virtual {v11, v12, v0}, Lvi3;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2926
    .line 2927
    .line 2928
    move-result-object v0

    .line 2929
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2930
    .line 2931
    .line 2932
    move-result v13
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 2933
    if-nez v13, :cond_4e

    .line 2934
    .line 2935
    :try_start_c
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 2936
    .line 2937
    .line 2938
    move-result-wide v11
    :try_end_c
    .catch Ljava/lang/NumberFormatException; {:try_start_c .. :try_end_c} :catch_0
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 2939
    goto :goto_2f

    .line 2940
    :catch_0
    move-exception v0

    .line 2941
    :try_start_d
    iget-object v11, v11, Lsq3;->a:Ljava/lang/Object;

    .line 2942
    .line 2943
    check-cast v11, Lij3;

    .line 2944
    .line 2945
    invoke-virtual {v11}, Lij3;->a()Luh3;

    .line 2946
    .line 2947
    .line 2948
    move-result-object v11

    .line 2949
    invoke-virtual {v11}, Luh3;->E()Lsh3;

    .line 2950
    .line 2951
    .line 2952
    move-result-object v11

    .line 2953
    invoke-static {v12}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 2954
    .line 2955
    .line 2956
    move-result-object v12

    .line 2957
    const-string v13, "Unable to parse timezone offset. appId"

    .line 2958
    .line 2959
    invoke-virtual {v11, v12, v13, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2960
    .line 2961
    .line 2962
    :cond_4e
    move-wide/from16 v11, v17

    .line 2963
    .line 2964
    :goto_2f
    invoke-virtual/range {p0 .. p0}, Lmp3;->j0()Lup3;

    .line 2965
    .line 2966
    .line 2967
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzhr;->zzn()J

    .line 2968
    .line 2969
    .line 2970
    move-result-wide v13

    .line 2971
    const-wide/32 v21, 0xea60

    .line 2972
    .line 2973
    .line 2974
    mul-long v11, v11, v21

    .line 2975
    .line 2976
    add-long/2addr v13, v11

    .line 2977
    const-wide/32 v21, 0x5265c00

    .line 2978
    .line 2979
    .line 2980
    div-long v13, v13, v21

    .line 2981
    .line 2982
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 2983
    .line 2984
    .line 2985
    move-result-object v0

    .line 2986
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 2987
    .line 2988
    move-wide/from16 v26, v11

    .line 2989
    .line 2990
    const-string v11, "_dbg"

    .line 2991
    .line 2992
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2993
    .line 2994
    .line 2995
    move-result v12

    .line 2996
    if-nez v12, :cond_51

    .line 2997
    .line 2998
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhs;->zza()Ljava/util/List;

    .line 2999
    .line 3000
    .line 3001
    move-result-object v0

    .line 3002
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 3003
    .line 3004
    .line 3005
    move-result-object v0

    .line 3006
    :cond_4f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3007
    .line 3008
    .line 3009
    move-result v12

    .line 3010
    if-eqz v12, :cond_51

    .line 3011
    .line 3012
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3013
    .line 3014
    .line 3015
    move-result-object v12

    .line 3016
    check-cast v12, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 3017
    .line 3018
    move-object/from16 p3, v12

    .line 3019
    .line 3020
    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/measurement/zzhw;->zzb()Ljava/lang/String;

    .line 3021
    .line 3022
    .line 3023
    move-result-object v12

    .line 3024
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3025
    .line 3026
    .line 3027
    move-result v12

    .line 3028
    if-eqz v12, :cond_4f

    .line 3029
    .line 3030
    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/measurement/zzhw;->zzf()J

    .line 3031
    .line 3032
    .line 3033
    move-result-wide v11

    .line 3034
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 3035
    .line 3036
    .line 3037
    move-result-object v0

    .line 3038
    invoke-virtual {v10, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 3039
    .line 3040
    .line 3041
    move-result v0

    .line 3042
    if-nez v0, :cond_50

    .line 3043
    .line 3044
    goto :goto_30

    .line 3045
    :cond_50
    const/4 v0, 0x1

    .line 3046
    goto :goto_31

    .line 3047
    :cond_51
    :goto_30
    invoke-virtual/range {p0 .. p0}, Lmp3;->e0()Lvi3;

    .line 3048
    .line 3049
    .line 3050
    move-result-object v0

    .line 3051
    iget-object v11, v15, Lji3;->b:Ljava/lang/Object;

    .line 3052
    .line 3053
    check-cast v11, Lcom/google/android/gms/internal/measurement/zzid;

    .line 3054
    .line 3055
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 3056
    .line 3057
    .line 3058
    move-result-object v11

    .line 3059
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 3060
    .line 3061
    .line 3062
    move-result-object v12

    .line 3063
    invoke-virtual {v0, v11, v12}, Lvi3;->Q(Ljava/lang/String;Ljava/lang/String;)I

    .line 3064
    .line 3065
    .line 3066
    move-result v0

    .line 3067
    :goto_31
    if-gtz v0, :cond_52

    .line 3068
    .line 3069
    invoke-virtual/range {p0 .. p0}, Lmp3;->a()Luh3;

    .line 3070
    .line 3071
    .line 3072
    move-result-object v5

    .line 3073
    invoke-virtual {v5}, Luh3;->E()Lsh3;

    .line 3074
    .line 3075
    .line 3076
    move-result-object v5

    .line 3077
    const-string v7, "Sample rate must be positive. event, rate"

    .line 3078
    .line 3079
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 3080
    .line 3081
    .line 3082
    move-result-object v9

    .line 3083
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3084
    .line 3085
    .line 3086
    move-result-object v0

    .line 3087
    invoke-virtual {v5, v9, v7, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 3088
    .line 3089
    .line 3090
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 3091
    .line 3092
    .line 3093
    move-result-object v0

    .line 3094
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 3095
    .line 3096
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3097
    .line 3098
    .line 3099
    invoke-virtual {v8, v4, v6}, Lcom/google/android/gms/internal/measurement/zzic;->zzf(ILcom/google/android/gms/internal/measurement/zzhr;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 3100
    .line 3101
    .line 3102
    goto/16 :goto_2e

    .line 3103
    .line 3104
    :cond_52
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 3105
    .line 3106
    .line 3107
    move-result-object v11

    .line 3108
    invoke-virtual {v1, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3109
    .line 3110
    .line 3111
    move-result-object v11

    .line 3112
    check-cast v11, Lpe3;

    .line 3113
    .line 3114
    if-nez v11, :cond_53

    .line 3115
    .line 3116
    invoke-virtual/range {p0 .. p0}, Lmp3;->f0()Lae3;

    .line 3117
    .line 3118
    .line 3119
    move-result-object v11

    .line 3120
    iget-object v12, v15, Lji3;->b:Ljava/lang/Object;

    .line 3121
    .line 3122
    check-cast v12, Lcom/google/android/gms/internal/measurement/zzid;

    .line 3123
    .line 3124
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 3125
    .line 3126
    .line 3127
    move-result-object v12

    .line 3128
    move-wide/from16 v28, v13

    .line 3129
    .line 3130
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 3131
    .line 3132
    .line 3133
    move-result-object v13

    .line 3134
    invoke-virtual {v11, v5, v12, v13}, Lae3;->Z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lpe3;

    .line 3135
    .line 3136
    .line 3137
    move-result-object v11

    .line 3138
    if-nez v11, :cond_54

    .line 3139
    .line 3140
    invoke-virtual/range {p0 .. p0}, Lmp3;->a()Luh3;

    .line 3141
    .line 3142
    .line 3143
    move-result-object v5

    .line 3144
    invoke-virtual {v5}, Luh3;->E()Lsh3;

    .line 3145
    .line 3146
    .line 3147
    move-result-object v5

    .line 3148
    const-string v11, "Event being bundled has no eventAggregate. appId, eventName"

    .line 3149
    .line 3150
    iget-object v12, v15, Lji3;->b:Ljava/lang/Object;

    .line 3151
    .line 3152
    check-cast v12, Lcom/google/android/gms/internal/measurement/zzid;

    .line 3153
    .line 3154
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 3155
    .line 3156
    .line 3157
    move-result-object v12

    .line 3158
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 3159
    .line 3160
    .line 3161
    move-result-object v13

    .line 3162
    invoke-virtual {v5, v12, v11, v13}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 3163
    .line 3164
    .line 3165
    new-instance v30, Lpe3;

    .line 3166
    .line 3167
    iget-object v5, v15, Lji3;->b:Ljava/lang/Object;

    .line 3168
    .line 3169
    check-cast v5, Lcom/google/android/gms/internal/measurement/zzid;

    .line 3170
    .line 3171
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 3172
    .line 3173
    .line 3174
    move-result-object v31

    .line 3175
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 3176
    .line 3177
    .line 3178
    move-result-object v32

    .line 3179
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzhr;->zzn()J

    .line 3180
    .line 3181
    .line 3182
    move-result-wide v39

    .line 3183
    const/16 v45, 0x0

    .line 3184
    .line 3185
    const/16 v46, 0x0

    .line 3186
    .line 3187
    const-wide/16 v33, 0x1

    .line 3188
    .line 3189
    const-wide/16 v35, 0x1

    .line 3190
    .line 3191
    const-wide/16 v37, 0x1

    .line 3192
    .line 3193
    const-wide/16 v41, 0x0

    .line 3194
    .line 3195
    const/16 v43, 0x0

    .line 3196
    .line 3197
    const/16 v44, 0x0

    .line 3198
    .line 3199
    invoke-direct/range {v30 .. v46}, Lpe3;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 3200
    .line 3201
    .line 3202
    move-object/from16 v11, v30

    .line 3203
    .line 3204
    goto :goto_32

    .line 3205
    :cond_53
    move-wide/from16 v28, v13

    .line 3206
    .line 3207
    :cond_54
    :goto_32
    invoke-virtual/range {p0 .. p0}, Lmp3;->i0()Lci3;

    .line 3208
    .line 3209
    .line 3210
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 3211
    .line 3212
    .line 3213
    move-result-object v5

    .line 3214
    check-cast v5, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 3215
    .line 3216
    const-string v12, "_eid"

    .line 3217
    .line 3218
    invoke-static {v5, v12}, Lci3;->I(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Ljava/io/Serializable;

    .line 3219
    .line 3220
    .line 3221
    move-result-object v5

    .line 3222
    check-cast v5, Ljava/lang/Long;

    .line 3223
    .line 3224
    if-eqz v5, :cond_55

    .line 3225
    .line 3226
    const/16 v25, 0x1

    .line 3227
    .line 3228
    :goto_33
    const/4 v12, 0x1

    .line 3229
    goto :goto_34

    .line 3230
    :cond_55
    const/16 v25, 0x0

    .line 3231
    .line 3232
    goto :goto_33

    .line 3233
    :goto_34
    if-ne v0, v12, :cond_58

    .line 3234
    .line 3235
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 3236
    .line 3237
    .line 3238
    move-result-object v0

    .line 3239
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 3240
    .line 3241
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3242
    .line 3243
    .line 3244
    if-eqz v25, :cond_57

    .line 3245
    .line 3246
    iget-object v0, v11, Lpe3;->i:Ljava/lang/Long;

    .line 3247
    .line 3248
    if-nez v0, :cond_56

    .line 3249
    .line 3250
    iget-object v0, v11, Lpe3;->j:Ljava/lang/Long;

    .line 3251
    .line 3252
    if-nez v0, :cond_56

    .line 3253
    .line 3254
    iget-object v0, v11, Lpe3;->k:Ljava/lang/Boolean;

    .line 3255
    .line 3256
    if-eqz v0, :cond_57

    .line 3257
    .line 3258
    :cond_56
    const/4 v5, 0x0

    .line 3259
    invoke-virtual {v11, v5, v5, v5}, Lpe3;->b(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lpe3;

    .line 3260
    .line 3261
    .line 3262
    move-result-object v0

    .line 3263
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 3264
    .line 3265
    .line 3266
    move-result-object v5

    .line 3267
    invoke-virtual {v1, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3268
    .line 3269
    .line 3270
    :cond_57
    invoke-virtual {v8, v4, v6}, Lcom/google/android/gms/internal/measurement/zzic;->zzf(ILcom/google/android/gms/internal/measurement/zzhr;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 3271
    .line 3272
    .line 3273
    goto/16 :goto_2e

    .line 3274
    .line 3275
    :cond_58
    invoke-virtual {v3, v0}, Ljava/util/Random;->nextInt(I)I

    .line 3276
    .line 3277
    .line 3278
    move-result v13

    .line 3279
    if-nez v13, :cond_5b

    .line 3280
    .line 3281
    invoke-virtual/range {p0 .. p0}, Lmp3;->i0()Lci3;

    .line 3282
    .line 3283
    .line 3284
    int-to-long v13, v0

    .line 3285
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 3286
    .line 3287
    .line 3288
    move-result-object v0

    .line 3289
    invoke-static {v6, v9, v0}, Lci3;->F(Lcom/google/android/gms/internal/measurement/zzhr;Ljava/lang/String;Ljava/lang/Long;)V

    .line 3290
    .line 3291
    .line 3292
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 3293
    .line 3294
    .line 3295
    move-result-object v5

    .line 3296
    check-cast v5, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 3297
    .line 3298
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3299
    .line 3300
    .line 3301
    if-eqz v25, :cond_59

    .line 3302
    .line 3303
    const/4 v5, 0x0

    .line 3304
    invoke-virtual {v11, v5, v0, v5}, Lpe3;->b(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lpe3;

    .line 3305
    .line 3306
    .line 3307
    move-result-object v11

    .line 3308
    :cond_59
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 3309
    .line 3310
    .line 3311
    move-result-object v0

    .line 3312
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzhr;->zzn()J

    .line 3313
    .line 3314
    .line 3315
    move-result-wide v41

    .line 3316
    new-instance v30, Lpe3;

    .line 3317
    .line 3318
    invoke-static/range {v28 .. v29}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 3319
    .line 3320
    .line 3321
    move-result-object v43

    .line 3322
    iget-object v5, v11, Lpe3;->i:Ljava/lang/Long;

    .line 3323
    .line 3324
    iget-object v7, v11, Lpe3;->j:Ljava/lang/Long;

    .line 3325
    .line 3326
    iget-object v9, v11, Lpe3;->k:Ljava/lang/Boolean;

    .line 3327
    .line 3328
    iget-object v13, v11, Lpe3;->a:Ljava/lang/String;

    .line 3329
    .line 3330
    iget-object v14, v11, Lpe3;->b:Ljava/lang/String;

    .line 3331
    .line 3332
    move-object/from16 v31, v13

    .line 3333
    .line 3334
    iget-wide v12, v11, Lpe3;->c:J

    .line 3335
    .line 3336
    move-wide/from16 v33, v12

    .line 3337
    .line 3338
    iget-wide v12, v11, Lpe3;->d:J

    .line 3339
    .line 3340
    move-wide/from16 v35, v12

    .line 3341
    .line 3342
    iget-wide v12, v11, Lpe3;->e:J

    .line 3343
    .line 3344
    move-wide/from16 v37, v12

    .line 3345
    .line 3346
    iget-wide v11, v11, Lpe3;->f:J

    .line 3347
    .line 3348
    move-object/from16 v44, v5

    .line 3349
    .line 3350
    move-object/from16 v45, v7

    .line 3351
    .line 3352
    move-object/from16 v46, v9

    .line 3353
    .line 3354
    move-wide/from16 v39, v11

    .line 3355
    .line 3356
    move-object/from16 v32, v14

    .line 3357
    .line 3358
    invoke-direct/range {v30 .. v46}, Lpe3;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 3359
    .line 3360
    .line 3361
    move-object/from16 v5, v30

    .line 3362
    .line 3363
    invoke-virtual {v1, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3364
    .line 3365
    .line 3366
    move-object v14, v10

    .line 3367
    :cond_5a
    :goto_35
    const/4 v7, 0x0

    .line 3368
    goto/16 :goto_37

    .line 3369
    .line 3370
    :cond_5b
    iget-object v12, v11, Lpe3;->h:Ljava/lang/Long;

    .line 3371
    .line 3372
    if-eqz v12, :cond_5c

    .line 3373
    .line 3374
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 3375
    .line 3376
    .line 3377
    move-result-wide v12

    .line 3378
    goto :goto_36

    .line 3379
    :cond_5c
    invoke-virtual/range {p0 .. p0}, Lmp3;->j0()Lup3;

    .line 3380
    .line 3381
    .line 3382
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzhr;->zzp()J

    .line 3383
    .line 3384
    .line 3385
    move-result-wide v12

    .line 3386
    add-long v12, v26, v12

    .line 3387
    .line 3388
    div-long v12, v12, v21

    .line 3389
    .line 3390
    :goto_36
    cmp-long v12, v12, v28

    .line 3391
    .line 3392
    if-eqz v12, :cond_5e

    .line 3393
    .line 3394
    invoke-virtual/range {p0 .. p0}, Lmp3;->i0()Lci3;

    .line 3395
    .line 3396
    .line 3397
    invoke-static {v6, v7, v10}, Lci3;->F(Lcom/google/android/gms/internal/measurement/zzhr;Ljava/lang/String;Ljava/lang/Long;)V

    .line 3398
    .line 3399
    .line 3400
    invoke-virtual/range {p0 .. p0}, Lmp3;->i0()Lci3;

    .line 3401
    .line 3402
    .line 3403
    int-to-long v12, v0

    .line 3404
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 3405
    .line 3406
    .line 3407
    move-result-object v0

    .line 3408
    invoke-static {v6, v9, v0}, Lci3;->F(Lcom/google/android/gms/internal/measurement/zzhr;Ljava/lang/String;Ljava/lang/Long;)V

    .line 3409
    .line 3410
    .line 3411
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 3412
    .line 3413
    .line 3414
    move-result-object v5

    .line 3415
    check-cast v5, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 3416
    .line 3417
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3418
    .line 3419
    .line 3420
    if-eqz v25, :cond_5d

    .line 3421
    .line 3422
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 3423
    .line 3424
    const/4 v7, 0x0

    .line 3425
    invoke-virtual {v11, v7, v0, v5}, Lpe3;->b(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lpe3;

    .line 3426
    .line 3427
    .line 3428
    move-result-object v11

    .line 3429
    :cond_5d
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 3430
    .line 3431
    .line 3432
    move-result-object v0

    .line 3433
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzhr;->zzn()J

    .line 3434
    .line 3435
    .line 3436
    move-result-wide v41

    .line 3437
    new-instance v30, Lpe3;

    .line 3438
    .line 3439
    invoke-static/range {v28 .. v29}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 3440
    .line 3441
    .line 3442
    move-result-object v43

    .line 3443
    iget-object v5, v11, Lpe3;->i:Ljava/lang/Long;

    .line 3444
    .line 3445
    iget-object v7, v11, Lpe3;->j:Ljava/lang/Long;

    .line 3446
    .line 3447
    iget-object v9, v11, Lpe3;->k:Ljava/lang/Boolean;

    .line 3448
    .line 3449
    iget-object v12, v11, Lpe3;->a:Ljava/lang/String;

    .line 3450
    .line 3451
    iget-object v13, v11, Lpe3;->b:Ljava/lang/String;

    .line 3452
    .line 3453
    move-object/from16 v46, v9

    .line 3454
    .line 3455
    move-object v14, v10

    .line 3456
    iget-wide v9, v11, Lpe3;->c:J

    .line 3457
    .line 3458
    move-wide/from16 v33, v9

    .line 3459
    .line 3460
    iget-wide v9, v11, Lpe3;->d:J

    .line 3461
    .line 3462
    move-wide/from16 v35, v9

    .line 3463
    .line 3464
    iget-wide v9, v11, Lpe3;->e:J

    .line 3465
    .line 3466
    move-wide/from16 v37, v9

    .line 3467
    .line 3468
    iget-wide v9, v11, Lpe3;->f:J

    .line 3469
    .line 3470
    move-object/from16 v44, v5

    .line 3471
    .line 3472
    move-object/from16 v45, v7

    .line 3473
    .line 3474
    move-wide/from16 v39, v9

    .line 3475
    .line 3476
    move-object/from16 v31, v12

    .line 3477
    .line 3478
    move-object/from16 v32, v13

    .line 3479
    .line 3480
    invoke-direct/range {v30 .. v46}, Lpe3;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 3481
    .line 3482
    .line 3483
    move-object/from16 v5, v30

    .line 3484
    .line 3485
    invoke-virtual {v1, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3486
    .line 3487
    .line 3488
    goto :goto_35

    .line 3489
    :cond_5e
    move-object v14, v10

    .line 3490
    if-eqz v25, :cond_5a

    .line 3491
    .line 3492
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 3493
    .line 3494
    .line 3495
    move-result-object v0

    .line 3496
    const/4 v7, 0x0

    .line 3497
    invoke-virtual {v11, v5, v7, v7}, Lpe3;->b(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lpe3;

    .line 3498
    .line 3499
    .line 3500
    move-result-object v5

    .line 3501
    invoke-virtual {v1, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3502
    .line 3503
    .line 3504
    :goto_37
    invoke-virtual {v8, v4, v6}, Lcom/google/android/gms/internal/measurement/zzic;->zzf(ILcom/google/android/gms/internal/measurement/zzhr;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 3505
    .line 3506
    .line 3507
    :goto_38
    add-int/lit8 v4, v4, 0x1

    .line 3508
    .line 3509
    move-object/from16 v24, v14

    .line 3510
    .line 3511
    goto/16 :goto_2a

    .line 3512
    .line 3513
    :cond_5f
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 3514
    .line 3515
    .line 3516
    move-result v0

    .line 3517
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzc()I

    .line 3518
    .line 3519
    .line 3520
    move-result v3

    .line 3521
    if-ge v0, v3, :cond_60

    .line 3522
    .line 3523
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzi()Lcom/google/android/gms/internal/measurement/zzic;

    .line 3524
    .line 3525
    .line 3526
    invoke-virtual {v8, v2}, Lcom/google/android/gms/internal/measurement/zzic;->zzh(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 3527
    .line 3528
    .line 3529
    :cond_60
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 3530
    .line 3531
    .line 3532
    move-result-object v0

    .line 3533
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 3534
    .line 3535
    .line 3536
    move-result-object v0

    .line 3537
    :goto_39
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3538
    .line 3539
    .line 3540
    move-result v1

    .line 3541
    if-eqz v1, :cond_61

    .line 3542
    .line 3543
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3544
    .line 3545
    .line 3546
    move-result-object v1

    .line 3547
    check-cast v1, Ljava/util/Map$Entry;

    .line 3548
    .line 3549
    invoke-virtual/range {p0 .. p0}, Lmp3;->f0()Lae3;

    .line 3550
    .line 3551
    .line 3552
    move-result-object v2

    .line 3553
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 3554
    .line 3555
    .line 3556
    move-result-object v1

    .line 3557
    check-cast v1, Lpe3;

    .line 3558
    .line 3559
    invoke-virtual {v2, v5, v1}, Lae3;->a0(Ljava/lang/String;Lpe3;)V

    .line 3560
    .line 3561
    .line 3562
    goto :goto_39

    .line 3563
    :cond_61
    iget-object v0, v15, Lji3;->b:Ljava/lang/Object;

    .line 3564
    .line 3565
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzid;

    .line 3566
    .line 3567
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 3568
    .line 3569
    .line 3570
    move-result-object v0

    .line 3571
    invoke-virtual/range {p0 .. p0}, Lmp3;->f0()Lae3;

    .line 3572
    .line 3573
    .line 3574
    move-result-object v1

    .line 3575
    invoke-virtual {v1, v0}, Lae3;->D0(Ljava/lang/String;)Ldi3;

    .line 3576
    .line 3577
    .line 3578
    move-result-object v1

    .line 3579
    if-nez v1, :cond_62

    .line 3580
    .line 3581
    invoke-virtual/range {p0 .. p0}, Lmp3;->a()Luh3;

    .line 3582
    .line 3583
    .line 3584
    move-result-object v1

    .line 3585
    invoke-virtual {v1}, Luh3;->D()Lsh3;

    .line 3586
    .line 3587
    .line 3588
    move-result-object v1

    .line 3589
    const-string v2, "Bundling raw events w/o app info. appId"

    .line 3590
    .line 3591
    iget-object v3, v15, Lji3;->b:Ljava/lang/Object;

    .line 3592
    .line 3593
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzid;

    .line 3594
    .line 3595
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 3596
    .line 3597
    .line 3598
    move-result-object v3

    .line 3599
    invoke-static {v3}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 3600
    .line 3601
    .line 3602
    move-result-object v3

    .line 3603
    invoke-virtual {v1, v3, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3604
    .line 3605
    .line 3606
    goto/16 :goto_3e

    .line 3607
    .line 3608
    :cond_62
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzc()I

    .line 3609
    .line 3610
    .line 3611
    move-result v2

    .line 3612
    if-lez v2, :cond_67

    .line 3613
    .line 3614
    iget-object v2, v1, Ldi3;->a:Lij3;

    .line 3615
    .line 3616
    iget-object v2, v2, Lij3;->i:Lbj3;

    .line 3617
    .line 3618
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 3619
    .line 3620
    .line 3621
    invoke-virtual {v2}, Lbj3;->y()V

    .line 3622
    .line 3623
    .line 3624
    iget-wide v2, v1, Ldi3;->i:J

    .line 3625
    .line 3626
    cmp-long v4, v2, v17

    .line 3627
    .line 3628
    if-eqz v4, :cond_63

    .line 3629
    .line 3630
    invoke-virtual {v8, v2, v3}, Lcom/google/android/gms/internal/measurement/zzic;->zzA(J)Lcom/google/android/gms/internal/measurement/zzic;

    .line 3631
    .line 3632
    .line 3633
    goto :goto_3a

    .line 3634
    :cond_63
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzB()Lcom/google/android/gms/internal/measurement/zzic;

    .line 3635
    .line 3636
    .line 3637
    :goto_3a
    iget-object v4, v1, Ldi3;->a:Lij3;

    .line 3638
    .line 3639
    iget-object v4, v4, Lij3;->i:Lbj3;

    .line 3640
    .line 3641
    invoke-static {v4}, Lij3;->l(Lhk3;)V

    .line 3642
    .line 3643
    .line 3644
    invoke-virtual {v4}, Lbj3;->y()V

    .line 3645
    .line 3646
    .line 3647
    iget-wide v4, v1, Ldi3;->h:J

    .line 3648
    .line 3649
    cmp-long v6, v4, v17

    .line 3650
    .line 3651
    if-nez v6, :cond_64

    .line 3652
    .line 3653
    goto :goto_3b

    .line 3654
    :cond_64
    move-wide v2, v4

    .line 3655
    :goto_3b
    cmp-long v4, v2, v17

    .line 3656
    .line 3657
    if-eqz v4, :cond_65

    .line 3658
    .line 3659
    invoke-virtual {v8, v2, v3}, Lcom/google/android/gms/internal/measurement/zzic;->zzy(J)Lcom/google/android/gms/internal/measurement/zzic;

    .line 3660
    .line 3661
    .line 3662
    goto :goto_3c

    .line 3663
    :cond_65
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzz()Lcom/google/android/gms/internal/measurement/zzic;

    .line 3664
    .line 3665
    .line 3666
    :goto_3c
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzc()I

    .line 3667
    .line 3668
    .line 3669
    move-result v2

    .line 3670
    int-to-long v2, v2

    .line 3671
    invoke-virtual {v1, v2, v3}, Ldi3;->h(J)V

    .line 3672
    .line 3673
    .line 3674
    iget-object v2, v1, Ldi3;->a:Lij3;

    .line 3675
    .line 3676
    iget-object v2, v2, Lij3;->i:Lbj3;

    .line 3677
    .line 3678
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 3679
    .line 3680
    .line 3681
    invoke-virtual {v2}, Lbj3;->y()V

    .line 3682
    .line 3683
    .line 3684
    iget-wide v2, v1, Ldi3;->F:J

    .line 3685
    .line 3686
    long-to-int v2, v2

    .line 3687
    invoke-virtual {v8, v2}, Lcom/google/android/gms/internal/measurement/zzic;->zzaJ(I)Lcom/google/android/gms/internal/measurement/zzic;

    .line 3688
    .line 3689
    .line 3690
    iget-object v2, v1, Ldi3;->a:Lij3;

    .line 3691
    .line 3692
    iget-object v2, v2, Lij3;->i:Lbj3;

    .line 3693
    .line 3694
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 3695
    .line 3696
    .line 3697
    invoke-virtual {v2}, Lbj3;->y()V

    .line 3698
    .line 3699
    .line 3700
    iget-wide v2, v1, Ldi3;->g:J

    .line 3701
    .line 3702
    long-to-int v2, v2

    .line 3703
    invoke-virtual {v8, v2}, Lcom/google/android/gms/internal/measurement/zzic;->zzZ(I)Lcom/google/android/gms/internal/measurement/zzic;

    .line 3704
    .line 3705
    .line 3706
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzu()J

    .line 3707
    .line 3708
    .line 3709
    move-result-wide v2

    .line 3710
    invoke-virtual {v1, v2, v3}, Ldi3;->L(J)V

    .line 3711
    .line 3712
    .line 3713
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzw()J

    .line 3714
    .line 3715
    .line 3716
    move-result-wide v2

    .line 3717
    invoke-virtual {v1, v2, v3}, Ldi3;->M(J)V

    .line 3718
    .line 3719
    .line 3720
    invoke-virtual {v1}, Ldi3;->u()Ljava/lang/String;

    .line 3721
    .line 3722
    .line 3723
    move-result-object v2

    .line 3724
    if-eqz v2, :cond_66

    .line 3725
    .line 3726
    invoke-virtual {v8, v2}, Lcom/google/android/gms/internal/measurement/zzic;->zzaa(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 3727
    .line 3728
    .line 3729
    goto :goto_3d

    .line 3730
    :cond_66
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzab()Lcom/google/android/gms/internal/measurement/zzic;

    .line 3731
    .line 3732
    .line 3733
    :goto_3d
    invoke-virtual/range {p0 .. p0}, Lmp3;->f0()Lae3;

    .line 3734
    .line 3735
    .line 3736
    move-result-object v2

    .line 3737
    const/4 v4, 0x0

    .line 3738
    invoke-virtual {v2, v1, v4}, Lae3;->E0(Ldi3;Z)V

    .line 3739
    .line 3740
    .line 3741
    :cond_67
    :goto_3e
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzc()I

    .line 3742
    .line 3743
    .line 3744
    move-result v1

    .line 3745
    if-lez v1, :cond_6b

    .line 3746
    .line 3747
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3748
    .line 3749
    .line 3750
    invoke-virtual/range {p0 .. p0}, Lmp3;->e0()Lvi3;

    .line 3751
    .line 3752
    .line 3753
    move-result-object v1

    .line 3754
    iget-object v2, v15, Lji3;->b:Ljava/lang/Object;

    .line 3755
    .line 3756
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzid;

    .line 3757
    .line 3758
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 3759
    .line 3760
    .line 3761
    move-result-object v2

    .line 3762
    invoke-virtual {v1, v2}, Lvi3;->L(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgl;

    .line 3763
    .line 3764
    .line 3765
    move-result-object v1

    .line 3766
    if-eqz v1, :cond_69

    .line 3767
    .line 3768
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgl;->zza()Z

    .line 3769
    .line 3770
    .line 3771
    move-result v2

    .line 3772
    if-nez v2, :cond_68

    .line 3773
    .line 3774
    goto :goto_3f

    .line 3775
    :cond_68
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgl;->zzb()J

    .line 3776
    .line 3777
    .line 3778
    move-result-wide v1

    .line 3779
    invoke-virtual {v8, v1, v2}, Lcom/google/android/gms/internal/measurement/zzic;->zzal(J)Lcom/google/android/gms/internal/measurement/zzic;

    .line 3780
    .line 3781
    .line 3782
    goto :goto_40

    .line 3783
    :cond_69
    :goto_3f
    iget-object v1, v15, Lji3;->b:Ljava/lang/Object;

    .line 3784
    .line 3785
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzid;

    .line 3786
    .line 3787
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzid;->zzP()Ljava/lang/String;

    .line 3788
    .line 3789
    .line 3790
    move-result-object v1

    .line 3791
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 3792
    .line 3793
    .line 3794
    move-result v1

    .line 3795
    if-eqz v1, :cond_6a

    .line 3796
    .line 3797
    const-wide/16 v1, -0x1

    .line 3798
    .line 3799
    invoke-virtual {v8, v1, v2}, Lcom/google/android/gms/internal/measurement/zzic;->zzal(J)Lcom/google/android/gms/internal/measurement/zzic;

    .line 3800
    .line 3801
    .line 3802
    goto :goto_40

    .line 3803
    :cond_6a
    invoke-virtual/range {p0 .. p0}, Lmp3;->a()Luh3;

    .line 3804
    .line 3805
    .line 3806
    move-result-object v1

    .line 3807
    invoke-virtual {v1}, Luh3;->E()Lsh3;

    .line 3808
    .line 3809
    .line 3810
    move-result-object v1

    .line 3811
    const-string v2, "Did not find measurement config or missing version info. appId"

    .line 3812
    .line 3813
    iget-object v3, v15, Lji3;->b:Ljava/lang/Object;

    .line 3814
    .line 3815
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzid;

    .line 3816
    .line 3817
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 3818
    .line 3819
    .line 3820
    move-result-object v3

    .line 3821
    invoke-static {v3}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 3822
    .line 3823
    .line 3824
    move-result-object v3

    .line 3825
    invoke-virtual {v1, v3, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3826
    .line 3827
    .line 3828
    :goto_40
    invoke-virtual/range {p0 .. p0}, Lmp3;->f0()Lae3;

    .line 3829
    .line 3830
    .line 3831
    move-result-object v1

    .line 3832
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 3833
    .line 3834
    .line 3835
    move-result-object v2

    .line 3836
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzid;

    .line 3837
    .line 3838
    move/from16 v9, v16

    .line 3839
    .line 3840
    invoke-virtual {v1, v2, v9}, Lae3;->I0(Lcom/google/android/gms/internal/measurement/zzid;Z)V

    .line 3841
    .line 3842
    .line 3843
    :cond_6b
    invoke-virtual/range {p0 .. p0}, Lmp3;->f0()Lae3;

    .line 3844
    .line 3845
    .line 3846
    move-result-object v1

    .line 3847
    iget-object v2, v15, Lji3;->c:Ljava/io/Serializable;

    .line 3848
    .line 3849
    check-cast v2, Ljava/util/ArrayList;

    .line 3850
    .line 3851
    invoke-virtual {v1, v2}, Lae3;->P(Ljava/util/List;)V

    .line 3852
    .line 3853
    .line 3854
    invoke-virtual/range {p0 .. p0}, Lmp3;->f0()Lae3;

    .line 3855
    .line 3856
    .line 3857
    move-result-object v1

    .line 3858
    invoke-virtual {v1, v0}, Lae3;->Q(Ljava/lang/String;)V

    .line 3859
    .line 3860
    .line 3861
    invoke-virtual/range {p0 .. p0}, Lmp3;->f0()Lae3;

    .line 3862
    .line 3863
    .line 3864
    move-result-object v0

    .line 3865
    invoke-virtual {v0}, Lae3;->o0()V

    .line 3866
    .line 3867
    .line 3868
    const/4 v9, 0x1

    .line 3869
    goto :goto_42

    .line 3870
    :goto_41
    invoke-virtual/range {p0 .. p0}, Lmp3;->f0()Lae3;

    .line 3871
    .line 3872
    .line 3873
    move-result-object v0

    .line 3874
    invoke-virtual {v0}, Lae3;->o0()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 3875
    .line 3876
    .line 3877
    move v9, v4

    .line 3878
    :goto_42
    invoke-virtual/range {p0 .. p0}, Lmp3;->f0()Lae3;

    .line 3879
    .line 3880
    .line 3881
    move-result-object v0

    .line 3882
    invoke-virtual {v0}, Lae3;->p0()V

    .line 3883
    .line 3884
    .line 3885
    return v9

    .line 3886
    :goto_43
    invoke-virtual/range {p0 .. p0}, Lmp3;->f0()Lae3;

    .line 3887
    .line 3888
    .line 3889
    move-result-object v1

    .line 3890
    invoke-virtual {v1}, Lae3;->p0()V

    .line 3891
    .line 3892
    .line 3893
    throw v0
.end method

.method public final H(Lcom/google/android/gms/internal/measurement/zzic;JZ)V
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq v0, p4, :cond_0

    .line 3
    .line 4
    const-string v1, "_lte"

    .line 5
    .line 6
    :goto_0
    move-object v5, v1

    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const-string v1, "_se"

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :goto_1
    iget-object v1, p0, Lmp3;->c:Lae3;

    .line 12
    .line 13
    invoke-static {v1}, Lmp3;->S(Lwo3;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzic;->zzK()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v1, v2, v5}, Lae3;->v0(Ljava/lang/String;Ljava/lang/String;)Lrp3;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    iget-object v1, v1, Lrp3;->e:Ljava/lang/Object;

    .line 27
    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    new-instance v2, Lrp3;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzic;->zzK()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {p0}, Lmp3;->f()Lxv;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Lxt0;

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 47
    .line 48
    .line 49
    move-result-wide v6

    .line 50
    check-cast v1, Ljava/lang/Long;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v8

    .line 56
    add-long/2addr v8, p2

    .line 57
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    const-string v4, "auto"

    .line 62
    .line 63
    invoke-direct/range {v2 .. v8}, Lrp3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_2
    :goto_2
    new-instance v2, Lrp3;

    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzic;->zzK()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {p0}, Lmp3;->f()Lxv;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Lxt0;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 83
    .line 84
    .line 85
    move-result-wide v6

    .line 86
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    const-string v4, "auto"

    .line 91
    .line 92
    invoke-direct/range {v2 .. v8}, Lrp3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :goto_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zziu;->zzm()Lcom/google/android/gms/internal/measurement/zzit;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/measurement/zzit;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzit;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Lmp3;->f()Lxv;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    check-cast v3, Lxt0;

    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 112
    .line 113
    .line 114
    move-result-wide v3

    .line 115
    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/internal/measurement/zzit;->zza(J)Lcom/google/android/gms/internal/measurement/zzit;

    .line 116
    .line 117
    .line 118
    iget-object v3, v2, Lrp3;->e:Ljava/lang/Object;

    .line 119
    .line 120
    move-object v4, v3

    .line 121
    check-cast v4, Ljava/lang/Long;

    .line 122
    .line 123
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 124
    .line 125
    .line 126
    move-result-wide v6

    .line 127
    invoke-virtual {v1, v6, v7}, Lcom/google/android/gms/internal/measurement/zzit;->zze(J)Lcom/google/android/gms/internal/measurement/zzit;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    check-cast v1, Lcom/google/android/gms/internal/measurement/zziu;

    .line 135
    .line 136
    invoke-static {p1, v5}, Lci3;->n0(Lcom/google/android/gms/internal/measurement/zzic;Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-ltz v4, :cond_3

    .line 141
    .line 142
    invoke-virtual {p1, v4, v1}, Lcom/google/android/gms/internal/measurement/zzic;->zzn(ILcom/google/android/gms/internal/measurement/zziu;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 143
    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_3
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzic;->zzo(Lcom/google/android/gms/internal/measurement/zziu;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 147
    .line 148
    .line 149
    :goto_4
    const-wide/16 v4, 0x0

    .line 150
    .line 151
    cmp-long p1, p2, v4

    .line 152
    .line 153
    if-lez p1, :cond_5

    .line 154
    .line 155
    iget-object p1, p0, Lmp3;->c:Lae3;

    .line 156
    .line 157
    invoke-static {p1}, Lmp3;->S(Lwo3;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, v2}, Lae3;->u0(Lrp3;)Z

    .line 161
    .line 162
    .line 163
    if-eq v0, p4, :cond_4

    .line 164
    .line 165
    const-string p1, "lifetime"

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_4
    const-string p1, "session-scoped"

    .line 169
    .line 170
    :goto_5
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    iget-object p0, p0, Luh3;->Y:Lsh3;

    .line 175
    .line 176
    const-string p2, "Updated engagement user property. scope, value"

    .line 177
    .line 178
    invoke-virtual {p0, p1, p2, v3}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_5
    return-void
.end method

.method public final I(Lcom/google/android/gms/internal/measurement/zzhr;Lcom/google/android/gms/internal/measurement/zzhr;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "_e"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Lkb1;->g(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lmp3;->i0()Lci3;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 22
    .line 23
    const-string v2, "_sc"

    .line 24
    .line 25
    invoke-static {v0, v2}, Lci3;->H(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v2, 0x0

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    move-object v0, v2

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhw;->zzd()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :goto_0
    invoke-virtual {p0}, Lmp3;->i0()Lci3;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 46
    .line 47
    const-string v4, "_pc"

    .line 48
    .line 49
    invoke-static {v3, v4}, Lci3;->H(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    if-nez v3, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzhw;->zzd()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    :goto_1
    if-eqz v2, :cond_5

    .line 61
    .line 62
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_5

    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzhr;->zzk()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-static {v0}, Lkb1;->g(Z)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lmp3;->i0()Lci3;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 87
    .line 88
    const-string v1, "_et"

    .line 89
    .line 90
    invoke-static {v0, v1}, Lci3;->H(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-eqz v0, :cond_4

    .line 95
    .line 96
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhw;->zze()Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_4

    .line 101
    .line 102
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhw;->zzf()J

    .line 103
    .line 104
    .line 105
    move-result-wide v2

    .line 106
    const-wide/16 v4, 0x0

    .line 107
    .line 108
    cmp-long v2, v2, v4

    .line 109
    .line 110
    if-gtz v2, :cond_2

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhw;->zzf()J

    .line 114
    .line 115
    .line 116
    move-result-wide v2

    .line 117
    invoke-virtual {p0}, Lmp3;->i0()Lci3;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 125
    .line 126
    invoke-static {v0, v1}, Lci3;->H(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    if-eqz v0, :cond_3

    .line 131
    .line 132
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhw;->zzf()J

    .line 133
    .line 134
    .line 135
    move-result-wide v6

    .line 136
    cmp-long v4, v6, v4

    .line 137
    .line 138
    if-lez v4, :cond_3

    .line 139
    .line 140
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhw;->zzf()J

    .line 141
    .line 142
    .line 143
    move-result-wide v4

    .line 144
    add-long/2addr v2, v4

    .line 145
    :cond_3
    invoke-virtual {p0}, Lmp3;->i0()Lci3;

    .line 146
    .line 147
    .line 148
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {p2, v1, v0}, Lci3;->F(Lcom/google/android/gms/internal/measurement/zzhr;Ljava/lang/String;Ljava/lang/Long;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Lmp3;->i0()Lci3;

    .line 156
    .line 157
    .line 158
    const-wide/16 v0, 0x1

    .line 159
    .line 160
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    const-string p2, "_fr"

    .line 165
    .line 166
    invoke-static {p1, p2, p0}, Lci3;->F(Lcom/google/android/gms/internal/measurement/zzhr;Ljava/lang/String;Ljava/lang/Long;)V

    .line 167
    .line 168
    .line 169
    :cond_4
    :goto_2
    const/4 p0, 0x1

    .line 170
    return p0

    .line 171
    :cond_5
    const/4 p0, 0x0

    .line 172
    return p0
.end method

.method public final J()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lbj3;->y()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lmp3;->k0()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lmp3;->c:Lae3;

    .line 12
    .line 13
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "select count(1) > 0 from raw_events"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v0, v1, v2}, Lae3;->V(Ljava/lang/String;[Ljava/lang/String;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    cmp-long v0, v0, v2

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object p0, p0, Lmp3;->c:Lae3;

    .line 31
    .line 32
    invoke-static {p0}, Lmp3;->S(Lwo3;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lae3;->H()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_1

    .line 44
    .line 45
    :goto_0
    const/4 p0, 0x1

    .line 46
    return p0

    .line 47
    :cond_1
    const/4 p0, 0x0

    .line 48
    return p0
.end method

.method public final L()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lmp3;->i:Lci3;

    .line 4
    .line 5
    invoke-virtual {v0}, Lmp3;->b()Lbj3;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Lbj3;->y()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lmp3;->k0()V

    .line 13
    .line 14
    .line 15
    iget-wide v2, v0, Lmp3;->Z:J

    .line 16
    .line 17
    const-wide/16 v4, 0x0

    .line 18
    .line 19
    cmp-long v2, v2, v4

    .line 20
    .line 21
    if-lez v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Lmp3;->f()Lxv;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lxt0;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    iget-wide v6, v0, Lmp3;->Z:J

    .line 37
    .line 38
    sub-long/2addr v2, v6

    .line 39
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    const-wide/32 v6, 0x36ee80

    .line 44
    .line 45
    .line 46
    sub-long/2addr v6, v2

    .line 47
    cmp-long v2, v6, v4

    .line 48
    .line 49
    if-lez v2, :cond_0

    .line 50
    .line 51
    invoke-virtual {v0}, Lmp3;->a()Luh3;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-object v1, v1, Luh3;->Y:Lsh3;

    .line 56
    .line 57
    const-string v2, "Upload has been suspended. Will update scheduling later in approximately ms"

    .line 58
    .line 59
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v1, v3, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lmp3;->g0()Lgi3;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1}, Lgi3;->b()V

    .line 71
    .line 72
    .line 73
    iget-object v0, v0, Lmp3;->e:Lpo3;

    .line 74
    .line 75
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Lpo3;->D()V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_0
    iput-wide v4, v0, Lmp3;->Z:J

    .line 83
    .line 84
    :cond_1
    iget-object v2, v0, Lmp3;->W:Lij3;

    .line 85
    .line 86
    invoke-virtual {v2}, Lij3;->h()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_16

    .line 91
    .line 92
    invoke-virtual {v0}, Lmp3;->J()Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_2

    .line 97
    .line 98
    goto/16 :goto_a

    .line 99
    .line 100
    :cond_2
    invoke-virtual {v0}, Lmp3;->f()Lxv;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Lxt0;

    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 110
    .line 111
    .line 112
    move-result-wide v2

    .line 113
    invoke-virtual {v0}, Lmp3;->d0()Lpd3;

    .line 114
    .line 115
    .line 116
    sget-object v6, Lvg3;->O:Lug3;

    .line 117
    .line 118
    const/4 v7, 0x0

    .line 119
    invoke-virtual {v6, v7}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    check-cast v6, Ljava/lang/Long;

    .line 124
    .line 125
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 126
    .line 127
    .line 128
    move-result-wide v8

    .line 129
    invoke-static {v4, v5, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 130
    .line 131
    .line 132
    move-result-wide v8

    .line 133
    iget-object v6, v0, Lmp3;->c:Lae3;

    .line 134
    .line 135
    invoke-static {v6}, Lmp3;->S(Lwo3;)V

    .line 136
    .line 137
    .line 138
    const-string v10, "select count(1) > 0 from raw_events where realtime = 1"

    .line 139
    .line 140
    invoke-virtual {v6, v10, v7}, Lae3;->V(Ljava/lang/String;[Ljava/lang/String;)J

    .line 141
    .line 142
    .line 143
    move-result-wide v10

    .line 144
    cmp-long v6, v10, v4

    .line 145
    .line 146
    if-eqz v6, :cond_3

    .line 147
    .line 148
    :goto_0
    const/4 v6, 0x1

    .line 149
    goto :goto_1

    .line 150
    :cond_3
    iget-object v6, v0, Lmp3;->c:Lae3;

    .line 151
    .line 152
    invoke-static {v6}, Lmp3;->S(Lwo3;)V

    .line 153
    .line 154
    .line 155
    const-string v12, "select count(1) > 0 from queue where has_realtime = 1"

    .line 156
    .line 157
    invoke-virtual {v6, v12, v7}, Lae3;->V(Ljava/lang/String;[Ljava/lang/String;)J

    .line 158
    .line 159
    .line 160
    move-result-wide v12

    .line 161
    cmp-long v6, v12, v4

    .line 162
    .line 163
    if-eqz v6, :cond_4

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_4
    const/4 v6, 0x0

    .line 167
    :goto_1
    if-eqz v6, :cond_6

    .line 168
    .line 169
    invoke-virtual {v0}, Lmp3;->d0()Lpd3;

    .line 170
    .line 171
    .line 172
    move-result-object v12

    .line 173
    const-string v13, "debug.firebase.analytics.app"

    .line 174
    .line 175
    invoke-virtual {v12, v13}, Lpd3;->D(Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 180
    .line 181
    .line 182
    move-result v13

    .line 183
    if-nez v13, :cond_5

    .line 184
    .line 185
    const-string v13, ".none."

    .line 186
    .line 187
    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v12

    .line 191
    if-nez v12, :cond_5

    .line 192
    .line 193
    invoke-virtual {v0}, Lmp3;->d0()Lpd3;

    .line 194
    .line 195
    .line 196
    sget-object v12, Lvg3;->J:Lug3;

    .line 197
    .line 198
    invoke-virtual {v12, v7}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v12

    .line 202
    check-cast v12, Ljava/lang/Long;

    .line 203
    .line 204
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 205
    .line 206
    .line 207
    move-result-wide v12

    .line 208
    invoke-static {v4, v5, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 209
    .line 210
    .line 211
    move-result-wide v12

    .line 212
    goto :goto_2

    .line 213
    :cond_5
    invoke-virtual {v0}, Lmp3;->d0()Lpd3;

    .line 214
    .line 215
    .line 216
    sget-object v12, Lvg3;->I:Lug3;

    .line 217
    .line 218
    invoke-virtual {v12, v7}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v12

    .line 222
    check-cast v12, Ljava/lang/Long;

    .line 223
    .line 224
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 225
    .line 226
    .line 227
    move-result-wide v12

    .line 228
    invoke-static {v4, v5, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 229
    .line 230
    .line 231
    move-result-wide v12

    .line 232
    goto :goto_2

    .line 233
    :cond_6
    invoke-virtual {v0}, Lmp3;->d0()Lpd3;

    .line 234
    .line 235
    .line 236
    sget-object v12, Lvg3;->H:Lug3;

    .line 237
    .line 238
    invoke-virtual {v12, v7}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v12

    .line 242
    check-cast v12, Ljava/lang/Long;

    .line 243
    .line 244
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 245
    .line 246
    .line 247
    move-result-wide v12

    .line 248
    invoke-static {v4, v5, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 249
    .line 250
    .line 251
    move-result-wide v12

    .line 252
    :goto_2
    iget-object v14, v0, Lmp3;->w:Ltn3;

    .line 253
    .line 254
    iget-object v14, v14, Ltn3;->v:Lio/sentry/android/core/s;

    .line 255
    .line 256
    invoke-virtual {v14}, Lio/sentry/android/core/s;->a()J

    .line 257
    .line 258
    .line 259
    move-result-wide v14

    .line 260
    iget-object v11, v0, Lmp3;->w:Ltn3;

    .line 261
    .line 262
    iget-object v11, v11, Ltn3;->w:Lio/sentry/android/core/s;

    .line 263
    .line 264
    invoke-virtual {v11}, Lio/sentry/android/core/s;->a()J

    .line 265
    .line 266
    .line 267
    move-result-wide v16

    .line 268
    iget-object v11, v0, Lmp3;->c:Lae3;

    .line 269
    .line 270
    invoke-static {v11}, Lmp3;->S(Lwo3;)V

    .line 271
    .line 272
    .line 273
    const-string v10, "select max(bundle_end_timestamp) from queue"

    .line 274
    .line 275
    invoke-virtual {v11, v10, v7, v4, v5}, Lae3;->W(Ljava/lang/String;[Ljava/lang/String;J)J

    .line 276
    .line 277
    .line 278
    move-result-wide v10

    .line 279
    iget-object v4, v0, Lmp3;->c:Lae3;

    .line 280
    .line 281
    invoke-static {v4}, Lmp3;->S(Lwo3;)V

    .line 282
    .line 283
    .line 284
    const-string v5, "select max(timestamp) from raw_events"

    .line 285
    .line 286
    move-wide/from16 v20, v2

    .line 287
    .line 288
    const-wide/16 v2, 0x0

    .line 289
    .line 290
    invoke-virtual {v4, v5, v7, v2, v3}, Lae3;->W(Ljava/lang/String;[Ljava/lang/String;J)J

    .line 291
    .line 292
    .line 293
    move-result-wide v4

    .line 294
    invoke-static {v10, v11, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 295
    .line 296
    .line 297
    move-result-wide v4

    .line 298
    cmp-long v10, v4, v2

    .line 299
    .line 300
    if-nez v10, :cond_9

    .line 301
    .line 302
    :cond_7
    const-wide/16 v4, 0x0

    .line 303
    .line 304
    :cond_8
    :goto_3
    const-wide/16 v18, 0x0

    .line 305
    .line 306
    goto/16 :goto_7

    .line 307
    .line 308
    :cond_9
    sub-long v4, v4, v20

    .line 309
    .line 310
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(J)J

    .line 311
    .line 312
    .line 313
    move-result-wide v2

    .line 314
    sub-long v2, v20, v2

    .line 315
    .line 316
    sub-long v14, v14, v20

    .line 317
    .line 318
    invoke-static {v14, v15}, Ljava/lang/Math;->abs(J)J

    .line 319
    .line 320
    .line 321
    move-result-wide v4

    .line 322
    sub-long v4, v20, v4

    .line 323
    .line 324
    sub-long v16, v16, v20

    .line 325
    .line 326
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->abs(J)J

    .line 327
    .line 328
    .line 329
    move-result-wide v10

    .line 330
    sub-long v10, v20, v10

    .line 331
    .line 332
    add-long/2addr v8, v2

    .line 333
    invoke-static {v4, v5, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 334
    .line 335
    .line 336
    move-result-wide v4

    .line 337
    if-eqz v6, :cond_a

    .line 338
    .line 339
    const-wide/16 v18, 0x0

    .line 340
    .line 341
    cmp-long v6, v4, v18

    .line 342
    .line 343
    if-lez v6, :cond_a

    .line 344
    .line 345
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 346
    .line 347
    .line 348
    move-result-wide v8

    .line 349
    add-long/2addr v8, v12

    .line 350
    :cond_a
    invoke-static {v1}, Lmp3;->S(Lwo3;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v1, v4, v5, v12, v13}, Lci3;->j0(JJ)Z

    .line 354
    .line 355
    .line 356
    move-result v6

    .line 357
    if-nez v6, :cond_b

    .line 358
    .line 359
    add-long/2addr v4, v12

    .line 360
    :goto_4
    const-wide/16 v18, 0x0

    .line 361
    .line 362
    goto :goto_5

    .line 363
    :cond_b
    move-wide v4, v8

    .line 364
    goto :goto_4

    .line 365
    :goto_5
    cmp-long v6, v10, v18

    .line 366
    .line 367
    if-eqz v6, :cond_8

    .line 368
    .line 369
    cmp-long v2, v10, v2

    .line 370
    .line 371
    if-ltz v2, :cond_8

    .line 372
    .line 373
    const/4 v2, 0x0

    .line 374
    :goto_6
    invoke-virtual {v0}, Lmp3;->d0()Lpd3;

    .line 375
    .line 376
    .line 377
    sget-object v3, Lvg3;->Q:Lug3;

    .line 378
    .line 379
    invoke-virtual {v3, v7}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    check-cast v3, Ljava/lang/Integer;

    .line 384
    .line 385
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    const/4 v6, 0x0

    .line 390
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    .line 391
    .line 392
    .line 393
    move-result v3

    .line 394
    const/16 v8, 0x14

    .line 395
    .line 396
    invoke-static {v8, v3}, Ljava/lang/Math;->min(II)I

    .line 397
    .line 398
    .line 399
    move-result v3

    .line 400
    if-ge v2, v3, :cond_7

    .line 401
    .line 402
    const-wide/16 v8, 0x1

    .line 403
    .line 404
    shl-long/2addr v8, v2

    .line 405
    invoke-virtual {v0}, Lmp3;->d0()Lpd3;

    .line 406
    .line 407
    .line 408
    sget-object v3, Lvg3;->P:Lug3;

    .line 409
    .line 410
    invoke-virtual {v3, v7}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v3

    .line 414
    check-cast v3, Ljava/lang/Long;

    .line 415
    .line 416
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 417
    .line 418
    .line 419
    move-result-wide v12

    .line 420
    const-wide/16 v14, 0x0

    .line 421
    .line 422
    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 423
    .line 424
    .line 425
    move-result-wide v12

    .line 426
    mul-long/2addr v12, v8

    .line 427
    add-long/2addr v4, v12

    .line 428
    cmp-long v3, v4, v10

    .line 429
    .line 430
    if-lez v3, :cond_c

    .line 431
    .line 432
    goto/16 :goto_3

    .line 433
    .line 434
    :cond_c
    add-int/lit8 v2, v2, 0x1

    .line 435
    .line 436
    goto :goto_6

    .line 437
    :goto_7
    cmp-long v2, v4, v18

    .line 438
    .line 439
    if-nez v2, :cond_d

    .line 440
    .line 441
    invoke-virtual {v0}, Lmp3;->a()Luh3;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    iget-object v1, v1, Luh3;->Y:Lsh3;

    .line 446
    .line 447
    const-string v2, "Next upload time is 0"

    .line 448
    .line 449
    invoke-virtual {v1, v2}, Lsh3;->a(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v0}, Lmp3;->g0()Lgi3;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    invoke-virtual {v1}, Lgi3;->b()V

    .line 457
    .line 458
    .line 459
    iget-object v0, v0, Lmp3;->e:Lpo3;

    .line 460
    .line 461
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v0}, Lpo3;->D()V

    .line 465
    .line 466
    .line 467
    return-void

    .line 468
    :cond_d
    iget-object v2, v0, Lmp3;->b:Lci3;

    .line 469
    .line 470
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v2}, Lci3;->T()Z

    .line 474
    .line 475
    .line 476
    move-result v2

    .line 477
    if-eqz v2, :cond_14

    .line 478
    .line 479
    iget-object v2, v0, Lmp3;->w:Ltn3;

    .line 480
    .line 481
    iget-object v2, v2, Ltn3;->i:Lio/sentry/android/core/s;

    .line 482
    .line 483
    invoke-virtual {v2}, Lio/sentry/android/core/s;->a()J

    .line 484
    .line 485
    .line 486
    move-result-wide v2

    .line 487
    invoke-virtual {v0}, Lmp3;->d0()Lpd3;

    .line 488
    .line 489
    .line 490
    sget-object v6, Lvg3;->G:Lug3;

    .line 491
    .line 492
    invoke-virtual {v6, v7}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v6

    .line 496
    check-cast v6, Ljava/lang/Long;

    .line 497
    .line 498
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 499
    .line 500
    .line 501
    move-result-wide v8

    .line 502
    const-wide/16 v14, 0x0

    .line 503
    .line 504
    invoke-static {v14, v15, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 505
    .line 506
    .line 507
    move-result-wide v8

    .line 508
    invoke-static {v1}, Lmp3;->S(Lwo3;)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v1, v2, v3, v8, v9}, Lci3;->j0(JJ)Z

    .line 512
    .line 513
    .line 514
    move-result v1

    .line 515
    if-nez v1, :cond_e

    .line 516
    .line 517
    add-long/2addr v2, v8

    .line 518
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 519
    .line 520
    .line 521
    move-result-wide v4

    .line 522
    :cond_e
    invoke-virtual {v0}, Lmp3;->g0()Lgi3;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    invoke-virtual {v1}, Lgi3;->b()V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v0}, Lmp3;->f()Lxv;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    check-cast v1, Lxt0;

    .line 534
    .line 535
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 539
    .line 540
    .line 541
    move-result-wide v1

    .line 542
    sub-long/2addr v4, v1

    .line 543
    const-wide/16 v14, 0x0

    .line 544
    .line 545
    cmp-long v1, v4, v14

    .line 546
    .line 547
    if-gtz v1, :cond_f

    .line 548
    .line 549
    invoke-virtual {v0}, Lmp3;->d0()Lpd3;

    .line 550
    .line 551
    .line 552
    sget-object v1, Lvg3;->K:Lug3;

    .line 553
    .line 554
    invoke-virtual {v1, v7}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v1

    .line 558
    check-cast v1, Ljava/lang/Long;

    .line 559
    .line 560
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 561
    .line 562
    .line 563
    move-result-wide v1

    .line 564
    invoke-static {v14, v15, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 565
    .line 566
    .line 567
    move-result-wide v4

    .line 568
    iget-object v1, v0, Lmp3;->w:Ltn3;

    .line 569
    .line 570
    iget-object v1, v1, Ltn3;->v:Lio/sentry/android/core/s;

    .line 571
    .line 572
    invoke-virtual {v0}, Lmp3;->f()Lxv;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    check-cast v2, Lxt0;

    .line 577
    .line 578
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 582
    .line 583
    .line 584
    move-result-wide v2

    .line 585
    invoke-virtual {v1, v2, v3}, Lio/sentry/android/core/s;->b(J)V

    .line 586
    .line 587
    .line 588
    :cond_f
    invoke-virtual {v0}, Lmp3;->a()Luh3;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    iget-object v1, v1, Luh3;->Y:Lsh3;

    .line 593
    .line 594
    const-string v2, "Upload scheduled in approximately ms"

    .line 595
    .line 596
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 597
    .line 598
    .line 599
    move-result-object v3

    .line 600
    invoke-virtual {v1, v3, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    iget-object v0, v0, Lmp3;->e:Lpo3;

    .line 604
    .line 605
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v0}, Lwo3;->A()V

    .line 609
    .line 610
    .line 611
    iget-object v1, v0, Lsq3;->a:Ljava/lang/Object;

    .line 612
    .line 613
    check-cast v1, Lij3;

    .line 614
    .line 615
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    iget-object v2, v1, Lij3;->f:Luh3;

    .line 619
    .line 620
    iget-object v3, v1, Lij3;->a:Landroid/content/Context;

    .line 621
    .line 622
    invoke-static {v3}, Lup3;->p0(Landroid/content/Context;)Z

    .line 623
    .line 624
    .line 625
    move-result v6

    .line 626
    if-nez v6, :cond_10

    .line 627
    .line 628
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 629
    .line 630
    .line 631
    iget-object v6, v2, Luh3;->X:Lsh3;

    .line 632
    .line 633
    const-string v8, "Receiver not registered/enabled"

    .line 634
    .line 635
    invoke-virtual {v6, v8}, Lsh3;->a(Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    :cond_10
    invoke-static {v3}, Lup3;->S(Landroid/content/Context;)Z

    .line 639
    .line 640
    .line 641
    move-result v6

    .line 642
    if-nez v6, :cond_11

    .line 643
    .line 644
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 645
    .line 646
    .line 647
    iget-object v6, v2, Luh3;->X:Lsh3;

    .line 648
    .line 649
    const-string v8, "Service not registered/enabled"

    .line 650
    .line 651
    invoke-virtual {v6, v8}, Lsh3;->a(Ljava/lang/String;)V

    .line 652
    .line 653
    .line 654
    :cond_11
    invoke-virtual {v0}, Lpo3;->D()V

    .line 655
    .line 656
    .line 657
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 658
    .line 659
    .line 660
    iget-object v2, v2, Luh3;->Y:Lsh3;

    .line 661
    .line 662
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 663
    .line 664
    .line 665
    move-result-object v6

    .line 666
    const-string v8, "Scheduling upload, millis"

    .line 667
    .line 668
    invoke-virtual {v2, v6, v8}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    iget-object v1, v1, Lij3;->V:Lxt0;

    .line 672
    .line 673
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 674
    .line 675
    .line 676
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 677
    .line 678
    .line 679
    sget-object v1, Lvg3;->L:Lug3;

    .line 680
    .line 681
    invoke-virtual {v1, v7}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v1

    .line 685
    check-cast v1, Ljava/lang/Long;

    .line 686
    .line 687
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 688
    .line 689
    .line 690
    move-result-wide v1

    .line 691
    const-wide/16 v14, 0x0

    .line 692
    .line 693
    invoke-static {v14, v15, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 694
    .line 695
    .line 696
    move-result-wide v1

    .line 697
    cmp-long v1, v4, v1

    .line 698
    .line 699
    if-gez v1, :cond_13

    .line 700
    .line 701
    invoke-virtual {v0}, Lpo3;->E()Lbe3;

    .line 702
    .line 703
    .line 704
    move-result-object v1

    .line 705
    iget-wide v1, v1, Lbe3;->c:J

    .line 706
    .line 707
    cmp-long v1, v1, v14

    .line 708
    .line 709
    if-eqz v1, :cond_12

    .line 710
    .line 711
    goto :goto_8

    .line 712
    :cond_12
    invoke-virtual {v0}, Lpo3;->E()Lbe3;

    .line 713
    .line 714
    .line 715
    move-result-object v1

    .line 716
    invoke-virtual {v1, v4, v5}, Lbe3;->b(J)V

    .line 717
    .line 718
    .line 719
    :cond_13
    :goto_8
    new-instance v1, Landroid/content/ComponentName;

    .line 720
    .line 721
    const-string v2, "com.google.android.gms.measurement.AppMeasurementJobService"

    .line 722
    .line 723
    invoke-direct {v1, v3, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v0}, Lpo3;->G()I

    .line 727
    .line 728
    .line 729
    move-result v0

    .line 730
    new-instance v2, Landroid/os/PersistableBundle;

    .line 731
    .line 732
    invoke-direct {v2}, Landroid/os/PersistableBundle;-><init>()V

    .line 733
    .line 734
    .line 735
    const-string v6, "action"

    .line 736
    .line 737
    const-string v7, "com.google.android.gms.measurement.UPLOAD"

    .line 738
    .line 739
    invoke-virtual {v2, v6, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 740
    .line 741
    .line 742
    new-instance v6, Landroid/app/job/JobInfo$Builder;

    .line 743
    .line 744
    invoke-direct {v6, v0, v1}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V

    .line 745
    .line 746
    .line 747
    invoke-virtual {v6, v4, v5}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    add-long/2addr v4, v4

    .line 752
    invoke-virtual {v0, v4, v5}, Landroid/app/job/JobInfo$Builder;->setOverrideDeadline(J)Landroid/app/job/JobInfo$Builder;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    invoke-virtual {v0, v2}, Landroid/app/job/JobInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/app/job/JobInfo$Builder;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    invoke-virtual {v0}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    const-string v1, "com.google.android.gms"

    .line 765
    .line 766
    const-string v2, "UploadAlarm"

    .line 767
    .line 768
    invoke-static {v3, v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzch;->zza(Landroid/content/Context;Landroid/app/job/JobInfo;Ljava/lang/String;Ljava/lang/String;)I

    .line 769
    .line 770
    .line 771
    return-void

    .line 772
    :cond_14
    invoke-virtual {v0}, Lmp3;->a()Luh3;

    .line 773
    .line 774
    .line 775
    move-result-object v1

    .line 776
    iget-object v1, v1, Luh3;->Y:Lsh3;

    .line 777
    .line 778
    const-string v2, "No network"

    .line 779
    .line 780
    invoke-virtual {v1, v2}, Lsh3;->a(Ljava/lang/String;)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {v0}, Lmp3;->g0()Lgi3;

    .line 784
    .line 785
    .line 786
    move-result-object v1

    .line 787
    iget-object v2, v1, Lgi3;->d:Ljava/lang/Object;

    .line 788
    .line 789
    check-cast v2, Lmp3;

    .line 790
    .line 791
    invoke-virtual {v2}, Lmp3;->k0()V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v2}, Lmp3;->b()Lbj3;

    .line 795
    .line 796
    .line 797
    move-result-object v3

    .line 798
    invoke-virtual {v3}, Lbj3;->y()V

    .line 799
    .line 800
    .line 801
    iget-boolean v3, v1, Lgi3;->b:Z

    .line 802
    .line 803
    if-eqz v3, :cond_15

    .line 804
    .line 805
    goto :goto_9

    .line 806
    :cond_15
    iget-object v3, v2, Lmp3;->W:Lij3;

    .line 807
    .line 808
    iget-object v3, v3, Lij3;->a:Landroid/content/Context;

    .line 809
    .line 810
    new-instance v4, Landroid/content/IntentFilter;

    .line 811
    .line 812
    const-string v5, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 813
    .line 814
    invoke-direct {v4, v5}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 815
    .line 816
    .line 817
    invoke-virtual {v3, v1, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 818
    .line 819
    .line 820
    iget-object v3, v2, Lmp3;->b:Lci3;

    .line 821
    .line 822
    invoke-static {v3}, Lmp3;->S(Lwo3;)V

    .line 823
    .line 824
    .line 825
    invoke-virtual {v3}, Lci3;->T()Z

    .line 826
    .line 827
    .line 828
    move-result v3

    .line 829
    iput-boolean v3, v1, Lgi3;->c:Z

    .line 830
    .line 831
    invoke-virtual {v2}, Lmp3;->a()Luh3;

    .line 832
    .line 833
    .line 834
    move-result-object v2

    .line 835
    iget-object v2, v2, Luh3;->Y:Lsh3;

    .line 836
    .line 837
    iget-boolean v3, v1, Lgi3;->c:Z

    .line 838
    .line 839
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 840
    .line 841
    .line 842
    move-result-object v3

    .line 843
    const-string v4, "Registering connectivity change receiver. Network connected"

    .line 844
    .line 845
    invoke-virtual {v2, v3, v4}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 846
    .line 847
    .line 848
    const/4 v2, 0x1

    .line 849
    iput-boolean v2, v1, Lgi3;->b:Z

    .line 850
    .line 851
    :goto_9
    iget-object v0, v0, Lmp3;->e:Lpo3;

    .line 852
    .line 853
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v0}, Lpo3;->D()V

    .line 857
    .line 858
    .line 859
    return-void

    .line 860
    :cond_16
    :goto_a
    invoke-virtual {v0}, Lmp3;->a()Luh3;

    .line 861
    .line 862
    .line 863
    move-result-object v1

    .line 864
    iget-object v1, v1, Luh3;->Y:Lsh3;

    .line 865
    .line 866
    const-string v2, "Nothing to upload or uploading impossible"

    .line 867
    .line 868
    invoke-virtual {v1, v2}, Lsh3;->a(Ljava/lang/String;)V

    .line 869
    .line 870
    .line 871
    invoke-virtual {v0}, Lmp3;->g0()Lgi3;

    .line 872
    .line 873
    .line 874
    move-result-object v1

    .line 875
    invoke-virtual {v1}, Lgi3;->b()V

    .line 876
    .line 877
    .line 878
    iget-object v0, v0, Lmp3;->e:Lpo3;

    .line 879
    .line 880
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 881
    .line 882
    .line 883
    invoke-virtual {v0}, Lpo3;->D()V

    .line 884
    .line 885
    .line 886
    return-void
.end method

.method public final M()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lbj3;->y()V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Lmp3;->e0:Z

    .line 9
    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    iget-boolean v0, p0, Lmp3;->f0:Z

    .line 13
    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    iget-boolean v0, p0, Lmp3;->g0:Z

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 26
    .line 27
    const-string v1, "Stopping uploading service(s)"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lmp3;->a0:Ljava/util/ArrayList;

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Ljava/lang/Runnable;

    .line 52
    .line 53
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    iget-object p0, p0, Lmp3;->a0:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-static {p0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 71
    .line 72
    iget-boolean v1, p0, Lmp3;->e0:Z

    .line 73
    .line 74
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iget-boolean v2, p0, Lmp3;->f0:Z

    .line 79
    .line 80
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    iget-boolean p0, p0, Lmp3;->g0:Z

    .line 85
    .line 86
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    const-string v3, "Not stopping services. fetch, network, upload"

    .line 91
    .line 92
    invoke-virtual {v0, v3, v1, v2, p0}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final N(Ldi3;)Ljava/lang/Boolean;
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ldi3;->P()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    const-wide/32 v2, -0x80000000

    .line 6
    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iget-object p0, p0, Lmp3;->W:Lij3;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    :try_start_1
    iget-object p0, p0, Lij3;->a:Landroid/content/Context;

    .line 16
    .line 17
    invoke-static {p0}, Lg93;->a(Landroid/content/Context;)Lv30;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p1}, Ldi3;->D()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0, v1, v0}, Lv30;->c(ILjava/lang/String;)Landroid/content/pm/PackageInfo;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    iget p0, p0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 30
    .line 31
    invoke-virtual {p1}, Ldi3;->P()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    int-to-long p0, p0

    .line 36
    cmp-long p0, v0, p0

    .line 37
    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_0
    iget-object p0, p0, Lij3;->a:Landroid/content/Context;

    .line 44
    .line 45
    invoke-static {p0}, Lg93;->a(Landroid/content/Context;)Lv30;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p1}, Ldi3;->D()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p0, v1, v0}, Lv30;->c(ILjava/lang/String;)Landroid/content/pm/PackageInfo;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {p1}, Ldi3;->N()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-eqz p0, :cond_1

    .line 70
    .line 71
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 75
    .line 76
    return-object p0

    .line 77
    :catch_0
    const/4 p0, 0x0

    .line 78
    return-object p0
.end method

.method public final O(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzr;
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lmp3;->c:Lae3;

    .line 6
    .line 7
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2, v1}, Lae3;->D0(Ljava/lang/String;)Ldi3;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    iget-object v4, v2, Ldi3;->a:Lij3;

    .line 18
    .line 19
    invoke-virtual {v2}, Ldi3;->N()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    goto/16 :goto_0

    .line 30
    .line 31
    :cond_0
    invoke-virtual {v0, v2}, Lmp3;->N(Ldi3;)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    if-eqz v5, :cond_1

    .line 36
    .line 37
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-nez v5, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0}, Lmp3;->a()Luh3;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 48
    .line 49
    invoke-static {v1}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-string v2, "App version does not match; dropping. appId"

    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v3

    .line 59
    :cond_1
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzr;

    .line 60
    .line 61
    invoke-virtual {v2}, Ldi3;->G()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    move-object v5, v3

    .line 66
    invoke-virtual {v2}, Ldi3;->N()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v2}, Ldi3;->P()J

    .line 71
    .line 72
    .line 73
    move-result-wide v6

    .line 74
    iget-object v8, v4, Lij3;->i:Lbj3;

    .line 75
    .line 76
    invoke-static {v8}, Lij3;->l(Lhk3;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v8}, Lbj3;->y()V

    .line 80
    .line 81
    .line 82
    move-wide v7, v6

    .line 83
    iget-object v6, v2, Ldi3;->l:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v9, v4, Lij3;->i:Lbj3;

    .line 86
    .line 87
    invoke-static {v9}, Lij3;->l(Lhk3;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v9}, Lbj3;->y()V

    .line 91
    .line 92
    .line 93
    move-wide v9, v7

    .line 94
    iget-wide v7, v2, Ldi3;->m:J

    .line 95
    .line 96
    iget-object v11, v4, Lij3;->i:Lbj3;

    .line 97
    .line 98
    invoke-static {v11}, Lij3;->l(Lhk3;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v11}, Lbj3;->y()V

    .line 102
    .line 103
    .line 104
    move-wide v11, v9

    .line 105
    iget-wide v9, v2, Ldi3;->n:J

    .line 106
    .line 107
    iget-object v13, v4, Lij3;->i:Lbj3;

    .line 108
    .line 109
    invoke-static {v13}, Lij3;->l(Lhk3;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v13}, Lbj3;->y()V

    .line 113
    .line 114
    .line 115
    move-wide v13, v11

    .line 116
    iget-boolean v12, v2, Ldi3;->o:Z

    .line 117
    .line 118
    move-wide v15, v13

    .line 119
    invoke-virtual {v2}, Ldi3;->J()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v14

    .line 123
    iget-object v11, v4, Lij3;->i:Lbj3;

    .line 124
    .line 125
    invoke-static {v11}, Lij3;->l(Lhk3;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v11}, Lbj3;->y()V

    .line 129
    .line 130
    .line 131
    iget-boolean v11, v2, Ldi3;->p:Z

    .line 132
    .line 133
    invoke-virtual {v2}, Ldi3;->w()Ljava/lang/Boolean;

    .line 134
    .line 135
    .line 136
    move-result-object v20

    .line 137
    invoke-virtual {v2}, Ldi3;->b()J

    .line 138
    .line 139
    .line 140
    move-result-wide v21

    .line 141
    iget-object v13, v4, Lij3;->i:Lbj3;

    .line 142
    .line 143
    invoke-static {v13}, Lij3;->l(Lhk3;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v13}, Lbj3;->y()V

    .line 147
    .line 148
    .line 149
    iget-object v13, v2, Ldi3;->s:Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-virtual/range {p0 .. p1}, Lmp3;->d(Ljava/lang/String;)Lok3;

    .line 152
    .line 153
    .line 154
    move-result-object v17

    .line 155
    invoke-virtual/range {v17 .. v17}, Lok3;->g()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v24

    .line 159
    invoke-virtual {v2}, Ldi3;->y()Z

    .line 160
    .line 161
    .line 162
    move-result v27

    .line 163
    move-object/from16 v17, v0

    .line 164
    .line 165
    iget-object v0, v4, Lij3;->i:Lbj3;

    .line 166
    .line 167
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Lbj3;->y()V

    .line 171
    .line 172
    .line 173
    iget-wide v0, v2, Ldi3;->v:J

    .line 174
    .line 175
    move-wide/from16 v28, v0

    .line 176
    .line 177
    invoke-virtual/range {p0 .. p1}, Lmp3;->d(Ljava/lang/String;)Lok3;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    iget v0, v0, Lok3;->b:I

    .line 182
    .line 183
    invoke-virtual/range {p0 .. p1}, Lmp3;->n0(Ljava/lang/String;)Lce3;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    iget-object v1, v1, Lce3;->b:Ljava/lang/String;

    .line 188
    .line 189
    move/from16 v30, v0

    .line 190
    .line 191
    iget-object v0, v4, Lij3;->i:Lbj3;

    .line 192
    .line 193
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0}, Lbj3;->y()V

    .line 197
    .line 198
    .line 199
    iget v0, v2, Ldi3;->x:I

    .line 200
    .line 201
    iget-object v4, v4, Lij3;->i:Lbj3;

    .line 202
    .line 203
    invoke-static {v4}, Lij3;->l(Lhk3;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v4}, Lbj3;->y()V

    .line 207
    .line 208
    .line 209
    move/from16 v32, v0

    .line 210
    .line 211
    move-object/from16 v31, v1

    .line 212
    .line 213
    iget-wide v0, v2, Ldi3;->B:J

    .line 214
    .line 215
    invoke-virtual {v2}, Ldi3;->C()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v35

    .line 219
    invoke-virtual {v2}, Ldi3;->s()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v36

    .line 223
    invoke-virtual {v2}, Ldi3;->t()I

    .line 224
    .line 225
    .line 226
    move-result v39

    .line 227
    const/16 v26, 0x0

    .line 228
    .line 229
    const-wide/16 v37, 0x0

    .line 230
    .line 231
    move/from16 v18, v11

    .line 232
    .line 233
    const/4 v11, 0x0

    .line 234
    move-object/from16 v23, v13

    .line 235
    .line 236
    const/4 v13, 0x0

    .line 237
    move-object v2, v5

    .line 238
    move-wide v4, v15

    .line 239
    const-wide/16 v15, 0x0

    .line 240
    .line 241
    move-wide/from16 v33, v0

    .line 242
    .line 243
    move-object/from16 v0, v17

    .line 244
    .line 245
    const/16 v17, 0x0

    .line 246
    .line 247
    const/16 v19, 0x0

    .line 248
    .line 249
    const-string v25, ""

    .line 250
    .line 251
    move-object/from16 v1, p1

    .line 252
    .line 253
    invoke-direct/range {v0 .. v39}, Lcom/google/android/gms/measurement/internal/zzr;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JIZZLjava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;JI)V

    .line 254
    .line 255
    .line 256
    return-object v0

    .line 257
    :cond_2
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lmp3;->a()Luh3;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    iget-object v0, v0, Luh3;->X:Lsh3;

    .line 262
    .line 263
    const-string v2, "No app data available; dropping"

    .line 264
    .line 265
    invoke-virtual {v0, v1, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    return-object v3
.end method

.method public final P(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-object p0, p0, Lmp3;->c:Lae3;

    .line 2
    .line 3
    invoke-static {p0}, Lmp3;->S(Lwo3;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "events"

    .line 7
    .line 8
    invoke-virtual {p0, v0, p1, p2}, Lae3;->Z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lpe3;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    iget-wide p0, p0, Lpe3;->c:J

    .line 15
    .line 16
    const-wide/16 v0, 0x1

    .line 17
    .line 18
    cmp-long p0, p0, v0

    .line 19
    .line 20
    if-gez p0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 26
    return p0
.end method

.method public final U(Lcom/google/android/gms/measurement/internal/zzpk;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "_id"

    .line 8
    .line 9
    invoke-virtual {v1}, Lmp3;->b()Lbj3;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual {v4}, Lbj3;->y()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lmp3;->k0()V

    .line 17
    .line 18
    .line 19
    invoke-static {v2}, Lmp3;->Q(Lcom/google/android/gms/measurement/internal/zzr;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    iget-object v6, v2, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 24
    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    goto/16 :goto_8

    .line 28
    .line 29
    :cond_0
    iget-boolean v4, v2, Lcom/google/android/gms/measurement/internal/zzr;->v:Z

    .line 30
    .line 31
    if-nez v4, :cond_1

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Lmp3;->a0(Lcom/google/android/gms/measurement/internal/zzr;)Ldi3;

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    iget-object v8, v0, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v4, v8}, Lup3;->E0(Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v11

    .line 47
    const/4 v4, 0x1

    .line 48
    const/16 v5, 0x18

    .line 49
    .line 50
    iget-object v9, v1, Lmp3;->u0:Lac3;

    .line 51
    .line 52
    if-eqz v11, :cond_3

    .line 53
    .line 54
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 58
    .line 59
    .line 60
    invoke-static {v5, v8, v4}, Lup3;->E(ILjava/lang/String;Z)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v13

    .line 64
    if-eqz v8, :cond_2

    .line 65
    .line 66
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v12

    .line 70
    move v14, v12

    .line 71
    goto :goto_0

    .line 72
    :cond_2
    const/4 v14, 0x0

    .line 73
    :goto_0
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 74
    .line 75
    .line 76
    iget-object v10, v2, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 77
    .line 78
    const-string v12, "_ev"

    .line 79
    .line 80
    invoke-static/range {v9 .. v14}, Lup3;->P(Lac3;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_3
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzpk;->D1()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    invoke-virtual {v7, v10, v8}, Lup3;->M(Ljava/lang/Object;Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    move-result v14

    .line 96
    if-eqz v14, :cond_6

    .line 97
    .line 98
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 102
    .line 103
    .line 104
    invoke-static {v5, v8, v4}, Lup3;->E(ILjava/lang/String;Z)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v16

    .line 108
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzpk;->D1()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    instance-of v3, v0, Ljava/lang/String;

    .line 115
    .line 116
    if-nez v3, :cond_5

    .line 117
    .line 118
    instance-of v3, v0, Ljava/lang/CharSequence;

    .line 119
    .line 120
    if-eqz v3, :cond_4

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_4
    const/16 v17, 0x0

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_5
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 131
    .line 132
    .line 133
    move-result v12

    .line 134
    move/from16 v17, v12

    .line 135
    .line 136
    :goto_2
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 137
    .line 138
    .line 139
    iget-object v13, v2, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 140
    .line 141
    const-string v15, "_ev"

    .line 142
    .line 143
    move-object v12, v9

    .line 144
    invoke-static/range {v12 .. v17}, Lup3;->P(Lac3;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_6
    move-object v4, v9

    .line 149
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzpk;->D1()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    invoke-virtual {v5, v7, v8}, Lup3;->N(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    if-eqz v11, :cond_f

    .line 162
    .line 163
    const-string v13, "_sid"

    .line 164
    .line 165
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    if-eqz v5, :cond_a

    .line 170
    .line 171
    iget-wide v9, v0, Lcom/google/android/gms/measurement/internal/zzpk;->c:J

    .line 172
    .line 173
    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/zzpk;->f:Ljava/lang/String;

    .line 174
    .line 175
    invoke-static {v6}, Lkb1;->n(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    iget-object v7, v1, Lmp3;->c:Lae3;

    .line 179
    .line 180
    invoke-static {v7}, Lmp3;->S(Lwo3;)V

    .line 181
    .line 182
    .line 183
    const-string v14, "_sno"

    .line 184
    .line 185
    invoke-virtual {v7, v6, v14}, Lae3;->v0(Ljava/lang/String;Ljava/lang/String;)Lrp3;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    if-eqz v7, :cond_7

    .line 190
    .line 191
    iget-object v14, v7, Lrp3;->e:Ljava/lang/Object;

    .line 192
    .line 193
    instance-of v15, v14, Ljava/lang/Long;

    .line 194
    .line 195
    if-eqz v15, :cond_7

    .line 196
    .line 197
    check-cast v14, Ljava/lang/Long;

    .line 198
    .line 199
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 200
    .line 201
    .line 202
    move-result-wide v14

    .line 203
    move-object/from16 v22, v13

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_7
    if-eqz v7, :cond_8

    .line 207
    .line 208
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 209
    .line 210
    .line 211
    move-result-object v14

    .line 212
    iget-object v14, v14, Luh3;->w:Lsh3;

    .line 213
    .line 214
    const-string v15, "Retrieved last session number from database does not contain a valid (long) value"

    .line 215
    .line 216
    iget-object v7, v7, Lrp3;->e:Ljava/lang/Object;

    .line 217
    .line 218
    invoke-virtual {v14, v7, v15}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    :cond_8
    iget-object v7, v1, Lmp3;->c:Lae3;

    .line 222
    .line 223
    invoke-static {v7}, Lmp3;->S(Lwo3;)V

    .line 224
    .line 225
    .line 226
    const-string v14, "_s"

    .line 227
    .line 228
    const-string v15, "events"

    .line 229
    .line 230
    invoke-virtual {v7, v15, v6, v14}, Lae3;->Z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lpe3;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    if-eqz v7, :cond_9

    .line 235
    .line 236
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 237
    .line 238
    .line 239
    move-result-object v14

    .line 240
    iget-object v14, v14, Luh3;->Y:Lsh3;

    .line 241
    .line 242
    move-object/from16 v22, v13

    .line 243
    .line 244
    iget-wide v12, v7, Lpe3;->c:J

    .line 245
    .line 246
    const-string v7, "Backfill the session number. Last used session number"

    .line 247
    .line 248
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 249
    .line 250
    .line 251
    move-result-object v15

    .line 252
    invoke-virtual {v14, v15, v7}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    move-wide v14, v12

    .line 256
    goto :goto_3

    .line 257
    :cond_9
    move-object/from16 v22, v13

    .line 258
    .line 259
    const-wide/16 v14, 0x0

    .line 260
    .line 261
    :goto_3
    new-instance v16, Lcom/google/android/gms/measurement/internal/zzpk;

    .line 262
    .line 263
    const-wide/16 v12, 0x1

    .line 264
    .line 265
    add-long/2addr v14, v12

    .line 266
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 267
    .line 268
    .line 269
    move-result-object v19

    .line 270
    const-string v20, "_sno"

    .line 271
    .line 272
    move-object/from16 v21, v5

    .line 273
    .line 274
    move-wide/from16 v17, v9

    .line 275
    .line 276
    invoke-direct/range {v16 .. v21}, Lcom/google/android/gms/measurement/internal/zzpk;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    move-object/from16 v5, v16

    .line 280
    .line 281
    invoke-virtual {v1, v5, v2}, Lmp3;->U(Lcom/google/android/gms/measurement/internal/zzpk;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 282
    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_a
    move-object/from16 v22, v13

    .line 286
    .line 287
    :goto_4
    new-instance v5, Lrp3;

    .line 288
    .line 289
    invoke-static {v6}, Lkb1;->n(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    iget-object v7, v0, Lcom/google/android/gms/measurement/internal/zzpk;->f:Ljava/lang/String;

    .line 293
    .line 294
    invoke-static {v7}, Lkb1;->n(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    iget-wide v9, v0, Lcom/google/android/gms/measurement/internal/zzpk;->c:J

    .line 298
    .line 299
    invoke-direct/range {v5 .. v11}, Lrp3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 307
    .line 308
    iget-object v7, v1, Lmp3;->W:Lij3;

    .line 309
    .line 310
    iget-object v9, v7, Lij3;->U:Lmh3;

    .line 311
    .line 312
    iget-object v10, v5, Lrp3;->c:Ljava/lang/String;

    .line 313
    .line 314
    invoke-virtual {v9, v10}, Lmh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v9

    .line 318
    const-string v12, "Setting user property"

    .line 319
    .line 320
    invoke-virtual {v0, v9, v12, v11}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    iget-object v0, v1, Lmp3;->c:Lae3;

    .line 324
    .line 325
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0}, Lae3;->n0()V

    .line 329
    .line 330
    .line 331
    :try_start_0
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 335
    iget-object v9, v5, Lrp3;->e:Ljava/lang/Object;

    .line 336
    .line 337
    if-eqz v0, :cond_b

    .line 338
    .line 339
    :try_start_1
    iget-object v0, v1, Lmp3;->c:Lae3;

    .line 340
    .line 341
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0, v6, v3}, Lae3;->v0(Ljava/lang/String;Ljava/lang/String;)Lrp3;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    if-eqz v0, :cond_b

    .line 349
    .line 350
    iget-object v0, v0, Lrp3;->e:Ljava/lang/Object;

    .line 351
    .line 352
    invoke-virtual {v9, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-nez v0, :cond_b

    .line 357
    .line 358
    iget-object v0, v1, Lmp3;->c:Lae3;

    .line 359
    .line 360
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 361
    .line 362
    .line 363
    const-string v3, "_lair"

    .line 364
    .line 365
    invoke-virtual {v0, v6, v3}, Lae3;->t0(Ljava/lang/String;Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    goto :goto_5

    .line 369
    :catchall_0
    move-exception v0

    .line 370
    goto/16 :goto_7

    .line 371
    .line 372
    :cond_b
    :goto_5
    invoke-virtual {v1, v2}, Lmp3;->a0(Lcom/google/android/gms/measurement/internal/zzr;)Ldi3;

    .line 373
    .line 374
    .line 375
    iget-object v0, v1, Lmp3;->c:Lae3;

    .line 376
    .line 377
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0, v5}, Lae3;->u0(Lrp3;)Z

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    move-object/from16 v3, v22

    .line 385
    .line 386
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v3

    .line 390
    if-eqz v3, :cond_d

    .line 391
    .line 392
    iget-object v3, v1, Lmp3;->i:Lci3;

    .line 393
    .line 394
    invoke-static {v3}, Lmp3;->S(Lwo3;)V

    .line 395
    .line 396
    .line 397
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzr;->f0:Ljava/lang/String;

    .line 398
    .line 399
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 400
    .line 401
    .line 402
    move-result v5

    .line 403
    if-eqz v5, :cond_c

    .line 404
    .line 405
    const-wide/16 v14, 0x0

    .line 406
    .line 407
    goto :goto_6

    .line 408
    :cond_c
    const-string v5, "UTF-8"

    .line 409
    .line 410
    invoke-static {v5}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    invoke-virtual {v2, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    invoke-virtual {v3, v2}, Lci3;->k0([B)J

    .line 419
    .line 420
    .line 421
    move-result-wide v14

    .line 422
    :goto_6
    iget-object v2, v1, Lmp3;->c:Lae3;

    .line 423
    .line 424
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2, v6}, Lae3;->D0(Ljava/lang/String;)Ldi3;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    if-eqz v2, :cond_d

    .line 432
    .line 433
    invoke-virtual {v2, v14, v15}, Ldi3;->A(J)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v2}, Ldi3;->o()Z

    .line 437
    .line 438
    .line 439
    move-result v3

    .line 440
    if-eqz v3, :cond_d

    .line 441
    .line 442
    iget-object v3, v1, Lmp3;->c:Lae3;

    .line 443
    .line 444
    invoke-static {v3}, Lmp3;->S(Lwo3;)V

    .line 445
    .line 446
    .line 447
    const/4 v15, 0x0

    .line 448
    invoke-virtual {v3, v2, v15}, Lae3;->E0(Ldi3;Z)V

    .line 449
    .line 450
    .line 451
    :cond_d
    iget-object v2, v1, Lmp3;->c:Lae3;

    .line 452
    .line 453
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v2}, Lae3;->o0()V

    .line 457
    .line 458
    .line 459
    if-nez v0, :cond_e

    .line 460
    .line 461
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 466
    .line 467
    const-string v2, "Too many unique user properties are set. Ignoring user property"

    .line 468
    .line 469
    iget-object v3, v7, Lij3;->U:Lmh3;

    .line 470
    .line 471
    invoke-virtual {v3, v10}, Lmh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v3

    .line 475
    invoke-virtual {v0, v3, v2, v9}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 479
    .line 480
    .line 481
    const/4 v9, 0x0

    .line 482
    const/4 v10, 0x0

    .line 483
    const/16 v7, 0x9

    .line 484
    .line 485
    const/4 v8, 0x0

    .line 486
    move-object v5, v4

    .line 487
    invoke-static/range {v5 .. v10}, Lup3;->P(Lac3;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 488
    .line 489
    .line 490
    :cond_e
    iget-object v0, v1, Lmp3;->c:Lae3;

    .line 491
    .line 492
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v0}, Lae3;->p0()V

    .line 496
    .line 497
    .line 498
    return-void

    .line 499
    :goto_7
    iget-object v1, v1, Lmp3;->c:Lae3;

    .line 500
    .line 501
    invoke-static {v1}, Lmp3;->S(Lwo3;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v1}, Lae3;->p0()V

    .line 505
    .line 506
    .line 507
    throw v0

    .line 508
    :cond_f
    :goto_8
    return-void
.end method

.method public final V(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lbj3;->y()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lmp3;->k0()V

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Lmp3;->Q(Lcom/google/android/gms/measurement/internal/zzr;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/measurement/internal/zzr;->v:Z

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, p2}, Lmp3;->a0(Lcom/google/android/gms/measurement/internal/zzr;)Ldi3;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-static {p2}, Lmp3;->T(Lcom/google/android/gms/measurement/internal/zzr;)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v2, "_npa"

    .line 33
    .line 34
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object p1, p1, Luh3;->X:Lsh3;

    .line 47
    .line 48
    const-string v1, "Falling back to manifest metadata value for ad personalization"

    .line 49
    .line 50
    invoke-virtual {p1, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzpk;

    .line 54
    .line 55
    invoke-virtual {p0}, Lmp3;->f()Lxv;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Lxt0;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 65
    .line 66
    .line 67
    move-result-wide v3

    .line 68
    const/4 p1, 0x1

    .line 69
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eq p1, v0, :cond_2

    .line 74
    .line 75
    const-wide/16 v0, 0x0

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    const-wide/16 v0, 0x1

    .line 79
    .line 80
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    const-string v7, "auto"

    .line 85
    .line 86
    const-string v6, "_npa"

    .line 87
    .line 88
    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/measurement/internal/zzpk;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v2, p2}, Lmp3;->U(Lcom/google/android/gms/measurement/internal/zzpk;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_3
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iget-object v0, v0, Luh3;->X:Lsh3;

    .line 100
    .line 101
    iget-object v2, p0, Lmp3;->W:Lij3;

    .line 102
    .line 103
    iget-object v3, v2, Lij3;->U:Lmh3;

    .line 104
    .line 105
    invoke-virtual {v3, p1}, Lmh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    const-string v4, "Removing user property"

    .line 110
    .line 111
    invoke-virtual {v0, v3, v4}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    iget-object v0, p0, Lmp3;->c:Lae3;

    .line 115
    .line 116
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Lae3;->n0()V

    .line 120
    .line 121
    .line 122
    :try_start_0
    invoke-virtual {p0, p2}, Lmp3;->a0(Lcom/google/android/gms/measurement/internal/zzr;)Ldi3;

    .line 123
    .line 124
    .line 125
    const-string p2, "_id"

    .line 126
    .line 127
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    if-eqz p2, :cond_4

    .line 132
    .line 133
    iget-object p2, p0, Lmp3;->c:Lae3;

    .line 134
    .line 135
    invoke-static {p2}, Lmp3;->S(Lwo3;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    const-string v0, "_lair"

    .line 142
    .line 143
    invoke-virtual {p2, v1, v0}, Lae3;->t0(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :catchall_0
    move-exception v0

    .line 148
    move-object p1, v0

    .line 149
    goto :goto_2

    .line 150
    :cond_4
    :goto_1
    iget-object p2, p0, Lmp3;->c:Lae3;

    .line 151
    .line 152
    invoke-static {p2}, Lmp3;->S(Lwo3;)V

    .line 153
    .line 154
    .line 155
    invoke-static {v1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p2, v1, p1}, Lae3;->t0(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    iget-object p2, p0, Lmp3;->c:Lae3;

    .line 162
    .line 163
    invoke-static {p2}, Lmp3;->S(Lwo3;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p2}, Lae3;->o0()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    iget-object p2, p2, Luh3;->X:Lsh3;

    .line 174
    .line 175
    const-string v0, "User property removed"

    .line 176
    .line 177
    iget-object v1, v2, Lij3;->U:Lmh3;

    .line 178
    .line 179
    invoke-virtual {v1, p1}, Lmh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-virtual {p2, p1, v0}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 184
    .line 185
    .line 186
    iget-object p0, p0, Lmp3;->c:Lae3;

    .line 187
    .line 188
    invoke-static {p0}, Lmp3;->S(Lwo3;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0}, Lae3;->p0()V

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :goto_2
    iget-object p0, p0, Lmp3;->c:Lae3;

    .line 196
    .line 197
    invoke-static {p0}, Lmp3;->S(Lwo3;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, Lae3;->p0()V

    .line 201
    .line 202
    .line 203
    throw p1
.end method

.method public final W(Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 31

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget-object v3, v1, Lmp3;->W:Lij3;

    .line 6
    .line 7
    const-string v4, "_sysu"

    .line 8
    .line 9
    const-string v5, "_sys"

    .line 10
    .line 11
    const-string v6, "_pfo"

    .line 12
    .line 13
    const-string v0, "com.android.vending"

    .line 14
    .line 15
    const-string v7, "_npa"

    .line 16
    .line 17
    const-string v8, "_uwa"

    .line 18
    .line 19
    invoke-virtual {v1}, Lmp3;->b()Lbj3;

    .line 20
    .line 21
    .line 22
    move-result-object v9

    .line 23
    invoke-virtual {v9}, Lbj3;->y()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lmp3;->k0()V

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkb1;->n(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-boolean v9, v2, Lcom/google/android/gms/measurement/internal/zzr;->Z:Z

    .line 33
    .line 34
    iget-object v10, v2, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v10}, Lkb1;->k(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v2}, Lmp3;->Q(Lcom/google/android/gms/measurement/internal/zzr;)Z

    .line 40
    .line 41
    .line 42
    move-result v11

    .line 43
    if-nez v11, :cond_0

    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    iget-object v11, v1, Lmp3;->c:Lae3;

    .line 47
    .line 48
    invoke-static {v11}, Lmp3;->S(Lwo3;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v11, v10}, Lae3;->D0(Ljava/lang/String;)Ldi3;

    .line 52
    .line 53
    .line 54
    move-result-object v11

    .line 55
    const/4 v12, 0x0

    .line 56
    const-wide/16 v13, 0x0

    .line 57
    .line 58
    if-eqz v11, :cond_1

    .line 59
    .line 60
    invoke-virtual {v11}, Ldi3;->G()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v15

    .line 64
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v15

    .line 68
    if-eqz v15, :cond_1

    .line 69
    .line 70
    iget-object v15, v2, Lcom/google/android/gms/measurement/internal/zzr;->b:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result v15

    .line 76
    if-nez v15, :cond_1

    .line 77
    .line 78
    invoke-virtual {v11, v13, v14}, Ldi3;->f(J)V

    .line 79
    .line 80
    .line 81
    iget-object v15, v1, Lmp3;->c:Lae3;

    .line 82
    .line 83
    invoke-static {v15}, Lmp3;->S(Lwo3;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v15, v11, v12}, Lae3;->E0(Ldi3;Z)V

    .line 87
    .line 88
    .line 89
    iget-object v11, v1, Lmp3;->a:Lvi3;

    .line 90
    .line 91
    invoke-static {v11}, Lmp3;->S(Lwo3;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v11}, Lsq3;->y()V

    .line 95
    .line 96
    .line 97
    iget-object v11, v11, Lvi3;->v:Lid;

    .line 98
    .line 99
    invoke-virtual {v11, v10}, Lle2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    :cond_1
    iget-boolean v11, v2, Lcom/google/android/gms/measurement/internal/zzr;->v:Z

    .line 103
    .line 104
    if-nez v11, :cond_2

    .line 105
    .line 106
    invoke-virtual/range {p0 .. p1}, Lmp3;->a0(Lcom/google/android/gms/measurement/internal/zzr;)Ldi3;

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_2
    move-wide v15, v13

    .line 111
    iget-wide v13, v2, Lcom/google/android/gms/measurement/internal/zzr;->W:J

    .line 112
    .line 113
    cmp-long v11, v13, v15

    .line 114
    .line 115
    if-nez v11, :cond_3

    .line 116
    .line 117
    invoke-virtual {v1}, Lmp3;->f()Lxv;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    check-cast v11, Lxt0;

    .line 122
    .line 123
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 127
    .line 128
    .line 129
    move-result-wide v13

    .line 130
    :cond_3
    move-wide/from16 v18, v13

    .line 131
    .line 132
    iget v11, v2, Lcom/google/android/gms/measurement/internal/zzr;->X:I

    .line 133
    .line 134
    const/4 v13, 0x1

    .line 135
    if-eqz v11, :cond_4

    .line 136
    .line 137
    if-eq v11, v13, :cond_4

    .line 138
    .line 139
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 140
    .line 141
    .line 142
    move-result-object v14

    .line 143
    iget-object v14, v14, Luh3;->w:Lsh3;

    .line 144
    .line 145
    invoke-static {v10}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 146
    .line 147
    .line 148
    move-result-object v15

    .line 149
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v11

    .line 153
    const-string v12, "Incorrect app type, assuming installed app. appId, appType"

    .line 154
    .line 155
    invoke-virtual {v14, v15, v12, v11}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    const/4 v11, 0x0

    .line 159
    :cond_4
    iget-object v12, v1, Lmp3;->c:Lae3;

    .line 160
    .line 161
    invoke-static {v12}, Lmp3;->S(Lwo3;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12}, Lae3;->n0()V

    .line 165
    .line 166
    .line 167
    :try_start_0
    iget-object v12, v1, Lmp3;->c:Lae3;

    .line 168
    .line 169
    invoke-static {v12}, Lmp3;->S(Lwo3;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12, v10, v7}, Lae3;->v0(Ljava/lang/String;Ljava/lang/String;)Lrp3;

    .line 173
    .line 174
    .line 175
    move-result-object v12

    .line 176
    invoke-static {v2}, Lmp3;->T(Lcom/google/android/gms/measurement/internal/zzr;)Ljava/lang/Boolean;

    .line 177
    .line 178
    .line 179
    move-result-object v14

    .line 180
    move-object v15, v14

    .line 181
    if-eqz v12, :cond_6

    .line 182
    .line 183
    const-wide/16 v26, 0x1

    .line 184
    .line 185
    const-string v13, "auto"

    .line 186
    .line 187
    iget-object v14, v12, Lrp3;->b:Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v13

    .line 193
    if-eqz v13, :cond_5

    .line 194
    .line 195
    goto :goto_0

    .line 196
    :cond_5
    move-wide/from16 v13, v18

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :catchall_0
    move-exception v0

    .line 200
    move-object v2, v1

    .line 201
    goto/16 :goto_13

    .line 202
    .line 203
    :cond_6
    const-wide/16 v26, 0x1

    .line 204
    .line 205
    :goto_0
    if-eqz v15, :cond_9

    .line 206
    .line 207
    new-instance v17, Lcom/google/android/gms/measurement/internal/zzpk;

    .line 208
    .line 209
    const-string v21, "_npa"

    .line 210
    .line 211
    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    const/4 v13, 0x1

    .line 216
    if-eq v13, v7, :cond_7

    .line 217
    .line 218
    const-wide/16 v15, 0x0

    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_7
    move-wide/from16 v15, v26

    .line 222
    .line 223
    :goto_1
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 224
    .line 225
    .line 226
    move-result-object v20

    .line 227
    const-string v22, "auto"

    .line 228
    .line 229
    invoke-direct/range {v17 .. v22}, Lcom/google/android/gms/measurement/internal/zzpk;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    move-object/from16 v7, v17

    .line 233
    .line 234
    move-wide/from16 v13, v18

    .line 235
    .line 236
    if-eqz v12, :cond_8

    .line 237
    .line 238
    iget-object v12, v12, Lrp3;->e:Ljava/lang/Object;

    .line 239
    .line 240
    iget-object v15, v7, Lcom/google/android/gms/measurement/internal/zzpk;->d:Ljava/lang/Long;

    .line 241
    .line 242
    invoke-virtual {v12, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v12

    .line 246
    if-nez v12, :cond_a

    .line 247
    .line 248
    :cond_8
    invoke-virtual {v1, v7, v2}, Lmp3;->U(Lcom/google/android/gms/measurement/internal/zzpk;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 249
    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_9
    move-wide/from16 v13, v18

    .line 253
    .line 254
    if-eqz v12, :cond_a

    .line 255
    .line 256
    invoke-virtual {v1, v7, v2}, Lmp3;->V(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 257
    .line 258
    .line 259
    :cond_a
    :goto_2
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 260
    .line 261
    .line 262
    move-result-object v7

    .line 263
    sget-object v12, Lvg3;->c1:Lug3;

    .line 264
    .line 265
    const/4 v15, 0x0

    .line 266
    invoke-virtual {v7, v15, v12}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 267
    .line 268
    .line 269
    move-result v7

    .line 270
    if-eqz v7, :cond_b

    .line 271
    .line 272
    move v7, v11

    .line 273
    iget-wide v11, v2, Lcom/google/android/gms/measurement/internal/zzr;->o0:J

    .line 274
    .line 275
    invoke-virtual {v1, v2, v11, v12}, Lmp3;->Z(Lcom/google/android/gms/measurement/internal/zzr;J)V

    .line 276
    .line 277
    .line 278
    goto :goto_3

    .line 279
    :cond_b
    move v7, v11

    .line 280
    invoke-virtual {v1, v2, v13, v14}, Lmp3;->Z(Lcom/google/android/gms/measurement/internal/zzr;J)V

    .line 281
    .line 282
    .line 283
    :goto_3
    invoke-virtual/range {p0 .. p1}, Lmp3;->a0(Lcom/google/android/gms/measurement/internal/zzr;)Ldi3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 284
    .line 285
    .line 286
    iget-object v11, v1, Lmp3;->c:Lae3;

    .line 287
    .line 288
    const-string v12, "events"

    .line 289
    .line 290
    if-nez v7, :cond_c

    .line 291
    .line 292
    :try_start_1
    invoke-static {v11}, Lmp3;->S(Lwo3;)V

    .line 293
    .line 294
    .line 295
    const-string v7, "_f"

    .line 296
    .line 297
    invoke-virtual {v11, v12, v10, v7}, Lae3;->Z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lpe3;

    .line 298
    .line 299
    .line 300
    move-result-object v7

    .line 301
    const/4 v11, 0x0

    .line 302
    goto :goto_4

    .line 303
    :cond_c
    invoke-static {v11}, Lmp3;->S(Lwo3;)V

    .line 304
    .line 305
    .line 306
    const-string v7, "_v"

    .line 307
    .line 308
    invoke-virtual {v11, v12, v10, v7}, Lae3;->Z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lpe3;

    .line 309
    .line 310
    .line 311
    move-result-object v7

    .line 312
    const/4 v11, 0x1

    .line 313
    :goto_4
    if-nez v7, :cond_21

    .line 314
    .line 315
    const-wide/32 v16, 0x36ee80

    .line 316
    .line 317
    .line 318
    div-long v18, v13, v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 319
    .line 320
    add-long v18, v18, v26

    .line 321
    .line 322
    mul-long v18, v18, v16

    .line 323
    .line 324
    const-string v7, "_dac"

    .line 325
    .line 326
    const-string v12, "_et"

    .line 327
    .line 328
    const-string v15, "_r"

    .line 329
    .line 330
    move/from16 v28, v9

    .line 331
    .line 332
    const-string v9, "_c"

    .line 333
    .line 334
    if-nez v11, :cond_1f

    .line 335
    .line 336
    :try_start_2
    new-instance v17, Lcom/google/android/gms/measurement/internal/zzpk;

    .line 337
    .line 338
    const-string v21, "_fot"

    .line 339
    .line 340
    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 341
    .line 342
    .line 343
    move-result-object v20

    .line 344
    const-string v22, "auto"

    .line 345
    .line 346
    move-wide/from16 v18, v13

    .line 347
    .line 348
    invoke-direct/range {v17 .. v22}, Lcom/google/android/gms/measurement/internal/zzpk;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    move-object/from16 v11, v17

    .line 352
    .line 353
    invoke-virtual {v1, v11, v2}, Lmp3;->U(Lcom/google/android/gms/measurement/internal/zzpk;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v1}, Lmp3;->b()Lbj3;

    .line 357
    .line 358
    .line 359
    move-result-object v11

    .line 360
    invoke-virtual {v11}, Lbj3;->y()V

    .line 361
    .line 362
    .line 363
    iget-object v11, v1, Lmp3;->V:Loi3;

    .line 364
    .line 365
    invoke-static {v11}, Lkb1;->n(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 366
    .line 367
    .line 368
    iget-object v13, v11, Loi3;->b:Lij3;

    .line 369
    .line 370
    if-eqz v10, :cond_d

    .line 371
    .line 372
    :try_start_3
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    .line 373
    .line 374
    .line 375
    move-result v14

    .line 376
    if-eqz v14, :cond_e

    .line 377
    .line 378
    :cond_d
    move-object/from16 v29, v3

    .line 379
    .line 380
    move-object/from16 v30, v10

    .line 381
    .line 382
    goto/16 :goto_7

    .line 383
    .line 384
    :cond_e
    iget-object v14, v13, Lij3;->i:Lbj3;

    .line 385
    .line 386
    move-object/from16 v17, v14

    .line 387
    .line 388
    iget-object v14, v13, Lij3;->a:Landroid/content/Context;

    .line 389
    .line 390
    iget-object v2, v13, Lij3;->f:Luh3;

    .line 391
    .line 392
    invoke-static/range {v17 .. v17}, Lij3;->l(Lhk3;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v17 .. v17}, Lbj3;->y()V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v11}, Loi3;->a()Z

    .line 399
    .line 400
    .line 401
    move-result v17
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 402
    if-nez v17, :cond_f

    .line 403
    .line 404
    :try_start_4
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 405
    .line 406
    .line 407
    iget-object v0, v2, Luh3;->W:Lsh3;

    .line 408
    .line 409
    const-string v2, "Install Referrer Reporter is not available"

    .line 410
    .line 411
    invoke-virtual {v0, v2}, Lsh3;->a(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 412
    .line 413
    .line 414
    move-object/from16 v29, v3

    .line 415
    .line 416
    move-object/from16 v30, v10

    .line 417
    .line 418
    goto/16 :goto_8

    .line 419
    .line 420
    :cond_f
    move-object/from16 v29, v3

    .line 421
    .line 422
    :try_start_5
    new-instance v3, Lmi3;

    .line 423
    .line 424
    invoke-direct {v3, v11, v10}, Lmi3;-><init>(Loi3;Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    move-object/from16 v17, v11

    .line 428
    .line 429
    iget-object v11, v13, Lij3;->i:Lbj3;

    .line 430
    .line 431
    invoke-static {v11}, Lij3;->l(Lhk3;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v11}, Lbj3;->y()V

    .line 435
    .line 436
    .line 437
    new-instance v11, Landroid/content/Intent;

    .line 438
    .line 439
    move-object/from16 v30, v10

    .line 440
    .line 441
    const-string v10, "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"

    .line 442
    .line 443
    invoke-direct {v11, v10}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    new-instance v10, Landroid/content/ComponentName;

    .line 447
    .line 448
    const-string v1, "com.google.android.finsky.externalreferrer.GetInstallReferrerService"

    .line 449
    .line 450
    invoke-direct {v10, v0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v11, v10}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v14}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    if-nez v1, :cond_10

    .line 461
    .line 462
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 463
    .line 464
    .line 465
    iget-object v0, v2, Luh3;->U:Lsh3;

    .line 466
    .line 467
    const-string v1, "Failed to obtain Package Manager to verify binding conditions for Install Referrer"

    .line 468
    .line 469
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    goto/16 :goto_8

    .line 473
    .line 474
    :catchall_1
    move-exception v0

    .line 475
    move-object/from16 v2, p0

    .line 476
    .line 477
    goto/16 :goto_13

    .line 478
    .line 479
    :cond_10
    const/4 v10, 0x0

    .line 480
    invoke-virtual {v1, v11, v10}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    if-eqz v1, :cond_13

    .line 485
    .line 486
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 487
    .line 488
    .line 489
    move-result v20

    .line 490
    if-nez v20, :cond_13

    .line 491
    .line 492
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    check-cast v1, Landroid/content/pm/ResolveInfo;

    .line 497
    .line 498
    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 499
    .line 500
    if-eqz v1, :cond_14

    .line 501
    .line 502
    iget-object v10, v1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 503
    .line 504
    iget-object v1, v1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 505
    .line 506
    if-eqz v1, :cond_12

    .line 507
    .line 508
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    if-eqz v0, :cond_12

    .line 513
    .line 514
    invoke-virtual/range {v17 .. v17}, Loi3;->a()Z

    .line 515
    .line 516
    .line 517
    move-result v0

    .line 518
    if-eqz v0, :cond_12

    .line 519
    .line 520
    new-instance v0, Landroid/content/Intent;

    .line 521
    .line 522
    invoke-direct {v0, v11}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 523
    .line 524
    .line 525
    :try_start_6
    invoke-static {}, Lyy;->b()Lyy;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    const/4 v10, 0x1

    .line 530
    invoke-virtual {v1, v14, v0, v3, v10}, Lyy;->a(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 531
    .line 532
    .line 533
    move-result v0

    .line 534
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 535
    .line 536
    .line 537
    iget-object v1, v2, Luh3;->Y:Lsh3;

    .line 538
    .line 539
    const-string v2, "Install Referrer Service is"

    .line 540
    .line 541
    if-eqz v0, :cond_11

    .line 542
    .line 543
    const-string v0, "available"

    .line 544
    .line 545
    goto :goto_5

    .line 546
    :catch_0
    move-exception v0

    .line 547
    goto :goto_6

    .line 548
    :cond_11
    const-string v0, "not available"

    .line 549
    .line 550
    :goto_5
    invoke-virtual {v1, v0, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 551
    .line 552
    .line 553
    goto :goto_8

    .line 554
    :goto_6
    :try_start_7
    iget-object v1, v13, Lij3;->f:Luh3;

    .line 555
    .line 556
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 557
    .line 558
    .line 559
    iget-object v1, v1, Luh3;->f:Lsh3;

    .line 560
    .line 561
    const-string v2, "Exception occurred while binding to Install Referrer Service"

    .line 562
    .line 563
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    invoke-virtual {v1, v0, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    goto :goto_8

    .line 571
    :cond_12
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 572
    .line 573
    .line 574
    iget-object v0, v2, Luh3;->w:Lsh3;

    .line 575
    .line 576
    const-string v1, "Play Store version 8.3.73 or higher required for Install Referrer"

    .line 577
    .line 578
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    goto :goto_8

    .line 582
    :cond_13
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 583
    .line 584
    .line 585
    iget-object v0, v2, Luh3;->W:Lsh3;

    .line 586
    .line 587
    const-string v1, "Play Service for fetching Install Referrer is unavailable on device"

    .line 588
    .line 589
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    goto :goto_8

    .line 593
    :goto_7
    iget-object v0, v13, Lij3;->f:Luh3;

    .line 594
    .line 595
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 596
    .line 597
    .line 598
    iget-object v0, v0, Luh3;->U:Lsh3;

    .line 599
    .line 600
    const-string v1, "Install Referrer Reporter was called with invalid app package name"

    .line 601
    .line 602
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 603
    .line 604
    .line 605
    :cond_14
    :goto_8
    invoke-virtual/range {p0 .. p0}, Lmp3;->b()Lbj3;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    invoke-virtual {v0}, Lbj3;->y()V

    .line 610
    .line 611
    .line 612
    invoke-virtual/range {p0 .. p0}, Lmp3;->k0()V

    .line 613
    .line 614
    .line 615
    new-instance v1, Landroid/os/Bundle;

    .line 616
    .line 617
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 618
    .line 619
    .line 620
    move-wide/from16 v2, v26

    .line 621
    .line 622
    invoke-virtual {v1, v9, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v1, v15, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 626
    .line 627
    .line 628
    const-wide/16 v9, 0x0

    .line 629
    .line 630
    invoke-virtual {v1, v8, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v1, v6, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v1, v5, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v1, v4, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 640
    .line 641
    .line 642
    const/4 v9, 0x0

    .line 643
    invoke-virtual {v1, v12, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 644
    .line 645
    .line 646
    if-eqz v28, :cond_15

    .line 647
    .line 648
    invoke-virtual {v1, v7, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 649
    .line 650
    .line 651
    :cond_15
    invoke-static/range {v30 .. v30}, Lkb1;->n(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 652
    .line 653
    .line 654
    move-object/from16 v2, p0

    .line 655
    .line 656
    :try_start_8
    iget-object v0, v2, Lmp3;->c:Lae3;

    .line 657
    .line 658
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 659
    .line 660
    .line 661
    invoke-static/range {v30 .. v30}, Lkb1;->k(Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v0}, Lsq3;->y()V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v0}, Lwo3;->A()V

    .line 668
    .line 669
    .line 670
    move-object/from16 v3, v30

    .line 671
    .line 672
    invoke-virtual {v0, v3}, Lae3;->N(Ljava/lang/String;)J

    .line 673
    .line 674
    .line 675
    move-result-wide v23

    .line 676
    move-object/from16 v7, v29

    .line 677
    .line 678
    iget-object v0, v7, Lij3;->a:Landroid/content/Context;

    .line 679
    .line 680
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    if-nez v0, :cond_17

    .line 685
    .line 686
    invoke-virtual {v2}, Lmp3;->a()Luh3;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 691
    .line 692
    const-string v4, "PackageManager is null, first open report might be inaccurate. appId"

    .line 693
    .line 694
    invoke-static {v3}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 695
    .line 696
    .line 697
    move-result-object v3

    .line 698
    invoke-virtual {v0, v3, v4}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 699
    .line 700
    .line 701
    move-object/from16 v8, p1

    .line 702
    .line 703
    :cond_16
    :goto_9
    move-wide/from16 v3, v23

    .line 704
    .line 705
    const-wide/16 v15, 0x0

    .line 706
    .line 707
    goto/16 :goto_11

    .line 708
    .line 709
    :catchall_2
    move-exception v0

    .line 710
    goto/16 :goto_13

    .line 711
    .line 712
    :cond_17
    :try_start_9
    iget-object v0, v7, Lij3;->a:Landroid/content/Context;

    .line 713
    .line 714
    invoke-static {v0}, Lg93;->a(Landroid/content/Context;)Lv30;

    .line 715
    .line 716
    .line 717
    move-result-object v0

    .line 718
    const/4 v10, 0x0

    .line 719
    invoke-virtual {v0, v10, v3}, Lv30;->c(ILjava/lang/String;)Landroid/content/pm/PackageInfo;

    .line 720
    .line 721
    .line 722
    move-result-object v0
    :try_end_9
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 723
    goto :goto_a

    .line 724
    :catch_1
    move-exception v0

    .line 725
    :try_start_a
    invoke-virtual {v2}, Lmp3;->a()Luh3;

    .line 726
    .line 727
    .line 728
    move-result-object v10

    .line 729
    iget-object v10, v10, Luh3;->f:Lsh3;

    .line 730
    .line 731
    const-string v11, "Package info is null, first open report might be inaccurate. appId"

    .line 732
    .line 733
    invoke-static {v3}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 734
    .line 735
    .line 736
    move-result-object v12

    .line 737
    invoke-virtual {v10, v12, v11, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 738
    .line 739
    .line 740
    move-object v0, v9

    .line 741
    :goto_a
    if-eqz v0, :cond_1c

    .line 742
    .line 743
    iget-wide v10, v0, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    .line 744
    .line 745
    const-wide/16 v15, 0x0

    .line 746
    .line 747
    cmp-long v12, v10, v15

    .line 748
    .line 749
    if-eqz v12, :cond_1c

    .line 750
    .line 751
    iget-wide v12, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 752
    .line 753
    cmp-long v0, v10, v12

    .line 754
    .line 755
    if-eqz v0, :cond_1a

    .line 756
    .line 757
    invoke-virtual {v2}, Lmp3;->d0()Lpd3;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    sget-object v10, Lvg3;->I0:Lug3;

    .line 762
    .line 763
    invoke-virtual {v0, v9, v10}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 764
    .line 765
    .line 766
    move-result v0

    .line 767
    if-eqz v0, :cond_19

    .line 768
    .line 769
    const-wide/16 v15, 0x0

    .line 770
    .line 771
    cmp-long v0, v23, v15

    .line 772
    .line 773
    if-nez v0, :cond_18

    .line 774
    .line 775
    const-wide/16 v10, 0x1

    .line 776
    .line 777
    invoke-virtual {v1, v8, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 778
    .line 779
    .line 780
    const/4 v0, 0x0

    .line 781
    const-wide/16 v23, 0x0

    .line 782
    .line 783
    goto :goto_c

    .line 784
    :cond_18
    :goto_b
    const/4 v0, 0x0

    .line 785
    goto :goto_c

    .line 786
    :cond_19
    const-wide/16 v10, 0x1

    .line 787
    .line 788
    invoke-virtual {v1, v8, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 789
    .line 790
    .line 791
    goto :goto_b

    .line 792
    :cond_1a
    const/4 v0, 0x1

    .line 793
    :goto_c
    new-instance v17, Lcom/google/android/gms/measurement/internal/zzpk;

    .line 794
    .line 795
    const-string v21, "_fi"

    .line 796
    .line 797
    const/4 v10, 0x1

    .line 798
    if-eq v10, v0, :cond_1b

    .line 799
    .line 800
    const-wide/16 v10, 0x0

    .line 801
    .line 802
    goto :goto_d

    .line 803
    :cond_1b
    const-wide/16 v10, 0x1

    .line 804
    .line 805
    :goto_d
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 806
    .line 807
    .line 808
    move-result-object v20

    .line 809
    const-string v22, "auto"

    .line 810
    .line 811
    invoke-direct/range {v17 .. v22}, Lcom/google/android/gms/measurement/internal/zzpk;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 812
    .line 813
    .line 814
    move-object/from16 v0, v17

    .line 815
    .line 816
    move-object/from16 v8, p1

    .line 817
    .line 818
    invoke-virtual {v2, v0, v8}, Lmp3;->U(Lcom/google/android/gms/measurement/internal/zzpk;Lcom/google/android/gms/measurement/internal/zzr;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 819
    .line 820
    .line 821
    goto :goto_e

    .line 822
    :cond_1c
    move-object/from16 v8, p1

    .line 823
    .line 824
    :goto_e
    :try_start_b
    iget-object v0, v7, Lij3;->a:Landroid/content/Context;

    .line 825
    .line 826
    invoke-static {v0}, Lg93;->a(Landroid/content/Context;)Lv30;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    const/4 v10, 0x0

    .line 831
    invoke-virtual {v0, v10, v3}, Lv30;->b(ILjava/lang/String;)Landroid/content/pm/ApplicationInfo;

    .line 832
    .line 833
    .line 834
    move-result-object v0
    :try_end_b
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 835
    goto :goto_f

    .line 836
    :catch_2
    move-exception v0

    .line 837
    :try_start_c
    invoke-virtual {v2}, Lmp3;->a()Luh3;

    .line 838
    .line 839
    .line 840
    move-result-object v7

    .line 841
    iget-object v7, v7, Luh3;->f:Lsh3;

    .line 842
    .line 843
    const-string v10, "Application info is null, first open report might be inaccurate. appId"

    .line 844
    .line 845
    invoke-static {v3}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 846
    .line 847
    .line 848
    move-result-object v3

    .line 849
    invoke-virtual {v7, v3, v10, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 850
    .line 851
    .line 852
    move-object v0, v9

    .line 853
    :goto_f
    if-eqz v0, :cond_16

    .line 854
    .line 855
    iget v3, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 856
    .line 857
    const/16 v25, 0x1

    .line 858
    .line 859
    and-int/lit8 v3, v3, 0x1

    .line 860
    .line 861
    if-eqz v3, :cond_1d

    .line 862
    .line 863
    const-wide/16 v10, 0x1

    .line 864
    .line 865
    invoke-virtual {v1, v5, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 866
    .line 867
    .line 868
    goto :goto_10

    .line 869
    :cond_1d
    const-wide/16 v10, 0x1

    .line 870
    .line 871
    :goto_10
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 872
    .line 873
    and-int/lit16 v0, v0, 0x80

    .line 874
    .line 875
    if-eqz v0, :cond_16

    .line 876
    .line 877
    invoke-virtual {v1, v4, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 878
    .line 879
    .line 880
    goto/16 :goto_9

    .line 881
    .line 882
    :goto_11
    cmp-long v0, v3, v15

    .line 883
    .line 884
    if-ltz v0, :cond_1e

    .line 885
    .line 886
    invoke-virtual {v1, v6, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 887
    .line 888
    .line 889
    :cond_1e
    new-instance v17, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 890
    .line 891
    move-wide/from16 v21, v18

    .line 892
    .line 893
    const-string v18, "_f"

    .line 894
    .line 895
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzbe;

    .line 896
    .line 897
    invoke-direct {v0, v1}, Lcom/google/android/gms/measurement/internal/zzbe;-><init>(Landroid/os/Bundle;)V

    .line 898
    .line 899
    .line 900
    const-string v20, "auto"

    .line 901
    .line 902
    move-object/from16 v19, v0

    .line 903
    .line 904
    invoke-direct/range {v17 .. v22}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzbe;Ljava/lang/String;J)V

    .line 905
    .line 906
    .line 907
    move-object/from16 v0, v17

    .line 908
    .line 909
    invoke-virtual {v2, v0, v8}, Lmp3;->i(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 910
    .line 911
    .line 912
    goto/16 :goto_12

    .line 913
    .line 914
    :cond_1f
    move-object v8, v2

    .line 915
    move-wide/from16 v21, v13

    .line 916
    .line 917
    move-object v2, v1

    .line 918
    new-instance v17, Lcom/google/android/gms/measurement/internal/zzpk;

    .line 919
    .line 920
    const-string v21, "_fvt"

    .line 921
    .line 922
    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 923
    .line 924
    .line 925
    move-result-object v20

    .line 926
    const-string v22, "auto"

    .line 927
    .line 928
    move-wide/from16 v18, v13

    .line 929
    .line 930
    invoke-direct/range {v17 .. v22}, Lcom/google/android/gms/measurement/internal/zzpk;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 931
    .line 932
    .line 933
    move-object/from16 v0, v17

    .line 934
    .line 935
    invoke-virtual {v2, v0, v8}, Lmp3;->U(Lcom/google/android/gms/measurement/internal/zzpk;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 936
    .line 937
    .line 938
    invoke-virtual {v2}, Lmp3;->b()Lbj3;

    .line 939
    .line 940
    .line 941
    move-result-object v0

    .line 942
    invoke-virtual {v0}, Lbj3;->y()V

    .line 943
    .line 944
    .line 945
    invoke-virtual {v2}, Lmp3;->k0()V

    .line 946
    .line 947
    .line 948
    new-instance v0, Landroid/os/Bundle;

    .line 949
    .line 950
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 951
    .line 952
    .line 953
    const-wide/16 v10, 0x1

    .line 954
    .line 955
    invoke-virtual {v0, v9, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 956
    .line 957
    .line 958
    invoke-virtual {v0, v15, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 959
    .line 960
    .line 961
    invoke-virtual {v0, v12, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 962
    .line 963
    .line 964
    if-eqz v28, :cond_20

    .line 965
    .line 966
    invoke-virtual {v0, v7, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 967
    .line 968
    .line 969
    :cond_20
    new-instance v17, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 970
    .line 971
    move-wide/from16 v21, v18

    .line 972
    .line 973
    const-string v18, "_v"

    .line 974
    .line 975
    new-instance v1, Lcom/google/android/gms/measurement/internal/zzbe;

    .line 976
    .line 977
    invoke-direct {v1, v0}, Lcom/google/android/gms/measurement/internal/zzbe;-><init>(Landroid/os/Bundle;)V

    .line 978
    .line 979
    .line 980
    const-string v20, "auto"

    .line 981
    .line 982
    move-object/from16 v19, v1

    .line 983
    .line 984
    invoke-direct/range {v17 .. v22}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzbe;Ljava/lang/String;J)V

    .line 985
    .line 986
    .line 987
    move-object/from16 v0, v17

    .line 988
    .line 989
    invoke-virtual {v2, v0, v8}, Lmp3;->i(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 990
    .line 991
    .line 992
    goto :goto_12

    .line 993
    :cond_21
    move-object v8, v2

    .line 994
    move-wide/from16 v18, v13

    .line 995
    .line 996
    move-object v2, v1

    .line 997
    iget-boolean v0, v8, Lcom/google/android/gms/measurement/internal/zzr;->w:Z

    .line 998
    .line 999
    if-eqz v0, :cond_22

    .line 1000
    .line 1001
    new-instance v0, Landroid/os/Bundle;

    .line 1002
    .line 1003
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1004
    .line 1005
    .line 1006
    new-instance v17, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 1007
    .line 1008
    move-wide/from16 v21, v18

    .line 1009
    .line 1010
    const-string v18, "_cd"

    .line 1011
    .line 1012
    new-instance v1, Lcom/google/android/gms/measurement/internal/zzbe;

    .line 1013
    .line 1014
    invoke-direct {v1, v0}, Lcom/google/android/gms/measurement/internal/zzbe;-><init>(Landroid/os/Bundle;)V

    .line 1015
    .line 1016
    .line 1017
    const-string v20, "auto"

    .line 1018
    .line 1019
    move-object/from16 v19, v1

    .line 1020
    .line 1021
    invoke-direct/range {v17 .. v22}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzbe;Ljava/lang/String;J)V

    .line 1022
    .line 1023
    .line 1024
    move-object/from16 v0, v17

    .line 1025
    .line 1026
    invoke-virtual {v2, v0, v8}, Lmp3;->i(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 1027
    .line 1028
    .line 1029
    :cond_22
    :goto_12
    iget-object v0, v2, Lmp3;->c:Lae3;

    .line 1030
    .line 1031
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 1032
    .line 1033
    .line 1034
    invoke-virtual {v0}, Lae3;->o0()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 1035
    .line 1036
    .line 1037
    iget-object v0, v2, Lmp3;->c:Lae3;

    .line 1038
    .line 1039
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v0}, Lae3;->p0()V

    .line 1043
    .line 1044
    .line 1045
    return-void

    .line 1046
    :goto_13
    iget-object v1, v2, Lmp3;->c:Lae3;

    .line 1047
    .line 1048
    invoke-static {v1}, Lmp3;->S(Lwo3;)V

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual {v1}, Lae3;->p0()V

    .line 1052
    .line 1053
    .line 1054
    throw v0
.end method

.method public final X(Lcom/google/android/gms/measurement/internal/zzah;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 11

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lkb1;->k(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->b:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 12
    .line 13
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v0}, Lkb1;->k(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lbj3;->y()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lmp3;->k0()V

    .line 31
    .line 32
    .line 33
    invoke-static {p2}, Lmp3;->Q(Lcom/google/android/gms/measurement/internal/zzr;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/measurement/internal/zzr;->v:Z

    .line 41
    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0, p2}, Lmp3;->a0(Lcom/google/android/gms/measurement/internal/zzr;)Ldi3;

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzah;

    .line 49
    .line 50
    invoke-direct {v0, p1}, Lcom/google/android/gms/measurement/internal/zzah;-><init>(Lcom/google/android/gms/measurement/internal/zzah;)V

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    iput-boolean p1, v0, Lcom/google/android/gms/measurement/internal/zzah;->e:Z

    .line 55
    .line 56
    iget-object v1, p0, Lmp3;->c:Lae3;

    .line 57
    .line 58
    invoke-static {v1}, Lmp3;->S(Lwo3;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Lae3;->n0()V

    .line 62
    .line 63
    .line 64
    :try_start_0
    iget-object v1, p0, Lmp3;->c:Lae3;

    .line 65
    .line 66
    invoke-static {v1}, Lmp3;->S(Lwo3;)V

    .line 67
    .line 68
    .line 69
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzah;->a:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v2}, Lkb1;->n(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 75
    .line 76
    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v1, v2, v3}, Lae3;->z0(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzah;

    .line 79
    .line 80
    .line 81
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    iget-object v2, p0, Lmp3;->W:Lij3;

    .line 83
    .line 84
    if-eqz v1, :cond_2

    .line 85
    .line 86
    :try_start_1
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzah;->b:Ljava/lang/String;

    .line 87
    .line 88
    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/zzah;->b:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-nez v3, :cond_2

    .line 95
    .line 96
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    iget-object v3, v3, Luh3;->w:Lsh3;

    .line 101
    .line 102
    const-string v4, "Updating a conditional user property with different origin. name, origin, origin (from DB)"

    .line 103
    .line 104
    iget-object v5, v2, Lij3;->U:Lmh3;

    .line 105
    .line 106
    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 107
    .line 108
    iget-object v6, v6, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v5, v6}, Lmh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/zzah;->b:Ljava/lang/String;

    .line 115
    .line 116
    iget-object v7, v1, Lcom/google/android/gms/measurement/internal/zzah;->b:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v3, v4, v5, v6, v7}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :catchall_0
    move-exception v0

    .line 123
    move-object p1, v0

    .line 124
    goto/16 :goto_4

    .line 125
    .line 126
    :cond_2
    :goto_0
    const/4 v3, 0x1

    .line 127
    if-eqz v1, :cond_3

    .line 128
    .line 129
    iget-boolean v4, v1, Lcom/google/android/gms/measurement/internal/zzah;->e:Z

    .line 130
    .line 131
    if-eqz v4, :cond_3

    .line 132
    .line 133
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzah;->b:Ljava/lang/String;

    .line 134
    .line 135
    iput-object v4, v0, Lcom/google/android/gms/measurement/internal/zzah;->b:Ljava/lang/String;

    .line 136
    .line 137
    iget-wide v4, v1, Lcom/google/android/gms/measurement/internal/zzah;->d:J

    .line 138
    .line 139
    iput-wide v4, v0, Lcom/google/android/gms/measurement/internal/zzah;->d:J

    .line 140
    .line 141
    iget-wide v4, v1, Lcom/google/android/gms/measurement/internal/zzah;->v:J

    .line 142
    .line 143
    iput-wide v4, v0, Lcom/google/android/gms/measurement/internal/zzah;->v:J

    .line 144
    .line 145
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    .line 146
    .line 147
    iput-object v4, v0, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    .line 148
    .line 149
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzah;->w:Lcom/google/android/gms/measurement/internal/zzbg;

    .line 150
    .line 151
    iput-object v4, v0, Lcom/google/android/gms/measurement/internal/zzah;->w:Lcom/google/android/gms/measurement/internal/zzbg;

    .line 152
    .line 153
    iput-boolean v3, v0, Lcom/google/android/gms/measurement/internal/zzah;->e:Z

    .line 154
    .line 155
    new-instance v5, Lcom/google/android/gms/measurement/internal/zzpk;

    .line 156
    .line 157
    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 158
    .line 159
    iget-object v9, v3, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 160
    .line 161
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 162
    .line 163
    iget-wide v6, v4, Lcom/google/android/gms/measurement/internal/zzpk;->c:J

    .line 164
    .line 165
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzpk;->D1()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 170
    .line 171
    iget-object v10, v1, Lcom/google/android/gms/measurement/internal/zzpk;->f:Ljava/lang/String;

    .line 172
    .line 173
    invoke-direct/range {v5 .. v10}, Lcom/google/android/gms/measurement/internal/zzpk;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    iput-object v5, v0, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_3
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    .line 180
    .line 181
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-eqz v1, :cond_4

    .line 186
    .line 187
    new-instance v4, Lcom/google/android/gms/measurement/internal/zzpk;

    .line 188
    .line 189
    iget-object p1, v0, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 190
    .line 191
    iget-object v8, p1, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 192
    .line 193
    iget-wide v5, v0, Lcom/google/android/gms/measurement/internal/zzah;->d:J

    .line 194
    .line 195
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzpk;->D1()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    iget-object p1, v0, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 200
    .line 201
    iget-object v9, p1, Lcom/google/android/gms/measurement/internal/zzpk;->f:Ljava/lang/String;

    .line 202
    .line 203
    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/measurement/internal/zzpk;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    iput-object v4, v0, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 207
    .line 208
    iput-boolean v3, v0, Lcom/google/android/gms/measurement/internal/zzah;->e:Z

    .line 209
    .line 210
    move p1, v3

    .line 211
    :cond_4
    :goto_1
    iget-boolean v1, v0, Lcom/google/android/gms/measurement/internal/zzah;->e:Z

    .line 212
    .line 213
    if-eqz v1, :cond_6

    .line 214
    .line 215
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 216
    .line 217
    new-instance v3, Lrp3;

    .line 218
    .line 219
    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/zzah;->a:Ljava/lang/String;

    .line 220
    .line 221
    invoke-static {v4}, Lkb1;->n(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/zzah;->b:Ljava/lang/String;

    .line 225
    .line 226
    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 227
    .line 228
    iget-wide v7, v1, Lcom/google/android/gms/measurement/internal/zzpk;->c:J

    .line 229
    .line 230
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzpk;->D1()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v9

    .line 234
    invoke-static {v9}, Lkb1;->n(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    invoke-direct/range {v3 .. v9}, Lrp3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    iget-object v1, v3, Lrp3;->e:Ljava/lang/Object;

    .line 241
    .line 242
    iget-object v4, v3, Lrp3;->c:Ljava/lang/String;

    .line 243
    .line 244
    iget-object v5, p0, Lmp3;->c:Lae3;

    .line 245
    .line 246
    invoke-static {v5}, Lmp3;->S(Lwo3;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v5, v3}, Lae3;->u0(Lrp3;)Z

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    if-eqz v3, :cond_5

    .line 254
    .line 255
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    iget-object v3, v3, Luh3;->X:Lsh3;

    .line 260
    .line 261
    const-string v5, "User property updated immediately"

    .line 262
    .line 263
    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/zzah;->a:Ljava/lang/String;

    .line 264
    .line 265
    iget-object v7, v2, Lij3;->U:Lmh3;

    .line 266
    .line 267
    invoke-virtual {v7, v4}, Lmh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    invoke-virtual {v3, v5, v6, v4, v1}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    goto :goto_2

    .line 275
    :cond_5
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    iget-object v3, v3, Luh3;->f:Lsh3;

    .line 280
    .line 281
    const-string v5, "(2)Too many active user properties, ignoring"

    .line 282
    .line 283
    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/zzah;->a:Ljava/lang/String;

    .line 284
    .line 285
    invoke-static {v6}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 286
    .line 287
    .line 288
    move-result-object v6

    .line 289
    iget-object v7, v2, Lij3;->U:Lmh3;

    .line 290
    .line 291
    invoke-virtual {v7, v4}, Lmh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    invoke-virtual {v3, v5, v6, v4, v1}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    :goto_2
    if-eqz p1, :cond_6

    .line 299
    .line 300
    iget-object p1, v0, Lcom/google/android/gms/measurement/internal/zzah;->w:Lcom/google/android/gms/measurement/internal/zzbg;

    .line 301
    .line 302
    if-eqz p1, :cond_6

    .line 303
    .line 304
    new-instance v1, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 305
    .line 306
    iget-wide v3, v0, Lcom/google/android/gms/measurement/internal/zzah;->d:J

    .line 307
    .line 308
    invoke-direct {v1, p1, v3, v4}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Lcom/google/android/gms/measurement/internal/zzbg;J)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {p0, v1, p2}, Lmp3;->l(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 312
    .line 313
    .line 314
    :cond_6
    iget-object p1, p0, Lmp3;->c:Lae3;

    .line 315
    .line 316
    invoke-static {p1}, Lmp3;->S(Lwo3;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {p1, v0}, Lae3;->y0(Lcom/google/android/gms/measurement/internal/zzah;)Z

    .line 320
    .line 321
    .line 322
    move-result p1

    .line 323
    if-eqz p1, :cond_7

    .line 324
    .line 325
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    iget-object p1, p1, Luh3;->X:Lsh3;

    .line 330
    .line 331
    const-string p2, "Conditional property added"

    .line 332
    .line 333
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzah;->a:Ljava/lang/String;

    .line 334
    .line 335
    iget-object v2, v2, Lij3;->U:Lmh3;

    .line 336
    .line 337
    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 338
    .line 339
    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 340
    .line 341
    invoke-virtual {v2, v3}, Lmh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 346
    .line 347
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzpk;->D1()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-virtual {p1, p2, v1, v2, v0}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    goto :goto_3

    .line 355
    :cond_7
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    iget-object p1, p1, Luh3;->f:Lsh3;

    .line 360
    .line 361
    const-string p2, "Too many conditional properties, ignoring"

    .line 362
    .line 363
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzah;->a:Ljava/lang/String;

    .line 364
    .line 365
    invoke-static {v1}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    iget-object v2, v2, Lij3;->U:Lmh3;

    .line 370
    .line 371
    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 372
    .line 373
    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 374
    .line 375
    invoke-virtual {v2, v3}, Lmh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 380
    .line 381
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzpk;->D1()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    invoke-virtual {p1, p2, v1, v2, v0}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    :goto_3
    iget-object p1, p0, Lmp3;->c:Lae3;

    .line 389
    .line 390
    invoke-static {p1}, Lmp3;->S(Lwo3;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {p1}, Lae3;->o0()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 394
    .line 395
    .line 396
    iget-object p0, p0, Lmp3;->c:Lae3;

    .line 397
    .line 398
    invoke-static {p0}, Lmp3;->S(Lwo3;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {p0}, Lae3;->p0()V

    .line 402
    .line 403
    .line 404
    return-void

    .line 405
    :goto_4
    iget-object p0, p0, Lmp3;->c:Lae3;

    .line 406
    .line 407
    invoke-static {p0}, Lmp3;->S(Lwo3;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {p0}, Lae3;->p0()V

    .line 411
    .line 412
    .line 413
    throw p1
.end method

.method public final Y(Lcom/google/android/gms/measurement/internal/zzah;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 9

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lkb1;->k(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 7
    .line 8
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0}, Lkb1;->k(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lbj3;->y()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lmp3;->k0()V

    .line 26
    .line 27
    .line 28
    invoke-static {p2}, Lmp3;->Q(Lcom/google/android/gms/measurement/internal/zzr;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/measurement/internal/zzr;->v:Z

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0, p2}, Lmp3;->a0(Lcom/google/android/gms/measurement/internal/zzr;)Ldi3;

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    iget-object v0, p0, Lmp3;->c:Lae3;

    .line 44
    .line 45
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Lae3;->n0()V

    .line 49
    .line 50
    .line 51
    :try_start_0
    invoke-virtual {p0, p2}, Lmp3;->a0(Lcom/google/android/gms/measurement/internal/zzr;)Ldi3;

    .line 52
    .line 53
    .line 54
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->a:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lmp3;->c:Lae3;

    .line 60
    .line 61
    invoke-static {v1}, Lmp3;->S(Lwo3;)V

    .line 62
    .line 63
    .line 64
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 65
    .line 66
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v1, v0, v2}, Lae3;->z0(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzah;

    .line 69
    .line 70
    .line 71
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    iget-object v2, p0, Lmp3;->W:Lij3;

    .line 73
    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    :try_start_1
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    iget-object v3, v3, Luh3;->X:Lsh3;

    .line 81
    .line 82
    const-string v4, "Removing conditional user property"

    .line 83
    .line 84
    iget-object v5, p1, Lcom/google/android/gms/measurement/internal/zzah;->a:Ljava/lang/String;

    .line 85
    .line 86
    iget-object v2, v2, Lij3;->U:Lmh3;

    .line 87
    .line 88
    iget-object v6, p1, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 89
    .line 90
    iget-object v6, v6, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v2, v6}, Lmh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v3, v5, v4, v2}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iget-object v2, p0, Lmp3;->c:Lae3;

    .line 100
    .line 101
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 102
    .line 103
    .line 104
    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 105
    .line 106
    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v2, v0, v3}, Lae3;->A0(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iget-boolean v2, v1, Lcom/google/android/gms/measurement/internal/zzah;->e:Z

    .line 112
    .line 113
    if-eqz v2, :cond_2

    .line 114
    .line 115
    iget-object v2, p0, Lmp3;->c:Lae3;

    .line 116
    .line 117
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 118
    .line 119
    .line 120
    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 121
    .line 122
    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {v2, v0, v3}, Lae3;->t0(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :catchall_0
    move-exception v0

    .line 129
    move-object p1, v0

    .line 130
    goto :goto_4

    .line 131
    :cond_2
    :goto_0
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzah;->V:Lcom/google/android/gms/measurement/internal/zzbg;

    .line 132
    .line 133
    if-eqz p1, :cond_5

    .line 134
    .line 135
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzbg;->b:Lcom/google/android/gms/measurement/internal/zzbe;

    .line 136
    .line 137
    if-eqz v0, :cond_3

    .line 138
    .line 139
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbe;->G1()Landroid/os/Bundle;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    :goto_1
    move-object v4, v0

    .line 144
    goto :goto_2

    .line 145
    :cond_3
    const/4 v0, 0x0

    .line 146
    goto :goto_1

    .line 147
    :goto_2
    invoke-virtual {p0}, Lmp3;->j0()Lup3;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/zzbg;->a:Ljava/lang/String;

    .line 152
    .line 153
    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/zzah;->b:Ljava/lang/String;

    .line 154
    .line 155
    iget-wide v6, p1, Lcom/google/android/gms/measurement/internal/zzbg;->d:J

    .line 156
    .line 157
    const/4 v8, 0x1

    .line 158
    invoke-virtual/range {v2 .. v8}, Lup3;->b0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZ)Lcom/google/android/gms/measurement/internal/zzbg;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0, p1, p2}, Lmp3;->l(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_4
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    iget-object p2, p2, Luh3;->w:Lsh3;

    .line 174
    .line 175
    const-string v0, "Conditional user property doesn\'t exist"

    .line 176
    .line 177
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzah;->a:Ljava/lang/String;

    .line 178
    .line 179
    invoke-static {v1}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    iget-object v2, v2, Lij3;->U:Lmh3;

    .line 184
    .line 185
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 186
    .line 187
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {v2, p1}, Lmh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-virtual {p2, v1, v0, p1}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :cond_5
    :goto_3
    iget-object p1, p0, Lmp3;->c:Lae3;

    .line 197
    .line 198
    invoke-static {p1}, Lmp3;->S(Lwo3;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1}, Lae3;->o0()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 202
    .line 203
    .line 204
    iget-object p0, p0, Lmp3;->c:Lae3;

    .line 205
    .line 206
    invoke-static {p0}, Lmp3;->S(Lwo3;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0}, Lae3;->p0()V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :goto_4
    iget-object p0, p0, Lmp3;->c:Lae3;

    .line 214
    .line 215
    invoke-static {p0}, Lmp3;->S(Lwo3;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0}, Lae3;->p0()V

    .line 219
    .line 220
    .line 221
    throw p1
.end method

.method public final Z(Lcom/google/android/gms/measurement/internal/zzr;J)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v0, "app_id=?"

    .line 6
    .line 7
    iget-object v3, v1, Lmp3;->c:Lae3;

    .line 8
    .line 9
    invoke-static {v3}, Lmp3;->S(Lwo3;)V

    .line 10
    .line 11
    .line 12
    iget-object v4, v2, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v4}, Lkb1;->n(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3, v4}, Lae3;->D0(Ljava/lang/String;)Ldi3;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/4 v4, 0x0

    .line 22
    if-eqz v3, :cond_2

    .line 23
    .line 24
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 25
    .line 26
    .line 27
    iget-object v5, v2, Lcom/google/android/gms/measurement/internal/zzr;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v3}, Ldi3;->G()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    if-nez v7, :cond_2

    .line 42
    .line 43
    if-nez v8, :cond_2

    .line 44
    .line 45
    invoke-static {v5}, Lkb1;->n(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-nez v5, :cond_2

    .line 53
    .line 54
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    iget-object v5, v5, Luh3;->w:Lsh3;

    .line 59
    .line 60
    invoke-virtual {v3}, Ldi3;->D()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-static {v6}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    const-string v7, "New GMP App Id passed in. Removing cached database data. appId"

    .line 69
    .line 70
    invoke-virtual {v5, v6, v7}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iget-object v5, v1, Lmp3;->c:Lae3;

    .line 74
    .line 75
    invoke-static {v5}, Lmp3;->S(Lwo3;)V

    .line 76
    .line 77
    .line 78
    iget-object v6, v5, Lsq3;->a:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v6, Lij3;

    .line 81
    .line 82
    invoke-virtual {v3}, Ldi3;->D()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v5}, Lwo3;->A()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5}, Lsq3;->y()V

    .line 90
    .line 91
    .line 92
    invoke-static {v3}, Lkb1;->k(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :try_start_0
    invoke-virtual {v5}, Lae3;->q0()Landroid/database/sqlite/SQLiteDatabase;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    filled-new-array {v3}, [Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    const-string v8, "events"

    .line 104
    .line 105
    invoke-virtual {v5, v8, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    const-string v9, "user_attributes"

    .line 110
    .line 111
    invoke-virtual {v5, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    add-int/2addr v8, v9

    .line 116
    const-string v9, "conditional_properties"

    .line 117
    .line 118
    invoke-virtual {v5, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    add-int/2addr v8, v9

    .line 123
    const-string v9, "apps"

    .line 124
    .line 125
    invoke-virtual {v5, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    add-int/2addr v8, v9

    .line 130
    const-string v9, "raw_events"

    .line 131
    .line 132
    invoke-virtual {v5, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    add-int/2addr v8, v9

    .line 137
    const-string v9, "raw_events_metadata"

    .line 138
    .line 139
    invoke-virtual {v5, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    move-result v9

    .line 143
    add-int/2addr v8, v9

    .line 144
    const-string v9, "event_filters"

    .line 145
    .line 146
    invoke-virtual {v5, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    add-int/2addr v8, v9

    .line 151
    const-string v9, "property_filters"

    .line 152
    .line 153
    invoke-virtual {v5, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    add-int/2addr v8, v9

    .line 158
    const-string v9, "audience_filter_values"

    .line 159
    .line 160
    invoke-virtual {v5, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 161
    .line 162
    .line 163
    move-result v9

    .line 164
    add-int/2addr v8, v9

    .line 165
    const-string v9, "consent_settings"

    .line 166
    .line 167
    invoke-virtual {v5, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    add-int/2addr v8, v9

    .line 172
    const-string v9, "default_event_params"

    .line 173
    .line 174
    invoke-virtual {v5, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 175
    .line 176
    .line 177
    move-result v9

    .line 178
    add-int/2addr v8, v9

    .line 179
    const-string v9, "trigger_uris"

    .line 180
    .line 181
    invoke-virtual {v5, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    add-int/2addr v8, v9

    .line 186
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpk;->zza()Z

    .line 187
    .line 188
    .line 189
    iget-object v9, v6, Lij3;->d:Lpd3;

    .line 190
    .line 191
    sget-object v10, Lvg3;->i1:Lug3;

    .line 192
    .line 193
    invoke-virtual {v9, v4, v10}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    if-eqz v9, :cond_0

    .line 198
    .line 199
    const-string v9, "no_data_mode_events"

    .line 200
    .line 201
    invoke-virtual {v5, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    add-int/2addr v8, v0

    .line 206
    goto :goto_0

    .line 207
    :catch_0
    move-exception v0

    .line 208
    goto :goto_2

    .line 209
    :cond_0
    :goto_0
    if-lez v8, :cond_1

    .line 210
    .line 211
    iget-object v0, v6, Lij3;->f:Luh3;

    .line 212
    .line 213
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 214
    .line 215
    .line 216
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 217
    .line 218
    const-string v5, "Deleted application data. app, records"

    .line 219
    .line 220
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    invoke-virtual {v0, v3, v5, v7}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 225
    .line 226
    .line 227
    :cond_1
    :goto_1
    move-object v3, v4

    .line 228
    goto :goto_3

    .line 229
    :goto_2
    iget-object v5, v6, Lij3;->f:Luh3;

    .line 230
    .line 231
    invoke-static {v5}, Lij3;->l(Lhk3;)V

    .line 232
    .line 233
    .line 234
    iget-object v5, v5, Luh3;->f:Lsh3;

    .line 235
    .line 236
    invoke-static {v3}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    const-string v6, "Error deleting application data. appId, error"

    .line 241
    .line 242
    invoke-virtual {v5, v3, v6, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    goto :goto_1

    .line 246
    :cond_2
    :goto_3
    if-eqz v3, :cond_6

    .line 247
    .line 248
    invoke-virtual {v3}, Ldi3;->P()J

    .line 249
    .line 250
    .line 251
    move-result-wide v5

    .line 252
    const-wide/32 v7, -0x80000000

    .line 253
    .line 254
    .line 255
    cmp-long v0, v5, v7

    .line 256
    .line 257
    const/4 v5, 0x1

    .line 258
    const/4 v6, 0x0

    .line 259
    if-eqz v0, :cond_3

    .line 260
    .line 261
    invoke-virtual {v3}, Ldi3;->P()J

    .line 262
    .line 263
    .line 264
    move-result-wide v9

    .line 265
    iget-wide v11, v2, Lcom/google/android/gms/measurement/internal/zzr;->U:J

    .line 266
    .line 267
    cmp-long v0, v9, v11

    .line 268
    .line 269
    if-eqz v0, :cond_3

    .line 270
    .line 271
    move v0, v5

    .line 272
    goto :goto_4

    .line 273
    :cond_3
    move v0, v6

    .line 274
    :goto_4
    invoke-virtual {v3}, Ldi3;->N()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    invoke-virtual {v3}, Ldi3;->P()J

    .line 279
    .line 280
    .line 281
    move-result-wide v10

    .line 282
    cmp-long v3, v10, v7

    .line 283
    .line 284
    if-nez v3, :cond_4

    .line 285
    .line 286
    if-eqz v9, :cond_4

    .line 287
    .line 288
    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/zzr;->c:Ljava/lang/String;

    .line 289
    .line 290
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    if-nez v3, :cond_4

    .line 295
    .line 296
    goto :goto_5

    .line 297
    :cond_4
    move v5, v6

    .line 298
    :goto_5
    or-int/2addr v0, v5

    .line 299
    if-eqz v0, :cond_6

    .line 300
    .line 301
    new-instance v0, Landroid/os/Bundle;

    .line 302
    .line 303
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 304
    .line 305
    .line 306
    const-string v3, "_pv"

    .line 307
    .line 308
    invoke-virtual {v0, v3, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    new-instance v10, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 312
    .line 313
    new-instance v12, Lcom/google/android/gms/measurement/internal/zzbe;

    .line 314
    .line 315
    invoke-direct {v12, v0}, Lcom/google/android/gms/measurement/internal/zzbe;-><init>(Landroid/os/Bundle;)V

    .line 316
    .line 317
    .line 318
    const-string v13, "auto"

    .line 319
    .line 320
    const-string v11, "_au"

    .line 321
    .line 322
    move-wide/from16 v14, p2

    .line 323
    .line 324
    invoke-direct/range {v10 .. v15}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzbe;Ljava/lang/String;J)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    sget-object v3, Lvg3;->d1:Lug3;

    .line 332
    .line 333
    invoke-virtual {v0, v4, v3}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    if-eqz v0, :cond_5

    .line 338
    .line 339
    invoke-virtual {v1, v10, v2}, Lmp3;->i(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 340
    .line 341
    .line 342
    return-void

    .line 343
    :cond_5
    invoke-virtual {v1, v10, v2}, Lmp3;->j(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 344
    .line 345
    .line 346
    :cond_6
    return-void
.end method

.method public final a()Luh3;
    .locals 0

    .line 1
    iget-object p0, p0, Lmp3;->W:Lij3;

    .line 2
    .line 3
    invoke-static {p0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lij3;->f:Luh3;

    .line 7
    .line 8
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final a0(Lcom/google/android/gms/measurement/internal/zzr;)Ldi3;
    .locals 12

    .line 1
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lbj3;->y()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lmp3;->k0()V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->Y:Z

    .line 15
    .line 16
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v2}, Lkb1;->k(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzr;->e0:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    new-instance v3, Ljp3;

    .line 30
    .line 31
    invoke-direct {v3, p0, v1}, Ljp3;-><init>(Lmp3;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lmp3;->o0:Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object v1, p0, Lmp3;->c:Lae3;

    .line 40
    .line 41
    invoke-static {v1}, Lmp3;->S(Lwo3;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Lae3;->D0(Ljava/lang/String;)Ldi3;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    invoke-virtual {p0, v2}, Lmp3;->d(Ljava/lang/String;)Lok3;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/zzr;->d0:Ljava/lang/String;

    .line 53
    .line 54
    const/16 v4, 0x64

    .line 55
    .line 56
    invoke-static {v4, v3}, Lok3;->c(ILjava/lang/String;)Lok3;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v1, v3}, Lok3;->j(Lok3;)Lok3;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    sget-object v3, Lnk3;->b:Lnk3;

    .line 65
    .line 66
    invoke-virtual {v1, v3}, Lok3;->i(Lnk3;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    const-string v5, ""

    .line 71
    .line 72
    if-eqz v4, :cond_1

    .line 73
    .line 74
    iget-object v4, p0, Lmp3;->w:Ltn3;

    .line 75
    .line 76
    invoke-virtual {v4, v2, v0}, Ltn3;->E(Ljava/lang/String;Z)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    goto :goto_0

    .line 81
    :cond_1
    move-object v4, v5

    .line 82
    :goto_0
    const/4 v9, 0x1

    .line 83
    sget-object v6, Lnk3;->c:Lnk3;

    .line 84
    .line 85
    const/4 v10, 0x0

    .line 86
    if-nez v8, :cond_4

    .line 87
    .line 88
    new-instance v8, Ldi3;

    .line 89
    .line 90
    iget-object v5, p0, Lmp3;->W:Lij3;

    .line 91
    .line 92
    invoke-direct {v8, v5, v2}, Ldi3;-><init>(Lij3;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v6}, Lok3;->i(Lnk3;)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_2

    .line 100
    .line 101
    invoke-virtual {p0, v1}, Lmp3;->o(Lok3;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v8, v2}, Ldi3;->F(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :cond_2
    invoke-virtual {v1, v3}, Lok3;->i(Lnk3;)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_3

    .line 113
    .line 114
    invoke-virtual {v8, v4}, Ldi3;->I(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    :cond_3
    :goto_1
    move v11, v10

    .line 118
    goto/16 :goto_4

    .line 119
    .line 120
    :cond_4
    iget-object v7, v8, Ldi3;->a:Lij3;

    .line 121
    .line 122
    invoke-virtual {v1, v3}, Lok3;->i(Lnk3;)Z

    .line 123
    .line 124
    .line 125
    move-result v11

    .line 126
    if-eqz v11, :cond_8

    .line 127
    .line 128
    if-eqz v4, :cond_8

    .line 129
    .line 130
    iget-object v11, v7, Lij3;->i:Lbj3;

    .line 131
    .line 132
    invoke-static {v11}, Lij3;->l(Lhk3;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v11}, Lbj3;->y()V

    .line 136
    .line 137
    .line 138
    iget-object v11, v8, Ldi3;->e:Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v11

    .line 144
    if-nez v11, :cond_8

    .line 145
    .line 146
    iget-object v7, v7, Lij3;->i:Lbj3;

    .line 147
    .line 148
    invoke-static {v7}, Lij3;->l(Lhk3;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v7}, Lbj3;->y()V

    .line 152
    .line 153
    .line 154
    iget-object v7, v8, Ldi3;->e:Ljava/lang/String;

    .line 155
    .line 156
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 157
    .line 158
    .line 159
    move-result v7

    .line 160
    invoke-virtual {v8, v4}, Ldi3;->I(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    if-eqz v0, :cond_7

    .line 164
    .line 165
    iget-object v4, p0, Lmp3;->w:Ltn3;

    .line 166
    .line 167
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v3}, Lok3;->i(Lnk3;)Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-eqz v3, :cond_5

    .line 175
    .line 176
    invoke-virtual {v4, v2}, Ltn3;->D(Ljava/lang/String;)Landroid/util/Pair;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    goto :goto_2

    .line 181
    :cond_5
    new-instance v3, Landroid/util/Pair;

    .line 182
    .line 183
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 184
    .line 185
    invoke-direct {v3, v5, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    :goto_2
    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 189
    .line 190
    const-string v4, "00000000-0000-0000-0000-000000000000"

    .line 191
    .line 192
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    if-nez v3, :cond_7

    .line 197
    .line 198
    if-nez v7, :cond_7

    .line 199
    .line 200
    invoke-virtual {v1, v6}, Lok3;->i(Lnk3;)Z

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    if-eqz v3, :cond_6

    .line 205
    .line 206
    invoke-virtual {p0, v1}, Lmp3;->o(Lok3;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    invoke-virtual {v8, v1}, Ldi3;->F(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    move v11, v10

    .line 214
    goto :goto_3

    .line 215
    :cond_6
    move v11, v9

    .line 216
    :goto_3
    iget-object v1, p0, Lmp3;->c:Lae3;

    .line 217
    .line 218
    invoke-static {v1}, Lmp3;->S(Lwo3;)V

    .line 219
    .line 220
    .line 221
    const-string v3, "_id"

    .line 222
    .line 223
    invoke-virtual {v1, v2, v3}, Lae3;->v0(Ljava/lang/String;Ljava/lang/String;)Lrp3;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    if-eqz v1, :cond_9

    .line 228
    .line 229
    iget-object v1, p0, Lmp3;->c:Lae3;

    .line 230
    .line 231
    invoke-static {v1}, Lmp3;->S(Lwo3;)V

    .line 232
    .line 233
    .line 234
    const-string v3, "_lair"

    .line 235
    .line 236
    invoke-virtual {v1, v2, v3}, Lae3;->v0(Ljava/lang/String;Ljava/lang/String;)Lrp3;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    if-nez v1, :cond_9

    .line 241
    .line 242
    invoke-virtual {p0}, Lmp3;->f()Lxv;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    check-cast v1, Lxt0;

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 252
    .line 253
    .line 254
    move-result-wide v5

    .line 255
    new-instance v1, Lrp3;

    .line 256
    .line 257
    const-wide/16 v3, 0x1

    .line 258
    .line 259
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 260
    .line 261
    .line 262
    move-result-object v7

    .line 263
    const-string v3, "auto"

    .line 264
    .line 265
    const-string v4, "_lair"

    .line 266
    .line 267
    invoke-direct/range {v1 .. v7}, Lrp3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    iget-object v2, p0, Lmp3;->c:Lae3;

    .line 271
    .line 272
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v1}, Lae3;->u0(Lrp3;)Z

    .line 276
    .line 277
    .line 278
    goto :goto_4

    .line 279
    :cond_7
    invoke-virtual {v8}, Ldi3;->E()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    if-eqz v2, :cond_3

    .line 288
    .line 289
    invoke-virtual {v1, v6}, Lok3;->i(Lnk3;)Z

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    if-eqz v2, :cond_3

    .line 294
    .line 295
    invoke-virtual {p0, v1}, Lmp3;->o(Lok3;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-virtual {v8, v1}, Ldi3;->F(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    goto/16 :goto_1

    .line 303
    .line 304
    :cond_8
    invoke-virtual {v8}, Ldi3;->E()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    if-eqz v2, :cond_3

    .line 313
    .line 314
    invoke-virtual {v1, v6}, Lok3;->i(Lnk3;)Z

    .line 315
    .line 316
    .line 317
    move-result v2

    .line 318
    if-eqz v2, :cond_3

    .line 319
    .line 320
    invoke-virtual {p0, v1}, Lmp3;->o(Lok3;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    invoke-virtual {v8, v1}, Ldi3;->F(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    goto/16 :goto_1

    .line 328
    .line 329
    :cond_9
    :goto_4
    iget-object v1, v8, Ldi3;->a:Lij3;

    .line 330
    .line 331
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzr;->b:Ljava/lang/String;

    .line 332
    .line 333
    invoke-virtual {v8, v2}, Ldi3;->H(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzr;->V:Ljava/lang/String;

    .line 337
    .line 338
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    if-nez v3, :cond_a

    .line 343
    .line 344
    invoke-virtual {v8, v2}, Ldi3;->K(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    :cond_a
    iget-wide v2, p1, Lcom/google/android/gms/measurement/internal/zzr;->e:J

    .line 348
    .line 349
    const-wide/16 v4, 0x0

    .line 350
    .line 351
    cmp-long v4, v2, v4

    .line 352
    .line 353
    if-eqz v4, :cond_b

    .line 354
    .line 355
    invoke-virtual {v8, v2, v3}, Ldi3;->S(J)V

    .line 356
    .line 357
    .line 358
    :cond_b
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzr;->c:Ljava/lang/String;

    .line 359
    .line 360
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 361
    .line 362
    .line 363
    move-result v3

    .line 364
    if-nez v3, :cond_c

    .line 365
    .line 366
    invoke-virtual {v8, v2}, Ldi3;->O(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    :cond_c
    iget-wide v2, p1, Lcom/google/android/gms/measurement/internal/zzr;->U:J

    .line 370
    .line 371
    invoke-virtual {v8, v2, v3}, Ldi3;->Q(J)V

    .line 372
    .line 373
    .line 374
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzr;->d:Ljava/lang/String;

    .line 375
    .line 376
    if-eqz v2, :cond_d

    .line 377
    .line 378
    invoke-virtual {v8, v2}, Ldi3;->R(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    :cond_d
    iget-wide v2, p1, Lcom/google/android/gms/measurement/internal/zzr;->f:J

    .line 382
    .line 383
    invoke-virtual {v8, v2, v3}, Ldi3;->a(J)V

    .line 384
    .line 385
    .line 386
    iget-boolean v2, p1, Lcom/google/android/gms/measurement/internal/zzr;->v:Z

    .line 387
    .line 388
    invoke-virtual {v8, v2}, Ldi3;->d(Z)V

    .line 389
    .line 390
    .line 391
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzr;->i:Ljava/lang/String;

    .line 392
    .line 393
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 394
    .line 395
    .line 396
    move-result v3

    .line 397
    if-nez v3, :cond_e

    .line 398
    .line 399
    invoke-virtual {v8, v2}, Ldi3;->v(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    :cond_e
    iget-object v2, v1, Lij3;->i:Lbj3;

    .line 403
    .line 404
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2}, Lbj3;->y()V

    .line 408
    .line 409
    .line 410
    iget-boolean v2, v8, Ldi3;->Q:Z

    .line 411
    .line 412
    iget-boolean v3, v8, Ldi3;->p:Z

    .line 413
    .line 414
    if-eq v3, v0, :cond_f

    .line 415
    .line 416
    move v3, v9

    .line 417
    goto :goto_5

    .line 418
    :cond_f
    move v3, v10

    .line 419
    :goto_5
    or-int/2addr v2, v3

    .line 420
    iput-boolean v2, v8, Ldi3;->Q:Z

    .line 421
    .line 422
    iput-boolean v0, v8, Ldi3;->p:Z

    .line 423
    .line 424
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->a0:Ljava/lang/Boolean;

    .line 425
    .line 426
    iget-object v2, v1, Lij3;->i:Lbj3;

    .line 427
    .line 428
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2}, Lbj3;->y()V

    .line 432
    .line 433
    .line 434
    iget-boolean v2, v8, Ldi3;->Q:Z

    .line 435
    .line 436
    iget-object v3, v8, Ldi3;->q:Ljava/lang/Boolean;

    .line 437
    .line 438
    invoke-static {v3, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v3

    .line 442
    xor-int/2addr v3, v9

    .line 443
    or-int/2addr v2, v3

    .line 444
    iput-boolean v2, v8, Ldi3;->Q:Z

    .line 445
    .line 446
    iput-object v0, v8, Ldi3;->q:Ljava/lang/Boolean;

    .line 447
    .line 448
    iget-wide v2, p1, Lcom/google/android/gms/measurement/internal/zzr;->b0:J

    .line 449
    .line 450
    invoke-virtual {v8, v2, v3}, Ldi3;->c(J)V

    .line 451
    .line 452
    .line 453
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->f0:Ljava/lang/String;

    .line 454
    .line 455
    iget-object v2, v1, Lij3;->i:Lbj3;

    .line 456
    .line 457
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v2}, Lbj3;->y()V

    .line 461
    .line 462
    .line 463
    iget-boolean v2, v8, Ldi3;->Q:Z

    .line 464
    .line 465
    iget-object v3, v8, Ldi3;->t:Ljava/lang/String;

    .line 466
    .line 467
    invoke-static {v3, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-result v3

    .line 471
    xor-int/2addr v3, v9

    .line 472
    or-int/2addr v2, v3

    .line 473
    iput-boolean v2, v8, Ldi3;->Q:Z

    .line 474
    .line 475
    iput-object v0, v8, Ldi3;->t:Ljava/lang/String;

    .line 476
    .line 477
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpn;->zza()Z

    .line 478
    .line 479
    .line 480
    invoke-virtual {p0}, Lmp3;->d0()Lpd3;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    sget-object v2, Lvg3;->L0:Lug3;

    .line 485
    .line 486
    const/4 v3, 0x0

    .line 487
    invoke-virtual {v0, v3, v2}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 488
    .line 489
    .line 490
    move-result v0

    .line 491
    if-eqz v0, :cond_10

    .line 492
    .line 493
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->c0:Ljava/util/List;

    .line 494
    .line 495
    invoke-virtual {v8, v0}, Ldi3;->x(Ljava/util/List;)V

    .line 496
    .line 497
    .line 498
    goto :goto_6

    .line 499
    :cond_10
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpn;->zza()Z

    .line 500
    .line 501
    .line 502
    invoke-virtual {p0}, Lmp3;->d0()Lpd3;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    sget-object v2, Lvg3;->K0:Lug3;

    .line 507
    .line 508
    invoke-virtual {v0, v3, v2}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    if-eqz v0, :cond_11

    .line 513
    .line 514
    invoke-virtual {v8, v3}, Ldi3;->x(Ljava/util/List;)V

    .line 515
    .line 516
    .line 517
    :cond_11
    :goto_6
    iget-boolean v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->g0:Z

    .line 518
    .line 519
    iget-object v2, v1, Lij3;->i:Lbj3;

    .line 520
    .line 521
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v2}, Lbj3;->y()V

    .line 525
    .line 526
    .line 527
    iget-boolean v2, v8, Ldi3;->Q:Z

    .line 528
    .line 529
    iget-boolean v4, v8, Ldi3;->u:Z

    .line 530
    .line 531
    if-eq v4, v0, :cond_12

    .line 532
    .line 533
    move v4, v9

    .line 534
    goto :goto_7

    .line 535
    :cond_12
    move v4, v10

    .line 536
    :goto_7
    or-int/2addr v2, v4

    .line 537
    iput-boolean v2, v8, Ldi3;->Q:Z

    .line 538
    .line 539
    iput-boolean v0, v8, Ldi3;->u:Z

    .line 540
    .line 541
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->m0:Ljava/lang/String;

    .line 542
    .line 543
    iget-object v2, v1, Lij3;->i:Lbj3;

    .line 544
    .line 545
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v2}, Lbj3;->y()V

    .line 549
    .line 550
    .line 551
    iget-boolean v2, v8, Ldi3;->Q:Z

    .line 552
    .line 553
    iget-object v4, v8, Ldi3;->C:Ljava/lang/String;

    .line 554
    .line 555
    if-eq v4, v0, :cond_13

    .line 556
    .line 557
    move v4, v9

    .line 558
    goto :goto_8

    .line 559
    :cond_13
    move v4, v10

    .line 560
    :goto_8
    or-int/2addr v2, v4

    .line 561
    iput-boolean v2, v8, Ldi3;->Q:Z

    .line 562
    .line 563
    iput-object v0, v8, Ldi3;->C:Ljava/lang/String;

    .line 564
    .line 565
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzql;->zza()Z

    .line 566
    .line 567
    .line 568
    invoke-virtual {p0}, Lmp3;->d0()Lpd3;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    sget-object v2, Lvg3;->P0:Lug3;

    .line 573
    .line 574
    invoke-virtual {v0, v3, v2}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 575
    .line 576
    .line 577
    move-result v0

    .line 578
    if-eqz v0, :cond_15

    .line 579
    .line 580
    iget v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->k0:I

    .line 581
    .line 582
    iget-object v2, v1, Lij3;->i:Lbj3;

    .line 583
    .line 584
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v2}, Lbj3;->y()V

    .line 588
    .line 589
    .line 590
    iget-boolean v2, v8, Ldi3;->Q:Z

    .line 591
    .line 592
    iget v3, v8, Ldi3;->x:I

    .line 593
    .line 594
    if-eq v3, v0, :cond_14

    .line 595
    .line 596
    move v3, v9

    .line 597
    goto :goto_9

    .line 598
    :cond_14
    move v3, v10

    .line 599
    :goto_9
    or-int/2addr v2, v3

    .line 600
    iput-boolean v2, v8, Ldi3;->Q:Z

    .line 601
    .line 602
    iput v0, v8, Ldi3;->x:I

    .line 603
    .line 604
    :cond_15
    iget-wide v2, p1, Lcom/google/android/gms/measurement/internal/zzr;->h0:J

    .line 605
    .line 606
    invoke-virtual {v8, v2, v3}, Ldi3;->z(J)V

    .line 607
    .line 608
    .line 609
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->n0:Ljava/lang/String;

    .line 610
    .line 611
    iget-object v2, v1, Lij3;->i:Lbj3;

    .line 612
    .line 613
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v2}, Lbj3;->y()V

    .line 617
    .line 618
    .line 619
    iget-boolean v2, v8, Ldi3;->Q:Z

    .line 620
    .line 621
    iget-object v3, v8, Ldi3;->G:Ljava/lang/String;

    .line 622
    .line 623
    if-eq v3, v0, :cond_16

    .line 624
    .line 625
    move v3, v9

    .line 626
    goto :goto_a

    .line 627
    :cond_16
    move v3, v10

    .line 628
    :goto_a
    or-int/2addr v2, v3

    .line 629
    iput-boolean v2, v8, Ldi3;->Q:Z

    .line 630
    .line 631
    iput-object v0, v8, Ldi3;->G:Ljava/lang/String;

    .line 632
    .line 633
    iget p1, p1, Lcom/google/android/gms/measurement/internal/zzr;->p0:I

    .line 634
    .line 635
    iget-object v0, v1, Lij3;->i:Lbj3;

    .line 636
    .line 637
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 638
    .line 639
    .line 640
    invoke-virtual {v0}, Lbj3;->y()V

    .line 641
    .line 642
    .line 643
    iget-boolean v0, v8, Ldi3;->Q:Z

    .line 644
    .line 645
    iget v1, v8, Ldi3;->I:I

    .line 646
    .line 647
    if-eq v1, p1, :cond_17

    .line 648
    .line 649
    move v10, v9

    .line 650
    :cond_17
    or-int/2addr v0, v10

    .line 651
    iput-boolean v0, v8, Ldi3;->Q:Z

    .line 652
    .line 653
    iput p1, v8, Ldi3;->I:I

    .line 654
    .line 655
    invoke-virtual {v8}, Ldi3;->o()Z

    .line 656
    .line 657
    .line 658
    move-result p1

    .line 659
    if-nez p1, :cond_19

    .line 660
    .line 661
    if-eqz v11, :cond_18

    .line 662
    .line 663
    goto :goto_b

    .line 664
    :cond_18
    return-object v8

    .line 665
    :cond_19
    move v9, v11

    .line 666
    :goto_b
    iget-object p0, p0, Lmp3;->c:Lae3;

    .line 667
    .line 668
    invoke-static {p0}, Lmp3;->S(Lwo3;)V

    .line 669
    .line 670
    .line 671
    invoke-virtual {p0, v8, v9}, Lae3;->E0(Ldi3;Z)V

    .line 672
    .line 673
    .line 674
    return-object v8
.end method

.method public final b()Lbj3;
    .locals 0

    .line 1
    iget-object p0, p0, Lmp3;->W:Lij3;

    .line 2
    .line 3
    invoke-static {p0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lij3;->i:Lbj3;

    .line 7
    .line 8
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final b0(Landroid/os/Bundle;Lcom/google/android/gms/measurement/internal/zzr;)Ljava/util/List;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v1}, Lmp3;->b()Lbj3;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v3}, Lbj3;->y()V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzql;->zza()Z

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v4, v2, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 22
    .line 23
    sget-object v5, Lvg3;->P0:Lug3;

    .line 24
    .line 25
    invoke-virtual {v3, v4, v5}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_9

    .line 30
    .line 31
    if-nez v4, :cond_0

    .line 32
    .line 33
    goto/16 :goto_8

    .line 34
    .line 35
    :cond_0
    if-eqz v0, :cond_3

    .line 36
    .line 37
    const-string v5, "uriSources"

    .line 38
    .line 39
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    const-string v6, "uriTimestamps"

    .line 44
    .line 45
    invoke-virtual {v0, v6}, Landroid/os/BaseBundle;->getLongArray(Ljava/lang/String;)[J

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    if-eqz v5, :cond_3

    .line 50
    .line 51
    if-eqz v6, :cond_2

    .line 52
    .line 53
    array-length v0, v6

    .line 54
    array-length v7, v5

    .line 55
    if-eq v0, v7, :cond_1

    .line 56
    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    :cond_1
    const/4 v7, 0x0

    .line 60
    :goto_0
    array-length v0, v5

    .line 61
    if-ge v7, v0, :cond_3

    .line 62
    .line 63
    iget-object v0, v1, Lmp3;->c:Lae3;

    .line 64
    .line 65
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 66
    .line 67
    .line 68
    iget-object v8, v0, Lsq3;->a:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v8, Lij3;

    .line 71
    .line 72
    aget v9, v5, v7

    .line 73
    .line 74
    aget-wide v10, v6, v7

    .line 75
    .line 76
    invoke-static {v4}, Lkb1;->k(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Lsq3;->y()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Lwo3;->A()V

    .line 83
    .line 84
    .line 85
    const-string v12, " trigger URIs. appId, source, timestamp"

    .line 86
    .line 87
    const-string v13, "Pruned "

    .line 88
    .line 89
    :try_start_0
    invoke-virtual {v0}, Lae3;->q0()Landroid/database/sqlite/SQLiteDatabase;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const-string v14, "trigger_uris"

    .line 94
    .line 95
    const-string v15, "app_id=? and source=? and timestamp_millis<=?"

    .line 96
    .line 97
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1

    .line 101
    move-object/from16 v16, v5

    .line 102
    .line 103
    :try_start_1
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    filled-new-array {v4, v3, v5}, [Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-virtual {v0, v14, v15, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iget-object v3, v8, Lij3;->f:Luh3;

    .line 116
    .line 117
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 118
    .line 119
    .line 120
    iget-object v3, v3, Luh3;->Y:Lsh3;

    .line 121
    .line 122
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    add-int/lit8 v5, v5, 0x2e

    .line 131
    .line 132
    new-instance v14, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {v14, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    invoke-virtual {v3, v0, v4, v5, v9}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :catch_0
    move-exception v0

    .line 163
    goto :goto_1

    .line 164
    :catch_1
    move-exception v0

    .line 165
    move-object/from16 v16, v5

    .line 166
    .line 167
    :goto_1
    iget-object v3, v8, Lij3;->f:Luh3;

    .line 168
    .line 169
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 170
    .line 171
    .line 172
    iget-object v3, v3, Luh3;->f:Lsh3;

    .line 173
    .line 174
    invoke-static {v4}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    const-string v8, "Error pruning trigger URIs. appId"

    .line 179
    .line 180
    invoke-virtual {v3, v5, v8, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :goto_2
    add-int/lit8 v7, v7, 0x1

    .line 184
    .line 185
    move-object/from16 v5, v16

    .line 186
    .line 187
    goto :goto_0

    .line 188
    :cond_2
    :goto_3
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 193
    .line 194
    const-string v3, "Uri sources and timestamps do not match"

    .line 195
    .line 196
    invoke-virtual {v0, v3}, Lsh3;->a(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    :cond_3
    iget-object v1, v1, Lmp3;->c:Lae3;

    .line 200
    .line 201
    invoke-static {v1}, Lmp3;->S(Lwo3;)V

    .line 202
    .line 203
    .line 204
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 205
    .line 206
    invoke-static {v2}, Lkb1;->k(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1}, Lsq3;->y()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1}, Lwo3;->A()V

    .line 213
    .line 214
    .line 215
    new-instance v0, Ljava/util/ArrayList;

    .line 216
    .line 217
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 218
    .line 219
    .line 220
    const/4 v3, 0x0

    .line 221
    :try_start_2
    invoke-virtual {v1}, Lae3;->q0()Landroid/database/sqlite/SQLiteDatabase;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    const-string v5, "trigger_uris"

    .line 226
    .line 227
    const-string v6, "trigger_uri"

    .line 228
    .line 229
    const-string v7, "timestamp_millis"

    .line 230
    .line 231
    const-string v8, "source"

    .line 232
    .line 233
    filled-new-array {v6, v7, v8}, [Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v6

    .line 237
    const-string v7, "app_id=?"

    .line 238
    .line 239
    filled-new-array {v2}, [Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v8

    .line 243
    const-string v11, "rowid"

    .line 244
    .line 245
    const/4 v12, 0x0

    .line 246
    const/4 v9, 0x0

    .line 247
    const/4 v10, 0x0

    .line 248
    invoke-virtual/range {v4 .. v12}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    if-eqz v4, :cond_6

    .line 257
    .line 258
    const/4 v4, 0x0

    .line 259
    :cond_4
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    if-nez v5, :cond_5

    .line 264
    .line 265
    const-string v5, ""

    .line 266
    .line 267
    goto :goto_4

    .line 268
    :catchall_0
    move-exception v0

    .line 269
    goto :goto_7

    .line 270
    :catch_2
    move-exception v0

    .line 271
    goto :goto_5

    .line 272
    :cond_5
    :goto_4
    const/4 v6, 0x1

    .line 273
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 274
    .line 275
    .line 276
    move-result-wide v6

    .line 277
    const/4 v8, 0x2

    .line 278
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 279
    .line 280
    .line 281
    move-result v8

    .line 282
    new-instance v9, Lcom/google/android/gms/measurement/internal/zzog;

    .line 283
    .line 284
    invoke-direct {v9, v5, v6, v7, v8}, Lcom/google/android/gms/measurement/internal/zzog;-><init>(Ljava/lang/String;JI)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 291
    .line 292
    .line 293
    move-result v5
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 294
    if-nez v5, :cond_4

    .line 295
    .line 296
    goto :goto_6

    .line 297
    :goto_5
    :try_start_3
    iget-object v1, v1, Lsq3;->a:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v1, Lij3;

    .line 300
    .line 301
    iget-object v1, v1, Lij3;->f:Luh3;

    .line 302
    .line 303
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 304
    .line 305
    .line 306
    iget-object v1, v1, Luh3;->f:Lsh3;

    .line 307
    .line 308
    const-string v4, "Error querying trigger uris. appId"

    .line 309
    .line 310
    invoke-static {v2}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    invoke-virtual {v1, v2, v4, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 318
    .line 319
    :cond_6
    :goto_6
    if-eqz v3, :cond_7

    .line 320
    .line 321
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 322
    .line 323
    .line 324
    :cond_7
    return-object v0

    .line 325
    :goto_7
    if-eqz v3, :cond_8

    .line 326
    .line 327
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 328
    .line 329
    .line 330
    :cond_8
    throw v0

    .line 331
    :cond_9
    :goto_8
    new-instance v0, Ljava/util/ArrayList;

    .line 332
    .line 333
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 334
    .line 335
    .line 336
    return-object v0
.end method

.method public final c()Lq62;
    .locals 0

    .line 1
    iget-object p0, p0, Lmp3;->W:Lij3;

    .line 2
    .line 3
    iget-object p0, p0, Lij3;->c:Lq62;

    .line 4
    .line 5
    return-object p0
.end method

.method public final d(Ljava/lang/String;)Lok3;
    .locals 3

    .line 1
    sget-object v0, Lok3;->c:Lok3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lbj3;->y()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lmp3;->k0()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lmp3;->m0:Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lok3;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, Lmp3;->c:Lae3;

    .line 24
    .line 25
    invoke-static {v1}, Lmp3;->S(Lwo3;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1}, Lae3;->U(Ljava/lang/String;)Lok3;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    sget-object v1, Lok3;->c:Lok3;

    .line 35
    .line 36
    :cond_0
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Lbj3;->y()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lmp3;->k0()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Lmp3;->c:Lae3;

    .line 50
    .line 51
    invoke-static {p0}, Lmp3;->S(Lwo3;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1, v1}, Lae3;->g0(Ljava/lang/String;Lok3;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    return-object v1
.end method

.method public final d0()Lpd3;
    .locals 0

    .line 1
    iget-object p0, p0, Lmp3;->W:Lij3;

    .line 2
    .line 3
    invoke-static {p0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lij3;->d:Lpd3;

    .line 7
    .line 8
    return-object p0
.end method

.method public final e()Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lmp3;->W:Lij3;

    .line 2
    .line 3
    iget-object p0, p0, Lij3;->a:Landroid/content/Context;

    .line 4
    .line 5
    return-object p0
.end method

.method public final e0()Lvi3;
    .locals 0

    .line 1
    iget-object p0, p0, Lmp3;->a:Lvi3;

    .line 2
    .line 3
    invoke-static {p0}, Lmp3;->S(Lwo3;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final f()Lxv;
    .locals 0

    .line 1
    iget-object p0, p0, Lmp3;->W:Lij3;

    .line 2
    .line 3
    invoke-static {p0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lij3;->V:Lxt0;

    .line 7
    .line 8
    return-object p0
.end method

.method public final f0()Lae3;
    .locals 0

    .line 1
    iget-object p0, p0, Lmp3;->c:Lae3;

    .line 2
    .line 3
    invoke-static {p0}, Lmp3;->S(Lwo3;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final g()J
    .locals 7

    .line 1
    invoke-virtual {p0}, Lmp3;->f()Lxv;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lxt0;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-object p0, p0, Lmp3;->w:Ltn3;

    .line 15
    .line 16
    invoke-virtual {p0}, Lwo3;->A()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lsq3;->y()V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Ltn3;->U:Lio/sentry/android/core/s;

    .line 23
    .line 24
    invoke-virtual {v2}, Lio/sentry/android/core/s;->a()J

    .line 25
    .line 26
    .line 27
    move-result-wide v3

    .line 28
    const-wide/16 v5, 0x0

    .line 29
    .line 30
    cmp-long v5, v3, v5

    .line 31
    .line 32
    if-nez v5, :cond_0

    .line 33
    .line 34
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Lij3;

    .line 37
    .line 38
    iget-object p0, p0, Lij3;->w:Lup3;

    .line 39
    .line 40
    invoke-static {p0}, Lij3;->j(Lsq3;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lup3;->w0()Ljava/security/SecureRandom;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const v3, 0x5265c00

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v3}, Ljava/util/Random;->nextInt(I)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    int-to-long v3, p0

    .line 55
    const-wide/16 v5, 0x1

    .line 56
    .line 57
    add-long/2addr v3, v5

    .line 58
    invoke-virtual {v2, v3, v4}, Lio/sentry/android/core/s;->b(J)V

    .line 59
    .line 60
    .line 61
    :cond_0
    add-long/2addr v0, v3

    .line 62
    const-wide/16 v2, 0x3e8

    .line 63
    .line 64
    div-long/2addr v0, v2

    .line 65
    const-wide/16 v2, 0x3c

    .line 66
    .line 67
    div-long/2addr v0, v2

    .line 68
    div-long/2addr v0, v2

    .line 69
    const-wide/16 v2, 0x18

    .line 70
    .line 71
    div-long/2addr v0, v2

    .line 72
    return-wide v0
.end method

.method public final g0()Lgi3;
    .locals 0

    .line 1
    iget-object p0, p0, Lmp3;->d:Lgi3;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "Network broadcast receiver not created"

    .line 7
    .line 8
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final h(Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)V
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    iget-object v2, v0, Lmp3;->c:Lae3;

    .line 8
    .line 9
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v3}, Lae3;->D0(Ljava/lang/String;)Ldi3;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eqz v2, :cond_3

    .line 17
    .line 18
    iget-object v4, v2, Ldi3;->a:Lij3;

    .line 19
    .line 20
    invoke-virtual {v2}, Ldi3;->N()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    goto/16 :goto_1

    .line 31
    .line 32
    :cond_0
    invoke-virtual {v0, v2}, Lmp3;->N(Ldi3;)Ljava/lang/Boolean;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    if-nez v5, :cond_1

    .line 37
    .line 38
    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/zzbg;->a:Ljava/lang/String;

    .line 39
    .line 40
    const-string v6, "_ui"

    .line 41
    .line 42
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-nez v5, :cond_2

    .line 47
    .line 48
    invoke-virtual {v0}, Lmp3;->a()Luh3;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    iget-object v5, v5, Luh3;->w:Lsh3;

    .line 53
    .line 54
    invoke-static {v3}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    const-string v7, "Could not find package. appId"

    .line 59
    .line 60
    invoke-virtual {v5, v6, v7}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-nez v5, :cond_2

    .line 69
    .line 70
    invoke-virtual {v0}, Lmp3;->a()Luh3;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 75
    .line 76
    invoke-static {v3}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const-string v2, "App version does not match; dropping event. appId"

    .line 81
    .line 82
    invoke-virtual {v0, v1, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_2
    :goto_0
    new-instance v5, Lcom/google/android/gms/measurement/internal/zzr;

    .line 87
    .line 88
    invoke-virtual {v2}, Ldi3;->G()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    move-object v7, v5

    .line 93
    invoke-virtual {v2}, Ldi3;->N()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    move-object v9, v6

    .line 98
    move-object v8, v7

    .line 99
    invoke-virtual {v2}, Ldi3;->P()J

    .line 100
    .line 101
    .line 102
    move-result-wide v6

    .line 103
    iget-object v10, v4, Lij3;->i:Lbj3;

    .line 104
    .line 105
    invoke-static {v10}, Lij3;->l(Lhk3;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v10}, Lbj3;->y()V

    .line 109
    .line 110
    .line 111
    move-object v10, v8

    .line 112
    iget-object v8, v2, Ldi3;->l:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v11, v4, Lij3;->i:Lbj3;

    .line 115
    .line 116
    invoke-static {v11}, Lij3;->l(Lhk3;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v11}, Lbj3;->y()V

    .line 120
    .line 121
    .line 122
    move-object v12, v9

    .line 123
    move-object v11, v10

    .line 124
    iget-wide v9, v2, Ldi3;->m:J

    .line 125
    .line 126
    iget-object v13, v4, Lij3;->i:Lbj3;

    .line 127
    .line 128
    invoke-static {v13}, Lij3;->l(Lhk3;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v13}, Lbj3;->y()V

    .line 132
    .line 133
    .line 134
    move-object v13, v11

    .line 135
    move-object v14, v12

    .line 136
    iget-wide v11, v2, Ldi3;->n:J

    .line 137
    .line 138
    iget-object v15, v4, Lij3;->i:Lbj3;

    .line 139
    .line 140
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v15}, Lbj3;->y()V

    .line 144
    .line 145
    .line 146
    move-object v15, v14

    .line 147
    iget-boolean v14, v2, Ldi3;->o:Z

    .line 148
    .line 149
    invoke-virtual {v2}, Ldi3;->J()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v16

    .line 153
    move-object/from16 v17, v5

    .line 154
    .line 155
    iget-object v5, v4, Lij3;->i:Lbj3;

    .line 156
    .line 157
    invoke-static {v5}, Lij3;->l(Lhk3;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v5}, Lbj3;->y()V

    .line 161
    .line 162
    .line 163
    iget-boolean v5, v2, Ldi3;->p:Z

    .line 164
    .line 165
    invoke-virtual {v2}, Ldi3;->w()Ljava/lang/Boolean;

    .line 166
    .line 167
    .line 168
    move-result-object v22

    .line 169
    invoke-virtual {v2}, Ldi3;->b()J

    .line 170
    .line 171
    .line 172
    move-result-wide v23

    .line 173
    move/from16 v20, v5

    .line 174
    .line 175
    iget-object v5, v4, Lij3;->i:Lbj3;

    .line 176
    .line 177
    invoke-static {v5}, Lij3;->l(Lhk3;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v5}, Lbj3;->y()V

    .line 181
    .line 182
    .line 183
    iget-object v5, v2, Ldi3;->s:Ljava/util/ArrayList;

    .line 184
    .line 185
    invoke-virtual {v0, v3}, Lmp3;->d(Ljava/lang/String;)Lok3;

    .line 186
    .line 187
    .line 188
    move-result-object v18

    .line 189
    invoke-virtual/range {v18 .. v18}, Lok3;->g()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v26

    .line 193
    invoke-virtual {v2}, Ldi3;->y()Z

    .line 194
    .line 195
    .line 196
    move-result v29

    .line 197
    move-object/from16 v25, v5

    .line 198
    .line 199
    iget-object v5, v4, Lij3;->i:Lbj3;

    .line 200
    .line 201
    invoke-static {v5}, Lij3;->l(Lhk3;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v5}, Lbj3;->y()V

    .line 205
    .line 206
    .line 207
    move-wide/from16 v18, v6

    .line 208
    .line 209
    iget-wide v5, v2, Ldi3;->v:J

    .line 210
    .line 211
    invoke-virtual {v0, v3}, Lmp3;->d(Ljava/lang/String;)Lok3;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    iget v7, v7, Lok3;->b:I

    .line 216
    .line 217
    move-wide/from16 v30, v5

    .line 218
    .line 219
    invoke-virtual {v0, v3}, Lmp3;->n0(Ljava/lang/String;)Lce3;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    iget-object v5, v5, Lce3;->b:Ljava/lang/String;

    .line 224
    .line 225
    iget-object v6, v4, Lij3;->i:Lbj3;

    .line 226
    .line 227
    invoke-static {v6}, Lij3;->l(Lhk3;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v6}, Lbj3;->y()V

    .line 231
    .line 232
    .line 233
    iget v6, v2, Ldi3;->x:I

    .line 234
    .line 235
    iget-object v4, v4, Lij3;->i:Lbj3;

    .line 236
    .line 237
    invoke-static {v4}, Lij3;->l(Lhk3;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v4}, Lbj3;->y()V

    .line 241
    .line 242
    .line 243
    iget-wide v3, v2, Ldi3;->B:J

    .line 244
    .line 245
    invoke-virtual {v2}, Ldi3;->C()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v37

    .line 249
    invoke-virtual {v2}, Ldi3;->s()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v38

    .line 253
    invoke-virtual {v2}, Ldi3;->t()I

    .line 254
    .line 255
    .line 256
    move-result v41

    .line 257
    const/16 v28, 0x0

    .line 258
    .line 259
    const-wide/16 v39, 0x0

    .line 260
    .line 261
    move-object v2, v13

    .line 262
    const/4 v13, 0x0

    .line 263
    move-wide/from16 v35, v3

    .line 264
    .line 265
    move-object v4, v15

    .line 266
    const/4 v15, 0x0

    .line 267
    move-object/from16 v33, v5

    .line 268
    .line 269
    move/from16 v34, v6

    .line 270
    .line 271
    move/from16 v32, v7

    .line 272
    .line 273
    move-object/from16 v5, v17

    .line 274
    .line 275
    move-wide/from16 v6, v18

    .line 276
    .line 277
    const-wide/16 v17, 0x0

    .line 278
    .line 279
    const/16 v19, 0x0

    .line 280
    .line 281
    const/16 v21, 0x0

    .line 282
    .line 283
    const-string v27, ""

    .line 284
    .line 285
    move-object/from16 v3, p2

    .line 286
    .line 287
    invoke-direct/range {v2 .. v41}, Lcom/google/android/gms/measurement/internal/zzr;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JIZZLjava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;JI)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0, v1, v2}, Lmp3;->i(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 291
    .line 292
    .line 293
    return-void

    .line 294
    :cond_3
    :goto_1
    invoke-virtual {v0}, Lmp3;->a()Luh3;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    iget-object v0, v0, Luh3;->X:Lsh3;

    .line 299
    .line 300
    const-string v1, "No app data available; dropping event"

    .line 301
    .line 302
    invoke-virtual {v0, v3, v1}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    return-void
.end method

.method public final h0()Lfd3;
    .locals 0

    .line 1
    iget-object p0, p0, Lmp3;->f:Lfd3;

    .line 2
    .line 3
    invoke-static {p0}, Lmp3;->S(Lwo3;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final i(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 10

    .line 1
    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v1}, Lkb1;->k(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lwh3;->b(Lcom/google/android/gms/measurement/internal/zzbg;)Lwh3;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p1, Lwh3;->e:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v2, v0

    .line 13
    check-cast v2, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-virtual {p0}, Lmp3;->j0()Lup3;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v0, p0, Lmp3;->c:Lae3;

    .line 20
    .line 21
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 22
    .line 23
    .line 24
    iget-object v4, v0, Lsq3;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v4, Lij3;

    .line 27
    .line 28
    invoke-virtual {v0}, Lsq3;->y()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lwo3;->A()V

    .line 32
    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    :try_start_0
    invoke-virtual {v0}, Lae3;->q0()Landroid/database/sqlite/SQLiteDatabase;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    const-string v7, "select parameters from default_event_params where app_id=?"

    .line 40
    .line 41
    filled-new-array {v1}, [Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    invoke-virtual {v6, v7, v8}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 46
    .line 47
    .line 48
    move-result-object v6
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 49
    :try_start_1
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-nez v7, :cond_0

    .line 54
    .line 55
    iget-object v0, v4, Lij3;->f:Luh3;

    .line 56
    .line 57
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 61
    .line 62
    const-string v7, "Default event parameters not found"

    .line 63
    .line 64
    invoke-virtual {v0, v7}, Lsh3;->a(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    move-object p0, v0

    .line 70
    goto :goto_0

    .line 71
    :catch_0
    move-exception v0

    .line 72
    goto :goto_1

    .line 73
    :cond_0
    const/4 v7, 0x0

    .line 74
    invoke-interface {v6, v7}, Landroid/database/Cursor;->getBlob(I)[B

    .line 75
    .line 76
    .line 77
    move-result-object v7
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    :try_start_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzhs;->zzk()Lcom/google/android/gms/internal/measurement/zzhr;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    invoke-static {v8, v7}, Lci3;->m0(Lcom/google/android/gms/internal/measurement/zzma;[B)Lcom/google/android/gms/internal/measurement/zznk;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    check-cast v7, Lcom/google/android/gms/internal/measurement/zzhr;

    .line 87
    .line 88
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    check-cast v7, Lcom/google/android/gms/internal/measurement/zzhs;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 93
    .line 94
    :try_start_3
    iget-object v0, v0, Lqo3;->b:Lmp3;

    .line 95
    .line 96
    invoke-virtual {v0}, Lmp3;->i0()Lci3;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzhs;->zza()Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0}, Lci3;->G(Ljava/util/List;)Landroid/os/Bundle;

    .line 104
    .line 105
    .line 106
    move-result-object v0
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 107
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :catch_1
    move-exception v0

    .line 112
    :try_start_4
    iget-object v7, v4, Lij3;->f:Luh3;

    .line 113
    .line 114
    invoke-static {v7}, Lij3;->l(Lhk3;)V

    .line 115
    .line 116
    .line 117
    iget-object v7, v7, Luh3;->f:Lsh3;

    .line 118
    .line 119
    const-string v8, "Failed to retrieve default event parameters. appId"

    .line 120
    .line 121
    invoke-static {v1}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    invoke-virtual {v7, v9, v8, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :goto_0
    move-object v5, v6

    .line 130
    goto/16 :goto_5

    .line 131
    .line 132
    :catchall_1
    move-exception v0

    .line 133
    move-object p0, v0

    .line 134
    goto/16 :goto_5

    .line 135
    .line 136
    :catch_2
    move-exception v0

    .line 137
    move-object v6, v5

    .line 138
    :goto_1
    :try_start_5
    iget-object v4, v4, Lij3;->f:Luh3;

    .line 139
    .line 140
    invoke-static {v4}, Lij3;->l(Lhk3;)V

    .line 141
    .line 142
    .line 143
    iget-object v4, v4, Luh3;->f:Lsh3;

    .line 144
    .line 145
    const-string v7, "Error selecting default event parameters"

    .line 146
    .line 147
    invoke-virtual {v4, v0, v7}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 148
    .line 149
    .line 150
    :goto_2
    if-eqz v6, :cond_1

    .line 151
    .line 152
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 153
    .line 154
    .line 155
    :cond_1
    move-object v0, v5

    .line 156
    :goto_3
    invoke-virtual {v3, v2, v0}, Lup3;->K(Landroid/os/Bundle;Landroid/os/Bundle;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0}, Lmp3;->j0()Lup3;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {p0}, Lmp3;->d0()Lpd3;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    sget-object v3, Lvg3;->X:Lug3;

    .line 171
    .line 172
    const/16 v4, 0x64

    .line 173
    .line 174
    invoke-virtual {v2, v1, v3}, Lpd3;->H(Ljava/lang/String;Lug3;)I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    const/16 v2, 0x19

    .line 183
    .line 184
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    invoke-virtual {v0, p1, v1}, Lup3;->I(Lwh3;I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1}, Lwh3;->c()Lcom/google/android/gms/measurement/internal/zzbg;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {p0}, Lmp3;->d0()Lpd3;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    sget-object v1, Lvg3;->g1:Lug3;

    .line 200
    .line 201
    invoke-virtual {v0, v5, v1}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eqz v0, :cond_2

    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_2
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzbg;->a:Ljava/lang/String;

    .line 209
    .line 210
    const-string v1, "_cmp"

    .line 211
    .line 212
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-eqz v0, :cond_3

    .line 217
    .line 218
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzbg;->b:Lcom/google/android/gms/measurement/internal/zzbe;

    .line 219
    .line 220
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzbe;->a:Landroid/os/Bundle;

    .line 221
    .line 222
    const-string v2, "_cis"

    .line 223
    .line 224
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    const-string v2, "referrer API v2"

    .line 229
    .line 230
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    if-eqz v1, :cond_3

    .line 235
    .line 236
    const-string v1, "gclid"

    .line 237
    .line 238
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzbe;->a:Landroid/os/Bundle;

    .line 239
    .line 240
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-nez v0, :cond_3

    .line 249
    .line 250
    iget-wide v3, p1, Lcom/google/android/gms/measurement/internal/zzbg;->d:J

    .line 251
    .line 252
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzpk;

    .line 253
    .line 254
    const-string v7, "auto"

    .line 255
    .line 256
    const-string v6, "_lgclid"

    .line 257
    .line 258
    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/measurement/internal/zzpk;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p0, v2, p2}, Lmp3;->U(Lcom/google/android/gms/measurement/internal/zzpk;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 262
    .line 263
    .line 264
    :cond_3
    :goto_4
    invoke-virtual {p0, p1, p2}, Lmp3;->j(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :goto_5
    if-eqz v5, :cond_4

    .line 269
    .line 270
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 271
    .line 272
    .line 273
    :cond_4
    throw p0
.end method

.method public final i0()Lci3;
    .locals 0

    .line 1
    iget-object p0, p0, Lmp3;->i:Lci3;

    .line 2
    .line 3
    invoke-static {p0}, Lmp3;->S(Lwo3;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final j(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    const-string v2, "_s"

    .line 6
    .line 7
    const-string v3, "_sid"

    .line 8
    .line 9
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v4}, Lkb1;->k(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lmp3;->b()Lbj3;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-virtual {v5}, Lbj3;->y()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lmp3;->k0()V

    .line 25
    .line 26
    .line 27
    move-object/from16 v5, p1

    .line 28
    .line 29
    iget-wide v9, v5, Lcom/google/android/gms/measurement/internal/zzbg;->d:J

    .line 30
    .line 31
    invoke-static {v5}, Lwh3;->b(Lcom/google/android/gms/measurement/internal/zzbg;)Lwh3;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v1}, Lmp3;->b()Lbj3;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-virtual {v6}, Lbj3;->y()V

    .line 40
    .line 41
    .line 42
    iget-object v6, v1, Lmp3;->q0:Lbm3;

    .line 43
    .line 44
    const/4 v7, 0x0

    .line 45
    if-eqz v6, :cond_0

    .line 46
    .line 47
    iget-object v6, v1, Lmp3;->r0:Ljava/lang/String;

    .line 48
    .line 49
    if-eqz v6, :cond_0

    .line 50
    .line 51
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-nez v6, :cond_1

    .line 56
    .line 57
    :cond_0
    move-object v6, v7

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    iget-object v6, v1, Lmp3;->q0:Lbm3;

    .line 60
    .line 61
    :goto_0
    iget-object v8, v5, Lwh3;->e:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v8, Landroid/os/Bundle;

    .line 64
    .line 65
    const/4 v11, 0x0

    .line 66
    invoke-static {v6, v8, v11}, Lup3;->q0(Lbm3;Landroid/os/Bundle;Z)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5}, Lwh3;->c()Lcom/google/android/gms/measurement/internal/zzbg;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v1}, Lmp3;->i0()Lci3;

    .line 74
    .line 75
    .line 76
    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/zzr;->b:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_2

    .line 83
    .line 84
    return-void

    .line 85
    :cond_2
    iget-boolean v6, v0, Lcom/google/android/gms/measurement/internal/zzr;->v:Z

    .line 86
    .line 87
    if-nez v6, :cond_3

    .line 88
    .line 89
    invoke-virtual {v1, v0}, Lmp3;->a0(Lcom/google/android/gms/measurement/internal/zzr;)Ldi3;

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_3
    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/zzr;->c0:Ljava/util/List;

    .line 94
    .line 95
    if-eqz v6, :cond_5

    .line 96
    .line 97
    iget-object v12, v5, Lcom/google/android/gms/measurement/internal/zzbg;->a:Ljava/lang/String;

    .line 98
    .line 99
    invoke-interface {v6, v12}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-eqz v6, :cond_4

    .line 104
    .line 105
    iget-object v6, v5, Lcom/google/android/gms/measurement/internal/zzbg;->b:Lcom/google/android/gms/measurement/internal/zzbe;

    .line 106
    .line 107
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzbe;->G1()Landroid/os/Bundle;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    const-string v8, "ga_safelisted"

    .line 112
    .line 113
    const-wide/16 v13, 0x1

    .line 114
    .line 115
    invoke-virtual {v6, v8, v13, v14}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 116
    .line 117
    .line 118
    new-instance v11, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 119
    .line 120
    new-instance v13, Lcom/google/android/gms/measurement/internal/zzbe;

    .line 121
    .line 122
    invoke-direct {v13, v6}, Lcom/google/android/gms/measurement/internal/zzbe;-><init>(Landroid/os/Bundle;)V

    .line 123
    .line 124
    .line 125
    iget-object v14, v5, Lcom/google/android/gms/measurement/internal/zzbg;->c:Ljava/lang/String;

    .line 126
    .line 127
    iget-wide v5, v5, Lcom/google/android/gms/measurement/internal/zzbg;->d:J

    .line 128
    .line 129
    move-wide v15, v5

    .line 130
    invoke-direct/range {v11 .. v16}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzbe;Ljava/lang/String;J)V

    .line 131
    .line 132
    .line 133
    move-object v12, v11

    .line 134
    goto :goto_1

    .line 135
    :cond_4
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iget-object v0, v0, Luh3;->X:Lsh3;

    .line 140
    .line 141
    iget-object v1, v5, Lcom/google/android/gms/measurement/internal/zzbg;->a:Ljava/lang/String;

    .line 142
    .line 143
    iget-object v2, v5, Lcom/google/android/gms/measurement/internal/zzbg;->c:Ljava/lang/String;

    .line 144
    .line 145
    const-string v3, "Dropping non-safelisted event. appId, event name, origin"

    .line 146
    .line 147
    invoke-virtual {v0, v3, v4, v1, v2}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_5
    move-object v12, v5

    .line 152
    :goto_1
    iget-object v5, v1, Lmp3;->c:Lae3;

    .line 153
    .line 154
    invoke-static {v5}, Lmp3;->S(Lwo3;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5}, Lae3;->n0()V

    .line 158
    .line 159
    .line 160
    :try_start_0
    iget-object v5, v12, Lcom/google/android/gms/measurement/internal/zzbg;->a:Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    const-wide/16 v13, 0x0

    .line 167
    .line 168
    if-eqz v6, :cond_8

    .line 169
    .line 170
    iget-object v6, v1, Lmp3;->c:Lae3;

    .line 171
    .line 172
    invoke-static {v6}, Lmp3;->S(Lwo3;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v6, v4, v2}, Lae3;->O(Ljava/lang/String;Ljava/lang/String;)Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    if-nez v2, :cond_8

    .line 180
    .line 181
    iget-object v2, v12, Lcom/google/android/gms/measurement/internal/zzbg;->b:Lcom/google/android/gms/measurement/internal/zzbe;

    .line 182
    .line 183
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzbe;->a:Landroid/os/Bundle;

    .line 184
    .line 185
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 186
    .line 187
    .line 188
    move-result-wide v15

    .line 189
    cmp-long v2, v15, v13

    .line 190
    .line 191
    if-eqz v2, :cond_8

    .line 192
    .line 193
    iget-object v2, v1, Lmp3;->c:Lae3;

    .line 194
    .line 195
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 196
    .line 197
    .line 198
    const-string v6, "_f"

    .line 199
    .line 200
    invoke-virtual {v2, v4, v6}, Lae3;->O(Ljava/lang/String;Ljava/lang/String;)Z

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-nez v2, :cond_7

    .line 205
    .line 206
    iget-object v2, v1, Lmp3;->c:Lae3;

    .line 207
    .line 208
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 209
    .line 210
    .line 211
    const-string v6, "_v"

    .line 212
    .line 213
    invoke-virtual {v2, v4, v6}, Lae3;->O(Ljava/lang/String;Ljava/lang/String;)Z

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    if-eqz v2, :cond_6

    .line 218
    .line 219
    goto :goto_2

    .line 220
    :cond_6
    iget-object v2, v1, Lmp3;->c:Lae3;

    .line 221
    .line 222
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1}, Lmp3;->f()Lxv;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    check-cast v6, Lxt0;

    .line 230
    .line 231
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 235
    .line 236
    .line 237
    move-result-wide v6

    .line 238
    const-wide/16 v15, -0x3a98

    .line 239
    .line 240
    add-long/2addr v6, v15

    .line 241
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    invoke-virtual {v1, v12, v4}, Lmp3;->k(Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)Landroid/os/Bundle;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    invoke-virtual {v2, v4, v6, v3, v7}, Lae3;->T(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 250
    .line 251
    .line 252
    goto :goto_3

    .line 253
    :catchall_0
    move-exception v0

    .line 254
    goto/16 :goto_d

    .line 255
    .line 256
    :cond_7
    :goto_2
    iget-object v2, v1, Lmp3;->c:Lae3;

    .line 257
    .line 258
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1, v12, v4}, Lmp3;->k(Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)Landroid/os/Bundle;

    .line 262
    .line 263
    .line 264
    move-result-object v6

    .line 265
    invoke-virtual {v2, v4, v7, v3, v6}, Lae3;->T(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 266
    .line 267
    .line 268
    :cond_8
    :goto_3
    iget-object v2, v1, Lmp3;->c:Lae3;

    .line 269
    .line 270
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 271
    .line 272
    .line 273
    invoke-static {v4}, Lkb1;->k(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2}, Lsq3;->y()V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2}, Lwo3;->A()V

    .line 280
    .line 281
    .line 282
    cmp-long v3, v9, v13

    .line 283
    .line 284
    if-gez v3, :cond_9

    .line 285
    .line 286
    iget-object v2, v2, Lsq3;->a:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v2, Lij3;

    .line 289
    .line 290
    iget-object v2, v2, Lij3;->f:Luh3;

    .line 291
    .line 292
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 293
    .line 294
    .line 295
    iget-object v2, v2, Luh3;->w:Lsh3;

    .line 296
    .line 297
    const-string v6, "Invalid time querying timed out conditional properties"

    .line 298
    .line 299
    invoke-static {v4}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 300
    .line 301
    .line 302
    move-result-object v7

    .line 303
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 304
    .line 305
    .line 306
    move-result-object v8

    .line 307
    invoke-virtual {v2, v7, v6, v8}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 311
    .line 312
    goto :goto_4

    .line 313
    :cond_9
    const-string v6, "active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout"

    .line 314
    .line 315
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v7

    .line 319
    filled-new-array {v4, v7}, [Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v7

    .line 323
    invoke-virtual {v2, v6, v7}, Lae3;->C0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    :goto_4
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    :cond_a
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 332
    .line 333
    .line 334
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 335
    iget-object v13, v1, Lmp3;->W:Lij3;

    .line 336
    .line 337
    if-eqz v6, :cond_c

    .line 338
    .line 339
    :try_start_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v6

    .line 343
    check-cast v6, Lcom/google/android/gms/measurement/internal/zzah;

    .line 344
    .line 345
    if-eqz v6, :cond_a

    .line 346
    .line 347
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 348
    .line 349
    .line 350
    move-result-object v7

    .line 351
    iget-object v7, v7, Luh3;->Y:Lsh3;

    .line 352
    .line 353
    const-string v8, "User property timed out"

    .line 354
    .line 355
    iget-object v11, v6, Lcom/google/android/gms/measurement/internal/zzah;->a:Ljava/lang/String;

    .line 356
    .line 357
    iget-object v13, v13, Lij3;->U:Lmh3;

    .line 358
    .line 359
    iget-object v14, v6, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 360
    .line 361
    iget-object v14, v14, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 362
    .line 363
    invoke-virtual {v13, v14}, Lmh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v13

    .line 367
    iget-object v14, v6, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 368
    .line 369
    invoke-virtual {v14}, Lcom/google/android/gms/measurement/internal/zzpk;->D1()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v14

    .line 373
    invoke-virtual {v7, v8, v11, v13, v14}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    iget-object v7, v6, Lcom/google/android/gms/measurement/internal/zzah;->i:Lcom/google/android/gms/measurement/internal/zzbg;

    .line 377
    .line 378
    if-eqz v7, :cond_b

    .line 379
    .line 380
    new-instance v8, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 381
    .line 382
    invoke-direct {v8, v7, v9, v10}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Lcom/google/android/gms/measurement/internal/zzbg;J)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v1, v8, v0}, Lmp3;->l(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 386
    .line 387
    .line 388
    :cond_b
    iget-object v7, v1, Lmp3;->c:Lae3;

    .line 389
    .line 390
    invoke-static {v7}, Lmp3;->S(Lwo3;)V

    .line 391
    .line 392
    .line 393
    iget-object v6, v6, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 394
    .line 395
    iget-object v6, v6, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 396
    .line 397
    invoke-virtual {v7, v4, v6}, Lae3;->A0(Ljava/lang/String;Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    goto :goto_5

    .line 401
    :cond_c
    iget-object v2, v1, Lmp3;->c:Lae3;

    .line 402
    .line 403
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 404
    .line 405
    .line 406
    invoke-static {v4}, Lkb1;->k(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v2}, Lsq3;->y()V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v2}, Lwo3;->A()V

    .line 413
    .line 414
    .line 415
    if-gez v3, :cond_d

    .line 416
    .line 417
    iget-object v2, v2, Lsq3;->a:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v2, Lij3;

    .line 420
    .line 421
    iget-object v2, v2, Lij3;->f:Luh3;

    .line 422
    .line 423
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 424
    .line 425
    .line 426
    iget-object v2, v2, Luh3;->w:Lsh3;

    .line 427
    .line 428
    const-string v6, "Invalid time querying expired conditional properties"

    .line 429
    .line 430
    invoke-static {v4}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 431
    .line 432
    .line 433
    move-result-object v7

    .line 434
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 435
    .line 436
    .line 437
    move-result-object v8

    .line 438
    invoke-virtual {v2, v7, v6, v8}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 442
    .line 443
    goto :goto_6

    .line 444
    :cond_d
    const-string v6, "active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live"

    .line 445
    .line 446
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v7

    .line 450
    filled-new-array {v4, v7}, [Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v7

    .line 454
    invoke-virtual {v2, v6, v7}, Lae3;->C0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    :goto_6
    new-instance v6, Ljava/util/ArrayList;

    .line 459
    .line 460
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 461
    .line 462
    .line 463
    move-result v7

    .line 464
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 465
    .line 466
    .line 467
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    :cond_e
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 472
    .line 473
    .line 474
    move-result v7

    .line 475
    if-eqz v7, :cond_10

    .line 476
    .line 477
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v7

    .line 481
    check-cast v7, Lcom/google/android/gms/measurement/internal/zzah;

    .line 482
    .line 483
    if-eqz v7, :cond_e

    .line 484
    .line 485
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 486
    .line 487
    .line 488
    move-result-object v8

    .line 489
    iget-object v8, v8, Luh3;->Y:Lsh3;

    .line 490
    .line 491
    const-string v11, "User property expired"

    .line 492
    .line 493
    iget-object v14, v7, Lcom/google/android/gms/measurement/internal/zzah;->a:Ljava/lang/String;

    .line 494
    .line 495
    iget-object v15, v13, Lij3;->U:Lmh3;

    .line 496
    .line 497
    move-object/from16 p1, v2

    .line 498
    .line 499
    iget-object v2, v7, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 500
    .line 501
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 502
    .line 503
    invoke-virtual {v15, v2}, Lmh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v2

    .line 507
    iget-object v15, v7, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 508
    .line 509
    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/zzpk;->D1()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v15

    .line 513
    invoke-virtual {v8, v11, v14, v2, v15}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 514
    .line 515
    .line 516
    iget-object v2, v1, Lmp3;->c:Lae3;

    .line 517
    .line 518
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 519
    .line 520
    .line 521
    iget-object v8, v7, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 522
    .line 523
    iget-object v8, v8, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 524
    .line 525
    invoke-virtual {v2, v4, v8}, Lae3;->t0(Ljava/lang/String;Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    iget-object v2, v7, Lcom/google/android/gms/measurement/internal/zzah;->V:Lcom/google/android/gms/measurement/internal/zzbg;

    .line 529
    .line 530
    if-eqz v2, :cond_f

    .line 531
    .line 532
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    :cond_f
    iget-object v2, v1, Lmp3;->c:Lae3;

    .line 536
    .line 537
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 538
    .line 539
    .line 540
    iget-object v7, v7, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 541
    .line 542
    iget-object v7, v7, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 543
    .line 544
    invoke-virtual {v2, v4, v7}, Lae3;->A0(Ljava/lang/String;Ljava/lang/String;)V

    .line 545
    .line 546
    .line 547
    move-object/from16 v2, p1

    .line 548
    .line 549
    goto :goto_7

    .line 550
    :cond_10
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 555
    .line 556
    .line 557
    move-result v6

    .line 558
    if-eqz v6, :cond_11

    .line 559
    .line 560
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v6

    .line 564
    check-cast v6, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 565
    .line 566
    new-instance v7, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 567
    .line 568
    invoke-direct {v7, v6, v9, v10}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Lcom/google/android/gms/measurement/internal/zzbg;J)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v1, v7, v0}, Lmp3;->l(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 572
    .line 573
    .line 574
    goto :goto_8

    .line 575
    :cond_11
    iget-object v2, v1, Lmp3;->c:Lae3;

    .line 576
    .line 577
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 578
    .line 579
    .line 580
    invoke-static {v4}, Lkb1;->k(Ljava/lang/String;)V

    .line 581
    .line 582
    .line 583
    invoke-static {v5}, Lkb1;->k(Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    invoke-virtual {v2}, Lsq3;->y()V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v2}, Lwo3;->A()V

    .line 590
    .line 591
    .line 592
    if-gez v3, :cond_12

    .line 593
    .line 594
    iget-object v2, v2, Lsq3;->a:Ljava/lang/Object;

    .line 595
    .line 596
    check-cast v2, Lij3;

    .line 597
    .line 598
    iget-object v3, v2, Lij3;->f:Luh3;

    .line 599
    .line 600
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 601
    .line 602
    .line 603
    iget-object v3, v3, Luh3;->w:Lsh3;

    .line 604
    .line 605
    const-string v6, "Invalid time querying triggered conditional properties"

    .line 606
    .line 607
    invoke-static {v4}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 608
    .line 609
    .line 610
    move-result-object v4

    .line 611
    iget-object v2, v2, Lij3;->U:Lmh3;

    .line 612
    .line 613
    invoke-virtual {v2, v5}, Lmh3;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v2

    .line 617
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 618
    .line 619
    .line 620
    move-result-object v5

    .line 621
    invoke-virtual {v3, v6, v4, v2, v5}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 622
    .line 623
    .line 624
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 625
    .line 626
    goto :goto_9

    .line 627
    :cond_12
    const-string v3, "active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout"

    .line 628
    .line 629
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v6

    .line 633
    filled-new-array {v4, v5, v6}, [Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v4

    .line 637
    invoke-virtual {v2, v3, v4}, Lae3;->C0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 638
    .line 639
    .line 640
    move-result-object v2

    .line 641
    :goto_9
    new-instance v3, Ljava/util/ArrayList;

    .line 642
    .line 643
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 644
    .line 645
    .line 646
    move-result v4

    .line 647
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 648
    .line 649
    .line 650
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 651
    .line 652
    .line 653
    move-result-object v2

    .line 654
    :cond_13
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 655
    .line 656
    .line 657
    move-result v4

    .line 658
    if-eqz v4, :cond_16

    .line 659
    .line 660
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v4

    .line 664
    check-cast v4, Lcom/google/android/gms/measurement/internal/zzah;

    .line 665
    .line 666
    if-eqz v4, :cond_13

    .line 667
    .line 668
    iget-object v5, v4, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 669
    .line 670
    new-instance v6, Lrp3;

    .line 671
    .line 672
    move-object v7, v6

    .line 673
    iget-object v6, v4, Lcom/google/android/gms/measurement/internal/zzah;->a:Ljava/lang/String;

    .line 674
    .line 675
    invoke-static {v6}, Lkb1;->n(Ljava/lang/Object;)V

    .line 676
    .line 677
    .line 678
    move-object v8, v7

    .line 679
    iget-object v7, v4, Lcom/google/android/gms/measurement/internal/zzah;->b:Ljava/lang/String;

    .line 680
    .line 681
    move-object v11, v8

    .line 682
    iget-object v8, v5, Lcom/google/android/gms/measurement/internal/zzpk;->b:Ljava/lang/String;

    .line 683
    .line 684
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/zzpk;->D1()Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v5

    .line 688
    invoke-static {v5}, Lkb1;->n(Ljava/lang/Object;)V

    .line 689
    .line 690
    .line 691
    move-object/from16 v17, v11

    .line 692
    .line 693
    move-object v11, v5

    .line 694
    move-object/from16 v5, v17

    .line 695
    .line 696
    invoke-direct/range {v5 .. v11}, Lrp3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 697
    .line 698
    .line 699
    iget-object v6, v5, Lrp3;->e:Ljava/lang/Object;

    .line 700
    .line 701
    iget-object v7, v5, Lrp3;->c:Ljava/lang/String;

    .line 702
    .line 703
    iget-object v8, v1, Lmp3;->c:Lae3;

    .line 704
    .line 705
    invoke-static {v8}, Lmp3;->S(Lwo3;)V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v8, v5}, Lae3;->u0(Lrp3;)Z

    .line 709
    .line 710
    .line 711
    move-result v8

    .line 712
    if-eqz v8, :cond_14

    .line 713
    .line 714
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 715
    .line 716
    .line 717
    move-result-object v8

    .line 718
    iget-object v8, v8, Luh3;->Y:Lsh3;

    .line 719
    .line 720
    const-string v11, "User property triggered"

    .line 721
    .line 722
    iget-object v14, v4, Lcom/google/android/gms/measurement/internal/zzah;->a:Ljava/lang/String;

    .line 723
    .line 724
    iget-object v15, v13, Lij3;->U:Lmh3;

    .line 725
    .line 726
    invoke-virtual {v15, v7}, Lmh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v7

    .line 730
    invoke-virtual {v8, v11, v14, v7, v6}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 731
    .line 732
    .line 733
    goto :goto_b

    .line 734
    :cond_14
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 735
    .line 736
    .line 737
    move-result-object v8

    .line 738
    iget-object v8, v8, Luh3;->f:Lsh3;

    .line 739
    .line 740
    const-string v11, "Too many active user properties, ignoring"

    .line 741
    .line 742
    iget-object v14, v4, Lcom/google/android/gms/measurement/internal/zzah;->a:Ljava/lang/String;

    .line 743
    .line 744
    invoke-static {v14}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 745
    .line 746
    .line 747
    move-result-object v14

    .line 748
    iget-object v15, v13, Lij3;->U:Lmh3;

    .line 749
    .line 750
    invoke-virtual {v15, v7}, Lmh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    move-result-object v7

    .line 754
    invoke-virtual {v8, v11, v14, v7, v6}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 755
    .line 756
    .line 757
    :goto_b
    iget-object v6, v4, Lcom/google/android/gms/measurement/internal/zzah;->w:Lcom/google/android/gms/measurement/internal/zzbg;

    .line 758
    .line 759
    if-eqz v6, :cond_15

    .line 760
    .line 761
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 762
    .line 763
    .line 764
    :cond_15
    new-instance v6, Lcom/google/android/gms/measurement/internal/zzpk;

    .line 765
    .line 766
    invoke-direct {v6, v5}, Lcom/google/android/gms/measurement/internal/zzpk;-><init>(Lrp3;)V

    .line 767
    .line 768
    .line 769
    iput-object v6, v4, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 770
    .line 771
    const/4 v5, 0x1

    .line 772
    iput-boolean v5, v4, Lcom/google/android/gms/measurement/internal/zzah;->e:Z

    .line 773
    .line 774
    iget-object v5, v1, Lmp3;->c:Lae3;

    .line 775
    .line 776
    invoke-static {v5}, Lmp3;->S(Lwo3;)V

    .line 777
    .line 778
    .line 779
    invoke-virtual {v5, v4}, Lae3;->y0(Lcom/google/android/gms/measurement/internal/zzah;)Z

    .line 780
    .line 781
    .line 782
    goto/16 :goto_a

    .line 783
    .line 784
    :cond_16
    invoke-virtual {v1, v12, v0}, Lmp3;->l(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 785
    .line 786
    .line 787
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 788
    .line 789
    .line 790
    move-result-object v2

    .line 791
    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 792
    .line 793
    .line 794
    move-result v3

    .line 795
    if-eqz v3, :cond_17

    .line 796
    .line 797
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v3

    .line 801
    check-cast v3, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 802
    .line 803
    new-instance v4, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 804
    .line 805
    invoke-direct {v4, v3, v9, v10}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Lcom/google/android/gms/measurement/internal/zzbg;J)V

    .line 806
    .line 807
    .line 808
    invoke-virtual {v1, v4, v0}, Lmp3;->l(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 809
    .line 810
    .line 811
    goto :goto_c

    .line 812
    :cond_17
    iget-object v0, v1, Lmp3;->c:Lae3;

    .line 813
    .line 814
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 815
    .line 816
    .line 817
    invoke-virtual {v0}, Lae3;->o0()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 818
    .line 819
    .line 820
    iget-object v0, v1, Lmp3;->c:Lae3;

    .line 821
    .line 822
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 823
    .line 824
    .line 825
    invoke-virtual {v0}, Lae3;->p0()V

    .line 826
    .line 827
    .line 828
    return-void

    .line 829
    :goto_d
    iget-object v1, v1, Lmp3;->c:Lae3;

    .line 830
    .line 831
    invoke-static {v1}, Lmp3;->S(Lwo3;)V

    .line 832
    .line 833
    .line 834
    invoke-virtual {v1}, Lae3;->p0()V

    .line 835
    .line 836
    .line 837
    throw v0
.end method

.method public final j0()Lup3;
    .locals 0

    .line 1
    iget-object p0, p0, Lmp3;->W:Lij3;

    .line 2
    .line 3
    invoke-static {p0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lij3;->w:Lup3;

    .line 7
    .line 8
    invoke-static {p0}, Lij3;->j(Lsq3;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final k(Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzbg;->b:Lcom/google/android/gms/measurement/internal/zzbe;

    .line 7
    .line 8
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzbe;->a:Landroid/os/Bundle;

    .line 9
    .line 10
    const-string v1, "_sid"

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lmp3;->c:Lae3;

    .line 20
    .line 21
    invoke-static {p0}, Lmp3;->S(Lwo3;)V

    .line 22
    .line 23
    .line 24
    const-string p1, "_sno"

    .line 25
    .line 26
    invoke-virtual {p0, p2, p1}, Lae3;->v0(Ljava/lang/String;Ljava/lang/String;)Lrp3;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    iget-object p0, p0, Lrp3;->e:Ljava/lang/Object;

    .line 33
    .line 34
    instance-of p2, p0, Ljava/lang/Long;

    .line 35
    .line 36
    if-eqz p2, :cond_0

    .line 37
    .line 38
    check-cast p0, Ljava/lang/Long;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    invoke-virtual {v0, p1, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-object v0
.end method

.method public final k0()V
    .locals 0

    .line 1
    iget-object p0, p0, Lmp3;->X:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p0, "UploadController is not initialized"

    .line 11
    .line 12
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final l(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 59

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    const-string v3, "metadata_fingerprint"

    .line 6
    .line 7
    const-string v4, "app_id"

    .line 8
    .line 9
    const-string v5, "_fx"

    .line 10
    .line 11
    const-string v6, "events"

    .line 12
    .line 13
    const-string v7, "raw_events"

    .line 14
    .line 15
    const-string v8, "_sno"

    .line 16
    .line 17
    invoke-static {v2}, Lkb1;->n(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-boolean v9, v2, Lcom/google/android/gms/measurement/internal/zzr;->Y:Z

    .line 21
    .line 22
    iget-wide v10, v2, Lcom/google/android/gms/measurement/internal/zzr;->b0:J

    .line 23
    .line 24
    iget-wide v12, v2, Lcom/google/android/gms/measurement/internal/zzr;->f:J

    .line 25
    .line 26
    iget-object v14, v2, Lcom/google/android/gms/measurement/internal/zzr;->d0:Ljava/lang/String;

    .line 27
    .line 28
    move-object v15, v3

    .line 29
    move-object/from16 v16, v4

    .line 30
    .line 31
    iget-wide v3, v2, Lcom/google/android/gms/measurement/internal/zzr;->e:J

    .line 32
    .line 33
    move/from16 v17, v9

    .line 34
    .line 35
    move-wide/from16 v18, v10

    .line 36
    .line 37
    iget-wide v9, v2, Lcom/google/android/gms/measurement/internal/zzr;->U:J

    .line 38
    .line 39
    iget-object v11, v2, Lcom/google/android/gms/measurement/internal/zzr;->f0:Ljava/lang/String;

    .line 40
    .line 41
    move-object/from16 v20, v15

    .line 42
    .line 43
    iget-object v15, v2, Lcom/google/android/gms/measurement/internal/zzr;->c:Ljava/lang/String;

    .line 44
    .line 45
    move-object/from16 v21, v5

    .line 46
    .line 47
    iget-object v5, v2, Lcom/google/android/gms/measurement/internal/zzr;->d:Ljava/lang/String;

    .line 48
    .line 49
    move-wide/from16 v22, v12

    .line 50
    .line 51
    iget-boolean v12, v2, Lcom/google/android/gms/measurement/internal/zzr;->v:Z

    .line 52
    .line 53
    iget-object v13, v2, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v13}, Lkb1;->k(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 59
    .line 60
    .line 61
    move-result-wide v41

    .line 62
    invoke-virtual {v1}, Lmp3;->b()Lbj3;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Lbj3;->y()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Lmp3;->k0()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Lmp3;->i0()Lci3;

    .line 73
    .line 74
    .line 75
    move/from16 v43, v12

    .line 76
    .line 77
    iget-object v12, v2, Lcom/google/android/gms/measurement/internal/zzr;->b:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_0

    .line 84
    .line 85
    goto/16 :goto_1

    .line 86
    .line 87
    :cond_0
    if-nez v43, :cond_1

    .line 88
    .line 89
    invoke-virtual {v1, v2}, Lmp3;->a0(Lcom/google/android/gms/measurement/internal/zzr;)Ldi3;

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_1
    invoke-virtual {v1}, Lmp3;->e0()Lvi3;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    move-object/from16 v45, v12

    .line 98
    .line 99
    move-object/from16 v44, v14

    .line 100
    .line 101
    move-object/from16 v14, p1

    .line 102
    .line 103
    iget-object v12, v14, Lcom/google/android/gms/measurement/internal/zzbg;->a:Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {v0, v13, v12}, Lvi3;->O(Ljava/lang/String;Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    const-string v14, "_err"

    .line 110
    .line 111
    move-wide/from16 v46, v3

    .line 112
    .line 113
    iget-object v3, v1, Lmp3;->W:Lij3;

    .line 114
    .line 115
    iget-object v4, v1, Lmp3;->u0:Lac3;

    .line 116
    .line 117
    move-object/from16 v24, v4

    .line 118
    .line 119
    const/4 v4, 0x0

    .line 120
    if-eqz v0, :cond_5

    .line 121
    .line 122
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Luh3;->E()Lsh3;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v13}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v3}, Lij3;->m()Lmh3;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {v3, v12}, Lmh3;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    const-string v5, "Dropping blocked event. appId"

    .line 143
    .line 144
    invoke-virtual {v0, v2, v5, v3}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1}, Lmp3;->e0()Lvi3;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    const-string v2, "measurement.upload.blacklist_internal"

    .line 152
    .line 153
    invoke-virtual {v0, v13, v2}, Lvi3;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    const-string v2, "1"

    .line 158
    .line 159
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-nez v0, :cond_2

    .line 164
    .line 165
    invoke-virtual {v1}, Lmp3;->e0()Lvi3;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    const-string v3, "measurement.upload.blacklist_public"

    .line 170
    .line 171
    invoke-virtual {v0, v13, v3}, Lvi3;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-eqz v0, :cond_3

    .line 180
    .line 181
    :cond_2
    move-object v12, v13

    .line 182
    goto :goto_0

    .line 183
    :cond_3
    invoke-virtual {v14, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-nez v0, :cond_4

    .line 188
    .line 189
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 190
    .line 191
    .line 192
    const-string v27, "_ev"

    .line 193
    .line 194
    const/16 v29, 0x0

    .line 195
    .line 196
    const/16 v26, 0xb

    .line 197
    .line 198
    move-object/from16 v28, v12

    .line 199
    .line 200
    move-object/from16 v25, v13

    .line 201
    .line 202
    invoke-static/range {v24 .. v29}, Lup3;->P(Lac3;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :goto_0
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v0, v12}, Lae3;->D0(Ljava/lang/String;)Ldi3;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    if-eqz v0, :cond_4

    .line 215
    .line 216
    iget-object v2, v0, Ldi3;->a:Lij3;

    .line 217
    .line 218
    iget-object v3, v2, Lij3;->i:Lbj3;

    .line 219
    .line 220
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v3}, Lbj3;->y()V

    .line 224
    .line 225
    .line 226
    iget-wide v5, v0, Ldi3;->S:J

    .line 227
    .line 228
    iget-object v2, v2, Lij3;->i:Lbj3;

    .line 229
    .line 230
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2}, Lbj3;->y()V

    .line 234
    .line 235
    .line 236
    iget-wide v2, v0, Ldi3;->R:J

    .line 237
    .line 238
    invoke-static {v5, v6, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 239
    .line 240
    .line 241
    move-result-wide v2

    .line 242
    invoke-virtual {v1}, Lmp3;->f()Lxv;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    check-cast v5, Lxt0;

    .line 247
    .line 248
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 252
    .line 253
    .line 254
    move-result-wide v5

    .line 255
    sub-long/2addr v5, v2

    .line 256
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    .line 257
    .line 258
    .line 259
    move-result-wide v2

    .line 260
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 261
    .line 262
    .line 263
    sget-object v5, Lvg3;->N:Lug3;

    .line 264
    .line 265
    invoke-virtual {v5, v4}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    check-cast v4, Ljava/lang/Long;

    .line 270
    .line 271
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 272
    .line 273
    .line 274
    move-result-wide v4

    .line 275
    cmp-long v2, v2, v4

    .line 276
    .line 277
    if-lez v2, :cond_4

    .line 278
    .line 279
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    invoke-virtual {v2}, Luh3;->F()Lsh3;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    const-string v3, "Fetching config for blocked app"

    .line 288
    .line 289
    invoke-virtual {v2, v3}, Lsh3;->a(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1, v0}, Lmp3;->y(Ldi3;)V

    .line 293
    .line 294
    .line 295
    :cond_4
    :goto_1
    return-void

    .line 296
    :cond_5
    move-object v12, v13

    .line 297
    move-object/from16 v13, v24

    .line 298
    .line 299
    invoke-static/range {p1 .. p1}, Lwh3;->b(Lcom/google/android/gms/measurement/internal/zzbg;)Lwh3;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    move-object/from16 v31, v13

    .line 308
    .line 309
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 310
    .line 311
    .line 312
    move-result-object v13

    .line 313
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    move-object/from16 v48, v3

    .line 317
    .line 318
    sget-object v3, Lvg3;->X:Lug3;

    .line 319
    .line 320
    invoke-virtual {v13, v12, v3}, Lpd3;->H(Ljava/lang/String;Lug3;)I

    .line 321
    .line 322
    .line 323
    move-result v3

    .line 324
    const/16 v13, 0x64

    .line 325
    .line 326
    invoke-static {v3, v13}, Ljava/lang/Math;->min(II)I

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    const/16 v13, 0x19

    .line 331
    .line 332
    invoke-static {v3, v13}, Ljava/lang/Math;->max(II)I

    .line 333
    .line 334
    .line 335
    move-result v3

    .line 336
    invoke-virtual {v4, v0, v3}, Lup3;->I(Lwh3;I)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    sget-object v4, Lvg3;->g0:Lug3;

    .line 344
    .line 345
    const/16 v13, 0x23

    .line 346
    .line 347
    invoke-virtual {v3, v12, v4}, Lpd3;->H(Ljava/lang/String;Lug3;)I

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    invoke-static {v3, v13}, Ljava/lang/Math;->min(II)I

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    const/16 v4, 0xa

    .line 356
    .line 357
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    iget-object v4, v0, Lwh3;->e:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v4, Landroid/os/Bundle;

    .line 364
    .line 365
    new-instance v13, Ljava/util/TreeSet;

    .line 366
    .line 367
    move-wide/from16 v49, v9

    .line 368
    .line 369
    invoke-virtual {v4}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 370
    .line 371
    .line 372
    move-result-object v9

    .line 373
    invoke-direct {v13, v9}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v13}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 377
    .line 378
    .line 379
    move-result-object v9

    .line 380
    :cond_6
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 381
    .line 382
    .line 383
    move-result v10

    .line 384
    if-eqz v10, :cond_7

    .line 385
    .line 386
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v10

    .line 390
    check-cast v10, Ljava/lang/String;

    .line 391
    .line 392
    const-string v13, "items"

    .line 393
    .line 394
    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move-result v13

    .line 398
    if-eqz v13, :cond_6

    .line 399
    .line 400
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 401
    .line 402
    .line 403
    move-result-object v13

    .line 404
    invoke-virtual {v4, v10}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    .line 405
    .line 406
    .line 407
    move-result-object v10

    .line 408
    invoke-virtual {v13, v10, v3}, Lup3;->J([Landroid/os/Parcelable;I)V

    .line 409
    .line 410
    .line 411
    goto :goto_2

    .line 412
    :cond_7
    invoke-virtual {v0}, Lwh3;->c()Lcom/google/android/gms/measurement/internal/zzbg;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    iget-object v4, v3, Lcom/google/android/gms/measurement/internal/zzbg;->b:Lcom/google/android/gms/measurement/internal/zzbe;

    .line 417
    .line 418
    iget-object v9, v3, Lcom/google/android/gms/measurement/internal/zzbg;->a:Ljava/lang/String;

    .line 419
    .line 420
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-virtual {v0}, Luh3;->J()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    const/4 v10, 0x2

    .line 429
    invoke-static {v0, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 430
    .line 431
    .line 432
    move-result v0

    .line 433
    if-eqz v0, :cond_8

    .line 434
    .line 435
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    invoke-virtual {v0}, Luh3;->G()Lsh3;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-virtual/range {v48 .. v48}, Lij3;->m()Lmh3;

    .line 444
    .line 445
    .line 446
    move-result-object v10

    .line 447
    invoke-virtual {v10, v3}, Lmh3;->d(Lcom/google/android/gms/measurement/internal/zzbg;)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v10

    .line 451
    const-string v13, "Logging event"

    .line 452
    .line 453
    invoke-virtual {v0, v10, v13}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    :cond_8
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    invoke-virtual {v0}, Lae3;->n0()V

    .line 461
    .line 462
    .line 463
    :try_start_0
    invoke-virtual {v1, v2}, Lmp3;->a0(Lcom/google/android/gms/measurement/internal/zzr;)Ldi3;

    .line 464
    .line 465
    .line 466
    const-string v0, "ecommerce_purchase"

    .line 467
    .line 468
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 472
    const-string v10, "refund"

    .line 473
    .line 474
    if-nez v0, :cond_9

    .line 475
    .line 476
    :try_start_1
    const-string v0, "purchase"

    .line 477
    .line 478
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    move-result v0

    .line 482
    if-nez v0, :cond_9

    .line 483
    .line 484
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    move-result v0

    .line 488
    if-eqz v0, :cond_a

    .line 489
    .line 490
    :cond_9
    const/4 v0, 0x1

    .line 491
    goto :goto_3

    .line 492
    :cond_a
    const/4 v0, 0x0

    .line 493
    goto :goto_3

    .line 494
    :catchall_0
    move-exception v0

    .line 495
    move-object v5, v1

    .line 496
    goto/16 :goto_36

    .line 497
    .line 498
    :goto_3
    const-string v13, "_iap"

    .line 499
    .line 500
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    move-result v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 504
    move/from16 v24, v13

    .line 505
    .line 506
    const-string v13, "value"

    .line 507
    .line 508
    if-nez v24, :cond_b

    .line 509
    .line 510
    if-eqz v0, :cond_c

    .line 511
    .line 512
    const/4 v0, 0x1

    .line 513
    :cond_b
    move-object/from16 v51, v11

    .line 514
    .line 515
    goto :goto_5

    .line 516
    :cond_c
    move-object/from16 v53, v5

    .line 517
    .line 518
    move-object/from16 v54, v6

    .line 519
    .line 520
    move-object/from16 v51, v11

    .line 521
    .line 522
    move-object/from16 v25, v12

    .line 523
    .line 524
    move-object/from16 v52, v15

    .line 525
    .line 526
    :cond_d
    :goto_4
    move-object/from16 v5, v31

    .line 527
    .line 528
    goto/16 :goto_c

    .line 529
    .line 530
    :goto_5
    :try_start_2
    const-string v11, "_ltv_"

    .line 531
    .line 532
    move-object/from16 v52, v15

    .line 533
    .line 534
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzbe;->F1()Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v15
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 538
    move-object/from16 v53, v5

    .line 539
    .line 540
    iget-object v5, v4, Lcom/google/android/gms/measurement/internal/zzbe;->a:Landroid/os/Bundle;

    .line 541
    .line 542
    if-eqz v0, :cond_10

    .line 543
    .line 544
    :try_start_3
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzbe;->E1()Ljava/lang/Double;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 549
    .line 550
    .line 551
    move-result-wide v24

    .line 552
    const-wide v26, 0x412e848000000000L    # 1000000.0

    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    mul-double v24, v24, v26

    .line 558
    .line 559
    const-wide/16 v28, 0x0

    .line 560
    .line 561
    cmpl-double v0, v24, v28

    .line 562
    .line 563
    if-nez v0, :cond_e

    .line 564
    .line 565
    move-object/from16 v54, v6

    .line 566
    .line 567
    invoke-virtual {v5, v13}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 568
    .line 569
    .line 570
    move-result-wide v5

    .line 571
    long-to-double v5, v5

    .line 572
    mul-double v24, v5, v26

    .line 573
    .line 574
    goto :goto_6

    .line 575
    :cond_e
    move-object/from16 v54, v6

    .line 576
    .line 577
    :goto_6
    const-wide/high16 v5, 0x43e0000000000000L    # 9.223372036854776E18

    .line 578
    .line 579
    cmpg-double v0, v24, v5

    .line 580
    .line 581
    if-gtz v0, :cond_f

    .line 582
    .line 583
    const-wide/high16 v5, -0x3c20000000000000L    # -9.223372036854776E18

    .line 584
    .line 585
    cmpl-double v0, v24, v5

    .line 586
    .line 587
    if-ltz v0, :cond_f

    .line 588
    .line 589
    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->round(D)J

    .line 590
    .line 591
    .line 592
    move-result-wide v5

    .line 593
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    move-result v0

    .line 597
    if-eqz v0, :cond_11

    .line 598
    .line 599
    neg-long v5, v5

    .line 600
    goto :goto_7

    .line 601
    :cond_f
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    invoke-virtual {v0}, Luh3;->E()Lsh3;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    const-string v2, "Data lost. Currency value is too big. appId"

    .line 610
    .line 611
    invoke-static {v12}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 612
    .line 613
    .line 614
    move-result-object v3

    .line 615
    invoke-static/range {v24 .. v25}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 616
    .line 617
    .line 618
    move-result-object v4

    .line 619
    invoke-virtual {v0, v3, v2, v4}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 620
    .line 621
    .line 622
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    invoke-virtual {v0}, Lae3;->o0()V

    .line 627
    .line 628
    .line 629
    goto/16 :goto_10

    .line 630
    .line 631
    :cond_10
    move-object/from16 v54, v6

    .line 632
    .line 633
    invoke-virtual {v5, v13}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 634
    .line 635
    .line 636
    move-result-wide v5

    .line 637
    :cond_11
    :goto_7
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 638
    .line 639
    .line 640
    move-result v0

    .line 641
    if-nez v0, :cond_14

    .line 642
    .line 643
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 644
    .line 645
    invoke-virtual {v15, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    const-string v10, "[A-Z]{3}"

    .line 650
    .line 651
    invoke-virtual {v0, v10}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 652
    .line 653
    .line 654
    move-result v10

    .line 655
    if-eqz v10, :cond_14

    .line 656
    .line 657
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v10

    .line 661
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    invoke-virtual {v0, v12, v10}, Lae3;->v0(Ljava/lang/String;Ljava/lang/String;)Lrp3;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    if-eqz v0, :cond_12

    .line 670
    .line 671
    iget-object v0, v0, Lrp3;->e:Ljava/lang/Object;

    .line 672
    .line 673
    instance-of v11, v0, Ljava/lang/Long;

    .line 674
    .line 675
    if-nez v11, :cond_13

    .line 676
    .line 677
    :cond_12
    move-object/from16 v27, v10

    .line 678
    .line 679
    goto :goto_9

    .line 680
    :cond_13
    check-cast v0, Ljava/lang/Long;

    .line 681
    .line 682
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 683
    .line 684
    .line 685
    move-result-wide v24

    .line 686
    move-wide/from16 v25, v24

    .line 687
    .line 688
    new-instance v24, Lrp3;

    .line 689
    .line 690
    iget-object v0, v3, Lcom/google/android/gms/measurement/internal/zzbg;->c:Ljava/lang/String;

    .line 691
    .line 692
    invoke-virtual {v1}, Lmp3;->f()Lxv;

    .line 693
    .line 694
    .line 695
    move-result-object v11

    .line 696
    check-cast v11, Lxt0;

    .line 697
    .line 698
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 699
    .line 700
    .line 701
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 702
    .line 703
    .line 704
    move-result-wide v28

    .line 705
    add-long v5, v25, v5

    .line 706
    .line 707
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 708
    .line 709
    .line 710
    move-result-object v30

    .line 711
    move-object/from16 v26, v0

    .line 712
    .line 713
    move-object/from16 v27, v10

    .line 714
    .line 715
    move-object/from16 v25, v12

    .line 716
    .line 717
    invoke-direct/range {v24 .. v30}, Lrp3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 718
    .line 719
    .line 720
    move-object/from16 v12, v25

    .line 721
    .line 722
    move-object/from16 v25, v12

    .line 723
    .line 724
    :goto_8
    move-object/from16 v0, v24

    .line 725
    .line 726
    goto :goto_b

    .line 727
    :goto_9
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 728
    .line 729
    .line 730
    move-result-object v10

    .line 731
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    sget-object v11, Lvg3;->T:Lug3;

    .line 736
    .line 737
    invoke-virtual {v0, v12, v11}, Lpd3;->H(Ljava/lang/String;Lug3;)I

    .line 738
    .line 739
    .line 740
    move-result v0

    .line 741
    add-int/lit8 v0, v0, -0x1

    .line 742
    .line 743
    invoke-static {v12}, Lkb1;->k(Ljava/lang/String;)V

    .line 744
    .line 745
    .line 746
    invoke-virtual {v10}, Lsq3;->y()V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v10}, Lwo3;->A()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 750
    .line 751
    .line 752
    :try_start_4
    invoke-virtual {v10}, Lae3;->q0()Landroid/database/sqlite/SQLiteDatabase;

    .line 753
    .line 754
    .line 755
    move-result-object v11

    .line 756
    const-string v15, "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like \'!_ltv!_%\' escape \'!\'order by set_timestamp desc limit ?,10);"

    .line 757
    .line 758
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    filled-new-array {v12, v12, v0}, [Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object v0

    .line 766
    invoke-virtual {v11, v15, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 767
    .line 768
    .line 769
    goto :goto_a

    .line 770
    :catch_0
    move-exception v0

    .line 771
    :try_start_5
    iget-object v10, v10, Lsq3;->a:Ljava/lang/Object;

    .line 772
    .line 773
    check-cast v10, Lij3;

    .line 774
    .line 775
    invoke-virtual {v10}, Lij3;->a()Luh3;

    .line 776
    .line 777
    .line 778
    move-result-object v10

    .line 779
    invoke-virtual {v10}, Luh3;->D()Lsh3;

    .line 780
    .line 781
    .line 782
    move-result-object v10

    .line 783
    const-string v11, "Error pruning currencies. appId"

    .line 784
    .line 785
    invoke-static {v12}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 786
    .line 787
    .line 788
    move-result-object v15

    .line 789
    invoke-virtual {v10, v15, v11, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 790
    .line 791
    .line 792
    :goto_a
    new-instance v24, Lrp3;

    .line 793
    .line 794
    iget-object v0, v3, Lcom/google/android/gms/measurement/internal/zzbg;->c:Ljava/lang/String;

    .line 795
    .line 796
    invoke-virtual {v1}, Lmp3;->f()Lxv;

    .line 797
    .line 798
    .line 799
    move-result-object v10

    .line 800
    check-cast v10, Lxt0;

    .line 801
    .line 802
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 803
    .line 804
    .line 805
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 806
    .line 807
    .line 808
    move-result-wide v28

    .line 809
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 810
    .line 811
    .line 812
    move-result-object v30

    .line 813
    move-object/from16 v26, v0

    .line 814
    .line 815
    move-object/from16 v25, v12

    .line 816
    .line 817
    invoke-direct/range {v24 .. v30}, Lrp3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 818
    .line 819
    .line 820
    goto :goto_8

    .line 821
    :goto_b
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 822
    .line 823
    .line 824
    move-result-object v5

    .line 825
    invoke-virtual {v5, v0}, Lae3;->u0(Lrp3;)Z

    .line 826
    .line 827
    .line 828
    move-result v5

    .line 829
    if-nez v5, :cond_d

    .line 830
    .line 831
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 832
    .line 833
    .line 834
    move-result-object v5

    .line 835
    invoke-virtual {v5}, Luh3;->D()Lsh3;

    .line 836
    .line 837
    .line 838
    move-result-object v5

    .line 839
    const-string v6, "Too many unique user properties are set. Ignoring user property. appId"

    .line 840
    .line 841
    invoke-static/range {v25 .. v25}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 842
    .line 843
    .line 844
    move-result-object v10

    .line 845
    invoke-virtual/range {v48 .. v48}, Lij3;->m()Lmh3;

    .line 846
    .line 847
    .line 848
    move-result-object v11

    .line 849
    iget-object v12, v0, Lrp3;->c:Ljava/lang/String;

    .line 850
    .line 851
    invoke-virtual {v11, v12}, Lmh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    move-result-object v11

    .line 855
    iget-object v0, v0, Lrp3;->e:Ljava/lang/Object;

    .line 856
    .line 857
    invoke-virtual {v5, v6, v10, v11, v0}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 858
    .line 859
    .line 860
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 861
    .line 862
    .line 863
    const/16 v28, 0x0

    .line 864
    .line 865
    const/16 v29, 0x0

    .line 866
    .line 867
    const/16 v26, 0x9

    .line 868
    .line 869
    const/16 v27, 0x0

    .line 870
    .line 871
    move-object/from16 v24, v31

    .line 872
    .line 873
    invoke-static/range {v24 .. v29}, Lup3;->P(Lac3;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 874
    .line 875
    .line 876
    move-object/from16 v5, v24

    .line 877
    .line 878
    goto :goto_c

    .line 879
    :cond_14
    move-object/from16 v25, v12

    .line 880
    .line 881
    goto/16 :goto_4

    .line 882
    .line 883
    :goto_c
    invoke-static {v9}, Lup3;->x0(Ljava/lang/String;)Z

    .line 884
    .line 885
    .line 886
    move-result v31

    .line 887
    invoke-virtual {v14, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 888
    .line 889
    .line 890
    move-result v33

    .line 891
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 892
    .line 893
    .line 894
    if-nez v4, :cond_16

    .line 895
    .line 896
    const-wide/16 v14, 0x0

    .line 897
    .line 898
    :cond_15
    const-wide/16 v55, 0x0

    .line 899
    .line 900
    goto :goto_e

    .line 901
    :cond_16
    iget-object v0, v4, Lcom/google/android/gms/measurement/internal/zzbe;->a:Landroid/os/Bundle;

    .line 902
    .line 903
    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 904
    .line 905
    .line 906
    move-result-object v0

    .line 907
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 908
    .line 909
    .line 910
    move-result-object v0

    .line 911
    const-wide/16 v14, 0x0

    .line 912
    .line 913
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 914
    .line 915
    .line 916
    move-result v6

    .line 917
    if-eqz v6, :cond_15

    .line 918
    .line 919
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 920
    .line 921
    .line 922
    move-result-object v6

    .line 923
    check-cast v6, Ljava/lang/String;

    .line 924
    .line 925
    invoke-virtual {v4, v6}, Lcom/google/android/gms/measurement/internal/zzbe;->D1(Ljava/lang/String;)Ljava/lang/Object;

    .line 926
    .line 927
    .line 928
    move-result-object v6

    .line 929
    instance-of v12, v6, [Landroid/os/Parcelable;

    .line 930
    .line 931
    if-eqz v12, :cond_17

    .line 932
    .line 933
    check-cast v6, [Landroid/os/Parcelable;

    .line 934
    .line 935
    array-length v6, v6

    .line 936
    const-wide/16 v55, 0x0

    .line 937
    .line 938
    int-to-long v10, v6

    .line 939
    add-long/2addr v14, v10

    .line 940
    goto :goto_d

    .line 941
    :cond_17
    const-wide/16 v55, 0x0

    .line 942
    .line 943
    goto :goto_d

    .line 944
    :goto_e
    const-wide/16 v10, 0x1

    .line 945
    .line 946
    add-long v28, v14, v10

    .line 947
    .line 948
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 949
    .line 950
    .line 951
    move-result-object v24

    .line 952
    move-object/from16 v27, v25

    .line 953
    .line 954
    invoke-virtual {v1}, Lmp3;->g()J

    .line 955
    .line 956
    .line 957
    move-result-wide v25

    .line 958
    const/16 v35, 0x0

    .line 959
    .line 960
    const/16 v36, 0x0

    .line 961
    .line 962
    const/16 v30, 0x1

    .line 963
    .line 964
    const/16 v32, 0x0

    .line 965
    .line 966
    const/16 v34, 0x0

    .line 967
    .line 968
    invoke-virtual/range {v24 .. v36}, Lae3;->G0(JLjava/lang/String;JZZZZZZZ)Lud3;

    .line 969
    .line 970
    .line 971
    move-result-object v0

    .line 972
    move-object/from16 v25, v27

    .line 973
    .line 974
    move/from16 v6, v31

    .line 975
    .line 976
    iget-wide v14, v0, Lud3;->b:J

    .line 977
    .line 978
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 979
    .line 980
    .line 981
    sget-object v12, Lvg3;->l:Lug3;

    .line 982
    .line 983
    move-wide/from16 v57, v10

    .line 984
    .line 985
    const/4 v10, 0x0

    .line 986
    invoke-virtual {v12, v10}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object v11

    .line 990
    check-cast v11, Ljava/lang/Integer;

    .line 991
    .line 992
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 993
    .line 994
    .line 995
    move-result v10

    .line 996
    int-to-long v10, v10

    .line 997
    sub-long/2addr v14, v10

    .line 998
    cmp-long v10, v14, v55

    .line 999
    .line 1000
    const-wide/16 v11, 0x3e8

    .line 1001
    .line 1002
    if-lez v10, :cond_19

    .line 1003
    .line 1004
    rem-long/2addr v14, v11

    .line 1005
    cmp-long v2, v14, v57

    .line 1006
    .line 1007
    if-nez v2, :cond_18

    .line 1008
    .line 1009
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v2

    .line 1013
    invoke-virtual {v2}, Luh3;->D()Lsh3;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v2

    .line 1017
    const-string v3, "Data loss. Too many events logged. appId, count"

    .line 1018
    .line 1019
    invoke-static/range {v25 .. v25}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v4

    .line 1023
    iget-wide v5, v0, Lud3;->b:J

    .line 1024
    .line 1025
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v0

    .line 1029
    invoke-virtual {v2, v4, v3, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1030
    .line 1031
    .line 1032
    :cond_18
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v0

    .line 1036
    invoke-virtual {v0}, Lae3;->o0()V

    .line 1037
    .line 1038
    .line 1039
    goto/16 :goto_10

    .line 1040
    .line 1041
    :cond_19
    if-eqz v6, :cond_1b

    .line 1042
    .line 1043
    iget-wide v14, v0, Lud3;->a:J

    .line 1044
    .line 1045
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 1046
    .line 1047
    .line 1048
    sget-object v10, Lvg3;->n:Lug3;

    .line 1049
    .line 1050
    move-wide/from16 v26, v11

    .line 1051
    .line 1052
    const/4 v11, 0x0

    .line 1053
    invoke-virtual {v10, v11}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v10

    .line 1057
    check-cast v10, Ljava/lang/Integer;

    .line 1058
    .line 1059
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 1060
    .line 1061
    .line 1062
    move-result v10

    .line 1063
    int-to-long v10, v10

    .line 1064
    sub-long/2addr v14, v10

    .line 1065
    cmp-long v10, v14, v55

    .line 1066
    .line 1067
    if-lez v10, :cond_1b

    .line 1068
    .line 1069
    rem-long v14, v14, v26

    .line 1070
    .line 1071
    cmp-long v2, v14, v57

    .line 1072
    .line 1073
    if-nez v2, :cond_1a

    .line 1074
    .line 1075
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v2

    .line 1079
    invoke-virtual {v2}, Luh3;->D()Lsh3;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v2

    .line 1083
    const-string v4, "Data loss. Too many public events logged. appId, count"

    .line 1084
    .line 1085
    invoke-static/range {v25 .. v25}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v6

    .line 1089
    iget-wide v7, v0, Lud3;->a:J

    .line 1090
    .line 1091
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v0

    .line 1095
    invoke-virtual {v2, v6, v4, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1096
    .line 1097
    .line 1098
    :cond_1a
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 1099
    .line 1100
    .line 1101
    const-string v27, "_ev"

    .line 1102
    .line 1103
    iget-object v0, v3, Lcom/google/android/gms/measurement/internal/zzbg;->a:Ljava/lang/String;

    .line 1104
    .line 1105
    const/16 v29, 0x0

    .line 1106
    .line 1107
    const/16 v26, 0x10

    .line 1108
    .line 1109
    move-object/from16 v28, v0

    .line 1110
    .line 1111
    move-object/from16 v24, v5

    .line 1112
    .line 1113
    invoke-static/range {v24 .. v29}, Lup3;->P(Lac3;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v0

    .line 1120
    invoke-virtual {v0}, Lae3;->o0()V

    .line 1121
    .line 1122
    .line 1123
    goto/16 :goto_10

    .line 1124
    .line 1125
    :cond_1b
    move-object/from16 v12, v25

    .line 1126
    .line 1127
    if-eqz v33, :cond_1d

    .line 1128
    .line 1129
    iget-wide v14, v0, Lud3;->d:J

    .line 1130
    .line 1131
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v11

    .line 1135
    sget-object v10, Lvg3;->m:Lug3;

    .line 1136
    .line 1137
    invoke-virtual {v11, v12, v10}, Lpd3;->H(Ljava/lang/String;Lug3;)I

    .line 1138
    .line 1139
    .line 1140
    move-result v10

    .line 1141
    const v11, 0xf4240

    .line 1142
    .line 1143
    .line 1144
    invoke-static {v11, v10}, Ljava/lang/Math;->min(II)I

    .line 1145
    .line 1146
    .line 1147
    move-result v10

    .line 1148
    const/4 v11, 0x0

    .line 1149
    invoke-static {v11, v10}, Ljava/lang/Math;->max(II)I

    .line 1150
    .line 1151
    .line 1152
    move-result v10

    .line 1153
    int-to-long v10, v10

    .line 1154
    sub-long/2addr v14, v10

    .line 1155
    cmp-long v10, v14, v55

    .line 1156
    .line 1157
    if-lez v10, :cond_1d

    .line 1158
    .line 1159
    cmp-long v2, v14, v57

    .line 1160
    .line 1161
    if-nez v2, :cond_1c

    .line 1162
    .line 1163
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v2

    .line 1167
    invoke-virtual {v2}, Luh3;->D()Lsh3;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v2

    .line 1171
    const-string v3, "Too many error events logged. appId, count"

    .line 1172
    .line 1173
    invoke-static {v12}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v4

    .line 1177
    iget-wide v5, v0, Lud3;->d:J

    .line 1178
    .line 1179
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v0

    .line 1183
    invoke-virtual {v2, v4, v3, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1184
    .line 1185
    .line 1186
    :cond_1c
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v0

    .line 1190
    invoke-virtual {v0}, Lae3;->o0()V

    .line 1191
    .line 1192
    .line 1193
    goto/16 :goto_10

    .line 1194
    .line 1195
    :cond_1d
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzbe;->G1()Landroid/os/Bundle;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v4

    .line 1199
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v0

    .line 1203
    const-string v10, "_o"

    .line 1204
    .line 1205
    iget-object v11, v3, Lcom/google/android/gms/measurement/internal/zzbg;->c:Ljava/lang/String;

    .line 1206
    .line 1207
    invoke-virtual {v0, v11, v10, v4}, Lup3;->O(Ljava/lang/Object;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1208
    .line 1209
    .line 1210
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v0

    .line 1214
    iget-object v10, v2, Lcom/google/android/gms/measurement/internal/zzr;->m0:Ljava/lang/String;

    .line 1215
    .line 1216
    invoke-virtual {v0, v12, v10}, Lup3;->Z(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1217
    .line 1218
    .line 1219
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 1220
    const-string v10, "_r"

    .line 1221
    .line 1222
    if-eqz v0, :cond_1e

    .line 1223
    .line 1224
    :try_start_6
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v0

    .line 1228
    const-string v14, "_dbg"

    .line 1229
    .line 1230
    invoke-static/range {v57 .. v58}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v15

    .line 1234
    invoke-virtual {v0, v15, v14, v4}, Lup3;->O(Ljava/lang/Object;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1235
    .line 1236
    .line 1237
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v0

    .line 1241
    invoke-virtual {v0, v15, v10, v4}, Lup3;->O(Ljava/lang/Object;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1242
    .line 1243
    .line 1244
    :cond_1e
    const-string v0, "_s"

    .line 1245
    .line 1246
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1247
    .line 1248
    .line 1249
    move-result v0

    .line 1250
    if-eqz v0, :cond_1f

    .line 1251
    .line 1252
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v0

    .line 1256
    invoke-virtual {v0, v12, v8}, Lae3;->v0(Ljava/lang/String;Ljava/lang/String;)Lrp3;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v0

    .line 1260
    if-eqz v0, :cond_1f

    .line 1261
    .line 1262
    iget-object v0, v0, Lrp3;->e:Ljava/lang/Object;

    .line 1263
    .line 1264
    instance-of v14, v0, Ljava/lang/Long;

    .line 1265
    .line 1266
    if-eqz v14, :cond_1f

    .line 1267
    .line 1268
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v14

    .line 1272
    invoke-virtual {v14, v0, v8, v4}, Lup3;->O(Ljava/lang/Object;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1273
    .line 1274
    .line 1275
    :cond_1f
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v0

    .line 1279
    sget-object v8, Lvg3;->X0:Lug3;

    .line 1280
    .line 1281
    const/4 v14, 0x0

    .line 1282
    invoke-virtual {v0, v14, v8}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 1283
    .line 1284
    .line 1285
    move-result v0

    .line 1286
    if-eqz v0, :cond_20

    .line 1287
    .line 1288
    const-string v0, "am"

    .line 1289
    .line 1290
    invoke-static {v11, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1291
    .line 1292
    .line 1293
    move-result v0

    .line 1294
    if-eqz v0, :cond_20

    .line 1295
    .line 1296
    const-string v0, "_ai"

    .line 1297
    .line 1298
    invoke-virtual {v9, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1299
    .line 1300
    .line 1301
    move-result v0

    .line 1302
    if-eqz v0, :cond_20

    .line 1303
    .line 1304
    invoke-virtual {v4, v13}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v0

    .line 1308
    instance-of v8, v0, Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 1309
    .line 1310
    if-eqz v8, :cond_20

    .line 1311
    .line 1312
    :try_start_7
    check-cast v0, Ljava/lang/String;

    .line 1313
    .line 1314
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 1315
    .line 1316
    .line 1317
    move-result-wide v8

    .line 1318
    invoke-virtual {v4, v13}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 1319
    .line 1320
    .line 1321
    invoke-virtual {v4, v13, v8, v9}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 1322
    .line 1323
    .line 1324
    :catch_1
    :cond_20
    :try_start_8
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v8

    .line 1328
    invoke-static {v12}, Lkb1;->k(Ljava/lang/String;)V

    .line 1329
    .line 1330
    .line 1331
    invoke-virtual {v8}, Lsq3;->y()V

    .line 1332
    .line 1333
    .line 1334
    invoke-virtual {v8}, Lwo3;->A()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 1335
    .line 1336
    .line 1337
    :try_start_9
    invoke-virtual {v8}, Lae3;->q0()Landroid/database/sqlite/SQLiteDatabase;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v0

    .line 1341
    iget-object v9, v8, Lsq3;->a:Ljava/lang/Object;

    .line 1342
    .line 1343
    check-cast v9, Lij3;

    .line 1344
    .line 1345
    iget-object v9, v9, Lij3;->d:Lpd3;

    .line 1346
    .line 1347
    sget-object v11, Lvg3;->q:Lug3;

    .line 1348
    .line 1349
    invoke-virtual {v9, v12, v11}, Lpd3;->H(Ljava/lang/String;Lug3;)I

    .line 1350
    .line 1351
    .line 1352
    move-result v9

    .line 1353
    const v11, 0xf4240

    .line 1354
    .line 1355
    .line 1356
    invoke-static {v11, v9}, Ljava/lang/Math;->min(II)I

    .line 1357
    .line 1358
    .line 1359
    move-result v9

    .line 1360
    const/4 v11, 0x0

    .line 1361
    invoke-static {v11, v9}, Ljava/lang/Math;->max(II)I

    .line 1362
    .line 1363
    .line 1364
    move-result v9

    .line 1365
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v9

    .line 1369
    const-string v11, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"

    .line 1370
    .line 1371
    filled-new-array {v12, v9}, [Ljava/lang/String;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v9

    .line 1375
    invoke-virtual {v0, v7, v11, v9}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 1376
    .line 1377
    .line 1378
    move-result v0
    :try_end_9
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 1379
    int-to-long v8, v0

    .line 1380
    goto :goto_f

    .line 1381
    :catch_2
    move-exception v0

    .line 1382
    :try_start_a
    iget-object v8, v8, Lsq3;->a:Ljava/lang/Object;

    .line 1383
    .line 1384
    check-cast v8, Lij3;

    .line 1385
    .line 1386
    invoke-virtual {v8}, Lij3;->a()Luh3;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v8

    .line 1390
    invoke-virtual {v8}, Luh3;->D()Lsh3;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v8

    .line 1394
    const-string v9, "Error deleting over the limit events. appId"

    .line 1395
    .line 1396
    invoke-static {v12}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v11

    .line 1400
    invoke-virtual {v8, v11, v9, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1401
    .line 1402
    .line 1403
    move-wide/from16 v8, v55

    .line 1404
    .line 1405
    :goto_f
    cmp-long v0, v8, v55

    .line 1406
    .line 1407
    if-lez v0, :cond_21

    .line 1408
    .line 1409
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v0

    .line 1413
    invoke-virtual {v0}, Luh3;->E()Lsh3;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v0

    .line 1417
    const-string v11, "Data lost. Too many events stored on disk, deleted. appId"

    .line 1418
    .line 1419
    invoke-static {v12}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v13

    .line 1423
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v8

    .line 1427
    invoke-virtual {v0, v13, v11, v8}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1428
    .line 1429
    .line 1430
    :cond_21
    new-instance v24, Loe3;

    .line 1431
    .line 1432
    iget-object v0, v1, Lmp3;->W:Lij3;

    .line 1433
    .line 1434
    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/zzbg;->c:Ljava/lang/String;

    .line 1435
    .line 1436
    iget-object v9, v3, Lcom/google/android/gms/measurement/internal/zzbg;->a:Ljava/lang/String;

    .line 1437
    .line 1438
    iget-wide v13, v3, Lcom/google/android/gms/measurement/internal/zzbg;->d:J

    .line 1439
    .line 1440
    const-wide/16 v31, 0x0

    .line 1441
    .line 1442
    move-object/from16 v25, v0

    .line 1443
    .line 1444
    move-object/from16 v33, v4

    .line 1445
    .line 1446
    move-object/from16 v26, v8

    .line 1447
    .line 1448
    move-object/from16 v28, v9

    .line 1449
    .line 1450
    move-object/from16 v27, v12

    .line 1451
    .line 1452
    move-wide/from16 v29, v13

    .line 1453
    .line 1454
    invoke-direct/range {v24 .. v33}, Loe3;-><init>(Lij3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    .line 1455
    .line 1456
    .line 1457
    move-object/from16 v0, v24

    .line 1458
    .line 1459
    move-object/from16 v3, v25

    .line 1460
    .line 1461
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v4

    .line 1465
    iget-object v8, v0, Loe3;->b:Ljava/lang/String;

    .line 1466
    .line 1467
    move-object/from16 v9, v54

    .line 1468
    .line 1469
    invoke-virtual {v4, v9, v12, v8}, Lae3;->Z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lpe3;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v4

    .line 1473
    if-nez v4, :cond_23

    .line 1474
    .line 1475
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v4

    .line 1479
    invoke-virtual {v4, v12}, Lae3;->R(Ljava/lang/String;)J

    .line 1480
    .line 1481
    .line 1482
    move-result-wide v13

    .line 1483
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v4

    .line 1487
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1488
    .line 1489
    .line 1490
    sget-object v11, Lvg3;->W:Lug3;

    .line 1491
    .line 1492
    invoke-virtual {v4, v12, v11}, Lpd3;->H(Ljava/lang/String;Lug3;)I

    .line 1493
    .line 1494
    .line 1495
    move-result v4

    .line 1496
    const/16 v15, 0x7d0

    .line 1497
    .line 1498
    invoke-static {v4, v15}, Ljava/lang/Math;->min(II)I

    .line 1499
    .line 1500
    .line 1501
    move-result v4

    .line 1502
    const/16 v15, 0x1f4

    .line 1503
    .line 1504
    invoke-static {v4, v15}, Ljava/lang/Math;->max(II)I

    .line 1505
    .line 1506
    .line 1507
    move-result v4

    .line 1508
    move-object/from16 v31, v5

    .line 1509
    .line 1510
    int-to-long v4, v4

    .line 1511
    cmp-long v4, v13, v4

    .line 1512
    .line 1513
    if-ltz v4, :cond_22

    .line 1514
    .line 1515
    if-eqz v6, :cond_22

    .line 1516
    .line 1517
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v0

    .line 1521
    invoke-virtual {v0}, Luh3;->D()Lsh3;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v0

    .line 1525
    const-string v2, "Too many event names used, ignoring event. appId, name, supported count"

    .line 1526
    .line 1527
    invoke-static {v12}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v4

    .line 1531
    invoke-virtual {v3}, Lij3;->m()Lmh3;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v3

    .line 1535
    invoke-virtual {v3, v8}, Lmh3;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v3

    .line 1539
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v5

    .line 1543
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1544
    .line 1545
    .line 1546
    invoke-virtual {v5, v12, v11}, Lpd3;->H(Ljava/lang/String;Lug3;)I

    .line 1547
    .line 1548
    .line 1549
    move-result v5

    .line 1550
    const/16 v6, 0x7d0

    .line 1551
    .line 1552
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 1553
    .line 1554
    .line 1555
    move-result v5

    .line 1556
    invoke-static {v5, v15}, Ljava/lang/Math;->max(II)I

    .line 1557
    .line 1558
    .line 1559
    move-result v5

    .line 1560
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v5

    .line 1564
    invoke-virtual {v0, v2, v4, v3, v5}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1565
    .line 1566
    .line 1567
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 1568
    .line 1569
    .line 1570
    const/16 v28, 0x0

    .line 1571
    .line 1572
    const/16 v29, 0x0

    .line 1573
    .line 1574
    const/16 v26, 0x8

    .line 1575
    .line 1576
    const/16 v27, 0x0

    .line 1577
    .line 1578
    move-object/from16 v25, v12

    .line 1579
    .line 1580
    move-object/from16 v24, v31

    .line 1581
    .line 1582
    invoke-static/range {v24 .. v29}, Lup3;->P(Lac3;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 1583
    .line 1584
    .line 1585
    :goto_10
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v0

    .line 1589
    invoke-virtual {v0}, Lae3;->p0()V

    .line 1590
    .line 1591
    .line 1592
    return-void

    .line 1593
    :cond_22
    move-object/from16 v25, v12

    .line 1594
    .line 1595
    move-object/from16 v5, v31

    .line 1596
    .line 1597
    :try_start_b
    new-instance v24, Lpe3;

    .line 1598
    .line 1599
    iget-wide v3, v0, Loe3;->d:J

    .line 1600
    .line 1601
    const/16 v39, 0x0

    .line 1602
    .line 1603
    const/16 v40, 0x0

    .line 1604
    .line 1605
    const-wide/16 v27, 0x0

    .line 1606
    .line 1607
    const-wide/16 v29, 0x0

    .line 1608
    .line 1609
    const-wide/16 v31, 0x0

    .line 1610
    .line 1611
    const-wide/16 v35, 0x0

    .line 1612
    .line 1613
    const/16 v37, 0x0

    .line 1614
    .line 1615
    const/16 v38, 0x0

    .line 1616
    .line 1617
    move-wide/from16 v33, v3

    .line 1618
    .line 1619
    move-object/from16 v26, v8

    .line 1620
    .line 1621
    invoke-direct/range {v24 .. v40}, Lpe3;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 1622
    .line 1623
    .line 1624
    move-object/from16 v12, v25

    .line 1625
    .line 1626
    :goto_11
    move-object v3, v0

    .line 1627
    move-object/from16 v0, v24

    .line 1628
    .line 1629
    goto :goto_12

    .line 1630
    :cond_23
    iget-wide v13, v4, Lpe3;->f:J

    .line 1631
    .line 1632
    invoke-virtual {v0, v3, v13, v14}, Loe3;->a(Lij3;J)Loe3;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v0

    .line 1636
    iget-wide v13, v0, Loe3;->d:J

    .line 1637
    .line 1638
    invoke-virtual {v4, v13, v14}, Lpe3;->a(J)Lpe3;

    .line 1639
    .line 1640
    .line 1641
    move-result-object v24

    .line 1642
    goto :goto_11

    .line 1643
    :goto_12
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v4

    .line 1647
    invoke-virtual {v4, v9, v0}, Lae3;->a0(Ljava/lang/String;Lpe3;)V

    .line 1648
    .line 1649
    .line 1650
    invoke-virtual {v1}, Lmp3;->b()Lbj3;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v0

    .line 1654
    invoke-virtual {v0}, Lbj3;->y()V

    .line 1655
    .line 1656
    .line 1657
    invoke-virtual {v1}, Lmp3;->k0()V

    .line 1658
    .line 1659
    .line 1660
    iget-object v0, v3, Loe3;->a:Ljava/lang/String;

    .line 1661
    .line 1662
    invoke-static {v0}, Lkb1;->k(Ljava/lang/String;)V

    .line 1663
    .line 1664
    .line 1665
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1666
    .line 1667
    .line 1668
    move-result v0

    .line 1669
    invoke-static {v0}, Lkb1;->g(Z)V

    .line 1670
    .line 1671
    .line 1672
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzid;->zzaE()Lcom/google/android/gms/internal/measurement/zzic;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v4

    .line 1676
    const/4 v6, 0x1

    .line 1677
    invoke-virtual {v4, v6}, Lcom/google/android/gms/internal/measurement/zzic;->zza(I)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1678
    .line 1679
    .line 1680
    const-string v0, "android"

    .line 1681
    .line 1682
    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/measurement/zzic;->zzC(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1683
    .line 1684
    .line 1685
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1686
    .line 1687
    .line 1688
    move-result v0

    .line 1689
    if-nez v0, :cond_24

    .line 1690
    .line 1691
    invoke-virtual {v4, v12}, Lcom/google/android/gms/internal/measurement/zzic;->zzL(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1692
    .line 1693
    .line 1694
    :cond_24
    invoke-static/range {v53 .. v53}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1695
    .line 1696
    .line 1697
    move-result v0

    .line 1698
    if-nez v0, :cond_25

    .line 1699
    .line 1700
    move-object/from16 v8, v53

    .line 1701
    .line 1702
    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzJ(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1703
    .line 1704
    .line 1705
    goto :goto_13

    .line 1706
    :cond_25
    move-object/from16 v8, v53

    .line 1707
    .line 1708
    :goto_13
    invoke-static/range {v52 .. v52}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1709
    .line 1710
    .line 1711
    move-result v0

    .line 1712
    if-nez v0, :cond_26

    .line 1713
    .line 1714
    move-object/from16 v9, v52

    .line 1715
    .line 1716
    invoke-virtual {v4, v9}, Lcom/google/android/gms/internal/measurement/zzic;->zzM(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1717
    .line 1718
    .line 1719
    goto :goto_14

    .line 1720
    :cond_26
    move-object/from16 v9, v52

    .line 1721
    .line 1722
    :goto_14
    invoke-static/range {v51 .. v51}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1723
    .line 1724
    .line 1725
    move-result v0

    .line 1726
    if-nez v0, :cond_27

    .line 1727
    .line 1728
    move-object/from16 v11, v51

    .line 1729
    .line 1730
    invoke-virtual {v4, v11}, Lcom/google/android/gms/internal/measurement/zzic;->zzau(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1731
    .line 1732
    .line 1733
    goto :goto_15

    .line 1734
    :cond_27
    move-object/from16 v11, v51

    .line 1735
    .line 1736
    :goto_15
    const-wide/32 v13, -0x80000000

    .line 1737
    .line 1738
    .line 1739
    cmp-long v0, v49, v13

    .line 1740
    .line 1741
    if-eqz v0, :cond_28

    .line 1742
    .line 1743
    move-wide/from16 v13, v49

    .line 1744
    .line 1745
    long-to-int v0, v13

    .line 1746
    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/measurement/zzic;->zzaj(I)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1747
    .line 1748
    .line 1749
    :goto_16
    move-object v15, v7

    .line 1750
    move-wide/from16 v6, v46

    .line 1751
    .line 1752
    goto :goto_17

    .line 1753
    :cond_28
    move-wide/from16 v13, v49

    .line 1754
    .line 1755
    goto :goto_16

    .line 1756
    :goto_17
    invoke-virtual {v4, v6, v7}, Lcom/google/android/gms/internal/measurement/zzic;->zzN(J)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1757
    .line 1758
    .line 1759
    invoke-static/range {v45 .. v45}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1760
    .line 1761
    .line 1762
    move-result v0

    .line 1763
    if-nez v0, :cond_29

    .line 1764
    .line 1765
    move-object/from16 v24, v15

    .line 1766
    .line 1767
    move-object/from16 v15, v45

    .line 1768
    .line 1769
    invoke-virtual {v4, v15}, Lcom/google/android/gms/internal/measurement/zzic;->zzad(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1770
    .line 1771
    .line 1772
    goto :goto_18

    .line 1773
    :cond_29
    move-object/from16 v24, v15

    .line 1774
    .line 1775
    move-object/from16 v15, v45

    .line 1776
    .line 1777
    :goto_18
    invoke-static {v12}, Lkb1;->n(Ljava/lang/Object;)V

    .line 1778
    .line 1779
    .line 1780
    invoke-virtual {v1, v12}, Lmp3;->d(Ljava/lang/String;)Lok3;

    .line 1781
    .line 1782
    .line 1783
    move-result-object v0

    .line 1784
    move-wide/from16 v46, v6

    .line 1785
    .line 1786
    move-object/from16 v51, v11

    .line 1787
    .line 1788
    move-object/from16 v11, v44

    .line 1789
    .line 1790
    const/16 v6, 0x64

    .line 1791
    .line 1792
    invoke-static {v6, v11}, Lok3;->c(ILjava/lang/String;)Lok3;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v7

    .line 1796
    invoke-virtual {v0, v7}, Lok3;->j(Lok3;)Lok3;

    .line 1797
    .line 1798
    .line 1799
    move-result-object v0

    .line 1800
    invoke-virtual {v0}, Lok3;->f()Ljava/lang/String;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v6

    .line 1804
    invoke-virtual {v4, v6}, Lcom/google/android/gms/internal/measurement/zzic;->zzat(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1805
    .line 1806
    .line 1807
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzql;->zza()Z

    .line 1808
    .line 1809
    .line 1810
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v6

    .line 1814
    sget-object v7, Lvg3;->P0:Lug3;

    .line 1815
    .line 1816
    invoke-virtual {v6, v12, v7}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 1817
    .line 1818
    .line 1819
    move-result v6
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 1820
    sget-object v7, Lnk3;->b:Lnk3;

    .line 1821
    .line 1822
    if-eqz v6, :cond_34

    .line 1823
    .line 1824
    :try_start_c
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 1825
    .line 1826
    .line 1827
    invoke-static {v12}, Lup3;->V(Ljava/lang/String;)Z

    .line 1828
    .line 1829
    .line 1830
    move-result v6

    .line 1831
    if-eqz v6, :cond_34

    .line 1832
    .line 1833
    iget v6, v2, Lcom/google/android/gms/measurement/internal/zzr;->k0:I

    .line 1834
    .line 1835
    invoke-virtual {v4, v6}, Lcom/google/android/gms/internal/measurement/zzic;->zzaH(I)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1836
    .line 1837
    .line 1838
    move-wide/from16 v49, v13

    .line 1839
    .line 1840
    iget-wide v13, v2, Lcom/google/android/gms/measurement/internal/zzr;->l0:J

    .line 1841
    .line 1842
    invoke-virtual {v0, v7}, Lok3;->i(Lnk3;)Z

    .line 1843
    .line 1844
    .line 1845
    move-result v0

    .line 1846
    const-wide/16 v25, 0x20

    .line 1847
    .line 1848
    if-nez v0, :cond_2a

    .line 1849
    .line 1850
    cmp-long v0, v13, v55

    .line 1851
    .line 1852
    if-eqz v0, :cond_2a

    .line 1853
    .line 1854
    const-wide/16 v27, -0x2

    .line 1855
    .line 1856
    and-long v13, v13, v27

    .line 1857
    .line 1858
    or-long v13, v13, v25

    .line 1859
    .line 1860
    :cond_2a
    cmp-long v0, v13, v57

    .line 1861
    .line 1862
    if-nez v0, :cond_2b

    .line 1863
    .line 1864
    const/4 v0, 0x1

    .line 1865
    goto :goto_19

    .line 1866
    :cond_2b
    const/4 v0, 0x0

    .line 1867
    :goto_19
    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/measurement/zzic;->zzaz(Z)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1868
    .line 1869
    .line 1870
    cmp-long v0, v13, v55

    .line 1871
    .line 1872
    if-nez v0, :cond_2c

    .line 1873
    .line 1874
    goto/16 :goto_21

    .line 1875
    .line 1876
    :cond_2c
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzhe;->zzh()Lcom/google/android/gms/internal/measurement/zzhd;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v0

    .line 1880
    and-long v27, v13, v57

    .line 1881
    .line 1882
    cmp-long v6, v27, v55

    .line 1883
    .line 1884
    if-eqz v6, :cond_2d

    .line 1885
    .line 1886
    const/4 v6, 0x1

    .line 1887
    goto :goto_1a

    .line 1888
    :cond_2d
    const/4 v6, 0x0

    .line 1889
    :goto_1a
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/measurement/zzhd;->zza(Z)Lcom/google/android/gms/internal/measurement/zzhd;

    .line 1890
    .line 1891
    .line 1892
    const-wide/16 v27, 0x2

    .line 1893
    .line 1894
    and-long v27, v13, v27

    .line 1895
    .line 1896
    cmp-long v6, v27, v55

    .line 1897
    .line 1898
    if-eqz v6, :cond_2e

    .line 1899
    .line 1900
    const/4 v6, 0x1

    .line 1901
    goto :goto_1b

    .line 1902
    :cond_2e
    const/4 v6, 0x0

    .line 1903
    :goto_1b
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/measurement/zzhd;->zzb(Z)Lcom/google/android/gms/internal/measurement/zzhd;

    .line 1904
    .line 1905
    .line 1906
    const-wide/16 v27, 0x4

    .line 1907
    .line 1908
    and-long v27, v13, v27

    .line 1909
    .line 1910
    cmp-long v6, v27, v55

    .line 1911
    .line 1912
    if-eqz v6, :cond_2f

    .line 1913
    .line 1914
    const/4 v6, 0x1

    .line 1915
    goto :goto_1c

    .line 1916
    :cond_2f
    const/4 v6, 0x0

    .line 1917
    :goto_1c
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/measurement/zzhd;->zzc(Z)Lcom/google/android/gms/internal/measurement/zzhd;

    .line 1918
    .line 1919
    .line 1920
    const-wide/16 v27, 0x8

    .line 1921
    .line 1922
    and-long v27, v13, v27

    .line 1923
    .line 1924
    cmp-long v6, v27, v55

    .line 1925
    .line 1926
    if-eqz v6, :cond_30

    .line 1927
    .line 1928
    const/4 v6, 0x1

    .line 1929
    goto :goto_1d

    .line 1930
    :cond_30
    const/4 v6, 0x0

    .line 1931
    :goto_1d
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/measurement/zzhd;->zzd(Z)Lcom/google/android/gms/internal/measurement/zzhd;

    .line 1932
    .line 1933
    .line 1934
    const-wide/16 v27, 0x10

    .line 1935
    .line 1936
    and-long v27, v13, v27

    .line 1937
    .line 1938
    cmp-long v6, v27, v55

    .line 1939
    .line 1940
    if-eqz v6, :cond_31

    .line 1941
    .line 1942
    const/4 v6, 0x1

    .line 1943
    goto :goto_1e

    .line 1944
    :cond_31
    const/4 v6, 0x0

    .line 1945
    :goto_1e
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/measurement/zzhd;->zze(Z)Lcom/google/android/gms/internal/measurement/zzhd;

    .line 1946
    .line 1947
    .line 1948
    and-long v25, v13, v25

    .line 1949
    .line 1950
    cmp-long v6, v25, v55

    .line 1951
    .line 1952
    if-eqz v6, :cond_32

    .line 1953
    .line 1954
    const/4 v6, 0x1

    .line 1955
    goto :goto_1f

    .line 1956
    :cond_32
    const/4 v6, 0x0

    .line 1957
    :goto_1f
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/measurement/zzhd;->zzf(Z)Lcom/google/android/gms/internal/measurement/zzhd;

    .line 1958
    .line 1959
    .line 1960
    const-wide/16 v25, 0x40

    .line 1961
    .line 1962
    and-long v13, v13, v25

    .line 1963
    .line 1964
    cmp-long v6, v13, v55

    .line 1965
    .line 1966
    if-eqz v6, :cond_33

    .line 1967
    .line 1968
    const/4 v6, 0x1

    .line 1969
    goto :goto_20

    .line 1970
    :cond_33
    const/4 v6, 0x0

    .line 1971
    :goto_20
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/measurement/zzhd;->zzg(Z)Lcom/google/android/gms/internal/measurement/zzhd;

    .line 1972
    .line 1973
    .line 1974
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 1975
    .line 1976
    .line 1977
    move-result-object v0

    .line 1978
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhe;

    .line 1979
    .line 1980
    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/measurement/zzic;->zzaI(Lcom/google/android/gms/internal/measurement/zzhe;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1981
    .line 1982
    .line 1983
    goto :goto_21

    .line 1984
    :cond_34
    move-wide/from16 v49, v13

    .line 1985
    .line 1986
    :goto_21
    cmp-long v0, v22, v55

    .line 1987
    .line 1988
    if-eqz v0, :cond_35

    .line 1989
    .line 1990
    move-wide/from16 v13, v22

    .line 1991
    .line 1992
    invoke-virtual {v4, v13, v14}, Lcom/google/android/gms/internal/measurement/zzic;->zzY(J)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1993
    .line 1994
    .line 1995
    move-wide/from16 v22, v13

    .line 1996
    .line 1997
    :cond_35
    move-wide/from16 v13, v18

    .line 1998
    .line 1999
    invoke-virtual {v4, v13, v14}, Lcom/google/android/gms/internal/measurement/zzic;->zzar(J)Lcom/google/android/gms/internal/measurement/zzic;

    .line 2000
    .line 2001
    .line 2002
    invoke-virtual {v1}, Lmp3;->i0()Lci3;

    .line 2003
    .line 2004
    .line 2005
    move-result-object v6

    .line 2006
    iget-object v0, v6, Lqo3;->b:Lmp3;

    .line 2007
    .line 2008
    iget-object v0, v0, Lmp3;->W:Lij3;

    .line 2009
    .line 2010
    invoke-virtual {v0}, Lij3;->e()Landroid/content/Context;

    .line 2011
    .line 2012
    .line 2013
    move-result-object v0

    .line 2014
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 2015
    .line 2016
    .line 2017
    move-result-object v0

    .line 2018
    const-string v18, "com.google.android.gms.measurement"

    .line 2019
    .line 2020
    move-wide/from16 v25, v13

    .line 2021
    .line 2022
    invoke-static/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/zzka;->zza(Ljava/lang/String;)Landroid/net/Uri;

    .line 2023
    .line 2024
    .line 2025
    move-result-object v13

    .line 2026
    sget-object v14, Lvc0;->b:Lvc0;

    .line 2027
    .line 2028
    invoke-static {v0, v13, v14}, Lcom/google/android/gms/internal/measurement/zzjq;->zza(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/Runnable;)Lcom/google/android/gms/internal/measurement/zzjq;

    .line 2029
    .line 2030
    .line 2031
    move-result-object v0

    .line 2032
    if-nez v0, :cond_36

    .line 2033
    .line 2034
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2035
    .line 2036
    goto :goto_22

    .line 2037
    :cond_36
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjq;->zzb()Ljava/util/Map;

    .line 2038
    .line 2039
    .line 2040
    move-result-object v0

    .line 2041
    :goto_22
    if-eqz v0, :cond_37

    .line 2042
    .line 2043
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 2044
    .line 2045
    .line 2046
    move-result v13

    .line 2047
    if-eqz v13, :cond_38

    .line 2048
    .line 2049
    :cond_37
    move-object/from16 v53, v8

    .line 2050
    .line 2051
    move-object/from16 v52, v9

    .line 2052
    .line 2053
    :goto_23
    const/4 v13, 0x0

    .line 2054
    goto/16 :goto_28

    .line 2055
    .line 2056
    :cond_38
    new-instance v13, Ljava/util/ArrayList;

    .line 2057
    .line 2058
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 2059
    .line 2060
    .line 2061
    sget-object v14, Lvg3;->f0:Lug3;

    .line 2062
    .line 2063
    move-object/from16 v53, v8

    .line 2064
    .line 2065
    const/4 v8, 0x0

    .line 2066
    invoke-virtual {v14, v8}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2067
    .line 2068
    .line 2069
    move-result-object v14

    .line 2070
    check-cast v14, Ljava/lang/Integer;

    .line 2071
    .line 2072
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 2073
    .line 2074
    .line 2075
    move-result v8

    .line 2076
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 2077
    .line 2078
    .line 2079
    move-result-object v0

    .line 2080
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2081
    .line 2082
    .line 2083
    move-result-object v14

    .line 2084
    :goto_24
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 2085
    .line 2086
    .line 2087
    move-result v0

    .line 2088
    if-eqz v0, :cond_3a

    .line 2089
    .line 2090
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2091
    .line 2092
    .line 2093
    move-result-object v0

    .line 2094
    check-cast v0, Ljava/util/Map$Entry;

    .line 2095
    .line 2096
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2097
    .line 2098
    .line 2099
    move-result-object v18

    .line 2100
    move-object/from16 v19, v14

    .line 2101
    .line 2102
    move-object/from16 v14, v18

    .line 2103
    .line 2104
    check-cast v14, Ljava/lang/String;

    .line 2105
    .line 2106
    move-object/from16 v52, v9

    .line 2107
    .line 2108
    const-string v9, "measurement.id."

    .line 2109
    .line 2110
    invoke-virtual {v14, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 2111
    .line 2112
    .line 2113
    move-result v9
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 2114
    if-eqz v9, :cond_39

    .line 2115
    .line 2116
    :try_start_d
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2117
    .line 2118
    .line 2119
    move-result-object v0

    .line 2120
    check-cast v0, Ljava/lang/String;

    .line 2121
    .line 2122
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 2123
    .line 2124
    .line 2125
    move-result v0

    .line 2126
    if-eqz v0, :cond_39

    .line 2127
    .line 2128
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2129
    .line 2130
    .line 2131
    move-result-object v0

    .line 2132
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2133
    .line 2134
    .line 2135
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 2136
    .line 2137
    .line 2138
    move-result v0

    .line 2139
    if-lt v0, v8, :cond_39

    .line 2140
    .line 2141
    iget-object v0, v6, Lsq3;->a:Ljava/lang/Object;

    .line 2142
    .line 2143
    check-cast v0, Lij3;

    .line 2144
    .line 2145
    invoke-virtual {v0}, Lij3;->a()Luh3;

    .line 2146
    .line 2147
    .line 2148
    move-result-object v0

    .line 2149
    invoke-virtual {v0}, Luh3;->E()Lsh3;

    .line 2150
    .line 2151
    .line 2152
    move-result-object v0

    .line 2153
    const-string v9, "Too many experiment IDs. Number of IDs"

    .line 2154
    .line 2155
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 2156
    .line 2157
    .line 2158
    move-result v14

    .line 2159
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2160
    .line 2161
    .line 2162
    move-result-object v14

    .line 2163
    invoke-virtual {v0, v14, v9}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_d
    .catch Ljava/lang/NumberFormatException; {:try_start_d .. :try_end_d} :catch_3
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 2164
    .line 2165
    .line 2166
    goto :goto_27

    .line 2167
    :catch_3
    move-exception v0

    .line 2168
    goto :goto_26

    .line 2169
    :cond_39
    :goto_25
    move-object/from16 v14, v19

    .line 2170
    .line 2171
    move-object/from16 v9, v52

    .line 2172
    .line 2173
    goto :goto_24

    .line 2174
    :goto_26
    :try_start_e
    iget-object v9, v6, Lsq3;->a:Ljava/lang/Object;

    .line 2175
    .line 2176
    check-cast v9, Lij3;

    .line 2177
    .line 2178
    invoke-virtual {v9}, Lij3;->a()Luh3;

    .line 2179
    .line 2180
    .line 2181
    move-result-object v9

    .line 2182
    invoke-virtual {v9}, Luh3;->E()Lsh3;

    .line 2183
    .line 2184
    .line 2185
    move-result-object v9

    .line 2186
    const-string v14, "Experiment ID NumberFormatException"

    .line 2187
    .line 2188
    invoke-virtual {v9, v0, v14}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2189
    .line 2190
    .line 2191
    goto :goto_25

    .line 2192
    :cond_3a
    move-object/from16 v52, v9

    .line 2193
    .line 2194
    :goto_27
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2195
    .line 2196
    .line 2197
    move-result v0

    .line 2198
    if-eqz v0, :cond_3b

    .line 2199
    .line 2200
    goto/16 :goto_23

    .line 2201
    .line 2202
    :cond_3b
    :goto_28
    if-eqz v13, :cond_3c

    .line 2203
    .line 2204
    invoke-virtual {v4, v13}, Lcom/google/android/gms/internal/measurement/zzic;->zzaq(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 2205
    .line 2206
    .line 2207
    :cond_3c
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 2208
    .line 2209
    .line 2210
    move-result-object v0

    .line 2211
    sget-object v6, Lvg3;->b1:Lug3;

    .line 2212
    .line 2213
    const/4 v14, 0x0

    .line 2214
    invoke-virtual {v0, v14, v6}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 2215
    .line 2216
    .line 2217
    move-result v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 2218
    const-string v6, ""

    .line 2219
    .line 2220
    if-eqz v0, :cond_3d

    .line 2221
    .line 2222
    :try_start_f
    invoke-virtual {v4, v6}, Lcom/google/android/gms/internal/measurement/zzic;->zzaP(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 2223
    .line 2224
    .line 2225
    :cond_3d
    invoke-virtual {v1, v12}, Lmp3;->d(Ljava/lang/String;)Lok3;

    .line 2226
    .line 2227
    .line 2228
    move-result-object v0

    .line 2229
    const/16 v8, 0x64

    .line 2230
    .line 2231
    invoke-static {v8, v11}, Lok3;->c(ILjava/lang/String;)Lok3;

    .line 2232
    .line 2233
    .line 2234
    move-result-object v8

    .line 2235
    invoke-virtual {v0, v8}, Lok3;->j(Lok3;)Lok3;

    .line 2236
    .line 2237
    .line 2238
    move-result-object v0

    .line 2239
    invoke-virtual {v0, v7}, Lok3;->i(Lnk3;)Z

    .line 2240
    .line 2241
    .line 2242
    move-result v8
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 2243
    if-eqz v8, :cond_42

    .line 2244
    .line 2245
    if-eqz v17, :cond_42

    .line 2246
    .line 2247
    :try_start_10
    iget-object v8, v1, Lmp3;->w:Ltn3;

    .line 2248
    .line 2249
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2250
    .line 2251
    .line 2252
    invoke-virtual {v0, v7}, Lok3;->i(Lnk3;)Z

    .line 2253
    .line 2254
    .line 2255
    move-result v9

    .line 2256
    if-eqz v9, :cond_3e

    .line 2257
    .line 2258
    invoke-virtual {v8, v12}, Ltn3;->D(Ljava/lang/String;)Landroid/util/Pair;

    .line 2259
    .line 2260
    .line 2261
    move-result-object v6

    .line 2262
    goto :goto_29

    .line 2263
    :cond_3e
    new-instance v8, Landroid/util/Pair;

    .line 2264
    .line 2265
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2266
    .line 2267
    invoke-direct {v8, v6, v9}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2268
    .line 2269
    .line 2270
    move-object v6, v8

    .line 2271
    :goto_29
    iget-object v8, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 2272
    .line 2273
    check-cast v8, Ljava/lang/CharSequence;

    .line 2274
    .line 2275
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2276
    .line 2277
    .line 2278
    move-result v8

    .line 2279
    if-nez v8, :cond_42

    .line 2280
    .line 2281
    iget-object v8, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 2282
    .line 2283
    check-cast v8, Ljava/lang/String;

    .line 2284
    .line 2285
    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzQ(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 2286
    .line 2287
    .line 2288
    iget-object v8, v6, Landroid/util/Pair;->second:Ljava/lang/Object;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    .line 2289
    .line 2290
    if-eqz v8, :cond_3f

    .line 2291
    .line 2292
    :try_start_11
    check-cast v8, Ljava/lang/Boolean;

    .line 2293
    .line 2294
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2295
    .line 2296
    .line 2297
    move-result v8

    .line 2298
    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzT(Z)Lcom/google/android/gms/internal/measurement/zzic;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    .line 2299
    .line 2300
    .line 2301
    :cond_3f
    :try_start_12
    iget-object v8, v3, Loe3;->b:Ljava/lang/String;

    .line 2302
    .line 2303
    move-object/from16 v9, v21

    .line 2304
    .line 2305
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2306
    .line 2307
    .line 2308
    move-result v8

    .line 2309
    if-nez v8, :cond_42

    .line 2310
    .line 2311
    iget-object v6, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 2312
    .line 2313
    check-cast v6, Ljava/lang/String;

    .line 2314
    .line 2315
    const-string v8, "00000000-0000-0000-0000-000000000000"

    .line 2316
    .line 2317
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2318
    .line 2319
    .line 2320
    move-result v6

    .line 2321
    if-nez v6, :cond_42

    .line 2322
    .line 2323
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 2324
    .line 2325
    .line 2326
    move-result-object v6

    .line 2327
    invoke-virtual {v6, v12}, Lae3;->D0(Ljava/lang/String;)Ldi3;

    .line 2328
    .line 2329
    .line 2330
    move-result-object v6

    .line 2331
    if-eqz v6, :cond_42

    .line 2332
    .line 2333
    iget-object v8, v6, Ldi3;->a:Lij3;

    .line 2334
    .line 2335
    iget-object v8, v8, Lij3;->i:Lbj3;

    .line 2336
    .line 2337
    invoke-static {v8}, Lij3;->l(Lhk3;)V

    .line 2338
    .line 2339
    .line 2340
    invoke-virtual {v8}, Lbj3;->y()V

    .line 2341
    .line 2342
    .line 2343
    iget-boolean v8, v6, Ldi3;->y:Z

    .line 2344
    .line 2345
    if-eqz v8, :cond_42

    .line 2346
    .line 2347
    const/4 v11, 0x0

    .line 2348
    const/4 v14, 0x0

    .line 2349
    invoke-virtual {v1, v12, v11, v14, v14}, Lmp3;->u(Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;)V

    .line 2350
    .line 2351
    .line 2352
    new-instance v8, Landroid/os/Bundle;

    .line 2353
    .line 2354
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 2355
    .line 2356
    .line 2357
    iget-object v11, v6, Ldi3;->a:Lij3;

    .line 2358
    .line 2359
    iget-object v11, v11, Lij3;->i:Lbj3;

    .line 2360
    .line 2361
    invoke-static {v11}, Lij3;->l(Lhk3;)V

    .line 2362
    .line 2363
    .line 2364
    invoke-virtual {v11}, Lbj3;->y()V

    .line 2365
    .line 2366
    .line 2367
    iget-object v11, v6, Ldi3;->z:Ljava/lang/Long;

    .line 2368
    .line 2369
    if-eqz v11, :cond_40

    .line 2370
    .line 2371
    const-string v13, "_pfo"

    .line 2372
    .line 2373
    move-object/from16 v45, v15

    .line 2374
    .line 2375
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 2376
    .line 2377
    .line 2378
    move-result-wide v14

    .line 2379
    move-wide/from16 v1, v55

    .line 2380
    .line 2381
    invoke-static {v1, v2, v14, v15}, Ljava/lang/Math;->max(JJ)J

    .line 2382
    .line 2383
    .line 2384
    move-result-wide v14

    .line 2385
    invoke-virtual {v8, v13, v14, v15}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 2386
    .line 2387
    .line 2388
    goto :goto_2a

    .line 2389
    :catchall_1
    move-exception v0

    .line 2390
    move-object/from16 v5, p0

    .line 2391
    .line 2392
    goto/16 :goto_36

    .line 2393
    .line 2394
    :cond_40
    move-object/from16 v45, v15

    .line 2395
    .line 2396
    :goto_2a
    iget-object v1, v6, Ldi3;->a:Lij3;

    .line 2397
    .line 2398
    iget-object v1, v1, Lij3;->i:Lbj3;

    .line 2399
    .line 2400
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 2401
    .line 2402
    .line 2403
    invoke-virtual {v1}, Lbj3;->y()V

    .line 2404
    .line 2405
    .line 2406
    iget-object v1, v6, Ldi3;->A:Ljava/lang/Long;

    .line 2407
    .line 2408
    if-eqz v1, :cond_41

    .line 2409
    .line 2410
    const-string v2, "_uwa"

    .line 2411
    .line 2412
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 2413
    .line 2414
    .line 2415
    move-result-wide v13

    .line 2416
    invoke-virtual {v8, v2, v13, v14}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 2417
    .line 2418
    .line 2419
    :cond_41
    move-wide/from16 v1, v57

    .line 2420
    .line 2421
    invoke-virtual {v8, v10, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 2422
    .line 2423
    .line 2424
    invoke-virtual {v5, v12, v9, v8}, Lac3;->e(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 2425
    .line 2426
    .line 2427
    goto :goto_2b

    .line 2428
    :cond_42
    move-object/from16 v45, v15

    .line 2429
    .line 2430
    :goto_2b
    invoke-virtual/range {v48 .. v48}, Lij3;->p()Lme3;

    .line 2431
    .line 2432
    .line 2433
    move-result-object v1

    .line 2434
    invoke-virtual {v1}, Lhk3;->B()V

    .line 2435
    .line 2436
    .line 2437
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 2438
    .line 2439
    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/measurement/zzic;->zzF(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 2440
    .line 2441
    .line 2442
    invoke-virtual/range {v48 .. v48}, Lij3;->p()Lme3;

    .line 2443
    .line 2444
    .line 2445
    move-result-object v1

    .line 2446
    invoke-virtual {v1}, Lhk3;->B()V

    .line 2447
    .line 2448
    .line 2449
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 2450
    .line 2451
    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/measurement/zzic;->zzE(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 2452
    .line 2453
    .line 2454
    invoke-virtual/range {v48 .. v48}, Lij3;->p()Lme3;

    .line 2455
    .line 2456
    .line 2457
    move-result-object v1

    .line 2458
    invoke-virtual {v1}, Lme3;->D()J

    .line 2459
    .line 2460
    .line 2461
    move-result-wide v1

    .line 2462
    long-to-int v1, v1

    .line 2463
    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/measurement/zzic;->zzI(I)Lcom/google/android/gms/internal/measurement/zzic;

    .line 2464
    .line 2465
    .line 2466
    invoke-virtual/range {v48 .. v48}, Lij3;->p()Lme3;

    .line 2467
    .line 2468
    .line 2469
    move-result-object v1

    .line 2470
    invoke-virtual {v1}, Lme3;->E()Ljava/lang/String;

    .line 2471
    .line 2472
    .line 2473
    move-result-object v1

    .line 2474
    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/measurement/zzic;->zzH(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 2475
    .line 2476
    .line 2477
    move-object/from16 v2, p2

    .line 2478
    .line 2479
    iget-wide v5, v2, Lcom/google/android/gms/measurement/internal/zzr;->h0:J

    .line 2480
    .line 2481
    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/internal/measurement/zzic;->zzay(J)Lcom/google/android/gms/internal/measurement/zzic;

    .line 2482
    .line 2483
    .line 2484
    invoke-virtual/range {v48 .. v48}, Lij3;->d()Z

    .line 2485
    .line 2486
    .line 2487
    move-result v1

    .line 2488
    if-eqz v1, :cond_43

    .line 2489
    .line 2490
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzic;->zzK()Ljava/lang/String;

    .line 2491
    .line 2492
    .line 2493
    const/4 v14, 0x0

    .line 2494
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2495
    .line 2496
    .line 2497
    move-result v1

    .line 2498
    if-nez v1, :cond_43

    .line 2499
    .line 2500
    invoke-virtual {v4, v14}, Lcom/google/android/gms/internal/measurement/zzic;->zzam(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 2501
    .line 2502
    .line 2503
    :cond_43
    invoke-virtual/range {p0 .. p0}, Lmp3;->f0()Lae3;

    .line 2504
    .line 2505
    .line 2506
    move-result-object v1

    .line 2507
    invoke-virtual {v1, v12}, Lae3;->D0(Ljava/lang/String;)Ldi3;

    .line 2508
    .line 2509
    .line 2510
    move-result-object v1

    .line 2511
    if-nez v1, :cond_45

    .line 2512
    .line 2513
    new-instance v1, Ldi3;

    .line 2514
    .line 2515
    move-object/from16 v5, v48

    .line 2516
    .line 2517
    invoke-direct {v1, v5, v12}, Ldi3;-><init>(Lij3;Ljava/lang/String;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    .line 2518
    .line 2519
    .line 2520
    move-object/from16 v5, p0

    .line 2521
    .line 2522
    :try_start_13
    invoke-virtual {v5, v0}, Lmp3;->o(Lok3;)Ljava/lang/String;

    .line 2523
    .line 2524
    .line 2525
    move-result-object v6

    .line 2526
    invoke-virtual {v1, v6}, Ldi3;->F(Ljava/lang/String;)V

    .line 2527
    .line 2528
    .line 2529
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzr;->V:Ljava/lang/String;

    .line 2530
    .line 2531
    invoke-virtual {v1, v2}, Ldi3;->K(Ljava/lang/String;)V

    .line 2532
    .line 2533
    .line 2534
    move-object/from16 v15, v45

    .line 2535
    .line 2536
    invoke-virtual {v1, v15}, Ldi3;->H(Ljava/lang/String;)V

    .line 2537
    .line 2538
    .line 2539
    invoke-virtual {v0, v7}, Lok3;->i(Lnk3;)Z

    .line 2540
    .line 2541
    .line 2542
    move-result v2

    .line 2543
    if-eqz v2, :cond_44

    .line 2544
    .line 2545
    iget-object v2, v5, Lmp3;->w:Ltn3;

    .line 2546
    .line 2547
    move/from16 v6, v17

    .line 2548
    .line 2549
    invoke-virtual {v2, v12, v6}, Ltn3;->E(Ljava/lang/String;Z)Ljava/lang/String;

    .line 2550
    .line 2551
    .line 2552
    move-result-object v2

    .line 2553
    invoke-virtual {v1, v2}, Ldi3;->I(Ljava/lang/String;)V

    .line 2554
    .line 2555
    .line 2556
    :cond_44
    const-wide/16 v6, 0x0

    .line 2557
    .line 2558
    goto :goto_2c

    .line 2559
    :catchall_2
    move-exception v0

    .line 2560
    goto/16 :goto_36

    .line 2561
    .line 2562
    :goto_2c
    invoke-virtual {v1, v6, v7}, Ldi3;->e(J)V

    .line 2563
    .line 2564
    .line 2565
    invoke-virtual {v1, v6, v7}, Ldi3;->L(J)V

    .line 2566
    .line 2567
    .line 2568
    invoke-virtual {v1, v6, v7}, Ldi3;->M(J)V

    .line 2569
    .line 2570
    .line 2571
    move-object/from16 v9, v52

    .line 2572
    .line 2573
    invoke-virtual {v1, v9}, Ldi3;->O(Ljava/lang/String;)V

    .line 2574
    .line 2575
    .line 2576
    move-wide/from16 v13, v49

    .line 2577
    .line 2578
    invoke-virtual {v1, v13, v14}, Ldi3;->Q(J)V

    .line 2579
    .line 2580
    .line 2581
    move-object/from16 v8, v53

    .line 2582
    .line 2583
    invoke-virtual {v1, v8}, Ldi3;->R(Ljava/lang/String;)V

    .line 2584
    .line 2585
    .line 2586
    move-wide/from16 v6, v46

    .line 2587
    .line 2588
    invoke-virtual {v1, v6, v7}, Ldi3;->S(J)V

    .line 2589
    .line 2590
    .line 2591
    move-wide/from16 v13, v22

    .line 2592
    .line 2593
    invoke-virtual {v1, v13, v14}, Ldi3;->a(J)V

    .line 2594
    .line 2595
    .line 2596
    move/from16 v2, v43

    .line 2597
    .line 2598
    invoke-virtual {v1, v2}, Ldi3;->d(Z)V

    .line 2599
    .line 2600
    .line 2601
    move-wide/from16 v13, v25

    .line 2602
    .line 2603
    invoke-virtual {v1, v13, v14}, Ldi3;->c(J)V

    .line 2604
    .line 2605
    .line 2606
    invoke-virtual {v5}, Lmp3;->f0()Lae3;

    .line 2607
    .line 2608
    .line 2609
    move-result-object v2

    .line 2610
    const/4 v11, 0x0

    .line 2611
    invoke-virtual {v2, v1, v11}, Lae3;->E0(Ldi3;Z)V

    .line 2612
    .line 2613
    .line 2614
    goto :goto_2d

    .line 2615
    :cond_45
    const/4 v11, 0x0

    .line 2616
    move-object/from16 v5, p0

    .line 2617
    .line 2618
    :goto_2d
    sget-object v2, Lnk3;->c:Lnk3;

    .line 2619
    .line 2620
    invoke-virtual {v0, v2}, Lok3;->i(Lnk3;)Z

    .line 2621
    .line 2622
    .line 2623
    move-result v0

    .line 2624
    if-eqz v0, :cond_46

    .line 2625
    .line 2626
    invoke-virtual {v1}, Ldi3;->E()Ljava/lang/String;

    .line 2627
    .line 2628
    .line 2629
    move-result-object v0

    .line 2630
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2631
    .line 2632
    .line 2633
    move-result v0

    .line 2634
    if-nez v0, :cond_46

    .line 2635
    .line 2636
    invoke-virtual {v1}, Ldi3;->E()Ljava/lang/String;

    .line 2637
    .line 2638
    .line 2639
    move-result-object v0

    .line 2640
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 2641
    .line 2642
    .line 2643
    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/measurement/zzic;->zzW(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 2644
    .line 2645
    .line 2646
    :cond_46
    invoke-virtual {v1}, Ldi3;->J()Ljava/lang/String;

    .line 2647
    .line 2648
    .line 2649
    move-result-object v0

    .line 2650
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2651
    .line 2652
    .line 2653
    move-result v0

    .line 2654
    if-nez v0, :cond_47

    .line 2655
    .line 2656
    invoke-virtual {v1}, Ldi3;->J()Ljava/lang/String;

    .line 2657
    .line 2658
    .line 2659
    move-result-object v0

    .line 2660
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 2661
    .line 2662
    .line 2663
    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/measurement/zzic;->zzah(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 2664
    .line 2665
    .line 2666
    :cond_47
    invoke-virtual {v5}, Lmp3;->f0()Lae3;

    .line 2667
    .line 2668
    .line 2669
    move-result-object v0

    .line 2670
    invoke-virtual {v0, v12}, Lae3;->w0(Ljava/lang/String;)Ljava/util/List;

    .line 2671
    .line 2672
    .line 2673
    move-result-object v0

    .line 2674
    move v2, v11

    .line 2675
    :goto_2e
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 2676
    .line 2677
    .line 2678
    move-result v6

    .line 2679
    if-ge v2, v6, :cond_4b

    .line 2680
    .line 2681
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zziu;->zzm()Lcom/google/android/gms/internal/measurement/zzit;

    .line 2682
    .line 2683
    .line 2684
    move-result-object v6

    .line 2685
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2686
    .line 2687
    .line 2688
    move-result-object v7

    .line 2689
    check-cast v7, Lrp3;

    .line 2690
    .line 2691
    iget-object v7, v7, Lrp3;->c:Ljava/lang/String;

    .line 2692
    .line 2693
    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/measurement/zzit;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzit;

    .line 2694
    .line 2695
    .line 2696
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2697
    .line 2698
    .line 2699
    move-result-object v7

    .line 2700
    check-cast v7, Lrp3;

    .line 2701
    .line 2702
    iget-wide v7, v7, Lrp3;->d:J

    .line 2703
    .line 2704
    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/internal/measurement/zzit;->zza(J)Lcom/google/android/gms/internal/measurement/zzit;

    .line 2705
    .line 2706
    .line 2707
    invoke-virtual {v5}, Lmp3;->i0()Lci3;

    .line 2708
    .line 2709
    .line 2710
    move-result-object v7

    .line 2711
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2712
    .line 2713
    .line 2714
    move-result-object v8

    .line 2715
    check-cast v8, Lrp3;

    .line 2716
    .line 2717
    iget-object v8, v8, Lrp3;->e:Ljava/lang/Object;

    .line 2718
    .line 2719
    invoke-virtual {v7, v6, v8}, Lci3;->X(Lcom/google/android/gms/internal/measurement/zzit;Ljava/lang/Object;)V

    .line 2720
    .line 2721
    .line 2722
    invoke-virtual {v4, v6}, Lcom/google/android/gms/internal/measurement/zzic;->zzp(Lcom/google/android/gms/internal/measurement/zzit;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 2723
    .line 2724
    .line 2725
    const-string v6, "_sid"

    .line 2726
    .line 2727
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2728
    .line 2729
    .line 2730
    move-result-object v7

    .line 2731
    check-cast v7, Lrp3;

    .line 2732
    .line 2733
    iget-object v7, v7, Lrp3;->c:Ljava/lang/String;

    .line 2734
    .line 2735
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2736
    .line 2737
    .line 2738
    move-result v6

    .line 2739
    if-eqz v6, :cond_49

    .line 2740
    .line 2741
    iget-object v6, v1, Ldi3;->a:Lij3;

    .line 2742
    .line 2743
    iget-object v6, v6, Lij3;->i:Lbj3;

    .line 2744
    .line 2745
    invoke-static {v6}, Lij3;->l(Lhk3;)V

    .line 2746
    .line 2747
    .line 2748
    invoke-virtual {v6}, Lbj3;->y()V

    .line 2749
    .line 2750
    .line 2751
    iget-wide v6, v1, Ldi3;->w:J

    .line 2752
    .line 2753
    const-wide/16 v55, 0x0

    .line 2754
    .line 2755
    cmp-long v6, v6, v55

    .line 2756
    .line 2757
    if-eqz v6, :cond_49

    .line 2758
    .line 2759
    invoke-virtual {v5}, Lmp3;->i0()Lci3;

    .line 2760
    .line 2761
    .line 2762
    move-result-object v6

    .line 2763
    invoke-static/range {v51 .. v51}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2764
    .line 2765
    .line 2766
    move-result v7

    .line 2767
    if-eqz v7, :cond_48

    .line 2768
    .line 2769
    move-object/from16 v8, v51

    .line 2770
    .line 2771
    const-wide/16 v6, 0x0

    .line 2772
    .line 2773
    goto :goto_2f

    .line 2774
    :cond_48
    const-string v7, "UTF-8"

    .line 2775
    .line 2776
    invoke-static {v7}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 2777
    .line 2778
    .line 2779
    move-result-object v7

    .line 2780
    move-object/from16 v8, v51

    .line 2781
    .line 2782
    invoke-virtual {v8, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 2783
    .line 2784
    .line 2785
    move-result-object v7

    .line 2786
    invoke-virtual {v6, v7}, Lci3;->k0([B)J

    .line 2787
    .line 2788
    .line 2789
    move-result-wide v6

    .line 2790
    :goto_2f
    iget-object v9, v1, Ldi3;->a:Lij3;

    .line 2791
    .line 2792
    iget-object v9, v9, Lij3;->i:Lbj3;

    .line 2793
    .line 2794
    invoke-static {v9}, Lij3;->l(Lhk3;)V

    .line 2795
    .line 2796
    .line 2797
    invoke-virtual {v9}, Lbj3;->y()V

    .line 2798
    .line 2799
    .line 2800
    iget-wide v12, v1, Ldi3;->w:J

    .line 2801
    .line 2802
    cmp-long v6, v6, v12

    .line 2803
    .line 2804
    if-eqz v6, :cond_4a

    .line 2805
    .line 2806
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzic;->zzav()Lcom/google/android/gms/internal/measurement/zzic;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    .line 2807
    .line 2808
    .line 2809
    goto :goto_30

    .line 2810
    :cond_49
    move-object/from16 v8, v51

    .line 2811
    .line 2812
    :cond_4a
    :goto_30
    add-int/lit8 v2, v2, 0x1

    .line 2813
    .line 2814
    move-object/from16 v51, v8

    .line 2815
    .line 2816
    goto/16 :goto_2e

    .line 2817
    .line 2818
    :cond_4b
    :try_start_14
    invoke-virtual {v5}, Lmp3;->f0()Lae3;

    .line 2819
    .line 2820
    .line 2821
    move-result-object v1

    .line 2822
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 2823
    .line 2824
    .line 2825
    move-result-object v0

    .line 2826
    move-object v2, v0

    .line 2827
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2828
    .line 2829
    invoke-virtual {v1}, Lsq3;->y()V

    .line 2830
    .line 2831
    .line 2832
    invoke-virtual {v1}, Lwo3;->A()V

    .line 2833
    .line 2834
    .line 2835
    invoke-static {v2}, Lkb1;->n(Ljava/lang/Object;)V

    .line 2836
    .line 2837
    .line 2838
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2839
    .line 2840
    .line 2841
    move-result-object v0

    .line 2842
    invoke-static {v0}, Lkb1;->k(Ljava/lang/String;)V

    .line 2843
    .line 2844
    .line 2845
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzkr;->zzcc()[B

    .line 2846
    .line 2847
    .line 2848
    move-result-object v0

    .line 2849
    iget-object v6, v1, Lqo3;->b:Lmp3;

    .line 2850
    .line 2851
    invoke-virtual {v6}, Lmp3;->i0()Lci3;

    .line 2852
    .line 2853
    .line 2854
    move-result-object v6

    .line 2855
    invoke-virtual {v6, v0}, Lci3;->k0([B)J

    .line 2856
    .line 2857
    .line 2858
    move-result-wide v6

    .line 2859
    new-instance v8, Landroid/content/ContentValues;

    .line 2860
    .line 2861
    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    .line 2862
    .line 2863
    .line 2864
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 2865
    .line 2866
    .line 2867
    move-result-object v9

    .line 2868
    move-object/from16 v12, v16

    .line 2869
    .line 2870
    invoke-virtual {v8, v12, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 2871
    .line 2872
    .line 2873
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2874
    .line 2875
    .line 2876
    move-result-object v9

    .line 2877
    move-object/from16 v15, v20

    .line 2878
    .line 2879
    invoke-virtual {v8, v15, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 2880
    .line 2881
    .line 2882
    const-string v9, "metadata"

    .line 2883
    .line 2884
    invoke-virtual {v8, v9, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_5
    .catchall {:try_start_14 .. :try_end_14} :catchall_2

    .line 2885
    .line 2886
    .line 2887
    :try_start_15
    invoke-virtual {v1}, Lae3;->q0()Landroid/database/sqlite/SQLiteDatabase;

    .line 2888
    .line 2889
    .line 2890
    move-result-object v0

    .line 2891
    const-string v9, "raw_events_metadata"

    .line 2892
    .line 2893
    const/4 v13, 0x4

    .line 2894
    const/4 v14, 0x0

    .line 2895
    invoke-virtual {v0, v9, v14, v8, v13}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    :try_end_15
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_15 .. :try_end_15} :catch_6
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_5
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    .line 2896
    .line 2897
    .line 2898
    :try_start_16
    invoke-virtual {v5}, Lmp3;->f0()Lae3;

    .line 2899
    .line 2900
    .line 2901
    move-result-object v1

    .line 2902
    iget-object v0, v3, Loe3;->f:Lcom/google/android/gms/measurement/internal/zzbe;

    .line 2903
    .line 2904
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2905
    .line 2906
    .line 2907
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzbe;->a:Landroid/os/Bundle;

    .line 2908
    .line 2909
    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 2910
    .line 2911
    .line 2912
    move-result-object v0

    .line 2913
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2914
    .line 2915
    .line 2916
    move-result-object v0

    .line 2917
    :cond_4c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2918
    .line 2919
    .line 2920
    move-result v2

    .line 2921
    if-eqz v2, :cond_4d

    .line 2922
    .line 2923
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2924
    .line 2925
    .line 2926
    move-result-object v2

    .line 2927
    check-cast v2, Ljava/lang/String;

    .line 2928
    .line 2929
    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2930
    .line 2931
    .line 2932
    move-result v2

    .line 2933
    if-eqz v2, :cond_4c

    .line 2934
    .line 2935
    :goto_31
    const/4 v13, 0x1

    .line 2936
    goto :goto_32

    .line 2937
    :cond_4d
    invoke-virtual {v5}, Lmp3;->e0()Lvi3;

    .line 2938
    .line 2939
    .line 2940
    move-result-object v0

    .line 2941
    iget-object v2, v3, Loe3;->a:Ljava/lang/String;

    .line 2942
    .line 2943
    iget-object v4, v3, Loe3;->b:Ljava/lang/String;

    .line 2944
    .line 2945
    invoke-virtual {v0, v2, v4}, Lvi3;->P(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2946
    .line 2947
    .line 2948
    move-result v0

    .line 2949
    invoke-virtual {v5}, Lmp3;->f0()Lae3;

    .line 2950
    .line 2951
    .line 2952
    move-result-object v16

    .line 2953
    invoke-virtual {v5}, Lmp3;->g()J

    .line 2954
    .line 2955
    .line 2956
    move-result-wide v22

    .line 2957
    const/16 v19, 0x0

    .line 2958
    .line 2959
    const/16 v20, 0x0

    .line 2960
    .line 2961
    const/16 v17, 0x0

    .line 2962
    .line 2963
    const/16 v18, 0x0

    .line 2964
    .line 2965
    move-object/from16 v21, v2

    .line 2966
    .line 2967
    invoke-virtual/range {v16 .. v23}, Lae3;->F0(ZZZZLjava/lang/String;J)Lud3;

    .line 2968
    .line 2969
    .line 2970
    move-result-object v2

    .line 2971
    move-object/from16 v4, v21

    .line 2972
    .line 2973
    if-eqz v0, :cond_4e

    .line 2974
    .line 2975
    iget-wide v8, v2, Lud3;->e:J

    .line 2976
    .line 2977
    invoke-virtual {v5}, Lmp3;->d0()Lpd3;

    .line 2978
    .line 2979
    .line 2980
    move-result-object v0

    .line 2981
    sget-object v2, Lvg3;->p:Lug3;

    .line 2982
    .line 2983
    invoke-virtual {v0, v4, v2}, Lpd3;->H(Ljava/lang/String;Lug3;)I

    .line 2984
    .line 2985
    .line 2986
    move-result v0

    .line 2987
    int-to-long v13, v0

    .line 2988
    cmp-long v0, v8, v13

    .line 2989
    .line 2990
    if-gez v0, :cond_4e

    .line 2991
    .line 2992
    goto :goto_31

    .line 2993
    :cond_4e
    move v13, v11

    .line 2994
    :goto_32
    invoke-virtual {v1}, Lsq3;->y()V

    .line 2995
    .line 2996
    .line 2997
    invoke-virtual {v1}, Lwo3;->A()V

    .line 2998
    .line 2999
    .line 3000
    iget-object v0, v3, Loe3;->a:Ljava/lang/String;

    .line 3001
    .line 3002
    invoke-static {v0}, Lkb1;->k(Ljava/lang/String;)V

    .line 3003
    .line 3004
    .line 3005
    iget-object v2, v1, Lqo3;->b:Lmp3;

    .line 3006
    .line 3007
    invoke-virtual {v2}, Lmp3;->i0()Lci3;

    .line 3008
    .line 3009
    .line 3010
    move-result-object v2

    .line 3011
    invoke-virtual {v2, v3}, Lci3;->b0(Loe3;)Lcom/google/android/gms/internal/measurement/zzhs;

    .line 3012
    .line 3013
    .line 3014
    move-result-object v2

    .line 3015
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzkr;->zzcc()[B

    .line 3016
    .line 3017
    .line 3018
    move-result-object v2

    .line 3019
    new-instance v4, Landroid/content/ContentValues;

    .line 3020
    .line 3021
    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 3022
    .line 3023
    .line 3024
    invoke-virtual {v4, v12, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 3025
    .line 3026
    .line 3027
    const-string v8, "name"

    .line 3028
    .line 3029
    iget-object v9, v3, Loe3;->b:Ljava/lang/String;

    .line 3030
    .line 3031
    invoke-virtual {v4, v8, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 3032
    .line 3033
    .line 3034
    const-string v8, "timestamp"

    .line 3035
    .line 3036
    iget-wide v9, v3, Loe3;->d:J

    .line 3037
    .line 3038
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 3039
    .line 3040
    .line 3041
    move-result-object v9

    .line 3042
    invoke-virtual {v4, v8, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 3043
    .line 3044
    .line 3045
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 3046
    .line 3047
    .line 3048
    move-result-object v6

    .line 3049
    invoke-virtual {v4, v15, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 3050
    .line 3051
    .line 3052
    const-string v6, "data"

    .line 3053
    .line 3054
    invoke-virtual {v4, v6, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 3055
    .line 3056
    .line 3057
    const-string v2, "realtime"

    .line 3058
    .line 3059
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3060
    .line 3061
    .line 3062
    move-result-object v6

    .line 3063
    invoke-virtual {v4, v2, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_2

    .line 3064
    .line 3065
    .line 3066
    :try_start_17
    invoke-virtual {v1}, Lae3;->q0()Landroid/database/sqlite/SQLiteDatabase;

    .line 3067
    .line 3068
    .line 3069
    move-result-object v2

    .line 3070
    move-object/from16 v15, v24

    .line 3071
    .line 3072
    const/4 v14, 0x0

    .line 3073
    invoke-virtual {v2, v15, v14, v4}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 3074
    .line 3075
    .line 3076
    move-result-wide v6

    .line 3077
    const-wide/16 v8, -0x1

    .line 3078
    .line 3079
    cmp-long v2, v6, v8

    .line 3080
    .line 3081
    if-nez v2, :cond_4f

    .line 3082
    .line 3083
    iget-object v2, v1, Lsq3;->a:Ljava/lang/Object;

    .line 3084
    .line 3085
    check-cast v2, Lij3;

    .line 3086
    .line 3087
    invoke-virtual {v2}, Lij3;->a()Luh3;

    .line 3088
    .line 3089
    .line 3090
    move-result-object v2

    .line 3091
    invoke-virtual {v2}, Luh3;->D()Lsh3;

    .line 3092
    .line 3093
    .line 3094
    move-result-object v2

    .line 3095
    const-string v4, "Failed to insert raw event (got -1). appId"

    .line 3096
    .line 3097
    invoke-static {v0}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 3098
    .line 3099
    .line 3100
    move-result-object v0

    .line 3101
    invoke-virtual {v2, v0, v4}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_17
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_17 .. :try_end_17} :catch_4
    .catchall {:try_start_17 .. :try_end_17} :catchall_2

    .line 3102
    .line 3103
    .line 3104
    goto :goto_35

    .line 3105
    :catch_4
    move-exception v0

    .line 3106
    goto :goto_33

    .line 3107
    :cond_4f
    const-wide/16 v6, 0x0

    .line 3108
    .line 3109
    :try_start_18
    iput-wide v6, v5, Lmp3;->Z:J

    .line 3110
    .line 3111
    goto :goto_35

    .line 3112
    :goto_33
    iget-object v1, v1, Lsq3;->a:Ljava/lang/Object;

    .line 3113
    .line 3114
    check-cast v1, Lij3;

    .line 3115
    .line 3116
    invoke-virtual {v1}, Lij3;->a()Luh3;

    .line 3117
    .line 3118
    .line 3119
    move-result-object v1

    .line 3120
    invoke-virtual {v1}, Luh3;->D()Lsh3;

    .line 3121
    .line 3122
    .line 3123
    move-result-object v1

    .line 3124
    const-string v2, "Error storing raw event. appId"

    .line 3125
    .line 3126
    iget-object v3, v3, Loe3;->a:Ljava/lang/String;

    .line 3127
    .line 3128
    invoke-static {v3}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 3129
    .line 3130
    .line 3131
    move-result-object v3

    .line 3132
    invoke-virtual {v1, v3, v2, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_2

    .line 3133
    .line 3134
    .line 3135
    goto :goto_35

    .line 3136
    :catch_5
    move-exception v0

    .line 3137
    goto :goto_34

    .line 3138
    :catch_6
    move-exception v0

    .line 3139
    :try_start_19
    iget-object v1, v1, Lsq3;->a:Ljava/lang/Object;

    .line 3140
    .line 3141
    check-cast v1, Lij3;

    .line 3142
    .line 3143
    invoke-virtual {v1}, Lij3;->a()Luh3;

    .line 3144
    .line 3145
    .line 3146
    move-result-object v1

    .line 3147
    invoke-virtual {v1}, Luh3;->D()Lsh3;

    .line 3148
    .line 3149
    .line 3150
    move-result-object v1

    .line 3151
    const-string v3, "Error storing raw event metadata. appId"

    .line 3152
    .line 3153
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzid;->zzA()Ljava/lang/String;

    .line 3154
    .line 3155
    .line 3156
    move-result-object v2

    .line 3157
    invoke-static {v2}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 3158
    .line 3159
    .line 3160
    move-result-object v2

    .line 3161
    invoke-virtual {v1, v2, v3, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 3162
    .line 3163
    .line 3164
    throw v0
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_5
    .catchall {:try_start_19 .. :try_end_19} :catchall_2

    .line 3165
    :goto_34
    :try_start_1a
    invoke-virtual {v5}, Lmp3;->a()Luh3;

    .line 3166
    .line 3167
    .line 3168
    move-result-object v1

    .line 3169
    invoke-virtual {v1}, Luh3;->D()Lsh3;

    .line 3170
    .line 3171
    .line 3172
    move-result-object v1

    .line 3173
    const-string v2, "Data loss. Failed to insert raw event metadata. appId"

    .line 3174
    .line 3175
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzic;->zzK()Ljava/lang/String;

    .line 3176
    .line 3177
    .line 3178
    move-result-object v3

    .line 3179
    invoke-static {v3}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 3180
    .line 3181
    .line 3182
    move-result-object v3

    .line 3183
    invoke-virtual {v1, v3, v2, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 3184
    .line 3185
    .line 3186
    :goto_35
    invoke-virtual {v5}, Lmp3;->f0()Lae3;

    .line 3187
    .line 3188
    .line 3189
    move-result-object v0

    .line 3190
    invoke-virtual {v0}, Lae3;->o0()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_2

    .line 3191
    .line 3192
    .line 3193
    invoke-virtual {v5}, Lmp3;->f0()Lae3;

    .line 3194
    .line 3195
    .line 3196
    move-result-object v0

    .line 3197
    invoke-virtual {v0}, Lae3;->p0()V

    .line 3198
    .line 3199
    .line 3200
    invoke-virtual {v5}, Lmp3;->L()V

    .line 3201
    .line 3202
    .line 3203
    invoke-virtual {v5}, Lmp3;->a()Luh3;

    .line 3204
    .line 3205
    .line 3206
    move-result-object v0

    .line 3207
    invoke-virtual {v0}, Luh3;->G()Lsh3;

    .line 3208
    .line 3209
    .line 3210
    move-result-object v0

    .line 3211
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 3212
    .line 3213
    .line 3214
    move-result-wide v1

    .line 3215
    sub-long v1, v1, v41

    .line 3216
    .line 3217
    const-wide/32 v3, 0x7a120

    .line 3218
    .line 3219
    .line 3220
    add-long/2addr v1, v3

    .line 3221
    const-wide/32 v3, 0xf4240

    .line 3222
    .line 3223
    .line 3224
    div-long/2addr v1, v3

    .line 3225
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 3226
    .line 3227
    .line 3228
    move-result-object v1

    .line 3229
    const-string v2, "Background event processing time, ms"

    .line 3230
    .line 3231
    invoke-virtual {v0, v1, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3232
    .line 3233
    .line 3234
    return-void

    .line 3235
    :goto_36
    invoke-virtual {v5}, Lmp3;->f0()Lae3;

    .line 3236
    .line 3237
    .line 3238
    move-result-object v1

    .line 3239
    invoke-virtual {v1}, Lae3;->p0()V

    .line 3240
    .line 3241
    .line 3242
    throw v0
.end method

.method public final l0(Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lbj3;->y()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lmp3;->k0()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v0}, Lkb1;->k(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget v1, p1, Lcom/google/android/gms/measurement/internal/zzr;->i0:I

    .line 17
    .line 18
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzr;->d0:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v1, p1}, Lok3;->c(ILjava/lang/String;)Lok3;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0, v0}, Lmp3;->d(Ljava/lang/String;)Lok3;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v1, v1, Luh3;->Y:Lsh3;

    .line 32
    .line 33
    const-string v2, "Setting storage consent for package"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2, p1}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Lbj3;->y()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lmp3;->k0()V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lmp3;->m0:Ljava/util/HashMap;

    .line 49
    .line 50
    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, Lmp3;->c:Lae3;

    .line 54
    .line 55
    invoke-static {p0}, Lmp3;->S(Lwo3;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0, p1}, Lae3;->g0(Ljava/lang/String;Lok3;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final m(Ldi3;Lcom/google/android/gms/internal/measurement/zzic;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual {v0}, Lmp3;->b()Lbj3;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Lbj3;->y()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lmp3;->k0()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzic;->zzaA()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    new-instance v3, Ljava/util/EnumMap;

    .line 20
    .line 21
    const-class v4, Lnk3;

    .line 22
    .line 23
    invoke-direct {v3, v4}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-static {}, Lnk3;->values()[Lnk3;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    array-length v5, v5

    .line 35
    sget-object v6, Lrd3;->b:Lrd3;

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    if-lt v4, v5, :cond_4

    .line 39
    .line 40
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    const/16 v5, 0x31

    .line 45
    .line 46
    if-eq v4, v5, :cond_0

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_0
    invoke-static {}, Lnk3;->values()[Lnk3;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    array-length v5, v4

    .line 54
    move v9, v7

    .line 55
    const/4 v10, 0x1

    .line 56
    :goto_0
    if-ge v9, v5, :cond_3

    .line 57
    .line 58
    aget-object v11, v4, v9

    .line 59
    .line 60
    add-int/lit8 v12, v10, 0x1

    .line 61
    .line 62
    invoke-virtual {v2, v10}, Ljava/lang/String;->charAt(I)C

    .line 63
    .line 64
    .line 65
    move-result v10

    .line 66
    invoke-static {}, Lrd3;->values()[Lrd3;

    .line 67
    .line 68
    .line 69
    move-result-object v13

    .line 70
    array-length v14, v13

    .line 71
    move v15, v7

    .line 72
    :goto_1
    if-ge v15, v14, :cond_2

    .line 73
    .line 74
    aget-object v7, v13, v15

    .line 75
    .line 76
    iget-char v8, v7, Lrd3;->a:C

    .line 77
    .line 78
    if-ne v8, v10, :cond_1

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_1
    add-int/lit8 v15, v15, 0x1

    .line 82
    .line 83
    const/4 v7, 0x0

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    move-object v7, v6

    .line 86
    :goto_2
    invoke-virtual {v3, v11, v7}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    add-int/lit8 v9, v9, 0x1

    .line 90
    .line 91
    move v10, v12

    .line 92
    const/4 v7, 0x0

    .line 93
    goto :goto_0

    .line 94
    :cond_3
    new-instance v2, Lac3;

    .line 95
    .line 96
    invoke-direct {v2, v3}, Lac3;-><init>(Ljava/util/EnumMap;)V

    .line 97
    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_4
    :goto_3
    new-instance v2, Lac3;

    .line 101
    .line 102
    invoke-direct {v2}, Lac3;-><init>()V

    .line 103
    .line 104
    .line 105
    :goto_4
    invoke-virtual/range {p1 .. p1}, Ldi3;->D()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {v0}, Lmp3;->b()Lbj3;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-virtual {v4}, Lbj3;->y()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Lmp3;->k0()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v3}, Lmp3;->d(Ljava/lang/String;)Lok3;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    iget-object v4, v3, Lok3;->a:Ljava/util/EnumMap;

    .line 124
    .line 125
    sget-object v5, Lnk3;->b:Lnk3;

    .line 126
    .line 127
    invoke-virtual {v4, v5}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    check-cast v7, Llk3;

    .line 132
    .line 133
    sget-object v8, Llk3;->b:Llk3;

    .line 134
    .line 135
    if-nez v7, :cond_5

    .line 136
    .line 137
    move-object v7, v8

    .line 138
    :cond_5
    iget v3, v3, Lok3;->b:I

    .line 139
    .line 140
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    sget-object v9, Lrd3;->w:Lrd3;

    .line 145
    .line 146
    sget-object v10, Lrd3;->U:Lrd3;

    .line 147
    .line 148
    const/4 v11, 0x3

    .line 149
    const/4 v12, 0x2

    .line 150
    const/4 v13, 0x1

    .line 151
    if-eq v7, v13, :cond_7

    .line 152
    .line 153
    if-eq v7, v12, :cond_6

    .line 154
    .line 155
    if-eq v7, v11, :cond_6

    .line 156
    .line 157
    invoke-virtual {v2, v5, v10}, Lac3;->g(Lnk3;Lrd3;)V

    .line 158
    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_6
    invoke-virtual {v2, v5, v3}, Lac3;->f(Lnk3;I)V

    .line 162
    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_7
    invoke-virtual {v2, v5, v9}, Lac3;->g(Lnk3;Lrd3;)V

    .line 166
    .line 167
    .line 168
    :goto_5
    sget-object v5, Lnk3;->c:Lnk3;

    .line 169
    .line 170
    invoke-virtual {v4, v5}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    check-cast v4, Llk3;

    .line 175
    .line 176
    if-nez v4, :cond_8

    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_8
    move-object v8, v4

    .line 180
    :goto_6
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    const/4 v13, 0x1

    .line 185
    if-eq v4, v13, :cond_a

    .line 186
    .line 187
    if-eq v4, v12, :cond_9

    .line 188
    .line 189
    if-eq v4, v11, :cond_9

    .line 190
    .line 191
    invoke-virtual {v2, v5, v10}, Lac3;->g(Lnk3;Lrd3;)V

    .line 192
    .line 193
    .line 194
    goto :goto_7

    .line 195
    :cond_9
    invoke-virtual {v2, v5, v3}, Lac3;->f(Lnk3;I)V

    .line 196
    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_a
    invoke-virtual {v2, v5, v9}, Lac3;->g(Lnk3;Lrd3;)V

    .line 200
    .line 201
    .line 202
    :goto_7
    invoke-virtual/range {p1 .. p1}, Ldi3;->D()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    invoke-virtual {v0}, Lmp3;->b()Lbj3;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    invoke-virtual {v4}, Lbj3;->y()V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Lmp3;->k0()V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v3}, Lmp3;->n0(Ljava/lang/String;)Lce3;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    invoke-virtual {v0, v3}, Lmp3;->d(Ljava/lang/String;)Lok3;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    invoke-virtual {v0, v3, v4, v5, v2}, Lmp3;->p0(Ljava/lang/String;Lce3;Lok3;Lac3;)Lce3;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    iget-object v4, v3, Lce3;->d:Ljava/lang/String;

    .line 229
    .line 230
    iget-object v3, v3, Lce3;->c:Ljava/lang/Boolean;

    .line 231
    .line 232
    invoke-static {v3}, Lkb1;->n(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/measurement/zzic;->zzaD(Z)Lcom/google/android/gms/internal/measurement/zzic;

    .line 240
    .line 241
    .line 242
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-nez v3, :cond_b

    .line 247
    .line 248
    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/measurement/zzic;->zzaF(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 249
    .line 250
    .line 251
    :cond_b
    invoke-virtual {v0}, Lmp3;->b()Lbj3;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    invoke-virtual {v3}, Lbj3;->y()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0}, Lmp3;->k0()V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzic;->zzk()Ljava/util/List;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    :cond_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    const-string v5, "_npa"

    .line 274
    .line 275
    if-eqz v4, :cond_d

    .line 276
    .line 277
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    check-cast v4, Lcom/google/android/gms/internal/measurement/zziu;

    .line 282
    .line 283
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zziu;->zzc()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v7

    .line 287
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v7

    .line 291
    if-eqz v7, :cond_c

    .line 292
    .line 293
    goto :goto_8

    .line 294
    :cond_d
    const/4 v4, 0x0

    .line 295
    :goto_8
    if-eqz v4, :cond_16

    .line 296
    .line 297
    iget-object v3, v2, Lac3;->b:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v3, Ljava/util/EnumMap;

    .line 300
    .line 301
    sget-object v7, Lnk3;->e:Lnk3;

    .line 302
    .line 303
    invoke-virtual {v3, v7}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    check-cast v3, Lrd3;

    .line 308
    .line 309
    if-nez v3, :cond_e

    .line 310
    .line 311
    move-object v3, v6

    .line 312
    :cond_e
    if-eq v3, v6, :cond_f

    .line 313
    .line 314
    goto/16 :goto_a

    .line 315
    .line 316
    :cond_f
    iget-object v3, v0, Lmp3;->c:Lae3;

    .line 317
    .line 318
    invoke-static {v3}, Lmp3;->S(Lwo3;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {p1 .. p1}, Ldi3;->D()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v6

    .line 325
    invoke-virtual {v3, v6, v5}, Lae3;->v0(Ljava/lang/String;Ljava/lang/String;)Lrp3;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    sget-object v5, Lrd3;->e:Lrd3;

    .line 330
    .line 331
    sget-object v6, Lrd3;->i:Lrd3;

    .line 332
    .line 333
    if-eqz v3, :cond_12

    .line 334
    .line 335
    iget-object v3, v3, Lrp3;->b:Ljava/lang/String;

    .line 336
    .line 337
    const-string v4, "tcf"

    .line 338
    .line 339
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v4

    .line 343
    if-eqz v4, :cond_10

    .line 344
    .line 345
    sget-object v3, Lrd3;->v:Lrd3;

    .line 346
    .line 347
    invoke-virtual {v2, v7, v3}, Lac3;->g(Lnk3;Lrd3;)V

    .line 348
    .line 349
    .line 350
    goto/16 :goto_a

    .line 351
    .line 352
    :cond_10
    const-string v4, "app"

    .line 353
    .line 354
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v3

    .line 358
    if-eqz v3, :cond_11

    .line 359
    .line 360
    invoke-virtual {v2, v7, v6}, Lac3;->g(Lnk3;Lrd3;)V

    .line 361
    .line 362
    .line 363
    goto/16 :goto_a

    .line 364
    .line 365
    :cond_11
    invoke-virtual {v2, v7, v5}, Lac3;->g(Lnk3;Lrd3;)V

    .line 366
    .line 367
    .line 368
    goto :goto_a

    .line 369
    :cond_12
    invoke-virtual/range {p1 .. p1}, Ldi3;->w()Ljava/lang/Boolean;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    if-eqz v3, :cond_15

    .line 374
    .line 375
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 376
    .line 377
    .line 378
    move-result v8

    .line 379
    if-eqz v8, :cond_13

    .line 380
    .line 381
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zziu;->zzg()J

    .line 382
    .line 383
    .line 384
    move-result-wide v8

    .line 385
    const-wide/16 v10, 0x1

    .line 386
    .line 387
    cmp-long v8, v8, v10

    .line 388
    .line 389
    if-nez v8, :cond_15

    .line 390
    .line 391
    :cond_13
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 392
    .line 393
    .line 394
    move-result v3

    .line 395
    if-nez v3, :cond_14

    .line 396
    .line 397
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zziu;->zzg()J

    .line 398
    .line 399
    .line 400
    move-result-wide v3

    .line 401
    const-wide/16 v8, 0x0

    .line 402
    .line 403
    cmp-long v3, v3, v8

    .line 404
    .line 405
    if-eqz v3, :cond_14

    .line 406
    .line 407
    goto :goto_9

    .line 408
    :cond_14
    invoke-virtual {v2, v7, v5}, Lac3;->g(Lnk3;Lrd3;)V

    .line 409
    .line 410
    .line 411
    goto :goto_a

    .line 412
    :cond_15
    :goto_9
    invoke-virtual {v2, v7, v6}, Lac3;->g(Lnk3;Lrd3;)V

    .line 413
    .line 414
    .line 415
    goto :goto_a

    .line 416
    :cond_16
    invoke-virtual/range {p1 .. p1}, Ldi3;->D()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    invoke-virtual {v0, v3, v2}, Lmp3;->D(Ljava/lang/String;Lac3;)I

    .line 421
    .line 422
    .line 423
    move-result v3

    .line 424
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zziu;->zzm()Lcom/google/android/gms/internal/measurement/zzit;

    .line 425
    .line 426
    .line 427
    move-result-object v4

    .line 428
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/zzit;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzit;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0}, Lmp3;->f()Lxv;

    .line 432
    .line 433
    .line 434
    move-result-object v5

    .line 435
    check-cast v5, Lxt0;

    .line 436
    .line 437
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 441
    .line 442
    .line 443
    move-result-wide v5

    .line 444
    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/internal/measurement/zzit;->zza(J)Lcom/google/android/gms/internal/measurement/zzit;

    .line 445
    .line 446
    .line 447
    int-to-long v5, v3

    .line 448
    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/internal/measurement/zzit;->zze(J)Lcom/google/android/gms/internal/measurement/zzit;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 452
    .line 453
    .line 454
    move-result-object v4

    .line 455
    check-cast v4, Lcom/google/android/gms/internal/measurement/zziu;

    .line 456
    .line 457
    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/measurement/zzic;->zzo(Lcom/google/android/gms/internal/measurement/zziu;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v0}, Lmp3;->a()Luh3;

    .line 461
    .line 462
    .line 463
    move-result-object v4

    .line 464
    iget-object v4, v4, Luh3;->Y:Lsh3;

    .line 465
    .line 466
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    const-string v5, "Setting user property"

    .line 471
    .line 472
    const-string v6, "non_personalized_ads(_npa)"

    .line 473
    .line 474
    invoke-virtual {v4, v6, v5, v3}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    :goto_a
    invoke-virtual {v2}, Lac3;->toString()Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/zzic;->zzaB(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {p1 .. p1}, Ldi3;->D()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    iget-object v0, v0, Lmp3;->a:Lvi3;

    .line 489
    .line 490
    invoke-virtual {v0}, Lsq3;->y()V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v0, v2}, Lvi3;->F(Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v0, v2}, Lvi3;->U(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgf;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    if-nez v0, :cond_17

    .line 501
    .line 502
    goto :goto_b

    .line 503
    :cond_17
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgf;->zzd()Z

    .line 504
    .line 505
    .line 506
    move-result v2

    .line 507
    if-eqz v2, :cond_19

    .line 508
    .line 509
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgf;->zze()Z

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    if-eqz v0, :cond_18

    .line 514
    .line 515
    goto :goto_b

    .line 516
    :cond_18
    const/4 v13, 0x0

    .line 517
    goto :goto_c

    .line 518
    :cond_19
    :goto_b
    const/4 v13, 0x1

    .line 519
    :goto_c
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzic;->zzb()Ljava/util/List;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    const/4 v2, 0x0

    .line 524
    :goto_d
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 525
    .line 526
    .line 527
    move-result v3

    .line 528
    if-ge v2, v3, :cond_21

    .line 529
    .line 530
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v3

    .line 534
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 535
    .line 536
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzhs;->zzd()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v3

    .line 540
    const-string v4, "_tcf"

    .line 541
    .line 542
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    move-result v3

    .line 546
    if-eqz v3, :cond_20

    .line 547
    .line 548
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 553
    .line 554
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzme;->zzcl()Lcom/google/android/gms/internal/measurement/zzma;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhr;

    .line 559
    .line 560
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhr;->zza()Ljava/util/List;

    .line 561
    .line 562
    .line 563
    move-result-object v3

    .line 564
    const/4 v4, 0x0

    .line 565
    :goto_e
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 566
    .line 567
    .line 568
    move-result v5

    .line 569
    if-ge v4, v5, :cond_1f

    .line 570
    .line 571
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v5

    .line 575
    check-cast v5, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 576
    .line 577
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhw;->zzb()Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v5

    .line 581
    const-string v6, "_tcfd"

    .line 582
    .line 583
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    move-result v5

    .line 587
    if-eqz v5, :cond_1e

    .line 588
    .line 589
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v3

    .line 593
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 594
    .line 595
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzhw;->zzd()Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v3

    .line 599
    if-eqz v13, :cond_1d

    .line 600
    .line 601
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 602
    .line 603
    .line 604
    move-result v5

    .line 605
    const/4 v7, 0x4

    .line 606
    if-gt v5, v7, :cond_1a

    .line 607
    .line 608
    goto :goto_12

    .line 609
    :cond_1a
    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    .line 610
    .line 611
    .line 612
    move-result-object v3

    .line 613
    const/4 v13, 0x1

    .line 614
    :goto_f
    const/16 v5, 0x40

    .line 615
    .line 616
    const-string v8, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_"

    .line 617
    .line 618
    if-ge v13, v5, :cond_1c

    .line 619
    .line 620
    aget-char v5, v3, v7

    .line 621
    .line 622
    invoke-virtual {v8, v13}, Ljava/lang/String;->charAt(I)C

    .line 623
    .line 624
    .line 625
    move-result v9

    .line 626
    if-ne v5, v9, :cond_1b

    .line 627
    .line 628
    :goto_10
    const/16 v16, 0x1

    .line 629
    .line 630
    goto :goto_11

    .line 631
    :cond_1b
    add-int/lit8 v13, v13, 0x1

    .line 632
    .line 633
    goto :goto_f

    .line 634
    :cond_1c
    const/4 v13, 0x0

    .line 635
    goto :goto_10

    .line 636
    :goto_11
    or-int/lit8 v5, v13, 0x1

    .line 637
    .line 638
    invoke-virtual {v8, v5}, Ljava/lang/String;->charAt(I)C

    .line 639
    .line 640
    .line 641
    move-result v5

    .line 642
    aput-char v5, v3, v7

    .line 643
    .line 644
    invoke-static {v3}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v3

    .line 648
    :cond_1d
    :goto_12
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzhw;->zzn()Lcom/google/android/gms/internal/measurement/zzhv;

    .line 649
    .line 650
    .line 651
    move-result-object v5

    .line 652
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/zzhv;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 653
    .line 654
    .line 655
    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/measurement/zzhv;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhv;

    .line 656
    .line 657
    .line 658
    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/internal/measurement/zzhr;->zze(ILcom/google/android/gms/internal/measurement/zzhv;)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 659
    .line 660
    .line 661
    goto :goto_13

    .line 662
    :cond_1e
    const/16 v16, 0x1

    .line 663
    .line 664
    add-int/lit8 v4, v4, 0x1

    .line 665
    .line 666
    goto :goto_e

    .line 667
    :cond_1f
    :goto_13
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/measurement/zzic;->zzf(ILcom/google/android/gms/internal/measurement/zzhr;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 668
    .line 669
    .line 670
    return-void

    .line 671
    :cond_20
    const/16 v16, 0x1

    .line 672
    .line 673
    add-int/lit8 v2, v2, 0x1

    .line 674
    .line 675
    goto/16 :goto_d

    .line 676
    .line 677
    :cond_21
    return-void
.end method

.method public final m0(Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lbj3;->y()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lmp3;->k0()V

    .line 9
    .line 10
    .line 11
    iget-object v6, p1, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v6}, Lkb1;->k(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzr;->j0:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {p1}, Lce3;->b(Ljava/lang/String;)Lce3;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 27
    .line 28
    const-string v1, "Setting DMA consent for package"

    .line 29
    .line 30
    invoke-virtual {v0, v6, v1, p1}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Lbj3;->y()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lmp3;->k0()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v6}, Lmp3;->o0(Ljava/lang/String;)Landroid/os/Bundle;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/16 v1, 0x64

    .line 48
    .line 49
    invoke-static {v1, v0}, Lce3;->c(ILandroid/os/Bundle;)Lce3;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Lce3;->a()Llk3;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iget-object v2, p0, Lmp3;->n0:Ljava/util/HashMap;

    .line 58
    .line 59
    invoke-virtual {v2, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    iget-object v2, p0, Lmp3;->c:Lae3;

    .line 63
    .line 64
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v6}, Lkb1;->n(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Lsq3;->y()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Lwo3;->A()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v6}, Lae3;->U(Ljava/lang/String;)Lok3;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    sget-object v4, Lok3;->c:Lok3;

    .line 84
    .line 85
    if-ne v3, v4, :cond_0

    .line 86
    .line 87
    invoke-virtual {v2, v6, v4}, Lae3;->g0(Ljava/lang/String;Lok3;)V

    .line 88
    .line 89
    .line 90
    :cond_0
    new-instance v3, Landroid/content/ContentValues;

    .line 91
    .line 92
    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 93
    .line 94
    .line 95
    const-string v4, "app_id"

    .line 96
    .line 97
    invoke-virtual {v3, v4, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iget-object p1, p1, Lce3;->b:Ljava/lang/String;

    .line 101
    .line 102
    const-string v4, "dma_consent_settings"

    .line 103
    .line 104
    invoke-virtual {v3, v4, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v3}, Lae3;->Y(Landroid/content/ContentValues;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v6}, Lmp3;->o0(Ljava/lang/String;)Landroid/os/Bundle;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-static {v1, p1}, Lce3;->c(ILandroid/os/Bundle;)Lce3;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {p1}, Lce3;->a()Llk3;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v1}, Lbj3;->y()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Lmp3;->k0()V

    .line 130
    .line 131
    .line 132
    const/4 v1, 0x1

    .line 133
    sget-object v2, Llk3;->e:Llk3;

    .line 134
    .line 135
    const/4 v3, 0x0

    .line 136
    sget-object v4, Llk3;->d:Llk3;

    .line 137
    .line 138
    if-ne v0, v4, :cond_1

    .line 139
    .line 140
    if-ne p1, v2, :cond_1

    .line 141
    .line 142
    move v5, v1

    .line 143
    goto :goto_0

    .line 144
    :cond_1
    move v5, v3

    .line 145
    :goto_0
    if-ne v0, v2, :cond_2

    .line 146
    .line 147
    if-ne p1, v4, :cond_2

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_2
    move v1, v3

    .line 151
    :goto_1
    if-nez v5, :cond_4

    .line 152
    .line 153
    if-eqz v1, :cond_3

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_3
    return-void

    .line 157
    :cond_4
    :goto_2
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    iget-object p1, p1, Luh3;->Y:Lsh3;

    .line 162
    .line 163
    const-string v0, "Generated _dcu event for"

    .line 164
    .line 165
    invoke-virtual {p1, v6, v0}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    new-instance p1, Landroid/os/Bundle;

    .line 169
    .line 170
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 171
    .line 172
    .line 173
    iget-object v1, p0, Lmp3;->c:Lae3;

    .line 174
    .line 175
    invoke-static {v1}, Lmp3;->S(Lwo3;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, Lmp3;->g()J

    .line 179
    .line 180
    .line 181
    move-result-wide v7

    .line 182
    const/4 v4, 0x0

    .line 183
    const/4 v5, 0x0

    .line 184
    const/4 v2, 0x0

    .line 185
    const/4 v3, 0x0

    .line 186
    invoke-virtual/range {v1 .. v8}, Lae3;->F0(ZZZZLjava/lang/String;J)Lud3;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    iget-wide v0, v0, Lud3;->f:J

    .line 191
    .line 192
    invoke-virtual {p0}, Lmp3;->d0()Lpd3;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    sget-object v3, Lvg3;->m0:Lug3;

    .line 197
    .line 198
    invoke-virtual {v2, v6, v3}, Lpd3;->H(Ljava/lang/String;Lug3;)I

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    int-to-long v2, v2

    .line 203
    cmp-long v0, v0, v2

    .line 204
    .line 205
    if-gez v0, :cond_5

    .line 206
    .line 207
    const-string v0, "_r"

    .line 208
    .line 209
    const-wide/16 v1, 0x1

    .line 210
    .line 211
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 212
    .line 213
    .line 214
    iget-object v1, p0, Lmp3;->c:Lae3;

    .line 215
    .line 216
    invoke-static {v1}, Lmp3;->S(Lwo3;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0}, Lmp3;->g()J

    .line 220
    .line 221
    .line 222
    move-result-wide v7

    .line 223
    const/4 v4, 0x1

    .line 224
    const/4 v5, 0x0

    .line 225
    const/4 v2, 0x0

    .line 226
    const/4 v3, 0x0

    .line 227
    invoke-virtual/range {v1 .. v8}, Lae3;->F0(ZZZZLjava/lang/String;J)Lud3;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    iget-object v1, v1, Luh3;->Y:Lsh3;

    .line 236
    .line 237
    iget-wide v2, v0, Lud3;->f:J

    .line 238
    .line 239
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    const-string v2, "_dcu realtime event count"

    .line 244
    .line 245
    invoke-virtual {v1, v6, v2, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    :cond_5
    iget-object p0, p0, Lmp3;->u0:Lac3;

    .line 249
    .line 250
    const-string v0, "_dcu"

    .line 251
    .line 252
    invoke-virtual {p0, v6, v0, p1}, Lac3;->e(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 253
    .line 254
    .line 255
    return-void
.end method

.method public final n(Ldi3;Lcom/google/android/gms/internal/measurement/zzic;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Lmp3;->b()Lbj3;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Lbj3;->y()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lmp3;->k0()V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzha;->zzr()Lcom/google/android/gms/internal/measurement/zzgx;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v3, v1, Ldi3;->a:Lij3;

    .line 20
    .line 21
    iget-object v4, v3, Lij3;->i:Lbj3;

    .line 22
    .line 23
    invoke-static {v4}, Lij3;->l(Lhk3;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4}, Lbj3;->y()V

    .line 27
    .line 28
    .line 29
    iget-object v4, v1, Ldi3;->H:[B

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    :try_start_0
    invoke-static {v2, v4}, Lci3;->m0(Lcom/google/android/gms/internal/measurement/zzma;[B)Lcom/google/android/gms/internal/measurement/zznk;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzgx;
    :try_end_0
    .catch Lcom/google/android/gms/internal/measurement/zzmq; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    move-object v2, v4

    .line 40
    goto :goto_0

    .line 41
    :catch_0
    invoke-virtual {v0}, Lmp3;->a()Luh3;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    iget-object v4, v4, Luh3;->w:Lsh3;

    .line 46
    .line 47
    invoke-virtual {v1}, Ldi3;->D()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-static {v5}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    const-string v6, "Failed to parse locally stored ad campaign info. appId"

    .line 56
    .line 57
    invoke-virtual {v4, v5, v6}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    :goto_0
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/measurement/zzic;->zzb()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    const/4 v6, 0x0

    .line 73
    if-eqz v5, :cond_15

    .line 74
    .line 75
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    check-cast v5, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 80
    .line 81
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhs;->zzd()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    const-string v8, "_cmp"

    .line 86
    .line 87
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    if-eqz v7, :cond_1

    .line 92
    .line 93
    const-string v7, "gclid"

    .line 94
    .line 95
    invoke-static {v5, v7}, Lci3;->H(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    if-nez v7, :cond_2

    .line 100
    .line 101
    move-object v7, v6

    .line 102
    goto :goto_2

    .line 103
    :cond_2
    invoke-static {v7}, Lci3;->O(Lcom/google/android/gms/internal/measurement/zzhw;)Ljava/io/Serializable;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    :goto_2
    const-string v8, ""

    .line 108
    .line 109
    if-nez v7, :cond_3

    .line 110
    .line 111
    move-object v7, v8

    .line 112
    :cond_3
    check-cast v7, Ljava/lang/String;

    .line 113
    .line 114
    const-string v9, "gbraid"

    .line 115
    .line 116
    invoke-static {v5, v9}, Lci3;->H(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    if-nez v9, :cond_4

    .line 121
    .line 122
    move-object v9, v6

    .line 123
    goto :goto_3

    .line 124
    :cond_4
    invoke-static {v9}, Lci3;->O(Lcom/google/android/gms/internal/measurement/zzhw;)Ljava/io/Serializable;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    :goto_3
    if-nez v9, :cond_5

    .line 129
    .line 130
    move-object v9, v8

    .line 131
    :cond_5
    check-cast v9, Ljava/lang/String;

    .line 132
    .line 133
    const-string v10, "gad_source"

    .line 134
    .line 135
    invoke-static {v5, v10}, Lci3;->H(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    if-nez v10, :cond_6

    .line 140
    .line 141
    move-object v10, v6

    .line 142
    goto :goto_4

    .line 143
    :cond_6
    invoke-static {v10}, Lci3;->O(Lcom/google/android/gms/internal/measurement/zzhw;)Ljava/io/Serializable;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    :goto_4
    if-nez v10, :cond_7

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_7
    move-object v8, v10

    .line 151
    :goto_5
    check-cast v8, Ljava/lang/String;

    .line 152
    .line 153
    sget-object v10, Lvg3;->h1:Lug3;

    .line 154
    .line 155
    invoke-virtual {v10, v6}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v10

    .line 159
    check-cast v10, Ljava/lang/String;

    .line 160
    .line 161
    const-string v11, ","

    .line 162
    .line 163
    invoke-virtual {v10, v11}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v10

    .line 167
    invoke-virtual {v0}, Lmp3;->i0()Lci3;

    .line 168
    .line 169
    .line 170
    new-instance v11, Ljava/util/HashMap;

    .line 171
    .line 172
    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhs;->zza()Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    :cond_8
    :goto_6
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 184
    .line 185
    .line 186
    move-result v13

    .line 187
    if-eqz v13, :cond_9

    .line 188
    .line 189
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v13

    .line 193
    check-cast v13, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 194
    .line 195
    invoke-static {v10}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object v14

    .line 199
    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/zzhw;->zzb()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v15

    .line 203
    invoke-interface {v14, v15}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v14

    .line 207
    if-eqz v14, :cond_8

    .line 208
    .line 209
    invoke-static {v13}, Lci3;->O(Lcom/google/android/gms/internal/measurement/zzhw;)Ljava/io/Serializable;

    .line 210
    .line 211
    .line 212
    move-result-object v14

    .line 213
    if-eqz v14, :cond_8

    .line 214
    .line 215
    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/zzhw;->zzb()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v13

    .line 219
    invoke-virtual {v11, v13, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_9
    invoke-virtual {v11}, Ljava/util/HashMap;->isEmpty()Z

    .line 224
    .line 225
    .line 226
    move-result v10

    .line 227
    if-nez v10, :cond_1

    .line 228
    .line 229
    const-wide/16 v10, 0x0

    .line 230
    .line 231
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 232
    .line 233
    .line 234
    move-result-object v12

    .line 235
    const-string v13, "click_timestamp"

    .line 236
    .line 237
    invoke-static {v5, v13}, Lci3;->H(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 238
    .line 239
    .line 240
    move-result-object v13

    .line 241
    if-nez v13, :cond_a

    .line 242
    .line 243
    move-object v13, v6

    .line 244
    goto :goto_7

    .line 245
    :cond_a
    invoke-static {v13}, Lci3;->O(Lcom/google/android/gms/internal/measurement/zzhw;)Ljava/io/Serializable;

    .line 246
    .line 247
    .line 248
    move-result-object v13

    .line 249
    :goto_7
    if-nez v13, :cond_b

    .line 250
    .line 251
    goto :goto_8

    .line 252
    :cond_b
    move-object v12, v13

    .line 253
    :goto_8
    check-cast v12, Ljava/lang/Long;

    .line 254
    .line 255
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 256
    .line 257
    .line 258
    move-result-wide v12

    .line 259
    cmp-long v10, v12, v10

    .line 260
    .line 261
    if-gtz v10, :cond_c

    .line 262
    .line 263
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhs;->zzf()J

    .line 264
    .line 265
    .line 266
    move-result-wide v12

    .line 267
    :cond_c
    const-string v10, "_cis"

    .line 268
    .line 269
    invoke-static {v5, v10}, Lci3;->H(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 270
    .line 271
    .line 272
    move-result-object v10

    .line 273
    if-nez v10, :cond_d

    .line 274
    .line 275
    goto :goto_9

    .line 276
    :cond_d
    invoke-static {v10}, Lci3;->O(Lcom/google/android/gms/internal/measurement/zzhw;)Ljava/io/Serializable;

    .line 277
    .line 278
    .line 279
    move-result-object v6

    .line 280
    :goto_9
    const-string v10, "referrer API v2"

    .line 281
    .line 282
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    if-eqz v6, :cond_11

    .line 287
    .line 288
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgx;->zzo()J

    .line 289
    .line 290
    .line 291
    move-result-wide v10

    .line 292
    cmp-long v6, v12, v10

    .line 293
    .line 294
    if-lez v6, :cond_1

    .line 295
    .line 296
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 297
    .line 298
    .line 299
    move-result v6

    .line 300
    if-eqz v6, :cond_e

    .line 301
    .line 302
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgx;->zzj()Lcom/google/android/gms/internal/measurement/zzgx;

    .line 303
    .line 304
    .line 305
    goto :goto_a

    .line 306
    :cond_e
    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/zzgx;->zzi(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgx;

    .line 307
    .line 308
    .line 309
    :goto_a
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    .line 310
    .line 311
    .line 312
    move-result v6

    .line 313
    if-eqz v6, :cond_f

    .line 314
    .line 315
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgx;->zzl()Lcom/google/android/gms/internal/measurement/zzgx;

    .line 316
    .line 317
    .line 318
    goto :goto_b

    .line 319
    :cond_f
    invoke-virtual {v2, v9}, Lcom/google/android/gms/internal/measurement/zzgx;->zzk(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgx;

    .line 320
    .line 321
    .line 322
    :goto_b
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    .line 323
    .line 324
    .line 325
    move-result v6

    .line 326
    if-eqz v6, :cond_10

    .line 327
    .line 328
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgx;->zzn()Lcom/google/android/gms/internal/measurement/zzgx;

    .line 329
    .line 330
    .line 331
    goto :goto_c

    .line 332
    :cond_10
    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/zzgx;->zzm(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgx;

    .line 333
    .line 334
    .line 335
    :goto_c
    invoke-virtual {v2, v12, v13}, Lcom/google/android/gms/internal/measurement/zzgx;->zzp(J)Lcom/google/android/gms/internal/measurement/zzgx;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgx;->zzs()Lcom/google/android/gms/internal/measurement/zzgx;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0, v5}, Lmp3;->E(Lcom/google/android/gms/internal/measurement/zzhs;)Ljava/util/HashMap;

    .line 342
    .line 343
    .line 344
    move-result-object v5

    .line 345
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/measurement/zzgx;->zzt(Ljava/util/Map;)Lcom/google/android/gms/internal/measurement/zzgx;

    .line 346
    .line 347
    .line 348
    goto/16 :goto_1

    .line 349
    .line 350
    :cond_11
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgx;->zzg()J

    .line 351
    .line 352
    .line 353
    move-result-wide v10

    .line 354
    cmp-long v6, v12, v10

    .line 355
    .line 356
    if-lez v6, :cond_1

    .line 357
    .line 358
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 359
    .line 360
    .line 361
    move-result v6

    .line 362
    if-eqz v6, :cond_12

    .line 363
    .line 364
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgx;->zzb()Lcom/google/android/gms/internal/measurement/zzgx;

    .line 365
    .line 366
    .line 367
    goto :goto_d

    .line 368
    :cond_12
    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/zzgx;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgx;

    .line 369
    .line 370
    .line 371
    :goto_d
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    .line 372
    .line 373
    .line 374
    move-result v6

    .line 375
    if-eqz v6, :cond_13

    .line 376
    .line 377
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgx;->zzd()Lcom/google/android/gms/internal/measurement/zzgx;

    .line 378
    .line 379
    .line 380
    goto :goto_e

    .line 381
    :cond_13
    invoke-virtual {v2, v9}, Lcom/google/android/gms/internal/measurement/zzgx;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgx;

    .line 382
    .line 383
    .line 384
    :goto_e
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    .line 385
    .line 386
    .line 387
    move-result v6

    .line 388
    if-eqz v6, :cond_14

    .line 389
    .line 390
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgx;->zzf()Lcom/google/android/gms/internal/measurement/zzgx;

    .line 391
    .line 392
    .line 393
    goto :goto_f

    .line 394
    :cond_14
    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/zzgx;->zze(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgx;

    .line 395
    .line 396
    .line 397
    :goto_f
    invoke-virtual {v2, v12, v13}, Lcom/google/android/gms/internal/measurement/zzgx;->zzh(J)Lcom/google/android/gms/internal/measurement/zzgx;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgx;->zzq()Lcom/google/android/gms/internal/measurement/zzgx;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0, v5}, Lmp3;->E(Lcom/google/android/gms/internal/measurement/zzhs;)Ljava/util/HashMap;

    .line 404
    .line 405
    .line 406
    move-result-object v5

    .line 407
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/measurement/zzgx;->zzr(Ljava/util/Map;)Lcom/google/android/gms/internal/measurement/zzgx;

    .line 408
    .line 409
    .line 410
    goto/16 :goto_1

    .line 411
    .line 412
    :cond_15
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzha;

    .line 417
    .line 418
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzha;->zzs()Lcom/google/android/gms/internal/measurement/zzha;

    .line 419
    .line 420
    .line 421
    move-result-object v5

    .line 422
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/zzme;->equals(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v4

    .line 426
    if-nez v4, :cond_16

    .line 427
    .line 428
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 429
    .line 430
    .line 431
    move-result-object v4

    .line 432
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzha;

    .line 433
    .line 434
    move-object/from16 v5, p2

    .line 435
    .line 436
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/measurement/zzic;->zzaM(Lcom/google/android/gms/internal/measurement/zzha;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 437
    .line 438
    .line 439
    :cond_16
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzha;

    .line 444
    .line 445
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzkr;->zzcc()[B

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    iget-object v3, v3, Lij3;->i:Lbj3;

    .line 450
    .line 451
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v3}, Lbj3;->y()V

    .line 455
    .line 456
    .line 457
    iget-boolean v3, v1, Ldi3;->Q:Z

    .line 458
    .line 459
    iget-object v4, v1, Ldi3;->H:[B

    .line 460
    .line 461
    const/4 v5, 0x0

    .line 462
    if-eq v4, v2, :cond_17

    .line 463
    .line 464
    const/4 v4, 0x1

    .line 465
    goto :goto_10

    .line 466
    :cond_17
    move v4, v5

    .line 467
    :goto_10
    or-int/2addr v3, v4

    .line 468
    iput-boolean v3, v1, Ldi3;->Q:Z

    .line 469
    .line 470
    iput-object v2, v1, Ldi3;->H:[B

    .line 471
    .line 472
    invoke-virtual {v1}, Ldi3;->o()Z

    .line 473
    .line 474
    .line 475
    move-result v2

    .line 476
    if-eqz v2, :cond_18

    .line 477
    .line 478
    iget-object v2, v0, Lmp3;->c:Lae3;

    .line 479
    .line 480
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v2, v1, v5}, Lae3;->E0(Ldi3;Z)V

    .line 484
    .line 485
    .line 486
    :cond_18
    invoke-virtual {v0}, Lmp3;->d0()Lpd3;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    sget-object v3, Lvg3;->g1:Lug3;

    .line 491
    .line 492
    invoke-virtual {v2, v6, v3}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 493
    .line 494
    .line 495
    move-result v2

    .line 496
    if-eqz v2, :cond_19

    .line 497
    .line 498
    iget-object v0, v0, Lmp3;->c:Lae3;

    .line 499
    .line 500
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v1}, Ldi3;->D()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    const-string v2, "_lgclid"

    .line 508
    .line 509
    invoke-virtual {v0, v1, v2}, Lae3;->t0(Ljava/lang/String;Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    :cond_19
    return-void
.end method

.method public final n0(Ljava/lang/String;)Lce3;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lbj3;->y()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lmp3;->k0()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lmp3;->n0:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lce3;

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Lmp3;->c:Lae3;

    .line 22
    .line 23
    invoke-static {p0}, Lmp3;->S(Lwo3;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lsq3;->y()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lwo3;->A()V

    .line 33
    .line 34
    .line 35
    filled-new-array {p1}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "select dma_consent_settings from consent_settings where app_id=? limit 1;"

    .line 40
    .line 41
    invoke-virtual {p0, v2, v1}, Lae3;->X(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0}, Lce3;->b(Ljava/lang/String;)Lce3;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {v0, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_0
    return-object v1
.end method

.method public final o(Lok3;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lnk3;->c:Lnk3;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lok3;->i(Lnk3;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/16 p1, 0x10

    .line 10
    .line 11
    new-array p1, p1, [B

    .line 12
    .line 13
    invoke-virtual {p0}, Lmp3;->j0()Lup3;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Lup3;->w0()Ljava/security/SecureRandom;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0, p1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 25
    .line 26
    new-instance v0, Ljava/math/BigInteger;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, v1, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 30
    .line 31
    .line 32
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string v0, "%032x"

    .line 37
    .line 38
    invoke-static {p0, v0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_0
    const/4 p0, 0x0

    .line 44
    return-object p0
.end method

.method public final o0(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 11

    .line 1
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lbj3;->y()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lmp3;->k0()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lmp3;->a:Lvi3;

    .line 12
    .line 13
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lvi3;->U(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgf;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 25
    .line 26
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lmp3;->d(Ljava/lang/String;)Lok3;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    new-instance v3, Landroid/os/Bundle;

    .line 34
    .line 35
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 36
    .line 37
    .line 38
    iget-object v4, v2, Lok3;->a:Ljava/util/EnumMap;

    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/util/EnumMap;->entrySet()Ljava/util/Set;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    const/4 v6, 0x3

    .line 53
    const/4 v7, 0x2

    .line 54
    const-string v8, "denied"

    .line 55
    .line 56
    const-string v9, "granted"

    .line 57
    .line 58
    if-eqz v5, :cond_4

    .line 59
    .line 60
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    check-cast v5, Ljava/util/Map$Entry;

    .line 65
    .line 66
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    check-cast v10, Llk3;

    .line 71
    .line 72
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    if-eq v10, v7, :cond_3

    .line 77
    .line 78
    if-eq v10, v6, :cond_2

    .line 79
    .line 80
    move-object v8, v1

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    move-object v8, v9

    .line 83
    :cond_3
    :goto_1
    if-eqz v8, :cond_1

    .line 84
    .line 85
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    check-cast v5, Lnk3;

    .line 90
    .line 91
    iget-object v5, v5, Lnk3;->a:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v3, v5, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_4
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, p1}, Lmp3;->n0(Ljava/lang/String;)Lce3;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    new-instance v4, Lac3;

    .line 105
    .line 106
    invoke-direct {v4}, Lac3;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, p1, v3, v2, v4}, Lmp3;->p0(Ljava/lang/String;Lce3;Lok3;Lac3;)Lce3;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    new-instance v3, Landroid/os/Bundle;

    .line 114
    .line 115
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 116
    .line 117
    .line 118
    iget-object v4, v2, Lce3;->e:Ljava/util/EnumMap;

    .line 119
    .line 120
    invoke-virtual {v4}, Ljava/util/EnumMap;->entrySet()Ljava/util/Set;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    :cond_5
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    if-eqz v5, :cond_8

    .line 133
    .line 134
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    check-cast v5, Ljava/util/Map$Entry;

    .line 139
    .line 140
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    check-cast v10, Llk3;

    .line 145
    .line 146
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    if-eq v10, v7, :cond_7

    .line 151
    .line 152
    if-eq v10, v6, :cond_6

    .line 153
    .line 154
    move-object v10, v1

    .line 155
    goto :goto_3

    .line 156
    :cond_6
    move-object v10, v9

    .line 157
    goto :goto_3

    .line 158
    :cond_7
    move-object v10, v8

    .line 159
    :goto_3
    if-eqz v10, :cond_5

    .line 160
    .line 161
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    check-cast v5, Lnk3;

    .line 166
    .line 167
    iget-object v5, v5, Lnk3;->a:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v3, v5, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_8
    iget-object v1, v2, Lce3;->c:Ljava/lang/Boolean;

    .line 174
    .line 175
    if-eqz v1, :cond_9

    .line 176
    .line 177
    const-string v4, "is_dma_region"

    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-virtual {v3, v4, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    :cond_9
    iget-object v1, v2, Lce3;->d:Ljava/lang/String;

    .line 187
    .line 188
    if-eqz v1, :cond_a

    .line 189
    .line 190
    const-string v2, "cps_display_str"

    .line 191
    .line 192
    invoke-virtual {v3, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    :cond_a
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 196
    .line 197
    .line 198
    iget-object v1, p0, Lmp3;->c:Lae3;

    .line 199
    .line 200
    invoke-static {v1}, Lmp3;->S(Lwo3;)V

    .line 201
    .line 202
    .line 203
    const-string v2, "_npa"

    .line 204
    .line 205
    invoke-virtual {v1, p1, v2}, Lae3;->v0(Ljava/lang/String;Ljava/lang/String;)Lrp3;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    if-eqz v1, :cond_b

    .line 210
    .line 211
    iget-object p0, v1, Lrp3;->e:Ljava/lang/Object;

    .line 212
    .line 213
    const-wide/16 v1, 0x1

    .line 214
    .line 215
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    goto :goto_4

    .line 224
    :cond_b
    new-instance v1, Lac3;

    .line 225
    .line 226
    invoke-direct {v1}, Lac3;-><init>()V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0, p1, v1}, Lmp3;->D(Ljava/lang/String;Lac3;)I

    .line 230
    .line 231
    .line 232
    move-result p0

    .line 233
    :goto_4
    const/4 p1, 0x1

    .line 234
    if-eq p1, p0, :cond_c

    .line 235
    .line 236
    move-object v8, v9

    .line 237
    :cond_c
    const-string p0, "ad_personalization"

    .line 238
    .line 239
    invoke-virtual {v0, p0, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    return-object v0
.end method

.method public final p(Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-static {v0}, Lkb1;->g(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lmp3;->j0:Ljava/util/ArrayList;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    iget-object p0, p0, Luh3;->f:Lsh3;

    .line 19
    .line 20
    const-string p1, "Set uploading progress before finishing the previous upload"

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lsh3;->a(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lmp3;->j0:Ljava/util/ArrayList;

    .line 32
    .line 33
    return-void
.end method

.method public final p0(Ljava/lang/String;Lce3;Lok3;Lac3;)Lce3;
    .locals 10

    .line 1
    iget-object p0, p0, Lmp3;->a:Lvi3;

    .line 2
    .line 3
    invoke-static {p0}, Lmp3;->S(Lwo3;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lvi3;->U(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgf;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "-"

    .line 11
    .line 12
    const/16 v2, 0x5a

    .line 13
    .line 14
    sget-object v3, Llk3;->d:Llk3;

    .line 15
    .line 16
    sget-object v4, Lnk3;->d:Lnk3;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p2}, Lce3;->a()Llk3;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-ne p0, v3, :cond_0

    .line 25
    .line 26
    iget v2, p2, Lce3;->a:I

    .line 27
    .line 28
    invoke-virtual {p4, v4, v2}, Lac3;->f(Lnk3;I)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    sget-object p0, Lrd3;->U:Lrd3;

    .line 33
    .line 34
    invoke-virtual {p4, v4, p0}, Lac3;->g(Lnk3;Lrd3;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    new-instance p0, Lce3;

    .line 38
    .line 39
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 40
    .line 41
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-direct {p0, p1, v2, p2, v1}, Lce3;-><init>(Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_1
    invoke-virtual {p2}, Lce3;->a()Llk3;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const/4 v5, 0x0

    .line 52
    const/4 v6, 0x1

    .line 53
    sget-object v7, Llk3;->e:Llk3;

    .line 54
    .line 55
    if-eq v0, v7, :cond_c

    .line 56
    .line 57
    if-ne v0, v3, :cond_2

    .line 58
    .line 59
    goto/16 :goto_5

    .line 60
    .line 61
    :cond_2
    sget-object p2, Llk3;->c:Llk3;

    .line 62
    .line 63
    sget-object v8, Llk3;->b:Llk3;

    .line 64
    .line 65
    if-ne v0, p2, :cond_3

    .line 66
    .line 67
    invoke-virtual {p0, p1, v4}, Lvi3;->D(Ljava/lang/String;Lnk3;)Llk3;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    if-eq p2, v8, :cond_3

    .line 72
    .line 73
    sget-object p3, Lrd3;->w:Lrd3;

    .line 74
    .line 75
    invoke-virtual {p4, v4, p3}, Lac3;->g(Lnk3;Lrd3;)V

    .line 76
    .line 77
    .line 78
    move-object v0, p2

    .line 79
    goto/16 :goto_6

    .line 80
    .line 81
    :cond_3
    invoke-virtual {p0}, Lsq3;->y()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p1}, Lvi3;->F(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1}, Lvi3;->U(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgf;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    if-nez p2, :cond_4

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzgf;->zzb()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_6

    .line 107
    .line 108
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfw;

    .line 113
    .line 114
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfw;->zzb()I

    .line 115
    .line 116
    .line 117
    move-result v9

    .line 118
    invoke-static {v9}, Lvi3;->K(I)Lnk3;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    if-ne v4, v9, :cond_5

    .line 123
    .line 124
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfw;->zzc()I

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    invoke-static {p2}, Lvi3;->K(I)Lnk3;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    goto :goto_2

    .line 133
    :cond_6
    :goto_1
    const/4 p2, 0x0

    .line 134
    :goto_2
    iget-object p3, p3, Lok3;->a:Ljava/util/EnumMap;

    .line 135
    .line 136
    sget-object v0, Lnk3;->b:Lnk3;

    .line 137
    .line 138
    invoke-virtual {p3, v0}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p3

    .line 142
    check-cast p3, Llk3;

    .line 143
    .line 144
    if-nez p3, :cond_7

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_7
    move-object v8, p3

    .line 148
    :goto_3
    if-eq v8, v7, :cond_8

    .line 149
    .line 150
    if-ne v8, v3, :cond_9

    .line 151
    .line 152
    :cond_8
    move p3, v6

    .line 153
    goto :goto_4

    .line 154
    :cond_9
    move p3, v5

    .line 155
    :goto_4
    if-ne p2, v0, :cond_a

    .line 156
    .line 157
    if-eqz p3, :cond_a

    .line 158
    .line 159
    sget-object p2, Lrd3;->d:Lrd3;

    .line 160
    .line 161
    invoke-virtual {p4, v4, p2}, Lac3;->g(Lnk3;Lrd3;)V

    .line 162
    .line 163
    .line 164
    move-object v0, v8

    .line 165
    goto :goto_6

    .line 166
    :cond_a
    sget-object p2, Lrd3;->c:Lrd3;

    .line 167
    .line 168
    invoke-virtual {p4, v4, p2}, Lac3;->g(Lnk3;Lrd3;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0, p1, v4}, Lvi3;->T(Ljava/lang/String;Lnk3;)Z

    .line 172
    .line 173
    .line 174
    move-result p2

    .line 175
    if-eq v6, p2, :cond_b

    .line 176
    .line 177
    move-object v0, v3

    .line 178
    goto :goto_6

    .line 179
    :cond_b
    move-object v0, v7

    .line 180
    goto :goto_6

    .line 181
    :cond_c
    :goto_5
    iget v2, p2, Lce3;->a:I

    .line 182
    .line 183
    invoke-virtual {p4, v4, v2}, Lac3;->f(Lnk3;I)V

    .line 184
    .line 185
    .line 186
    :goto_6
    invoke-virtual {p0}, Lsq3;->y()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0, p1}, Lvi3;->F(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, p1}, Lvi3;->U(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgf;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    if-nez p2, :cond_d

    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_d
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzgf;->zzd()Z

    .line 200
    .line 201
    .line 202
    move-result p3

    .line 203
    if-eqz p3, :cond_e

    .line 204
    .line 205
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzgf;->zze()Z

    .line 206
    .line 207
    .line 208
    move-result p2

    .line 209
    if-eqz p2, :cond_f

    .line 210
    .line 211
    :cond_e
    :goto_7
    move v5, v6

    .line 212
    :cond_f
    invoke-static {p0}, Lmp3;->S(Lwo3;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0}, Lsq3;->y()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0, p1}, Lvi3;->F(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    new-instance p2, Ljava/util/TreeSet;

    .line 222
    .line 223
    invoke-direct {p2}, Ljava/util/TreeSet;-><init>()V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0, p1}, Lvi3;->U(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgf;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    if-nez p0, :cond_10

    .line 231
    .line 232
    goto :goto_9

    .line 233
    :cond_10
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgf;->zzc()Ljava/util/List;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    if-eqz p1, :cond_11

    .line 246
    .line 247
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzgc;

    .line 252
    .line 253
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgc;->zza()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    invoke-virtual {p2, p1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    goto :goto_8

    .line 261
    :cond_11
    :goto_9
    if-eq v0, v3, :cond_14

    .line 262
    .line 263
    invoke-virtual {p2}, Ljava/util/TreeSet;->isEmpty()Z

    .line 264
    .line 265
    .line 266
    move-result p0

    .line 267
    if-eqz p0, :cond_12

    .line 268
    .line 269
    goto :goto_a

    .line 270
    :cond_12
    new-instance p0, Lce3;

    .line 271
    .line 272
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 273
    .line 274
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 275
    .line 276
    .line 277
    move-result-object p3

    .line 278
    const-string p4, ""

    .line 279
    .line 280
    if-eqz v5, :cond_13

    .line 281
    .line 282
    invoke-static {p4, p2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object p4

    .line 286
    :cond_13
    invoke-direct {p0, p1, v2, p3, p4}, Lce3;-><init>(Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    return-object p0

    .line 290
    :cond_14
    :goto_a
    new-instance p0, Lce3;

    .line 291
    .line 292
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 293
    .line 294
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 295
    .line 296
    .line 297
    move-result-object p2

    .line 298
    invoke-direct {p0, p1, v2, p2, v1}, Lce3;-><init>(Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    return-object p0
.end method

.method public final q()V
    .locals 11

    .line 1
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lbj3;->y()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lmp3;->k0()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lmp3;->g0:Z

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :try_start_0
    iget-object v1, p0, Lmp3;->W:Lij3;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lij3;->o()Lpn3;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v1, v1, Lpn3;->e:Ljava/lang/Boolean;

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v1, v1, Luh3;->w:Lsh3;

    .line 33
    .line 34
    const-string v2, "Upload data called on the client side before use of service was decided"

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Lsh3;->a(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_9

    .line 40
    .line 41
    :catchall_0
    move-exception v1

    .line 42
    goto/16 :goto_b

    .line 43
    .line 44
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v1, v1, Luh3;->f:Lsh3;

    .line 55
    .line 56
    const-string v2, "Upload called in the client side when service should be used"

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Lsh3;->a(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_9

    .line 62
    .line 63
    :cond_1
    iget-wide v1, p0, Lmp3;->Z:J

    .line 64
    .line 65
    const-wide/16 v3, 0x0

    .line 66
    .line 67
    cmp-long v1, v1, v3

    .line 68
    .line 69
    if-lez v1, :cond_2

    .line 70
    .line 71
    invoke-virtual {p0}, Lmp3;->L()V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_9

    .line 75
    .line 76
    :cond_2
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v1}, Lbj3;->y()V

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, Lmp3;->j0:Ljava/util/ArrayList;

    .line 84
    .line 85
    if-eqz v1, :cond_3

    .line 86
    .line 87
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iget-object v1, v1, Luh3;->Y:Lsh3;

    .line 92
    .line 93
    const-string v2, "Uploading requested multiple times"

    .line 94
    .line 95
    invoke-virtual {v1, v2}, Lsh3;->a(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto/16 :goto_9

    .line 99
    .line 100
    :cond_3
    iget-object v1, p0, Lmp3;->b:Lci3;

    .line 101
    .line 102
    invoke-static {v1}, Lmp3;->S(Lwo3;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Lci3;->T()Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_4

    .line 110
    .line 111
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    iget-object v1, v1, Luh3;->Y:Lsh3;

    .line 116
    .line 117
    const-string v2, "Network not connected, ignoring upload request"

    .line 118
    .line 119
    invoke-virtual {v1, v2}, Lsh3;->a(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Lmp3;->L()V

    .line 123
    .line 124
    .line 125
    goto/16 :goto_9

    .line 126
    .line 127
    :cond_4
    invoke-virtual {p0}, Lmp3;->f()Lxv;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    check-cast v1, Lxt0;

    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 137
    .line 138
    .line 139
    move-result-wide v1

    .line 140
    invoke-virtual {p0}, Lmp3;->d0()Lpd3;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    sget-object v6, Lvg3;->i0:Lug3;

    .line 145
    .line 146
    const/4 v7, 0x0

    .line 147
    invoke-virtual {v5, v7, v6}, Lpd3;->H(Ljava/lang/String;Lug3;)I

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    invoke-virtual {p0}, Lmp3;->d0()Lpd3;

    .line 152
    .line 153
    .line 154
    sget-object v6, Lvg3;->e:Lug3;

    .line 155
    .line 156
    invoke-virtual {v6, v7}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    check-cast v6, Ljava/lang/Long;

    .line 161
    .line 162
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 163
    .line 164
    .line 165
    move-result-wide v8

    .line 166
    sub-long v8, v1, v8

    .line 167
    .line 168
    move v6, v0

    .line 169
    :goto_0
    if-ge v6, v5, :cond_5

    .line 170
    .line 171
    invoke-virtual {p0, v7, v8, v9}, Lmp3;->G(Ljava/lang/String;J)Z

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    if-eqz v10, :cond_5

    .line 176
    .line 177
    add-int/lit8 v6, v6, 0x1

    .line 178
    .line 179
    goto :goto_0

    .line 180
    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzql;->zza()Z

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    invoke-virtual {v5}, Lbj3;->y()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0}, Lmp3;->F()V

    .line 191
    .line 192
    .line 193
    iget-object v5, p0, Lmp3;->w:Ltn3;

    .line 194
    .line 195
    iget-object v5, v5, Ltn3;->v:Lio/sentry/android/core/s;

    .line 196
    .line 197
    invoke-virtual {v5}, Lio/sentry/android/core/s;->a()J

    .line 198
    .line 199
    .line 200
    move-result-wide v5

    .line 201
    cmp-long v3, v5, v3

    .line 202
    .line 203
    if-eqz v3, :cond_6

    .line 204
    .line 205
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    iget-object v3, v3, Luh3;->X:Lsh3;

    .line 210
    .line 211
    const-string v4, "Uploading events. Elapsed time since last upload attempt (ms)"

    .line 212
    .line 213
    sub-long v5, v1, v5

    .line 214
    .line 215
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    .line 216
    .line 217
    .line 218
    move-result-wide v5

    .line 219
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    invoke-virtual {v3, v5, v4}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    :cond_6
    iget-object v3, p0, Lmp3;->c:Lae3;

    .line 227
    .line 228
    invoke-static {v3}, Lmp3;->S(Lwo3;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v3}, Lae3;->H()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    const-wide/16 v5, -0x1

    .line 240
    .line 241
    if-nez v4, :cond_b

    .line 242
    .line 243
    iget-wide v8, p0, Lmp3;->l0:J

    .line 244
    .line 245
    cmp-long v4, v8, v5

    .line 246
    .line 247
    if-nez v4, :cond_a

    .line 248
    .line 249
    iget-object v4, p0, Lmp3;->c:Lae3;

    .line 250
    .line 251
    invoke-static {v4}, Lmp3;->S(Lwo3;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 252
    .line 253
    .line 254
    :try_start_1
    invoke-virtual {v4}, Lae3;->q0()Landroid/database/sqlite/SQLiteDatabase;

    .line 255
    .line 256
    .line 257
    move-result-object v8

    .line 258
    const-string v9, "select rowid from raw_events order by rowid desc limit 1;"

    .line 259
    .line 260
    invoke-virtual {v8, v9, v7}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 261
    .line 262
    .line 263
    move-result-object v7

    .line 264
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    .line 265
    .line 266
    .line 267
    move-result v8
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 268
    if-nez v8, :cond_7

    .line 269
    .line 270
    :goto_1
    :try_start_2
    invoke-interface {v7}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 271
    .line 272
    .line 273
    goto :goto_2

    .line 274
    :cond_7
    :try_start_3
    invoke-interface {v7, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 275
    .line 276
    .line 277
    move-result-wide v5
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 278
    goto :goto_1

    .line 279
    :catchall_1
    move-exception v1

    .line 280
    goto :goto_3

    .line 281
    :catch_0
    move-exception v8

    .line 282
    :try_start_4
    iget-object v4, v4, Lsq3;->a:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v4, Lij3;

    .line 285
    .line 286
    iget-object v4, v4, Lij3;->f:Luh3;

    .line 287
    .line 288
    invoke-static {v4}, Lij3;->l(Lhk3;)V

    .line 289
    .line 290
    .line 291
    iget-object v4, v4, Luh3;->f:Lsh3;

    .line 292
    .line 293
    const-string v9, "Error querying raw events"

    .line 294
    .line 295
    invoke-virtual {v4, v8, v9}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 296
    .line 297
    .line 298
    if-eqz v7, :cond_8

    .line 299
    .line 300
    goto :goto_1

    .line 301
    :cond_8
    :goto_2
    :try_start_5
    iput-wide v5, p0, Lmp3;->l0:J

    .line 302
    .line 303
    goto :goto_4

    .line 304
    :goto_3
    if-eqz v7, :cond_9

    .line 305
    .line 306
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 307
    .line 308
    .line 309
    :cond_9
    throw v1

    .line 310
    :cond_a
    :goto_4
    invoke-virtual {p0, v3, v1, v2}, Lmp3;->r(Ljava/lang/String;J)V

    .line 311
    .line 312
    .line 313
    goto/16 :goto_9

    .line 314
    .line 315
    :cond_b
    iput-wide v5, p0, Lmp3;->l0:J

    .line 316
    .line 317
    iget-object v3, p0, Lmp3;->c:Lae3;

    .line 318
    .line 319
    invoke-static {v3}, Lmp3;->S(Lwo3;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {p0}, Lmp3;->d0()Lpd3;

    .line 323
    .line 324
    .line 325
    sget-object v4, Lvg3;->e:Lug3;

    .line 326
    .line 327
    invoke-virtual {v4, v7}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    check-cast v4, Ljava/lang/Long;

    .line 332
    .line 333
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 334
    .line 335
    .line 336
    move-result-wide v4

    .line 337
    sub-long/2addr v1, v4

    .line 338
    invoke-virtual {v3}, Lsq3;->y()V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v3}, Lwo3;->A()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 342
    .line 343
    .line 344
    :try_start_6
    invoke-virtual {v3}, Lae3;->q0()Landroid/database/sqlite/SQLiteDatabase;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    const-string v5, "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"

    .line 349
    .line 350
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    filled-new-array {v1}, [Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    invoke-virtual {v4, v5, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 359
    .line 360
    .line 361
    move-result-object v1
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 362
    :try_start_7
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    if-nez v2, :cond_c

    .line 367
    .line 368
    iget-object v2, v3, Lsq3;->a:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v2, Lij3;

    .line 371
    .line 372
    iget-object v2, v2, Lij3;->f:Luh3;

    .line 373
    .line 374
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 375
    .line 376
    .line 377
    iget-object v2, v2, Luh3;->Y:Lsh3;

    .line 378
    .line 379
    const-string v4, "No expired configs for apps with pending events"

    .line 380
    .line 381
    invoke-virtual {v2, v4}, Lsh3;->a(Ljava/lang/String;)V
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 382
    .line 383
    .line 384
    :goto_5
    :try_start_8
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 385
    .line 386
    .line 387
    goto :goto_8

    .line 388
    :catchall_2
    move-exception v2

    .line 389
    goto :goto_6

    .line 390
    :catch_1
    move-exception v2

    .line 391
    goto :goto_7

    .line 392
    :cond_c
    :try_start_9
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v7
    :try_end_9
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 396
    goto :goto_5

    .line 397
    :goto_6
    move-object v7, v1

    .line 398
    goto :goto_a

    .line 399
    :catchall_3
    move-exception v1

    .line 400
    move-object v2, v1

    .line 401
    goto :goto_a

    .line 402
    :catch_2
    move-exception v1

    .line 403
    move-object v2, v1

    .line 404
    move-object v1, v7

    .line 405
    :goto_7
    :try_start_a
    iget-object v3, v3, Lsq3;->a:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v3, Lij3;

    .line 408
    .line 409
    iget-object v3, v3, Lij3;->f:Luh3;

    .line 410
    .line 411
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 412
    .line 413
    .line 414
    iget-object v3, v3, Luh3;->f:Lsh3;

    .line 415
    .line 416
    const-string v4, "Error selecting expired configs"

    .line 417
    .line 418
    invoke-virtual {v3, v2, v4}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 419
    .line 420
    .line 421
    if-eqz v1, :cond_d

    .line 422
    .line 423
    goto :goto_5

    .line 424
    :cond_d
    :goto_8
    :try_start_b
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    if-nez v1, :cond_e

    .line 429
    .line 430
    iget-object v1, p0, Lmp3;->c:Lae3;

    .line 431
    .line 432
    invoke-static {v1}, Lmp3;->S(Lwo3;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v1, v7}, Lae3;->D0(Ljava/lang/String;)Ldi3;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    if-eqz v1, :cond_e

    .line 440
    .line 441
    invoke-virtual {p0, v1}, Lmp3;->y(Ldi3;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 442
    .line 443
    .line 444
    :cond_e
    :goto_9
    iput-boolean v0, p0, Lmp3;->g0:Z

    .line 445
    .line 446
    invoke-virtual {p0}, Lmp3;->M()V

    .line 447
    .line 448
    .line 449
    return-void

    .line 450
    :goto_a
    if-eqz v7, :cond_f

    .line 451
    .line 452
    :try_start_c
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 453
    .line 454
    .line 455
    :cond_f
    throw v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 456
    :goto_b
    iput-boolean v0, p0, Lmp3;->g0:Z

    .line 457
    .line 458
    invoke-virtual {p0}, Lmp3;->M()V

    .line 459
    .line 460
    .line 461
    throw v1
.end method

.method public final r(Ljava/lang/String;J)V
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    const-string v4, "data"

    .line 8
    .line 9
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v5, Lvg3;->h:Lug3;

    .line 14
    .line 15
    invoke-virtual {v0, v6, v5}, Lpd3;->H(Ljava/lang/String;Lug3;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    sget-object v7, Lvg3;->i:Lug3;

    .line 24
    .line 25
    invoke-virtual {v5, v6, v7}, Lpd3;->H(Ljava/lang/String;Lug3;)I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    const/4 v7, 0x0

    .line 30
    invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    iget-object v9, v8, Lsq3;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v9, Lij3;

    .line 41
    .line 42
    invoke-virtual {v8}, Lsq3;->y()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v8}, Lwo3;->A()V

    .line 46
    .line 47
    .line 48
    const/4 v10, 0x1

    .line 49
    if-lez v0, :cond_0

    .line 50
    .line 51
    move v11, v10

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move v11, v7

    .line 54
    :goto_0
    invoke-static {v11}, Lkb1;->g(Z)V

    .line 55
    .line 56
    .line 57
    if-lez v5, :cond_1

    .line 58
    .line 59
    move v11, v10

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move v11, v7

    .line 62
    :goto_1
    invoke-static {v11}, Lkb1;->g(Z)V

    .line 63
    .line 64
    .line 65
    invoke-static {v6}, Lkb1;->k(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :try_start_0
    invoke-virtual {v8}, Lae3;->q0()Landroid/database/sqlite/SQLiteDatabase;

    .line 69
    .line 70
    .line 71
    move-result-object v15

    .line 72
    const-string v16, "queue"
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_9
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 73
    .line 74
    const-wide/16 v24, -0x1

    .line 75
    .line 76
    :try_start_1
    const-string v11, "rowid"

    .line 77
    .line 78
    const-string v12, "retry_count"

    .line 79
    .line 80
    filled-new-array {v11, v4, v12}, [Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v17

    .line 84
    const-string v18, "app_id=?"

    .line 85
    .line 86
    filled-new-array {v6}, [Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v19

    .line 90
    const-string v22, "rowid"

    .line 91
    .line 92
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v23

    .line 96
    const/16 v20, 0x0

    .line 97
    .line 98
    const/16 v21, 0x0

    .line 99
    .line 100
    invoke-virtual/range {v15 .. v23}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 101
    .line 102
    .line 103
    move-result-object v11
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_8
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 104
    :try_start_2
    invoke-interface {v11}, Landroid/database/Cursor;->moveToFirst()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-nez v0, :cond_3

    .line 109
    .line 110
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 111
    .line 112
    :goto_2
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 113
    .line 114
    .line 115
    :cond_2
    move-object v12, v0

    .line 116
    goto/16 :goto_12

    .line 117
    .line 118
    :catchall_0
    move-exception v0

    .line 119
    goto/16 :goto_e

    .line 120
    .line 121
    :catch_0
    move-exception v0

    .line 122
    move-object/from16 v23, v9

    .line 123
    .line 124
    goto/16 :goto_11

    .line 125
    .line 126
    :cond_3
    :try_start_3
    new-instance v12, Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 129
    .line 130
    .line 131
    move v15, v7

    .line 132
    :goto_3
    invoke-interface {v11, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 133
    .line 134
    .line 135
    move-result-wide v16
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 136
    :try_start_4
    invoke-interface {v11, v10}, Landroid/database/Cursor;->getBlob(I)[B

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iget-object v10, v8, Lqo3;->b:Lmp3;

    .line 141
    .line 142
    invoke-virtual {v10}, Lmp3;->i0()Lci3;

    .line 143
    .line 144
    .line 145
    move-result-object v10
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 146
    :try_start_5
    new-instance v14, Ljava/io/ByteArrayInputStream;

    .line 147
    .line 148
    invoke-direct {v14, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 149
    .line 150
    .line 151
    new-instance v0, Ljava/util/zip/GZIPInputStream;

    .line 152
    .line 153
    invoke-direct {v0, v14}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 154
    .line 155
    .line 156
    new-instance v13, Ljava/io/ByteArrayOutputStream;

    .line 157
    .line 158
    invoke-direct {v13}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 159
    .line 160
    .line 161
    const/16 v7, 0x400

    .line 162
    .line 163
    new-array v7, v7, [B
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 164
    .line 165
    move-object/from16 v22, v8

    .line 166
    .line 167
    :goto_4
    :try_start_6
    invoke-virtual {v0, v7}, Ljava/io/InputStream;->read([B)I

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    if-gtz v8, :cond_b

    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/util/zip/GZIPInputStream;->close()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v14}, Ljava/io/ByteArrayInputStream;->close()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v13}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 180
    .line 181
    .line 182
    move-result-object v0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 183
    :try_start_7
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 184
    .line 185
    .line 186
    move-result v7

    .line 187
    if-nez v7, :cond_4

    .line 188
    .line 189
    array-length v7, v0
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 190
    add-int/2addr v7, v15

    .line 191
    if-le v7, v5, :cond_4

    .line 192
    .line 193
    goto/16 :goto_d

    .line 194
    .line 195
    :cond_4
    :try_start_8
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzid;->zzaE()Lcom/google/android/gms/internal/measurement/zzic;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    invoke-static {v7, v0}, Lci3;->m0(Lcom/google/android/gms/internal/measurement/zzma;[B)Lcom/google/android/gms/internal/measurement/zznk;

    .line 200
    .line 201
    .line 202
    move-result-object v7

    .line 203
    check-cast v7, Lcom/google/android/gms/internal/measurement/zzic;
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 204
    .line 205
    :try_start_9
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    if-nez v8, :cond_9

    .line 210
    .line 211
    const/4 v8, 0x0

    .line 212
    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v10

    .line 216
    check-cast v10, Landroid/util/Pair;

    .line 217
    .line 218
    iget-object v8, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v8, Lcom/google/android/gms/internal/measurement/zzid;

    .line 221
    .line 222
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    check-cast v10, Lcom/google/android/gms/internal/measurement/zzid;

    .line 227
    .line 228
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzid;->zzaf()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v13

    .line 232
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzid;->zzaf()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v14

    .line 236
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v13

    .line 240
    if-eqz v13, :cond_d

    .line 241
    .line 242
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzid;->zzam()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v13

    .line 246
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzid;->zzam()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v14

    .line 250
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v13

    .line 254
    if-eqz v13, :cond_d

    .line 255
    .line 256
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzid;->zzao()Z

    .line 257
    .line 258
    .line 259
    move-result v13

    .line 260
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzid;->zzao()Z

    .line 261
    .line 262
    .line 263
    move-result v14

    .line 264
    if-ne v13, v14, :cond_d

    .line 265
    .line 266
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzid;->zzaq()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v13

    .line 270
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzid;->zzaq()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v14

    .line 274
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v13

    .line 278
    if-eqz v13, :cond_d

    .line 279
    .line 280
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzid;->zzf()Ljava/util/List;

    .line 281
    .line 282
    .line 283
    move-result-object v8

    .line 284
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 285
    .line 286
    .line 287
    move-result-object v8

    .line 288
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 289
    .line 290
    .line 291
    move-result v13
    :try_end_9
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 292
    const-string v14, "_npa"

    .line 293
    .line 294
    if-eqz v13, :cond_6

    .line 295
    .line 296
    :try_start_a
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v13

    .line 300
    check-cast v13, Lcom/google/android/gms/internal/measurement/zziu;

    .line 301
    .line 302
    move-object/from16 v23, v8

    .line 303
    .line 304
    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/zziu;->zzc()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v8

    .line 308
    invoke-virtual {v14, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v8

    .line 312
    if-eqz v8, :cond_5

    .line 313
    .line 314
    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/zziu;->zzg()J

    .line 315
    .line 316
    .line 317
    move-result-wide v26

    .line 318
    goto :goto_6

    .line 319
    :cond_5
    move-object/from16 v8, v23

    .line 320
    .line 321
    goto :goto_5

    .line 322
    :cond_6
    move-wide/from16 v26, v24

    .line 323
    .line 324
    :goto_6
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzid;->zzf()Ljava/util/List;

    .line 325
    .line 326
    .line 327
    move-result-object v8

    .line 328
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 329
    .line 330
    .line 331
    move-result-object v8

    .line 332
    :cond_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 333
    .line 334
    .line 335
    move-result v10

    .line 336
    if-eqz v10, :cond_8

    .line 337
    .line 338
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v10

    .line 342
    check-cast v10, Lcom/google/android/gms/internal/measurement/zziu;

    .line 343
    .line 344
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zziu;->zzc()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v13

    .line 348
    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v13

    .line 352
    if-eqz v13, :cond_7

    .line 353
    .line 354
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zziu;->zzg()J

    .line 355
    .line 356
    .line 357
    move-result-wide v13

    .line 358
    goto :goto_7

    .line 359
    :cond_8
    move-wide/from16 v13, v24

    .line 360
    .line 361
    :goto_7
    cmp-long v8, v26, v13

    .line 362
    .line 363
    if-nez v8, :cond_d

    .line 364
    .line 365
    :cond_9
    const/4 v8, 0x2

    .line 366
    invoke-interface {v11, v8}, Landroid/database/Cursor;->isNull(I)Z

    .line 367
    .line 368
    .line 369
    move-result v10

    .line 370
    if-nez v10, :cond_a

    .line 371
    .line 372
    invoke-interface {v11, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 373
    .line 374
    .line 375
    move-result v10

    .line 376
    invoke-virtual {v7, v10}, Lcom/google/android/gms/internal/measurement/zzic;->zzao(I)Lcom/google/android/gms/internal/measurement/zzic;

    .line 377
    .line 378
    .line 379
    :cond_a
    array-length v0, v0

    .line 380
    add-int/2addr v15, v0

    .line 381
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzid;

    .line 386
    .line 387
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 388
    .line 389
    .line 390
    move-result-object v7

    .line 391
    invoke-static {v0, v7}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    :goto_8
    move-object/from16 v23, v9

    .line 399
    .line 400
    goto :goto_c

    .line 401
    :catch_1
    move-exception v0

    .line 402
    invoke-virtual {v9}, Lij3;->a()Luh3;

    .line 403
    .line 404
    .line 405
    move-result-object v7

    .line 406
    invoke-virtual {v7}, Luh3;->D()Lsh3;

    .line 407
    .line 408
    .line 409
    move-result-object v7

    .line 410
    const-string v8, "Failed to merge queued bundle. appId"

    .line 411
    .line 412
    invoke-static {v6}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 413
    .line 414
    .line 415
    move-result-object v10

    .line 416
    invoke-virtual {v7, v10, v8, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 417
    .line 418
    .line 419
    goto :goto_8

    .line 420
    :catch_2
    move-exception v0

    .line 421
    :goto_9
    move-object/from16 v23, v9

    .line 422
    .line 423
    goto :goto_a

    .line 424
    :cond_b
    move-object/from16 v23, v9

    .line 425
    .line 426
    const/4 v9, 0x0

    .line 427
    :try_start_b
    invoke-virtual {v13, v7, v9, v8}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_b .. :try_end_b} :catch_6
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 428
    .line 429
    .line 430
    move-object/from16 v9, v23

    .line 431
    .line 432
    goto/16 :goto_4

    .line 433
    .line 434
    :catch_3
    move-exception v0

    .line 435
    goto :goto_a

    .line 436
    :catch_4
    move-exception v0

    .line 437
    move-object/from16 v22, v8

    .line 438
    .line 439
    goto :goto_9

    .line 440
    :goto_a
    :try_start_c
    iget-object v7, v10, Lsq3;->a:Ljava/lang/Object;

    .line 441
    .line 442
    check-cast v7, Lij3;

    .line 443
    .line 444
    invoke-virtual {v7}, Lij3;->a()Luh3;

    .line 445
    .line 446
    .line 447
    move-result-object v7

    .line 448
    invoke-virtual {v7}, Luh3;->D()Lsh3;

    .line 449
    .line 450
    .line 451
    move-result-object v7

    .line 452
    const-string v8, "Failed to ungzip content"

    .line 453
    .line 454
    invoke-virtual {v7, v0, v8}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    throw v0
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_6
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 458
    :catch_5
    move-exception v0

    .line 459
    goto :goto_b

    .line 460
    :catch_6
    move-exception v0

    .line 461
    goto :goto_11

    .line 462
    :catch_7
    move-exception v0

    .line 463
    move-object/from16 v22, v8

    .line 464
    .line 465
    move-object/from16 v23, v9

    .line 466
    .line 467
    :goto_b
    :try_start_d
    invoke-virtual/range {v23 .. v23}, Lij3;->a()Luh3;

    .line 468
    .line 469
    .line 470
    move-result-object v7

    .line 471
    invoke-virtual {v7}, Luh3;->D()Lsh3;

    .line 472
    .line 473
    .line 474
    move-result-object v7

    .line 475
    const-string v8, "Failed to unzip queued bundle. appId"

    .line 476
    .line 477
    invoke-static {v6}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 478
    .line 479
    .line 480
    move-result-object v9

    .line 481
    invoke-virtual {v7, v9, v8, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    :goto_c
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z

    .line 485
    .line 486
    .line 487
    move-result v0
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_6
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 488
    if-eqz v0, :cond_d

    .line 489
    .line 490
    if-le v15, v5, :cond_c

    .line 491
    .line 492
    goto :goto_d

    .line 493
    :cond_c
    move-object/from16 v8, v22

    .line 494
    .line 495
    move-object/from16 v9, v23

    .line 496
    .line 497
    const/4 v7, 0x0

    .line 498
    const/4 v10, 0x1

    .line 499
    goto/16 :goto_3

    .line 500
    .line 501
    :cond_d
    :goto_d
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 502
    .line 503
    .line 504
    goto :goto_12

    .line 505
    :goto_e
    move-object v14, v11

    .line 506
    goto/16 :goto_3e

    .line 507
    .line 508
    :catchall_1
    move-exception v0

    .line 509
    goto :goto_f

    .line 510
    :catch_8
    move-exception v0

    .line 511
    move-object/from16 v23, v9

    .line 512
    .line 513
    goto :goto_10

    .line 514
    :catch_9
    move-exception v0

    .line 515
    move-object/from16 v23, v9

    .line 516
    .line 517
    const-wide/16 v24, -0x1

    .line 518
    .line 519
    goto :goto_10

    .line 520
    :goto_f
    const/4 v14, 0x0

    .line 521
    goto/16 :goto_3e

    .line 522
    .line 523
    :goto_10
    const/4 v11, 0x0

    .line 524
    :goto_11
    :try_start_e
    invoke-virtual/range {v23 .. v23}, Lij3;->a()Luh3;

    .line 525
    .line 526
    .line 527
    move-result-object v5

    .line 528
    invoke-virtual {v5}, Luh3;->D()Lsh3;

    .line 529
    .line 530
    .line 531
    move-result-object v5

    .line 532
    const-string v7, "Error querying bundles. appId"

    .line 533
    .line 534
    invoke-static {v6}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 535
    .line 536
    .line 537
    move-result-object v8

    .line 538
    invoke-virtual {v5, v8, v7, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 539
    .line 540
    .line 541
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 542
    .line 543
    if-eqz v11, :cond_2

    .line 544
    .line 545
    goto/16 :goto_2

    .line 546
    .line 547
    :goto_12
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 548
    .line 549
    .line 550
    move-result v0

    .line 551
    if-eqz v0, :cond_e

    .line 552
    .line 553
    goto/16 :goto_3d

    .line 554
    .line 555
    :cond_e
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpk;->zza()Z

    .line 556
    .line 557
    .line 558
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    sget-object v5, Lvg3;->i1:Lug3;

    .line 563
    .line 564
    const/4 v7, 0x0

    .line 565
    invoke-virtual {v0, v7, v5}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 566
    .line 567
    .line 568
    move-result v0

    .line 569
    const-string v9, "_f"

    .line 570
    .line 571
    sget-object v10, Lnk3;->c:Lnk3;

    .line 572
    .line 573
    if-eqz v0, :cond_24

    .line 574
    .line 575
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpk;->zza()Z

    .line 576
    .line 577
    .line 578
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    invoke-virtual {v0, v7, v5}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 583
    .line 584
    .line 585
    move-result v0

    .line 586
    if-eqz v0, :cond_23

    .line 587
    .line 588
    invoke-virtual/range {p0 .. p1}, Lmp3;->d(Ljava/lang/String;)Lok3;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    invoke-virtual {v0, v10}, Lok3;->i(Lnk3;)Z

    .line 593
    .line 594
    .line 595
    move-result v0

    .line 596
    const-string v5, "no_data_mode_events"

    .line 597
    .line 598
    if-nez v0, :cond_14

    .line 599
    .line 600
    invoke-virtual {v1}, Lmp3;->e0()Lvi3;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    invoke-virtual {v0, v6}, Lvi3;->E(Ljava/lang/String;)Z

    .line 605
    .line 606
    .line 607
    move-result v0

    .line 608
    if-eqz v0, :cond_14

    .line 609
    .line 610
    sget-object v0, Lvg3;->j1:Lug3;

    .line 611
    .line 612
    invoke-virtual {v0, v7}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    check-cast v0, Ljava/lang/String;

    .line 617
    .line 618
    const-string v7, ","

    .line 619
    .line 620
    invoke-virtual {v0, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 625
    .line 626
    .line 627
    move-result-object v7

    .line 628
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 629
    .line 630
    .line 631
    move-result-object v11

    .line 632
    :cond_f
    :goto_13
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 633
    .line 634
    .line 635
    move-result v0

    .line 636
    if-eqz v0, :cond_13

    .line 637
    .line 638
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    check-cast v0, Landroid/util/Pair;

    .line 643
    .line 644
    :try_start_f
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 645
    .line 646
    .line 647
    move-result-object v12

    .line 648
    iget-object v13, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 649
    .line 650
    check-cast v13, Ljava/lang/Long;

    .line 651
    .line 652
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 653
    .line 654
    .line 655
    move-result-wide v13

    .line 656
    invoke-virtual {v12, v13, v14}, Lae3;->I(J)V

    .line 657
    .line 658
    .line 659
    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 660
    .line 661
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzid;

    .line 662
    .line 663
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzid;->zzc()Ljava/util/List;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 668
    .line 669
    .line 670
    move-result-object v12

    .line 671
    :cond_10
    :goto_14
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 672
    .line 673
    .line 674
    move-result v0

    .line 675
    if-eqz v0, :cond_f

    .line 676
    .line 677
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 682
    .line 683
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhs;->zzd()Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v13

    .line 687
    invoke-interface {v7, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 688
    .line 689
    .line 690
    move-result v13

    .line 691
    if-eqz v13, :cond_10

    .line 692
    .line 693
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhs;->zzd()Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v13

    .line 697
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    move-result v13

    .line 701
    if-nez v13, :cond_11

    .line 702
    .line 703
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhs;->zzd()Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v13

    .line 707
    const-string v14, "_v"

    .line 708
    .line 709
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 710
    .line 711
    .line 712
    move-result v13

    .line 713
    if-eqz v13, :cond_12

    .line 714
    .line 715
    goto :goto_15

    .line 716
    :catch_a
    const/16 v16, 0x22

    .line 717
    .line 718
    goto/16 :goto_16

    .line 719
    .line 720
    :cond_11
    :goto_15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzme;->zzcl()Lcom/google/android/gms/internal/measurement/zzma;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhr;

    .line 725
    .line 726
    invoke-virtual {v1}, Lmp3;->i0()Lci3;

    .line 727
    .line 728
    .line 729
    const-string v13, "_dac"

    .line 730
    .line 731
    const-wide/16 v14, 0x1

    .line 732
    .line 733
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 734
    .line 735
    .line 736
    move-result-object v14

    .line 737
    invoke-static {v0, v13, v14}, Lci3;->F(Lcom/google/android/gms/internal/measurement/zzhr;Ljava/lang/String;Ljava/lang/Long;)V

    .line 738
    .line 739
    .line 740
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 745
    .line 746
    :cond_12
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 747
    .line 748
    .line 749
    move-result-object v13

    .line 750
    invoke-virtual {v13}, Lsq3;->y()V

    .line 751
    .line 752
    .line 753
    invoke-virtual {v13}, Lwo3;->A()V

    .line 754
    .line 755
    .line 756
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 757
    .line 758
    .line 759
    invoke-static {v6}, Lkb1;->k(Ljava/lang/String;)V

    .line 760
    .line 761
    .line 762
    iget-object v14, v13, Lsq3;->a:Ljava/lang/Object;

    .line 763
    .line 764
    check-cast v14, Lij3;

    .line 765
    .line 766
    invoke-virtual {v14}, Lij3;->a()Luh3;

    .line 767
    .line 768
    .line 769
    move-result-object v15

    .line 770
    invoke-virtual {v15}, Luh3;->G()Lsh3;

    .line 771
    .line 772
    .line 773
    move-result-object v15
    :try_end_f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_f .. :try_end_f} :catch_a

    .line 774
    const/16 v16, 0x22

    .line 775
    .line 776
    :try_start_10
    const-string v8, "Caching events in NO_DATA mode"

    .line 777
    .line 778
    invoke-virtual {v15, v0, v8}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 779
    .line 780
    .line 781
    new-instance v8, Landroid/content/ContentValues;

    .line 782
    .line 783
    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    .line 784
    .line 785
    .line 786
    const-string v15, "app_id"

    .line 787
    .line 788
    invoke-virtual {v8, v15, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 789
    .line 790
    .line 791
    const-string v15, "name"

    .line 792
    .line 793
    move-object/from16 v17, v0

    .line 794
    .line 795
    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/zzhs;->zzd()Ljava/lang/String;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    invoke-virtual {v8, v15, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 800
    .line 801
    .line 802
    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/zzkr;->zzcc()[B

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    invoke-virtual {v8, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 807
    .line 808
    .line 809
    const-string v0, "timestamp_millis"

    .line 810
    .line 811
    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/zzhs;->zzf()J

    .line 812
    .line 813
    .line 814
    move-result-wide v22

    .line 815
    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 816
    .line 817
    .line 818
    move-result-object v15

    .line 819
    invoke-virtual {v8, v0, v15}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
    :try_end_10
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_10 .. :try_end_10} :catch_c

    .line 820
    .line 821
    .line 822
    :try_start_11
    invoke-virtual {v13}, Lae3;->q0()Landroid/database/sqlite/SQLiteDatabase;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    const/4 v15, 0x0

    .line 827
    invoke-virtual {v0, v5, v15, v8}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 828
    .line 829
    .line 830
    move-result-wide v22

    .line 831
    cmp-long v0, v22, v24

    .line 832
    .line 833
    if-nez v0, :cond_10

    .line 834
    .line 835
    invoke-virtual {v14}, Lij3;->a()Luh3;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    invoke-virtual {v0}, Luh3;->D()Lsh3;

    .line 840
    .line 841
    .line 842
    move-result-object v0

    .line 843
    const-string v8, "Failed to insert NO_DATA mode event (got -1). appId"

    .line 844
    .line 845
    invoke-static {v6}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 846
    .line 847
    .line 848
    move-result-object v14

    .line 849
    invoke-virtual {v0, v14, v8}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_11
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_11 .. :try_end_11} :catch_b

    .line 850
    .line 851
    .line 852
    goto/16 :goto_14

    .line 853
    .line 854
    :catch_b
    move-exception v0

    .line 855
    :try_start_12
    iget-object v8, v13, Lsq3;->a:Ljava/lang/Object;

    .line 856
    .line 857
    check-cast v8, Lij3;

    .line 858
    .line 859
    invoke-virtual {v8}, Lij3;->a()Luh3;

    .line 860
    .line 861
    .line 862
    move-result-object v8

    .line 863
    invoke-virtual {v8}, Luh3;->D()Lsh3;

    .line 864
    .line 865
    .line 866
    move-result-object v8

    .line 867
    const-string v13, "Error storing NO_DATA mode event. appId"

    .line 868
    .line 869
    invoke-static {v6}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 870
    .line 871
    .line 872
    move-result-object v14

    .line 873
    invoke-virtual {v8, v14, v13, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_12
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_12 .. :try_end_12} :catch_c

    .line 874
    .line 875
    .line 876
    goto/16 :goto_14

    .line 877
    .line 878
    :catch_c
    :goto_16
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    iget-object v0, v0, Luh3;->V:Lsh3;

    .line 883
    .line 884
    const-string v8, "Failed handling NO_DATA mode bundles. appId"

    .line 885
    .line 886
    invoke-virtual {v0, v6, v8}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 887
    .line 888
    .line 889
    goto/16 :goto_13

    .line 890
    .line 891
    :cond_13
    const/16 v16, 0x22

    .line 892
    .line 893
    sget-object v12, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 894
    .line 895
    goto/16 :goto_25

    .line 896
    .line 897
    :cond_14
    const/16 v16, 0x22

    .line 898
    .line 899
    new-instance v7, Ljava/util/ArrayList;

    .line 900
    .line 901
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 902
    .line 903
    .line 904
    move-result v0

    .line 905
    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 906
    .line 907
    .line 908
    invoke-virtual {v1}, Lmp3;->f0()Lae3;

    .line 909
    .line 910
    .line 911
    move-result-object v0

    .line 912
    iget-object v8, v0, Lsq3;->a:Ljava/lang/Object;

    .line 913
    .line 914
    check-cast v8, Lij3;

    .line 915
    .line 916
    invoke-static {v6}, Lkb1;->k(Ljava/lang/String;)V

    .line 917
    .line 918
    .line 919
    invoke-virtual {v0}, Lsq3;->y()V

    .line 920
    .line 921
    .line 922
    invoke-virtual {v0}, Lwo3;->A()V

    .line 923
    .line 924
    .line 925
    new-instance v11, Ljava/util/ArrayList;

    .line 926
    .line 927
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 928
    .line 929
    .line 930
    const-string v13, " NO_DATA mode events. appId"

    .line 931
    .line 932
    const-string v14, "Pruned "

    .line 933
    .line 934
    :try_start_13
    invoke-virtual {v0}, Lae3;->q0()Landroid/database/sqlite/SQLiteDatabase;

    .line 935
    .line 936
    .line 937
    move-result-object v22

    .line 938
    invoke-virtual {v8}, Lij3;->f()Lxv;

    .line 939
    .line 940
    .line 941
    move-result-object v0

    .line 942
    check-cast v0, Lxt0;

    .line 943
    .line 944
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 945
    .line 946
    .line 947
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 948
    .line 949
    .line 950
    move-result-wide v31

    .line 951
    const-string v23, "no_data_mode_events"

    .line 952
    .line 953
    filled-new-array {v4}, [Ljava/lang/String;

    .line 954
    .line 955
    .line 956
    move-result-object v24

    .line 957
    const-string v25, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)"

    .line 958
    .line 959
    invoke-static/range {v31 .. v32}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 960
    .line 961
    .line 962
    move-result-object v0

    .line 963
    filled-new-array {v6, v0}, [Ljava/lang/String;

    .line 964
    .line 965
    .line 966
    move-result-object v26

    .line 967
    const-string v29, "rowid"

    .line 968
    .line 969
    const/16 v30, 0x0

    .line 970
    .line 971
    const/16 v27, 0x0

    .line 972
    .line 973
    const/16 v28, 0x0

    .line 974
    .line 975
    invoke-virtual/range {v22 .. v30}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 976
    .line 977
    .line 978
    move-result-object v4
    :try_end_13
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_13 .. :try_end_13} :catch_12
    .catchall {:try_start_13 .. :try_end_13} :catchall_3

    .line 979
    move-object/from16 v15, v22

    .line 980
    .line 981
    :try_start_14
    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    .line 982
    .line 983
    .line 984
    move-result v0
    :try_end_14
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_14 .. :try_end_14} :catch_11
    .catchall {:try_start_14 .. :try_end_14} :catchall_2

    .line 985
    if-eqz v0, :cond_16

    .line 986
    .line 987
    move-object/from16 v17, v8

    .line 988
    .line 989
    :goto_17
    const/4 v8, 0x0

    .line 990
    :try_start_15
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getBlob(I)[B

    .line 991
    .line 992
    .line 993
    move-result-object v0

    .line 994
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzhs;->zzk()Lcom/google/android/gms/internal/measurement/zzhr;

    .line 995
    .line 996
    .line 997
    move-result-object v8

    .line 998
    invoke-static {v8, v0}, Lci3;->m0(Lcom/google/android/gms/internal/measurement/zzma;[B)Lcom/google/android/gms/internal/measurement/zznk;

    .line 999
    .line 1000
    .line 1001
    move-result-object v0

    .line 1002
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhr;

    .line 1003
    .line 1004
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v0

    .line 1008
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 1009
    .line 1010
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_15
    .catch Lcom/google/android/gms/internal/measurement/zzmq; {:try_start_15 .. :try_end_15} :catch_e
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_15 .. :try_end_15} :catch_d
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    .line 1011
    .line 1012
    .line 1013
    move-object/from16 v22, v4

    .line 1014
    .line 1015
    move-object/from16 v23, v11

    .line 1016
    .line 1017
    goto :goto_18

    .line 1018
    :catchall_2
    move-exception v0

    .line 1019
    move-object/from16 v22, v4

    .line 1020
    .line 1021
    goto/16 :goto_1a

    .line 1022
    .line 1023
    :catch_d
    move-exception v0

    .line 1024
    move-object/from16 v22, v4

    .line 1025
    .line 1026
    goto/16 :goto_1d

    .line 1027
    .line 1028
    :catch_e
    move-exception v0

    .line 1029
    :try_start_16
    invoke-virtual/range {v17 .. v17}, Lij3;->a()Luh3;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v8

    .line 1033
    iget-object v8, v8, Luh3;->V:Lsh3;
    :try_end_16
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_16 .. :try_end_16} :catch_d
    .catchall {:try_start_16 .. :try_end_16} :catchall_2

    .line 1034
    .line 1035
    move-object/from16 v22, v4

    .line 1036
    .line 1037
    :try_start_17
    const-string v4, "Failed to parse stored NO_DATA mode event, appId"

    .line 1038
    .line 1039
    move-object/from16 v23, v11

    .line 1040
    .line 1041
    invoke-static {v6}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v11

    .line 1045
    invoke-virtual {v8, v11, v4, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1046
    .line 1047
    .line 1048
    :goto_18
    invoke-interface/range {v22 .. v22}, Landroid/database/Cursor;->moveToNext()Z

    .line 1049
    .line 1050
    .line 1051
    move-result v0

    .line 1052
    if-nez v0, :cond_15

    .line 1053
    .line 1054
    invoke-interface/range {v22 .. v22}, Landroid/database/Cursor;->close()V
    :try_end_17
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_17 .. :try_end_17} :catch_10
    .catchall {:try_start_17 .. :try_end_17} :catchall_4

    .line 1055
    .line 1056
    .line 1057
    :try_start_18
    const-string v0, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)"

    .line 1058
    .line 1059
    invoke-static/range {v31 .. v32}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v4

    .line 1063
    filled-new-array {v6, v4}, [Ljava/lang/String;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v4

    .line 1067
    invoke-virtual {v15, v5, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 1068
    .line 1069
    .line 1070
    move-result v0

    .line 1071
    invoke-virtual/range {v17 .. v17}, Lij3;->a()Luh3;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v4

    .line 1075
    invoke-virtual {v4}, Luh3;->G()Lsh3;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v4

    .line 1079
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v5

    .line 1083
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1084
    .line 1085
    .line 1086
    move-result v5

    .line 1087
    add-int/lit8 v5, v5, 0x22

    .line 1088
    .line 1089
    new-instance v8, Ljava/lang/StringBuilder;

    .line 1090
    .line 1091
    invoke-direct {v8, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v0

    .line 1107
    invoke-virtual {v4, v6, v0}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_18
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_18 .. :try_end_18} :catch_f
    .catchall {:try_start_18 .. :try_end_18} :catchall_3

    .line 1108
    .line 1109
    .line 1110
    goto :goto_19

    .line 1111
    :catchall_3
    move-exception v0

    .line 1112
    goto :goto_1b

    .line 1113
    :catch_f
    move-exception v0

    .line 1114
    goto :goto_1c

    .line 1115
    :catchall_4
    move-exception v0

    .line 1116
    goto :goto_1a

    .line 1117
    :catch_10
    move-exception v0

    .line 1118
    goto :goto_1d

    .line 1119
    :cond_15
    move-object/from16 v4, v22

    .line 1120
    .line 1121
    move-object/from16 v11, v23

    .line 1122
    .line 1123
    goto/16 :goto_17

    .line 1124
    .line 1125
    :cond_16
    move-object/from16 v22, v4

    .line 1126
    .line 1127
    move-object/from16 v23, v11

    .line 1128
    .line 1129
    invoke-interface/range {v22 .. v22}, Landroid/database/Cursor;->close()V

    .line 1130
    .line 1131
    .line 1132
    :goto_19
    move-object/from16 v11, v23

    .line 1133
    .line 1134
    goto :goto_1e

    .line 1135
    :goto_1a
    move-object/from16 v14, v22

    .line 1136
    .line 1137
    goto/16 :goto_24

    .line 1138
    .line 1139
    :catch_11
    move-exception v0

    .line 1140
    move-object/from16 v22, v4

    .line 1141
    .line 1142
    move-object/from16 v17, v8

    .line 1143
    .line 1144
    goto :goto_1d

    .line 1145
    :catch_12
    move-exception v0

    .line 1146
    move-object/from16 v17, v8

    .line 1147
    .line 1148
    goto :goto_1c

    .line 1149
    :goto_1b
    const/4 v14, 0x0

    .line 1150
    goto/16 :goto_24

    .line 1151
    .line 1152
    :goto_1c
    const/16 v22, 0x0

    .line 1153
    .line 1154
    :goto_1d
    :try_start_19
    invoke-virtual/range {v17 .. v17}, Lij3;->a()Luh3;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v4

    .line 1158
    invoke-virtual {v4}, Luh3;->D()Lsh3;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v4

    .line 1162
    const-string v5, "Error flushing NO_DATA mode events. appId"

    .line 1163
    .line 1164
    invoke-static {v6}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v8

    .line 1168
    invoke-virtual {v4, v8, v5, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1169
    .line 1170
    .line 1171
    sget-object v11, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_4

    .line 1172
    .line 1173
    if-eqz v22, :cond_17

    .line 1174
    .line 1175
    invoke-interface/range {v22 .. v22}, Landroid/database/Cursor;->close()V

    .line 1176
    .line 1177
    .line 1178
    :cond_17
    :goto_1e
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v0

    .line 1182
    const/4 v4, 0x1

    .line 1183
    :goto_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1184
    .line 1185
    .line 1186
    move-result v5

    .line 1187
    if-eqz v5, :cond_21

    .line 1188
    .line 1189
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v5

    .line 1193
    check-cast v5, Landroid/util/Pair;

    .line 1194
    .line 1195
    iget-object v8, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1196
    .line 1197
    check-cast v8, Lcom/google/android/gms/internal/measurement/zzid;

    .line 1198
    .line 1199
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzme;->zzcl()Lcom/google/android/gms/internal/measurement/zzma;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v8

    .line 1203
    check-cast v8, Lcom/google/android/gms/internal/measurement/zzic;

    .line 1204
    .line 1205
    if-eqz v4, :cond_18

    .line 1206
    .line 1207
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 1208
    .line 1209
    .line 1210
    move-result v12

    .line 1211
    if-nez v12, :cond_18

    .line 1212
    .line 1213
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzb()Ljava/util/List;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v4

    .line 1217
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzic;->zzi()Lcom/google/android/gms/internal/measurement/zzic;

    .line 1218
    .line 1219
    .line 1220
    invoke-virtual {v8, v11}, Lcom/google/android/gms/internal/measurement/zzic;->zzh(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual {v8, v4}, Lcom/google/android/gms/internal/measurement/zzic;->zzh(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1224
    .line 1225
    .line 1226
    const/4 v4, 0x0

    .line 1227
    :cond_18
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzho;->zzb()Lcom/google/android/gms/internal/measurement/zzhh;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v12

    .line 1231
    invoke-virtual {v1}, Lmp3;->e0()Lvi3;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v13

    .line 1235
    invoke-virtual {v13, v6}, Lvi3;->U(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgf;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v13

    .line 1239
    new-instance v14, Ljava/util/ArrayList;

    .line 1240
    .line 1241
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 1242
    .line 1243
    .line 1244
    if-nez v13, :cond_1a

    .line 1245
    .line 1246
    :cond_19
    move-object/from16 v17, v0

    .line 1247
    .line 1248
    move/from16 v23, v4

    .line 1249
    .line 1250
    move-object/from16 v22, v11

    .line 1251
    .line 1252
    goto/16 :goto_23

    .line 1253
    .line 1254
    :cond_1a
    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/zzgf;->zza()Ljava/util/List;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v13

    .line 1258
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v13

    .line 1262
    :goto_20
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 1263
    .line 1264
    .line 1265
    move-result v15

    .line 1266
    if-eqz v15, :cond_19

    .line 1267
    .line 1268
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v15

    .line 1272
    check-cast v15, Lcom/google/android/gms/internal/measurement/zzfu;

    .line 1273
    .line 1274
    move-object/from16 v17, v0

    .line 1275
    .line 1276
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzhl;->zza()Lcom/google/android/gms/internal/measurement/zzhk;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v0

    .line 1280
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/zzfu;->zzb()I

    .line 1281
    .line 1282
    .line 1283
    move-result v22

    .line 1284
    move/from16 v23, v4

    .line 1285
    .line 1286
    add-int/lit8 v4, v22, -0x1

    .line 1287
    .line 1288
    move-object/from16 v22, v11

    .line 1289
    .line 1290
    const/4 v11, 0x1

    .line 1291
    if-eq v4, v11, :cond_1e

    .line 1292
    .line 1293
    const/4 v11, 0x2

    .line 1294
    if-eq v4, v11, :cond_1d

    .line 1295
    .line 1296
    const/4 v11, 0x4

    .line 1297
    move-object/from16 v25, v13

    .line 1298
    .line 1299
    const/4 v13, 0x3

    .line 1300
    if-eq v4, v13, :cond_1c

    .line 1301
    .line 1302
    if-eq v4, v11, :cond_1b

    .line 1303
    .line 1304
    const/4 v4, 0x1

    .line 1305
    goto :goto_21

    .line 1306
    :cond_1b
    const/4 v4, 0x5

    .line 1307
    goto :goto_21

    .line 1308
    :cond_1c
    move v4, v11

    .line 1309
    goto :goto_21

    .line 1310
    :cond_1d
    move-object/from16 v25, v13

    .line 1311
    .line 1312
    const/4 v13, 0x3

    .line 1313
    move v4, v13

    .line 1314
    goto :goto_21

    .line 1315
    :cond_1e
    move-object/from16 v25, v13

    .line 1316
    .line 1317
    const/4 v13, 0x3

    .line 1318
    const/4 v4, 0x2

    .line 1319
    :goto_21
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/measurement/zzhk;->zza(I)Lcom/google/android/gms/internal/measurement/zzhk;

    .line 1320
    .line 1321
    .line 1322
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/zzfu;->zzd()I

    .line 1323
    .line 1324
    .line 1325
    move-result v4

    .line 1326
    add-int/lit8 v4, v4, -0x1

    .line 1327
    .line 1328
    const/4 v11, 0x1

    .line 1329
    if-eq v4, v11, :cond_1f

    .line 1330
    .line 1331
    const/4 v11, 0x2

    .line 1332
    if-eq v4, v11, :cond_20

    .line 1333
    .line 1334
    const/4 v13, 0x1

    .line 1335
    goto :goto_22

    .line 1336
    :cond_1f
    const/4 v13, 0x2

    .line 1337
    :cond_20
    :goto_22
    invoke-virtual {v0, v13}, Lcom/google/android/gms/internal/measurement/zzhk;->zzb(I)Lcom/google/android/gms/internal/measurement/zzhk;

    .line 1338
    .line 1339
    .line 1340
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v0

    .line 1344
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhl;

    .line 1345
    .line 1346
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1347
    .line 1348
    .line 1349
    move-object/from16 v0, v17

    .line 1350
    .line 1351
    move-object/from16 v11, v22

    .line 1352
    .line 1353
    move/from16 v4, v23

    .line 1354
    .line 1355
    move-object/from16 v13, v25

    .line 1356
    .line 1357
    goto :goto_20

    .line 1358
    :goto_23
    invoke-virtual {v12, v14}, Lcom/google/android/gms/internal/measurement/zzhh;->zza(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzhh;

    .line 1359
    .line 1360
    .line 1361
    invoke-virtual {v8, v12}, Lcom/google/android/gms/internal/measurement/zzic;->zzaQ(Lcom/google/android/gms/internal/measurement/zzhh;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1362
    .line 1363
    .line 1364
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v0

    .line 1368
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzid;

    .line 1369
    .line 1370
    iget-object v4, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1371
    .line 1372
    check-cast v4, Ljava/lang/Long;

    .line 1373
    .line 1374
    invoke-static {v0, v4}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v0

    .line 1378
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1379
    .line 1380
    .line 1381
    move-object/from16 v0, v17

    .line 1382
    .line 1383
    move-object/from16 v11, v22

    .line 1384
    .line 1385
    move/from16 v4, v23

    .line 1386
    .line 1387
    goto/16 :goto_1f

    .line 1388
    .line 1389
    :cond_21
    move-object v12, v7

    .line 1390
    goto :goto_25

    .line 1391
    :goto_24
    if-eqz v14, :cond_22

    .line 1392
    .line 1393
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 1394
    .line 1395
    .line 1396
    :cond_22
    throw v0

    .line 1397
    :cond_23
    const/16 v16, 0x22

    .line 1398
    .line 1399
    :goto_25
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 1400
    .line 1401
    .line 1402
    move-result v0

    .line 1403
    if-nez v0, :cond_50

    .line 1404
    .line 1405
    goto :goto_26

    .line 1406
    :cond_24
    const/16 v16, 0x22

    .line 1407
    .line 1408
    :goto_26
    invoke-virtual/range {p0 .. p1}, Lmp3;->d(Ljava/lang/String;)Lok3;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v0

    .line 1412
    sget-object v4, Lnk3;->b:Lnk3;

    .line 1413
    .line 1414
    invoke-virtual {v0, v4}, Lok3;->i(Lnk3;)Z

    .line 1415
    .line 1416
    .line 1417
    move-result v0

    .line 1418
    if-eqz v0, :cond_29

    .line 1419
    .line 1420
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v0

    .line 1424
    :cond_25
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1425
    .line 1426
    .line 1427
    move-result v5

    .line 1428
    if-eqz v5, :cond_26

    .line 1429
    .line 1430
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v5

    .line 1434
    check-cast v5, Landroid/util/Pair;

    .line 1435
    .line 1436
    iget-object v5, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1437
    .line 1438
    check-cast v5, Lcom/google/android/gms/internal/measurement/zzid;

    .line 1439
    .line 1440
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzid;->zzG()Ljava/lang/String;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v7

    .line 1444
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 1445
    .line 1446
    .line 1447
    move-result v7

    .line 1448
    if-nez v7, :cond_25

    .line 1449
    .line 1450
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzid;->zzG()Ljava/lang/String;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v0

    .line 1454
    goto :goto_27

    .line 1455
    :cond_26
    const/4 v0, 0x0

    .line 1456
    :goto_27
    if-eqz v0, :cond_29

    .line 1457
    .line 1458
    const/4 v5, 0x0

    .line 1459
    :goto_28
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 1460
    .line 1461
    .line 1462
    move-result v7

    .line 1463
    if-ge v5, v7, :cond_29

    .line 1464
    .line 1465
    invoke-interface {v12, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v7

    .line 1469
    check-cast v7, Landroid/util/Pair;

    .line 1470
    .line 1471
    iget-object v7, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1472
    .line 1473
    check-cast v7, Lcom/google/android/gms/internal/measurement/zzid;

    .line 1474
    .line 1475
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzid;->zzG()Ljava/lang/String;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v8

    .line 1479
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    .line 1480
    .line 1481
    .line 1482
    move-result v8

    .line 1483
    if-eqz v8, :cond_27

    .line 1484
    .line 1485
    goto :goto_29

    .line 1486
    :cond_27
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzid;->zzG()Ljava/lang/String;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v7

    .line 1490
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1491
    .line 1492
    .line 1493
    move-result v7

    .line 1494
    if-nez v7, :cond_28

    .line 1495
    .line 1496
    const/4 v8, 0x0

    .line 1497
    invoke-interface {v12, v8, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v12

    .line 1501
    goto :goto_2a

    .line 1502
    :cond_28
    :goto_29
    add-int/lit8 v5, v5, 0x1

    .line 1503
    .line 1504
    goto :goto_28

    .line 1505
    :cond_29
    :goto_2a
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzib;->zzh()Lcom/google/android/gms/internal/measurement/zzhz;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v0

    .line 1509
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 1510
    .line 1511
    .line 1512
    move-result v5

    .line 1513
    new-instance v7, Ljava/util/ArrayList;

    .line 1514
    .line 1515
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 1516
    .line 1517
    .line 1518
    move-result v8

    .line 1519
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 1520
    .line 1521
    .line 1522
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v8

    .line 1526
    invoke-virtual {v8, v6}, Lpd3;->A(Ljava/lang/String;)Z

    .line 1527
    .line 1528
    .line 1529
    move-result v8

    .line 1530
    if-eqz v8, :cond_2a

    .line 1531
    .line 1532
    invoke-virtual/range {p0 .. p1}, Lmp3;->d(Ljava/lang/String;)Lok3;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v8

    .line 1536
    invoke-virtual {v8, v4}, Lok3;->i(Lnk3;)Z

    .line 1537
    .line 1538
    .line 1539
    move-result v8

    .line 1540
    if-eqz v8, :cond_2a

    .line 1541
    .line 1542
    const/4 v8, 0x1

    .line 1543
    goto :goto_2b

    .line 1544
    :cond_2a
    const/4 v8, 0x0

    .line 1545
    :goto_2b
    invoke-virtual/range {p0 .. p1}, Lmp3;->d(Ljava/lang/String;)Lok3;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v11

    .line 1549
    invoke-virtual {v11, v4}, Lok3;->i(Lnk3;)Z

    .line 1550
    .line 1551
    .line 1552
    move-result v4

    .line 1553
    invoke-virtual/range {p0 .. p1}, Lmp3;->d(Ljava/lang/String;)Lok3;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v11

    .line 1557
    invoke-virtual {v11, v10}, Lok3;->i(Lnk3;)Z

    .line 1558
    .line 1559
    .line 1560
    move-result v10

    .line 1561
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzqu;->zza()Z

    .line 1562
    .line 1563
    .line 1564
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v11

    .line 1568
    sget-object v13, Lvg3;->M0:Lug3;

    .line 1569
    .line 1570
    invoke-virtual {v11, v6, v13}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 1571
    .line 1572
    .line 1573
    move-result v11

    .line 1574
    iget-object v13, v1, Lmp3;->U:Lyo3;

    .line 1575
    .line 1576
    invoke-virtual {v13, v6}, Lyo3;->A(Ljava/lang/String;)Lxo3;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v14

    .line 1580
    move/from16 v17, v4

    .line 1581
    .line 1582
    const/4 v15, 0x0

    .line 1583
    :goto_2c
    iget-object v4, v1, Lmp3;->W:Lij3;

    .line 1584
    .line 1585
    if-ge v15, v5, :cond_3c

    .line 1586
    .line 1587
    invoke-interface {v12, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v22

    .line 1591
    move-object/from16 v23, v4

    .line 1592
    .line 1593
    move-object/from16 v4, v22

    .line 1594
    .line 1595
    check-cast v4, Landroid/util/Pair;

    .line 1596
    .line 1597
    iget-object v4, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1598
    .line 1599
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzid;

    .line 1600
    .line 1601
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzme;->zzcl()Lcom/google/android/gms/internal/measurement/zzma;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v4

    .line 1605
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzic;

    .line 1606
    .line 1607
    invoke-interface {v12, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v22

    .line 1611
    move/from16 v24, v5

    .line 1612
    .line 1613
    move-object/from16 v5, v22

    .line 1614
    .line 1615
    check-cast v5, Landroid/util/Pair;

    .line 1616
    .line 1617
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1618
    .line 1619
    check-cast v5, Ljava/lang/Long;

    .line 1620
    .line 1621
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1622
    .line 1623
    .line 1624
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v5

    .line 1628
    invoke-virtual {v5}, Lpd3;->E()V

    .line 1629
    .line 1630
    .line 1631
    move v5, v10

    .line 1632
    move/from16 v22, v11

    .line 1633
    .line 1634
    const-wide/32 v10, 0x1fbd0

    .line 1635
    .line 1636
    .line 1637
    invoke-virtual {v4, v10, v11}, Lcom/google/android/gms/internal/measurement/zzic;->zzO(J)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1638
    .line 1639
    .line 1640
    invoke-virtual {v4, v2, v3}, Lcom/google/android/gms/internal/measurement/zzic;->zzs(J)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1641
    .line 1642
    .line 1643
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1644
    .line 1645
    .line 1646
    const/4 v10, 0x0

    .line 1647
    invoke-virtual {v4, v10}, Lcom/google/android/gms/internal/measurement/zzic;->zzae(Z)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1648
    .line 1649
    .line 1650
    if-nez v8, :cond_2b

    .line 1651
    .line 1652
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzic;->zzan()Lcom/google/android/gms/internal/measurement/zzic;

    .line 1653
    .line 1654
    .line 1655
    :cond_2b
    if-nez v17, :cond_2c

    .line 1656
    .line 1657
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzic;->zzR()Lcom/google/android/gms/internal/measurement/zzic;

    .line 1658
    .line 1659
    .line 1660
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzic;->zzU()Lcom/google/android/gms/internal/measurement/zzic;

    .line 1661
    .line 1662
    .line 1663
    :cond_2c
    if-nez v5, :cond_2d

    .line 1664
    .line 1665
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzic;->zzX()Lcom/google/android/gms/internal/measurement/zzic;

    .line 1666
    .line 1667
    .line 1668
    :cond_2d
    invoke-virtual {v1, v4, v6}, Lmp3;->v(Lcom/google/android/gms/internal/measurement/zzic;Ljava/lang/String;)V

    .line 1669
    .line 1670
    .line 1671
    if-nez v22, :cond_2e

    .line 1672
    .line 1673
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzic;->zzav()Lcom/google/android/gms/internal/measurement/zzic;

    .line 1674
    .line 1675
    .line 1676
    :cond_2e
    if-nez v5, :cond_2f

    .line 1677
    .line 1678
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzic;->zzag()Lcom/google/android/gms/internal/measurement/zzic;

    .line 1679
    .line 1680
    .line 1681
    :cond_2f
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzic;->zzP()Ljava/lang/String;

    .line 1682
    .line 1683
    .line 1684
    move-result-object v10

    .line 1685
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1686
    .line 1687
    .line 1688
    move-result v11

    .line 1689
    if-nez v11, :cond_31

    .line 1690
    .line 1691
    const-string v11, "00000000-0000-0000-0000-000000000000"

    .line 1692
    .line 1693
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1694
    .line 1695
    .line 1696
    move-result v10

    .line 1697
    if-eqz v10, :cond_30

    .line 1698
    .line 1699
    goto :goto_2d

    .line 1700
    :cond_30
    move/from16 v26, v5

    .line 1701
    .line 1702
    move/from16 v27, v8

    .line 1703
    .line 1704
    move-object/from16 v28, v12

    .line 1705
    .line 1706
    move/from16 v30, v15

    .line 1707
    .line 1708
    goto/16 :goto_30

    .line 1709
    .line 1710
    :cond_31
    :goto_2d
    new-instance v10, Ljava/util/ArrayList;

    .line 1711
    .line 1712
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzic;->zzb()Ljava/util/List;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v11

    .line 1716
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1717
    .line 1718
    .line 1719
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1720
    .line 1721
    .line 1722
    move-result-object v11

    .line 1723
    move/from16 v26, v5

    .line 1724
    .line 1725
    move/from16 v27, v8

    .line 1726
    .line 1727
    const/4 v5, 0x0

    .line 1728
    const/4 v8, 0x0

    .line 1729
    const/16 v23, 0x0

    .line 1730
    .line 1731
    const/16 v25, 0x0

    .line 1732
    .line 1733
    :goto_2e
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1734
    .line 1735
    .line 1736
    move-result v28

    .line 1737
    if-eqz v28, :cond_36

    .line 1738
    .line 1739
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v28

    .line 1743
    move-object/from16 v29, v11

    .line 1744
    .line 1745
    move-object/from16 v11, v28

    .line 1746
    .line 1747
    check-cast v11, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 1748
    .line 1749
    move-object/from16 v28, v12

    .line 1750
    .line 1751
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzhs;->zzd()Ljava/lang/String;

    .line 1752
    .line 1753
    .line 1754
    move-result-object v12

    .line 1755
    move/from16 v30, v15

    .line 1756
    .line 1757
    const-string v15, "_fx"

    .line 1758
    .line 1759
    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1760
    .line 1761
    .line 1762
    move-result v12

    .line 1763
    if-eqz v12, :cond_32

    .line 1764
    .line 1765
    invoke-interface/range {v29 .. v29}, Ljava/util/Iterator;->remove()V

    .line 1766
    .line 1767
    .line 1768
    move-object/from16 v12, v28

    .line 1769
    .line 1770
    move-object/from16 v11, v29

    .line 1771
    .line 1772
    move/from16 v15, v30

    .line 1773
    .line 1774
    const/16 v23, 0x1

    .line 1775
    .line 1776
    :goto_2f
    const/16 v25, 0x1

    .line 1777
    .line 1778
    goto :goto_2e

    .line 1779
    :cond_32
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzhs;->zzd()Ljava/lang/String;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v12

    .line 1783
    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1784
    .line 1785
    .line 1786
    move-result v12

    .line 1787
    if-eqz v12, :cond_35

    .line 1788
    .line 1789
    invoke-virtual {v1}, Lmp3;->i0()Lci3;

    .line 1790
    .line 1791
    .line 1792
    const-string v12, "_pfo"

    .line 1793
    .line 1794
    invoke-static {v11, v12}, Lci3;->H(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v12

    .line 1798
    if-eqz v12, :cond_33

    .line 1799
    .line 1800
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzhw;->zzf()J

    .line 1801
    .line 1802
    .line 1803
    move-result-wide v31

    .line 1804
    invoke-static/range {v31 .. v32}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1805
    .line 1806
    .line 1807
    move-result-object v5

    .line 1808
    :cond_33
    invoke-virtual {v1}, Lmp3;->i0()Lci3;

    .line 1809
    .line 1810
    .line 1811
    const-string v12, "_uwa"

    .line 1812
    .line 1813
    invoke-static {v11, v12}, Lci3;->H(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 1814
    .line 1815
    .line 1816
    move-result-object v11

    .line 1817
    if-eqz v11, :cond_34

    .line 1818
    .line 1819
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzhw;->zzf()J

    .line 1820
    .line 1821
    .line 1822
    move-result-wide v11

    .line 1823
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1824
    .line 1825
    .line 1826
    move-result-object v8

    .line 1827
    :cond_34
    move-object/from16 v12, v28

    .line 1828
    .line 1829
    move-object/from16 v11, v29

    .line 1830
    .line 1831
    move/from16 v15, v30

    .line 1832
    .line 1833
    goto :goto_2f

    .line 1834
    :cond_35
    move-object/from16 v12, v28

    .line 1835
    .line 1836
    move-object/from16 v11, v29

    .line 1837
    .line 1838
    move/from16 v15, v30

    .line 1839
    .line 1840
    goto :goto_2e

    .line 1841
    :cond_36
    move-object/from16 v28, v12

    .line 1842
    .line 1843
    move/from16 v30, v15

    .line 1844
    .line 1845
    if-eqz v23, :cond_37

    .line 1846
    .line 1847
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzic;->zzi()Lcom/google/android/gms/internal/measurement/zzic;

    .line 1848
    .line 1849
    .line 1850
    invoke-virtual {v4, v10}, Lcom/google/android/gms/internal/measurement/zzic;->zzh(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1851
    .line 1852
    .line 1853
    :cond_37
    if-eqz v25, :cond_38

    .line 1854
    .line 1855
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzic;->zzK()Ljava/lang/String;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v10

    .line 1859
    const/4 v11, 0x1

    .line 1860
    invoke-virtual {v1, v10, v11, v5, v8}, Lmp3;->u(Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;)V

    .line 1861
    .line 1862
    .line 1863
    :cond_38
    :goto_30
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzic;->zzc()I

    .line 1864
    .line 1865
    .line 1866
    move-result v5

    .line 1867
    if-nez v5, :cond_39

    .line 1868
    .line 1869
    goto :goto_31

    .line 1870
    :cond_39
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v5

    .line 1874
    sget-object v8, Lvg3;->C0:Lug3;

    .line 1875
    .line 1876
    invoke-virtual {v5, v6, v8}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 1877
    .line 1878
    .line 1879
    move-result v5

    .line 1880
    if-eqz v5, :cond_3a

    .line 1881
    .line 1882
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 1883
    .line 1884
    .line 1885
    move-result-object v5

    .line 1886
    check-cast v5, Lcom/google/android/gms/internal/measurement/zzid;

    .line 1887
    .line 1888
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzkr;->zzcc()[B

    .line 1889
    .line 1890
    .line 1891
    move-result-object v5

    .line 1892
    invoke-virtual {v1}, Lmp3;->i0()Lci3;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v8

    .line 1896
    invoke-virtual {v8, v5}, Lci3;->k0([B)J

    .line 1897
    .line 1898
    .line 1899
    move-result-wide v10

    .line 1900
    invoke-virtual {v4, v10, v11}, Lcom/google/android/gms/internal/measurement/zzic;->zzas(J)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1901
    .line 1902
    .line 1903
    :cond_3a
    invoke-virtual {v14}, Lxo3;->b()Lcom/google/android/gms/internal/measurement/zzis;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v5

    .line 1907
    if-eqz v5, :cond_3b

    .line 1908
    .line 1909
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/zzic;->zzaN(Lcom/google/android/gms/internal/measurement/zzis;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1910
    .line 1911
    .line 1912
    :cond_3b
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/measurement/zzhz;->zze(Lcom/google/android/gms/internal/measurement/zzic;)Lcom/google/android/gms/internal/measurement/zzhz;

    .line 1913
    .line 1914
    .line 1915
    :goto_31
    add-int/lit8 v15, v30, 0x1

    .line 1916
    .line 1917
    move/from16 v11, v22

    .line 1918
    .line 1919
    move/from16 v5, v24

    .line 1920
    .line 1921
    move/from16 v10, v26

    .line 1922
    .line 1923
    move/from16 v8, v27

    .line 1924
    .line 1925
    move-object/from16 v12, v28

    .line 1926
    .line 1927
    goto/16 :goto_2c

    .line 1928
    .line 1929
    :cond_3c
    move-object/from16 v23, v4

    .line 1930
    .line 1931
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhz;->zzb()I

    .line 1932
    .line 1933
    .line 1934
    move-result v4

    .line 1935
    if-nez v4, :cond_3d

    .line 1936
    .line 1937
    invoke-virtual {v1, v7}, Lmp3;->p(Ljava/util/ArrayList;)V

    .line 1938
    .line 1939
    .line 1940
    const/4 v5, 0x0

    .line 1941
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 1942
    .line 1943
    const/4 v2, 0x0

    .line 1944
    const/16 v3, 0xcc

    .line 1945
    .line 1946
    const/4 v4, 0x0

    .line 1947
    invoke-virtual/range {v1 .. v7}, Lmp3;->x(ZILjava/lang/Throwable;[BLjava/lang/String;Ljava/util/List;)V

    .line 1948
    .line 1949
    .line 1950
    return-void

    .line 1951
    :cond_3d
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 1952
    .line 1953
    .line 1954
    move-result-object v4

    .line 1955
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzib;

    .line 1956
    .line 1957
    new-instance v5, Ljava/util/ArrayList;

    .line 1958
    .line 1959
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1960
    .line 1961
    .line 1962
    iget-object v8, v14, Lxo3;->c:Lzl3;

    .line 1963
    .line 1964
    sget-object v9, Lzl3;->e:Lzl3;

    .line 1965
    .line 1966
    if-ne v8, v9, :cond_3e

    .line 1967
    .line 1968
    const/4 v9, 0x1

    .line 1969
    goto :goto_32

    .line 1970
    :cond_3e
    const/4 v9, 0x0

    .line 1971
    :goto_32
    sget-object v10, Lzl3;->d:Lzl3;

    .line 1972
    .line 1973
    if-eq v8, v10, :cond_40

    .line 1974
    .line 1975
    if-eqz v9, :cond_3f

    .line 1976
    .line 1977
    const/4 v11, 0x1

    .line 1978
    goto :goto_34

    .line 1979
    :cond_3f
    const/4 v15, 0x0

    .line 1980
    :goto_33
    move-object v0, v5

    .line 1981
    goto/16 :goto_3c

    .line 1982
    .line 1983
    :cond_40
    move v11, v9

    .line 1984
    :goto_34
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v4

    .line 1988
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzib;

    .line 1989
    .line 1990
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzib;->zza()Ljava/util/List;

    .line 1991
    .line 1992
    .line 1993
    move-result-object v4

    .line 1994
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1995
    .line 1996
    .line 1997
    move-result-object v4

    .line 1998
    :cond_41
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1999
    .line 2000
    .line 2001
    move-result v8

    .line 2002
    if-eqz v8, :cond_42

    .line 2003
    .line 2004
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2005
    .line 2006
    .line 2007
    move-result-object v8

    .line 2008
    check-cast v8, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2009
    .line 2010
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzid;->zzY()Z

    .line 2011
    .line 2012
    .line 2013
    move-result v8

    .line 2014
    if-eqz v8, :cond_41

    .line 2015
    .line 2016
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 2017
    .line 2018
    .line 2019
    move-result-object v4

    .line 2020
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 2021
    .line 2022
    .line 2023
    move-result-object v4

    .line 2024
    goto :goto_35

    .line 2025
    :cond_42
    const/4 v4, 0x0

    .line 2026
    :goto_35
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 2027
    .line 2028
    .line 2029
    move-result-object v8

    .line 2030
    check-cast v8, Lcom/google/android/gms/internal/measurement/zzib;

    .line 2031
    .line 2032
    invoke-virtual {v1}, Lmp3;->b()Lbj3;

    .line 2033
    .line 2034
    .line 2035
    move-result-object v9

    .line 2036
    invoke-virtual {v9}, Lbj3;->y()V

    .line 2037
    .line 2038
    .line 2039
    invoke-virtual {v1}, Lmp3;->k0()V

    .line 2040
    .line 2041
    .line 2042
    invoke-static {v8}, Lcom/google/android/gms/internal/measurement/zzib;->zzi(Lcom/google/android/gms/internal/measurement/zzib;)Lcom/google/android/gms/internal/measurement/zzhz;

    .line 2043
    .line 2044
    .line 2045
    move-result-object v9

    .line 2046
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2047
    .line 2048
    .line 2049
    move-result v10

    .line 2050
    if-nez v10, :cond_43

    .line 2051
    .line 2052
    invoke-virtual {v9, v4}, Lcom/google/android/gms/internal/measurement/zzhz;->zzi(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhz;

    .line 2053
    .line 2054
    .line 2055
    :cond_43
    invoke-virtual {v1}, Lmp3;->e0()Lvi3;

    .line 2056
    .line 2057
    .line 2058
    move-result-object v10

    .line 2059
    invoke-virtual {v10, v6}, Lvi3;->M(Ljava/lang/String;)Ljava/lang/String;

    .line 2060
    .line 2061
    .line 2062
    move-result-object v10

    .line 2063
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2064
    .line 2065
    .line 2066
    move-result v12

    .line 2067
    if-nez v12, :cond_44

    .line 2068
    .line 2069
    invoke-virtual {v9, v10}, Lcom/google/android/gms/internal/measurement/zzhz;->zzj(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhz;

    .line 2070
    .line 2071
    .line 2072
    :cond_44
    new-instance v10, Ljava/util/ArrayList;

    .line 2073
    .line 2074
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 2075
    .line 2076
    .line 2077
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzib;->zza()Ljava/util/List;

    .line 2078
    .line 2079
    .line 2080
    move-result-object v8

    .line 2081
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2082
    .line 2083
    .line 2084
    move-result-object v8

    .line 2085
    :goto_36
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 2086
    .line 2087
    .line 2088
    move-result v12

    .line 2089
    if-eqz v12, :cond_45

    .line 2090
    .line 2091
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2092
    .line 2093
    .line 2094
    move-result-object v12

    .line 2095
    check-cast v12, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2096
    .line 2097
    invoke-static {v12}, Lcom/google/android/gms/internal/measurement/zzid;->zzaF(Lcom/google/android/gms/internal/measurement/zzid;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 2098
    .line 2099
    .line 2100
    move-result-object v12

    .line 2101
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzic;->zzan()Lcom/google/android/gms/internal/measurement/zzic;

    .line 2102
    .line 2103
    .line 2104
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 2105
    .line 2106
    .line 2107
    move-result-object v12

    .line 2108
    check-cast v12, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2109
    .line 2110
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2111
    .line 2112
    .line 2113
    goto :goto_36

    .line 2114
    :cond_45
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzhz;->zzg()Lcom/google/android/gms/internal/measurement/zzhz;

    .line 2115
    .line 2116
    .line 2117
    invoke-virtual {v9, v10}, Lcom/google/android/gms/internal/measurement/zzhz;->zzf(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzhz;

    .line 2118
    .line 2119
    .line 2120
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 2121
    .line 2122
    .line 2123
    move-result-object v8

    .line 2124
    invoke-virtual {v8}, Luh3;->G()Lsh3;

    .line 2125
    .line 2126
    .line 2127
    move-result-object v8

    .line 2128
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2129
    .line 2130
    .line 2131
    move-result v10

    .line 2132
    if-eqz v10, :cond_46

    .line 2133
    .line 2134
    const-string v10, "null"

    .line 2135
    .line 2136
    goto :goto_37

    .line 2137
    :cond_46
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzhz;->zzh()Ljava/lang/String;

    .line 2138
    .line 2139
    .line 2140
    move-result-object v10

    .line 2141
    :goto_37
    const-string v12, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: "

    .line 2142
    .line 2143
    invoke-virtual {v8, v10, v12}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2144
    .line 2145
    .line 2146
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 2147
    .line 2148
    .line 2149
    move-result-object v8

    .line 2150
    check-cast v8, Lcom/google/android/gms/internal/measurement/zzib;

    .line 2151
    .line 2152
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2153
    .line 2154
    .line 2155
    move-result v9

    .line 2156
    if-nez v9, :cond_4b

    .line 2157
    .line 2158
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 2159
    .line 2160
    .line 2161
    move-result-object v0

    .line 2162
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzib;

    .line 2163
    .line 2164
    invoke-virtual {v1}, Lmp3;->b()Lbj3;

    .line 2165
    .line 2166
    .line 2167
    move-result-object v9

    .line 2168
    invoke-virtual {v9}, Lbj3;->y()V

    .line 2169
    .line 2170
    .line 2171
    invoke-virtual {v1}, Lmp3;->k0()V

    .line 2172
    .line 2173
    .line 2174
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzib;->zzh()Lcom/google/android/gms/internal/measurement/zzhz;

    .line 2175
    .line 2176
    .line 2177
    move-result-object v9

    .line 2178
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 2179
    .line 2180
    .line 2181
    move-result-object v10

    .line 2182
    invoke-virtual {v10}, Luh3;->G()Lsh3;

    .line 2183
    .line 2184
    .line 2185
    move-result-object v10

    .line 2186
    const-string v12, "[sgtm] Processing Google Signal, sgtmJoinId:"

    .line 2187
    .line 2188
    invoke-virtual {v10, v4, v12}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2189
    .line 2190
    .line 2191
    invoke-virtual {v9, v4}, Lcom/google/android/gms/internal/measurement/zzhz;->zzi(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhz;

    .line 2192
    .line 2193
    .line 2194
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzib;->zza()Ljava/util/List;

    .line 2195
    .line 2196
    .line 2197
    move-result-object v0

    .line 2198
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2199
    .line 2200
    .line 2201
    move-result-object v0

    .line 2202
    :goto_38
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2203
    .line 2204
    .line 2205
    move-result v4

    .line 2206
    if-eqz v4, :cond_47

    .line 2207
    .line 2208
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2209
    .line 2210
    .line 2211
    move-result-object v4

    .line 2212
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzid;

    .line 2213
    .line 2214
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzid;->zzaE()Lcom/google/android/gms/internal/measurement/zzic;

    .line 2215
    .line 2216
    .line 2217
    move-result-object v10

    .line 2218
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzid;->zzZ()Ljava/lang/String;

    .line 2219
    .line 2220
    .line 2221
    move-result-object v12

    .line 2222
    invoke-virtual {v10, v12}, Lcom/google/android/gms/internal/measurement/zzic;->zzam(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 2223
    .line 2224
    .line 2225
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzid;->zzav()I

    .line 2226
    .line 2227
    .line 2228
    move-result v4

    .line 2229
    invoke-virtual {v10, v4}, Lcom/google/android/gms/internal/measurement/zzic;->zzaJ(I)Lcom/google/android/gms/internal/measurement/zzic;

    .line 2230
    .line 2231
    .line 2232
    invoke-virtual {v9, v10}, Lcom/google/android/gms/internal/measurement/zzhz;->zze(Lcom/google/android/gms/internal/measurement/zzic;)Lcom/google/android/gms/internal/measurement/zzhz;

    .line 2233
    .line 2234
    .line 2235
    goto :goto_38

    .line 2236
    :cond_47
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 2237
    .line 2238
    .line 2239
    move-result-object v0

    .line 2240
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzib;

    .line 2241
    .line 2242
    iget-object v4, v13, Lqo3;->b:Lmp3;

    .line 2243
    .line 2244
    invoke-virtual {v4}, Lmp3;->e0()Lvi3;

    .line 2245
    .line 2246
    .line 2247
    move-result-object v4

    .line 2248
    invoke-virtual {v4, v6}, Lvi3;->M(Ljava/lang/String;)Ljava/lang/String;

    .line 2249
    .line 2250
    .line 2251
    move-result-object v4

    .line 2252
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2253
    .line 2254
    .line 2255
    move-result v9

    .line 2256
    sget-object v10, Lzl3;->c:Lzl3;

    .line 2257
    .line 2258
    sget-object v12, Lzl3;->f:Lzl3;

    .line 2259
    .line 2260
    if-nez v9, :cond_49

    .line 2261
    .line 2262
    sget-object v9, Lvg3;->s:Lug3;

    .line 2263
    .line 2264
    const/4 v15, 0x0

    .line 2265
    invoke-virtual {v9, v15}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2266
    .line 2267
    .line 2268
    move-result-object v9

    .line 2269
    check-cast v9, Ljava/lang/String;

    .line 2270
    .line 2271
    invoke-static {v9}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 2272
    .line 2273
    .line 2274
    move-result-object v9

    .line 2275
    invoke-virtual {v9}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 2276
    .line 2277
    .line 2278
    move-result-object v13

    .line 2279
    invoke-virtual {v9}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 2280
    .line 2281
    .line 2282
    move-result-object v9

    .line 2283
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2284
    .line 2285
    .line 2286
    move-result-object v15

    .line 2287
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 2288
    .line 2289
    .line 2290
    move-result v15

    .line 2291
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2292
    .line 2293
    .line 2294
    move-result-object v17

    .line 2295
    const/16 v18, 0x1

    .line 2296
    .line 2297
    add-int/lit8 v15, v15, 0x1

    .line 2298
    .line 2299
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    .line 2300
    .line 2301
    .line 2302
    move-result v17

    .line 2303
    new-instance v6, Ljava/lang/StringBuilder;

    .line 2304
    .line 2305
    add-int v15, v15, v17

    .line 2306
    .line 2307
    invoke-direct {v6, v15}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2308
    .line 2309
    .line 2310
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2311
    .line 2312
    .line 2313
    const-string v4, "."

    .line 2314
    .line 2315
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2316
    .line 2317
    .line 2318
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2319
    .line 2320
    .line 2321
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2322
    .line 2323
    .line 2324
    move-result-object v4

    .line 2325
    invoke-virtual {v13, v4}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 2326
    .line 2327
    .line 2328
    new-instance v4, Lxo3;

    .line 2329
    .line 2330
    invoke-virtual {v13}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 2331
    .line 2332
    .line 2333
    move-result-object v6

    .line 2334
    invoke-virtual {v6}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 2335
    .line 2336
    .line 2337
    move-result-object v6

    .line 2338
    if-eqz v11, :cond_48

    .line 2339
    .line 2340
    move-object v10, v12

    .line 2341
    :cond_48
    sget-object v9, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2342
    .line 2343
    const/4 v15, 0x0

    .line 2344
    invoke-direct {v4, v6, v9, v10, v15}, Lxo3;-><init>(Ljava/lang/String;Ljava/util/Map;Lzl3;Lcom/google/android/gms/internal/measurement/zzis;)V

    .line 2345
    .line 2346
    .line 2347
    goto :goto_39

    .line 2348
    :cond_49
    const/4 v15, 0x0

    .line 2349
    new-instance v4, Lxo3;

    .line 2350
    .line 2351
    sget-object v6, Lvg3;->s:Lug3;

    .line 2352
    .line 2353
    invoke-virtual {v6, v15}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2354
    .line 2355
    .line 2356
    move-result-object v6

    .line 2357
    check-cast v6, Ljava/lang/String;

    .line 2358
    .line 2359
    if-eqz v11, :cond_4a

    .line 2360
    .line 2361
    move-object v10, v12

    .line 2362
    :cond_4a
    sget-object v9, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2363
    .line 2364
    invoke-direct {v4, v6, v9, v10, v15}, Lxo3;-><init>(Ljava/lang/String;Ljava/util/Map;Lzl3;Lcom/google/android/gms/internal/measurement/zzis;)V

    .line 2365
    .line 2366
    .line 2367
    :goto_39
    invoke-static {v0, v4}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 2368
    .line 2369
    .line 2370
    move-result-object v0

    .line 2371
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2372
    .line 2373
    .line 2374
    goto :goto_3a

    .line 2375
    :cond_4b
    const/4 v15, 0x0

    .line 2376
    :goto_3a
    if-eqz v11, :cond_4e

    .line 2377
    .line 2378
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzme;->zzcl()Lcom/google/android/gms/internal/measurement/zzma;

    .line 2379
    .line 2380
    .line 2381
    move-result-object v0

    .line 2382
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhz;

    .line 2383
    .line 2384
    const/4 v4, 0x0

    .line 2385
    :goto_3b
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzib;->zzb()I

    .line 2386
    .line 2387
    .line 2388
    move-result v6

    .line 2389
    if-ge v4, v6, :cond_4c

    .line 2390
    .line 2391
    invoke-virtual {v8, v4}, Lcom/google/android/gms/internal/measurement/zzib;->zzc(I)Lcom/google/android/gms/internal/measurement/zzid;

    .line 2392
    .line 2393
    .line 2394
    move-result-object v6

    .line 2395
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzme;->zzcl()Lcom/google/android/gms/internal/measurement/zzma;

    .line 2396
    .line 2397
    .line 2398
    move-result-object v6

    .line 2399
    check-cast v6, Lcom/google/android/gms/internal/measurement/zzic;

    .line 2400
    .line 2401
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzic;->zzt()Lcom/google/android/gms/internal/measurement/zzic;

    .line 2402
    .line 2403
    .line 2404
    invoke-virtual {v6, v2, v3}, Lcom/google/android/gms/internal/measurement/zzic;->zzaO(J)Lcom/google/android/gms/internal/measurement/zzic;

    .line 2405
    .line 2406
    .line 2407
    invoke-virtual {v0, v4, v6}, Lcom/google/android/gms/internal/measurement/zzhz;->zzd(ILcom/google/android/gms/internal/measurement/zzic;)Lcom/google/android/gms/internal/measurement/zzhz;

    .line 2408
    .line 2409
    .line 2410
    add-int/lit8 v4, v4, 0x1

    .line 2411
    .line 2412
    goto :goto_3b

    .line 2413
    :cond_4c
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 2414
    .line 2415
    .line 2416
    move-result-object v0

    .line 2417
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzib;

    .line 2418
    .line 2419
    invoke-static {v0, v14}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 2420
    .line 2421
    .line 2422
    move-result-object v0

    .line 2423
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2424
    .line 2425
    .line 2426
    invoke-virtual {v1, v7}, Lmp3;->p(Ljava/util/ArrayList;)V

    .line 2427
    .line 2428
    .line 2429
    const/4 v4, 0x0

    .line 2430
    move-object v7, v5

    .line 2431
    const/4 v5, 0x0

    .line 2432
    const/4 v2, 0x0

    .line 2433
    const/16 v3, 0xcc

    .line 2434
    .line 2435
    move-object/from16 v6, p1

    .line 2436
    .line 2437
    invoke-virtual/range {v1 .. v7}, Lmp3;->x(ZILjava/lang/Throwable;[BLjava/lang/String;Ljava/util/List;)V

    .line 2438
    .line 2439
    .line 2440
    invoke-virtual {v14}, Lxo3;->a()Ljava/lang/String;

    .line 2441
    .line 2442
    .line 2443
    move-result-object v0

    .line 2444
    invoke-virtual {v1, v6, v0}, Lmp3;->s(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2445
    .line 2446
    .line 2447
    move-result v0

    .line 2448
    if-eqz v0, :cond_50

    .line 2449
    .line 2450
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 2451
    .line 2452
    .line 2453
    move-result-object v0

    .line 2454
    invoke-virtual {v0}, Luh3;->G()Lsh3;

    .line 2455
    .line 2456
    .line 2457
    move-result-object v0

    .line 2458
    const-string v1, "[sgtm] Sending sgtm batches available notification to app"

    .line 2459
    .line 2460
    invoke-virtual {v0, v6, v1}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2461
    .line 2462
    .line 2463
    new-instance v0, Landroid/content/Intent;

    .line 2464
    .line 2465
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 2466
    .line 2467
    .line 2468
    const-string v1, "com.google.android.gms.measurement.BATCHES_AVAILABLE"

    .line 2469
    .line 2470
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 2471
    .line 2472
    .line 2473
    invoke-virtual {v0, v6}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 2474
    .line 2475
    .line 2476
    invoke-virtual/range {v23 .. v23}, Lij3;->e()Landroid/content/Context;

    .line 2477
    .line 2478
    .line 2479
    move-result-object v1

    .line 2480
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2481
    .line 2482
    move/from16 v3, v16

    .line 2483
    .line 2484
    if-ge v2, v3, :cond_4d

    .line 2485
    .line 2486
    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 2487
    .line 2488
    .line 2489
    goto :goto_3d

    .line 2490
    :cond_4d
    invoke-static {}, Lgh;->f()Landroid/app/BroadcastOptions;

    .line 2491
    .line 2492
    .line 2493
    move-result-object v2

    .line 2494
    invoke-static {v2}, Lgh;->g(Landroid/app/BroadcastOptions;)Landroid/app/BroadcastOptions;

    .line 2495
    .line 2496
    .line 2497
    move-result-object v2

    .line 2498
    invoke-static {v2}, Lgh;->j(Landroid/app/BroadcastOptions;)Landroid/os/Bundle;

    .line 2499
    .line 2500
    .line 2501
    move-result-object v2

    .line 2502
    invoke-static {v1, v0, v2}, Lgh;->q(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 2503
    .line 2504
    .line 2505
    goto :goto_3d

    .line 2506
    :cond_4e
    move-object/from16 v6, p1

    .line 2507
    .line 2508
    move-object v4, v8

    .line 2509
    goto/16 :goto_33

    .line 2510
    .line 2511
    :goto_3c
    iget-object v5, v1, Lmp3;->b:Lci3;

    .line 2512
    .line 2513
    invoke-static {v5}, Lmp3;->S(Lwo3;)V

    .line 2514
    .line 2515
    .line 2516
    invoke-virtual {v5}, Lci3;->T()Z

    .line 2517
    .line 2518
    .line 2519
    move-result v8

    .line 2520
    if-eqz v8, :cond_50

    .line 2521
    .line 2522
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 2523
    .line 2524
    .line 2525
    move-result-object v8

    .line 2526
    invoke-virtual {v8}, Luh3;->J()Ljava/lang/String;

    .line 2527
    .line 2528
    .line 2529
    move-result-object v8

    .line 2530
    const/4 v11, 0x2

    .line 2531
    invoke-static {v8, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 2532
    .line 2533
    .line 2534
    move-result v8

    .line 2535
    if-eqz v8, :cond_4f

    .line 2536
    .line 2537
    invoke-virtual {v1}, Lmp3;->i0()Lci3;

    .line 2538
    .line 2539
    .line 2540
    move-result-object v8

    .line 2541
    invoke-virtual {v8, v4}, Lci3;->c0(Lcom/google/android/gms/internal/measurement/zzib;)Ljava/lang/String;

    .line 2542
    .line 2543
    .line 2544
    move-result-object v8

    .line 2545
    move-object v15, v8

    .line 2546
    :cond_4f
    invoke-virtual {v1}, Lmp3;->i0()Lci3;

    .line 2547
    .line 2548
    .line 2549
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzkr;->zzcc()[B

    .line 2550
    .line 2551
    .line 2552
    move-result-object v8

    .line 2553
    invoke-virtual {v1, v7}, Lmp3;->p(Ljava/util/ArrayList;)V

    .line 2554
    .line 2555
    .line 2556
    iget-object v7, v1, Lmp3;->w:Ltn3;

    .line 2557
    .line 2558
    iget-object v7, v7, Ltn3;->w:Lio/sentry/android/core/s;

    .line 2559
    .line 2560
    invoke-virtual {v7, v2, v3}, Lio/sentry/android/core/s;->b(J)V

    .line 2561
    .line 2562
    .line 2563
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 2564
    .line 2565
    .line 2566
    move-result-object v2

    .line 2567
    invoke-virtual {v2}, Luh3;->G()Lsh3;

    .line 2568
    .line 2569
    .line 2570
    move-result-object v2

    .line 2571
    array-length v3, v8

    .line 2572
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2573
    .line 2574
    .line 2575
    move-result-object v3

    .line 2576
    const-string v7, "Uploading data. app, uncompressed size, data"

    .line 2577
    .line 2578
    invoke-virtual {v2, v7, v6, v3, v15}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2579
    .line 2580
    .line 2581
    const/4 v11, 0x1

    .line 2582
    iput-boolean v11, v1, Lmp3;->f0:Z

    .line 2583
    .line 2584
    invoke-static {v5}, Lmp3;->S(Lwo3;)V

    .line 2585
    .line 2586
    .line 2587
    new-instance v2, Lbp3;

    .line 2588
    .line 2589
    const/4 v8, 0x0

    .line 2590
    invoke-direct {v2, v1, v6, v0, v8}, Lbp3;-><init>(Lmp3;Ljava/lang/String;Ljava/lang/Object;I)V

    .line 2591
    .line 2592
    .line 2593
    invoke-virtual {v5, v6, v14, v4, v2}, Lci3;->Y(Ljava/lang/String;Lxo3;Lcom/google/android/gms/internal/measurement/zzib;Lyh3;)V

    .line 2594
    .line 2595
    .line 2596
    :cond_50
    :goto_3d
    return-void

    .line 2597
    :goto_3e
    if-eqz v14, :cond_51

    .line 2598
    .line 2599
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 2600
    .line 2601
    .line 2602
    :cond_51
    throw v0
.end method

.method public final s(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lmp3;->c:Lae3;

    .line 2
    .line 3
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lae3;->D0(Ljava/lang/String;)Ldi3;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lmp3;->p0:Ljava/util/HashMap;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lmp3;->j0()Lup3;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {v0}, Ldi3;->C()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, p1, v0}, Lup3;->Z(Ljava/lang/String;Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return v2

    .line 34
    :cond_1
    :goto_0
    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Lkp3;

    .line 39
    .line 40
    if-nez p0, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iget-object p1, p0, Lkp3;->a:Lmp3;

    .line 44
    .line 45
    invoke-virtual {p1}, Lmp3;->f()Lxv;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Lxt0;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 55
    .line 56
    .line 57
    move-result-wide p1

    .line 58
    iget-wide v0, p0, Lkp3;->c:J

    .line 59
    .line 60
    cmp-long p0, p1, v0

    .line 61
    .line 62
    if-ltz p0, :cond_3

    .line 63
    .line 64
    :goto_1
    return v2

    .line 65
    :cond_3
    const/4 p0, 0x0

    .line 66
    return p0
.end method

.method public final t(Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lbj3;->y()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lmp3;->k0()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lmp3;->g0:Z

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    :try_start_0
    iget-object v2, p0, Lmp3;->W:Lij3;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Lij3;->o()Lpn3;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-object v2, v2, Lpn3;->e:Ljava/lang/Boolean;

    .line 25
    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object p1, p1, Luh3;->w:Lsh3;

    .line 33
    .line 34
    const-string v0, "Upload data called on the client side before use of service was decided"

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lsh3;->a(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_1

    .line 40
    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto/16 :goto_2

    .line 43
    .line 44
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object p1, p1, Luh3;->f:Lsh3;

    .line 55
    .line 56
    const-string v0, "Upload called in the client side when service should be used"

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Lsh3;->a(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_1

    .line 62
    .line 63
    :cond_1
    iget-wide v2, p0, Lmp3;->Z:J

    .line 64
    .line 65
    const-wide/16 v4, 0x0

    .line 66
    .line 67
    cmp-long v2, v2, v4

    .line 68
    .line 69
    if-lez v2, :cond_2

    .line 70
    .line 71
    invoke-virtual {p0}, Lmp3;->L()V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_1

    .line 75
    .line 76
    :cond_2
    iget-object v2, p0, Lmp3;->b:Lci3;

    .line 77
    .line 78
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Lci3;->T()Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-nez v2, :cond_3

    .line 86
    .line 87
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iget-object p1, p1, Luh3;->Y:Lsh3;

    .line 92
    .line 93
    const-string v0, "Network not connected, ignoring upload request"

    .line 94
    .line 95
    invoke-virtual {p1, v0}, Lsh3;->a(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lmp3;->L()V

    .line 99
    .line 100
    .line 101
    goto/16 :goto_1

    .line 102
    .line 103
    :cond_3
    iget-object v2, p0, Lmp3;->c:Lae3;

    .line 104
    .line 105
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, p1}, Lae3;->F(Ljava/lang/String;)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-nez v2, :cond_4

    .line 113
    .line 114
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 119
    .line 120
    const-string v2, "[sgtm] Upload queue has no batches for appId"

    .line 121
    .line 122
    invoke-virtual {v0, p1, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    goto/16 :goto_1

    .line 126
    .line 127
    :cond_4
    iget-object v2, p0, Lmp3;->c:Lae3;

    .line 128
    .line 129
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 130
    .line 131
    .line 132
    invoke-static {p1}, Lkb1;->k(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2}, Lsq3;->y()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Lwo3;->A()V

    .line 139
    .line 140
    .line 141
    sget-object v3, Lzl3;->c:Lzl3;

    .line 142
    .line 143
    filled-new-array {v3}, [Lzl3;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/zzon;->D1([Lzl3;)Lcom/google/android/gms/measurement/internal/zzon;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-virtual {v2, p1, v3, v0}, Lae3;->E(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzon;I)Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    const/4 v4, 0x0

    .line 160
    if-eqz v3, :cond_5

    .line 161
    .line 162
    move-object v2, v4

    .line 163
    goto :goto_0

    .line 164
    :cond_5
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    check-cast v2, Lpp3;

    .line 169
    .line 170
    :goto_0
    if-eqz v2, :cond_7

    .line 171
    .line 172
    iget-object v3, v2, Lpp3;->b:Lcom/google/android/gms/internal/measurement/zzib;

    .line 173
    .line 174
    if-eqz v3, :cond_7

    .line 175
    .line 176
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    iget-object v5, v5, Luh3;->Y:Lsh3;

    .line 181
    .line 182
    const-string v6, "[sgtm] Uploading data from upload queue. appId, type, url"

    .line 183
    .line 184
    iget-object v7, v2, Lpp3;->e:Lzl3;

    .line 185
    .line 186
    iget-object v8, v2, Lpp3;->c:Ljava/lang/String;

    .line 187
    .line 188
    invoke-virtual {v5, v6, p1, v7, v8}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzkr;->zzcc()[B

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    invoke-virtual {v6}, Luh3;->J()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    const/4 v7, 0x2

    .line 204
    invoke-static {v6, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 205
    .line 206
    .line 207
    move-result v6

    .line 208
    if-eqz v6, :cond_6

    .line 209
    .line 210
    iget-object v6, p0, Lmp3;->i:Lci3;

    .line 211
    .line 212
    invoke-static {v6}, Lmp3;->S(Lwo3;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v6, v3}, Lci3;->c0(Lcom/google/android/gms/internal/measurement/zzib;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    iget-object v7, v7, Luh3;->Y:Lsh3;

    .line 224
    .line 225
    const-string v8, "[sgtm] Uploading data from upload queue. appId, uncompressed size, data"

    .line 226
    .line 227
    array-length v5, v5

    .line 228
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    invoke-virtual {v7, v8, p1, v5, v6}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    :cond_6
    new-instance v5, Lxo3;

    .line 236
    .line 237
    iget-object v6, v2, Lpp3;->c:Ljava/lang/String;

    .line 238
    .line 239
    iget-object v7, v2, Lpp3;->d:Ljava/util/HashMap;

    .line 240
    .line 241
    iget-object v8, v2, Lpp3;->e:Lzl3;

    .line 242
    .line 243
    invoke-direct {v5, v6, v7, v8, v4}, Lxo3;-><init>(Ljava/lang/String;Ljava/util/Map;Lzl3;Lcom/google/android/gms/internal/measurement/zzis;)V

    .line 244
    .line 245
    .line 246
    iput-boolean v0, p0, Lmp3;->f0:Z

    .line 247
    .line 248
    iget-object v4, p0, Lmp3;->b:Lci3;

    .line 249
    .line 250
    invoke-static {v4}, Lmp3;->S(Lwo3;)V

    .line 251
    .line 252
    .line 253
    new-instance v6, Lbp3;

    .line 254
    .line 255
    invoke-direct {v6, p0, p1, v2, v0}, Lbp3;-><init>(Lmp3;Ljava/lang/String;Ljava/lang/Object;I)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v4, p1, v5, v3, v6}, Lci3;->Y(Ljava/lang/String;Lxo3;Lcom/google/android/gms/internal/measurement/zzib;Lyh3;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 259
    .line 260
    .line 261
    :cond_7
    :goto_1
    iput-boolean v1, p0, Lmp3;->g0:Z

    .line 262
    .line 263
    invoke-virtual {p0}, Lmp3;->M()V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :goto_2
    iput-boolean v1, p0, Lmp3;->g0:Z

    .line 268
    .line 269
    invoke-virtual {p0}, Lmp3;->M()V

    .line 270
    .line 271
    .line 272
    throw p1
.end method

.method public final u(Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lmp3;->c:Lae3;

    .line 2
    .line 3
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lae3;->D0(Ljava/lang/String;)Ldi3;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object v0, p1, Ldi3;->a:Lij3;

    .line 13
    .line 14
    iget-object v1, v0, Lij3;->i:Lbj3;

    .line 15
    .line 16
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lbj3;->y()V

    .line 20
    .line 21
    .line 22
    iget-boolean v1, p1, Ldi3;->Q:Z

    .line 23
    .line 24
    iget-boolean v2, p1, Ldi3;->y:Z

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    const/4 v4, 0x0

    .line 28
    if-eq v2, p2, :cond_0

    .line 29
    .line 30
    move v2, v3

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v2, v4

    .line 33
    :goto_0
    or-int/2addr v1, v2

    .line 34
    iput-boolean v1, p1, Ldi3;->Q:Z

    .line 35
    .line 36
    iput-boolean p2, p1, Ldi3;->y:Z

    .line 37
    .line 38
    iget-object p2, v0, Lij3;->i:Lbj3;

    .line 39
    .line 40
    invoke-static {p2}, Lij3;->l(Lhk3;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Lbj3;->y()V

    .line 44
    .line 45
    .line 46
    iget-boolean p2, p1, Ldi3;->Q:Z

    .line 47
    .line 48
    iget-object v1, p1, Ldi3;->z:Ljava/lang/Long;

    .line 49
    .line 50
    invoke-static {v1, p3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    xor-int/2addr v1, v3

    .line 55
    or-int/2addr p2, v1

    .line 56
    iput-boolean p2, p1, Ldi3;->Q:Z

    .line 57
    .line 58
    iput-object p3, p1, Ldi3;->z:Ljava/lang/Long;

    .line 59
    .line 60
    iget-object p2, v0, Lij3;->i:Lbj3;

    .line 61
    .line 62
    invoke-static {p2}, Lij3;->l(Lhk3;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2}, Lbj3;->y()V

    .line 66
    .line 67
    .line 68
    iget-boolean p2, p1, Ldi3;->Q:Z

    .line 69
    .line 70
    iget-object p3, p1, Ldi3;->A:Ljava/lang/Long;

    .line 71
    .line 72
    invoke-static {p3, p4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p3

    .line 76
    xor-int/2addr p3, v3

    .line 77
    or-int/2addr p2, p3

    .line 78
    iput-boolean p2, p1, Ldi3;->Q:Z

    .line 79
    .line 80
    iput-object p4, p1, Ldi3;->A:Ljava/lang/Long;

    .line 81
    .line 82
    invoke-virtual {p1}, Ldi3;->o()Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-eqz p2, :cond_1

    .line 87
    .line 88
    iget-object p0, p0, Lmp3;->c:Lae3;

    .line 89
    .line 90
    invoke-static {p0}, Lmp3;->S(Lwo3;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, p1, v4}, Lae3;->E0(Ldi3;Z)V

    .line 94
    .line 95
    .line 96
    :cond_1
    return-void
.end method

.method public final v(Lcom/google/android/gms/internal/measurement/zzic;Ljava/lang/String;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lmp3;->a:Lvi3;

    .line 2
    .line 3
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lsq3;->y()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2}, Lvi3;->F(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lvi3;->e:Lid;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v1, p2, v2}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Ljava/util/Set;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/measurement/zzic;->zzaw(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lsq3;->y()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p2}, Lvi3;->F(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p2, v2}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    invoke-virtual {v1, p2, v2}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Ljava/util/Set;

    .line 46
    .line 47
    const-string v4, "device_model"

    .line 48
    .line 49
    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-nez v3, :cond_1

    .line 54
    .line 55
    invoke-virtual {v1, p2, v2}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Ljava/util/Set;

    .line 60
    .line 61
    const-string v4, "device_info"

    .line 62
    .line 63
    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-nez v3, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzic;->zzG()Lcom/google/android/gms/internal/measurement/zzic;

    .line 71
    .line 72
    .line 73
    :cond_2
    :goto_0
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, p2}, Lvi3;->R(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    const/4 v4, -0x1

    .line 81
    if-eqz v3, :cond_3

    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzic;->zzD()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-nez v5, :cond_3

    .line 92
    .line 93
    const-string v5, "."

    .line 94
    .line 95
    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eq v5, v4, :cond_3

    .line 100
    .line 101
    const/4 v6, 0x0

    .line 102
    invoke-virtual {v3, v6, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/measurement/zzic;->zzE(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 107
    .line 108
    .line 109
    :cond_3
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Lsq3;->y()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, p2}, Lvi3;->F(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, p2, v2}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    if-eqz v3, :cond_4

    .line 123
    .line 124
    invoke-virtual {v1, p2, v2}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    check-cast v3, Ljava/util/Set;

    .line 129
    .line 130
    const-string v5, "user_id"

    .line 131
    .line 132
    invoke-interface {v3, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-eqz v3, :cond_4

    .line 137
    .line 138
    const-string v3, "_id"

    .line 139
    .line 140
    invoke-static {p1, v3}, Lci3;->n0(Lcom/google/android/gms/internal/measurement/zzic;Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-eq v3, v4, :cond_4

    .line 145
    .line 146
    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/measurement/zzic;->zzr(I)Lcom/google/android/gms/internal/measurement/zzic;

    .line 147
    .line 148
    .line 149
    :cond_4
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Lsq3;->y()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, p2}, Lvi3;->F(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, p2, v2}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    if-eqz v3, :cond_5

    .line 163
    .line 164
    invoke-virtual {v1, p2, v2}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    check-cast v3, Ljava/util/Set;

    .line 169
    .line 170
    const-string v4, "google_signals"

    .line 171
    .line 172
    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-eqz v3, :cond_5

    .line 177
    .line 178
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzic;->zzan()Lcom/google/android/gms/internal/measurement/zzic;

    .line 179
    .line 180
    .line 181
    :cond_5
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0, p2}, Lvi3;->S(Ljava/lang/String;)Z

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    if-eqz v3, :cond_8

    .line 189
    .line 190
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzic;->zzX()Lcom/google/android/gms/internal/measurement/zzic;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0, p2}, Lmp3;->d(Ljava/lang/String;)Lok3;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    sget-object v4, Lnk3;->c:Lnk3;

    .line 198
    .line 199
    invoke-virtual {v3, v4}, Lok3;->i(Lnk3;)Z

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    if-eqz v3, :cond_8

    .line 204
    .line 205
    iget-object v3, p0, Lmp3;->o0:Ljava/util/HashMap;

    .line 206
    .line 207
    invoke-virtual {v3, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    check-cast v4, Ljp3;

    .line 212
    .line 213
    if-eqz v4, :cond_6

    .line 214
    .line 215
    iget-wide v5, v4, Ljp3;->b:J

    .line 216
    .line 217
    invoke-virtual {p0}, Lmp3;->d0()Lpd3;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    sget-object v8, Lvg3;->k0:Lug3;

    .line 222
    .line 223
    invoke-virtual {v7, p2, v8}, Lpd3;->G(Ljava/lang/String;Lug3;)J

    .line 224
    .line 225
    .line 226
    move-result-wide v7

    .line 227
    add-long/2addr v7, v5

    .line 228
    invoke-virtual {p0}, Lmp3;->f()Lxv;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    check-cast v5, Lxt0;

    .line 233
    .line 234
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 238
    .line 239
    .line 240
    move-result-wide v5

    .line 241
    cmp-long v5, v7, v5

    .line 242
    .line 243
    if-gez v5, :cond_7

    .line 244
    .line 245
    :cond_6
    new-instance v4, Ljp3;

    .line 246
    .line 247
    invoke-virtual {p0}, Lmp3;->j0()Lup3;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    invoke-virtual {v5}, Lup3;->r0()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    invoke-direct {v4, p0, v5}, Ljp3;-><init>(Lmp3;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v3, p2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    :cond_7
    iget-object p0, v4, Ljp3;->a:Ljava/lang/String;

    .line 262
    .line 263
    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/measurement/zzic;->zzax(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzic;

    .line 264
    .line 265
    .line 266
    :cond_8
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0}, Lsq3;->y()V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0, p2}, Lvi3;->F(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v1, p2, v2}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    if-eqz p0, :cond_9

    .line 280
    .line 281
    invoke-virtual {v1, p2, v2}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    check-cast p0, Ljava/util/Set;

    .line 286
    .line 287
    const-string p2, "enhanced_user_id"

    .line 288
    .line 289
    invoke-interface {p0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result p0

    .line 293
    if-eqz p0, :cond_9

    .line 294
    .line 295
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzic;->zzav()Lcom/google/android/gms/internal/measurement/zzic;

    .line 296
    .line 297
    .line 298
    :cond_9
    return-void
.end method

.method public final w(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzhv;Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 10

    .line 1
    const-string v0, "_sc"

    .line 2
    .line 3
    const-string v1, "_si"

    .line 4
    .line 5
    const-string v2, "_o"

    .line 6
    .line 7
    const-string v3, "_sn"

    .line 8
    .line 9
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzhv;->zza()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Lup3;->X(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/16 v2, 0x100

    .line 30
    .line 31
    const/16 v3, 0x64

    .line 32
    .line 33
    const/16 v4, 0x1f4

    .line 34
    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, Lup3;->X(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    invoke-virtual {p0}, Lmp3;->d0()Lpd3;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    sget-object v1, Lvg3;->h0:Lug3;

    .line 52
    .line 53
    invoke-virtual {p1, p4, v1}, Lpd3;->H(Ljava/lang/String;Lug3;)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-static {p1, v4}, Ljava/lang/Math;->min(II)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    :goto_0
    int-to-long v5, p1

    .line 66
    goto :goto_2

    .line 67
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lmp3;->d0()Lpd3;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    sget-object v1, Lvg3;->h0:Lug3;

    .line 75
    .line 76
    invoke-virtual {p1, p4, v1}, Lpd3;->H(Ljava/lang/String;Lug3;)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-static {p1, v4}, Ljava/lang/Math;->min(II)I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    goto :goto_0

    .line 93
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzhv;->zzc()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzhv;->zzc()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    const/4 v7, 0x0

    .line 106
    invoke-virtual {p1, v7, v1}, Ljava/lang/String;->codePointCount(II)I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    int-to-long v7, p1

    .line 111
    invoke-virtual {p0}, Lmp3;->j0()Lup3;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzhv;->zza()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {p0}, Lmp3;->d0()Lpd3;

    .line 119
    .line 120
    .line 121
    const/16 v1, 0x28

    .line 122
    .line 123
    const/4 v9, 0x1

    .line 124
    invoke-static {v1, p1, v9}, Lup3;->E(ILjava/lang/String;Z)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    cmp-long v1, v7, v5

    .line 129
    .line 130
    if-lez v1, :cond_4

    .line 131
    .line 132
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzhv;->zza()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-nez v0, :cond_4

    .line 141
    .line 142
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzhv;->zza()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    const-string v1, "_ev"

    .line 147
    .line 148
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_2

    .line 153
    .line 154
    invoke-virtual {p0}, Lmp3;->j0()Lup3;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzhv;->zzc()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {p0}, Lmp3;->d0()Lpd3;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    sget-object p2, Lvg3;->h0:Lug3;

    .line 169
    .line 170
    invoke-virtual {p0, p4, p2}, Lpd3;->H(Ljava/lang/String;Lug3;)I

    .line 171
    .line 172
    .line 173
    move-result p0

    .line 174
    invoke-static {p0, v4}, Ljava/lang/Math;->min(II)I

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    invoke-static {p0, v3}, Ljava/lang/Math;->max(II)I

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    invoke-static {p0, v2}, Ljava/lang/Math;->max(II)I

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    invoke-static {p0, p1, v9}, Lup3;->E(ILjava/lang/String;Z)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-virtual {p3, v1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :cond_2
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    iget-object p0, p0, Luh3;->V:Lsh3;

    .line 199
    .line 200
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 201
    .line 202
    .line 203
    move-result-object p4

    .line 204
    const-string v0, "Param value is too long; discarded. Name, value length"

    .line 205
    .line 206
    invoke-virtual {p0, p1, v0, p4}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    const-string p0, "_err"

    .line 210
    .line 211
    invoke-virtual {p3, p0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 212
    .line 213
    .line 214
    move-result-wide v2

    .line 215
    const-wide/16 v4, 0x0

    .line 216
    .line 217
    cmp-long p4, v2, v4

    .line 218
    .line 219
    if-nez p4, :cond_3

    .line 220
    .line 221
    const-wide/16 v2, 0x4

    .line 222
    .line 223
    invoke-virtual {p3, p0, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    if-nez p0, :cond_3

    .line 231
    .line 232
    invoke-virtual {p3, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    const-string p0, "_el"

    .line 236
    .line 237
    invoke-virtual {p3, p0, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 238
    .line 239
    .line 240
    :cond_3
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzhv;->zza()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    invoke-virtual {p3, p0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    :cond_4
    return-void
.end method

.method public final x(ZILjava/lang/Throwable;[BLjava/lang/String;Ljava/util/List;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget-object v9, v1, Lmp3;->b:Lci3;

    .line 8
    .line 9
    invoke-virtual {v1}, Lmp3;->b()Lbj3;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v3}, Lbj3;->y()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lmp3;->k0()V

    .line 17
    .line 18
    .line 19
    const/4 v10, 0x0

    .line 20
    if-nez p4, :cond_0

    .line 21
    .line 22
    :try_start_0
    new-array v3, v10, [B

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto/16 :goto_b

    .line 27
    .line 28
    :cond_0
    move-object/from16 v3, p4

    .line 29
    .line 30
    :goto_0
    iget-object v11, v1, Lmp3;->j0:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-static {v11}, Lkb1;->n(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 v12, 0x0

    .line 36
    iput-object v12, v1, Lmp3;->j0:Ljava/util/ArrayList;

    .line 37
    .line 38
    if-eqz p1, :cond_5

    .line 39
    .line 40
    const/16 v4, 0xc8

    .line 41
    .line 42
    if-eq v0, v4, :cond_1

    .line 43
    .line 44
    const/16 v4, 0xcc

    .line 45
    .line 46
    if-ne v0, v4, :cond_2

    .line 47
    .line 48
    move v0, v4

    .line 49
    :cond_1
    if-eqz v2, :cond_5

    .line 50
    .line 51
    :cond_2
    new-instance v4, Ljava/lang/String;

    .line 52
    .line 53
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 54
    .line 55
    invoke-direct {v4, v3, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    const/16 v5, 0x20

    .line 63
    .line 64
    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    invoke-virtual {v4, v10, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    iget-object v4, v4, Luh3;->V:Lsh3;

    .line 77
    .line 78
    const-string v5, "Network upload failed. Will retry later. code, error"

    .line 79
    .line 80
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-virtual {v4, v5, v6, v2, v3}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object v2, v1, Lmp3;->w:Ltn3;

    .line 88
    .line 89
    iget-object v2, v2, Ltn3;->w:Lio/sentry/android/core/s;

    .line 90
    .line 91
    invoke-virtual {v1}, Lmp3;->f()Lxv;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Lxt0;

    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 101
    .line 102
    .line 103
    move-result-wide v3

    .line 104
    invoke-virtual {v2, v3, v4}, Lio/sentry/android/core/s;->b(J)V

    .line 105
    .line 106
    .line 107
    const/16 v2, 0x1f7

    .line 108
    .line 109
    if-eq v0, v2, :cond_3

    .line 110
    .line 111
    const/16 v2, 0x1ad

    .line 112
    .line 113
    if-ne v0, v2, :cond_4

    .line 114
    .line 115
    :cond_3
    iget-object v0, v1, Lmp3;->w:Ltn3;

    .line 116
    .line 117
    iget-object v0, v0, Ltn3;->i:Lio/sentry/android/core/s;

    .line 118
    .line 119
    invoke-virtual {v1}, Lmp3;->f()Lxv;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    check-cast v2, Lxt0;

    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 129
    .line 130
    .line 131
    move-result-wide v2

    .line 132
    invoke-virtual {v0, v2, v3}, Lio/sentry/android/core/s;->b(J)V

    .line 133
    .line 134
    .line 135
    :cond_4
    iget-object v0, v1, Lmp3;->c:Lae3;

    .line 136
    .line 137
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v11}, Lae3;->K(Ljava/util/ArrayList;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1}, Lmp3;->L()V

    .line 144
    .line 145
    .line 146
    goto/16 :goto_a

    .line 147
    .line 148
    :cond_5
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    iget-object v2, v2, Luh3;->Y:Lsh3;

    .line 153
    .line 154
    const-string v4, "Network upload successful with code, uploadAttempted"

    .line 155
    .line 156
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-static/range {p1 .. p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-virtual {v2, v0, v4, v5}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    .line 166
    .line 167
    if-eqz p1, :cond_6

    .line 168
    .line 169
    :try_start_1
    iget-object v2, v1, Lmp3;->w:Ltn3;

    .line 170
    .line 171
    iget-object v2, v2, Ltn3;->v:Lio/sentry/android/core/s;

    .line 172
    .line 173
    invoke-virtual {v1}, Lmp3;->f()Lxv;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    check-cast v4, Lxt0;

    .line 178
    .line 179
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 183
    .line 184
    .line 185
    move-result-wide v4

    .line 186
    invoke-virtual {v2, v4, v5}, Lio/sentry/android/core/s;->b(J)V

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :catch_0
    move-exception v0

    .line 191
    goto/16 :goto_9

    .line 192
    .line 193
    :cond_6
    :goto_1
    iget-object v2, v1, Lmp3;->w:Ltn3;

    .line 194
    .line 195
    iget-object v2, v2, Ltn3;->w:Lio/sentry/android/core/s;

    .line 196
    .line 197
    const-wide/16 v13, 0x0

    .line 198
    .line 199
    invoke-virtual {v2, v13, v14}, Lio/sentry/android/core/s;->b(J)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1}, Lmp3;->L()V

    .line 203
    .line 204
    .line 205
    if-eqz p1, :cond_7

    .line 206
    .line 207
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    iget-object v2, v2, Luh3;->Y:Lsh3;

    .line 212
    .line 213
    const-string v4, "Successful upload. Got network response. code, size"

    .line 214
    .line 215
    array-length v3, v3

    .line 216
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    invoke-virtual {v2, v0, v4, v3}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_7
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 229
    .line 230
    const-string v2, "Purged empty bundles"

    .line 231
    .line 232
    invoke-virtual {v0, v2}, Lsh3;->a(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    :goto_2
    iget-object v0, v1, Lmp3;->c:Lae3;

    .line 236
    .line 237
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0}, Lae3;->n0()V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 241
    .line 242
    .line 243
    :try_start_2
    new-instance v0, Ljava/util/HashMap;

    .line 244
    .line 245
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 246
    .line 247
    .line 248
    invoke-interface/range {p6 .. p6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 249
    .line 250
    .line 251
    move-result-object v15

    .line 252
    :cond_8
    :goto_3
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 256
    const-wide/16 v3, -0x1

    .line 257
    .line 258
    sget-object v5, Lzl3;->e:Lzl3;

    .line 259
    .line 260
    if-eqz v2, :cond_b

    .line 261
    .line 262
    :try_start_3
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    check-cast v2, Landroid/util/Pair;

    .line 267
    .line 268
    iget-object v6, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v6, Lcom/google/android/gms/internal/measurement/zzib;

    .line 271
    .line 272
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v2, Lxo3;

    .line 275
    .line 276
    iget-object v7, v2, Lxo3;->c:Lzl3;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 277
    .line 278
    iget-object v8, v2, Lxo3;->c:Lzl3;

    .line 279
    .line 280
    if-eq v7, v5, :cond_8

    .line 281
    .line 282
    :try_start_4
    iget-object v5, v1, Lmp3;->c:Lae3;

    .line 283
    .line 284
    invoke-static {v5}, Lmp3;->S(Lwo3;)V

    .line 285
    .line 286
    .line 287
    move-object v7, v5

    .line 288
    iget-object v5, v2, Lxo3;->a:Ljava/lang/String;

    .line 289
    .line 290
    iget-object v2, v2, Lxo3;->b:Ljava/util/Map;

    .line 291
    .line 292
    if-nez v2, :cond_9

    .line 293
    .line 294
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 295
    .line 296
    :cond_9
    move-object/from16 v16, v7

    .line 297
    .line 298
    move-object v7, v8

    .line 299
    const/4 v8, 0x0

    .line 300
    move-wide v13, v3

    .line 301
    move-object v4, v6

    .line 302
    move-object/from16 v3, p5

    .line 303
    .line 304
    move-object v6, v2

    .line 305
    move-object/from16 v2, v16

    .line 306
    .line 307
    invoke-virtual/range {v2 .. v8}, Lae3;->D(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzib;Ljava/lang/String;Ljava/util/Map;Lzl3;Ljava/lang/Long;)J

    .line 308
    .line 309
    .line 310
    move-result-wide v5

    .line 311
    sget-object v2, Lzl3;->f:Lzl3;

    .line 312
    .line 313
    if-ne v7, v2, :cond_a

    .line 314
    .line 315
    cmp-long v2, v5, v13

    .line 316
    .line 317
    if-eqz v2, :cond_a

    .line 318
    .line 319
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzib;->zze()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    if-nez v2, :cond_a

    .line 328
    .line 329
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzib;->zze()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 334
    .line 335
    .line 336
    move-result-object v3

    .line 337
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    :cond_a
    const-wide/16 v13, 0x0

    .line 341
    .line 342
    goto :goto_3

    .line 343
    :catchall_1
    move-exception v0

    .line 344
    goto/16 :goto_8

    .line 345
    .line 346
    :cond_b
    move-wide v13, v3

    .line 347
    invoke-interface/range {p6 .. p6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 348
    .line 349
    .line 350
    move-result-object v15

    .line 351
    :goto_4
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    if-eqz v2, :cond_e

    .line 356
    .line 357
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    check-cast v2, Landroid/util/Pair;

    .line 362
    .line 363
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 364
    .line 365
    move-object v4, v3

    .line 366
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzib;

    .line 367
    .line 368
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v2, Lxo3;

    .line 371
    .line 372
    iget-object v3, v2, Lxo3;->c:Lzl3;

    .line 373
    .line 374
    if-ne v3, v5, :cond_d

    .line 375
    .line 376
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzib;->zze()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v3

    .line 384
    move-object v8, v3

    .line 385
    check-cast v8, Ljava/lang/Long;

    .line 386
    .line 387
    iget-object v3, v1, Lmp3;->c:Lae3;

    .line 388
    .line 389
    invoke-static {v3}, Lmp3;->S(Lwo3;)V

    .line 390
    .line 391
    .line 392
    move-object v6, v5

    .line 393
    iget-object v5, v2, Lxo3;->a:Ljava/lang/String;

    .line 394
    .line 395
    iget-object v7, v2, Lxo3;->b:Ljava/util/Map;

    .line 396
    .line 397
    if-nez v7, :cond_c

    .line 398
    .line 399
    sget-object v7, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 400
    .line 401
    :cond_c
    iget-object v2, v2, Lxo3;->c:Lzl3;

    .line 402
    .line 403
    move-object/from16 v16, v6

    .line 404
    .line 405
    move-object v6, v7

    .line 406
    move-object v7, v2

    .line 407
    move-object v2, v3

    .line 408
    move-object/from16 v3, p5

    .line 409
    .line 410
    invoke-virtual/range {v2 .. v8}, Lae3;->D(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzib;Ljava/lang/String;Ljava/util/Map;Lzl3;Ljava/lang/Long;)J

    .line 411
    .line 412
    .line 413
    move-object/from16 v5, v16

    .line 414
    .line 415
    goto :goto_4

    .line 416
    :cond_d
    move-object/from16 v3, p5

    .line 417
    .line 418
    goto :goto_4

    .line 419
    :cond_e
    move-object/from16 v3, p5

    .line 420
    .line 421
    move-object/from16 v16, v5

    .line 422
    .line 423
    iget-object v0, v1, Lmp3;->c:Lae3;

    .line 424
    .line 425
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 426
    .line 427
    .line 428
    filled-new-array/range {v16 .. v16}, [Lzl3;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/zzon;->D1([Lzl3;)Lcom/google/android/gms/measurement/internal/zzon;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    const/4 v4, 0x1

    .line 437
    invoke-virtual {v0, v3, v2, v4}, Lae3;->E(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzon;I)Ljava/util/List;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 442
    .line 443
    .line 444
    move-result v2

    .line 445
    if-nez v2, :cond_f

    .line 446
    .line 447
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    check-cast v0, Lpp3;

    .line 452
    .line 453
    iget-wide v4, v0, Lpp3;->f:J

    .line 454
    .line 455
    invoke-virtual {v1}, Lmp3;->f()Lxv;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    check-cast v0, Lxt0;

    .line 460
    .line 461
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 465
    .line 466
    .line 467
    move-result-wide v6

    .line 468
    sget-object v0, Lvg3;->F:Lug3;

    .line 469
    .line 470
    invoke-virtual {v0, v12}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    check-cast v0, Ljava/lang/Long;

    .line 475
    .line 476
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 477
    .line 478
    .line 479
    move-result-wide v15

    .line 480
    add-long/2addr v15, v4

    .line 481
    cmp-long v0, v6, v15

    .line 482
    .line 483
    if-lez v0, :cond_f

    .line 484
    .line 485
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    iget-object v0, v0, Luh3;->w:Lsh3;

    .line 490
    .line 491
    const-string v2, "[sgtm] client batches are queued too long. appId, creationTime"

    .line 492
    .line 493
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 494
    .line 495
    .line 496
    move-result-object v4

    .line 497
    invoke-virtual {v0, v3, v2, v4}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    :cond_f
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 505
    .line 506
    .line 507
    move-result v0

    .line 508
    if-eqz v0, :cond_11

    .line 509
    .line 510
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    move-object v4, v0

    .line 515
    check-cast v4, Ljava/lang/Long;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 516
    .line 517
    :try_start_5
    iget-object v0, v1, Lmp3;->c:Lae3;

    .line 518
    .line 519
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 523
    .line 524
    .line 525
    move-result-wide v5

    .line 526
    invoke-virtual {v0, v5, v6}, Lae3;->I(J)V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 527
    .line 528
    .line 529
    goto :goto_5

    .line 530
    :catch_1
    move-exception v0

    .line 531
    :try_start_6
    iget-object v5, v1, Lmp3;->k0:Ljava/util/ArrayList;

    .line 532
    .line 533
    if-eqz v5, :cond_10

    .line 534
    .line 535
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    move-result v4

    .line 539
    if-eqz v4, :cond_10

    .line 540
    .line 541
    goto :goto_5

    .line 542
    :cond_10
    throw v0

    .line 543
    :cond_11
    iget-object v0, v1, Lmp3;->c:Lae3;

    .line 544
    .line 545
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v0}, Lae3;->o0()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 549
    .line 550
    .line 551
    :try_start_7
    iget-object v0, v1, Lmp3;->c:Lae3;

    .line 552
    .line 553
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v0}, Lae3;->p0()V

    .line 557
    .line 558
    .line 559
    iput-object v12, v1, Lmp3;->k0:Ljava/util/ArrayList;

    .line 560
    .line 561
    invoke-static {v9}, Lmp3;->S(Lwo3;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v9}, Lci3;->T()Z

    .line 565
    .line 566
    .line 567
    move-result v0

    .line 568
    if-eqz v0, :cond_12

    .line 569
    .line 570
    iget-object v0, v1, Lmp3;->c:Lae3;

    .line 571
    .line 572
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v0, v3}, Lae3;->F(Ljava/lang/String;)Z

    .line 576
    .line 577
    .line 578
    move-result v0

    .line 579
    if-eqz v0, :cond_12

    .line 580
    .line 581
    invoke-virtual {v1, v3}, Lmp3;->t(Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    :goto_6
    const-wide/16 v2, 0x0

    .line 585
    .line 586
    goto :goto_7

    .line 587
    :cond_12
    invoke-static {v9}, Lmp3;->S(Lwo3;)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v9}, Lci3;->T()Z

    .line 591
    .line 592
    .line 593
    move-result v0

    .line 594
    if-eqz v0, :cond_13

    .line 595
    .line 596
    invoke-virtual {v1}, Lmp3;->J()Z

    .line 597
    .line 598
    .line 599
    move-result v0

    .line 600
    if-eqz v0, :cond_13

    .line 601
    .line 602
    invoke-virtual {v1}, Lmp3;->q()V

    .line 603
    .line 604
    .line 605
    goto :goto_6

    .line 606
    :cond_13
    iput-wide v13, v1, Lmp3;->l0:J

    .line 607
    .line 608
    invoke-virtual {v1}, Lmp3;->L()V

    .line 609
    .line 610
    .line 611
    goto :goto_6

    .line 612
    :goto_7
    iput-wide v2, v1, Lmp3;->Z:J

    .line 613
    .line 614
    goto :goto_a

    .line 615
    :goto_8
    iget-object v2, v1, Lmp3;->c:Lae3;

    .line 616
    .line 617
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v2}, Lae3;->p0()V

    .line 621
    .line 622
    .line 623
    throw v0
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 624
    :goto_9
    :try_start_8
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    iget-object v2, v2, Luh3;->f:Lsh3;

    .line 629
    .line 630
    const-string v3, "Database error while trying to delete uploaded bundles"

    .line 631
    .line 632
    invoke-virtual {v2, v0, v3}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v1}, Lmp3;->f()Lxv;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    check-cast v0, Lxt0;

    .line 640
    .line 641
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 642
    .line 643
    .line 644
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 645
    .line 646
    .line 647
    move-result-wide v2

    .line 648
    iput-wide v2, v1, Lmp3;->Z:J

    .line 649
    .line 650
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 655
    .line 656
    const-string v2, "Disable upload, time"

    .line 657
    .line 658
    iget-wide v3, v1, Lmp3;->Z:J

    .line 659
    .line 660
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 661
    .line 662
    .line 663
    move-result-object v3

    .line 664
    invoke-virtual {v0, v3, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 665
    .line 666
    .line 667
    :goto_a
    iput-boolean v10, v1, Lmp3;->f0:Z

    .line 668
    .line 669
    invoke-virtual {v1}, Lmp3;->M()V

    .line 670
    .line 671
    .line 672
    return-void

    .line 673
    :goto_b
    iput-boolean v10, v1, Lmp3;->f0:Z

    .line 674
    .line 675
    invoke-virtual {v1}, Lmp3;->M()V

    .line 676
    .line 677
    .line 678
    throw v0
.end method

.method public final y(Ldi3;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lbj3;->y()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ldi3;->G()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Ldi3;->D()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v2}, Lkb1;->n(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    const/16 v3, 0xcc

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    move-object v1, p0

    .line 31
    invoke-virtual/range {v1 .. v6}, Lmp3;->z(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    move-object v1, p0

    .line 36
    invoke-virtual {p1}, Ldi3;->D()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 48
    .line 49
    const-string v2, "Fetching remote configuration"

    .line 50
    .line 51
    invoke-virtual {v0, p0, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, v1, Lmp3;->a:Lvi3;

    .line 55
    .line 56
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p0}, Lvi3;->L(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgl;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lsq3;->y()V

    .line 67
    .line 68
    .line 69
    iget-object v3, v0, Lvi3;->X:Lid;

    .line 70
    .line 71
    const/4 v4, 0x0

    .line 72
    invoke-virtual {v3, p0, v4}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, Ljava/lang/String;

    .line 77
    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-nez v2, :cond_1

    .line 85
    .line 86
    new-instance v2, Lid;

    .line 87
    .line 88
    invoke-direct {v2}, Lle2;-><init>()V

    .line 89
    .line 90
    .line 91
    const-string v5, "If-Modified-Since"

    .line 92
    .line 93
    invoke-virtual {v2, v5, v3}, Lle2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    move-object v2, v4

    .line 98
    :goto_0
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Lsq3;->y()V

    .line 102
    .line 103
    .line 104
    iget-object v0, v0, Lvi3;->Y:Lid;

    .line 105
    .line 106
    invoke-virtual {v0, p0, v4}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    check-cast p0, Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_3

    .line 117
    .line 118
    if-nez v2, :cond_2

    .line 119
    .line 120
    new-instance v0, Lid;

    .line 121
    .line 122
    invoke-direct {v0}, Lle2;-><init>()V

    .line 123
    .line 124
    .line 125
    move-object v2, v0

    .line 126
    :cond_2
    const-string v0, "If-None-Match"

    .line 127
    .line 128
    invoke-virtual {v2, v0, p0}, Lle2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    :cond_3
    move-object v10, v2

    .line 132
    goto :goto_1

    .line 133
    :cond_4
    move-object v10, v4

    .line 134
    :goto_1
    const/4 p0, 0x1

    .line 135
    iput-boolean p0, v1, Lmp3;->e0:Z

    .line 136
    .line 137
    iget-object v6, v1, Lmp3;->b:Lci3;

    .line 138
    .line 139
    invoke-static {v6}, Lmp3;->S(Lwo3;)V

    .line 140
    .line 141
    .line 142
    new-instance v11, Lqf3;

    .line 143
    .line 144
    invoke-direct {v11, v1}, Lqf3;-><init>(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    iget-object p0, v6, Lsq3;->a:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast p0, Lij3;

    .line 150
    .line 151
    invoke-virtual {v6}, Lsq3;->y()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v6}, Lwo3;->A()V

    .line 155
    .line 156
    .line 157
    iget-object v0, v6, Lqo3;->b:Lmp3;

    .line 158
    .line 159
    iget-object v0, v0, Lmp3;->U:Lyo3;

    .line 160
    .line 161
    new-instance v1, Landroid/net/Uri$Builder;

    .line 162
    .line 163
    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1}, Ldi3;->G()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    sget-object v3, Lvg3;->f:Lug3;

    .line 171
    .line 172
    invoke-virtual {v3, v4}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    check-cast v3, Ljava/lang/String;

    .line 177
    .line 178
    invoke-virtual {v1, v3}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    sget-object v5, Lvg3;->g:Lug3;

    .line 183
    .line 184
    invoke-virtual {v5, v4}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    check-cast v4, Ljava/lang/String;

    .line 189
    .line 190
    invoke-virtual {v3, v4}, Landroid/net/Uri$Builder;->encodedAuthority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    const-string v4, "config/app/"

    .line 199
    .line 200
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-virtual {v3, v2}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    const-string v3, "platform"

    .line 209
    .line 210
    const-string v4, "android"

    .line 211
    .line 212
    invoke-virtual {v2, v3, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v0, Lij3;

    .line 219
    .line 220
    iget-object v0, v0, Lij3;->d:Lpd3;

    .line 221
    .line 222
    invoke-virtual {v0}, Lpd3;->E()V

    .line 223
    .line 224
    .line 225
    const-wide/32 v3, 0x1fbd0

    .line 226
    .line 227
    .line 228
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    const-string v3, "gmp_version"

    .line 233
    .line 234
    invoke-virtual {v2, v3, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    const-string v2, "runtime_version"

    .line 239
    .line 240
    const-string v3, "0"

    .line 241
    .line 242
    invoke-virtual {v0, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    :try_start_0
    new-instance v1, Ljava/net/URI;

    .line 254
    .line 255
    invoke-direct {v1, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1}, Ljava/net/URI;->toURL()Ljava/net/URL;

    .line 259
    .line 260
    .line 261
    move-result-object v8

    .line 262
    iget-object v1, p0, Lij3;->i:Lbj3;

    .line 263
    .line 264
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 265
    .line 266
    .line 267
    new-instance v5, Leu0;

    .line 268
    .line 269
    invoke-virtual {p1}, Ldi3;->D()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    const/4 v9, 0x0

    .line 274
    invoke-direct/range {v5 .. v11}, Leu0;-><init>(Lci3;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lyh3;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1, v5}, Lbj3;->L(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 278
    .line 279
    .line 280
    return-void

    .line 281
    :catch_0
    iget-object p0, p0, Lij3;->f:Luh3;

    .line 282
    .line 283
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 284
    .line 285
    .line 286
    iget-object p0, p0, Luh3;->f:Lsh3;

    .line 287
    .line 288
    invoke-virtual {p1}, Ldi3;->D()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    invoke-static {p1}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    const-string v1, "Failed to parse config URL. Not fetching. appId"

    .line 297
    .line 298
    invoke-virtual {p0, p1, v1, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    return-void
.end method

.method public final z(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lmp3;->b:Lci3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lbj3;->y()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lmp3;->k0()V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lkb1;->k(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez p4, :cond_0

    .line 18
    .line 19
    :try_start_0
    new-array p4, v1, [B

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto/16 :goto_9

    .line 24
    .line 25
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-object v2, v2, Luh3;->Y:Lsh3;

    .line 30
    .line 31
    const-string v3, "onConfigFetched. Response size"

    .line 32
    .line 33
    array-length v4, p4

    .line 34
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v2, v4, v3}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Lmp3;->c:Lae3;

    .line 42
    .line 43
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Lae3;->n0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    :try_start_1
    iget-object v2, p0, Lmp3;->c:Lae3;

    .line 50
    .line 51
    invoke-static {v2}, Lmp3;->S(Lwo3;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, p1}, Lae3;->D0(Ljava/lang/String;)Ldi3;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    const/16 v3, 0xc8

    .line 59
    .line 60
    const/16 v5, 0x130

    .line 61
    .line 62
    if-eq p2, v3, :cond_2

    .line 63
    .line 64
    const/16 v3, 0xcc

    .line 65
    .line 66
    if-eq p2, v3, :cond_2

    .line 67
    .line 68
    if-ne p2, v5, :cond_1

    .line 69
    .line 70
    move p2, v5

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    move v3, v1

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    :goto_1
    if-nez p3, :cond_1

    .line 75
    .line 76
    const/4 v3, 0x1

    .line 77
    :goto_2
    if-nez v2, :cond_3

    .line 78
    .line 79
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    iget-object p2, p2, Luh3;->w:Lsh3;

    .line 84
    .line 85
    const-string p3, "App does not exist in onConfigFetched. appId"

    .line 86
    .line 87
    invoke-static {p1}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p2, p1, p3}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 92
    .line 93
    .line 94
    goto/16 :goto_7

    .line 95
    .line 96
    :catchall_1
    move-exception p1

    .line 97
    goto/16 :goto_8

    .line 98
    .line 99
    :cond_3
    const/16 v6, 0x194

    .line 100
    .line 101
    const/4 v7, 0x0

    .line 102
    iget-object v8, p0, Lmp3;->a:Lvi3;

    .line 103
    .line 104
    if-nez v3, :cond_7

    .line 105
    .line 106
    if-ne p2, v6, :cond_4

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_4
    :try_start_2
    invoke-virtual {p0}, Lmp3;->f()Lxv;

    .line 110
    .line 111
    .line 112
    move-result-object p4

    .line 113
    check-cast p4, Lxt0;

    .line 114
    .line 115
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 119
    .line 120
    .line 121
    move-result-wide p4

    .line 122
    invoke-virtual {v2, p4, p5}, Ldi3;->g(J)V

    .line 123
    .line 124
    .line 125
    iget-object p4, p0, Lmp3;->c:Lae3;

    .line 126
    .line 127
    invoke-static {p4}, Lmp3;->S(Lwo3;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p4, v2, v1}, Lae3;->E0(Ldi3;Z)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 134
    .line 135
    .line 136
    move-result-object p4

    .line 137
    iget-object p4, p4, Luh3;->Y:Lsh3;

    .line 138
    .line 139
    const-string p5, "Fetching config failed. code, error"

    .line 140
    .line 141
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {p4, v0, p5, p3}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-static {v8}, Lmp3;->S(Lwo3;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v8}, Lsq3;->y()V

    .line 152
    .line 153
    .line 154
    iget-object p3, v8, Lvi3;->X:Lid;

    .line 155
    .line 156
    invoke-virtual {p3, p1, v7}, Lle2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    iget-object p1, p0, Lmp3;->w:Ltn3;

    .line 160
    .line 161
    iget-object p1, p1, Ltn3;->w:Lio/sentry/android/core/s;

    .line 162
    .line 163
    invoke-virtual {p0}, Lmp3;->f()Lxv;

    .line 164
    .line 165
    .line 166
    move-result-object p3

    .line 167
    check-cast p3, Lxt0;

    .line 168
    .line 169
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 173
    .line 174
    .line 175
    move-result-wide p3

    .line 176
    invoke-virtual {p1, p3, p4}, Lio/sentry/android/core/s;->b(J)V

    .line 177
    .line 178
    .line 179
    const/16 p1, 0x1f7

    .line 180
    .line 181
    if-eq p2, p1, :cond_5

    .line 182
    .line 183
    const/16 p1, 0x1ad

    .line 184
    .line 185
    if-ne p2, p1, :cond_6

    .line 186
    .line 187
    :cond_5
    iget-object p1, p0, Lmp3;->w:Ltn3;

    .line 188
    .line 189
    iget-object p1, p1, Ltn3;->i:Lio/sentry/android/core/s;

    .line 190
    .line 191
    invoke-virtual {p0}, Lmp3;->f()Lxv;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    check-cast p2, Lxt0;

    .line 196
    .line 197
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 201
    .line 202
    .line 203
    move-result-wide p2

    .line 204
    invoke-virtual {p1, p2, p3}, Lio/sentry/android/core/s;->b(J)V

    .line 205
    .line 206
    .line 207
    :cond_6
    invoke-virtual {p0}, Lmp3;->L()V

    .line 208
    .line 209
    .line 210
    goto/16 :goto_7

    .line 211
    .line 212
    :cond_7
    :goto_3
    const-string p3, "Last-Modified"

    .line 213
    .line 214
    invoke-static {p3, p5}, Lmp3;->K(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p3

    .line 218
    const-string v3, "ETag"

    .line 219
    .line 220
    invoke-static {v3, p5}, Lmp3;->K(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p5

    .line 224
    if-eq p2, v6, :cond_9

    .line 225
    .line 226
    if-ne p2, v5, :cond_8

    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_8
    invoke-static {v8}, Lmp3;->S(Lwo3;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v8, p1, p3, p5, p4}, Lvi3;->N(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 233
    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_9
    :goto_4
    invoke-static {v8}, Lmp3;->S(Lwo3;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v8, p1}, Lvi3;->L(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgl;

    .line 240
    .line 241
    .line 242
    move-result-object p3

    .line 243
    if-nez p3, :cond_a

    .line 244
    .line 245
    invoke-static {v8}, Lmp3;->S(Lwo3;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v8, p1, v7, v7, v7}, Lvi3;->N(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 249
    .line 250
    .line 251
    :cond_a
    :goto_5
    invoke-virtual {p0}, Lmp3;->f()Lxv;

    .line 252
    .line 253
    .line 254
    move-result-object p3

    .line 255
    check-cast p3, Lxt0;

    .line 256
    .line 257
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 261
    .line 262
    .line 263
    move-result-wide p3

    .line 264
    invoke-virtual {v2, p3, p4}, Ldi3;->f(J)V

    .line 265
    .line 266
    .line 267
    iget-object p3, p0, Lmp3;->c:Lae3;

    .line 268
    .line 269
    invoke-static {p3}, Lmp3;->S(Lwo3;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p3, v2, v1}, Lae3;->E0(Ldi3;Z)V

    .line 273
    .line 274
    .line 275
    if-ne p2, v6, :cond_b

    .line 276
    .line 277
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 278
    .line 279
    .line 280
    move-result-object p2

    .line 281
    iget-object p2, p2, Luh3;->V:Lsh3;

    .line 282
    .line 283
    const-string p3, "Config not found. Using empty config. appId"

    .line 284
    .line 285
    invoke-virtual {p2, p1, p3}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    goto :goto_6

    .line 289
    :cond_b
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    iget-object p1, p1, Luh3;->Y:Lsh3;

    .line 294
    .line 295
    const-string p3, "Successfully fetched config. Got network response. code, size"

    .line 296
    .line 297
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 298
    .line 299
    .line 300
    move-result-object p2

    .line 301
    invoke-virtual {p1, p2, p3, v4}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    :goto_6
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0}, Lci3;->T()Z

    .line 308
    .line 309
    .line 310
    move-result p1

    .line 311
    if-eqz p1, :cond_c

    .line 312
    .line 313
    invoke-virtual {p0}, Lmp3;->J()Z

    .line 314
    .line 315
    .line 316
    move-result p1

    .line 317
    if-eqz p1, :cond_c

    .line 318
    .line 319
    invoke-virtual {p0}, Lmp3;->q()V

    .line 320
    .line 321
    .line 322
    goto :goto_7

    .line 323
    :cond_c
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0}, Lci3;->T()Z

    .line 327
    .line 328
    .line 329
    move-result p1

    .line 330
    if-eqz p1, :cond_d

    .line 331
    .line 332
    iget-object p1, p0, Lmp3;->c:Lae3;

    .line 333
    .line 334
    invoke-static {p1}, Lmp3;->S(Lwo3;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v2}, Ldi3;->D()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object p2

    .line 341
    invoke-virtual {p1, p2}, Lae3;->F(Ljava/lang/String;)Z

    .line 342
    .line 343
    .line 344
    move-result p1

    .line 345
    if-eqz p1, :cond_d

    .line 346
    .line 347
    invoke-virtual {v2}, Ldi3;->D()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object p1

    .line 351
    invoke-virtual {p0, p1}, Lmp3;->t(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    goto :goto_7

    .line 355
    :cond_d
    invoke-virtual {p0}, Lmp3;->L()V

    .line 356
    .line 357
    .line 358
    :goto_7
    iget-object p1, p0, Lmp3;->c:Lae3;

    .line 359
    .line 360
    invoke-static {p1}, Lmp3;->S(Lwo3;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {p1}, Lae3;->o0()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 364
    .line 365
    .line 366
    :try_start_3
    iget-object p1, p0, Lmp3;->c:Lae3;

    .line 367
    .line 368
    invoke-static {p1}, Lmp3;->S(Lwo3;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {p1}, Lae3;->p0()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 372
    .line 373
    .line 374
    iput-boolean v1, p0, Lmp3;->e0:Z

    .line 375
    .line 376
    invoke-virtual {p0}, Lmp3;->M()V

    .line 377
    .line 378
    .line 379
    return-void

    .line 380
    :goto_8
    :try_start_4
    iget-object p2, p0, Lmp3;->c:Lae3;

    .line 381
    .line 382
    invoke-static {p2}, Lmp3;->S(Lwo3;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {p2}, Lae3;->p0()V

    .line 386
    .line 387
    .line 388
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 389
    :goto_9
    iput-boolean v1, p0, Lmp3;->e0:Z

    .line 390
    .line 391
    invoke-virtual {p0}, Lmp3;->M()V

    .line 392
    .line 393
    .line 394
    throw p1
.end method
