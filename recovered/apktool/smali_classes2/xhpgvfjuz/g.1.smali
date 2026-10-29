.class public Lxhpgvfjuz/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lxhpgvfjuz/g;

    const v1, 0x6310

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private native a(Lxhpgvfjuz/al;)V
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    invoke-static {p2}, Lxhpgvfjuz/as;->a(Landroid/os/IBinder;)Lxhpgvfjuz/al;

    move-result-object p1

    invoke-direct {p0, p1}, Lxhpgvfjuz/g;->a(Lxhpgvfjuz/al;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    return-void
.end method
