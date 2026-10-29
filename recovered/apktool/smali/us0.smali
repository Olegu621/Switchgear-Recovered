.class public final Lus0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lra2;


# direct methods
.method public synthetic constructor <init>(Lra2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lus0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lus0;->b:Lra2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lus0;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lus0;->b:Lra2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lra2;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lxs0;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lxs0;->c:Landroid/view/View;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lxs0;->b:Landroid/view/View;

    .line 27
    .line 28
    const/16 v0, 0x8

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void

    .line 34
    :pswitch_0
    iget-object p0, p0, Lra2;->a:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, Lxs0;

    .line 43
    .line 44
    if-eqz p0, :cond_1

    .line 45
    .line 46
    iget-object p0, p0, Lxs0;->e:Lcom/helpshift/activities/HSMainActivity;

    .line 47
    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    sget-object v0, Lrs0;->y:Lrs0;

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    iput-boolean v1, v0, Lrs0;->c:Z

    .line 54
    .line 55
    const-string v0, "helpcenter"

    .line 56
    .line 57
    invoke-virtual {p0, v0, v1}, Lcom/helpshift/activities/HSMainActivity;->i(Ljava/lang/String;Z)V

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void

    .line 61
    :pswitch_1
    iget-object p0, p0, Lra2;->a:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, Lxs0;

    .line 70
    .line 71
    if-eqz p0, :cond_2

    .line 72
    .line 73
    iget-object p0, p0, Lxs0;->e:Lcom/helpshift/activities/HSMainActivity;

    .line 74
    .line 75
    if-eqz p0, :cond_2

    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/helpshift/activities/HSMainActivity;->onBackPressed()V

    .line 78
    .line 79
    .line 80
    :cond_2
    return-void

    .line 81
    :pswitch_2
    iget-object p0, p0, Lra2;->a:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, Lxs0;

    .line 90
    .line 91
    if-eqz p0, :cond_4

    .line 92
    .line 93
    sget-object v0, Lrs0;->y:Lrs0;

    .line 94
    .line 95
    iget-object v0, v0, Lrs0;->e:Liy;

    .line 96
    .line 97
    iget-object v0, v0, Liy;->a:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Ler0;

    .line 100
    .line 101
    iget-object v0, v0, Ler0;->b:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Ler0;

    .line 104
    .line 105
    const-string v1, "local_storage_data"

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v0}, Lb40;->p(Ljava/lang/String;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_3

    .line 116
    .line 117
    const-string v0, "{}"

    .line 118
    .line 119
    :cond_3
    const-string v1, "Helpcenter( JSON.stringify({ \"eventType\": \"setWebchatData\", \"config\": %data }));"

    .line 120
    .line 121
    const-string v2, "%data"

    .line 122
    .line 123
    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {p0, v0}, Lxs0;->g(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :cond_4
    return-void

    .line 131
    :pswitch_3
    iget-object p0, p0, Lra2;->d:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p0, Lnm;

    .line 134
    .line 135
    invoke-virtual {p0}, Lnm;->h()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-static {v0}, Lyy1;->m(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    iget-object v0, p0, Lnm;->f:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v0, Ler0;

    .line 145
    .line 146
    iget-object v0, v0, Ler0;->b:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v0, Landroid/content/SharedPreferences;

    .line 149
    .line 150
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 159
    .line 160
    .line 161
    iget-object p0, p0, Lnm;->h:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast p0, Ljava/util/HashMap;

    .line 164
    .line 165
    invoke-virtual {p0}, Ljava/util/HashMap;->clear()V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
