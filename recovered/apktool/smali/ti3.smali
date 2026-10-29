.class public final Lti3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final d:Lqi3;

.field public static final e:Lsi3;


# instance fields
.field public final a:Ljava/util/HashMap;

.field public final b:Ljava/util/HashMap;

.field public c:Lsi3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lqi3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lqi3;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lti3;->d:Lqi3;

    .line 8
    .line 9
    new-instance v0, Lsi3;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lsi3;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lti3;->e:Lsi3;

    .line 15
    .line 16
    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lti3;->a:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    .line 34
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lti3;->b:Ljava/util/HashMap;

    const/4 v0, 0x0

    iput-object v0, p0, Lti3;->c:Lsi3;

    return-void
.end method

.method public constructor <init>(Lti3;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lti3;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v1, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lti3;->b:Ljava/util/HashMap;

    .line 17
    .line 18
    iget-object v2, p1, Lti3;->a:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p1, Lti3;->b:Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p1, Lti3;->c:Lsi3;

    .line 29
    .line 30
    iput-object p1, p0, Lti3;->c:Lsi3;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public a(Lph3;Ljava/lang/Object;Lii3;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lti3;->a:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lqi3;

    .line 8
    .line 9
    const/16 v0, 0x14

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    iget p0, p0, Lqi3;->a:I

    .line 14
    .line 15
    packed-switch p0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-boolean p0, p1, Lph3;->d:Z

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    sget-object p0, Lxk3;->b:Lg5;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lxk3;

    .line 29
    .line 30
    iget p0, p0, Lxk3;->a:I

    .line 31
    .line 32
    if-le p0, v0, :cond_0

    .line 33
    .line 34
    iget-object p0, p1, Lph3;->a:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p3, p0, p2}, Lii3;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p1, p2, p3}, Lph3;->b(Ljava/lang/Object;Lii3;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    :pswitch_0
    return-void

    .line 44
    :cond_1
    iget-boolean p0, p1, Lph3;->d:Z

    .line 45
    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    sget-object p0, Lxk3;->b:Lg5;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Lxk3;

    .line 55
    .line 56
    iget p0, p0, Lxk3;->a:I

    .line 57
    .line 58
    if-le p0, v0, :cond_2

    .line 59
    .line 60
    iget-object p0, p1, Lph3;->a:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {p3, p0, p2}, Lii3;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    invoke-virtual {p1, p2, p3}, Lph3;->b(Ljava/lang/Object;Lii3;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lph3;Ljava/util/Iterator;Lii3;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lti3;->b:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lsi3;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget p0, v0, Lsi3;->a:I

    .line 12
    .line 13
    packed-switch p0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2, p3}, Lph3;->c(Ljava/util/Iterator;Lii3;)V

    .line 17
    .line 18
    .line 19
    :pswitch_0
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Lti3;->c:Lsi3;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Lti3;->a:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {p1, p2, p3}, Lph3;->c(Ljava/util/Iterator;Lii3;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p0, p1, v0, p3}, Lti3;->a(Lph3;Ljava/lang/Object;Lii3;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
