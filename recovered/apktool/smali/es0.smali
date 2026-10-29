.class public final Les0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Llm3;Lbm3;J)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Les0;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Les0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-wide p3, p0, Les0;->b:J

    .line 10
    .line 11
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Les0;->d:Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Lxy1;Lorg/json/JSONArray;J)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Les0;->a:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les0;->d:Ljava/lang/Object;

    iput-object p2, p0, Les0;->c:Ljava/lang/Object;

    iput-wide p3, p0, Les0;->b:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Les0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-wide v2, p0, Les0;->b:J

    .line 5
    .line 6
    iget-object v4, p0, Les0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p0, p0, Les0;->d:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Llm3;

    .line 14
    .line 15
    check-cast v4, Lbm3;

    .line 16
    .line 17
    invoke-virtual {p0, v4, v1, v2, v3}, Llm3;->D(Lbm3;ZJ)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Llm3;->e:Lbm3;

    .line 22
    .line 23
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lij3;

    .line 26
    .line 27
    invoke-virtual {p0}, Lij3;->o()Lpn3;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Leg3;->y()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lwg3;->A()V

    .line 35
    .line 36
    .line 37
    new-instance v1, Lol3;

    .line 38
    .line 39
    invoke-direct {v1, p0, v0}, Lol3;-><init>(Lpn3;Lbm3;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v1}, Lpn3;->N(Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_0
    check-cast p0, Lxy1;

    .line 47
    .line 48
    :try_start_0
    check-cast v4, Lorg/json/JSONArray;

    .line 49
    .line 50
    invoke-static {p0, v4, v1}, Lxy1;->a(Lxy1;Lorg/json/JSONArray;Z)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/16 v1, 0xc8

    .line 55
    .line 56
    if-lt v0, v1, :cond_0

    .line 57
    .line 58
    const/16 v1, 0x12c

    .line 59
    .line 60
    if-ge v0, v1, :cond_0

    .line 61
    .line 62
    iget-object p0, p0, Lxy1;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, Ler0;

    .line 65
    .line 66
    const-string v0, "app_launch_last_sync_timestamp"

    .line 67
    .line 68
    iget-object p0, p0, Ler0;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p0, Ler0;

    .line 71
    .line 72
    iget-object p0, p0, Ler0;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, Landroid/content/SharedPreferences;

    .line 75
    .line 76
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-interface {p0, v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 81
    .line 82
    .line 83
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_0

    .line 88
    .line 89
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catch Lgt0; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :catch_0
    move-exception p0

    .line 94
    const-string v0, "analyticsMngr"

    .line 95
    .line 96
    const-string v1, "Failed to send the app launch events"

    .line 97
    .line 98
    invoke-static {v0, v1, p0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    :cond_0
    :goto_0
    return-void

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
