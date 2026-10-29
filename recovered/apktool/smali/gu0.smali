.class public final Lgu0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/HashMap;

.field public final synthetic c:Lrs0;

.field public final synthetic d:Landroid/content/Context;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/util/HashMap;Lrs0;Lcom/supercell/titan/GameApp;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p5, p0, Lgu0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lgu0;->b:Ljava/util/HashMap;

    .line 4
    .line 5
    iput-object p2, p0, Lgu0;->c:Lrs0;

    .line 6
    .line 7
    iput-object p3, p0, Lgu0;->d:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p4, p0, Lgu0;->e:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lgu0;->a:I

    .line 2
    .line 3
    const-string v1, "api"

    .line 4
    .line 5
    const-string v2, "source"

    .line 6
    .line 7
    iget-object v3, p0, Lgu0;->e:Ljava/lang/String;

    .line 8
    .line 9
    const-string v4, "HELPCENTER_MODE"

    .line 10
    .line 11
    const-string v5, "HELP_CENTER_SERVICE_FLAG"

    .line 12
    .line 13
    const-string v6, "SERVICE_MODE"

    .line 14
    .line 15
    const-class v7, Lcom/helpshift/activities/HSMainActivity;

    .line 16
    .line 17
    iget-object v8, p0, Lgu0;->d:Landroid/content/Context;

    .line 18
    .line 19
    iget-object v9, p0, Lgu0;->c:Lrs0;

    .line 20
    .line 21
    const-string v10, "enableLogging"

    .line 22
    .line 23
    iget-object p0, p0, Lgu0;->b:Ljava/util/HashMap;

    .line 24
    .line 25
    packed-switch v0, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    iget-boolean v0, v9, Lrs0;->d:Z

    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0, v10, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    invoke-static {p0}, Lhu0;->G(Ljava/util/HashMap;)V

    .line 38
    .line 39
    .line 40
    new-instance p0, Landroid/content/Intent;

    .line 41
    .line 42
    invoke-direct {p0, v8, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v6, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 46
    .line 47
    .line 48
    const-string v0, "SINGLE_FAQ"

    .line 49
    .line 50
    invoke-virtual {p0, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 51
    .line 52
    .line 53
    const-string v0, "SINGLE_FAQ_PUBLISH_ID"

    .line 54
    .line 55
    invoke-virtual {p0, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v8, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_0
    iget-boolean v0, v9, Lrs0;->d:Z

    .line 66
    .line 67
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p0, v10, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    invoke-static {p0}, Lhu0;->G(Ljava/util/HashMap;)V

    .line 75
    .line 76
    .line 77
    new-instance p0, Landroid/content/Intent;

    .line 78
    .line 79
    invoke-direct {p0, v8, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v6, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 83
    .line 84
    .line 85
    const-string v0, "FAQ_SECTION"

    .line 86
    .line 87
    invoke-virtual {p0, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 88
    .line 89
    .line 90
    const-string v0, "FAQ_SECTION_ID"

    .line 91
    .line 92
    invoke-virtual {p0, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v8, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
