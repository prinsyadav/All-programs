import React, { useState } from 'react'
import { Button } from "@/components/ui/button"
import { Input } from "@/components/ui/input"
import { ScrollArea } from "@/components/ui/scroll-area"
import { Avatar, AvatarFallback, AvatarImage } from "@/components/ui/avatar"
import { PaperclipIcon, SendIcon, MenuIcon } from 'lucide-react'

export default function Component() {
  const [isSidebarOpen, setIsSidebarOpen] = useState(true)

  const searchHistory = [
    "How to use React hooks",
    "Best practices for API design",
    "JavaScript array methods",
    "CSS Grid vs Flexbox",
    "TypeScript basics",
    "Node.js event loop",
    "GraphQL advantages",
    "Redux state management",
    "React performance optimization",
    "Async/await in JavaScript",
  ]

  return (
    <div className="flex h-screen bg-gray-100">
      {/* Left sidebar */}
      {isSidebarOpen && (
        <div className="w-64 bg-white border-r border-gray-200 flex flex-col">
          <ScrollArea className="flex-grow">
            <div className="p-4">
              <h2 className="text-lg font-semibold mb-2">Search History</h2>
              <ul className="space-y-2">
                {searchHistory.map((item, index) => (
                  <li key={index} className="text-sm hover:bg-gray-100 p-2 rounded cursor-pointer">
                    {item}
                  </li>
                ))}
              </ul>
            </div>
          </ScrollArea>
          <div className="p-4 border-t border-gray-200">
            <div className="flex items-center space-x-3">
              <Avatar>
                <AvatarImage src="/placeholder-avatar.jpg" alt="User" />
                <AvatarFallback>U</AvatarFallback>
              </Avatar>
              <div>
                <p className="text-sm font-medium">John Doe</p>
                <p className="text-xs text-gray-500">john@example.com</p>
              </div>
            </div>
          </div>
        </div>
      )}

      {/* Main content */}
      <div className="flex-1 flex flex-col">
        <header className="p-4 border-b border-gray-200 flex justify-between items-center">
          <Button
            variant="ghost"
            size="icon"
            onClick={() => setIsSidebarOpen(!isSidebarOpen)}
            className="md:hidden"
          >
            <MenuIcon className="h-6 w-6" />
            <span className="sr-only">Toggle sidebar</span>
          </Button>
          <h1 className="text-xl font-semibold">Chat Interface</h1>
        </header>
        <main className="flex-1 p-6">
          {/* Chat messages would go here */}
        </main>
        <div className="p-4 border-t border-gray-200">
          <div className="flex space-x-2">
            <Button variant="outline" size="icon" className="shrink-0">
              <PaperclipIcon className="h-4 w-4" />
              <span className="sr-only">Attach document</span>
            </Button>
            <Input placeholder="Type your message here..." className="flex-grow" />
            <Button size="icon" className="shrink-0">
              <SendIcon className="h-4 w-4" />
              <span className="sr-only">Send message</span>
            </Button>
          </div>
        </div>
      </div>
    </div>
  )
}