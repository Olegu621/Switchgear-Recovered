.class public final Lio1;
.super Lsq3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public b:Landroidx/core/graphics/drawable/IconCompat;

.field public c:Landroidx/core/graphics/drawable/IconCompat;

.field public d:Z


# virtual methods
.method public final g(Lra2;)V
    .locals 7

    .line 1
    iget-object v0, p1, Lra2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/app/Notification$Builder;

    .line 4
    .line 5
    iget-object p1, p1, Lra2;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Landroid/content/Context;

    .line 8
    .line 9
    new-instance v1, Landroid/app/Notification$BigPictureStyle;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Landroid/app/Notification$BigPictureStyle;-><init>(Landroid/app/Notification$Builder;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {v1, v0}, Landroid/app/Notification$BigPictureStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$BigPictureStyle;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p0, Lio1;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 20
    .line 21
    const/16 v3, 0x1f

    .line 22
    .line 23
    if-eqz v2, :cond_6

    .line 24
    .line 25
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 26
    .line 27
    if-lt v4, v3, :cond_0

    .line 28
    .line 29
    invoke-static {v2, p1}, Lgv0;->g(Landroidx/core/graphics/drawable/IconCompat;Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v1, v2}, Lho1;->a(Landroid/app/Notification$BigPictureStyle;Landroid/graphics/drawable/Icon;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    iget v4, v2, Landroidx/core/graphics/drawable/IconCompat;->a:I

    .line 38
    .line 39
    const/4 v5, -0x1

    .line 40
    if-ne v4, v5, :cond_1

    .line 41
    .line 42
    iget-object v2, v2, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-static {v2}, Lgv0;->d(Ljava/lang/Object;)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    :cond_1
    const/4 v2, 0x1

    .line 49
    if-ne v4, v2, :cond_6

    .line 50
    .line 51
    iget-object v4, p0, Lio1;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 52
    .line 53
    iget v6, v4, Landroidx/core/graphics/drawable/IconCompat;->a:I

    .line 54
    .line 55
    if-ne v6, v5, :cond_3

    .line 56
    .line 57
    iget-object v2, v4, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 58
    .line 59
    instance-of v4, v2, Landroid/graphics/Bitmap;

    .line 60
    .line 61
    if-eqz v4, :cond_2

    .line 62
    .line 63
    check-cast v2, Landroid/graphics/Bitmap;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    move-object v2, v0

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    if-ne v6, v2, :cond_4

    .line 69
    .line 70
    iget-object v2, v4, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Landroid/graphics/Bitmap;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    const/4 v5, 0x5

    .line 76
    if-ne v6, v5, :cond_5

    .line 77
    .line 78
    iget-object v4, v4, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v4, Landroid/graphics/Bitmap;

    .line 81
    .line 82
    invoke-static {v4, v2}, Landroidx/core/graphics/drawable/IconCompat;->a(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    :goto_0
    invoke-virtual {v1, v2}, Landroid/app/Notification$BigPictureStyle;->bigPicture(Landroid/graphics/Bitmap;)Landroid/app/Notification$BigPictureStyle;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    goto :goto_1

    .line 91
    :cond_5
    const-string p0, "called getBitmap() on "

    .line 92
    .line 93
    invoke-static {v4, p0}, Lds0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_6
    :goto_1
    iget-boolean v2, p0, Lio1;->d:Z

    .line 98
    .line 99
    if-eqz v2, :cond_8

    .line 100
    .line 101
    iget-object p0, p0, Lio1;->c:Landroidx/core/graphics/drawable/IconCompat;

    .line 102
    .line 103
    if-nez p0, :cond_7

    .line 104
    .line 105
    invoke-virtual {v1, v0}, Landroid/app/Notification$BigPictureStyle;->bigLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$BigPictureStyle;

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_7
    invoke-static {p0, p1}, Lgv0;->g(Landroidx/core/graphics/drawable/IconCompat;Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-static {v1, p0}, Lgo1;->a(Landroid/app/Notification$BigPictureStyle;Landroid/graphics/drawable/Icon;)V

    .line 114
    .line 115
    .line 116
    :cond_8
    :goto_2
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 117
    .line 118
    if-lt p0, v3, :cond_9

    .line 119
    .line 120
    const/4 p0, 0x0

    .line 121
    invoke-static {v1, p0}, Lho1;->c(Landroid/app/Notification$BigPictureStyle;Z)V

    .line 122
    .line 123
    .line 124
    invoke-static {v1, v0}, Lho1;->b(Landroid/app/Notification$BigPictureStyle;Ljava/lang/CharSequence;)V

    .line 125
    .line 126
    .line 127
    :cond_9
    return-void
.end method

.method public final i()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "androidx.core.app.NotificationCompat$BigPictureStyle"

    .line 2
    .line 3
    return-object p0
.end method
