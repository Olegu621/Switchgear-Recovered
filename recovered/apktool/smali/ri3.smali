.class public final Lri3;
.super Lua1;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:Lvi3;


# direct methods
.method public constructor <init>(Lvi3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lri3;->a:Lvi3;

    .line 2
    .line 3
    const/16 p1, 0x14

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lua1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p1}, Lkb1;->k(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lri3;->a:Lvi3;

    .line 7
    .line 8
    invoke-virtual {p0}, Lwo3;->A()V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lkb1;->k(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lqo3;->b:Lmp3;

    .line 15
    .line 16
    iget-object v0, v0, Lmp3;->c:Lae3;

    .line 17
    .line 18
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lae3;->H0(Ljava/lang/String;)Lac1;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0

    .line 29
    :cond_0
    iget-object v1, p0, Lsq3;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Lij3;

    .line 32
    .line 33
    iget-object v1, v1, Lij3;->f:Luh3;

    .line 34
    .line 35
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, v1, Luh3;->Y:Lsh3;

    .line 39
    .line 40
    const-string v2, "Populate EES config from database on cache miss. appId"

    .line 41
    .line 42
    invoke-virtual {v1, p1, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, v0, Lac1;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, [B

    .line 48
    .line 49
    invoke-virtual {p0, p1, v0}, Lvi3;->I(Ljava/lang/String;[B)Lcom/google/android/gms/internal/measurement/zzgl;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p0, p1, v0}, Lvi3;->H(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzgl;)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, Lvi3;->U:Lri3;

    .line 57
    .line 58
    invoke-virtual {p0}, Lua1;->snapshot()Ljava/util/Map;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, Lcom/google/android/gms/internal/measurement/zzc;

    .line 67
    .line 68
    return-object p0
.end method
