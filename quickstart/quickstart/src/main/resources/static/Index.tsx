'use client'

import { useState } from 'react'
import { Button } from "@/components/ui/button"
import { Card, CardContent, CardDescription, CardFooter, CardHeader, CardTitle } from "@/components/ui/card"
import { Input } from "@/components/ui/input"
import { Label } from "@/components/ui/label"
import { Tabs, TabsContent, TabsList, TabsTrigger } from "@/components/ui/tabs"

export default function AuthPage() {
    const [activeTab, setActiveTab] = useState('signin')

    const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
        event.preventDefault()
        // Here you would typically handle the form submission
        console.log('Form submitted')
    }

    return (
        <div className="flex items-center justify-center min-h-screen bg-gray-100">
            <Card className="w-[350px]">
                <CardHeader>
                    <CardTitle>Welcome</CardTitle>
                    <CardDescription>Sign in to your account or create a new one.</CardDescription>
                </CardHeader>
                <CardContent>
                    <Tabs value={activeTab} onValueChange={setActiveTab}>
                        <TabsList className="grid w-full grid-cols-2">
                            <TabsTrigger value="signin">Sign In</TabsTrigger>
                            <TabsTrigger value="signup">Sign Up</TabsTrigger>
                        </TabsList>
                        <TabsContent value="signin">
                            <form onSubmit={handleSubmit}>
                                <div className="grid w-full items-center gap-4">
                                    <div className="flex flex-col space-y-1.5">
                                        <Label htmlFor="signin-email">Email</Label>
                                        <Input id="signin-email" type="email" placeholder="Enter your email" required />
                                    </div>
                                    <div className="flex flex-col space-y-1.5">
                                        <Label htmlFor="signin-password">Password</Label>
                                        <Input id="signin-password" type="password" placeholder="Enter your password" required />
                                    </div>
                                </div>
                                <Button className="w-full mt-4" type="submit">Sign In</Button>
                            </form>
                        </TabsContent>
                        <TabsContent value="signup">
                            <form onSubmit={handleSubmit}>
                                <div className="grid w-full items-center gap-4">
                                    <div className="flex flex-col space-y-1.5">
                                        <Label htmlFor="signup-name">Name</Label>
                                        <Input id="signup-name" placeholder="Enter your name" required />
                                    </div>
                                    <div className="flex flex-col space-y-1.5">
                                        <Label htmlFor="signup-email">Email</Label>
                                        <Input id="signup-email" type="email" placeholder="Enter your email" required />
                                    </div>
                                    <div className="flex flex-col space-y-1.5">
                                        <Label htmlFor="signup-password">Password</Label>
                                        <Input id="signup-password" type="password" placeholder="Create a password" required />
                                    </div>
                                </div>
                                <Button className="w-full mt-4" type="submit">Sign Up</Button>
                            </form>
                        </TabsContent>
                    </Tabs>
                </CardContent>
                <CardFooter className="flex justify-center">
                    <p className="text-sm text-gray-500">
                        By signing in or signing up, you agree to our Terms of Service and Privacy Policy.
                    </p>
                </CardFooter>
            </Card>
        </div>
    )
}