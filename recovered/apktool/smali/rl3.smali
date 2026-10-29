.class public final synthetic Lrl3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# instance fields
.field public final synthetic a:Lsl3;


# direct methods
.method public synthetic constructor <init>(Lsl3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrl3;->a:Lsl3;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object p0, p0, Lrl3;->a:Lsl3;

    .line 2
    .line 3
    iget-object p1, p0, Lsq3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Lij3;

    .line 6
    .line 7
    iget-object v0, p1, Lij3;->d:Lpd3;

    .line 8
    .line 9
    iget-object p1, p1, Lij3;->f:Luh3;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    sget-object v2, Lvg3;->Z0:Lug3;

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const-wide/16 v1, 0x1f4

    .line 19
    .line 20
    const-string v3, "IABTCF_TCString change picked up in listener."

    .line 21
    .line 22
    const-string v4, "IABTCF_TCString"

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    invoke-static {p2, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    invoke-static {p1}, Lij3;->l(Lhk3;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p1, Luh3;->Y:Lsh3;

    .line 36
    .line 37
    invoke-virtual {p1, v3}, Lsh3;->a(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lsl3;->g0:Lwk3;

    .line 41
    .line 42
    invoke-static {p0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v1, v2}, Lbe3;->b(J)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    invoke-static {p2, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    const-string v0, "IABTCF_gdprApplies"

    .line 56
    .line 57
    invoke-static {p2, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_2

    .line 62
    .line 63
    const-string v0, "IABTCF_EnableAdvertiserConsentMode"

    .line 64
    .line 65
    invoke-static {p2, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    if-eqz p2, :cond_1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    return-void

    .line 73
    :cond_2
    :goto_0
    invoke-static {p1}, Lij3;->l(Lhk3;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p1, Luh3;->Y:Lsh3;

    .line 77
    .line 78
    invoke-virtual {p1, v3}, Lsh3;->a(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object p0, p0, Lsl3;->g0:Lwk3;

    .line 82
    .line 83
    invoke-static {p0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v1, v2}, Lbe3;->b(J)V

    .line 87
    .line 88
    .line 89
    return-void
.end method
