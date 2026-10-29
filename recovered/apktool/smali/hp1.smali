.class public final Lhp1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Landroid/content/Context;

.field public c:I

.field public d:Ljava/util/EnumSet;

.field public e:I

.field public f:Lokhttp3/OkHttpClient;

.field public g:Lokhttp3/CookieJar;

.field public h:Ljava/lang/String;

.field public i:Z

.field public j:Ljava/util/Map;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lhp1;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p1, p0, Lhp1;->b:Landroid/content/Context;

    .line 13
    .line 14
    sget-object p1, Lmc0;->a:Ljava/util/EnumSet;

    .line 15
    .line 16
    const/4 p1, 0x2

    .line 17
    iput p1, p0, Lhp1;->c:I

    .line 18
    .line 19
    sget-object p1, Lmc0;->a:Ljava/util/EnumSet;

    .line 20
    .line 21
    iput-object p1, p0, Lhp1;->d:Ljava/util/EnumSet;

    .line 22
    .line 23
    sget p1, Lmc0;->g:I

    .line 24
    .line 25
    iput p1, p0, Lhp1;->e:I

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    iput-boolean p1, p0, Lhp1;->i:Z

    .line 29
    .line 30
    return-void
.end method
